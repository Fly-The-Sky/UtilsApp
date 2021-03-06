package com.syc.utilsapp.utils;

import android.view.View;

import com.syc.utilsapp.R;


/**
 * Created by Hunter
 * Describe 条目选项设置
 * on 2017/4/6.
 */

public class ItemChange {

    public static View flag;
    public int time = 0;

    public static void changeColor(View view) {

        if (flag != null) {
            flag.setBackgroundResource(R.color.white);
        }
        view.setBackgroundResource(R.color.skyblue);
        flag = view;
    }

    public int changeColorAndTimes(View view) {

        if (flag != null) {
            flag.setBackgroundResource(R.color.white);
        }
        view.setBackgroundResource(R.color.green);
        if (view != flag) {
            time = 0;
        }
        time++;
        flag = view;
        return time;
    }
}
