package edu.upc.dsa.juan;

/**
 * Created by juan on 25/09/15.
 */
public class Main {

    public static void main(String[] args) {
        // write your code here
        Tree[] arboles = new Tree[4];
        arboles[0] = new Tree(4);
        arboles[1] = new Tree("Roble");
        arboles[2] = new Tree();
        arboles[3] = new Tree("Pino",5);



        for(Tree t : arboles){

            t.escribe();
        }
    }
}
