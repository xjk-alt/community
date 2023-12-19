package com.nowcoder.community.service;


import com.nowcoder.community.dao.AlphaDao;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;


@Service //业务组件，使用service注解
//bean是单例模式，实例化一次，销毁一次，bean运行周期在对象创建和销毁之间，如果不想单例，就加scope,几乎都用单例
//@Scope("prototype")
public class AlphaService {

    @Autowired
    private AlphaDao alphaDao;

    //构造器
    public AlphaService() {
        System.out.println("实例化AlphaService");
    }

    @PostConstruct //表示这个方法会在构造器之后调用
    public void init() {
        System.out.println("初始化AlphaService");
    }

    @PreDestroy //对象销毁之前调用
    public void destroy() {
        System.out.println("销毁AlphaService");
    }

    public String find() {
        return alphaDao.select();
    }
}
