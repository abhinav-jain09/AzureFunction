package com.ns.rivier.tokenvault;

import java.util.ArrayList;

/**
 * outerclass
 * <br>
 * <code>com.ns.rivier.tokenvault.outerclass</code>
 * <br>
 *
 * @author Abhinav Jain
 * @since 22 March 2022
 */
public class outerclass {
    public ArrayList<innerclass> getListOfInnerClass() {
        return listOfInnerClass;
    }

    public void setListOfInnerClass(ArrayList<innerclass> listOfInnerClass) {
        this.listOfInnerClass = listOfInnerClass;
    }

    String user ;
    ArrayList<innerclass> listOfInnerClass = new ArrayList<innerclass>();
    class innerclass {
        int a;
        String b;
        innerclass(int a , String b){
            this.a = a;
            this.b = b;
        }


    }

  public  void  setInnerClass(int a , String b){
        innerclass myinnerclass = new innerclass(1,"abhinav");

      listOfInnerClass.add(myinnerclass);
    }
}
