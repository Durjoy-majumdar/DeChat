package com.tencent.p014mm.plugin.facedetect;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.facedetect.model.C85191v;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import f40.C86709a0;
import java.util.ArrayList;
import lc3.C10485b;
import org.json.JSONArray;
import org.json.JSONException;
import p564iq.C87790d;

/* renamed from: com.tencent.mm.plugin.facedetect.FaceProNative */
public class FaceProNative {
    public static final int ROTFLIPHOR = 3;
    public static final int ROTFLIPLEFT = 4;
    public static final int ROTFLIPRIGHT = 5;
    public static final int ROTLEFT = 1;
    public static final int ROTRIGHT = 2;
    public static final int ROTSTABLE = 0;
    private static final String TAG = "MicroMsg.FaceProNative";
    private static final long TIMEOUT_CHECKER = 3600000;
    private static String[] cachedStr = null;
    public static volatile boolean hasDetectInit;
    private static long lastCheckTime = -1;
    private long nativePtr;

    /* renamed from: com.tencent.mm.plugin.facedetect.FaceProNative$FaceStatus */
    public static class FaceStatus implements Parcelable {
        public static final Parcelable.Creator<FaceStatus> CREATOR = new Parcelable.Creator<FaceStatus>() {
            public FaceStatus createFromParcel(Parcel parcel) {
                return new FaceStatus(parcel);
            }

            public FaceStatus[] newArray(int i) {
                return new FaceStatus[i];
            }
        };
        public Rect facerect;
        public float pitch;
        public int result;
        public float roll;
        public float[] xys;
        public float yaw;

        public FaceStatus() {
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "FaceStatus{result=" + this.result + ", facerect=" + this.facerect + ", pitch=" + this.pitch + ", yaw=" + this.yaw + ", roll=" + this.roll + '}';
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.result);
            parcel.writeParcelable(this.facerect, i);
            parcel.writeFloatArray(this.xys);
            parcel.writeFloat(this.pitch);
            parcel.writeFloat(this.yaw);
            parcel.writeFloat(this.roll);
        }

        public FaceStatus(Parcel parcel) {
            this.result = parcel.readInt();
            this.facerect = (Rect) parcel.readParcelable(Rect.class.getClassLoader());
            this.xys = parcel.createFloatArray();
            this.pitch = parcel.readFloat();
            this.yaw = parcel.readFloat();
            this.roll = parcel.readFloat();
        }
    }

    /* renamed from: com.tencent.mm.plugin.facedetect.FaceProNative$FaceResult */
    public static class FaceResult implements Parcelable {
        public static final Parcelable.Creator<FaceResult> CREATOR = new Parcelable.Creator<FaceResult>() {
            public FaceResult createFromParcel(Parcel parcel) {
                return new FaceResult(parcel);
            }

            public FaceResult[] newArray(int i) {
                return new FaceResult[i];
            }
        };
        public byte[] data;
        public int result;
        public byte[] sidedata;

        public FaceResult() {
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("FaceResult{result=");
            sb.append(this.result);
            sb.append(", sidedataLen=");
            byte[] bArr = this.sidedata;
            int i = 0;
            sb.append(bArr == null ? 0 : bArr.length);
            sb.append(", dataLen=");
            byte[] bArr2 = this.data;
            if (bArr2 != null) {
                i = bArr2.length;
            }
            sb.append(i);
            sb.append('}');
            return sb.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.result);
            parcel.writeByteArray(this.data);
            parcel.writeByteArray(this.sidedata);
        }

        public FaceResult(Parcel parcel) {
            this.result = parcel.readInt();
            this.data = parcel.createByteArray();
            this.sidedata = parcel.createByteArray();
        }
    }

    static {
        tryLoadLibrary();
    }

    public FaceProNative() {
        if (C85185b.vx0()) {
            tryLoadLibrary();
            NativeConstructor();
        }
    }

    private native void NativeConstructor();

    private native void NativeDestructor();

    public static native String addVerifyData2Jpg(String str, String str2, String str3);

    public static void checkInitDetectFace() {
        synchronized (FaceProNative.class) {
            Log.printInfoStack(TAG, "checkInitDetectFace, hasDetectInit: %s", Boolean.valueOf(hasDetectInit));
            MMHandlerThread.postToMainThread(new Runnable() {
                public void run() {
                    if (!FaceProNative.hasDetectInit && C85185b.vx0()) {
                        int nativeFacedetectInitBin = FaceProNative.nativeFacedetectInitBin(C86013q1.m106433O(C85191v.m105069h(), 0, -1));
                        if (nativeFacedetectInitBin == -1) {
                            Log.m105929w(FaceProNative.TAG, "detectFaceCnt init failed: %s", C85191v.m105069h());
                            return;
                        }
                        Log.m105925i(FaceProNative.TAG, "detectFaceCnt init:%d, %s", Integer.valueOf(nativeFacedetectInitBin), C85191v.m105069h());
                        FaceProNative.hasDetectInit = true;
                    }
                }
            });
        }
    }

    public static int detectFaceCnt(String str) {
        return 0;
    }

    public static native int engineVersion();

    public static String[] getDynamicValue(String str) {
        if (System.currentTimeMillis() - lastCheckTime >= 3600000) {
            lastCheckTime = System.currentTimeMillis();
            String c = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c(str);
            if (!Util.isNullOrNil(c)) {
                try {
                    JSONArray jSONArray = new JSONArray(c);
                    ArrayList arrayList = new ArrayList(5);
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        arrayList.add(jSONArray.getString(i));
                    }
                    String[] strArr = new String[length];
                    cachedStr = strArr;
                    arrayList.toArray(strArr);
                } catch (JSONException e) {
                    Log.printErrStackTrace(TAG, e, "hy: array resolve failed", new Object[0]);
                }
            }
        }
        return cachedStr;
    }

    public static native int nativeFacedetectInitBin(byte[] bArr);

    public static native void nativeFacedetectRelease();

    public static native int nativeFacedetectWithBitmap(Object obj);

    public static native boolean nativeInit();

    private static void tryLoadLibrary() {
        Class cls = C87790d.class;
        if (C85185b.vx0()) {
            ((C87790d) C86312j.m106911c(cls)).mo122034R0("wechatvoicereco");
            ((C87790d) C86312j.m106911c(cls)).mo122034R0("wechatxlog");
        }
    }

    public void destroy() {
        if (C85185b.vx0()) {
            NativeDestructor();
        }
    }

    public native FaceStatus engineFaceProcess(byte[] bArr, int i, int i2, int i3, int i4, int i5);

    public native int[] engineGetAllMotions();

    public native int engineGetCurrMotion();

    public native String engineGetCurrMotionData();

    public native int engineGroupChange();

    public native int engineInit(String str, byte[] bArr, String str2, String str3);

    public native int engineNextMotion();

    public native int engineRelease();

    public native int engineReleaseCurrMotion();

    public native FaceResult engineReleaseOut();

    public native int engineSetVoiceData(byte[] bArr);

    public native int engineStartRecord();

    public void finalize() {
        super.finalize();
        if (C85185b.vx0()) {
            NativeDestructor();
        }
    }
}
