package com.syc.utilsapp.utils;

import java.io.File;

import static com.syc.utilsapp.utils.UIUtils.getContext;

/**
 * Created by Hunter
 * on 2017/4/6.
 * Describe 清除相关工具类
 */

public class CleanUtils {

    /**
     * cleanInternalCache   : 清除内部缓存
     * cleanInternalFiles   : 清除内部文件
     * cleanInternalDbs     : 清除内部数据库
     * cleanInternalDbByName: 根据名称清除数据库
     * cleanInternalSP      : 清除内部SP
     * cleanExternalCache   : 清除外部缓存
     * cleanCustomCache     : 清除自定义目录下的文件
     */


    /**
     * 清除内部缓存
     * <p>/data/data/com.xxx.xxx/cache</p>
     *
     * @return true : 清除成功  false : 清除失败
     */
    public static boolean cleanInternalCache() {
        return FileUtils.deleteFilesInDir(getContext().getCacheDir());
    }

    /**
     * 清除内部文件
     * <p>/data/data/com.xxx.xxx/files</p>
     *
     * @return true : 清除成功  false : 清除失败
     */
    public static boolean cleanInternalFiles() {
        return FileUtils.deleteFilesInDir(getContext().getFilesDir());
    }

    /**
     * 清除内部数据库
     * <p>/data/data/com.xxx.xxx/databases</p>
     *
     * @return true : 清除成功  false : 清除失败
     */
    public static boolean cleanInternalDbs() {
        return FileUtils.deleteFilesInDir(getContext().getFilesDir().getParent() + File.separator + "databases");
    }

    /**
     * 根据名称清除数据库
     * <p>/data/data/com.xxx.xxx/databases/dbName</p>
     *
     * @param dbName 数据库名称
     * @return true : 清除成功  false : 清除失败
     */
    public static boolean cleanInternalDbByName(String dbName) {
        return getContext().deleteDatabase(dbName);
    }

    /**
     * 清除内部SP
     * <p>/data/data/com.xxx.xxx/shared_prefs</p>
     *
     * @return true : 清除成功  false : 清除失败
     */
    public static boolean cleanInternalSP() {
        return FileUtils.deleteFilesInDir(getContext().getFilesDir().getParent() + File.separator + "shared_prefs");
    }

    /**
     * 清除外部缓存
     * <p>/storage/emulated/0/android/data/com.xxx.xxx/cache</p>
     *
     * @return true : 清除成功  false : 清除失败
     */
    public static boolean cleanExternalCache() {
        return SDCardUtils.isSDCardEnable() && FileUtils.deleteFilesInDir(getContext().getExternalCacheDir());
    }

    /**
     * 清除自定义目录下的文件
     *
     * @param dirPath 目录路径
     * @return true : 清除成功  false : 清除失败
     */
    public static boolean cleanCustomCache(String dirPath) {
        return FileUtils.deleteFilesInDir(dirPath);
    }

    /**
     * 清除自定义目录下的文件
     *
     * @param dir 目录
     * @return true : 清除成功  false : 清除失败
     */
    public static boolean cleanCustomCache(File dir) {
        return FileUtils.deleteFilesInDir(dir);
    }
}
