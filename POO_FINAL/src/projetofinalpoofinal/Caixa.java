package projetofinalpoofinal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Caixa {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Registradora registradora = new Registradora();
        while (true) {
            System.out.println("(1) – inicia venda (2) - encerra o aplicativo");
            int op =0;
            try{
                op = leia.nextInt();
            }catch(InputMismatchException err){
                System.out.println("Opcao invalida, por favor informe uma opcao valida\n\n");
                Caixa.main(args);
                break;
            }
            if (op == 2) {
                break;
            }

            // Inicia a venda
            registradora.iniciarVenda();
            submenu:
            while (true) {
                System.out.println("(1) - inclui item na venda (2) - Valor total (3) - Concluir venda");
                try{
                    op = leia.nextInt();
                }catch(InputMismatchException err){
                    System.out.println("Opcao invalida, por favor informe uma opcao valida\n\n");
                    break submenu;
                }
                if (op == 1) {
                    System.out.println("digite o codigo do produto");
                    int id = leia.nextInt();
                    System.out.println("digite a quantidade de produto");
                    int qtd = leia.nextInt();
                    registradora.incluirItem(id, qtd);
                } else if (op == 2) {
                    System.out.println(registradora.concluirVenda());
                } else if (op == 3) {
                    System.out.println("digite o pagamento");

                    double pagamento = leia.nextDouble();
                    System.out.println("Pago: " + pagamento);
                    registradora.efetuarPagamento(pagamento);

                    System.out.printf("TROCO: %.2f\n", registradora.getTroco());
                    break;
                }else{
                    System.out.println("Opcao incorreta tente novamente: \n\n");
                }
            }

        }
    }

}
