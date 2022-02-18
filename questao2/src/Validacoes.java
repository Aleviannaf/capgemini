package src;

public class Validacoes {
  private String password;

  public void setPassword(String password) {
    this.password = password;
  }

  public boolean verificarSeisCaractere() {
    if (password.length() < 6) {
      return false;
    }
    return true;
  }

  public boolean verificarDigito() {
    char c;
    for (int i = 0; i < password.length(); i++) {
      c = password.charAt(i);
      if (Character.isDigit(c)) {
        return true;
      }
    }
    return false;
  }

  public boolean verificarLetraMaiuscula() {
    char c;
    for (int i = 0; i < password.length(); i++) {
      c = password.charAt(i);
      if (Character.isUpperCase(c)) {
        return true;
      }
    }
    return false;
  }

  public boolean verificarLetraMinuscula() {
    char c;
    for (int i = 0; i < password.length(); i++) {
      c = password.charAt(i);
      if (Character.isLowerCase(c)) {
        return true;
      }
    }
    return false;
  }

  public boolean verificarCaracterEspecial() {
    if (password.contains("!")
        || password.contains("@")
        || password.contains("#")
        || password.contains("$")
        || password.contains("%")
        || password.contains("^")
        || password.contains("&")
        || password.contains("*")
        || password.contains("(")
        || password.contains(")")
        || password.contains("-")
        || password.contains("+")) {
      return true;
    }
    return false;
  }
}
