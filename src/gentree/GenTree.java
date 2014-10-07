/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gentree;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author barreto
 */
public class GenTree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        myTreeSimple tree = new myTreeSimple();
        List<myTreeSimple> kids = new ArrayList<myTreeSimple>();

        kids.add(new myTreeSimple("bob")); 
        tree.setChildren(kids);
        kids.add(new myTreeSimple("fred"));
       // tree.setChildren(grandkids);
        //grandkids.add(new myTreeSimple("Ana"));
       // grandkids.add(new myTreeSimple("Luis"));
        //tree.addChildAt(1, new myTreeSimple("Thomas"));
        kids.add(new myTreeSimple("Chris"));
        kids.add(new myTreeSimple("Isabelle"));
        System.out.println("Number of Children: "+tree.getNumberOfChildren()); // returns 2 even though addChild was not called!
        tree.traverse(tree);
    
    }
    
}
