/*
* To change this template, choose Tools | Templates
* and open the template in the editor.
*/
package prjava01.rojas15;

/**
*
* @author ubu64
*/

import java.awt.Desktop;
import java.io.*;

public class Prjava01Rojas15 {

/**
* @param args the command line arguments
*/
public static void main(String[] args) throws IOException {
File f = new File("pr01-rojas15.html");
try (BufferedWriter bw = new BufferedWriter(new FileWriter(f))) {
bw.write("<html>");bw.newLine();
bw.write(" <head>");bw.newLine();
bw.write(" <title>");bw.newLine();
bw.write(" Nova web de Agustin Rojas");bw.newLine();
bw.write(" </title>");bw.newLine();
bw.write(" </head>");bw.newLine();
bw.write(" <body>");bw.newLine();
bw.write(" DAW 2 UF4 Practica 2");bw.newLine();
bw.write(" </body>");bw.newLine();
bw.write("</html>");bw.newLine();
bw.close();
}
}
}
