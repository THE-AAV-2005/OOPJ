public class StringExample
{
public static void main(String args[])
 {
 String s1="java";//creating string by Java string literal
 char ch[]={'s','t','r','i','n','g','s'};
 String s2=new String(ch);//converting char array to string
 String s3=new String("example");//creating Java string by new keyword
 System.out.println(s1);
 System.out.println(s2);
 System.out.println(s3);
 StringOperation s = new StringOperation();
 s.Compare();
 s.Reverse(); 
 }
}

class StringOperation
{
 String str1 = "apple";
String str2 = "banana";
public void Compare()
{ 
 int result = str1.compareTo(str2);

 if (result == 0) {
    System.out.println("The strings are equal.");
 } else if (result < 0) {
    System.out.println("str1 is lexicographically smaller than str2.");
 } else {
    System.out.println("str1 is lexicographically larger than str2.");
 }
}
public void Reverse()
{
 String str = "hello";
 String reversedStr = new StringBuilder(str).reverse().toString();
 System.out.println(reversedStr);  // Output: "olleh"
}
}