class Main {
    public static void main(String[] args) {
        int[] nums = {2, -5, 3, -2, 4};
        int maxProduct = findMaxProduct(nums);
        System.out.println("Max Product: "+ maxProduct);
    }

    public static int findMaxProduct(int[] nums){
        int n = nums.length;
        int maxProduct = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            int product = 1;
            for(int j = i; j < n; j++){
                product *= nums[j];
                maxProduct = Math.max(maxProduct, product);
                System.out.println(product);
            }
            System.out.println("---");
        }

        return maxProduct;
    }
}