class Solution {
    public String intToRoman(int num) {
        int[] Num = {1000,900,500,400,100,90,50,40,10,9,5,4,1}; // valores possíveis
        String[] romanNum = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"}; // símbolos romanos correspondentes
        StringBuilder ans = new StringBuilder(); //StringBuilder -> Usado para montar a resposta

       for(int i = 0; i < Num.length; i++){
        // enquanto o número for maior ou igual ao valor atual
        while(num >= Num[i]){
            // adiciona símbolo romano
            ans.append(romanNum[i]);
            // subtrai valor do número
            num -= Num[i];
            }
       }
       // transforma StringBuilder em String
       return ans.toString();
    }
}