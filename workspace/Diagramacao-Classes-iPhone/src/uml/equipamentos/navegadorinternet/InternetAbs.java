/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uml.equipamentos.navegadorinternet;

/**
 *
 * @author USUARIO
 */
public class InternetAbs implements InternetIntfc{
     String enderecoPagina;

    public InternetAbs(String nomePagina) {
        this.enderecoPagina = enderecoPagina;
    }
    
    @Override
  public void exibirPagina() {
    System.out.println("Exibindo a página :" + enderecoPagina);
  }

  @Override
  public void adicionarNovaAba() {
    System.out.println("Adicionando a  página: " +enderecoPagina);
  }

  @Override
  public void atualizarPagina() {
    System.out.println("Atualizando página:" + enderecoPagina);
  }

    public String getNomePagina() {
        return enderecoPagina;
    }
 
}
