package group2.hremployee;
import java.util.Scanner;

public class Group2HrEmployee {

    public static void main(String[] args) {
        	Scanner read = new Scanner (System.in);
		Display ried = new Display();
		EmployList liame = new EmployList();
		
		do {
                    switch (ried.fchoice){
                        case "1" :
                            System.out.println("=Log In=");
                            
                            if ((ried.email.contains("drea@employee.hr")) && (ried.pass.contains("dreaemp"))){
                                ried.DisplayInfo(Info liame.eminfo(drea));
                            }
                            break;
                        
                        case "x" :
                            break;
                    }
		/*
		if (ried.fchoice == "1") {
			System.out.println("=Log In=");
			
			if(ried.email.contains( (CharSequence) liame.employem)) {
				
			}
			else if (ried.email.contains((CharSequence) liame.manager)) {
				
			}
			
			else {
				System.out.println("The account you entered is not on the list!");
			}
		}
		*/
		} 
		while (true);
		
    }
    
}
