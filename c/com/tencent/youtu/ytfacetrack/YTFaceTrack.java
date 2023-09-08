package com.tencent.youtu.ytfacetrack;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.tencent.youtu.ytfacetrack.param.YTFaceAlignParam;
import com.tencent.youtu.ytfacetrack.param.YTFaceDetectParam;
import com.tencent.youtu.ytfacetrack.param.YTFaceTrackParam;

public class YTFaceTrack {
    public static String Version = "2.3.3.7";
    private static YTFaceTrack instance;
    private static IYtLoggerListener loggerListener;
    public long handleId = 0;
    private long nativePtr;

    public static class YTImage {
        public byte[] data;
        public int height;
        public int width;
    }

    public static class FaceStatus {
        public float pitch;
        public float[] pointsVis;
        public float roll;
        public float[] xys;
        public float[] xys5p;
        public float yaw;
    }

    public static class FaceStatus3d {
        public float[] denseFaceModel;
        public float[] expression;
        public float pitch;
        public float roll;
        public float[] transform;
        public float yaw;
    }

    public interface IYtLoggerListener {
        void log(String str, String str2);
    }

    static {
        nativeInit();
    }

    public YTFaceTrack() {
        NativeConstructor();
    }

    public static int GlobalInit(String str) {
        int GlobalInitInner = GlobalInitInner(str);
        if (GlobalInitInner == 0) {
            instance = new YTFaceTrack();
        }
        return GlobalInitInner;
    }

    private static native int GlobalInitInner(String str);

    private static native int GlobalInitSuccessCount();

    public static boolean GlobalRelease() {
        YTFaceTrack yTFaceTrack = instance;
        if (yTFaceTrack != null) {
            yTFaceTrack.NativeDestructor();
            instance = null;
        }
        return GlobalReleaseInner();
    }

    private static native boolean GlobalReleaseInner();

    public static boolean IsInstanceExist() {
        return instance != null;
    }

    private native void NativeConstructor();

    private native void NativeDestructor();

    public static synchronized YTFaceTrack getInstance() {
        YTFaceTrack yTFaceTrack;
        synchronized (YTFaceTrack.class) {
            yTFaceTrack = instance;
        }
        return yTFaceTrack;
    }

    private static native boolean nativeInit();

    public static void nativeLog(int i, String str) {
        IYtLoggerListener iYtLoggerListener = loggerListener;
        if (iYtLoggerListener != null) {
            iYtLoggerListener.log("[YTFaceTrack.nativeLog]", str);
        }
    }

    public static void setLoggerListener(IYtLoggerListener iYtLoggerListener) {
        loggerListener = iYtLoggerListener;
    }

    public native FaceStatus[] DoDetectionProcess(YTImage yTImage);

    public native FaceStatus[] DoDetectionProcessBitmap(Bitmap bitmap, int i, YTImage yTImage);

    public native FaceStatus[] DoDetectionProcessRGB(byte[] bArr, int i, int i2, int i3, YTImage yTImage);

    public native FaceStatus[] DoDetectionProcessRGBA(byte[] bArr, int i, int i2, int i3, YTImage yTImage);

    public native FaceStatus[] DoDetectionProcessYUV(byte[] bArr, int i, int i2, int i3, YTImage yTImage);

    public native FaceStatus[] DoDetectionProcessYUVWithBlur(byte[] bArr, int i, int i2, int i3, boolean z, float[] fArr, YTImage yTImage);

    public native YTFaceAlignParam GetFaceAlignParam();

    public native YTFaceDetectParam GetFaceDetectParam();

    public native Rect[] GetFaceRect(YTImage yTImage);

    public native YTFaceTrackParam GetFaceTrackParam();

    public native YTImage GetYTImageBitmap(Bitmap bitmap, int i);

    public native int GetYTImageBitmapReuseData(Bitmap bitmap, int i, YTImage yTImage);

    public native YTImage GetYTImageRGB(byte[] bArr, int i, int i2, int i3);

    public native YTImage GetYTImageRGBA(byte[] bArr, int i, int i2, int i3);

    public native int GetYTImageRGBAReuseData(byte[] bArr, int i, int i2, int i3, YTImage yTImage);

    public native int GetYTImageRGBReuseData(byte[] bArr, int i, int i2, int i3, YTImage yTImage);

    public native YTImage GetYTImageYUV(byte[] bArr, int i, int i2, int i3);

    public native int GetYTImageYUVReuseData(byte[] bArr, int i, int i2, int i3, YTImage yTImage);

    public native byte[] RotateYUV(byte[] bArr, int i, int i2, int i3);

    public native void SaveYTImage(byte[] bArr, int i, int i2);

    public native boolean SetFaceAlignParam(YTFaceAlignParam yTFaceAlignParam);

    public native boolean SetFaceDetectParam(YTFaceDetectParam yTFaceDetectParam);

    public native boolean SetFaceTrackParam(YTFaceTrackParam yTFaceTrackParam);
}
