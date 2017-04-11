package com.syc.utilsapp.utils;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;


/**
 * Created by Hunter
 * on 2017/4/7.
 * Describe
 */
public class TimeUtilsTest {

    String myPatternDate = "yyyy-MM-dd HH:mm:ss";
    String myPattern = "yyyy-MM-dd HH:mm:ss zzzz";
    long millis = 1470991049000L;
    Date timeDate = new Date(millis);
    String timeString = "2016-08-12 16:37:29";
    String myTimeString = "2016-08-12 16:37:29 中国标准时间";
    String timeString0 = "2016-08-12 16:00:00";
    String timeString1 = "2016-08-12 17:10:10";
    String myTimeString0 = "2016-08-12 16:00:00 中国标准时间";
    String myTimeString1 = "2016-08-12 17:10:10 中国标准时间";

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void millis2String() throws Exception {
        assertEquals(TimeUtils.millis2String(millis), timeString);
        assertEquals(TimeUtils.millis2String(millis, myPattern), myTimeString);
        assertEquals(TimeUtils.string2Millis(timeString), millis);
        assertEquals(TimeUtils.string2Millis(timeString, myPatternDate), millis);
    }


    @Test
    public void string2Date() throws Exception {
        assertEquals(TimeUtils.string2Date(timeString, myPatternDate), timeDate);
        assertEquals(TimeUtils.string2Date(timeString), timeDate);
    }


    @Test
    public void date2String() throws Exception {
        assertEquals(TimeUtils.date2String(timeDate), timeString);
        assertEquals(TimeUtils.date2String(timeDate, myPattern), myTimeString);
    }


    @Test
    public void date2Millis() throws Exception {
        assertEquals(TimeUtils.date2Millis(timeDate), millis);
    }

    @Test
    public void millis2Date() throws Exception {
        assertEquals(TimeUtils.millis2Date(millis), timeDate);
    }

    @Test
    public void getTimeSpan() throws Exception {

    }


    @Test
    public void getFitTimeSpan() throws Exception {

    }


    @Test
    public void getNowTimeMills() throws Exception {

    }

    @Test
    public void getNowTimeString() throws Exception {

    }


    @Test
    public void getNowTimeDate() throws Exception {

    }

    @Test
    public void getTimeSpanByNow() throws Exception {

    }


    @Test
    public void getFitTimeSpanByNow() throws Exception {

    }


    @Test
    public void getFriendlyTimeSpanByNow() throws Exception {

    }


    @Test
    public void isSameDay() throws Exception {

    }


    @Test
    public void isLeapYear() throws Exception {
        assertEquals(TimeUtils.isLeapYear(myTimeString), true);
        assertEquals(TimeUtils.isLeapYear(myTimeString, myPattern), true);
        assertEquals(TimeUtils.isLeapYear(timeDate), true);
        assertEquals(TimeUtils.isLeapYear(millis), true);
        assertEquals(TimeUtils.isLeapYear(2016), true);

    }


    @Test
    public void getWeek() throws Exception {
        assertEquals(TimeUtils.getWeek(timeString),"星期五");
        assertEquals(TimeUtils.getWeek(timeString,myPatternDate),"星期五");
        assertEquals(TimeUtils.getWeek(timeDate),"星期五");
        assertEquals(TimeUtils.getWeek(millis),"星期五");
    }


    @Test
    public void getWeekIndex() throws Exception {

    }


    @Test
    public void getWeekOfMonth() throws Exception {

    }


    @Test
    public void getWeekOfYear() throws Exception {

    }

    @Test
    public void getChineseZodiac() throws Exception {

    }

    @Test
    public void getZodiac() throws Exception {

    }

}