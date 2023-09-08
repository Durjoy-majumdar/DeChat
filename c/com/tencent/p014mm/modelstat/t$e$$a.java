package com.tencent.p014mm.modelstat;

import android.content.Intent;
import com.tencent.p014mm.autogen.events.MMConnectivityChangeEvent;
import com.tencent.p014mm.sdk.crash.CrashReportFactory;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import f40.C86718e;

/* renamed from: com.tencent.mm.modelstat.t$e$$a */
public final /* synthetic */ class t$e$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Intent f79595d;

    public /* synthetic */ t$e$$a(Intent intent) {
        this.f79595d = intent;
    }

    public final void run() {
        Intent intent = this.f79595d;
        try {
            if (C86709a0.m107523b().mo121114l()) {
                C86709a0.m107523b();
                if (!C86718e.m107551r()) {
                    if (intent != null) {
                        if (!Util.isNullOrNil(intent.getAction())) {
                            String action = intent.getAction();
                            Log.m105925i("MicroMsg.NetTypeReporter", "onReceive action:%s foreground:%b", action, Boolean.valueOf(CrashReportFactory.foreground));
                            if (CrashReportFactory.foreground) {
                                if (action.equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                                    new MMConnectivityChangeEvent().publish();
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                    }
                    Object[] objArr = new Object[1];
                    objArr[0] = intent == null ? "intent is null" : "action is null";
                    Log.m105921e("MicroMsg.NetTypeReporter", "onReceive %s  ", objArr);
                    return;
                }
            }
            C86709a0.m107523b();
            Log.m105921e("MicroMsg.NetTypeReporter", "onReceive acc not ready .%b %b", Boolean.valueOf(C86709a0.m107523b().mo121114l()), Boolean.valueOf(C86718e.m107551r()));
        } catch (Throwable th) {
            Log.m105921e("MicroMsg.NetTypeReporter", "onReceive : %s", Util.stackTraceToString(th));
        }
    }
}
