package com.sistemas.DAO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alum.fial7
 */
public class Calculo {
  private double n1; 
  private double n2;

    public Calculo(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
}
    
public double suma () {return n1+n2;}
public double resta () {return n1-n2;}
public double multiplicacion () {return n1*n2;}
public double division () {return n1/n2;}
}
