package com.example.ICT.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class DepartureDAO{
    @Autowired
    private JdbcTemplate jdbc;
}