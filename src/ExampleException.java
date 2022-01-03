public class ExampleException {

    void simpleException(){
        try {
            int a = 1;
            int b = 1;
            int divide = b / a;
            System.out.println("ans:" + divide);
            System.out.println("Successful");
        }catch (ArithmeticException e){
            System.out.println(e);
        }finally {
            System.out.println("finished");
        }
    }
}
