public class Main {
    public static void main(String[] args) {
        BmiService service= new BmiService ();
        float heigth = 180;
        int weigth =70;

        float result = service.calculate( heigth, weigth );
        System.out.println("ИМТ равен : " + result );
    }
}
