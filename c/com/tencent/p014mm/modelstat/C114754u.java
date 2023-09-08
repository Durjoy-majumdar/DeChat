package com.tencent.p014mm.modelstat;

import com.tencent.p014mm.sdk.crash.CrashReportFactory;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.modelstat.u */
public class C114754u implements Runnable {
    public void run() {
        synchronized (C114750t.class) {
            Log.m105925i("MicroMsg.NetTypeReporter", "run scene:%d foreground:%b lastGpsTime:%d", 1005, Boolean.valueOf(CrashReportFactory.foreground), Long.valueOf(C114750t.f344064i));
            try {
                if (C114750t.f344064i > 0) {
                    Log.m105919d("MicroMsg.NetTypeReporter", "report gps scene:%d lastscene:%d [%f,%f,%d] lastGpsTime", 1005, Integer.valueOf(C114750t.f344068m), Float.valueOf(C114750t.f344066k), Float.valueOf(C114750t.f344065j), Integer.valueOf(C114750t.f344067l), Long.valueOf(C114750t.f344064i));
                    long milliSecondsToNow = Util.milliSecondsToNow(C114750t.f344064i);
                    int i = C114750t.f344068m;
                    float f = C114750t.f344065j;
                    float f2 = C114750t.f344066k;
                    int i2 = C114750t.f344067l;
                    C114750t.f344064i = 0;
                    C114750t.f344065j = 0.0f;
                    C114750t.f344066k = 0.0f;
                    C114750t.f344067l = 0;
                    C114750t.f344068m = 0;
                    C114750t.m161438c(i, f2, f, i2, milliSecondsToNow);
                    return;
                } else if (!CrashReportFactory.foreground) {
                    Log.m105929w("MicroMsg.NetTypeReporter", "run is not foreground give up %d ", 1005);
                    return;
                } else {
                    C114750t.m161438c(1005, 0.0f, 0.0f, 0, 0);
                }
            } catch (Throwable th) {
                Log.m105921e("MicroMsg.NetTypeReporter", "run :%s", Util.stackTraceToString(th));
            }
        }
        return;
    }
}
