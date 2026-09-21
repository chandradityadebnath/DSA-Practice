public class Declaration_Initialization {
    public static void main(String[] args) {
        
        int[] scores = new int[4];
        
        scores[0] = 95;
        scores[1] = 88;
        scores[2] = 72;
        scores[3] = 91;
        
        System.out.print("Array format: [");
        
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i]);
            
            // Add a comma and space for all elements except the last one
            if (i < scores.length - 1) {
                System.out.print(", ");
            }
        }
        
        System.out.println("]");
    }
}
