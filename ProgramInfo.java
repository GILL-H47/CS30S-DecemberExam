/********************************************************************
 * Programmer:  Harmeet Gill
 * Class:  CS30S
 *
 * Assignment: December Exam
 *
 * Description: Program info for assignment
 ***********************************************************************/

// import libraries as needed here

public class ProgramInfo{
    //*** Class Variables ***
    
    //*** Instance Variables ***
    
    private String assignmentPrinter;
    
    //*** Constructors ***
    
    /*****************************************
    * Description: Creating banner info
    *
    * 
    * 
    * ****************************************/
    public ProgramInfo(String assignmentPrinter){
        this.assignmentPrinter = assignmentPrinter;
    }
    
    //*** Getters ***
      /*****************************************
    * Description: get banner
    * 
    * 
    * 
    *  @return  String;  br
    * ****************************************/
    public String getBanner(){
        String nl = System.lineSeparator();   // line seperator
        String br;                            // variable for banner
        
        br = "*****************************" + nl;
        br += "Name:        Harmeet Gill" + nl;
        br += "Class:       CS30S" + nl;
        br += "Assignment:  December Exam Payroll" + nl;
        br += "*****************************" + nl + nl;
        
        return br;
    }// end of getBanner()
     /*****************************************
    * Description: get closing message
    * 
    * 
    * 
    *  @return  String;  closingmessage
    * ****************************************/
    
    public String getClosingMessage(){
        String closingmessage;                // variable for closing message
        String nl = System.lineSeparator();   // line seperator
        
        closingmessage = "end of processing";
        return closingmessage;
    }// end of getClosingMessage()
    
    //*** Setters ***
    
} // end of public class
