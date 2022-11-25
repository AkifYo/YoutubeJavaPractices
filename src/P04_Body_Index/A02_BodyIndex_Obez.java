package P04_Body_Index;

public class A02_BodyIndex_Obez {
    public static void main(String[] args) {
        double bodyIndex=A01_Body_Index_Calculate.getBodyIndex();

        if (bodyIndex<18){
            System.out.println("You are thin, you should eat more");
        } else if (bodyIndex>18&&bodyIndex<24) {
            System.out.println("You are fit to go");
        } else if (bodyIndex>24&&bodyIndex<30) {
            System.out.println("You are fat a little bit");
        } else if (bodyIndex>20&&bodyIndex<35) {
            System.out.println("You are too fat ");
        } else if (bodyIndex>35) {
            System.out.println("You can die because you are obese ");
        } else{
            System.out.println("Check out the inputs");
        }
    }
}
