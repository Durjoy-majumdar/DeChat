package com.tencent.youtu.ytposedetect.jni;

import android.graphics.Bitmap;
import com.tencent.youtu.ytposedetect.data.YTActRefData;
import java.io.ByteArrayOutputStream;

public class YTPoseDetectJNIInterface {
    private static IYtLoggerListener loggerListener;

    public interface IYtLoggerListener {
        void log(String str, String str2);
    }

    public static native String Checksum(byte[] bArr);

    public static native boolean canReflect();

    public static native void configNativeLog(boolean z);

    public static byte[] encodeJpeg(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 99, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static native YTActRefData getActionReflectData(int i);

    public static native byte[] getBestImage(int i);

    public static native String getConfigData(byte[] bArr, String str, String str2, String str3);

    public static native byte[] getEyeImage(int i);

    public static native byte[][] getFrameList();

    public static native String getLiveSelectDataChecksum(String str, String str2);

    public static native byte[] getMouthImage(int i);

    public static native String getVersion();

    public static native int initModel(String str);

    public static native boolean isRecordingDone();

    public static void nativeLog(String str, String str2) {
        IYtLoggerListener iYtLoggerListener = loggerListener;
        if (iYtLoggerListener != null) {
            iYtLoggerListener.log(str, str2);
        }
    }

    public static native int poseDetect(float[] fArr, float[] fArr2, int i, byte[] bArr, int i2, int i3, int i4, float f, float f2, float f3, int i5);

    public static native void releaseAll();

    public static native void resetDetect();

    public static native void setColorData(String str, String str2, String str3);

    public static void setLoggerListener(IYtLoggerListener iYtLoggerListener) {
        loggerListener = iYtLoggerListener;
    }

    public static native void setSafetyLevel(int i);

    public static native int updateParam(String str, String str2);

    public static void nativeLog(int i, String str) {
        IYtLoggerListener iYtLoggerListener = loggerListener;
        if (iYtLoggerListener != null) {
            iYtLoggerListener.log("[YTPoseDetectJNIInterface.nativeLog]", str);
        }
    }
}
