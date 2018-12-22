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
            formater.setLenient(false);
            d = formater.parse(dateStr);
        } catch (Exception e) {
            // log.error(e);
            d = null;
        }
        return d;
    }
}
