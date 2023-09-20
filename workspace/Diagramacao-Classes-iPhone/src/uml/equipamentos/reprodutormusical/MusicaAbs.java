/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uml.equipamentos.reprodutormusical;

/**
 *
 * @author USUARIO
 */
public class MusicaAbs implements MusicaIntfc{
    String nome;

  public MusicaAbs(String nome) {
    this.nome = nome;
  }

  @Override
  public void tocar(String nome) {
    System.out.println("A musica " + nome + " está tocando");
  }

  @Override
  public void pausar(String nome) {
    System.out.println("A musica " + nome + " está pausada!");
  }

  @Override
  public void selecionarMusica(String nome) {
    this.nome = nome;
    System.out.println("A musica " + nome + "foi selecionada");
  }

  public String getNome() {
    return nome;
  }

    
    
}
