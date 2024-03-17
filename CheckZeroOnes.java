public class CheckZeroOnes {
    public static boolean checkZeroOnes(String s) {
        int counter1 = 1;
        int counter0 = 1;
        int max1 = 0;
        int max0 = 0;
        int i = 0;
        for(i=0; i<s.length()-1; i++){
            if(s.charAt(i) == s.charAt(i+1) && s.charAt(i)=='1'){
                counter1++;
            }else if(s.charAt(i) == s.charAt(i+1) && s.charAt(i)=='0'){
                counter0++;
            }else{
                if(counter1 > max1){
                    max1 = counter1;
                }
                if(counter0 > max0){
                    max0 = counter0;
                }
                counter1 = 1;
                counter0 = 1;
            }
        }
        max1 = Math.max(counter1, max1);
        max0 = Math.max(counter0, max0);
        return counter1>counter0;
    }

    public static void main(String[] args) {
        System.out.println(checkZeroOnes("0001100010001111001111010110101111011010"));
    }
}
