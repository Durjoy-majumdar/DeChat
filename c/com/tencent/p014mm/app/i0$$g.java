package com.tencent.p014mm.app;

import android.util.Base64;
import com.tencent.p014mm.sdk.crash.ICrashReporter;
import com.tencent.p014mm.sdk.platformtools.CrashMonitorForJni;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.LinkedList;
import yi0.C39024e;

/* renamed from: com.tencent.mm.app.i0$$g */
public class i0$$g implements CrashMonitorForJni.CrashExtraMessageGetter {
    public String getExtraMessage() {
        StringBuilder sb = new StringBuilder();
        Log.m105924i("MicroMsg.MMCrashReporter", "sCrashExtraMessageGetter.getExtraMessage");
        for (ICrashReporter.ICrashReportExtraMessageGetter iCrashReportExtraMessageGetter : new LinkedList(C80600i0.f235791j)) {
            sb.append(10);
            try {
                if (iCrashReportExtraMessageGetter instanceof C39024e) {
                    Log.m105924i("MicroMsg.MMCrashReporter", "sCrashExtraMessageGetter.getExtraMessage append appbrand message");
                    sb.append("#qbrowser.crashmsg=");
                    sb.append(Base64.encodeToString(iCrashReportExtraMessageGetter.getCrashReportExtraMessage().getBytes(), 2));
                } else {
                    sb.append(iCrashReportExtraMessageGetter.getCrashReportExtraMessage());
                }
            } catch (Throwable th) {
                sb.append(String.format("%s ExtraMessage crashed!: %s", new Object[]{iCrashReportExtraMessageGetter.getClass().getName(), th.getMessage()}));
            }
        }
        return sb.toString();
    }
}
