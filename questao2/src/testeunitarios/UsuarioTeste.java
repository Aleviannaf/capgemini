package src.testeunitarios;

import src.Usuario;

public class UsuarioTeste {
    Usuario cliente = new Usuario();

    public boolean testeValidarSenha() {
        int resultEsperado = 0;
        int caso1 = Integer.parseInt(cliente.validarSenha("asd!1A"));
        int caso2 = Integer.parseInt(cliente.validarSenha("as2@Sf"));
        int caso3 = Integer.parseInt(cliente.validarSenha("123#Ab"));

        if (!(resultEsperado == caso1
                && resultEsperado == caso2
                && resultEsperado == caso3)) {
            return false;
        }
        return true;
    }

    public boolean testeValidarRetorno() {
        int resultEsperado1 = 2;
        int resultEsperado2 = 4;
        int resultEsperado3 = 5;
        int caso1 = Integer.parseInt(cliente.validarSenha("asd!1"));
        int caso2 = Integer.parseInt(cliente.validarSenha("assf"));
        int caso3 = Integer.parseInt(cliente.validarSenha(""));

        if (!(resultEsperado1 == caso1
                && resultEsperado2 == caso2
                && resultEsperado3 == caso3)) {
            return false;
        }
        return true;
    }

}
