public class LSPr1{
    public static int linear(String menu[],String key){
        for(int i=0; i< menu.length ; i++){
            if(menu[i] == key){
                return i ; 
            }
        }
        return -1;
    }

    public static void main(String args[]){
        String menu[] = {"DOSA","IDLI","SAMBAAR","PANIPURI"};
        String key = "SAMBAAR";

        int index = linear(menu,key);
        if (index != -1){
            System.out.println("Menu found at index: "+ index);
        }
        else{
            System.out.println("Not found");
        }
    }
}