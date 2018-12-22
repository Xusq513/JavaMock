package com.refutrue.mock.generater;

import com.refutrue.mock.util.DateUtil;

import java.util.Date;

/**
 * @Author: Michael Xu
 * @Date: 2018/12/20 19:29
 * @Description:
 */
public class TimeGenerateor extends TimeAdapter<Date>{

    public Date generate() {
      String formatter = time.formatter();
      String max = time.max();
      String min = time.min();
      Date maxDate = DateUtil.stringtoDate(max,formatter);
      Date minDate = DateUtil.stringtoDate(min,formatter);
      if(maxDate != null && minDate != null){
          Date calDate = new Date ((long)((maxDate.getTime() - minDate.getTime()) * Math.random()) + minDate.getTime());
          return calDate;
      }
      throw new RuntimeException("生成日期错误，请检查配置！");
    }
}
