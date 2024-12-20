public class Student {
        private String SID;
        private String FirstName;
        private String LastName;
    
        public Student(){
    
        }
        public Student(String SID, String FirstName, String LastName){
            this.SID = SID;
            this.FirstName = FirstName;
            this.LastName = LastName;
        }
        public String getFirstName(){
            return FirstName;
        }
        public String getLastName(){
            return LastName;
        }
        public String getSID(){
            return SID;
        }
        @Override
        public String toString(){
            return SID + " " + FirstName + " " + LastName;
        }
}
