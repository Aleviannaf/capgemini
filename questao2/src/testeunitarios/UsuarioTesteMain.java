package src.testeunitarios;
public class UsuarioTesteMain {
    public static void main(String[] args){
        UsuarioTeste teste = new UsuarioTeste();
        boolean resultado;

        resultado = teste.testeValidarSenha();
        System.out.println("Teste de Validação de senha: " + resultado);

        resultado = teste.testeValidarRetorno();
        System.out.println("Teste de Validação de Retorno: " + resultado);
    }
}
