package com.tencent.p014mm.plugin.finder.live.viewmodel;

import android.content.Context;
import com.tencent.p014mm.p136ui.widget.MMSwitchBtn;
import com.tencent.p014mm.plugin.finder.live.viewmodel.FinderLiveVisitorGameRankSwitchUIC;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import jq3.C60905o;
import ok1.C62042e;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.live.viewmodel.a */
public final class C56119a implements MMSwitchBtn.C7041b {

    /* renamed from: a */
    public final /* synthetic */ FinderLiveVisitorGameRankSwitchUIC.C56117b f160000a;

    /* renamed from: b */
    public final /* synthetic */ C60905o f160001b;

    /* renamed from: c */
    public final /* synthetic */ FinderLiveVisitorGameRankSwitchUIC.C56116a f160002c;

    /* renamed from: d */
    public final /* synthetic */ MMSwitchBtn f160003d;

    /* renamed from: com.tencent.mm.plugin.finder.live.viewmodel.a$a */
    public static final class C56120a extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveVisitorGameRankSwitchUIC.C56116a f160004d;

        /* renamed from: e */
        public final /* synthetic */ FinderLiveVisitorGameRankSwitchUIC.C56117b f160005e;

        /* renamed from: f */
        public final /* synthetic */ boolean f160006f;

        /* renamed from: g */
        public final /* synthetic */ MMSwitchBtn f160007g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56120a(FinderLiveVisitorGameRankSwitchUIC.C56116a aVar, FinderLiveVisitorGameRankSwitchUIC.C56117b bVar, boolean z, MMSwitchBtn mMSwitchBtn) {
            super(1);
            this.f160004d = aVar;
            this.f160005e = bVar;
            this.f160006f = z;
            this.f160007g = mMSwitchBtn;
        }

        public Object invoke(Object obj) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            if (booleanValue) {
                this.f160004d.f159996e.invoke(this.f160005e, Boolean.valueOf(this.f160006f));
            }
            this.f160007g.setCheck(booleanValue);
            return C13598b0.f38549a;
        }
    }

    public C56119a(FinderLiveVisitorGameRankSwitchUIC.C56117b bVar, C60905o oVar, FinderLiveVisitorGameRankSwitchUIC.C56116a aVar, MMSwitchBtn mMSwitchBtn) {
        this.f160000a = bVar;
        this.f160001b = oVar;
        this.f160002c = aVar;
        this.f160003d = mMSwitchBtn;
    }

    public final void onStatusChange(boolean z) {
        C62042e eVar = C62042e.f176370a;
        if (eVar.mo87125w(z, this.f160000a.f159997d)) {
            Context context = this.f160001b.f173499A;
            C87412m.m108593f(context, "holder.context");
            FinderLiveVisitorGameRankSwitchUIC.C56117b bVar = this.f160000a;
            eVar.mo87044T1(context, bVar.f159997d, new C56120a(this.f160002c, bVar, z, this.f160003d));
            return;
        }
        this.f160002c.f159996e.invoke(this.f160000a, Boolean.valueOf(z));
    }
}
