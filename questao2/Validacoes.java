

public class Validacoes {
    private String password;

    Validacoes(String password){
        this.password = password;
    }

    public boolean verificarSeisCaractere(){
        if(password.length()<6){
        System.out.println("Não tem 6 caracteres");
         return false;
       }
       return true;
     }
   
   
     public boolean verificarDigito(){
         char c;
            for (int i = 0; i < password.length(); i++){
                c = password.charAt(i);
                if(Character.isDigit(c)){
                  return true; 
                }
            }
        System.out.println("Não tem Digitos numericos");
        return false;
     }
   
     public boolean verificarLetraMaiuscula(){
      char c;
       for (int i = 0; i < password.length(); i++){
        c = password.charAt(i);
         if(Character.isUpperCase(c)){
           return true; 
         }
       }
       System.out.println("Não tem maiuscula");
       return false;
     }
   
     public boolean verificarLetraMinuscula(){
      char c;
       for (int i = 0; i < password.length(); i++){
        c = password.charAt(i);
         if(Character.isLowerCase(c)){
           return true; 
         }
       }
       System.out.println("Não tem minuscula");
       return false;
     }
   
     public boolean verificarCaracterEspecial(){
          if(password.contains("!")
            ||password.contains("@")
            ||password.contains("#")
            ||password.contains("$")
            ||password.contains("%")
            ||password.contains("^")
            ||password.contains("&")
            ||password.contains("*")
            ||password.contains("(")
            ||password.contains(")")
            ||password.contains("-")
            ||password.contains("+")
          ){
            return true; 
          }
        
       
       System.out.println("Não tem caractere especial");
       return false;
     }
}
