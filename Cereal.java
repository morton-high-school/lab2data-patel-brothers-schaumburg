import java.util.*;
import java.io.*;

public class Cereal{
  public static void main(String[] args) throws IOException
  {
    Scanner a= new Scanner(new File( "Cereal.csv"));
    String x[]=new String[20000];
    String j=a.nextLine();
    ArrayList<Cereal> y= new ArrayList<Cereal>();
    int lolol= 0;
    double rt1=0;
    int count1= 0;
    double avg1=0;
    double rt2=0;
    int count2= 0;
    double avg2=0;
    double rt3=0;
    int count3= 0;
    double avg3=0;
    while (a.hasNextLine()){
      x=a.nextLine().split(",");
      Cereal lol= new Cereal(x[0], Integer.parseInt(x[11]), Double.parseDouble(x[14]), x[1], Integer.parseInt(x[2]), Integer.parseInt(x[3]));
      y.add(lol);
      lolol++;
    }
    for (int i=0; i<lolol; i++)
    {
      if (y[i].getShelf==1)
      {
        rt1=rt1+y[i].getRating;
        count1++;
      }
      if (y[i].getShelf==2)
      {
        rt2=rt2+y[i].getRating;
        count2++;
      }
      if (y[i].getShelf==3)
      {
        rt3=rt3+y[i].getRating;
        count3++;
      }
    }
    avg1=rt1/count1;
    avg2=rt2/count2;
    avg3=rt3/count3;
    System.out.println("The average rating for shelf 1 is: " +avg1);
    System.out.println("The average rating for shelf 2 is: " +avg2);
    System.out.println("The average rating for shelf 3 is: " +avg3);
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
