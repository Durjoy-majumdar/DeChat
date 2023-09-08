package com.tencent.youtu.ytcommon.auth;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.Looper;
import com.tencent.youtu.ytcommon.auth.HttpUtil;
import com.tencent.youtu.ytcommon.tools.YTLogger;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

public class YTAuthJNIInterface {
    private static final String DAT_SUFFIX = "SDK.dat";
    private static final String LICENCE_SUFFIX = "SDK.licence";
    private static final String SDK_NAME = "YoutuFaceTrack";
    private static final String SDK_PREFIX = "YT";
    private static final String TAG = "log_print_java";
    private static String VERSION = "1.2";
    /* access modifiers changed from: private */
    public static long handle = 0;
    private static boolean isReportStarted = false;
    private static String licenceStr = "";
    /* access modifiers changed from: private */
    public static HttpUtil.HttpResponseListener mListener = new HttpUtil.HttpResponseListener() {
        public void onFail(int i) {
            try {
                YTLogger.m144666d(YTAuthJNIInterface.TAG, "http request error : " + i);
                YTLogger.m144666d(YTAuthJNIInterface.TAG, "handle: " + YTAuthJNIInterface.handle);
                long unused = YTAuthJNIInterface.nativeUpdateFromServer(YTAuthJNIInterface.handle, (String) null);
            } catch (Exception unused2) {
            }
        }

        public void onSuccess(String str) {
            try {
                YTLogger.m144666d(YTAuthJNIInterface.TAG, "response: " + str);
                YTLogger.m144666d(YTAuthJNIInterface.TAG, "handle: " + YTAuthJNIInterface.handle);
                long unused = YTAuthJNIInterface.nativeUpdateFromServer(YTAuthJNIInterface.handle, str);
            } catch (Exception unused2) {
            }
        }
    };
    private static Timer timerFlush;
    private static Timer timerReport;
    private long nativePtr;

    public static boolean check() {
        boolean nativeCheck = nativeCheck(handle);
        YTLogger.m144666d("sdk", "--------------check");
        return nativeCheck;
    }

    private static native int getCurrentAuthStatus(long j);

    public static long getHandle() {
        return handle;
    }

    private static native int getIsNeedReport(long j);

    /* access modifiers changed from: private */
    public static native String getReportContent();

    public static int init(Context context, String str, int i, boolean z) {
        YTLogger.m144666d(TAG, "start init");
        String str2 = context.getFilesDir().getPath() + "/" + SDK_PREFIX + SDK_NAME + DAT_SUFFIX;
        YTLogger.m144666d(TAG, "path: " + str2);
        handle = nativeInitN(context, i, str, context.getAssets(), str2);
        YTLogger.m144666d(TAG, "handleinit: " + handle);
        if (getIsNeedReport(handle) == 0) {
            YTLogger.m144666d(TAG, "no need to report");
        } else {
            YTLogger.m144666d(TAG, "need report");
            startTimer();
        }
        return getCurrentAuthStatus(handle);
    }

    private static boolean isInMainThread() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    private static native boolean nativeCheck(long j);

    /* access modifiers changed from: private */
    public static native long nativeFlush();

    private static native long nativeInitN(Context context, int i, String str, AssetManager assetManager, String str2);

    private static native int nativePreInitAndCheck(byte[] bArr, int i, String str, String str2, String str3);

    /* access modifiers changed from: private */
    public static native long nativeUpdateFromServer(long j, String str);

    public static int preCheckAndInitWithLicenceStr(Context context, String str) {
        licenceStr = str;
        try {
            byte[] bytes = str.getBytes();
            int length = bytes.length;
            if (length > 0) {
                String str2 = context.getFilesDir().getPath() + "/" + SDK_PREFIX + SDK_NAME + DAT_SUFFIX;
                String packageName = context.getPackageName();
                String deviceUid = StatisticsUtils.getDeviceUid(context);
                YTLogger.m144666d(TAG, "Package name: " + packageName);
                YTLogger.m144666d(TAG, "Device id: " + deviceUid);
                return nativePreInitAndCheck(bytes, length, packageName, deviceUid, str2);
            }
            throw new IOException("licence error");
        } catch (IOException unused) {
            return -1;
        }
    }

    public static void report(final String str) {
        if (isInMainThread()) {
            new Thread(new Runnable() {
                public void run() {
                    try {
                        HttpUtil.post("https://api.youtu.qq.com/auth/report", str, YTAuthJNIInterface.mListener);
                    } catch (IOException unused) {
                    }
                }
            }).start();
            return;
        }
        try {
            HttpUtil.post("https://api.youtu.qq.com/auth/report", str, mListener);
        } catch (IOException unused) {
        }
    }

    private static void startTimer() {
        YTLogger.m144666d(TAG, "start timer");
        if (!isReportStarted) {
            C203531 r2 = new TimerTask() {
                public void run() {
                    String access$000 = YTAuthJNIInterface.getReportContent();
                    if (access$000 != "") {
                        YTAuthJNIInterface.report(access$000);
                    }
                }
            };
            Timer timer = new Timer(true);
            timerReport = timer;
            timer.schedule(r2, 600000, 600000);
            C203542 r8 = new TimerTask() {
                public void run() {
                    YTLogger.m144666d(YTAuthJNIInterface.TAG, "flush in java ");
                    long unused = YTAuthJNIInterface.nativeFlush();
                }
            };
            Timer timer2 = new Timer(true);
            timerFlush = timer2;
            timer2.schedule(r8, 600000, 600000);
            isReportStarted = true;
        }
    }
}
