import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int[] Tsal = new int[4];
    int[] empID = {1,2,3,4};
    String[] empName = {"A","B","C","D"};
    String[] empDes = {"Junior","Team Leader","Manager","CO"};
    int[] basic = {10000,20000,70000,104000};
    int[] hra = {1000,4000,7000,14000};
    int[] it = {500,4000,8000,12000};
    
    for(int i = 0; i<4; i++)
    {
    Tsal[i] = basic[i] + hra[i] - it[i]; 
    }
    System.out.println("Enter Employee ID (101,102,103,104)");
    Scanner sc = new Scanner(System.in);
    try{
    int c = sc.nextInt();
    
switch(c) {
      case 1:
        System.out.printf("%-5s %-10s %-15s %-10s\n", "ID", "Name", "Designation", "Salary");
        System.out.printf("%-5d %-10s %-15s %-10d\n", empID[0], empName[0], empDes[0], Tsal[0]);
        break;
      case 2:
        System.out.printf("%-5s %-10s %-15s %-10s\n", "ID", "Name", "Designation", "Salary");
        System.out.printf("%-5d %-10s %-15s %-10d\n", empID[1], empName[1], empDes[1], Tsal[1]);
        break;
      case 3:
        System.out.printf("%-5s %-10s %-15s %-10s\n", "ID", "Name", "Designation", "Salary");
        System.out.printf("%-5d %-10s %-15s %-10d\n", empID[2], empName[2], empDes[2], Tsal[2]);
        break;
      case 4:
        System.out.printf("%-5s %-10s %-15s %-10s\n", "ID", "Name", "Designation", "Salary");
        System.out.printf("%-5d %-10s %-15s %-10d\n", empID[3], empName[3], empDes[3], Tsal[3]);
        break;
      default:
        System.out.println("Wrong Input");
        break;
    }
  }finally{
    sc.close();
  }
  }
}