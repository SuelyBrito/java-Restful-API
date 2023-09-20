/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uml.equipamentos.aparelhotelefonico;

/**
 *
 * @author Suely
 */
public abstract class TelefoneAbs implements TelefoneIntfc {

    @Override
    public void ligar(int numero) {
        System.out.println("Ligando para o " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo a ligação");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz");
    }

}
