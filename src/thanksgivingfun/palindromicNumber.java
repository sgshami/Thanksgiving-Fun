/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thanksgivingfun;

/**
 *
 * @author s31011
 */
public class palindromicNumber {
    public static void main(String [] args){
        palindromicNumber pn = new palindromicNumber();
        int palindrome = 0;
        for(int i = 100; i<1000; i++){
            for(int j = 100; j<1000; j++){
                int p = i*j;
                int n;
                n = pn.reverseInt(p);
                if(n==p && p>palindrome){
                    palindrome = p;
                }
            }
        }
        System.out.println(palindrome);
    }
    public int reverseInt(int input) {
    long reversedNum = 0;
    long input_long = input;

    while (input_long != 0) {
        reversedNum = reversedNum * 10 + input_long % 10;
        input_long = input_long / 10;
    }

    if (reversedNum > Integer.MAX_VALUE || reversedNum < Integer.MIN_VALUE) {
        throw new IllegalArgumentException();
    }
    return (int) reversedNum;
}
}
