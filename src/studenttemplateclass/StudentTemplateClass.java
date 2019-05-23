/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studenttemplateclass;

/**
 *
 * @author User
 */
public class StudentTemplateClass {
    
    //data/fields
    private String name;
    private int sid;
    private int Maxcourse;
    //constructor
    public StudentTemplateClass()
    {
        
        
    }
    public StudentTemplateClass(String n,int s)
    {
      this.name= n;  
      this.sid= s;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the sid
     */
    public int getSid() {
        return sid;
    }

    /**
     * @param sid the sid to set
     */
    public void setSid(int sid) {
        this.sid = sid;
    }

    /**
     * @return the Maxcourse
     */
    public int getMaxcourse() {
        return Maxcourse;
    }

    /**
     * @param Maxcourse the Maxcourse to set
     */
    public void setMaxcourse(int Maxcourse) {
        this.Maxcourse = Maxcourse;
    }

    
   
    
}
