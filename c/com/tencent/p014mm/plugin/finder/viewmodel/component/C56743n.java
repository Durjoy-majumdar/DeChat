package com.tencent.p014mm.plugin.finder.viewmodel.component;

import com.tencent.p014mm.autogen.events.FeedMegaVideoAnimPlayEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import eb0.C31543z5;
import fy3.C32224a;
import gy3.C87413o;
import l31.C61212e;
import o40.C61926c;
import rs1.C13442s8;
import rs1.C63561k8;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C90364q0;
import te3.C49712hj1;

/* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.n */
public final class C56743n extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C56711j f162647d;

    /* renamed from: e */
    public final /* synthetic */ FeedMegaVideoAnimPlayEvent f162648e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C56743n(C56711j jVar, FeedMegaVideoAnimPlayEvent feedMegaVideoAnimPlayEvent) {
        super(0);
        this.f162647d = jVar;
        this.f162648e = feedMegaVideoAnimPlayEvent;
    }

    public Object invoke() {
        C56711j jVar = this.f162647d;
        if (jVar.f162605w != null && jVar.f162606x == this.f162648e.f9160d.f9161a) {
            Log.m105924i("FinderProjectionScreenUIC", "videoEndListener: feedId=" + C61926c.m72691p(this.f162647d.f162606x) + ", device=" + this.f162647d.f162605w);
            C13442s8 f = C13442s8.f38060Q0.mo12873f(this.f162647d.getContext());
            Integer num = null;
            C49712hj1 q3 = f != null ? f.mo12861q3() : null;
            C61212e eVar = (C61212e) C86312j.m106911c(C61212e.class);
            C13604l[] lVarArr = new C13604l[5];
            lVarArr[0] = new C13604l("view_id", "projection_type");
            lVarArr[1] = new C13604l("feed_id", C61926c.m72691p(this.f162647d.f162606x));
            if (q3 != null) {
                num = Integer.valueOf(q3.f134675i);
            }
            lVarArr[2] = new C13604l("comment_scene", num);
            lVarArr[3] = new C13604l("projection_time", Long.valueOf(C31543z5.m39453c() - this.f162647d.f162581E));
            lVarArr[4] = new C13604l("break_source", 2);
            eVar.mo86168ix("break_projection", C90364q0.m113147f(lVarArr), 25496);
            C56711j jVar2 = this.f162647d;
            C61926c.m72668M(new C63561k8(jVar2.f162605w, jVar2, false));
        }
        return C13598b0.f38549a;
    }
}
