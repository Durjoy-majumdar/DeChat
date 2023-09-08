package com.tencent.p014mm.plugin.finder.feed;

import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.bullet.MegaVideoBulletView;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import jq3.C60905o;
import rs1.C63513a1;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.feed.q */
public final class C2855q extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ boolean f14177d;

    /* renamed from: e */
    public final /* synthetic */ BaseFinderFeed f14178e;

    /* renamed from: f */
    public final /* synthetic */ FinderProfileTimelineContract$ProfileTimelinePresenter f14179f;

    /* renamed from: g */
    public final /* synthetic */ C60905o f14180g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2855q(boolean z, BaseFinderFeed baseFinderFeed, FinderProfileTimelineContract$ProfileTimelinePresenter finderProfileTimelineContract$ProfileTimelinePresenter, C60905o oVar) {
        super(0);
        this.f14177d = z;
        this.f14178e = baseFinderFeed;
        this.f14179f = finderProfileTimelineContract$ProfileTimelinePresenter;
        this.f14180g = oVar;
    }

    public Object invoke() {
        Class cls = C63513a1.class;
        if (this.f14177d) {
            this.f14178e.mo3513o().getFeedObject().permissionFlag |= 2048;
        } else {
            this.f14178e.mo3513o().getFeedObject().permissionFlag &= -2049;
        }
        C39818r rVar = C39818r.f106831a;
        C39622i0 a = rVar.mo62444c(this.f14179f.f13136d).mo75002a(cls);
        C87412m.m108593f(a, "UICProvider.of(getActivi…derBulletUIC::class.java)");
        C60905o oVar = this.f14180g;
        FinderProfileTimelineContract$ProfileTimelinePresenter finderProfileTimelineContract$ProfileTimelinePresenter = this.f14179f;
        C63513a1.C63515b bVar = C63513a1.f180138v;
        ((C63513a1) a).mo88370c3(oVar, finderProfileTimelineContract$ProfileTimelinePresenter, true);
        MegaVideoBulletView megaVideoBulletView = (MegaVideoBulletView) this.f14180g.mo85812D(C0966R.C0970id.mq8);
        if (megaVideoBulletView != null) {
            C60905o oVar2 = this.f14180g;
            FinderProfileTimelineContract$ProfileTimelinePresenter finderProfileTimelineContract$ProfileTimelinePresenter2 = this.f14179f;
            Context context = oVar2.f173499A;
            C87412m.m108592e(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            C39622i0 a2 = rVar.mo62444c((AppCompatActivity) context).mo75002a(cls);
            C87412m.m108593f(a2, "UICProvider.of(holder.co…derBulletUIC::class.java)");
            Object obj = oVar2.f173503E;
            C87412m.m108593f(obj, "holder.getAssociatedObject()");
            ((C63513a1) a2).mo88365F3(oVar2, (BaseFinderFeed) obj, false);
            megaVideoBulletView.mo77175a(finderProfileTimelineContract$ProfileTimelinePresenter2.f13147r);
        }
        return C13598b0.f38549a;
    }
}
