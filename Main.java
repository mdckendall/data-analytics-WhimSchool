import java.io.FileReader;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;

class Main {
	public static void main(String[] args) throws FileNotFoundException {

		ArrayList<String> arrayList = new ArrayList<>();
		FileReader fr = new FileReader("names.txt");
		Scanner fileScanner = new Scanner(fr);
    Scanner input = new Scanner(System.in);
    
    Menu(input, fileScanner);

    input.close();
    fileScanner.close();
  }

  static void outputSalary(){
    System.out.println("$98,345 average salary in South Florida!");
  }
  
  static void outputJob(){
    System.out.println("US News - 100 Best Jobs!");
  }
  
  static void outputDemand(){
    System.out.println("Top 10 Forbes In-Demand Jobs!");
  }
  
  static void outputStudents(Scanner fileScanner){
    System.out.println("Current Students:");
    while (fileScanner.hasNext()){
      System.out.println(fileScanner.nextLine());
    }
  }
  
  static void Menu(Scanner input, Scanner fileScanner){
  
    System.out.println("Press 1 to learn about salary.");
    System.out.println("Press 2 to learn about the job.");
    System.out.println("Press 3 to learn about demand.");
    System.out.println("Press 4 to view current students.");
    System.out.println("Press 5 to quit.");
    int choice = input.nextInt();
    
    switch(choice){
      case 1:
        outputSalary();
        Menu(input, fileScanner);
        break;
    
      case 2:
        outputJob();
        Menu(input, fileScanner);
        break;
    
      case 3:
        outputDemand();
        Menu(input, fileScanner);
        break;
    
      case 4:
        outputStudents(fileScanner);
        Menu(input, fileScanner);
        break;
    
      case 5:
        return;
    }
  }
}

