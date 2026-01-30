public class wrapperday4_2 {
    public static void main(String args[]){
        int i = 3;
        double d = 2.4;
        System.out.println("Integer i: " + i);
        System.out.println("Double d: " + d);
        Integer i1 = Integer.valueOf(i);
        Double d1 = Double.valueOf(d);
        System.out.println("Integer i1: " + i1);
        System.out.println("Double d1: " + d1);
        String str1 = "123";
        String str2 = "123";
        System.out.println("answer is " + (str1 + str2));
        Integer str2Int = Integer.valueOf(str2);
        System.out.println("answer is " + (str2Int + str2Int));
    }

	
}
