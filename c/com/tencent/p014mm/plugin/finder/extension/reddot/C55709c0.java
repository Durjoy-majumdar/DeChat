package com.tencent.p014mm.plugin.finder.extension.reddot;

import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import di3.C86312j;
import eb0.C31543z5;
import f40.C86709a0;
import gy3.C87412m;
import je1.C60805n4;
import te3.C49712hj1;
import te3.C64259bh0;

/* renamed from: com.tencent.mm.plugin.finder.extension.reddot.c0 */
public final class C55709c0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FinderRedDotExpiredHandler f158568d;

    public C55709c0(FinderRedDotExpiredHandler finderRedDotExpiredHandler) {
        this.f158568d = finderRedDotExpiredHandler;
    }

    public final void run() {
        this.f158568d.getClass();
        C64259bh0 bh02 = new C64259bh0();
        String I = C86709a0.m107535s().mo121142i().mo119675I(C72994y1.C72995a.USERINFO_FINDER_RED_DOT_EXPIRED_INFO_STRING_SYNC, "");
        C87412m.m108593f(I, "value");
        if (I.length() > 0) {
            bh02.parseFrom(Util.decodeHexString(I));
        }
        C55718s0 G5 = this.f158568d.f158519d.mo77227G5("FinderEntrance");
        StringBuilder sb = new StringBuilder();
        sb.append("[checkDoSync] hasEntranceRedDot=");
        sb.append(G5 != null);
        sb.append(" checkInfo=");
        sb.append(C60805n4.m71188a(bh02));
        Log.m105924i("Finder.RedDotExpiredHandler", sb.toString());
        if (G5 != null && bh02.f182286d == 1) {
            C85801v1 i = C86709a0.m107535s().mo121142i();
            C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_FINDER_RED_DOT_EXPIRED_COUNT_INT_SYNC;
            int j = i.mo119689j(aVar, 0);
            C85801v1 i2 = C86709a0.m107535s().mo121142i();
            C72994y1.C72995a aVar2 = C72994y1.C72995a.USERINFO_FINDER_RED_DOT_EXPIRED_LAST_TIME_LONG_SYNC;
            long G = i2.mo119673G(aVar2, 0);
            if (G <= 0) {
                G = G5.field_time;
                if (G <= 0) {
                    G = C31543z5.m39453c();
                }
            }
            long c = C31543z5.m39453c() - G;
            Log.m105924i("Finder.RedDotExpiredHandler", "[checkDoSync] diffTime=" + c + "ms checkCount=" + j + ", checkInfo=" + C60805n4.m71188a(bh02));
            if (j < bh02.f182288f && c >= ((long) (bh02.f182287e * 1000))) {
                this.f158568d.getClass();
                Log.m105924i("Finder.RedDotExpiredHandler", "innerCheckDoSync...");
                ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).f157802n.mo84538g(506365, 8, (C49712hj1) null);
                C86709a0.m107535s().mo121142i().mo119677K(aVar, Integer.valueOf(j + 1));
                C86709a0.m107535s().mo121142i().mo119677K(aVar2, Long.valueOf(C31543z5.m39453c()));
            }
        }
    }
}
