package com.tencent.p014mm.plugin.appbrand.v8_snapshot;

import com.eclipsesource.mmv8.BuildConfig;
import com.tencent.p014mm.plugin.appbrand.app.C1510o;
import com.tencent.p014mm.sdk.crash.CrashReportFactory;
import com.tencent.p014mm.sdk.crash.ICrashReporter;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import gy3.C87412m;
import java.util.concurrent.atomic.AtomicBoolean;
import z04.C112550d0;

/* renamed from: com.tencent.mm.plugin.appbrand.v8_snapshot.x */
public final class C84876x {

    /* renamed from: a */
    public static final C84876x f247386a = new C84876x();

    /* renamed from: b */
    public static final AtomicBoolean f247387b = new AtomicBoolean(false);

    /* renamed from: c */
    public static final String[] f247388c = {WeChatProcess.PROCESS_MAIN, WeChatProcess.PROCESS_APPBRAND0, WeChatProcess.PROCESS_APPBRAND1, WeChatProcess.PROCESS_APPBRAND2, WeChatProcess.PROCESS_APPBRAND3, WeChatProcess.PROCESS_APPBRAND4};

    /* renamed from: d */
    public static final String f247389d;

    /* renamed from: e */
    public static final String f247390e;

    /* renamed from: f */
    public static final String f247391f;

    /* renamed from: g */
    public static final ICrashReporter.ICrashReportListener f247392g = C84877a.f247393a;

    /* renamed from: com.tencent.mm.plugin.appbrand.v8_snapshot.x$a */
    public static final class C84877a implements ICrashReporter.ICrashReportListener {

        /* renamed from: a */
        public static final C84877a f247393a = new C84877a();

        public final void onCrashDumped(String str) {
            C87412m.m108593f(str, StateEvent.Name.MESSAGE);
            int i = 0;
            if (C112550d0.m153801u(str, BuildConfig.APPLICATION_ID, false) || C112550d0.m153801u(str, "mmv8.so", false)) {
                Log.m105924i("MicroMsg.V8CrashMonitor", "found v8 crash");
                C84876x xVar = C84876x.f247386a;
                C1510o oVar = C1510o.f10864a;
                MultiProcessMMKV a = oVar.mo1516a();
                if (a != null) {
                    a.encode(C84876x.f247390e, false);
                }
                MultiProcessMMKV a2 = oVar.mo1516a();
                if (a2 != null) {
                    i = a2.getInt(C84876x.f247391f, 0);
                }
                xVar.mo117629b(i + 1);
            }
        }
    }

    static {
        String processName = MMApplicationContext.getProcessName();
        f247389d = "V8ConsecutiveCrash#StartTimeMills_" + processName;
        f247390e = "V8ConsecutiveCrash#NotCrash_" + processName;
        f247391f = "V8ConsecutiveCrash#Count_" + processName;
    }

    /* renamed from: a */
    public final void mo117628a(long j) {
        MultiProcessMMKV a;
        int i = 0;
        if (f247387b.compareAndSet(false, true)) {
            Log.m105924i("MicroMsg.V8CrashMonitor", "enable");
            long currentTimeMillis = System.currentTimeMillis();
            C1510o oVar = C1510o.f10864a;
            MultiProcessMMKV a2 = oVar.mo1516a();
            long j2 = a2 != null ? a2.getLong(f247389d, 0) : 0;
            if (currentTimeMillis - j2 > j) {
                mo117629b(0);
            }
            MultiProcessMMKV a3 = oVar.mo1516a();
            if (a3 != null ? a3.getBoolean(f247390e, true) : true) {
                mo117629b(0);
            }
            MultiProcessMMKV a4 = oVar.mo1516a();
            if (a4 != null) {
                i = a4.getInt(f247391f, 0);
            }
            if ((i == 0 || 0 == j2) && (a = oVar.mo1516a()) != null) {
                a.encode(f247389d, currentTimeMillis);
            }
            MultiProcessMMKV a5 = oVar.mo1516a();
            if (a5 != null) {
                a5.encode(f247390e, true);
            }
            CrashReportFactory.addCrashReportListener(f247392g);
        }
    }

    /* renamed from: b */
    public final void mo117629b(int i) {
        MultiProcessMMKV a = C1510o.f10864a.mo1516a();
        if (a != null) {
            a.encode(f247391f, i);
        }
    }
}
