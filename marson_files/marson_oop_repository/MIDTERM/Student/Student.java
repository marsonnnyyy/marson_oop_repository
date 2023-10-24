package Student;

class Student {
   String first_name = " ";
   String middle_name = " ";
   String last_name = " ";
   String suffix = " ";
   
   //getter
   
   public Student(){
   }
   
   public String getFirstName () {
      return first_name; 
   }
   
   public String getMiddleName () {
      return middle_name;
   }

   public String getLastName () {
      return last_name;
   }

   public String getSuffix () {
      return suffix;
   }
   
    //custom
   
   public String getFullName(){
      return first_name+ " " + middle_name + " " + last_name + " " + suffix+ ".";
   }
   
   //setters
      
   public void setFirstName(String fName){
      first_name = fName;
   }
   
   public void setMiddleName(String mName){
      middle_name = mName;
   }
   
   public void setLastName(String lName){
      last_name = lName;
   }
   
   public void setSuffix(String sfName){
      suffix = sfName;
   }
}