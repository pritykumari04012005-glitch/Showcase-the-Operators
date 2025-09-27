public class ShowCaseTheOperations {
   public static void main(String[] args) {

        var a = 10;
        var b = 2;

        System.out.println("Arithmetic operators: ");

        System.out.println("Addition (a+b):" + (a + b));
        System.out.println("Subtraction (a-b):" + (a - b));
        System.out.println("Multiplication (a * b):" + (a * b));
        System.out.println("Divided (a / b):" + (a / b));
        System.out.println("Modulus (a % b):" + (a % b));

        System.out.println("\nRelational Operators : ");
        System.out.println("Equal to (a==b): " + (a == b));
        System.out.println("Not equal to (a != b): " + (a != b));
        System.out.println("Greater than or equal to (a >= b): " + (a >= b));
        System.out.println("Less than of equal to (a <= b): " + (a <= b));
        System.out.println("Greater than (a > b): " + (a > b));
        System.out.println("Less than (a < b): " + (a < b));

        boolean x = true, y = false;
        System.out.println("\nLogical Operators: ");
        System.out.println("Logical AND (x && y): " + (x && y));
        System.out.println("Logical OR (x || y): " + (x || y));
        System.out.println("Logical NOT (!x): " + (!x));

        var c = 6;
        var d = 2;
        System.out.println("\nBitwise Operators:");
        System.out.println("Bitwise AND (c & d): " + (c & d));
        System.out.println("Bitwise OR (c | d): " + ( c | d));
        System.out.println("Bitwise XOR (c ^ d): " + ( c ^ d));
        System.out.println("Bitwise compliment (~c): " + ( ~c));
        System.out.println("left shift (c << d): " + ( c << d));
        System.out.println("right shift (c >> d): " + ( c >> d));
        System.out.println("Unsigned  right shift (c >>> d): " + ( c >>> d));


 var e = 0;
        System.out.println("\nAssignment Operators:");
        e = a;
        System.out.println("Assignment (e = a): " + (e = a));
        e += b;
        System.out.println("Add and assign (e += a): " + (e += a));
        e -= b;
        System.out.println(" Subtract and assign (e -= a): " + (e -= a));
        e *= b;
        System.out.println(" Multiply and assign(e *= a): " + (e *= a));
        e /= b;
        System.out.println("Divide and assign (e /= a): " + (e /= a));
        e %= b;
        System.out.println("Modulus and assign (e %= a): " + (e %= a));


        System.out.println("\nUnary Operators: ");
        e = +a;
        System.out.println("Unary plus: (+a): " + (+a));
        e = -a;
        System.out.println("Unary minus: (-a): " + (-a));
        e = ++a;
        System.out.println("Pre-increment (++a): " + (++a));
        e = --a;
        System.out.println("Pre-decrement (--a): " + (--a));
        e = a++;
        System.out.println("Post-increment (a++): " + (a++));
        e = a--;
        System.out.println("Post-decrement (a--): " + (a--));


        System.out.println("\nTernary Operators: ");
        String result = (a > b) ? "a is greater than b" :
                                    "a is not greater than b";
        System.out.println("Ternary (a > b) ? \"a is greater than b\" : \"a is not greater than b\" : " + result);





   }
}
