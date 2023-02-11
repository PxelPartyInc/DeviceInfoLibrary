package com.pxel.device.info;

import android.content.Context;
import android.os.BatteryManager;
import android.os.Build;

public class DeviceInfo {

    Context context;

    public DeviceInfo(Context context) {
        this.context = context;
    }

    public String getAndroidVersion() {
        return Build.VERSION.RELEASE;
    }

    public String getBootloader() {
        return Build.BOOTLOADER;
    }

    public String getDeviceSDK() {
        return Build.VERSION.SDK;
    }

    public int getDeviceSDKINT() {
        return Build.VERSION.SDK_INT;
    }

    public String getModelDevice() {
        return Build.MANUFACTURER + Build.MODEL;
    }

    public String getBatteryLevel() {
        BatteryManager bm = (BatteryManager) context.getSystemService(Context.BATTERY_SERVICE);
        int batteryLevel = bm.getIntProperty(BatteryManager.BATTERY_PROPERTY_CAPACITY);
        return String.valueOf(batteryLevel);
    }

    public String getBuildTags() {
        return Build.TAGS;
    }

    public String getBuildUser() {
        return Build.USER;
    }

    public String getBuildUnknown() {
        return Build.UNKNOWN;
    }

    public String getBuildProduct() {
        return Build.PRODUCT;
    }

    public String getBuildFingerprint() {
        return Build.FINGERPRINT;
    }

    public String getBuildID() {
        return Build.ID;
    }

    public String getCpuAbi() {
     return Build.CPU_ABI;
    }

    public String getCpuAbi2() {
        return Build.CPU_ABI2;
    }

    public String getBuildHost() {
        return Build.HOST;
    }

    public String getBuildSerial() {
        return Build.SERIAL;
    }

    public String getBuildRadio() {
        return Build.RADIO;
    }

    public String getBuildBoard() {
        return Build.BOARD;
    }

    public String getBuildSecurityPatch() {
        return Build.VERSION.SECURITY_PATCH;
    }

    public String getBaseOS() {
        return Build.VERSION.BASE_OS;
    }

    public String getBuildType() {
        return Build.TYPE;
    }

    public String getBuildHardware() {
        return Build.HARDWARE;
    }

    public String getDeviceDisplay() {
        return Build.DISPLAY;
    }
}
