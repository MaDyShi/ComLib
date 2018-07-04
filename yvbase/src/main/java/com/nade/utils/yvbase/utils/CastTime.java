package com.nade.utils.yvbase.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 时间转换类
 * Created by KuKa on 2017/6/17.
 */

public class CastTime {
    public static String threeTime(Long time){
        Date currentTime = new Date(time);
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy.MM.dd");
        String dateString = formatter.format(currentTime);
        return dateString;
    }
    // 外部传入时间戳 time  yyyy-MM-dd HH:mm
    public static String CastTime(Long time) {
        long l = System.currentTimeMillis();// 当前时间
        String s;
        Date date1 = new Date(time);// 订单时间
        Calendar calendar1 = Calendar.getInstance();
        calendar1.setTime(date1);
        int yaer1 = calendar1.get(Calendar.YEAR);
        int month1 = calendar1.get(Calendar.MONTH) + 1;
        int day1 = calendar1.get(Calendar.DAY_OF_MONTH);
        int hour1 = calendar1.get(Calendar.HOUR_OF_DAY);
        int minte1 = calendar1.get(Calendar.MINUTE);
        Date date = new Date(l);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);// 当前时间
        int yaer = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minte = calendar.get(Calendar.MINUTE);

        if (yaer == yaer1) { // 年相同
            if (month == month1) { //月相同
                if (day == day1) { //天相同
                    if (hour == hour1) {//时相同
                        if (minte == minte1) {//分相同
                            s = "刚刚";
                        } else {//分不同 一小时内
                            int betweenminte = minte - minte1;
                            s = betweenminte + " 分钟前";
                        }
                    } else {// 时 不同 一天内

                        s = "今天 " + hour1 + ":" + minte1;
                    }
                } else {// 天不同 一个月内
                    int betweenday = day - day1;
                    if (betweenday == 1) {
                        s = "昨天 " + hour1 + ":" + minte1;
                    } else {
                        s = month1 + "-" + day1 + " " + hour1 + ":" + hour1;
                    }
                }
            } else {// 月份相同 年不同
                s = yaer1 + "-" + month1 + "-" + day1 + " " + hour1 + ":" + minte1;
            }
        } else {// 年不同
            s = yaer1 + "-" + month1 + "-" + day1 + " " + hour1 + ":" + minte1;
        }

        return s;

    }

    //  MM-dd HH:mm
    public static String startTime(Long time) {

        Date currentTime = new Date(time);
        SimpleDateFormat formatter = new SimpleDateFormat("MM-dd HH:mm");
        return formatter.format(currentTime);
    }

    // yyyy-MM-dd HH:mm:ss
    public static String streamTime(Long time) {

        Date currentTime = new Date(time);
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return formatter.format(currentTime);
    }

    // yyyy-MM-dd HH:mm:ss
    public static String fiveTime(Long time) {

        Date currentTime = new Date(time);
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        return formatter.format(currentTime);
    }

    //yyyy-MM-dd
    public static String applyTime(Long time) {

        Date currentTime = new Date(time);
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        return formatter.format(currentTime);
    }

    public static boolean isSeven(Long time) {
        long l = System.currentTimeMillis();// 当前时间

        return l - time > 604800000;
    }

    public static boolean isThree(Long time) {
        long l = System.currentTimeMillis();// 当前时间
        return l - time > 259200000;
    }

    /**
     * 时间 转 时间戳
     * @param time
     * @param type
     * @return
     */
    public static Long timeToMillTime(String time,String type){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(type);
        try {
            Date date = simpleDateFormat.parse(time);
            long ts = date.getTime();
            return ts;
        } catch (ParseException e) {
            return Long.valueOf(0);
        }
    }
}
