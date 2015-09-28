package com.camelot.demo.service.impl;

import com.camelot.demo.dao.DemoDao;
import com.camelot.demo.domain.Demo;
import com.camelot.demo.service.DemoService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by chend on 2015/9/22.
 */
@Service("demoService")

public class DemoServiceImpl implements DemoService {

    @Resource
    private DemoDao demoDao;

    public void create(Demo demo) {
        demoDao.addHiTb(demo);

    }
    @Transactional(readOnly = true)
    public List<Demo> list() {
        return demoDao.list();
    }
}
