import java.util.Calendar;

public class TestaProtype {
    public static void main(String[] args) {
      String nome = "K19"

      Calendar vencimento = Calendar.getInstance();
      vencimento.add(Calendar, DATE,30);
      Set <String>  = new HashSet<String>();

      hashSet.add("curso");
      hashSet.add("java");
      hashSet.add("K19");

      Campanha campanha = new Campanha (nome, vencimento, hashSet);
      System.out.println(campanha);

      Campanha clone = campanha.clone();
      System.out.println(clone);
      
      
    }

}
