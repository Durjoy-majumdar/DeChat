package com.tencent.p014mm.plugin.zero;

import android.os.Process;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.stubs.logger.Log;

/* renamed from: com.tencent.mm.plugin.zero.v */
public class C85604v implements Log.Logger {
    public C85604v(C85597u uVar) {
    }

    public boolean isLoggable(String str, int i) {
        return i >= 2 && i <= 7 && C85597u.f249510i[i] >= com.tencent.p014mm.sdk.platformtools.Log.getLogLevel();
    }

    public void println(int i, String str, String str2) {
        int i2 = i;
        if (isLoggable(str, i2)) {
            Log.LogImp impl = com.tencent.p014mm.sdk.platformtools.Log.getImpl();
            int myPid = Process.myPid();
            int myTid = Process.myTid();
            switch (i2) {
                case 2:
                    impl.logV(0, str, "", "", 0, myPid, (long) myTid, (long) myPid, str2);
                    return;
                case 3:
                    impl.logD(0, str, "", "", 0, myPid, (long) myTid, (long) myPid, str2);
                    return;
                case 4:
                    impl.logI(0, str, "", "", 0, myPid, (long) myTid, (long) myPid, str2);
                    return;
                case 5:
                    impl.logW(0, str, "", "", 0, myPid, (long) myTid, (long) myPid, str2);
                    return;
                case 6:
                    impl.logE(0, str, "", "", 0, myPid, (long) myTid, (long) myPid, str2);
                    return;
                case 7:
                    impl.logF(0, str, "", "", 0, myPid, (long) myTid, (long) myPid, str2);
                    return;
                default:
                    return;
            }
        }
    }
}
