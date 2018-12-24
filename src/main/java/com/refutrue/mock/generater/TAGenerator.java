package com.refutrue.mock.generater;

/**
 * @Author: Michael Xu
 * @Date: 2018/12/19 14:33
 * @Description:
 */
public class TAGenerator extends RandomAdapter{

    public static int number = 1;

    @Override
    public Object generate() {
        StringBuilder sb = new StringBuilder();
        sb.append("TA");
        String appandStr = String.valueOf(number);
        for(int i=0;i<10-appandStr.length();i++){
            sb.append("0");
        }
        sb.append(appandStr);
        number ++;
        if(number > random.length()){
            number = 1;
        }
        return sb.toString();
    }
}
