package com.zhou.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhou.mapper.TeamMapper;
import com.zhou.pojo.Team;
import com.zhou.pojo.TeamExample;
import com.zhou.vo.QueryVO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TeamService {
    @Resource
    private TeamMapper teamMapper;

    //多条件分页查询
    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    public PageInfo<Team> queryByPage(Integer pageNum, Integer pageSize, QueryVO vo) {
        //多条件
        TeamExample example = new TeamExample();
        //创建盛放条件的容器
        TeamExample.Criteria criteria = example.createCriteria();
        if (vo != null) {
            //.trim()方法去掉前后空格
            if (vo.getTeamName() != null && !"".equals(vo.getTeamName().trim())) {
                criteria.andTeamNameLike("%" + vo.getTeamName().trim() + "%");
            }
            if (vo.getChineseName() != null && !"".equals(vo.getChineseName().trim())) {
                criteria.andChineseNameLike("%" + vo.getChineseName().trim() + "%");
            }
            if (vo.getCoach() != null && !"".equals(vo.getCoach().trim())) {
                criteria.andCoachLike("%" + vo.getCoach().trim() + "%");
            }
            if (vo.getBeginDate() != null) {
                criteria.andCreateTimeGreaterThanOrEqualTo(vo.getBeginDate());
            }
            if (vo.getEndDate() != null) {
                criteria.andCreateTimeLessThanOrEqualTo(vo.getEndDate());
            }
            if (vo.getArea() != null && vo.getArea() != -1) {
                criteria.andAreaEqualTo(vo.getArea());
            }
        }
        //分页
        PageHelper.startPage(pageNum, pageSize);
        List<Team> teamList = teamMapper.selectByExample(example);
        return new PageInfo<>(teamList);
    }

    //添加一个球队
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    public int addTeam(Team team) {
        return teamMapper.insertSelective(team);
    }
    //根据ID查询队伍
    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    public Team selectById(Integer teamId){
        return teamMapper.selectByPrimaryKey(teamId);
    }
    //根据Id更新队伍信息
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    public int updateTeam(Team team){
        return teamMapper.updateByPrimaryKeySelective(team);
    }
    //逻辑删除队伍
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    public int deleteTeam(Integer teamId){
        Team team = teamMapper.selectByPrimaryKey(teamId);
        team.setIsDel(1);//逻辑删除
        return teamMapper.updateByPrimaryKeySelective(team);
    }
}
