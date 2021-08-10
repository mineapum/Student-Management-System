/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student_managment;

/**
 *
 * @author ASIA COMPUTER
 */
public class dog {

    /**
     * @return the speak
     */
    public String getSpeak() {
        return speak;
    }

    /**
     * @param speak the speak to set
     */
    public void setSpeak(String speak) {
        this.speak = speak;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the high
     */
    public int getHigh() {
        return high;
    }

    /**
     * @param high the high to set
     */
    public void setHigh(int high) {
        this.high = high;
    }

    /**
     * @return the Age
     */
    public int getAge() {
        return Age;
    }

    /**
     * @param Age the Age to set
     */
    public void setAge(int Age) {
        this.Age = Age;
    }
    private String speak;
    private String color;
    private int high;
    private int Age;

    public dog() {
    }

    public dog(String speak, String color, int high, int Age) {
        this.speak = speak;
        this.color = color;
        this.high = high;
        this.Age = Age;
    }
    
}
