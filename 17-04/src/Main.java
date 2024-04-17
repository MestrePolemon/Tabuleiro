import java.util.Random;
import java.util.Scanner;

public class Main {

    static void tabuleiro(int x, int y, PlayerCharacter personagem1, NPC personagem2) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (j == personagem1.getPosicaoX() && i == personagem1.getPosicaoY()) {
                    System.out.print("[" + personagem1.getFormato() + "]"); // Personagem dentro dos colchetes
                } else if(j == personagem2.getPosicaoX() && i == personagem2.getPosicaoY()){
                    System.out.print("[" + personagem2.getFormato() + "]"); // NPC dentro dos colchetes
                } else {
                    System.out.print("[ ]");
                }
            }
            System.out.println();
        }
    };
    
    
    public static void main(String[] args) {
        
        int tamanhoX, tamanhoY;
        boolean cansado = false;

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o tamanho do tabuleiro");
        System.out.println("Digite o tamanho do eixo X");
        tamanhoX = scanner.nextInt();
        System.out.println("Digite o tamanho do eixo Y");
        tamanhoY = scanner.nextInt();
        scanner.nextLine();

        Random random = new Random();
        int posicaoX = random.nextInt(tamanhoX);
        int posicaoY = random.nextInt(tamanhoY);

        PlayerCharacter playerCharacter = new PlayerCharacter(posicaoX, posicaoY,
                ConsoleColors.YELLOW_BRIGHT + "O" + ConsoleColors.RESET);

        NPC npc = new NPC(random.nextInt(tamanhoX), random.nextInt(tamanhoY),
                ConsoleColors.RED_BRIGHT + "X" + ConsoleColors.RESET);


        while(cansado != true){
            tabuleiro(tamanhoX, tamanhoY, playerCharacter, npc);
            System.out.println("Digite a direção que deseja mover o personagem");
            System.out.print("[w] Cima ");
            System.out.print("[s] Baixo ");
            System.out.print("[d] Direita ");
            System.out.print("[a] Esquerda ");
            System.out.println("[5] Sair");
            String direcao = scanner.nextLine();

            switch(direcao){
                case "w":
                    if(playerCharacter.getPosicaoY() > 0){
                        playerCharacter.moverParaCima();
                    } else {
                        System.out.println("Não é possível mover para cima");
                    }
                    break;
                case "s":
                    if(playerCharacter.getPosicaoY() < tamanhoY - 1){
                        playerCharacter.moverParaBaixo();
                    } else {
                        System.out.println("Não é possível mover para baixo");
                    }
                    break;
                case "d":
                    if(playerCharacter.getPosicaoX() < tamanhoX - 1){
                        playerCharacter.moverParaDireita();
                    } else {
                        System.out.println("Não é possível mover para direita");
                    }
                    break;
                case "a":
                    if(playerCharacter.getPosicaoX() > 0){
                        playerCharacter.moverParaEsquerda();
                    } else {
                        System.out.println("Não é possível mover para esquerda");
                    }
                    break;
                case "5":
                    cansado = true;
                    break;
                default:
                    System.out.println("Digite uma opção válida");
                    break;
            }
        }


    }
}