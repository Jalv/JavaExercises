package edu.upc.dsa.juan;

/**
 * Created by juan on 28/09/15.
 */
public class Tree {

    private String name;
    private int altura;

    public Tree(){

        this.name = null;
        this.altura = 0;
    }

    public Tree(String name){

        this.name = name;
        this.altura = 0;

    }

    public Tree(String name, int altura){

        this.name = name;
        this.altura = altura;

    }

    public Tree(int altura){

        this.name = null;
        this.altura=altura;
    }

    public void escribe(){
        if(name==null && altura==0){

            System.out.println("un arbol");
        }
        else if(name!=null&&altura==0){

            System.out.println("un "+name);
        }
        else if(name==null&&altura!=0){

            System.out.println("un arbol de "+altura+" metros");
        }
        else System.out.println("un "+name+ " de "+altura+" metros");


    }

}
