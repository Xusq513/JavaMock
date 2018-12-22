package com.refutrue.mock.generater;


/**
 * @Author: Michael Xu
 * @Date: 2018/12/20 19:18
 * @Description:
 */
public class DictGenerator<T> extends DictAdapter<String>{

    public static final int MAXLENGTH = 1000;

    public String generate() {
        String[] dictList = dict.dictList();
        if(dictList.length > MAXLENGTH){
            throw new RuntimeException("Dict的字典值不能超过最大长度：" + MAXLENGTH);
        }
        if(dictList != null && dictList.length > 0){
            int index = (int)(Math.random() * MAXLENGTH) % dictList.length;
            return dictList[index];
        }
        return "";
    }

}
