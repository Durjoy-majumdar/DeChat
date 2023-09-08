package com.tencent.p014mm.plugin.finder.extension.reddot;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import eb0.C31543z5;
import f40.C86709a0;
import up1.C37521f;

/* renamed from: com.tencent.mm.plugin.finder.extension.reddot.v0 */
public final class C29946v0 {

    /* renamed from: a */
    public static final C29946v0 f81102a = new C29946v0();

    /* renamed from: a */
    public final boolean mo57020a() {
        C37521f.f99374d.getClass();
        if (C37521f.f99299U2.mo60266n().intValue() == 1) {
            return true;
        }
        mo57023d(0);
        return false;
    }

    /* renamed from: b */
    public final boolean mo57021b() {
        if (!mo57020a()) {
            return false;
        }
        mo57022c();
        C37521f.f99374d.getClass();
        int intValue = C37521f.f99308V2.mo60266n().intValue();
        long G = C86709a0.m107535s().mo121142i().mo119673G(C72994y1.C72995a.USERINFO_FINDER_THREE_DAY_BEGIN_TIME_LONG_SYNC, 0);
        long G2 = C86709a0.m107535s().mo121142i().mo119673G(C72994y1.C72995a.USERINFO_FINDER_THREE_DAY_HIT_TIME_LONG_SYNC, 0);
        long c = C31543z5.m39453c() - G;
        Log.m105924i("Finder.ThreeDayTwoDay", "[checkOverThreeDay] hasRed=" + false + " threadDayBegin=" + G + " threeDayThreshold=" + intValue + " hitThreeDayTime=" + G2 + " diffThreeDay=" + c);
        return c >= ((long) intValue);
    }

    /* renamed from: c */
    public final void mo57022c() {
        boolean a = mo57020a();
        if (a) {
            long G = C86709a0.m107535s().mo121142i().mo119673G(C72994y1.C72995a.USERINFO_FINDER_THREE_DAY_BEGIN_TIME_LONG_SYNC, 0);
            Log.m105924i("Finder.ThreeDayTwoDay", "[checkThreeDayTwoDay] isEnable=" + a + " begin=" + G + " hasRed=" + false);
        }
    }

    /* renamed from: d */
    public final void mo57023d(long j) {
        Log.m105924i("Finder.ThreeDayTwoDay", "[reset] begin=" + j);
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_THREE_DAY_HIT_TIME_LONG_SYNC, 0L);
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_THREE_DAY_BEGIN_TIME_LONG_SYNC, Long.valueOf(j));
    }
}
