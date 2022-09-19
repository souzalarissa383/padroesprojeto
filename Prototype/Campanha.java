import java.nio.Buffer;
import java.text.SimpleDateFormat;

import com.oracle.truffle.api.impl.asm.commons.SimpleRemapper;

public class Campanha implements Prototype <Campanha>{
  private String nome; 
  private Calendar vencimento;
  private set <String> palavrasChave;

  public Campanha (String nome,Calendar vencimento,set <String> palavrasChave){
    this.nome = nome;
    this.vencimento = vencimento;
    this.palavrasChave;
  }

  public String getNome(){
    return nome;
  }

  public String getVencimento(){
    return Vencimento;
  }
  public Set<String> getPalavrasChave(){
    return palavrasChave;
  }

  public Campanha clone(){
    String nome = "Copia da campanha: " + this.nome;
    Calendar vencimento = (Calendar) this.vencimento.clone();
    Set<String> palavrasChave = new HashSet<String>(this.palavrasChave);
    Campanha campanha = new Campanha(nome,vencimento, palavrasChave);
    return campanha;
  }

  public String toString(){
    StringBuffer buffer = new stringBuffer();
    buffer.append("-----------------");
    buffer.append("\n");
    buffer.append("Nome da campanha");
    buffer.append(this.nome);
    buffer.append("\n");
  }

  SimpleDateFormat simpleDateFormat = new SimpleDateFormat ("dd/mm/yyyy");
  String format = simpleDateFormat.format(this.vencimento.getTime());
  buffer.append("vencimento: " + format);
  buffer.append("\n");

   buffer.append("Palavra-chave:  \n");
  for (String palavraChave :  this.palavrasChave){
    buffer.append("-" + palavraChave);
    buffer.append("\n");
  }
    buffer.append("-----------------");
    buffer.append("\n");

return buffer.toString();
  }
}
