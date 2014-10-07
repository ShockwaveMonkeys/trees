/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gentree;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author barreto
 */
public class myTreeSimple<E> 
{
    public E data;
    public List<myTreeSimple<E>> children;
    public myTreeSimple()
    {
        super();
        children = new ArrayList<myTreeSimple<E>>();
    }
    public myTreeSimple(E data)
    {
        this();
        setData(data);
    }
    public List<myTreeSimple<E>> getChildren()
    {
        return this.children;
    }
    
    public int getNumberOfChildren()
    {
        return getChildren().size();
    }
    public boolean hasChildren()
    {
        return (getNumberOfChildren() > 0);
    }
    public void setChildren(List<myTreeSimple<E>> children) 
    {
        this.children = children;
    }
    public void addChild(myTreeSimple<E> child)
    {
        children.add(child);
    }
    public void addChildAt(int index, myTreeSimple<E> child) 
                        throws IndexOutOfBoundsException 
    {
        children.add(index, child);
    }
    public void removeChildren() 
    {
        this.children = new ArrayList<myTreeSimple<E>>();
    }
    public void removeChildAt(int index) throws IndexOutOfBoundsException
    {
        children.remove(index);
    }
    public myTreeSimple<E> getChildAt(int index) 
                        throws IndexOutOfBoundsException 
    {
        return children.get(index);
    }
    public E getData() 
    {
        return this.data;
    }
    public void setData(E data) 
    {
        this.data = data;
    }
    public String toString() 
    {
        return getData().toString();
    }
    public boolean equals(myTreeSimple<E> node) 
    {
        return node.getData().equals(getData());
    }
    public int hashCode() 
    {
        return getData().hashCode();
    }
    public String toStringVerbose() 
    {
        String stringRepresentation = getData().toString() + ":[";
        for (myTreeSimple<E> node : getChildren()) 
        {
            stringRepresentation += node.getData().toString() + ", ";
        }
        Pattern pattern = Pattern.compile(", $", Pattern.DOTALL);
        Matcher matcher = pattern.matcher(stringRepresentation);
        stringRepresentation = matcher.replaceFirst("");
        stringRepresentation += "]";
        return stringRepresentation;
    }
    public void traverse(myTreeSimple<E> child)
    {
        for(myTreeSimple<E> each : child.getChildren())
        {
            traverse(each);
            System.out.println(each.toString());
        }
        System.out.println("\t");
        
    }

}
