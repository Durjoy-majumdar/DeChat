package com.tencent.p014mm.booter;

import com.tencent.p014mm.sdk.crash.CrashReportFactory;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcSharedPreferences;
import eb0.C97625j3;
import f40.C86709a0;
import lc3.C10485b;
import p823sg.C101615j;

/* renamed from: com.tencent.mm.booter.v */
public class C28880v {
    /* renamed from: a */
    public static void m38414a() {
        int b = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("EnableFlockMultiProcSPProb", 0);
        int b2 = C101615j.m133462b(C97625j3.m125812b().mo105881G(), 101);
        boolean z = CrashReportFactory.hasDebuger() || (b > 0 && b2 >= 0 && b2 <= b);
        MultiProcSharedPreferences.DynamicConfigStorage.setValue(MultiProcSharedPreferences.DynamicConfigStorage.PREF_KEY_IS_ENABLE_MULTIPROC_SP, z);
        Log.m105925i("MicroMsg.PostTaskUpdateMultiProcSPSwitchListener", "Update MMImgDecSwitch, userHash:%d, prob:%d, enabled: %b", Integer.valueOf(b2), Integer.valueOf(b), Boolean.valueOf(z));
    }
}
