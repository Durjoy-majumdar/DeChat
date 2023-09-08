package com.tencent.qbar;

import android.graphics.Bitmap;
import j20.C117292a;
import k20.C9556a;

public class QbarNative {

    public static class QBarCodeDetectInfo {
        public float prob;
        public int readerId;
    }

    public static class QBarResultJNI {
        public String charset;
        public byte[] data;
        public int priorityLevel;
        public int typeID;
        public String typeName;
    }

    public static class QBarZoomInfo {
        public boolean isZoom;
        public float zoomFactor;
    }

    public static class QbarAiModelParam {
        public String detectModelVersion;
        public String detect_model_bin_path_;
        public String detect_model_param_path_;
        public boolean enable_seg = false;
        public String qbar_segmentation_model_path_;
        public String superResolutionModelVersion;
        public String superresolution_model_bin_path_;
        public String superresolution_model_param_path_;
    }

    public static class QBarReportMsg {
        public int qrcodeVersion;
    }

    public static class QBarPoint {
        public int point_cnt;

        /* renamed from: x0 */
        public float f56815x0;

        /* renamed from: x1 */
        public float f56816x1;

        /* renamed from: x2 */
        public float f56817x2;

        /* renamed from: x3 */
        public float f56818x3;

        /* renamed from: y0 */
        public float f56819y0;

        /* renamed from: y1 */
        public float f56820y1;

        /* renamed from: y2 */
        public float f56821y2;

        /* renamed from: y3 */
        public float f56822y3;
    }

    static {
        C9556a aVar = new C9556a();
        aVar.mo10233c("wechatQrMod");
        Object obj = new Object();
        C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/qbar/QbarNative", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        System.loadLibrary((String) aVar.mo10231a(0));
        C117292a.m165359e(obj, "com/tencent/qbar/QbarNative", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }

    public static native int Encode(byte[] bArr, int[] iArr, String str, int i, int i2, String str2, int i3);

    public static native int EncodeBitmap(String str, Bitmap bitmap, int i, int i2, int i3, int i4, String str2, int i5);

    public static native String GetVersion();

    public static native int nativeArrayConvert(int i, int i2, byte[] bArr, int[] iArr);

    public static native int nativeCropGray2(byte[] bArr, byte[] bArr2, int i, int i2, int i3);

    public static native int nativeGrayRotateCropSub(byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, byte[] bArr2, int[] iArr, int i7, int i8);

    public static native int nativeTransBytes(int[] iArr, byte[] bArr, int i, int i2);

    public static native int nativeTransPixels(int[] iArr, byte[] bArr, int i, int i2);

    public static native int nativeYUVrotate(byte[] bArr, byte[] bArr2, int i, int i2);

    public static native int nativeYUVrotateLess(byte[] bArr, int i, int i2);

    public static native int nativeYuvToCropIntArray(byte[] bArr, int[] iArr, int i, int i2, int i3, int i4, int i5, int i6);

    public native int GetCodeDetectInfo(QBarCodeDetectInfo[] qBarCodeDetectInfoArr, QBarPoint[] qBarPointArr, int i);

    public native int GetDetailResults(QBarResultJNI[] qBarResultJNIArr, QBarPoint[] qBarPointArr, QBarReportMsg[] qBarReportMsgArr, int i);

    public native int GetOneResult(byte[] bArr, byte[] bArr2, byte[] bArr3, int[] iArr, int i);

    public native int GetResults(QBarResultJNI[] qBarResultJNIArr, int i);

    public native int GetZoomInfo(QBarZoomInfo qBarZoomInfo, int i);

    public native int Init(int i, boolean z, boolean z2, boolean z3, boolean z4, int i2, int i3, String str, String str2, QbarAiModelParam qbarAiModelParam);

    public native int Release(int i);

    public native int ScanImage(byte[] bArr, int i, int i2, int i3);

    public native int SetReaders(int[] iArr, int i, int i2);
}
