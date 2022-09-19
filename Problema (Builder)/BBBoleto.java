import java.text.SimpleDateFormat;

public class BBBoleto implements Boletos{
  private String sacado;
  private String cedente;
  private double valor; 
  private Calendar vencimento;
  private int nossoNumero;
  public BBBoleto (String sacado,String cedente,double valor,Calendar vencimento,int nossoNumero){
    this.sacado = sacado;
    this.cedente = cedente;
    this.valor = valor;
    this.vencimento = vencimento;
  }

  public String getSacado(){
    return this.sacado;
  }

  public String getCedente(){
    return this.cedente;
  }

  public double getValor(){
    return this.valor;
  }

  public Calendar getVencimento (){
    return this.vencimento;
  }

  public int getNossoNumero() {
    return this.nossoNumero;
}
  public String toString(){
    StringBuilder stringBuilder = new stringBuilder();
    stringBuilder.append("Boleto BB");
    stringBuilder.append("\n");

    stringBuilder.append("Sacado: " + this.sacado);
    stringBuilder.append("\n");

    stringBuilder.append("cedente: " + this.cedente);
    stringBuilder.append("\n");

    stringBuilder.append("Valor: " + this.valor);
    stringBuilder.append("\n");

    stringBuilder.append("Vencimento: " + this.vencimento);
    stringBuilder.append("\n");

    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/mm/yyyy");
    String format = simpleDateFormat.format(this.vencimento.getTime());
    stringBuilder.append("vencimento: " + format);
    stringBuilder.append("\n");

    stringBuilder.append("Nosso numero: " + this.nossoNumero);
    stringBuilder.append("\n");

    return stringBuilder.toString();

    
  }
}
  
