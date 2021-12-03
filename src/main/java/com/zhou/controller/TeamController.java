package com.zhou.controller;

import com.github.pagehelper.PageInfo;
import com.zhou.pojo.Team;
import com.zhou.service.TeamService;
import com.zhou.vo.QueryVO;
import com.zhou.vo.ResultVO;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * 球队控制器层
 */
@Controller
@RequestMapping("team")
@ResponseBody
public class TeamController {

    @Resource
    private TeamService teamService;

    //如果没加日期格式化注解，就把此代码解开，日期格式化。
/*    @InitBinder
    protected void initDateFormatBinder(WebDataBinder binder){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        binder.registerCustomEditor(Date.class,new CustomDateEditor(dateFormat,true));
    }*/
    //多条件分页查询
    @RequestMapping(value = "list", method = RequestMethod.GET)
    public ResultVO<Team> queryByPage(Integer pageNum, Integer pageSize, QueryVO vo) {
        if (pageNum == null || pageNum <= 0) {
            pageNum = 1;
        }
        if (pageSize == null || pageSize <= 0) {
            pageSize = 5;
        }
        PageInfo<Team> info = teamService.queryByPage(pageNum, pageSize, vo);
        //System.out.println(vo);
        return new ResultVO<>(info);
    }

    //增加球队
    @RequestMapping(value = "", method = RequestMethod.POST)
    public ResultVO<Team> addTeam(Team team) {
        //System.out.println(team);
        int i = teamService.addTeam(team);
        if (i == 1) {
            return new ResultVO<>();
        }
        return new ResultVO<>(500, "服务器内部异常，稍后再试！");
    }

    //根据Id查询队伍
    @RequestMapping(value = "{teamId}", method = RequestMethod.GET)
    public ResultVO<Team> selectById(@PathVariable("teamId") Integer teamId) {
        Team team = teamService.selectById(teamId);
        return new ResultVO<>(team);
    }

    //根据Id更新队伍
    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    public ResultVO<Team> updateTeam(@PathVariable("id") Integer teamId, Team team) {
        team.setTeamId(teamId);
        int i = teamService.updateTeam(team);
        if (i == 1) {
            return new ResultVO<>();
        }
        return new ResultVO<>(500, "服务器内部异常，稍后再试！");
    }

    //逻辑删除队伍
    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public ResultVO<Team> deleteTeam(@PathVariable("id") Integer teamId) {
        int i = teamService.deleteTeam(teamId);
        if (i == 1) {
            return new ResultVO<>();
        }
        return new ResultVO<>(500, "服务器内部异常，稍后再试！");
    }

    //文件上传
    @RequestMapping(value = "{id}",method = RequestMethod.POST)
    public ResultVO<Team> uploadLogo(@RequestParam("logo") MultipartFile myFile, HttpServletRequest request,
                                     @PathVariable("id") Integer teamId) {
        String path = request.getServletContext().getRealPath("/img/uploadFile/");
        //获取原始文件的名称
        String originalFilename = myFile.getOriginalFilename();
        //定义文件的新名称，随机生成的名称加原有文件名
        String randomName = UUID.randomUUID().toString().replace("-", "");
        int index = originalFilename.lastIndexOf(".");
        String hz = originalFilename.substring(index);
        String logoName = randomName + hz;
        int i = 0;
        try {
            myFile.transferTo(new File(path + "/" + logoName));
            System.out.println("上传成功！" + path + "/" + logoName);
            Team team = new Team();
            team.setTeamId(teamId);
            team.setTeamLogo(logoName);
            i = teamService.updateTeam(team);
            if (i == 1) {
                return new ResultVO<>();
            }
            return new ResultVO<>(500, "服务器内部异常，稍后再试！");
        } catch (IOException e) {
            e.printStackTrace();
            return new ResultVO<>(500, "图片上传出现问题！"+e.getMessage());
        }
    }

}
