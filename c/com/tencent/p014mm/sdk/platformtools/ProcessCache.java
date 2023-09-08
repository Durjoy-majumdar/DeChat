package com.tencent.p014mm.sdk.platformtools;

import android.content.Context;
import android.os.Process;

/* renamed from: com.tencent.mm.sdk.platformtools.ProcessCache */
public class ProcessCache {
    private static final String TAG = "ProcessCache";
    private static String myPidProcessNameCache;

    public static String getProcessNameByPidFromCache(Context context, int i) {
        Log.m105924i(TAG, "getProcessNameByPidFromCache");
        if (i != Process.myPid()) {
            return Util.getProcessNameByPidOriginal(context, i);
        }
        String str = myPidProcessNameCache;
        if (str == null || str.isEmpty()) {
            myPidProcessNameCache = Util.getProcessNameByPidOriginal(context, i);
        }
        return myPidProcessNameCache;
    }
}
