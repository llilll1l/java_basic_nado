package chap_09;

public class _01_Generics {
    public static void main(String[] args) {
        //제네릭스 : 다양한 타입의 객체를 지원하는 클래스나 인터페이스 또는 메소드를 정의하는 방법, 여러타입에 대해 지원한다.(여러번 정의하는것을 막음)
        //제네릭스에서 지원하는것은 객체, 기본자료형은 제네릭스 타입으로 바로 사용할수었다(사용하려면 wrapper 클래스를 이용해라)

        //int[] iArray = {1,2,3,4,5};
        //double[] dArray = {1.0, 2.0, 3.0, 4.0, 5.0};

        Integer[] iArray = {1,2,3,4,5};     //Integer는 wrapper class
        Double[] dArray = {1.0, 2.0, 3.0, 4.0, 5.0}; //Double은 wrapper class
        String[] sArray = {"A", "B", "C", "D", "E"};

        printIntArray(iArray); //메소드 정의 하려면 클릭하고 alt + enter 하면 자동으로 만들어 주겠다고 나옴
        printDoubleArray(dArray);
        printStrArray(sArray);

        System.out.println("----------------------");

        printAnyArray(iArray);
        printAnyArray(dArray);
        printAnyArray(sArray);

    }

    //제네릭스를 이용하는 메소드를 만들어보자.. 서로 다른 타입의 데이터가 들어와도 다 처리를 할 수 있어야 한다.
    //T는 type을 뜻한다. T말고 <teacher> 등 사용해도 됨..!
    //T : Type, K : Key, V : Value, E: Element 등등 여러 가지로 정의 할 수 있다.
    private static <T> void printAnyArray(T[] array) { //any type array를 받을 수 있다.
        for (T t : array) {
            System.out.print(t + " ");
        }
        System.out.println();
    }



    //아래는 하나의 타입만 지원하는 메소드.. 제네릭스 실습이 아님

    private static void printStrArray(String[] sArray) {
        for (String s : sArray) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    private static void printDoubleArray(Double[] dArray) {
        for (double d : dArray) {
            System.out.print(d + " ");
        }
        System.out.println();
    }

    private static void printIntArray(Integer[] iArray) {
        for (int i : iArray) {
            System.out.print(i + " "); //1 2 3 4 5
        }
        System.out.println();
    }
}
