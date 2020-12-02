package org.best.service;

import org.best.dao.UserDaoImpl;

public class UserServiceImp implements UserService {
/* private String name;
    private int age;
    private double height;
    public UserServiceImp(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }*/

private UserDaoImpl userDao;

    public void setUserDao(UserDaoImpl userDao) {
        this.userDao = userDao;
    }

    public static StudentService getStudent(){
     return new StudentServiceImpl();
 }

 public void Test(){
        userDao.init();
 }

 /*   @Override
    public String toString() {
        return "UserServiceImp{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }*/
}
