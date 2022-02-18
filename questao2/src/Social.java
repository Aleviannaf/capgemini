package src;

public class Social {
    public static void main (String[] args){
        Usuario ale = new Usuario();
        ale.setName("Alexandre");
        System.out.println(ale.validarSenha("A1@a(v")); 
        
        Usuario Marcos = new Usuario();
        ale.setName("Marcos");
        System.out.println(Marcos.validarSenha("A123a"));  

        Usuario Eduarda = new Usuario();
        ale.setName("Eduarda");
        System.out.println(Eduarda.validarSenha("asdaff"));  
    }
}

