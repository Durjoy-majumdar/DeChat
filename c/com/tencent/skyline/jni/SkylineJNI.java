package com.tencent.skyline.jni;

import java.util.HashMap;

public class SkylineJNI {
    private static SkylineCronetClientInterface cronetClient;

    private SkylineJNI() {
    }

    public static void StartCronetHttpTask(int i, String str, HashMap<String, String> hashMap) {
        SkylineCronetClientInterface skylineCronetClientInterface = cronetClient;
        if (skylineCronetClientInterface != null) {
            skylineCronetClientInterface.StartCronetHttpTask(i, str, hashMap);
        } else {
            notifyCronetResponse(i, 0, 0, (String[]) null, (String[]) null, (byte[]) null);
        }
    }

    public static native void disableNewImage();

    public static native void enableNewImage();

    public static native void exitFullscreen(int i, long j);

    public static native void notifyCronetResponse(int i, int i2, int i3, String[] strArr, String[] strArr2, byte[] bArr);

    public static void setCronetClient(SkylineCronetClientInterface skylineCronetClientInterface) {
        cronetClient = skylineCronetClientInterface;
    }

    public static native void setDiskCacheDirPath(String str);

    public static native void setEnableCronet(long j, boolean z);
}
