public class BmiService {
    public float calculate (float height, int weight) {
        float result ;
        result = weight / ((height /100) * (height / 100));
        return result ;

    }
}
