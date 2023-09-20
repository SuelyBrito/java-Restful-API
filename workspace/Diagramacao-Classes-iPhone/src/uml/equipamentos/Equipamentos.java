/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uml.equipamentos;

import uml.equipamentos.aparelhotelefonico.TelefoneIntfc;
import uml.equipamentos.navegadorinternet.InternetIntfc;
import uml.equipamentos.reprodutormusical.MusicaIntfc;

/**
 *
 * @author USUARIO
 */
public class Equipamentos implements TelefoneIntfc, InternetIntfc, MusicaIntfc {

    @Override
    public void tocar(String nome) {
        System.out.println("Ouvindo a música:" + nome);
    }

    @Override
    public void pausar(String nome) {
        System.out.println("Pausando a música:" + nome);
    }

    @Override
    public void selecionarMusica(String nome) {
        System.out.println(nome + " selecionada");
    }

    @Override
    public void ligar(int numero) {
        System.out.println("Ligando para  " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz");
    }

    /**
     *
     */
    @Override
    public void exibirPagina() {
        System.out.println("Exibindo a página");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando página");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }

}
