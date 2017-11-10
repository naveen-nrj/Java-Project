package StudentDiary;
import java.util.Scanner;

public class Hostel {
    String hostelName;
    int roomNo;
    public void addRecords(){
        Scanner s = new Scanner(System.in);
        System.out.println("Hostel name:");
        hostelName = s.next();
        System.out.println("Room number?");
        roomNo = s.nextInt();
    }
    public void setHostel(String h){
        hostelName = h;
    }
    public void setRoomNo(int r){
        roomNo = r;
    }
  
    public void print(){
        System.out.println(hostelName + roomNo);
    }
}
