interface Test{
    void printString(String s);
}
class HelloWorld_LambdaExpression{
    public static void main(String[] args){
        Test obj;
        //lambda expression
        obj = (s) -> System.out.println(s);

        obj.printString("Hello, World!");
    }
}
