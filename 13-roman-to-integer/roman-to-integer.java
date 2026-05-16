class Solution {
    public int romanToInt(String s) {
        int ans = 0;
        int num = 0;
        int next = 0;
    
    for(int i = s.length() -1; i >= 0 ; i--){ //percorrendo a string de trás para frente
        switch(s.charAt(i)){ // converte símbolo romano para número
            case 'I': num = 1; break;
            case 'V': num = 5; break;
            case 'X': num = 10; break;
            case 'L': num = 50; break;
            case 'C': num = 100; break;
            case 'D': num = 500; break;
            case 'M': num = 1000; break;
        }

        if( num < next){ ans -= num;} 
        //se o número atual for menor que o anterior, significa que ele deve ser subtraído
        else {ans += num;}
        // caso contrário, soma normalmente
        next = num;
        // atualiza o valor anterior
    }
    return ans;
    }
}