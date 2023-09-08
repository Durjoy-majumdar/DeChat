package com.tencent.p014mm.wallet_core.model;

import com.tencent.p014mm.sdk.crash.CrashReportFactory;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.wallet_core.model.m0 */
public class C7088m0 {

    /* renamed from: a */
    public static String f24987a = "";

    /* renamed from: b */
    public static long f24988b = 0;

    /* renamed from: c */
    public static String f24989c = "";

    /* renamed from: a */
    public static String m7307a() {
        if (Util.isNullOrNil(f24987a) || CrashReportFactory.hasDebuger()) {
            Object[] objArr = new Object[3];
            boolean z = false;
            objArr[0] = f24989c;
            long secondsToNow = Util.secondsToNow(f24988b);
            Log.m105918d("MicroMsg.TimeStampHelper", "pass time " + secondsToNow);
            if (secondsToNow > 300) {
                z = true;
            }
            objArr[1] = Boolean.valueOf(z);
            objArr[2] = Long.valueOf(f24988b);
            Log.m105925i("MicroMsg.TimeStampHelper", "getTimeStamp is null from %s isOverdue %s update_time: %s", objArr);
        }
        return f24987a;
    }

    /* renamed from: b */
    public static void m7308b(String str) {
        f24987a = str;
        f24988b = System.currentTimeMillis() / 1000;
        f24989c = Util.getStack().toString();
    }
}
