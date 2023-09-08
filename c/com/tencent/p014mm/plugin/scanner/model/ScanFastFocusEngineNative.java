package com.tencent.p014mm.plugin.scanner.model;

import com.tencent.p014mm.plugin.scanner.api.ScanImagePHashInfo;
import com.tencent.p014mm.protocal.protobuf.GoodsObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import p564iq.C87790d;

/* renamed from: com.tencent.mm.plugin.scanner.model.ScanFastFocusEngineNative */
public class ScanFastFocusEngineNative {
    private static final String TAG = "MicroMsg.ScanFastFocusEngineNative";
    private static boolean isSoLoaded;
    public byte[] bestImageData;
    public int bestImageId;
    public GoodsObject cropObject = new GoodsObject();
    public int detectType = 0;
    public byte[] fullImageData;
    public int height = 0;
    public int pointCount = 0;
    public ScanPoint[] points = new ScanPoint[10];
    public int result = 0;
    public int trackInfoCount = 0;
    public ScanProductInfo[] trackInfoList = new ScanProductInfo[5];
    public int width = 0;

    static {
        tryLoadLibrary();
    }

    public ScanFastFocusEngineNative() {
        Log.m105925i(TAG, "alvinluo ScanFastFocusEngineNative constructor %s", Integer.valueOf(hashCode()));
        init();
    }

    private void init() {
        int i = 0;
        int i2 = 0;
        while (true) {
            ScanPoint[] scanPointArr = this.points;
            if (i2 >= scanPointArr.length) {
                break;
            }
            scanPointArr[i2] = new ScanPoint();
            i2++;
        }
        while (true) {
            ScanProductInfo[] scanProductInfoArr = this.trackInfoList;
            if (i < scanProductInfoArr.length) {
                scanProductInfoArr[i] = new ScanProductInfo();
                i++;
            } else {
                return;
            }
        }
    }

    public static boolean isSoLoaded() {
        return isSoLoaded;
    }

    public static boolean tryLoadLibrary() {
        Class cls = C87790d.class;
        if (!((C87790d) C86312j.m106911c(cls)).isInstalled("scan_recognize")) {
            return false;
        }
        try {
            isSoLoaded = ((C87790d) C86312j.m106911c(cls)).mo122034R0("ffengine") && ((C87790d) C86312j.m106911c(cls)).mo122034R0("focusEngineJni");
            return true;
        } catch (Exception e) {
            Log.printErrStackTrace(TAG, e, "alvinluo FocusEngine init exception", new Object[0]);
            isSoLoaded = false;
            return false;
        }
    }

    public native ScanImagePHashInfo computeImagePHash(byte[] bArr, int i, int i2, boolean z);

    public native ScanFastFocusEngineNative getCropRGBAByTrackId(int i, float f, float f2, float f3, float f4);

    public native ScanFastFocusEngineNative getCropYUVByTrackId(int i, float f, float f2, float f3, float f4);

    public native int getModelConfigIntValue(String str, String str2, String str3, int i);

    public native ScanPoint[] getPointObjects();

    public native String getReportString();

    public native ScanProductInfo[] getScanProductInfoList(byte[] bArr, int i, int i2, int i3, int i4);

    public native ScanProductInfo[] getScanProductInfoListForFullImage(int i, float f, float f2, float f3, float f4);

    public native ScanFastFocusEngineNative getUploadFullRGBAImage(byte[] bArr, int i, boolean z, float f);

    public native ScanFastFocusEngineNative getUploadFullYUVImage(byte[] bArr, int i, boolean z, float f);

    public native boolean isAICrop();

    public native boolean isUsingAI();

    public native int nativeFocusEngineVersion();

    public native int nativeInit(int i, int i2, int i3, int i4, int i5, String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3);

    public native void nativeRelease();

    public native ScanFastFocusEngineNative process(byte[] bArr, int i, int i2);

    public native void reset();

    public native void resetNoBoxCount();

    public void resetStatus() {
        this.bestImageData = null;
        this.fullImageData = null;
        this.trackInfoCount = 0;
        this.detectType = 0;
    }

    public native void setConfig(String str);

    public native void setNetSpeed(int i);

    public native void setPHashConfig(String str);

    public native void setServerDetectFrameCount(int i);

    public native void setServerState(int i);

    public native ScanFrameProcessResult shouldJump(float f, float f2, float f3, float f4, int i, boolean z);
}
