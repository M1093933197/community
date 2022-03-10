package com.java.community.service;

import com.java.community.dao.AlphaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
//@Scope("prototype") //singleton：单例的，默认参数不写。prototype：每次访问都多一个实例
public class AlphaService {

    @Autowired//在service层调用dao层。
    private AlphaDao alphaDao;
    public String find(){
        return alphaDao.select();
    }


    public AlphaService(){
        System.out.println("实例化AlphaService");
    }

    @PostConstruct//注解会将该方法在构造器之后调用
    public void init(){
        System.out.println("初始化AlphaService");
    }

    @PreDestroy//在销毁之前调用他
    public void destory(){
        System.out.println("销毁AlphaService");
    }

}
