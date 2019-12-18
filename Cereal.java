import java.util.*;
import java.io.*;

public class Cereal{
  public static void main(String[] args) throws IOException
  {
    Scanner a= new Scanner(new File( "Cereal.csv"));
    String x[]=new String[20000];
    String j=a.nextLine();
    ArrayList<Cereal> y= new ArrayList<Cereal>();
    while (a.hasNextLine()){
      x=a.nextLine().split(",");
      Cereal lol= new Cereal(x[0], Integer.parseInt(x[11]), Double.parseDouble(x[14]), x[1], Integer.parseInt(x[2]), Integer.parseInt(x[3]));
      y.add(lol);
    }
    System.out.println(y);
  }

  private String name;
  private int shelf;
  private double rating;
  private String type;
  private int calories;
  private int protein;
  public Cereal(String n, int s, double r, String t, int c, int p)
  {
    name=n;
    shelf=s;
    rating=r;
    type= t;
    calories=c;
    protein=p;
  }
  public String getName()
  {
    return name;
  }
  public int getShelf()
  {
    return shelf;
  }
  public double getRating()
  {
    return rating;
  }
  public String getType()
  {
    return type;
  }
  public int getCalories()
  {
    return calories;
  }
  public int getProtein()
  {
    return protein;
  }
  public String toString()
  {
    return "Name: "+name+", Shelf: "+shelf+", Rating: "+rating+", Type: "+type+", Calories: "+calories+", Protein: "+protein;
  }
}
