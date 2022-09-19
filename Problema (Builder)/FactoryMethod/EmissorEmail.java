public class EmissorEmail implements Emissor {
  public void envia(String message){
    System.out.println("Enviando por E-Mail a mensagem: ");
    System.out.println(message);
  }
}
