package com.tencent.tmassistantsdk.util;

import android.text.TextUtils;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import java.util.HashMap;

public class TMLog {
    public static boolean mDebugFlagForSDK = true;
    public static String mDebugFlagForSDKTag = "";
    public static boolean mHardDebugFlag = true;
    public static HashMap<String, ArrayList<Long>> mUseTimeLongList = new HashMap<>();
    public static HashMap<String, ArrayList<String>> mUseTimeStringList = new HashMap<>();

    /* renamed from: d */
    public static void m164112d(String str, String str2) {
        if (isForDebug()) {
            if (str2 == null) {
                str2 = "............";
            }
            Log.m105918d(str, str2);
        }
    }

    public static void debugE(String str) {
        if (mDebugFlagForSDK && !TextUtils.isEmpty(mDebugFlagForSDKTag)) {
            Log.m105920e(mDebugFlagForSDKTag, str);
        }
    }

    public static void debugV(String str) {
        if (mDebugFlagForSDK && !TextUtils.isEmpty(mDebugFlagForSDKTag)) {
            Log.m105926v(mDebugFlagForSDKTag, str);
        }
    }

    /* renamed from: e */
    public static void m164113e(String str, String str2) {
        if (isForDebug()) {
            if (str2 == null) {
                str2 = "............";
            }
            Log.m105920e(str, str2);
        }
    }

    /* renamed from: i */
    public static void m164114i(String str, String str2) {
        if (isForDebug()) {
            if (str2 == null) {
                str2 = "............";
            }
            Log.m105924i(str, str2);
        }
    }

    public static boolean isForDebug() {
        return mHardDebugFlag;
    }

    public static void setDebugLog(boolean z, String str) {
        mDebugFlagForSDK = z;
        mDebugFlagForSDKTag = str;
    }

    public static void time(String str) {
        time("UseTime", str, false);
    }

    /* renamed from: v */
    public static void m164115v(String str, String str2) {
        if (isForDebug()) {
            if (str2 == null) {
                str2 = "............";
            }
            Log.m105926v(str, str2);
        }
    }

    /* renamed from: w */
    public static void m164116w(String str, String str2) {
        if (isForDebug()) {
            if (str2 == null) {
                str2 = "............";
            }
            Log.m105928w(str, str2);
        }
    }

    public static void time(String str, boolean z) {
        time("UseTime", str, z);
    }

    public static void time(String str, String str2) {
        time(str, str2, false);
    }

    public static void time(String str, String str2, boolean z) {
        if (isForDebug()) {
            ArrayList arrayList = mUseTimeStringList.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                mUseTimeStringList.put(str, arrayList);
            }
            arrayList.add(str2);
            ArrayList arrayList2 = mUseTimeLongList.get(str);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                mUseTimeLongList.put(str, arrayList2);
            }
            arrayList2.add(Long.valueOf(System.currentTimeMillis()));
            if (z) {
                StringBuffer stringBuffer = new StringBuffer();
                long longValue = ((Long) arrayList2.get(0)).longValue();
                stringBuffer.append("total time:");
                stringBuffer.append(((Long) arrayList2.get(arrayList2.size() - 1)).longValue() - longValue);
                stringBuffer.append(" ");
                for (int i = 0; i < arrayList.size(); i++) {
                    stringBuffer.append(((Long) arrayList2.get(i)).longValue() - longValue);
                    longValue = ((Long) arrayList2.get(i)).longValue();
                    stringBuffer.append(" ");
                    stringBuffer.append((String) arrayList.get(i));
                    stringBuffer.append(" ");
                }
                Log.m105926v(str, stringBuffer.toString());
                arrayList.clear();
                arrayList2.clear();
            }
        }
    }
}
