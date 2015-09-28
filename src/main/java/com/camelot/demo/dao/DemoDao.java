package com.camelot.demo.dao;

import com.camelot.demo.domain.Demo;

import java.util.List;

/**
 * Created by chend on 2015/9/22.
 */
public interface DemoDao {
    public void addHiTb(Demo demo);
    public List<Demo> list();
}
