package com.tencent.kinda.gen;

public interface KDeviceService {
    void invokePhoneCall(String str);

    boolean isDeviceOpenBiometricVerification();

    boolean isDeviceSupportFaceId();

    boolean isDeviceSupportTouchId();

    boolean isDeviceTouchIdHardwareSupported();

    boolean isRoot();

    String soterCpuId();

    String soterUid();

    void updateBiometricVerificationState(int i, boolean z);

    boolean useLastestTouchInfo();
}
