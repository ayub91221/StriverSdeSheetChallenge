public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};

        System.out.println(maxSubArrayON2(arr));
    }

    public static int maxSubArrayBruteForce(int[] nums)
    {
        int len = nums.length;
        int maxSum = 0;
        if(len==1)
        {
            return nums[0];
        }

        for(int i = 0; i<len; ++i)
        {
            for(int j = i; j<len; ++j)
            {
                int sum = 0;
                for(int k = i; k<=j; k++)
                {
                    sum = sum + nums[k];
                }

                if(sum>maxSum)
                {
                    maxSum = sum;
                }
            }
        }

        return maxSum;
    }

    public static int maxSubArrayON2(int[] nums)
    {
        int len = nums.length;
        int maxSum = 0;
        if(len==1)
        {
            return nums[0];
        }

        for(int i = 0; i<len; ++i)
        {
            int sum = 0;
            for(int j = i; j<len; ++j)
            {
                sum = sum + nums[j];
                if(sum>maxSum)
                {
                    maxSum = sum;
                }
            }

        }

        return maxSum;
    }
}
