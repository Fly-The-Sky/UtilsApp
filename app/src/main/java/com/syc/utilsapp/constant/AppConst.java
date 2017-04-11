package com.syc.utilsapp.constant;

import android.os.Environment;

import com.syc.utilsapp.utils.LogUtils;

/**
 * Created by Hunter
 * Describe 常量管理列表 方便统一管理
 * on 2017/4/6.
 */
public final class AppConst {
    public static final int DEBUGLEVEL = LogUtils.LEVEL_ALL;//日志输出级别
    /**
     * 获取设备的外存路径的借口 Path
     */
    public final static String SDCard = Environment.getExternalStorageDirectory().getPath();
    /**
     * Log文件保存路径
     */
    public final static String pathLog = SDCard + "/UtilsApp/Log/";
    public final static String pathImages = SDCard + "/UtilsApp/Images/";

    /**
     * 服务器地址
     */
    public static final String SERVER_ADDRESS = "http://xxx.com/client";

    public static final class Url {
        //帮助与反馈
        public static final String HELP_FEEDBACK = "https://xxx.com/";
        //购物
        public static final String SHOP = "http://xxx.com/portal/wx/";
        //游戏
        public static final String GAME = "http://xxx.com/android";
    }


    //用户
    public static final class User {
        private static final String USER = SERVER_ADDRESS + "/user";
        public static final String LOGIN = USER + "/login";//登录
        public static final String REGISTER = USER + "/insertOrUpdate";//注册
        public static final String WX_LOGIN = USER + "/androidWXLogin";//微信登录
    }


    //用户拓展信息字段
    public static final class UserInfoExt {
        public static final String AREA = "area";
        public static final String PHONE = "phone";
    }


    /**
     * 记住密码的数据信息
     */
    public final static class KeepInfo {
        public final static String KEEPINFO = "keepInfo";
        public final static String INFO_IS_KEEP = "isKeepPwd";//是否记住密码
        public final static String INFO_KEEP_NAME = "keepName";//记住--用户名
        public final static String INFO_KEEP_PWD = "keepPwd";//记住--密码
    }

}
