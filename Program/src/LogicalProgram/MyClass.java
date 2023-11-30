package LogicalProgram;

public class MyClass {
	
    public static void main(String args[]) {
        String str="my name is abhijeet";
        
       String [] words=str.split(" ");
       
       String temp="";
       
       for(String word:words){
           
           for(int i=0;i<=word.length();i++){
               if(word.contains("name")){
                   temp=word;
                 
               }
           }
          
       }
       System.out.println(temp);
     
    }

}
