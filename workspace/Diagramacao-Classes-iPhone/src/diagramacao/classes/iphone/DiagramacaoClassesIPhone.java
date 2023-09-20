/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package diagramacao.classes.iphone;

import uml.equipamentos.Equipamentos;

/**
 *
 * @author USUARIO
 */
public class DiagramacaoClassesIPhone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Equipamentos equipamento = new Equipamentos();

        System.out.println("--- Reprodutor Musical ---");
        String nomeDaMusica = "Como nossos Pais";
        equipamento.selecionarMusica(nomeDaMusica);
        equipamento.tocar(nomeDaMusica  );
        equipamento.pausar(nomeDaMusica);

        System.out.println("---Telefone---");
        equipamento.atender();
        equipamento.iniciarCorreioVoz();
        equipamento.ligar(12345678);

        System.out.println("---Navegador Internet---");
        String nomePagina = "PaginadaSuely";
        equipamento.exibirPagina();
        equipamento.atualizarPagina();
        equipamento.adicionarNovaAba();

        System.out.println("------------");
    }

}
