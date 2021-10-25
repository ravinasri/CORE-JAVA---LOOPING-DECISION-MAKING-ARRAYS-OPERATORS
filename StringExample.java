public class StringExample
{
public static void main(String args[])
{
String s = " Hi babe,How are you ";String s2= "Ravina";String s3 = "RavinA";String s4 = "chinna";
String s5 = "streo";
boolean result = s2 == s3;
System.out.println("charAt:"+s.charAt(15));//returns the character located at specified index
System.out.println("length:"+s.length());//length of stringSystem.out.println("concat1:"+s+" "+s2);//joining 2 stringsSystem.out.println("concat2:"+s.concat(" ").concat(s2));//joining 2 stringsSystem.out.println("Equals:"+s2.equals(s3));//compare string and return true or falseSystem.out.println("Equals:"+!s2.equals(s3));//not equal to in stringSystem.out.println("Equals:"+"Ravina".equals(s3));System.out.println("Equals:"+!"Ravina".equals(s3));System.out.println("EqualsIgnoreCase:"+s2.equalsIgnoreCase(s3));//equalsignorecase-compare the stringsSystem.out.println("Startswith:"+s2.startsWith("Rav"));
System.out.println("endswith:"+s2.endsWith("na"));
System.out.println("compareTo:"+s2.compareTo(s3));
System.out.println("compareToIgnoreCase:"+s2.compareToIgnoreCase(s3));
System.out.println("==:"+result);
System.out.println("hashCode:"+s2.hashCode());
System.out.println("hashCode:"+s3.hashCode());
System.out.println("trim:"+s.trim());
System.out.println("trim:"+s);
System.out.println("lowercase:"+s2.toLowerCase());
System.out.println("lowercase:"+s2.toUpperCase());
System.out.println("contains:"+s2.contains("Rav"));
//Array lengthint[] a = new int[2];
a[0]=0;
a[1]=1;
System.out.println("Array length:"+a.length);

}
}