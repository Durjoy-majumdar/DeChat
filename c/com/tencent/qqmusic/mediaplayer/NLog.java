package com.tencent.qqmusic.mediaplayer;

import android.util.Log;
import com.tencent.qqmusic.mediaplayer.util.Logger;

public class NLog {
    private static final int LEVEL_DEBUG = 1;
    private static final int LEVEL_ERROR = 4;
    private static final int LEVEL_INFO = 2;
    private static final int LEVEL_WARNING = 3;
    private static final String TAG = "NLog";
    private static volatile boolean mIsLoadSuccess;

    /* renamed from: D */
    public static void m21774D(String str, String str2) {
        if (!mIsLoadSuccess) {
            Logger.m21787e(TAG, "Not load NLog lib!!!");
            return;
        }
        try {
            m21782d(str, str2);
        } catch (UnsatisfiedLinkError e) {
            Logger.m21790e(TAG, (Throwable) e);
        }
    }

    /* renamed from: E */
    public static void m21776E(String str, String str2) {
        if (!mIsLoadSuccess) {
            Logger.m21787e(TAG, "Not load NLog lib!!!");
            return;
        }
        try {
            m21783e(str, str2);
        } catch (UnsatisfiedLinkError e) {
            Logger.m21790e(TAG, (Throwable) e);
        }
    }

    public static String GetLogPath() {
        if (!mIsLoadSuccess) {
            Logger.m21787e(TAG, "Not load NLog lib!!!");
            return "";
        }
        try {
            return getLogPath();
        } catch (UnsatisfiedLinkError e) {
            Logger.m21790e(TAG, (Throwable) e);
            return "";
        }
    }

    /* renamed from: I */
    public static void m21778I(String str, String str2) {
        if (!mIsLoadSuccess) {
            Logger.m21787e(TAG, "Not load NLog lib!!!");
            return;
        }
        try {
            m21784i(str, str2);
        } catch (UnsatisfiedLinkError e) {
            Logger.m21790e(TAG, (Throwable) e);
        }
    }

    public static boolean Start(String str, int i) {
        if (!mIsLoadSuccess) {
            Logger.m21787e(TAG, "Not load NLog lib!!!");
            return false;
        }
        try {
            return start(str, i);
        } catch (UnsatisfiedLinkError e) {
            Logger.m21790e(TAG, (Throwable) e);
            return false;
        }
    }

    public static void Stop() {
        if (!mIsLoadSuccess) {
            Logger.m21787e(TAG, "Not load NLog lib!!!");
            return;
        }
        try {
            stop();
        } catch (UnsatisfiedLinkError e) {
            Logger.m21790e(TAG, (Throwable) e);
        }
    }

    /* renamed from: W */
    public static void m21780W(String str, String str2) {
        if (!mIsLoadSuccess) {
            Logger.m21787e(TAG, "Not load NLog lib!!!");
            return;
        }
        try {
            m21785w(str, str2);
        } catch (UnsatisfiedLinkError e) {
            Logger.m21790e(TAG, (Throwable) e);
        }
    }

    private static void WriteLogCallback(int i, String str, String str2) {
        if (i == 1) {
            Logger.m21786d(str, str2);
        } else if (i == 2) {
            Logger.m21791i(str, str2);
        } else if (i == 3) {
            Logger.m21793w(str, str2);
        } else if (i != 4) {
            Logger.m21791i(str, str2);
        } else {
            Logger.m21787e(str, str2);
        }
    }

    /* renamed from: d */
    private static native void m21782d(String str, String str2);

    /* renamed from: e */
    private static native void m21783e(String str, String str2);

    private static native String getLogPath();

    /* renamed from: i */
    private static native void m21784i(String str, String str2);

    public static boolean init(String str, String str2, int i) {
        if (!AudioPlayerConfigure.getSoLibraryLoader().load(str)) {
            return false;
        }
        mIsLoadSuccess = true;
        Start(str2, i);
        return true;
    }

    private static native void setLogWriteCallback(int i);

    public static void setWriteCallback(boolean z) {
        if (!mIsLoadSuccess) {
            Logger.m21787e(TAG, "Not load NLog lib!!!");
            return;
        }
        try {
            setLogWriteCallback(z ? 1 : 0);
        } catch (UnsatisfiedLinkError e) {
            Logger.m21790e(TAG, (Throwable) e);
        }
    }

    private static native boolean start(String str, int i);

    private static native void stop();

    /* renamed from: w */
    private static native void m21785w(String str, String str2);

    /* renamed from: D */
    public static void m21775D(String str, String str2, Throwable th) {
        m21782d(str, str2 + "\n" + Log.getStackTraceString(th));
    }

    /* renamed from: E */
    public static void m21777E(String str, String str2, Throwable th) {
        m21783e(str, str2 + "\n" + Log.getStackTraceString(th));
    }

    /* renamed from: I */
    public static void m21779I(String str, String str2, Throwable th) {
        m21784i(str, str2 + "\n" + Log.getStackTraceString(th));
    }

    /* renamed from: W */
    public static void m21781W(String str, String str2, Throwable th) {
        m21785w(str, str2 + "\n" + Log.getStackTraceString(th));
    }
}
