package com.camelot.demo.service;

import com.camelot.demo.domain.Demo;

import java.util.List;

/**
 * Created by chend on 2015/9/22.
 */
public interface DemoService {

    public void create(Demo demo);
    public List<Demo> list();
}
