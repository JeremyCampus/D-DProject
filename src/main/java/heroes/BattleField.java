package main.java.heroes;

import java.util.Scanner;

class BattleField {

	public BattleField(){
		
	}
		
		public void newCharacter(){

			
		}
	public static void main(String[] args) {
		boolean exitTotal = false;			  
		do{
			System.out.println("-BATTLEFIELD-");
			System.out.println("Guerrier, ou Mage ?");
			System.out.println("Guerrier = 1 |  Mage = 2");
			Scanner sc = new Scanner(System.in);
			System.out.println("Veuillez saisir une valeur :");
			int str = sc.nextInt();
			Character myHero = null;
			
			if(str!=1 && str!=2)
			{			
				System.out.println("Vous avez saisi : " + str + " C'est incorrecte");
			}else {			
				if(str==1)
				{			
					myHero = new Guerrier("Guerrier du Nord");
				}else if(str==2)
				{			
					myHero = new Mage("Mage de l'Ouest");
				} 
				
				myHero.afficher();
				boolean exit = false;			  

				do{
					myHero.mettreAJour();
					System.out.println("");
					System.out.println("");
					System.out.println("");
					System.out.println("_____________________________________________________________________");
					System.out.println("|||||||||||||||||||||| QUE VOULEZ VOUS FAIRE ? ||||||||||||||||||||||");
					System.out.println("_____________________________________________________________________");
					System.out.println("---");
					System.out.println("Afficher votre personnage ? = 1");
					System.out.println("Modifier les infos de votre personnage? = 2");
					System.out.println("Attaquer ? = 3");
					System.out.println("Ajouter une arme ou un sort?  = 4");
					System.out.println("Faire la saisie de plusieurs personnages  = 5");
					System.out.println("Quitter  = 6");
					System.out.println("---");
					System.out.println("");
					System.out.println("");
					System.out.println("");
					System.out.println("");
					System.out.println("");
					String str2 = sc.nextLine();
					System.out.println("_____________________________________________________________________");
					System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
					System.out.println("_____________________________________________________________________");
					switch (str2)
					{
						case "1":
							myHero.afficher();			  
							break;        
						case "2":
							myHero.modifier();			  
							break;        
						case "3":
							myHero.attaquer();			  
							break;        
						case "4":
							myHero.ajouterArmeSpell();			  
							break;        
						case "5":
							exit = true;
							break; 
						case "6":
							exit = true;
							exitTotal = true;		  
							break;        
						default:
					System.out.println("Erreur");
							break;        
					}
				}while(exit != true);
			}
		}while(exitTotal != true);
	}
}