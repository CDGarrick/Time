public class TimeTest{
  public static void main(String[]args){
    Time[] times=new Time[4];
    for(int i=0;i<4;i++)
      times[i]=new Time(4,20);
    for(int i=0;i<4;i++)
      times[i].printTime();
    times[0].addMinutes(99999);
    times[1].addMinutes(30);
    times[2].addMinutes(90);
    times[3].addMinutes(4000);
    for(Time a:times)
      a.printTime();
  }
}
