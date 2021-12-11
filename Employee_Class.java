/********************************************************************
 * Programmer:  Harmeet Gill
 * Class:  CS30S
 *
 * Assignment: December Exam Payroll
 *
 * Description: Class for Employee
 ***********************************************************************/

// import libraries as needed here

public class Employee_Class{
    //*** Class Variables ***

    private static int nextID = 1000;             // unique id
    private static double OvertimePay = 1.5;

    //*** Instance Variables ***

    private int id = 0;                           // employee id number
    private int Hours = 0;                        // number of hours worked by the employee
    private double Wage = 0.0;                    // wage of the employee  
    private double RegularPay = 0.0;              // regular pay of the employee
    private double overtimepay = 0.0;             // overtime pay for employee overtime hours
    private double TotalOtHours = 0.0;            // total overtime hours employee has worked
    private double grosspay = 0.0;                // gross pay of the employee

    //*** Constructors ***

    public Employee_Class(){
        id = nextID++;                  // set unique id of cirlce object
        // and increment nextID so the next object
        // gets a unique id number
        this.Hours = 0;              // number of hours worked by the employee
        this.Wage = 0.0;             // wage of the employee
    }// end defult/no-arg constructor 

    // full arg constructor
    public Employee_Class(int h ,double w){
        id = nextID++;

        this.Hours = h;
        this.Wage = w;
    }// end defult/no-arg constructor 

    /*****************************************
     * Description: brief description of the methods purpose
     * 
     * Interface:
     * 
     * @param        each parameter of the method should be listed with an @param
     * @param        parametername description of parameter
     * 
     * @return       any return value will be noted here
     * ****************************************/

    //*** Getters ***

    /*****************************************
     * Description: get employee id
     * 
     * Interface:
     * 
     * @return       all return value will be noted here
     * ****************************************/
    public int getId(){
        return id;
    }// end getId

    /*****************************************
     * Description: get hours employee has worked
     * 
     * Interface:
     * 
     * @return       
     * ****************************************/
    public int getHours(){
        return Hours;
    }// end getHours

    /*****************************************
     * Description: get employee wage
     * 
     * Interface:
     * 
     * @return       
     * ****************************************/
    public double getWage(){
        return Wage;
    }// end getWage

    //*** Setters ***

    /*****************************************
     * Description: set the value of the hours
     * 
     * Interface:
     * 
     * @param        int: new hours for the employee
     * ****************************************/
    public void setHours(int Hours){
        this.Hours = Hours;
    }// end setHours

    /*****************************************
     * Description: set the value of the wage
     * 
     * Interface:
     * 
     * @param        double: new wage for the employee
     * ****************************************/
    public void setWage(double Wage){
        this.Wage = Wage;
    }// end setWage

    // other methods

    //Calculations for Regular, Ovaertime, and Gross Pay
    /*****************************************
     * Description: get Regular Pay
     * 
     * Interface:
     * 
     * @return       double: Regular Pay
     * ****************************************/
    public double getRegularPay(){
        double RegularPay;
        if(Hours <= 40){
            RegularPay = Wage * Hours;
        }
        else{
            RegularPay = Wage * 40;
        }
        return RegularPay;
    }// end getReguarPay

    /*****************************************
     * Description: get Overtime pay
     * 
     * Interface:
     * 
     * @return       double: Overtime pay
     * ****************************************/
    public double getOvertimePay(){
        if(Hours > 40){
            OvertimePay = (Hours - 40) * Wage * 1.5;
        }
        else{
            OvertimePay = 0;
        }
        return OvertimePay;
    }// end getOvertimePay

    /*****************************************
     * Description: get Gross pay
     * 
     * Interface:
     * 
     * @return       double: Gross pay
     * ****************************************/
    public double getGrossPay(){
        double GrossPay;
        GrossPay = this.getRegularPay() + this.getOvertimePay();
        return GrossPay;
    }// end getGrossPay

    // to String
    /*****************************************
     * Description: over ride to string
     * 
     * Interface:
     * 
     * @return
     * ****************************************/
    @Override 
    public String toString(){

        StringBuilder st = new StringBuilder();

        st.append(String.format("%s%-5d%s%3d%11s%.2f%5s%.2f%5s%.2f%5s%.2f", "", this.getId(), " " , this.getHours()," $", this.getWage(), " $", this.getRegularPay(), " $", this.getOvertimePay(), " $",this.getGrossPay()));
        return st.toString();

    }// end of ToString 
} // end of public class
