import java.util.Random;
  
public class Jar {
  private int maxItems;
  private String itemName;
  
  public Jar(String itemName, int maxItems){
    this.itemName = itemName;
    this.maxItems = maxItems;
  }
  
  public int randomFiller(){
    Random random = new Random();
    int fillNum = random.nextInt(maxItems) + 1;
    return fillNum;
  }
}