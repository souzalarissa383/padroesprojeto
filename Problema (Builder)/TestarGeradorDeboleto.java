public class TestarGeradorDeBoleto{
  public static void main(String[] args) {
    Boletobuilder boletoBuilder = new BBBoletoBuilder();
    GeradorDeBoletos geradorDeBoletos = new GeradorDeBoletos(boletoBuilder);

    Boleto boleto = geradorDeBoletos.gerarBoleto();
    System.out.println(boleto);
  }

}
