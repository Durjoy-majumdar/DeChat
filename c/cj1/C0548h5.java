package cj1;

import ak1.C54067f0;
import ak1.C54108o;
import android.os.Bundle;
import cl1.C0654b;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import d60.C58124b;
import di3.C86312j;
import gy3.C87412m;
import java.util.LinkedHashMap;
import p823sg.C101614i;
import rx3.C13598b0;

/* renamed from: cj1.h5 */
public final class C0548h5 {

    /* renamed from: a */
    public static final C0548h5 f1327a = new C0548h5();

    /* renamed from: b */
    public static final C101614i<Long, C0549a> f1328b = new C101614i<>(10);

    /* renamed from: cj1.h5$a */
    public static final class C0549a {

        /* renamed from: a */
        public final C0550b f1329a;

        /* renamed from: b */
        public final String f1330b;

        public C0549a(C0550b bVar, String str) {
            C87412m.m108594g(bVar, "triggerScene");
            C87412m.m108594g(str, "sessionId");
            this.f1329a = bVar;
            this.f1330b = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0549a)) {
                return false;
            }
            C0549a aVar = (C0549a) obj;
            return this.f1329a == aVar.f1329a && C87412m.m108589b(this.f1330b, aVar.f1330b);
        }

        public int hashCode() {
            return (this.f1329a.hashCode() * 31) + this.f1330b.hashCode();
        }

        public String toString() {
            return "ShowBtnContext(triggerScene=" + this.f1329a + ", sessionId=" + this.f1330b + ')';
        }
    }

    /* renamed from: cj1.h5$b */
    public enum C0550b {
        Default,
        Like,
        Comment,
        SendGift,
        WatchTimeOver,
        Lottery,
        GameTeam,
        POI
    }

    /* renamed from: b */
    public static /* synthetic */ void m491b(C0548h5 h5Var, C58124b bVar, long j, C0550b bVar2, boolean z, int i, Object obj) {
        h5Var.mo592a(bVar, j, bVar2, (i & 8) != 0 ? false : z);
    }

    /* renamed from: a */
    public final void mo592a(C58124b bVar, long j, C0550b bVar2, boolean z) {
        Class cls = C0654b.class;
        C87412m.m108594g(bVar, "statusMonitor");
        C87412m.m108594g(bVar2, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        FinderLiveService finderLiveService = FinderLiveService.f159376d;
        C0654b bVar3 = (C0654b) finderLiveService.mo77630e(cls);
        boolean z2 = false;
        boolean c3 = bVar3 != null ? bVar3.mo623c3() : false;
        StringBuilder sb = new StringBuilder();
        sb.append("#checkTriggerShow liveId=");
        sb.append(j);
        sb.append(" scene=");
        sb.append(bVar2);
        sb.append(" shakeBtn=");
        sb.append(z);
        sb.append(" isAnchorFollowed:");
        sb.append(c3);
        sb.append(" isBizMode=");
        C0654b bVar4 = (C0654b) finderLiveService.mo77630e(cls);
        if (bVar4 != null) {
            z2 = bVar4.f1544f;
        }
        sb.append(z2);
        Log.m105924i("Finder.FinderLiveShowFollowBtnLogic", sb.toString());
        if (z && !c3) {
            C58124b.C58125b bVar5 = C58124b.C58125b.SHOW_FOLLOW;
            Bundle bundle = new Bundle();
            bundle.putBoolean("PARAM_FINDER_LIVE_SHAKE_VIEW", z);
            C13598b0 b0Var = C13598b0.f38549a;
            bVar.statusChange(bVar5, bundle);
        }
        C101614i<Long, C0549a> iVar = f1328b;
        if (iVar.check(Long.valueOf(j))) {
            Log.m105924i("Finder.FinderLiveShowFollowBtnLogic", "#checkTriggerShow out");
            return;
        }
        Log.m105924i("Finder.FinderLiveShowFollowBtnLogic", "#checkTriggerShow come in");
        String valueOf = String.valueOf(Util.nowMilliSecond());
        iVar.put(Long.valueOf(j), new C0549a(bVar2, valueOf));
        if (!c3) {
            C54067f0.C0066n nVar = C54067f0.C0066n.FOLLOW_ICON;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("follow_icon_expose_condition", String.valueOf(bVar2.ordinal()));
            linkedHashMap.put("follow_icon_expose_condition_sessionid", valueOf);
            C13598b0 b0Var2 = C13598b0.f38549a;
            ((C54108o) C86312j.m106911c(C54108o.class)).mo9602Jz(nVar, linkedHashMap);
        }
    }
}
