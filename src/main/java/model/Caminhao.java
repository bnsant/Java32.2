/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author 10725116225
 */
import javax.swing.*;

public class Caminhao extends Veiculo {

    private int cargaMax;
    private int alturaMax;
    private int comprimento;

    public Caminhao() {
        this(0, 0, 0, 0, 0, 0);
    }

    public Caminhao(int peso, int velocMax, float preco, int cargaMax, int alturaMax, int comprimento) {
        super(peso, velocMax, preco);
        setCargaMax(cargaMax);
        setAlturaMax(alturaMax);
        setComprimento(comprimento);
    }

    public void setCargaMax(int cargaMax) {
        this.cargaMax = cargaMax;
    }

    public void setAlturaMax(int alturaMax) {
        this.alturaMax = alturaMax;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }

    public int getCargaMax() {
        return cargaMax;
    }

    public int getAlturaMax() {
        return alturaMax;
    }

    public int getComprimento() {
        return comprimento;
    }

    public void leitura() {
        super.leitura();
        setCargaMax(Integer.parseInt(JOptionPane.showInputDialog("Carga Maxima (ton):")));
        setAlturaMax(Integer.parseInt(JOptionPane.showInputDialog("Altura Maxima (m):")));
        setComprimento(Integer.parseInt(JOptionPane.showInputDialog("Comprimento (m):")));
    }

    public void imprimir() {
        JOptionPane.showMessageDialog(null, paraString());
    }

    public String paraString() {
        return (super.paraString()
                + "\nCarga Maxima: " + getCargaMax()
                + "ton\nAltura Maxima: " + getAlturaMax()
                + "m\nComprimento: " + getComprimento() + "m");
    }

}