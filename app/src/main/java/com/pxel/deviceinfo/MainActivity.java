package com.pxel.deviceinfo;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.pxel.device.info.DeviceInfo;
import com.pxel.device.info.dimension.TypeDevice;

public class MainActivity extends Activity {

    TextView mTextInfo;
    TextView mTextType;
    DeviceInfo deviceInfo;
    TypeDevice.Device device;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextInfo = findViewById(R.id.text_info);
        mTextType = findViewById(R.id.text_type);
        deviceInfo = new DeviceInfo(MainActivity.this);

        mTextInfo.setText("AndroidOS: "+deviceInfo.getAndroidVersion() + " BaseOS: " +
                deviceInfo.getBaseOS() + " Sdk: "+ deviceInfo.getDeviceSDK() + "Battery: "
                + deviceInfo.getBatteryLevel() + " Model: " + deviceInfo.getModelDevice() +
                " SDK_INT: " + deviceInfo.getDeviceSDKINT() + " Build User: " + deviceInfo.getBuildUser() +
                 " Build Unknown: " + deviceInfo.getBuildUnknown() + " Build Fingerprint: " + deviceInfo.getBuildFingerprint()
                + " Build Radio: " + deviceInfo.getBuildRadio() + " Build Product: "
                + deviceInfo.getBuildProduct() + " Build Board: " + deviceInfo.getBuildBoard() + " Build Security-Path: " + deviceInfo.getBuildSecurityPatch()
                + " Build ID: " + deviceInfo.getBuildID() + " Build Serial: " + deviceInfo.getBuildSerial() + "Build Type:"+ deviceInfo.getBuildType()
                + " Build Tags: "+deviceInfo.getBuildTags()+ " Device Display:" + deviceInfo.getDeviceDisplay()+
                " Host: " + deviceInfo.getBuildHost() + "Hardware" + deviceInfo.getBuildHardware() + " BootLoader: " + deviceInfo.getBootloader()
                + " Cpu-ABI: " + deviceInfo.getCpuAbi() + " Cpu-ABI2: " + deviceInfo.getCpuAbi2());
        mTextType.setText(TypeDevice.getDeviceInfo(MainActivity.this, device));

    }
}