/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.principal;

import javax.swing.*;
import model.Caminhao;
import model.CarroPasseio;

public class Principal {

    public static void main(String args[]) {
        CarroPasseio carroPasseio = new CarroPasseio();
        Caminhao caminhao = new Caminhao();
        int op = -1;
        while (op != 0) {
            op = Integer.parseInt(JOptionPane.showInputDialog(
                    "1 - Preencher Carro Passeio"
                    + "\n2 - Imprimir Carro Passeio"
                    + "\n3 - Preencher Caminhao"
                    + "\n4 - Imprimir Caminhao"
                    + "\n0 - Sair"));
            switch (op) {
                case 1:
                    carroPasseio.leitura();
                    break;
                case 2:
                    carroPasseio.imprimir();
                    break;
                case 3:
                    caminhao.leitura();
                    break;
                case 4:
                    caminhao.imprimir();
                    break;
            }
        }
    }
}