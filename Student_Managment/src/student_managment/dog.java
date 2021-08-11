package student_managment;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASIA COMPUTER
 */
public class dog {

    /**
     * @return the speak
     */
    public int getSpeak() {
        return speak;
    }

    /**
     * @param speak the speak to set
     */
    public void setSpeak(int speak) {
        this.speak = speak;
    }

    /**
     * @return the run
     */
    public String getRun() {
        return run;
    }

    /**
     * @param run the run to set
     */
    public void setRun(String run) {
        this.run = run;
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

    /**
     * @return the Sleep
     */
    public String getSleep() {
        return Sleep;
    }

    /**
     * @param Sleep the Sleep to set
     */
    public void setSleep(String Sleep) {
        this.Sleep = Sleep;
    }
    private int speak;
    private String run;
    private int Age;
    private String Sleep;

    public dog() {
    }

    public dog(int speak, String run, int Age, String Sleep) {
        this.speak = speak;
        this.run = run;
        this.Age = Age;
        this.Sleep = Sleep;
    }
    
}
