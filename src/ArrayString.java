public class ArrayString {

    public static void rotateRight(int[] a, int k){

        int n = a.length;

        if( n == 0){
            return;
        }
        k = k % n;

        reverse(a, 0, n - 1);
        reverse(a, 0, k - 1);
        reverse(a, k, n - 1);
    }

    private static void reverse(int[] a, int left, int right){
        while(left < right){
            int temp = a[left];
            a[left] = a[right];
            a[right] = temp;

            left++;
            right--;
        }
    }

    public static boolean isAnagram(String a, String b){

        if(a == null || b == null || a.length() != b.length()){
            return false;
        }
        int[] frequency = new int[Character.MAX_VALUE +1];

        for(int i = 0; i < a.length(); i++){
            frequency[a.charAt(i)]++;
            frequency[b.charAt(i)]--;
        }
        for( int count : frequency){
            if(count != 0){
                return false;
            }
        }
        return true;
    }
    public static int[] twoSumSorted(int[] a, int target){
        int left = 0;
        int right = a.length - 1;

        while(left < right){
            long sum = (long) a[left] + a[right];

            if(sum == target){
                return new int[]{left, right};
            }
            else if(sum <target){
                left++;
            }else{
                right--;
            }
        }
        return new int[]{-1, -1};
    }
}
