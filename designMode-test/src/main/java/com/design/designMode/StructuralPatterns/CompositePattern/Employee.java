package com.design.designMode.StructuralPatterns.CompositePattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建 Employee 类，该类带有 Employee 对象的列表。
 * @Author 211145187
 * @Date 2022/7/4 14:38
 **/
public class Employee {
    private String name;
    private String dept;
    private int salary;
    //下属
    private List<Employee> subordinates;

    //构造函数
    public Employee(String name,String dept, int sal) {
        this.name = name;
        this.dept = dept;
        this.salary = sal;
        subordinates = new ArrayList<Employee>();
    }

    public void add(Employee e) {
        subordinates.add(e);
    }

    public void remove(Employee e) {
        subordinates.remove(e);
    }

    public List<Employee> getSubordinates(){
        return subordinates;
    }

    public String toString(){
        return ("Employee :[ Name : "+ name
                +", dept : "+ dept + ", salary :"
                + salary+" ]");
    }
}
