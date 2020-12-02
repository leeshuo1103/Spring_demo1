package org.best.test;

import org.best.service.StudentService;
import org.best.service.StudentServiceImpl;
import org.best.service.UserService;
import org.best.service.UserServiceImp;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {
    @org.junit.Test
    public void test(){
        //加载Src类路径下的Spring配置文件
        new ClassPathXmlApplicationContext("配置文件路径");
        //加载本地磁盘下的Spring配置文件
        new FileSystemXmlApplicationContext("配置文件路径");
        //读取配置类
        new AnnotationConfigApplicationContext("配置类");
    }
    @org.junit.Test
    public void test2(){
       /* ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserServiceImp serviceImp = context.getBean("serviceImp", UserServiceImp.class);
        serviceImp.sayHello();*/
    }
    @org.junit.Test
    public void Test3(){
        /*ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserServiceImp studentsay = context.getBean("studentsay", UserServiceImp.class);
        studentsay.say();*/
    }

    @org.junit.Test
    public void Test4(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentServiceImpl service = context.getBean("service", StudentServiceImpl.class);
        StudentService student = UserServiceImp.getStudent();
        System.out.println(student);
    }

    @org.junit.Test
    public void Test5(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentServiceImpl studentService = context.getBean("studentService", StudentServiceImpl.class);
        String name = studentService.getName();
        System.out.println(name);
    }
      @org.junit.Test
    public void Test6(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserServiceImp serviceImp = context.getBean("serviceImp", UserServiceImp.class);
        System.out.println(serviceImp);
    }
    @org.junit.Test
    public void Test7(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserServiceImp serviceImp = context.getBean("serviceImp", UserServiceImp.class);
        serviceImp.Test();
    }

    @org.junit.Test
    public void Test8(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("配置文件1","配置文件2" );

    }
}

