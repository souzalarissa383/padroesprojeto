public class Configuracao {
  private Map<String, String> propriedades; 
  private static Configuracao instace;

  private Configuracao(){
    this.propriedades = new HashMap <String, String>();
    this.propriedades.put("time-zone", "America/Sao Paulo");
    this.propriedades.put("currency-code", "BRL");
  }
  public static configuracao getInstance(){
    if (Configuracao.instace == null){
      Configuracao.instace = Configuracao();
    }
    return Configuracao.instace;
  }
  public String getPropriedade(String nomedaPropriedade){
    return this.propriedades.get(nomeDaPropriedade);
  }
  }
