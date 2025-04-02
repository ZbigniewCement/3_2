public class Main {
    public static void main(String[] args) {
                
    for (int z = 0; z < 3; z++) {
        int gwiazdki = 7;
        int y = (gwiazdki+1)/2;
        for (int i = 0; i < y; i++) {  
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < gwiazdki; k++) {
                System.out.print("*");
            }
            System.out.println();

            gwiazdki -= 2;
            }
        }     
    }   
}