import java.util.Scanner;
public class index {
    public static void main(String[] args)
    {
        Scanner linha = new Scanner (System.in);
        boolean foiAoMercado;
        String lista = "Sua lista é:";

        System.out.println("Instruções:");
        System.out.println("Responda as perguntas com Sim (true), ou Não (false)");
        System.out.println("Você foi ao mercado?");
        foiAoMercado = linha.nextBoolean();
        if (!foiAoMercado) {
            System.out.println("Então não tem lista de compra");
        }

            else if (foiAoMercado){
                System.out.println("Insira seus Itens Comprados,sem espaço"); {
                    lista = linha.next();

                    System.out.println("Sua lista de compras :) " + lista);
                }
        }
    }
}
