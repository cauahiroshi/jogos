package Testes;

import Jogos.Jogo;
import Jogos.Moba;
import Jogos.Rpg;
import Jogos.Fps;

public class TestaJogos {
	public static void main(String[] args) {
	
		Jogo jogo1 = new Moba ("League of Legends", "Computador/Celular", 2009 ); 
		Jogo jogo2 = new Moba ("Mobile Legends", "Celular", 2016); 
		
		Jogo jogo3 = new Rpg ("Minecraft", "Celular/Computador/Videogame", 2011);
		Jogo jogo4 = new Rpg ("Cyberpunk 2077", "Videogame", 2020);
		
		Jogo jogo5 = new Fps ("Counter-Strike", "Computador/Videogame", 2000);
		Jogo jogo6 = new Fps ("Valorant", "Computador", 2020);
		
		System.out.println("Nome do jogo: " + jogo1.getNome());
		System.out.println("Plataforma: " + jogo1.getPlataforma());
		System.out.println("Ano de lançamento: " + jogo1.getAnoDeLancamento());
		System.out.println();
		
		System.out.println("Nome do jogo: " + jogo2.getNome());
		System.out.println("Plataforma: " + jogo2.getPlataforma());
		System.out.println("Ano de lançamento: " + jogo2.getAnoDeLancamento());
		System.out.println();
		
		System.out.println("Nome do jogo: " + jogo3.getNome());
		System.out.println("Plataforma: " + jogo3.getPlataforma());
		System.out.println("Ano de lançamento: " + jogo3.getAnoDeLancamento());
		System.out.println();
		
		System.out.println("Nome do jogo: " + jogo4.getNome());
		System.out.println("Plataforma: " + jogo4.getPlataforma());
		System.out.println("Ano de lançamento: " + jogo4.getAnoDeLancamento());
		System.out.println();
		
		System.out.println("Nome do jogo: " + jogo5.getNome());
		System.out.println("Plataforma: " + jogo5.getPlataforma());
		System.out.println("Ano de lançamento: " + jogo5.getAnoDeLancamento());
		System.out.println();
		
		
		System.out.println("Nome do jogo: " + jogo6.getNome());
		System.out.println("Plataforma: " + jogo6.getPlataforma());
		System.out.println("Ano de lançamento: " + jogo6.getAnoDeLancamento());
		
	
	}
}
