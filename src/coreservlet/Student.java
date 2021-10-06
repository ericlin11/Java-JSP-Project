package coreservlet;

public class Student {
    private String  name;
    private String ssn;
    
    public Student(){
        this.name = "";
        this.ssn = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getSsn() {
    	return ssn;
    }
    
    public void setSsn(String ssn) {
    	this.ssn = ssn;
    }

}