import java.util.Arrays;

public class SearchInStrings {
    public static void main(String[] args){
        String name = "Siya";
        char target = 'a';
        //System.out.println(serach2(name,target));
        System.out.println(Arrays.toString(name.toCharArray()));
    }
    /*static boolean serach(String str, char target){
        if(str.length() == 0){
            return false;
        }

        for(int i = 0; i < str.length(); i++){
            if(target == str.charAt(i)){
                return true;
            }
        }*/

    static boolean serach2(String str, char target){
        if(str.length() == 0){
            return false;
        }

        for (char ch : str.toCharArray()){
            if(ch == target){
                return true;
            }
        }
        return false;
    }
}
