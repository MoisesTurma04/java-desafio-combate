package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Champion;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite os dados do primeiro campeão:");
		System.out.print("Nome: ");
		String nameA = sc.next();
		System.out.print("Vida inicial: ");
		int lifeA = sc.nextInt();
		System.out.print("Ataque: ");
		int attackA = sc.nextInt();
		System.out.print("Armadura: ");
		int armorA = sc.nextInt();
		System.out.println();
		

		Champion championA = new Champion(nameA, lifeA, attackA, armorA);

		System.out.println("Digite os dados do segundo campeão:");
		System.out.print("Nome: ");
		String nameB = sc.next();
		System.out.print("Vida inicial: ");
		int lifeB = sc.nextInt();
		System.out.print("Ataque: ");
		int attackB = sc.nextInt();
		System.out.print("Armadura: ");
		int armorB = sc.nextInt();

		Champion championB = new Champion(nameB, lifeB, attackB, armorB);
		
		System.out.println();

		System.out.print("Quantos turnos você deseja executar? ");
		int turns = sc.nextInt();
		System.out.println();

		for (int i = 1; i <= turns; i++) {
			System.out.println("Resultado do turno " + i + ":");
			championA.takeDamage(championB);
			championB.takeDamage(championA);
			System.out.println(championA.status());
			System.out.println(championB.status());
			System.out.println();

			if (championA.getLife() == 0 || championB.getLife() == 0) {
				System.out.println("FIM DO COMBATE");
				break;
			}
		}

		if (championA.getLife() > 0 && championB.getLife() > 0) {
			System.out.println("FIM DO COMBATE");
		}

		sc.close();
	}
}
