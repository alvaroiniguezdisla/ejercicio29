package org.example;

public class ej29 {
    public int sumannumeros(int n) throws IllegalArgumentException{
        int num=0;
        if (n <= 0) {
            throw new IllegalArgumentException("n tiene que ser mayor que  0");
        }else{
            for(int i=0;i<=n;i++){
                num=num+i;
            }

        }
        return num;
    }
}
