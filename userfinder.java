import java.util.ArrayList;
public class userfinder{
    public static void main(String[] args) {
        ArrayList <String> users=new ArrayList<>();
        users.add("arya");
        users.add("john");
        users.add("sansa"); 

        String[] serStrings={"arya","catlyn","ned","bran","sansa"};
        for (String serString:serStrings){
            if(users.contains(serString)){
                System.out.println(serString+" found");
            }else{
                System.out.println(serString+" not found");
            }
        }   
    }
}
