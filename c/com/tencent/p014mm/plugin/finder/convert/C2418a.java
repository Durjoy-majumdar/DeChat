package com.tencent.p014mm.plugin.finder.convert;

import com.tencent.p014mm.autogen.events.FeedContactChangeEvent;
import com.tencent.p014mm.plugin.finder.convert.FinderFeedFullConvert;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.convert.a */
public final class C2418a extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderFeedFullConvert.StateListener<BaseFinderFeed> f12831d;

    /* renamed from: e */
    public final /* synthetic */ FeedContactChangeEvent f12832e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2418a(FinderFeedFullConvert.StateListener<BaseFinderFeed> stateListener, FeedContactChangeEvent feedContactChangeEvent) {
        super(0);
        this.f12831d = stateListener;
        this.f12832e = feedContactChangeEvent;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00d9, code lost:
        if (r2.f27482d != false) goto L_0x00db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0015, code lost:
        r2 = r1.mo3507l();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke() {
        /*
            r5 = this;
            com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$StateListener<com.tencent.mm.plugin.finder.model.BaseFinderFeed> r0 = r5.f12831d
            jq3.o r0 = r0.f12584e
            java.lang.Object r1 = r0.f173503E
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r1
            android.view.View r0 = r0.f44854d
            boolean r0 = r0.isAttachedToWindow()
            if (r0 != 0) goto L_0x0012
            goto L_0x00e4
        L_0x0012:
            r0 = 0
            if (r1 == 0) goto L_0x0020
            fe1.q r2 = r1.mo3507l()
            if (r2 == 0) goto L_0x0020
            java.lang.String r2 = r2.getUsername()
            goto L_0x0021
        L_0x0020:
            r2 = r0
        L_0x0021:
            if (r2 == 0) goto L_0x00e4
            com.tencent.mm.autogen.events.FeedContactChangeEvent r2 = r5.f12832e
            com.tencent.mm.autogen.events.FeedContactChangeEvent$a r2 = r2.f154748d
            if (r2 == 0) goto L_0x002c
            java.lang.String r2 = r2.f154749a
            goto L_0x002d
        L_0x002c:
            r2 = r0
        L_0x002d:
            fe1.q r3 = r1.mo3507l()
            if (r3 == 0) goto L_0x0038
            java.lang.String r3 = r3.getUsername()
            goto L_0x0039
        L_0x0038:
            r3 = r0
        L_0x0039:
            boolean r2 = gy3.C87412m.m108589b(r2, r3)
            if (r2 == 0) goto L_0x00e4
            com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$StateListener<com.tencent.mm.plugin.finder.model.BaseFinderFeed> r2 = r5.f12831d
            com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert<T> r3 = r2.f12583d
            jq3.o r2 = r2.f12584e
            r3.mo2259F0(r1, r2)
            com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$StateListener<com.tencent.mm.plugin.finder.model.BaseFinderFeed> r1 = r5.f12831d
            jq3.o r1 = r1.f12584e
            android.content.Context r1 = r1.f173499A
            boolean r2 = r1 instanceof androidx.appcompat.app.AppCompatActivity
            if (r2 == 0) goto L_0x0055
            androidx.appcompat.app.AppCompatActivity r1 = (androidx.appcompat.app.AppCompatActivity) r1
            goto L_0x0056
        L_0x0055:
            r1 = r0
        L_0x0056:
            if (r1 == 0) goto L_0x0062
            androidx.lifecycle.j r1 = r1.getLifecycle()
            if (r1 == 0) goto L_0x0062
            androidx.lifecycle.j$c r0 = r1.getCurrentState()
        L_0x0062:
            androidx.lifecycle.j$c r1 = androidx.lifecycle.C39623j.C39626c.RESUMED
            if (r0 != r1) goto L_0x00db
            bl3.r r0 = bl3.C39818r.f106831a
            com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$StateListener<com.tencent.mm.plugin.finder.model.BaseFinderFeed> r1 = r5.f12831d
            jq3.o r1 = r1.f12584e
            android.content.Context r1 = r1.f173499A
            java.lang.String r2 = "holder.context"
            gy3.C87412m.m108593f(r1, r2)
            bl3.r$a r1 = r0.mo62443b(r1)
            java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.FinderProfileDrawerUIC> r3 = com.tencent.p014mm.plugin.finder.viewmodel.component.FinderProfileDrawerUIC.class
            androidx.lifecycle.i0 r1 = r1.mo75002a(r3)
            com.tencent.mm.plugin.finder.viewmodel.component.FinderProfileDrawerUIC r1 = (com.tencent.p014mm.plugin.finder.viewmodel.component.FinderProfileDrawerUIC) r1
            as1.a r1 = r1.f18766f
            r3 = 0
            if (r1 == 0) goto L_0x0087
            boolean r1 = r1.f18137q
            goto L_0x0088
        L_0x0087:
            r1 = 0
        L_0x0088:
            if (r1 != 0) goto L_0x00db
            com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$StateListener<com.tencent.mm.plugin.finder.model.BaseFinderFeed> r1 = r5.f12831d
            jq3.o r1 = r1.f12584e
            android.content.Context r1 = r1.f173499A
            gy3.C87412m.m108593f(r1, r2)
            bl3.r$a r1 = r0.mo62443b(r1)
            java.lang.Class<rs1.z0> r4 = rs1.C13559z0.class
            androidx.lifecycle.i0 r1 = r1.mo75002a(r4)
            rs1.z0 r1 = (rs1.C13559z0) r1
            androidx.fragment.app.DialogFragment r1 = r1.f38464d
            if (r1 == 0) goto L_0x00a7
            boolean r3 = r1.isVisible()
        L_0x00a7:
            if (r3 != 0) goto L_0x00db
            com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$StateListener<com.tencent.mm.plugin.finder.model.BaseFinderFeed> r1 = r5.f12831d
            jq3.o r1 = r1.f12584e
            android.content.Context r1 = r1.f173499A
            gy3.C87412m.m108593f(r1, r2)
            bl3.r$a r0 = r0.mo62443b(r1)
            java.lang.Class<mf1.a1> r1 = mf1.C10786a1.class
            androidx.lifecycle.i0 r0 = r0.mo75002a(r1)
            mf1.a1 r0 = (mf1.C10786a1) r0
            com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$StateListener<com.tencent.mm.plugin.finder.model.BaseFinderFeed> r1 = r5.f12831d
            jq3.o r1 = r1.f12584e
            r0.getClass()
            java.lang.String r2 = "holder"
            gy3.C87412m.m108594g(r1, r2)
            gy3.a0 r2 = new gy3.a0
            r2.<init>()
            mf1.q0 r3 = new mf1.q0
            r3.<init>(r2)
            r0.mo11061f3(r1, r3)
            boolean r0 = r2.f27482d
            if (r0 == 0) goto L_0x00e4
        L_0x00db:
            com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$StateListener<com.tencent.mm.plugin.finder.model.BaseFinderFeed> r0 = r5.f12831d
            com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert<T> r1 = r0.f12583d
            jq3.o r0 = r0.f12584e
            r1.mo2306m0(r0)
        L_0x00e4:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.convert.C2418a.invoke():java.lang.Object");
    }
}
