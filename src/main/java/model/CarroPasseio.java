/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.swing.*;

public class CarroPasseio extends Veiculo {

    private String cor;
    private String modelo;

    public CarroPasseio() {
        this(0, 0, 0, "", "");
    }

    public CarroPasseio(int peso, int velocMax, float preco, String cor, String modelo) {
        super(peso, velocMax, preco);
        setCor(cor);
        setModelo(modelo);
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void leitura() {
        super.leitura();
        setCor(JOptionPane.showInputDialog("Cor:"));
        setModelo(JOptionPane.showInputDialog("Modelo:"));
    }

    public void imprimir() {
        JOptionPane.showMessageDialog(null, paraString());
    }

    public String paraString() {
        return (super.paraString() + "\nCor: " + getCor()
                + "\nModelo: " + getModelo());
    }
}
