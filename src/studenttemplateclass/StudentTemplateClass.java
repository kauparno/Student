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
    //constructor
    public StudentTemplateClass()
    {
        
        
    }
    public StudentTemplateClass(String n)
    {
      this.name= n;  
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

    
   
    
}
