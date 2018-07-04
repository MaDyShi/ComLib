package com.nade.utils.yvbase.utils;

import android.os.Environment;

import java.io.File;

/**
 * 作者: Nade_S on 2018/2/28.
 */

public class FileUtils {
    // Create an image file name
    public static String getFileName(){
        String fileName  =null;
        long currentTimeMillis = System.currentTimeMillis();
        String pathName = Environment.getExternalStorageDirectory() + "/DCIM/";
        File file = new File(pathName);
        file.mkdirs();
        fileName = pathName + currentTimeMillis+".jpg";

        return fileName;

    }


}
