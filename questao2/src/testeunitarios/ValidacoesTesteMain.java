package src.testeunitarios;
public class ValidacoesTesteMain {
    public static void main(String[] args) {
        ValidacoesTeste teste = new ValidacoesTeste();
        boolean resultado;

        resultado = teste.testeVerificarSeisCaractere();
        System.out.println("Teste de seis caracteres: " + resultado);

        resultado = teste.testeVerificarLetraMaiuscula();
        System.out.println("Teste de letras maiusculas: " + resultado);

        resultado = teste.testeVerificarLetraMinuscula();
        System.out.println("Teste de letras minusculas: " + resultado);

        resultado = teste.testeVerificarDigito();
        System.out.println("Teste de digito: " + resultado);

        resultado = teste.testeVerificarCaracterEspecial();
        System.out.println("Teste de caractere especial: " + resultado);

    }
}
