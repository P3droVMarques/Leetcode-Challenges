class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n = names.length; //Guarda o tamanho dos arrays

       Integer[] index = new Integer[n]; //preenchendo os índices
       for(int i = 0; i < n ;i++){
            index[i] = i;
       }

       Arrays.sort(index,(a,b) ->  heights[b] - heights[a]); // a e b são os indíces do array

        // heights[b] - heights[a] -> 'Compare as alturas associadas aos índices'
        // A ordem da operação é b - a pois está em ordem decrescente

       String[] result = new String[n]; // Criando array de resposta
       for(int i = 0; i < n ;i++){
            result[i] = names[index[i]];
       }

       return result;
    }
}