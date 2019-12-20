import java.util.*;
import java.io.*;

public class Car{
  public static void main(String [] args) throws IOException
  {
    Scanner a= new Scanner(new File( "nurburgring.csv"));
    String x[]=new String[20000];
    String j=a.nextLine();
    int lolol=0;
    int count=0;
    int posCount=0;
    ArrayList<Car> z= new ArrayList<Car>();
    while (a.hasNextLine()){
      x=a.nextLine().split(",");
      Car lol = new Car(Integer.parseInt(x[0]), Integer.parseInt(x[1]), x[2], x[3], x[4]);
      z.add(lol);
      lolol++;
    }
    for(int i=0; i<lolol; i++)
    {
      if(z.get(i).getMake().equals("Ferrari"))
      {
        count++;
        posCount=posCount+z.get(i).getPosition();
      }
    }
    System.out.println("Ferrari has an average position of "+posCount/count+".");
  }
  private int position;
  private int year;
  private String make;
  private String model;
  private String time;

  public Car(int p, int y, String m, String mo, String t)
  {
    position = p;
    year=y;
    make= m;
    model=mo;
    time=t;
  }

  public int getPosition()
  {
    return position;
  }
  public int getyear()
  {
    return year;
  }
  public String getMake()
  {
    return make;
  }
  public String getModel()
  {
    return model;
  }
  public String getTime()
  {
    return time;
  }
  public String toString()
  {
    return "Position: "+position+", Year: "+year+", Make: "+make+", Model: "+model+", Time: "+time;
  }
}
