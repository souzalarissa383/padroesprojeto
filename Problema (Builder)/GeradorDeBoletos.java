import java.util.Calendar;

public class GeradorDeBoletos{
  private BoletoBuilder boletoBuilder;

  public GeradorDeBoletos(BoletoBuilder boletoBuilder){
    this.boletoBuilder = boletoBuilder;
  }

  public Boleto gerarBoleto(){
    this.boletoBuilder.buildSacado("Marcelo Martins");
    this.boletoBuilder.buildCedente("K19 Treinamentos");
    this.boletoBuilder.buildValor("100.54");

    Calendar vencimento = Calendar.getInstance();
    vencimento.add(Calendar.DATE,30);
    this.boletoBuilder.buildVencimento(vencimento);

    this.boletoBuilder.buildNossoNumeto(1234);

    Boleto boleto = boletoBuilder.getBoleto();

    return boleto;
  }
}
