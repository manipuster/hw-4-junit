package my.triangle;

public class Triangle {

    private float a;
    private float b;
    private float c;
    public Triangle (float a, float b, float c) throws Exception {
        if(a+b <= c || a+c <= b || b+c <= a){
           throw new Exception();
        }
        this.a = a;
        this.b = b;
        this.c = c;

    }

    public float area (){
        float p = (a + b +c)/ 2;
        float s = p * (p-a) * (p-b) * (p-c);
        return (float) Math.sqrt(s);
    }
}
