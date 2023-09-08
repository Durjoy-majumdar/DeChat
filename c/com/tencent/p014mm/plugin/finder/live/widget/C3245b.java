package com.tencent.p014mm.plugin.finder.live.widget;

import com.tencent.p014mm.autogen.events.FollowUserEvent;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.live.widget.b */
public final class C3245b extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FollowUserEvent f15428d;

    /* renamed from: e */
    public final /* synthetic */ FinderLiveMemebrProfileWidget f15429e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3245b(FollowUserEvent followUserEvent, FinderLiveMemebrProfileWidget finderLiveMemebrProfileWidget) {
        super(0);
        this.f15428d = followUserEvent;
        this.f15429e = finderLiveMemebrProfileWidget;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.f154820d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke() {
        /*
            r4 = this;
            com.tencent.mm.autogen.events.FollowUserEvent r0 = r4.f15428d
            if (r0 == 0) goto L_0x000f
            com.tencent.mm.autogen.events.FollowUserEvent$a r0 = r0.f154820d
            if (r0 == 0) goto L_0x000f
            int r0 = r0.f154822b
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0010
        L_0x000f:
            r0 = 0
        L_0x0010:
            r1 = 1
            r2 = 2131756283(0x7f1004fb, float:1.914347E38)
            if (r0 != 0) goto L_0x0017
            goto L_0x0050
        L_0x0017:
            int r3 = r0.intValue()
            if (r3 != r1) goto L_0x0050
            com.tencent.mm.plugin.finder.live.widget.FinderLiveMemebrProfileWidget r0 = r4.f15429e
            boolean r1 = r0.f15416u
            if (r1 == 0) goto L_0x0033
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r1 = r1.getResources()
            r3 = 2131828550(0x7f111f46, float:1.9290044E38)
            java.lang.String r1 = r1.getString(r3)
            goto L_0x0042
        L_0x0033:
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r1 = r1.getResources()
            r3 = 2131828548(0x7f111f44, float:1.929004E38)
            java.lang.String r1 = r1.getString(r3)
        L_0x0042:
            java.lang.String r3 = "if (isPrivacyUser) {\n   …                        }"
            gy3.C87412m.m108593f(r1, r3)
            il1.q5 r3 = new il1.q5
            r3.<init>(r0, r1, r2)
            o40.C61926c.m72668M(r3)
            goto L_0x00a7
        L_0x0050:
            r1 = 2
            if (r0 != 0) goto L_0x0054
            goto L_0x007c
        L_0x0054:
            int r3 = r0.intValue()
            if (r3 != r1) goto L_0x007c
            com.tencent.mm.plugin.finder.live.widget.FinderLiveMemebrProfileWidget r0 = r4.f15429e
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r1 = r1.getResources()
            r3 = 2131828579(0x7f111f63, float:1.9290103E38)
            java.lang.String r1 = r1.getString(r3)
            java.lang.String r3 = "getContext().resources.g…ve_profile_unfollow_tips)"
            gy3.C87412m.m108593f(r1, r3)
            r0.getClass()
            il1.q5 r3 = new il1.q5
            r3.<init>(r0, r1, r2)
            o40.C61926c.m72668M(r3)
            goto L_0x00a7
        L_0x007c:
            r1 = 3
            if (r0 != 0) goto L_0x0080
            goto L_0x00a7
        L_0x0080:
            int r0 = r0.intValue()
            if (r0 != r1) goto L_0x00a7
            com.tencent.mm.plugin.finder.live.widget.FinderLiveMemebrProfileWidget r0 = r4.f15429e
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r1 = r1.getResources()
            r3 = 2131828577(0x7f111f61, float:1.9290099E38)
            java.lang.String r1 = r1.getString(r3)
            java.lang.String r3 = "getContext().resources.g…file_unapply_follow_tips)"
            gy3.C87412m.m108593f(r1, r3)
            r0.getClass()
            il1.q5 r3 = new il1.q5
            r3.<init>(r0, r1, r2)
            o40.C61926c.m72668M(r3)
        L_0x00a7:
            com.tencent.mm.plugin.finder.live.widget.FinderLiveMemebrProfileWidget r0 = r4.f15429e
            te3.hx0 r1 = r0.f15413r
            r0.mo3436u(r1)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.widget.C3245b.invoke():java.lang.Object");
    }
}
