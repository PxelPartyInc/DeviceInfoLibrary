package com.pxel.device.info.dimension;

import android.content.Context;
import android.content.res.Configuration;
import android.util.DisplayMetrics;

public class TypeDevice {

    public enum Device {
        DEVICE_TYPE,
    }

    public static String getDeviceInfo(Context context, Device device) {
        try {
            switch (device) {
                case DEVICE_TYPE:
                    if (isTab(context)) {
                        if (getDevice5Inch(context)) {
                            return "TAB-DEVICE";
                        } else{
                            return "MOBILE-DEVICE";
                        }
                    } else {
                        return "MOBILE-DEVICE";
                    }
                default:
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    private static boolean getDevice5Inch(Context context) {
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            float xinch = displayMetrics.heightPixels / displayMetrics.xdpi;
            float yinch = displayMetrics.heightPixels / displayMetrics.ydpi;

            double diagonalinch = Math.sqrt(xinch * xinch * yinch * yinch);
            if (diagonalinch >= 7) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }

    private static boolean isTab(Context context) {
        return (context.getResources().getConfiguration().screenLayout & Configuration.SCREENLAYOUT_SIZE_MASK) >= Configuration.SCREENLAYOUT_SIZE_LARGE;
    }


}
