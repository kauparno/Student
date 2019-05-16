/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studenttemplateclass;


public class StudentTester {
    
    public static void main(String args[])
    {
        StudentTemplateClass s1 = new StudentTemplateClass("noor");
        //s1.setName("noor");
        //System.out.print(s1.getName());
         StudentTemplateClass s2 = new StudentTemplateClass("Nabeel");
        //s2.setName("Nabeel");
          StudentTemplateClass s3 = new StudentTemplateClass();
          s3.setName("saima");
          StudentTemplateClass[] list = new StudentTemplateClass[3];//array of objects
          list[0]= s1;
          list[1]=s2;
          list[2]=s3;
          for(int i=0;i<list.length;i++)
          {
          System.out.println(list[i].getName());
          }
          }
          
          
          
    }
    
    

