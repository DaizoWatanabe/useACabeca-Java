public class Dragon extends Monster {
    @Override
    boolean frighten(int degree) {
        System.out.println("breath fire");
        return true;
    }
    
}