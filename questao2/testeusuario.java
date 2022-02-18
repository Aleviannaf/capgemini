public class testeusuario {
    public static void main (String[] args){
        Usuario ale = new Usuario();

        System.out.println(ale.validarSenha("aa%1Aaa")); 
        
    }
}

/*
Passos
1- Verificar se tem 6 caracteres
2- Verificar se tem no minimo 1 digito
3- verificar se tem no minino 1 letra maiuscula
4- verificar se tem no minino 1 letra minuscula
5- verificar se tem no minimo 1 caractere especial !@#$%^&*()-+

*/ 