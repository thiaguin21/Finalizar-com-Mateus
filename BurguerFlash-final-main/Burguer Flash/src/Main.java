import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Pagamento pag = new Pagamento();
        Garcom gar = new Garcom();
        Cozinha coz = new Cozinha();
        Cardapio card = new Cardapio();
        Cliente cli = new Cliente();
        int ler;

        do {
            System.out.println("=== RESTAURANTE ===");
            System.out.println("Abra o cardápio\n" +
                    "1- Abrir cardápio.");
            ler = scan.nextInt();

            if (ler == 1) {
                card.abrirCardapio();
                card.mostrarCardapio();
            } else {
                System.out.println("Opção Inválida.\n" +
                        "Aperte 1 para abrir o cardápio");
            }
        } while(ler != 1);

        do {
            System.out.println("Gostaria de hambúguer?");
            System.out.println("1- Sim");
            System.out.println("2- Não");
            ler = scan.nextInt();

            if (ler == 1) {
                System.out.println("Qual deseja?");
                ler = 0;
                ler = scan.nextInt();
                card.escolherHamburguer(ler);
            } else if(ler == 2){
                System.out.println("Sem Hambúrguer\n");
            } else {
                System.out.println("Opção Inválida.\n" +
                        "Aperte 1 ou 2");
            }
        } while(ler != 1 && ler != 2);

        do {
            System.out.println("Gostaria de Bebida?");
            System.out.println("1- Sim");
            System.out.println("2- Não");
            ler = scan.nextInt();

            if (ler == 1) {
                System.out.println("Qual deseja?");
                ler = 0;
                ler = scan.nextInt();
                card.escolherBebida(ler);
            } else if(ler == 2){
                System.out.println("Sem Bebida\n");
            } else {
                System.out.println("Opção Inválida.\n" +
                        "Aperte 1 ou 2");
            }
        } while(ler != 1 && ler != 2);

        do {
            System.out.println("Gostaria de Sobremesa?");
            System.out.println("1- Sim");
            System.out.println("2- Não");
            ler = scan.nextInt();

            if (ler == 1) {
                System.out.println("Qual deseja?");
                ler = 0;
                ler = scan.nextInt();
                card.escolherSobremesa(ler);
            } else if(ler == 2){
                System.out.println("Sem Sobremesa\n");
            } else {
                System.out.println("Opção Inválida.\n" +
                        "Aperte 1 ou 2");
            }
        } while(ler != 1 && ler != 2);

        do {
            System.out.println("Gostaria de Acompanhamento?");
            System.out.println("1- Sim");
            System.out.println("2- Não");
            ler = scan.nextInt();

            if (ler == 1) {
                System.out.println("Qual deseja?");
                ler = 0;
                ler = scan.nextInt();
                card.escolherAcompanhamento(ler);
            } else if(ler == 2){
                System.out.println("Sem Acompanhamento\n");
            } else {
                System.out.println("Opção Inválida.\n" +
                        "Aperte 1 ou 2");
            }
        } while(ler != 1 && ler != 2);

        do {
            System.out.println("Gostaria de ver os adicionais?");
            System.out.println("1- Sim");
            System.out.println("2- Não");
            ler = 0;
            ler = scan.nextInt();

            if (ler == 1) {
                card.mostrarAdicionais();
                System.out.println("Deseja qual dicional?\n" +
                        "1- Adicional de Hamburguer\n" +
                        "2- Adicional de Batata\n" +
                        "3- Adicional de Sorvete\n" +
                        "4- Adicional de Bebida\n" +
                        "5- Nenhum adicional");
                ler = 0;
                ler = scan.nextInt();

                do {
                    switch (ler) {
                        case 1:
                            ler = 0;
                            System.out.println("Qual deseja?");
                            ler = scan.nextInt();
                            card.escolherAdicionalHamb(ler);

                        case 2:
                            ler = 0;
                            System.out.println("Qual deseja?");
                            ler = scan.nextInt();
                            card.escolherAdicionalBat(ler);
                        case 3:
                            ler = 0;
                            System.out.println("Qual deseja?");
                            ler = scan.nextInt();
                            card.escolherAdicionalSorv(ler);
                        case 4:
                            ler = 0;
                            System.out.println("Qual deseja?");
                            ler = scan.nextInt();
                            card.escolherAdicionalBeb(ler);
                        case 5:
                            System.out.println("Sem adicional");
                        default:
                            System.out.println("Escolha uma opção válida.");
                            ler = scan.nextInt();
                    }
                } while (ler != 1 && ler != 2 && ler != 3 && ler != 4 && ler != 5);
            } else if(ler == 2){
                System.out.println("Sem Adicional\n");
            } else {
                System.out.println("Opção Inválida.\n" +
                        "Aperte 1 ou 2");
            }
        } while(ler != 1 && ler != 2);

        do {
            System.out.println("Gostaria de mais algum adidonal?");
            System.out.println("1- Sim");
            System.out.println("2- Não");
            ler = 0;
            ler = scan.nextInt();

            if (ler == 1) {
                System.out.println("Deseja qual adicional?\n" +
                        "1- Adicional de Hamburguer\n" +
                        "2- Adicional de Batata\n" +
                        "3- Adicional de Sorvete\n" +
                        "4- Adicional de Bebida\n" +
                        "5- Nenhum adicional");
                ler = 0;
                ler = scan.nextInt();

                do {
                    switch (ler) {
                        case 1:
                            ler = 0;
                            System.out.println("Qual deseja?");
                            ler = scan.nextInt();
                            card.escolherAdicionalHamb(ler);
                        case 2:
                            ler = 0;
                            System.out.println("Qual deseja?");
                            ler = scan.nextInt();
                            card.escolherAdicionalBat(ler);
                        case 3:
                            ler = 0;
                            System.out.println("Qual deseja?");
                            ler = scan.nextInt();
                            card.escolherAdicionalSorv(ler);
                        case 4:
                            ler = 0;
                            System.out.println("Qual deseja?");
                            ler = scan.nextInt();
                            card.escolherAdicionalBeb(ler);
                        case 5:
                            System.out.println("Sem adicional");
                        default:
                            System.out.println("Escolha uma opção válida.");
                            ler = scan.nextInt();
                    }
                } while (ler != 1 && ler != 2 && ler != 3 && ler != 4 && ler != 5);
            } else if(ler == 2){
                System.out.println("Sem Adicional\n");
            } else {
                System.out.println("Opção Inválida.\n" +
                        "Aperte 1 ou 2");
            }
        } while(ler != 1 && ler != 2);
    }
}
