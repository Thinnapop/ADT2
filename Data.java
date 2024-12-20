import java.io.*;
import java.util.*;

    public class Data{
        public static void main(String[] args) throws FileNotFoundException{
            File f = new File("class_roaster67.csv");
            Scanner info = new Scanner(f);
            for (int i = 0; i < 7; i++) {
                info.nextLine();
            }
            Vector<Student> student = new Vector<Student>();
            while(info.hasNextLine()){
                String dataLine = info.nextLine();
                StringTokenizer stu = new StringTokenizer(dataLine.trim(),",");
                stu.nextToken();
                student.addElement(new Student(stu.nextToken() , stu.nextToken(), stu.nextToken()));
            }
            for(Student i : student){
                System.out.println(i);
               
            } 
            for(char i = 'A'; i < 'Z'; i++){
            DisplayResult(student,i);
            }
        }

            public static void DisplayResult(Vector<Student> student , char alphabet){

                int amountOfStudent = 0;
                Vector<Student> toString = new Vector<>();
                String FirstName;
                char FirstAlphabet;
                
                
                for (int i = 0; i < student.size(); i++){
                    FirstName = student.elementAt(i).getFirstName();
                    FirstAlphabet = FirstName.charAt(0);
                    

                    if(FirstAlphabet == alphabet){
                        toString.addElement(student.elementAt(i));
                        amountOfStudent++;
                    }
                }
                    System.out.println();
                    System.out.println(alphabet+": "+ amountOfStudent);

                    for(Student i : toString){
                        System.out.println(i);
                    }
                }
            }
        

