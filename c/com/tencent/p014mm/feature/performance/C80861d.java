package com.tencent.p014mm.feature.performance;

import com.tencent.p014mm.app.C80600i0;
import com.tencent.p014mm.sdk.crash.ICrashReporter;
import com.tencent.p014mm.sdk.platformtools.MMUncaughtExceptionHandler;
import di3.C86301e;
import ei3.C86522b;
import java.util.Set;
import p757xv.C91348m;

@C86522b
/* renamed from: com.tencent.mm.feature.performance.d */
public class C80861d extends C86301e implements C91348m {
    /* renamed from: jj */
    public void mo112620jj(MMUncaughtExceptionHandler.IOnUncaughtExceptionListener iOnUncaughtExceptionListener) {
        Set<ICrashReporter.ICrashReportExtraMessageGetter> set = C80600i0.f235791j;
        MMUncaughtExceptionHandler.addOnUncaughtExceptionListener(iOnUncaughtExceptionListener);
    }
}
