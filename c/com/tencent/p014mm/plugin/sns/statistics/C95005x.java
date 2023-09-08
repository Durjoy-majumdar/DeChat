package com.tencent.p014mm.plugin.sns.statistics;

import com.tencent.p014mm.autogen.mmdata.rpt.SnsVideoPublishLogStruct;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.HashMap;

/* renamed from: com.tencent.mm.plugin.sns.statistics.x */
public final class C95005x {

    /* renamed from: a */
    public static final C95005x f275632a = new C95005x();

    /* renamed from: b */
    public static String f275633b = "";

    /* renamed from: c */
    public static SnsVideoPublishLogStruct f275634c = new SnsVideoPublishLogStruct();

    /* renamed from: d */
    public static boolean f275635d;

    /* renamed from: e */
    public static boolean f275636e;

    /* renamed from: f */
    public static HashMap<String, SnsVideoPublishLogStruct> f275637f = new HashMap<>();

    /* renamed from: g */
    public static long f275638g;

    /* renamed from: a */
    public final int mo131406a() {
        SnsMethodCalculate.markStartTimeMs("getIsBackgroundUserType", "com.tencent.mm.plugin.sns.statistics.SnsVideoPublishReporter");
        C30420b bVar = C30420b.f82051a;
        int i = (bVar.mo57380d() || bVar.mo57381e()) ? 1 : 0;
        SnsMethodCalculate.markEndTimeMs("getIsBackgroundUserType", "com.tencent.mm.plugin.sns.statistics.SnsVideoPublishReporter");
        return i;
    }

    /* renamed from: b */
    public final void mo131407b(int i) {
        SnsMethodCalculate.markStartTimeMs("reportUserAction", "com.tencent.mm.plugin.sns.statistics.SnsVideoPublishReporter");
        Log.m105924i("MicroMsg.SnsVideoPublishReporter", "reportUserAction: " + i + ", " + f275633b + ", " + f275635d + ", " + f275636e);
        if (!f275635d) {
            mo131408c();
            SnsMethodCalculate.markEndTimeMs("reportUserAction", "com.tencent.mm.plugin.sns.statistics.SnsVideoPublishReporter");
            return;
        }
        if (i != 3 || !f275636e) {
            SnsVideoPublishLogStruct snsVideoPublishLogStruct = f275634c;
            snsVideoPublishLogStruct.f266238e = i;
            snsVideoPublishLogStruct.f266239f = mo131406a();
            f275634c.mo86054n();
        } else {
            Log.m105924i("MicroMsg.SnsVideoPublishReporter", "reportUserAction >> report is fake video publish");
            HashMap<String, SnsVideoPublishLogStruct> hashMap = f275637f;
            String str = f275634c.f266237d;
            C87412m.m108593f(str, "reportStruct.sessionid");
            hashMap.put(str, f275634c);
        }
        mo131408c();
        SnsMethodCalculate.markEndTimeMs("reportUserAction", "com.tencent.mm.plugin.sns.statistics.SnsVideoPublishReporter");
    }

    /* renamed from: c */
    public final void mo131408c() {
        SnsMethodCalculate.markStartTimeMs("reset", "com.tencent.mm.plugin.sns.statistics.SnsVideoPublishReporter");
        Log.m105924i("MicroMsg.SnsVideoPublishReporter", "reset >> " + f275633b);
        f275634c = new SnsVideoPublishLogStruct();
        f275635d = false;
        f275636e = false;
        f275638g = 0;
        SnsMethodCalculate.markEndTimeMs("reset", "com.tencent.mm.plugin.sns.statistics.SnsVideoPublishReporter");
    }

    /* renamed from: d */
    public final void mo131409d(boolean z) {
        SnsMethodCalculate.markStartTimeMs("setIsCurrentFakeVideo", "com.tencent.mm.plugin.sns.statistics.SnsVideoPublishReporter");
        Log.m105924i("MicroMsg.SnsVideoPublishReporter", "setIsCurrentFakeVideo >> " + z);
        f275636e = z;
        SnsMethodCalculate.markEndTimeMs("setIsCurrentFakeVideo", "com.tencent.mm.plugin.sns.statistics.SnsVideoPublishReporter");
    }
}
