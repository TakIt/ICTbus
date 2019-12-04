package com.example.ICT.model;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;

import java.util.Collections;
import java.util.List;

@org.springframework.stereotype.Service
public class Service {

    private List<ATimeTable>aTimeTable;
    private List<LTimeTable>lTimeTables;

    private String state;

    @Autowired
    Repository repository;

    public void leave_findAll(String sta,String time){
        try{
            lTimeTables = repository.leave_select(sta,time);
        }
        catch (DataAccessException e) {
            e.printStackTrace();
        }
    }

    public void arrive_findAll(String sta,String time){
        try{
            aTimeTable=repository.arrive_select(sta,time);
        }
        catch (DataAccessException e) {
            e.printStackTrace();
        }
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public List<ATimeTable> getaTimeTable() {
        return aTimeTable;
    }

    public List<LTimeTable> getlTimeTables() {
        return lTimeTables;
    }
}
