package src;

public class Piramede {
    private int entrada;

    Piramede(int entrada){
        this.entrada = entrada;
    }

    public void setEntrada(int entrada) {
        this.entrada = entrada;
    }

    public void montarPiramede(){
        for(int linha = 0; linha<entrada; linha++){
            for(int space=entrada; space>linha; --space){
                System.out.print(" ");
            }

            for(int asterisc = 0; asterisc<=linha; asterisc++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}


