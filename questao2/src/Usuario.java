package src;

public class Usuario {
    private String name;
    private String password;


  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  public String getPassword() {
    return password;
  }
  private void setPassword(String senha){
      this.password = senha;
  }

    
  public String validarSenha(String senha){
    int digitosFaltantes = 0;
    Validacoes validou = new Validacoes();
    validou.setPassword(senha);
    
    digitosFaltantes = validou.verificarSeisCaractere() ? digitosFaltantes : ++digitosFaltantes;
    digitosFaltantes = validou.verificarDigito() ? digitosFaltantes : ++digitosFaltantes;
    digitosFaltantes = validou.verificarLetraMaiuscula() ? digitosFaltantes : ++digitosFaltantes;
    digitosFaltantes = validou.verificarLetraMinuscula() ? digitosFaltantes : ++digitosFaltantes;
    digitosFaltantes = validou.verificarCaracterEspecial() ? digitosFaltantes : ++digitosFaltantes;
    
    if(digitosFaltantes == 0){
      setPassword(senha);
      System.out.println("successful operation");
    }
    return Integer.toString(digitosFaltantes);
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

/*# Questão 02

Débora se inscreveu em uma rede social para se manter em contato com seus amigos. 
A página de cadastro exigia o preenchimento dos campos de nome e senha, 
porém a senha precisa ser forte. O site considera uma senha forte quando 
ela satisfaz os seguintes critérios:
Possui no mínimo 6 caracteres.
Contém no mínimo 1 digito.
Contém no mínimo 1 letra em minúsculo.
Contém no mínimo 1 letra em maiúsculo.
Contém no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+
*/
