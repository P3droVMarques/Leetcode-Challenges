class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length; //tamanho do array
        for(int i = 0; i < n - 1; i++){ //Percorre o array do início até o penúltimo elemento.
            for (int j = i + 1; j < n; j++){ //Começa depois do i, evitando repetir pares.
                if(nums[i] + nums[j] == target){ 
                    //Se a soma dos dois números for igual ao target, ele retorna:
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
    
}