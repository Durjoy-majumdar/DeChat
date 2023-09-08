package com.tencent.kinda.gen;

public interface IPlatformUtil {
    void accessibilityAnnounce(KView kView, String str);

    void accessibilityFocus(KView kView);

    int androidAPILevel();

    AndroidDpiLevel androidDpiLevel();

    byte[] base64Decode(String str);

    String base64DecodeString(String str);

    String base64Encode(byte[] bArr);

    void beginIgnoringInteractionEvents();

    String currentLanguageCode();

    Platform currentPlatform();

    boolean delSecurityStore(String str);

    float dynamicFontSize(float f);

    float dynamicSize(float f);

    float dynamicSizeByFontLevel(float f, int i);

    void endIgnoringInteractionEvents();

    String genUUID();

    String getAndroidRepairConfig(String str);

    float getBottomSafeAreaHeight();

    LocationInfoStruct getCachedLocationInfo();

    boolean getExptBoolValue(String str);

    int getFontLevel();

    float getIphoneSafeAreaBottomHeight();

    boolean getIsAccessibilityServiceRunning();

    float getLoigcalResolutionHeight();

    float getLoigcalResolutionWidth();

    String getMemoryKVString(String str);

    float getNavigationBarHeight();

    float getPadSplitHeight();

    float getPadSplitWidth();

    String getPlatformString(String str);

    float getPx(float f);

    int getRedDotStatus(String str);

    String getRedDotWording(String str);

    float getScaleByFontLevel(int i);

    float getScreenBrightness();

    float getStatusBarHeight();

    void getUserLocationImpl(VoidF32F32BoolCallback voidF32F32BoolCallback);

    float getViewScale();

    IOSDevice iOSDevice();

    String iOSVersion();

    boolean isCareModeOn();

    boolean isForAndroidTest();

    boolean isLocationAuthorized();

    boolean isNetworkConnected();

    boolean isPad();

    boolean isScreenCaptured();

    byte[] loadSecurityStore(String str);

    void makesureLonglink();

    String md5(String str);

    void openTinyApp(ITransmitKvData iTransmitKvData);

    void playVibration();

    String resolveLanguageStringForGlobal(String str);

    String resolveURLStringForGlobal(String str);

    boolean saveSecurityStore(String str, byte[] bArr);

    void setIdleTimerDisable(boolean z);

    void setLanguageChangeCallbackImpl(VoidStringCallback voidStringCallback);

    void setRedDotStatus(String str, boolean z);

    void setReportLocationState(boolean z, boolean z2);

    void setScreenBrightness(float f);

    void setStatusBarHidden(boolean z, boolean z2);

    String sha256(byte[] bArr, boolean z);

    boolean shouldReportCellInfo();

    boolean shouldReportLocation();

    boolean shouldReportWifiSsid();

    boolean supportSecurityStore();
}
