import java.util.Scanner;
import javax.swing.*;
import java.io.*;
import java.text.NumberFormat;
import java.util.ArrayList;
/** ***************************************************
 *  Name:           Harmeet Gill
 *  Class:          CS30S
 * 
 *  Assignment:     December Exam Payroll
 * 
 *  Description:    Place a short description of your program here
 * 
 *************************************************************/

public class Employee_Driver {

    public static void main(String[] args) throws IOException{
        // ***** constants *******

        // ***** variables *****

        String banner = "";             // output banner
        String prompt = "";             // prompt for user input

        String strin = "";              // string fro keyboard input
        String strout = "";             // string for formatted output

        String delim = "[ ]+";          // delimiter for splitting input records
        String[] tokens = null;         // used to split input records

        // a new line character that works on every computer system
        String nl = System.lineSeparator();

        // ***** objects *****

        ArrayList<Employee_Class> Employees = new ArrayList<>();

        //Scanner scanner = new Scanner(System.in);
        //NumberFormat currency = NumberFormat.getCurrencyInstance();

        // file io buffers for reading and writing to text files

        BufferedReader fin = new BufferedReader(new FileReader("EmployeeDecemberExamData.txt"));
        //PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("outfle.txt")));

        // ***** print banners *****

        banner = "*****************************" + nl;
        banner += "Name:        Harmeet Gill" + nl;
        banner += "Class:       CS30S" + nl;
        banner += "Assignment:  December Exam Payroll" + nl;
        banner += "*****************************" + nl + nl;

        System.out.println(banner);
        //fout.print(banner);

        // ***** Get Input *****

        // prompt for input
        // read input from keyboard
        // echo input back to console window

        // ***** Main Processing *****

        // employee with array list
        Employees.add(new Employee_Class(35,12.50));
        Employees.add(new Employee_Class(40,17.25));
        Employees.add(new Employee_Class(45,12.50));
        Employees.add(new Employee_Class(40,25.00));
        Employees.add(new Employee_Class(46,20.00));
        Employees.add(new Employee_Class(21,18.75));
        Employees.add(new Employee_Class(48,15.50));
        Employees.add(new Employee_Class(40,32.75));
        Employees.add(new Employee_Class(41,30.00));
        System.out.println("ID: Hours: Wage: Regular Pay: Overtime Pay: Gross Pay:");

        // for loop for printing the employees payrolls
        for(Employee_Class emp: Employees){
            System.out.println(emp.toString());
        }// end for
        
        // setters to change the value
        Employees.get(1).setHours(34);
        Employees.get(1).setWage(20.50);

        // getters to print the employees
        System.out.println(nl + "Here are some employees printed using getters");
        System.out.println(Employees.get(1).getId());
        System.out.println(Employees.get(1).getHours());
        System.out.println(Employees.get(1).getWage());
        System.out.println(Employees.get(1).getRegularPay());
        System.out.println(Employees.get(1).getOvertimePay());
        System.out.println(Employees.get(1).getGrossPay());

        // removing employees from the payroll
        System.out.println(nl + "Employee:" + Employees.get(0).getId() + " Removed from the Payroll");
        System.out.println(Employees.remove(0) + nl);

        // printing the employee rayrolls again
        System.out.println("ID: Hours: Wage: Regular Pay: Overtime Pay: Gross Pay:");
        for(Employee_Class e: Employees){
            System.out.println(e.toString());
        } // end for 
        // ***** Print Formatted Output *****

        // ***** Closing Message *****

        System.out.println();
        System.out.println("end of processing");
        //fout.println("End of Processing");

        // **** close io buffers *****

        //fin.close();
        //fout.close();
    } // end main 

} // end FormatTemplate
