import java.util.*;
public class DotComBust {
	
	public static void main(String [] args) {

		DotComBust dtb = new DotComBust();
		
		dtb.setUpGame();
		dtb.startPlaying(); 	
	}

	private GameHelper helper = new GameHelper();
	
	private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();

	private int numOfGuesses = 0;

	public void setUpGame() {
		
		DotCom pets = new DotCom();
		pets.setName("Pets.com");

		DotCom etoys = new DotCom();
		etoys.setName("Etoys.com");

		DotCom gotwo = new DotCom();
		gotwo.setName("Go2.com");

		dotComsList.add(pets);		
		dotComsList.add(etoys);		
		dotComsList.add(gotwo);

		System.out.println("Seu objetivo é eliminar três dot coms.");
		System.out.println("Pets.com, eToys.com, Go2.com");
		System.out.println("Tente eliminar todas com o menor número de palpites");

		for (DotCom dotComToSet : dotComsList) {
			ArrayList<String> newLocation = helper.placeDotCom(3);
			dotComToSet.setLocationCells(newLocation);
		}
	}

	public void startPlaying() {
		while (!dotComsList.isEmpty()) {
			String userGuess = helper.getUserInput("Insira um palpite");
			checkUserGuess(userGuess);
		}
		finishGame();
	}

	public void checkUserGuess(String userGuess) {
		numOfGuesses++;
		String result = "errado";
		for (DotCom dotComToTest : dotComsList) {
			result = dotComToTest.checkYourself(userGuess);
			if (result.equals("correto")) {
				break;
			} 
			if (result.equals("eliminar")) {
				dotComsList.remove(dotComToTest);
				break;
			}
		}
		System.out.println(result);
	}

	public void finishGame() {
		
		System.out.println("Todas as Dot Coms foram eliminadas! Agora seu conjunto está vazio.");
		if (numOfGuesses <= 18) {
			System.out.println("Parabéns, você venceu com apenas " + numOfGuesses + " palpites!");
			System.out.println("Você saiu antes de eliminar suas opções.");
		} else {
			System.out.println("Demorou demais. " + numOfGuesses + " palpites.");
			System.out.println("Com esse tanto de palpites qualquer um ganha");
		}		
	}
}
