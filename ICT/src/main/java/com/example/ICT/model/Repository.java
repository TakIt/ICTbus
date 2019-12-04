package com.example.ICT.model;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

import static org.springframework.jdbc.core.BeanPropertyRowMapper.newInstance;

@org.springframework.stereotype.Repository
public class Repository {
    //    @Autowired
    private JdbcTemplate jdbc;


    @Autowired
    public Repository(JdbcTemplate jdbc){
        this.jdbc=jdbc;
    }

    List<LTimeTable> leave_select(String sta,String time){
        var sql="SELECT * FROM LTIMETABLE where LTIMETABLE."+sta+">'"+time+"'";
        return  jdbc.query(sql,newInstance(LTimeTable.class));
    }

    List<ATimeTable> arrive_select(String sta,String time){
        var sql="SELECT * FROM ATIMETABLE LEFT join ASTAND on ASTAND.ID = ATIMETABLE.ID where ATIMETABLE."+sta+">'"+time+"'";
        return  jdbc.query(sql,newInstance(ATimeTable.class));
    }

}