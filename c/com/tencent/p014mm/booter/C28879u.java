package com.tencent.p014mm.booter;

import com.tencent.p014mm.sdk.crash.CrashReportFactory;
import com.tencent.p014mm.sdk.platformtools.ChannelUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import eb0.C97625j3;
import f40.C86709a0;
import lc3.C10485b;
import p823sg.C101615j;
import qe3.C89625d;

/* renamed from: com.tencent.mm.booter.u */
public class C28879u {
    /* renamed from: a */
    public static void m38413a() {
        int b = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("EnableForgroundService", 0);
        int b2 = C101615j.m133462b(C97625j3.m125812b().mo105881G(), 101);
        boolean z = CrashReportFactory.hasDebuger() || (b > 0 && b2 >= 0 && b2 <= b);
        if (!z) {
            z = C89625d.f257845k;
        }
        if (!z) {
            z = CrashReportFactory.hasDebuger();
        }
        if (ChannelUtil.channelId == 1) {
            z = false;
        }
        MMApplicationContext.getContext().getSharedPreferences("system_config_prefs", 0).edit().putBoolean("set_service", z).commit();
        Log.m105925i("MicroMsg.PostTaskSetPushForegroundService", "Set service, userHash:%d, prob:%d, enabled: %b  isalpha:%b channel:%d", Integer.valueOf(b2), Integer.valueOf(b), Boolean.valueOf(z), Boolean.valueOf(C89625d.f257845k), Integer.valueOf(ChannelUtil.channelId));
    }
}
