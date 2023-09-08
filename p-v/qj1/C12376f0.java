package qj1;

import ak1.C54067f0;
import ak1.C54108o;
import ak1.C54116w;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.p136ui.widget.MMSwitchBtn;
import com.tencent.p014mm.plugin.finder.live.plugin.FinderLiveAnchorAfterPlugin;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C7335d;
import di3.C86312j;
import gy3.C87412m;
import ht1.C8777j5;
import java.util.HashMap;
import p185kq.C10383h;

/* renamed from: qj1.f0 */
public final class C12376f0 implements MMSwitchBtn.C7041b {

    /* renamed from: a */
    public final /* synthetic */ FinderLiveAnchorAfterPlugin f35636a;

    public C12376f0(FinderLiveAnchorAfterPlugin finderLiveAnchorAfterPlugin) {
        this.f35636a = finderLiveAnchorAfterPlugin;
    }

    public final void onStatusChange(boolean z) {
        String str = ((C54991o) this.f35636a.mo87696x0(C54991o.class)).f154345o;
        long j = ((C55001u) this.f35636a.mo87696x0(C55001u.class)).f154420q.f182392d;
        ((C54116w) C86312j.m106911c(C54116w.class)).getClass();
        C87412m.m108594g(str, "username");
        HashMap hashMap = new HashMap();
        hashMap.put("finder_username", str);
        hashMap.put("liveId", String.valueOf(j));
        C7335d c = C86312j.m106911c(C54108o.class);
        C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
        C8777j5 j5Var = (C8777j5) c;
        C54067f0.C0064m mVar = C54067f0.C0064m.LIVE_END_PAGE_LIVE_PLAYBACK;
        String E = ((C10383h) C86312j.m106911c(C10383h.class)).mo10696E();
        if (E == null) {
            E = "";
        }
        C8777j5.C8778a.m8607h(j5Var, mVar, hashMap, E, "1002", (String) null, 16, (Object) null);
        Log.m105924i("HABBYGE-MALI.HellLiveVisitorReoprter", "report23057, liveid = " + ((String) hashMap.get("liveid")));
        this.f35636a.mo3199a1(z);
        this.f35636a.mo3201b1(z);
    }
}
