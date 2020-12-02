package org.best.service;

public class StudentServiceImpl implements StudentService {
    private String name;
    private int age;
    private double height;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

  /*  public UserService say(){
        System.out.println("执行了");
        UserServiceImp userServiceImp = new UserServiceImp();
        System.out.println(userServiceImp);
        return userServiceImp;
    }*/
}
