package com.tencent.p014mm.plugin.finder.profile.uic;

import bl3.C39818r;
import cm1.C0740i2;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import java.util.Map;
import q31.C118148a;
import rs1.C13442s8;
import rx3.C13604l;
import sx3.C90364q0;
import te3.C64273c21;

/* renamed from: com.tencent.mm.plugin.finder.profile.uic.e */
public final class C3530e implements C118148a {

    /* renamed from: a */
    public final /* synthetic */ FinderProfileFeedUIC f16383a;

    /* renamed from: b */
    public final /* synthetic */ C0740i2 f16384b;

    public C3530e(FinderProfileFeedUIC finderProfileFeedUIC, C0740i2 i2Var) {
        this.f16383a = finderProfileFeedUIC;
        this.f16384b = i2Var;
    }

    /* renamed from: a */
    public /* synthetic */ boolean mo36a(Object obj, String str, int i) {
        return false;
    }

    /* renamed from: b */
    public final Map<String, Object> mo37b(String str) {
        Class cls = C13442s8.class;
        C13604l[] lVarArr = new C13604l[5];
        C13442s8 f = C13442s8.f38060Q0.mo12873f(this.f16383a.getContext());
        Integer num = null;
        lVarArr[0] = new C13604l("behaviour_session_id", f != null ? f.f38099o : null);
        C39818r rVar = C39818r.f106831a;
        lVarArr[1] = new C13604l("finder_context_id", String.valueOf(((C13442s8) rVar.mo62443b(this.f16383a.getContext()).mo75002a(cls)).f38098n));
        lVarArr[2] = new C13604l("finder_tab_context_id", ((C13442s8) rVar.mo62443b(this.f16383a.getContext()).mo75002a(cls)).f38102q);
        C64273c21 liveInfo = ((BaseFinderFeed) this.f16384b).mo3513o().getLiveInfo();
        if (liveInfo != null) {
            num = Integer.valueOf(liveInfo.f182394f);
        }
        lVarArr[3] = new C13604l("live_enter_status", num);
        lVarArr[4] = new C13604l("share_username", "");
        return C90364q0.m113147f(lVarArr);
    }
}
