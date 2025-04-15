/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.swing.*;

public class Veiculo {

    private int peso;
    private int velocMax;
    private float preco;

    public Veiculo() {
        this(0, 0, 0);
    }

    public Veiculo(int peso, int velocMax, float preco) {
        setPeso(peso);
        setVelocMax(velocMax);
        setPreco(preco);
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setVelocMax(int velocMax) {
        this.velocMax = velocMax;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getPeso() {
        return peso;
    }

    public int getVelocMax() {
        return velocMax;
    }

    public float getPreco() {
        return preco;
    }

    public void leitura() {
        setPeso(Integer.parseInt(JOptionPane.showInputDialog("Peso(Kg):")));
        setVelocMax(Integer.parseInt(JOptionPane.showInputDialog("Velocidade Maxima(Km/h):")));
        setPreco(Float.parseFloat(JOptionPane.showInputDialog("Preco(US$):")));
    }

    public void imprimir() {
        JOptionPane.showMessageDialog(null, paraString());
    }

    public String paraString() {
        return ("Peso: " + getPeso()
                + " Kg\nVelocidade Maxima: " + getVelocMax()
                + " Km/h\nPreco: US$" + getPreco());
    }
}
