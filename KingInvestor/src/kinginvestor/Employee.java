/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kinginvestor;

/**
 *
 * @author srodgro
 */
public class Employee {

    private String name;
    private int skill;
    private int salary;

    public Employee(String name, int skill, int salary) {
        this.name = name;
        this.skill = skill;
        this.salary = salary;
    }

    public void setSkill(int skillLevel) {
        this.skill = skillLevel;
    }

    public int getSkill() {
        return skill;
    }

    public int getSalary() {
        return salary;
    }
}
