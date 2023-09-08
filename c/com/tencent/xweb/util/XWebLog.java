package com.tencent.xweb.util;

import android.content.SharedPreferences;
import android.os.Process;
import com.tencent.midas.comm.log.util.APLogFileUtil;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.xwalk.core.XWalkEnvironment;

public class XWebLog {
    private static final String LOG_XWEB_PREFIX = "XWeb.SDK.";
    private static final String SP_KEY_LOG = "log";
    public static final String TAG = "XWebLog";
    private static IXWebLogClient mLogClient;
    private static int sPid = Process.myPid();

    public static void addInitializeLog(String str, String str2) {
        if (str2 != null && !str2.isEmpty()) {
            m21911i(str, str2);
            if (XWalkEnvironment.isTurnOnKVLog) {
                addInitializeLog(" " + str + APLogFileUtil.SEPARATOR_LOG + str2);
            }
        }
    }

    /* renamed from: d */
    public static void m21908d(String str, String str2) {
        String fixLogTag = fixLogTag(str);
        IXWebLogClient iXWebLogClient = mLogClient;
        if (iXWebLogClient != null) {
            iXWebLogClient.mo31419d(fixLogTag, str2);
        }
    }

    /* renamed from: e */
    public static void m21910e(String str, String str2, Throwable th) {
        String fixLogTag = fixLogTag(str);
        IXWebLogClient iXWebLogClient = mLogClient;
        if (iXWebLogClient != null) {
            iXWebLogClient.mo31421e(fixLogTag, str2, th);
        }
    }

    private static String fixLogTag(String str) {
        if (str != null && str.startsWith("MicroMsg")) {
            return str;
        }
        if (str != null && str.startsWith("XWeb.Core")) {
            return str;
        }
        return LOG_XWEB_PREFIX + str;
    }

    public static String getInitializeLog() {
        SharedPreferences mMKVSharedPreferencesForLog = XWebSharedPreferenceUtil.getMMKVSharedPreferencesForLog();
        return mMKVSharedPreferencesForLog == null ? "" : mMKVSharedPreferencesForLog.getString(SP_KEY_LOG, "");
    }

    /* renamed from: i */
    public static void m21911i(String str, String str2) {
        String fixLogTag = fixLogTag(str);
        IXWebLogClient iXWebLogClient = mLogClient;
        if (iXWebLogClient != null) {
            iXWebLogClient.mo31422i(fixLogTag, str2);
        }
    }

    public static void setLogClient(IXWebLogClient iXWebLogClient) {
        mLogClient = iXWebLogClient;
    }

    /* renamed from: v */
    public static void m21912v(String str, String str2) {
        String fixLogTag = fixLogTag(str);
        IXWebLogClient iXWebLogClient = mLogClient;
        if (iXWebLogClient != null) {
            iXWebLogClient.mo31423v(fixLogTag, str2);
        }
    }

    /* renamed from: w */
    public static void m21913w(String str, String str2) {
        String fixLogTag = fixLogTag(str);
        IXWebLogClient iXWebLogClient = mLogClient;
        if (iXWebLogClient != null) {
            iXWebLogClient.mo31424w(fixLogTag, str2);
        }
    }

    /* renamed from: e */
    public static void m21909e(String str, String str2) {
        String fixLogTag = fixLogTag(str);
        IXWebLogClient iXWebLogClient = mLogClient;
        if (iXWebLogClient != null) {
            iXWebLogClient.mo31420e(fixLogTag, str2);
        }
    }

    private static void addInitializeLog(String str) {
        String str2 = sPid + APLogFileUtil.SEPARATOR_LOG + new SimpleDateFormat("MM-dd hh:mm:ss").format(new Date()) + APLogFileUtil.SEPARATOR_LOG + str;
        SharedPreferences mMKVSharedPreferencesForLog = XWebSharedPreferenceUtil.getMMKVSharedPreferencesForLog();
        try {
            String str3 = str2 + "\n" + mMKVSharedPreferencesForLog.getString(SP_KEY_LOG, "");
            if (str3.length() > 10240) {
                str3 = str3.substring(0, 5120);
            }
            mMKVSharedPreferencesForLog.edit().putString(SP_KEY_LOG, str3).apply();
        } catch (Throwable th) {
            m21910e(TAG, "addInitializeLog error", th);
        }
    }
}
