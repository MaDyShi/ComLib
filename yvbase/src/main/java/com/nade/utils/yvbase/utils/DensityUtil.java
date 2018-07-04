package com.nade.utils.yvbase.utils;

import android.content.Context;

/**
 * 作者: Nade_S on 2018/4/12.
 *  dp 和 px 转换工具
 */

public class DensityUtil {

    /**
     * 根据手机的分辨率从 dp 的单位 转成为 px(像素)
     *
     * @param context
     * @param dpValue
     * @return
     * @author SHANHY
     * @date   2015年10月28日
     *
     */
    public static int dip2px(Context context, float dpValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }

    /**
     * 根据手机的分辨率从 px(像素) 的单位 转成为 dp
     *
     * @param context
     * @param pxValue
     * @return
     * @author SHANHY
     * @date   2015年10月28日
     */
    public static int px2dip(Context context, float pxValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (pxValue / scale + 0.5f);
    }


    /**
     * 主要适配尺寸
     * Android手机常见的分辨率：320x480、480x800、720x1280、1080x1920
     * 不同尺寸 像素的手机所显示的大小和比例也是不一样的 主要适配主流的手机屏幕 能适应大部分的机型
     */
}
