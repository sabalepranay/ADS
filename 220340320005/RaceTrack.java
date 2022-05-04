

class Car
{
  private int year;
  private String make;
  private double speed=0;
 

public Car( int year ,String make, double speed)
  {
   this.year=year;
   this.make=make;
   this.speed=speed;
   }
  
  public int getyear(){
  return this.year;
  }
  public String getmake(){
  return this.make;
  }
  public double getspeed(){
  return this.speed;
  }

public void accelerate()
 {
 
  speed=speed+1;
  }

}


class RaceTrack
{

public static void main(String[] args)
{
   Car c1 =new Car(2010,"porsche",25.0);
 System.out.println("year model of car= "+c1.getyear());
 System.out.println("make of the car= "+c1.getmake());
 System.out.println("current speed of the car= "+c1.getspeed());
 c1.accelerate();
 System.out.println("Speed of the car after accelerate= "+c1.getspeed());
}
}