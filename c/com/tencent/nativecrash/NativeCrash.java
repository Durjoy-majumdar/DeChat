package com.tencent.nativecrash;

import android.os.ParcelFileDescriptor;
import com.tencent.midas.data.APMidasPluginInfo;
import j20.C117292a;
import java.nio.charset.Charset;
import k20.C9556a;

public final class NativeCrash {
    public static final int DEFAULT_FULL_FLAGS = -1;
    public static final int DEFAULT_SHORT_FLAGS = 1867;
    public static final int DUMP_ABORT_MESSAGE = 1024;
    public static final int DUMP_FILE_DESCRIPTORS = 2048;
    public static final int DUMP_JAVA_STACK = 64;
    public static final int DUMP_MAPPINGS = 32;
    public static final int DUMP_OTHER_THREADS = 128;
    public static final int DUMP_PRESET_CUSTOM = 256;
    public static final int DUMP_PROCESS = 1;
    public static final int DUMP_REALTIME_CUSTOM = 512;
    public static final int DUMP_REGISTER = 4;
    public static final int DUMP_SIGNAL = 2;
    public static final int DUMP_STACK = 8;
    public static final int DUMP_STACK_MEMORY = 16;
    private static final String TAG = "NativeCrash";
    private static final Charset UTF8 = Charset.forName("UTF-8");
    private static ANRCallback mANRCallback;
    private static CrashCallback mCrashCallback;
    private byte _hellAccFlag_;

    public interface ANRCallback {
        boolean onANRDumped(int i, String str);
    }

    public interface CrashCallback {
        boolean onCrashDumped(int i, String str, String str2);
    }

    private NativeCrash() {
    }

    public static ANRCallback anrCallback() {
        return mANRCallback;
    }

    public static CrashCallback crashCallback() {
        return mCrashCallback;
    }

    public static void customInfo(String str) {
        String str2;
        if (str != null) {
            if (!str.endsWith("\n")) {
                str2 = str + "\n\u0000";
            } else {
                str2 = str + 0;
            }
            nativeCustomInfo(str2.getBytes(UTF8));
        }
    }

    public static void init(String str, int i, int i2) {
        init(str, i, i2, false);
    }

    private static native void nativeCustomInfo(byte[] bArr);

    private static native void nativeInit(String str, int i, int i2, boolean z);

    private static native void nativeInitFd(int[] iArr, int i, int i2);

    private static native void nativeReserveMemory();

    private static native void nativeResetCustomInfo();

    private static boolean onANRDumped(int i, String str) {
        ANRCallback aNRCallback = mANRCallback;
        return aNRCallback != null && aNRCallback.onANRDumped(i, str);
    }

    private static boolean onCrashDumped(int i, String str, String str2) {
        CrashCallback crashCallback = mCrashCallback;
        return crashCallback != null && crashCallback.onCrashDumped(i, str, str2);
    }

    public static void reserveMemory() {
        nativeReserveMemory();
    }

    public static void resetCustomInfo() {
        nativeResetCustomInfo();
    }

    public static ANRCallback anrCallback(ANRCallback aNRCallback) {
        ANRCallback aNRCallback2 = mANRCallback;
        mANRCallback = aNRCallback;
        return aNRCallback2;
    }

    public static CrashCallback crashCallback(CrashCallback crashCallback) {
        CrashCallback crashCallback2 = mCrashCallback;
        mCrashCallback = crashCallback;
        return crashCallback2;
    }

    public static void init(String str, int i, int i2, boolean z) {
        if (!InitializationProbe.libLoaded) {
            C9556a aVar = new C9556a();
            aVar.mo10233c("wechatcrash");
            Object obj = new Object();
            C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/nativecrash/NativeCrash", APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "(Ljava/lang/String;IIZ)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            System.loadLibrary((String) aVar.mo10231a(0));
            C117292a.m165359e(obj, "com/tencent/nativecrash/NativeCrash", APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "(Ljava/lang/String;IIZ)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        }
        nativeInit(str, i, i2, z);
    }

    public static void init(ParcelFileDescriptor[] parcelFileDescriptorArr, int i, int i2) {
        if (!InitializationProbe.libLoaded) {
            C9556a aVar = new C9556a();
            aVar.mo10233c("wechatcrash");
            Object obj = new Object();
            C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/nativecrash/NativeCrash", APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "([Landroid/os/ParcelFileDescriptor;II)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            System.loadLibrary((String) aVar.mo10231a(0));
            C117292a.m165359e(obj, "com/tencent/nativecrash/NativeCrash", APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "([Landroid/os/ParcelFileDescriptor;II)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        }
        int[] iArr = new int[parcelFileDescriptorArr.length];
        for (int i3 = 0; i3 < parcelFileDescriptorArr.length; i3++) {
            ParcelFileDescriptor parcelFileDescriptor = parcelFileDescriptorArr[i3];
            iArr[i3] = parcelFileDescriptor == null ? -1 : parcelFileDescriptor.getFd();
        }
        nativeInitFd(iArr, i, i2);
    }
}
