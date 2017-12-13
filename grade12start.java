import arc.*;
import java.awt.*;

public class grade12start{
  public static void main(String[] args){
    Console con = new Console(1280,720);
      con.setTextColor(Color.GREEN);
      Font myfont;
      myfont = con.loadFont("Avara.ttf",45);
      con.setTextFont(myfont);
    con.println("What is your name?");
    String strName;
    strName = con.readLine();
    con.println("My name is "+strName);
    con.println("Kappa");
    con.println("haHA im 12 btw");
    con.setDrawColor(new Color(123,64,23));
    con.fillOval(40,40,80,120);
  }
}