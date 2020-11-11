/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package awt_calculadora1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author valde
 */
public class AWT_calculadora1 extends Frame{

    boolean punto_puesto1 = false;
    boolean punto_puesto2 = false;
    
    boolean suma = false;
    boolean resta = false;
    boolean multiplicacion = false;
    boolean division = false;
    
    float num1 = 0;
    float num2 = 0;
    
    int largoNum1 = 0;
    
    public float sumar(float num1, float num2) {
        return num1 + num2;
    }
    public float restar(float num1, float num2) {
        return num1 - num2;
    }
    public float multiplicar(float num1, float num2) {
        return num1 * num2;
    }
    public float dividir(float num1, float num2) {
        return num1 / num2;
    }
    
    AWT_calculadora1(){
        
        Panel panel_principal = new Panel(new BorderLayout());
        this.add(panel_principal);
        
        TextField text = new TextField(""); 
        panel_principal.add(text, BorderLayout.NORTH);
        
        Button botonIgual = new Button(" = "); 
        
        botonIgual.addActionListener (new ActionListener(){
            public void actionPerformed (ActionEvent e)
            {
                
                if(suma){
                    num2 = Float.valueOf(text.getText().substring(largoNum1, text.getText().length()));
                    largoNum1 = 0;
                    num1 = sumar(num1, num2);
                    text.setText(String.valueOf(num1));
                    suma = false;
                    resta = false;
                    multiplicacion = false;
                    division = false;
                    punto_puesto2 = false;
                }
                else if(resta){
                    num2 = Float.valueOf(text.getText().substring(largoNum1, text.getText().length()));
                    largoNum1 = 0;
                    num1 = restar(num1, num2);
                    text.setText(String.valueOf(num1));
                    resta = false;
                    resta = false;
                    multiplicacion = false;
                    division = false;
                    punto_puesto2 = false;
                }
                else if(multiplicacion){
                    num2 = Float.valueOf(text.getText().substring(largoNum1, text.getText().length()));
                    largoNum1 = 0;
                    num1 = multiplicar(num1, num2);
                    text.setText(String.valueOf(num1));
                    multiplicacion = false;
                    resta = false;
                    multiplicacion = false;
                    division = false;
                    punto_puesto2 = false;
                }
                else if (division){
                    num2 = Float.valueOf(text.getText().substring(largoNum1, text.getText().length()));
                    largoNum1 = 0;
                    num1 = dividir(num1, num2);
                    text.setText(String.valueOf(num1));
                    division = false;
                    resta = false;
                    multiplicacion = false;
                    division = false;
                    punto_puesto2 = false;
                }
                    
            }
        });
        
        panel_principal.add(botonIgual, BorderLayout.SOUTH);
        
        Panel panel_botones = new Panel(new GridLayout(4,4));
        panel_principal.add(panel_botones, BorderLayout.CENTER);
        
        
        
        Button boton1 = new Button("1");
        boton1.addActionListener (new ActionListener(){
            public void actionPerformed (ActionEvent e)
            {text.setText(text.getText() + boton1.getLabel().toString());}
        });
        panel_botones.add(boton1);
        
        Button boton2 = new Button("2");
        boton2.addActionListener (new ActionListener(){
            public void actionPerformed (ActionEvent e)
            {text.setText(text.getText() + boton2.getLabel().toString());}
        });
        panel_botones.add(boton2);
        
        Button boton3 = new Button("3");
        boton3.addActionListener (new ActionListener(){
            public void actionPerformed (ActionEvent e)
            {text.setText(text.getText() + boton3.getLabel().toString());}
        });
        panel_botones.add(boton3);
        
        Button  botonSumar = new Button(" + ");
        botonSumar.addActionListener (new ActionListener(){
            public void actionPerformed (ActionEvent e)
            {
                if(!suma){
                    if(!text.getText().isEmpty()){
                        text.setText(text.getText() + botonSumar.getLabel().toString());
                        num1 = Float.valueOf(text.getText().substring(0, text.getText().length() - 3));
                        largoNum1 = text.getText().length();
                        suma = true;
                        resta = true;
                        multiplicacion = true;
                        division = true;
                    }
                }
            }
        });
        panel_botones.add(botonSumar);
        
        Button boton4 = new Button("4");
        boton4.addActionListener (new ActionListener(){
            public void actionPerformed (ActionEvent e)
            {text.setText(text.getText() + boton4.getLabel().toString());}
        });
        panel_botones.add(boton4);
        
        Button boton5 = new Button("5");
        boton5.addActionListener (new ActionListener(){
            public void actionPerformed (ActionEvent e)
            {text.setText(text.getText() + boton5.getLabel().toString());}
        });
        panel_botones.add(boton5);
        
        Button boton6 = new Button("6");
        boton6.addActionListener (new ActionListener(){
            public void actionPerformed (ActionEvent e)
            {text.setText(text.getText() + boton6.getLabel().toString());}
        });
        panel_botones.add(boton6);
        
        Button botonRestar = new Button(" - ");
        botonRestar.addActionListener (new ActionListener(){
            public void actionPerformed (ActionEvent e)
            {
                if(!resta){
                    if(!text.getText().isEmpty()){
                        text.setText(text.getText() + botonRestar.getLabel().toString());
                        num1 = Float.valueOf(text.getText().substring(0, text.getText().length() - 3));
                        largoNum1 = text.getText().length();
                        resta = true;
                        resta = true;
                        multiplicacion = true;
                        division = true;
                    }
                }
            }
        });
        panel_botones.add(botonRestar);
        
        Button boton7 = new Button("7");
        boton7.addActionListener (new ActionListener(){
            public void actionPerformed (ActionEvent e)
            {text.setText(text.getText() + boton7.getLabel().toString());}
        });
        panel_botones.add(boton7);
        
        Button boton8 = new Button("8");
        boton8.addActionListener (new ActionListener(){
            public void actionPerformed (ActionEvent e)
            {text.setText(text.getText() + boton8.getLabel().toString());}
        });
        panel_botones.add(boton8);
        
        Button boton9 = new Button("9");
        boton9.addActionListener (new ActionListener(){
            public void actionPerformed (ActionEvent e)
            {text.setText(text.getText() + boton9.getLabel().toString());}
        });
        panel_botones.add(boton9);
        
        Button botonMultiplo = new Button(" * ");
        botonMultiplo.addActionListener (new ActionListener(){
            public void actionPerformed (ActionEvent e)
            {
                if(!multiplicacion){
                    if(!text.getText().isEmpty()){
                        text.setText(text.getText() + botonMultiplo.getLabel().toString());
                        num1 = Float.valueOf(text.getText().substring(0, text.getText().length() - 3));
                        largoNum1 = text.getText().length();
                        multiplicacion = true;
                        resta = true;
                        multiplicacion = true;
                        division = true;
                    }
                }
            }
        });
        panel_botones.add(botonMultiplo);
        
        Button boton_punto = new Button(",");
        boton_punto.addActionListener (new ActionListener(){
            public void actionPerformed (ActionEvent e)
            {
                try{
                    int ultimoValor = Integer.valueOf(text.getText().substring(text.getText().length() - 1, text.getText().length()));
                    if(!punto_puesto1 && !suma){
                        text.setText(text.getText() + ".");
                        punto_puesto1 = true;
                    }
                    if(!punto_puesto2 && suma){
                        text.setText(text.getText() + ".");
                        punto_puesto2 = true;
                    }
                }catch(Exception excep){}
            }
        });
        panel_botones.add(boton_punto);
        
        Button boton0 = new Button("0");
        boton0.addActionListener (new ActionListener(){
            public void actionPerformed (ActionEvent e)
            {text.setText(text.getText() + boton0.getLabel().toString());}
        });
        panel_botones.add(boton0);
        
        Button botonC = new Button("C");
        botonC.addActionListener (new ActionListener(){
            public void actionPerformed (ActionEvent e)
            {
                if(!text.getText().equals("")){
                    
                    if(punto_puesto1 && !punto_puesto2){
                        if(text.getText().substring(text.getText().length() - 1, text.getText().length()).equals(".")){
                            punto_puesto1 = false;
                        }
                    }
                    else if(punto_puesto2){
                        if(text.getText().substring(text.getText().length() - 1, text.getText().length()).equals(".")){
                            punto_puesto2 = false;
                        }
                    }
                    
                    if(text.getText().substring(text.getText().length() - 1, text.getText().length()).equals(" ")){
                        text.setText(text.getText().substring(0, text.getText().length() - 3));
                    }
                    else{
                        text.setText(text.getText().substring(0, text.getText().length() - 1));
                    }
                }
            }
        });
        panel_botones.add(botonC);
        
        Button botonDivision = new Button(" / ");
        botonDivision.addActionListener (new ActionListener(){
            public void actionPerformed (ActionEvent e)
            {
                if(!division){
                    if(!text.getText().isEmpty()){
                        text.setText(text.getText() + botonDivision.getLabel().toString());
                        num1 = Float.valueOf(text.getText().substring(0, text.getText().length() - 3));
                        largoNum1 = text.getText().length();
                        division = true;
                        resta = true;
                        multiplicacion = true;
                        division = true;
                    }
                }
            }
        });
        panel_botones.add(botonDivision);
        
    }
    
    
    
    public static void main(String[] args) {
        AWT_calculadora1 ej = new AWT_calculadora1();
        ej.setTitle("AWT Calculadora 1");
        ej.setSize(600,400);
        ej.setLocation(500, 300);
        ej.setVisible(true);
        ej.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
              System.exit(0);
            }
        });
    }
    
}
