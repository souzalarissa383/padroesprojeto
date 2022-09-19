public class TesteSingleton {
    public static void main(String[] args) {
      Configuracao configuracao = Configuracao.getInstance();
      System.out.println(configucao.getPropriedade("time-zone"));
      System.out.println(configucao.getPropriedade("currency-code"));
    }
}
