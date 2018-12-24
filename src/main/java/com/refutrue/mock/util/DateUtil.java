package com.refutrue.mock.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: Michael Xu
 * @Date: 2018/12/20 19:45
 * @Description:
 */
public class DateUtil {

    /**
     * 把符合日期格式的字符串转换为日期类型
     *
     * @param dateStr
     * @return
     */
    public static java.util.Date stringtoDate(String dateStr, String format) {
        Date d = null;
        SimpleDateFormat formater = new SimpleDateFormat(format);
        try {
            //formater.setLenient(false);
            d = formater.parse(dateStr);
        } catch (Exception e) {
            // log.error(e);
            e.printStackTrace();
            d = null;
        }
        return d;
    }

    /**
     * 把日期转换为字符串
     *
     * @param date
     * @return
     */
    public static String dateToString(java.util.Date date, String format) {
        String result = "";
        SimpleDateFormat formater = new SimpleDateFormat(format);
        try {
            result = formater.format(date);
        } catch (Exception e) {
            e.printStackTrace();
            // log.error(e);
        }
        return result;
    }

}
