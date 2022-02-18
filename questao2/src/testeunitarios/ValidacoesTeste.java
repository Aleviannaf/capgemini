package src.testeunitarios;

import src.Validacoes;


public class ValidacoesTeste {
    Validacoes teste1 = new Validacoes();
    Validacoes teste2 = new Validacoes();
    Validacoes teste3 = new Validacoes();

    public boolean testeVerificarSeisCaractere() {
        teste1.setPassword("asdfgas");
        teste2.setPassword("ASJFGAGJDa");
        teste3.setPassword("12$a42635");
        boolean resultadoEsperado = true;

        if (resultadoEsperado == !(teste1.verificarSeisCaractere()
                && teste2.verificarSeisCaractere()
                && teste3.verificarSeisCaractere())) {
            return false;
        }
        return true;
    }

    public boolean testeVerificarLetraMaiuscula() {
        teste1.setPassword("MAHDGAF");
        teste2.setPassword("asdafadaA");
        teste3.setPassword("12$A384");
        boolean resultadoEsperado = true;

        if (resultadoEsperado == !(teste1.verificarLetraMaiuscula()
                && teste2.verificarLetraMaiuscula()
                && teste3.verificarLetraMaiuscula())) {
            return false;
        }
        return true;
    }

    public boolean testeVerificarLetraMinuscula() {
        teste1.setPassword("asdfgvh");
        teste2.setPassword("ASJFGAGaJD");
        teste3.setPassword("12$a42635");
        boolean resultadoEsperado = true;

        if (resultadoEsperado == !(teste1.verificarLetraMinuscula()
                && teste2.verificarLetraMinuscula()
                && teste3.verificarLetraMinuscula())) {
            return false;
        }
        return true;
    }

    public boolean testeVerificarDigito() {
        teste1.setPassword("asdfgvh1");
        teste2.setPassword("12345");
        teste3.setPassword("12$a42635");
        boolean resultadoEsperado = true;

        if (resultadoEsperado == !(teste1.verificarDigito()
                && teste2.verificarDigito()
                && teste3.verificarDigito())) {
            return false;
        }
        return true;
    }

    public boolean testeVerificarCaracterEspecial() {
        teste1.setPassword("!@#$%^&*()-+");
        teste2.setPassword("ASJFGAGJ(Da");
        teste3.setPassword("12$a4263+5");
        boolean resultadoEsperado = true;

        if (resultadoEsperado == !(teste1.verificarCaracterEspecial()
                && teste2.verificarCaracterEspecial()
                && teste3.verificarCaracterEspecial())) {
            return false;
        }
        return true;
    }
}
