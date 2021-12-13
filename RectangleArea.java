publi class RectangleArea{
public static void main(String[]args){
Scanner input = new Scanner(System.in);
System.out.println("the area will be shown here");
System.out.print("Enter length and breadth: ");
int length = input.nextInt();
int breadth = input.nextInt();

Area rectangleArea = new Area(length,breadth);
System.out.println("the area of the rectangle of length"+ 
  length +" and breadth of " + breadth + " is" + rectangleArea.getArea());
}
}
class Area{
int length;
int breadth;
  
  public Area(int length,int breadth){
   this.length = length;
   this.breadth = breadth;
}
public double getArea(){
  double area = length * breadth;
   return area;
}
}
