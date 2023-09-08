package fh1;

import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: fh1.r2 */
public final class C59076r2 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C59079s2 f169018d;

    /* renamed from: e */
    public final /* synthetic */ boolean f169019e;

    /* renamed from: f */
    public final /* synthetic */ boolean f169020f;

    /* renamed from: g */
    public final /* synthetic */ boolean f169021g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59076r2(C59079s2 s2Var, boolean z, boolean z2, boolean z3) {
        super(0);
        this.f169018d = s2Var;
        this.f169019e = z;
        this.f169020f = z2;
        this.f169021g = z3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x007f, code lost:
        if (r0.getVisibility() == 0) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x009e, code lost:
        if ((r0 != null && r0.getVisibility() == 0) != false) goto L_0x00a0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x012f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke() {
        /*
            r11 = this;
            java.lang.Class<fh1.p2> r0 = fh1.C59062p2.class
            fh1.s2 r1 = r11.f169018d
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController r1 = r1.controller(r0)
            fh1.p2 r1 = (fh1.C59062p2) r1
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0029
            boolean r4 = r11.f169019e
            if (r4 != 0) goto L_0x0024
            android.view.ViewGroup r1 = r1.f168986s
            if (r1 == 0) goto L_0x001e
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L_0x001e
            r1 = 1
            goto L_0x001f
        L_0x001e:
            r1 = 0
        L_0x001f:
            if (r1 == 0) goto L_0x0022
            goto L_0x0024
        L_0x0022:
            r1 = 0
            goto L_0x0025
        L_0x0024:
            r1 = 1
        L_0x0025:
            if (r1 != r2) goto L_0x0029
            r1 = 1
            goto L_0x002a
        L_0x0029:
            r1 = 0
        L_0x002a:
            r4 = 0
            if (r1 == 0) goto L_0x0062
            boolean r1 = r11.f169020f
            if (r1 == 0) goto L_0x0062
            fh1.s2 r1 = r11.f169018d
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController r0 = r1.controller(r0)
            fh1.p2 r0 = (fh1.C59062p2) r0
            if (r0 == 0) goto L_0x0062
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r5 = 2131165337(0x7f070099, float:1.7944888E38)
            int r1 = kg3.C76577a.m92157h(r1, r5)
            android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r6 = 2131165346(0x7f0700a2, float:1.7944907E38)
            int r5 = kg3.C76577a.m92157h(r5, r6)
            android.view.ViewGroup r0 = r0.f168981n
            if (r0 == 0) goto L_0x005a
            android.content.Context r0 = r0.getContext()
            goto L_0x005b
        L_0x005a:
            r0 = r4
        L_0x005b:
            int r0 = com.tencent.p014mm.p136ui.C85875k4.m106198o(r0)
            int r5 = r5 - r0
            int r1 = r1 - r5
            goto L_0x0063
        L_0x0062:
            r1 = 0
        L_0x0063:
            fh1.s2 r0 = r11.f169018d
            java.lang.Class<fh1.f2> r5 = fh1.C59018f2.class
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController r0 = r0.controller(r5)
            fh1.f2 r0 = (fh1.C59018f2) r0
            if (r0 == 0) goto L_0x00a7
            ok1.e r5 = ok1.C62042e.f176370a
            boolean r5 = r5.mo87030O0()
            if (r5 == 0) goto L_0x0082
            com.tencent.mm.view.RecyclerHorizontalViewPager r0 = r0.f168878n
            if (r0 == 0) goto L_0x00a2
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x00a2
            goto L_0x00a0
        L_0x0082:
            android.widget.FrameLayout r5 = r0.f168866D
            if (r5 == 0) goto L_0x008e
            int r5 = r5.getVisibility()
            if (r5 != 0) goto L_0x008e
            r5 = 1
            goto L_0x008f
        L_0x008e:
            r5 = 0
        L_0x008f:
            if (r5 == 0) goto L_0x00a2
            com.tencent.mm.view.RecyclerHorizontalViewPager r0 = r0.f168878n
            if (r0 == 0) goto L_0x009d
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x009d
            r0 = 1
            goto L_0x009e
        L_0x009d:
            r0 = 0
        L_0x009e:
            if (r0 == 0) goto L_0x00a2
        L_0x00a0:
            r0 = 1
            goto L_0x00a3
        L_0x00a2:
            r0 = 0
        L_0x00a3:
            if (r0 != r2) goto L_0x00a7
            r0 = 1
            goto L_0x00a8
        L_0x00a7:
            r0 = 0
        L_0x00a8:
            if (r0 == 0) goto L_0x00ba
            boolean r0 = r11.f169020f
            if (r0 == 0) goto L_0x00ba
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r5 = 2131165324(0x7f07008c, float:1.7944862E38)
            int r0 = kg3.C76577a.m92157h(r0, r5)
            goto L_0x00bb
        L_0x00ba:
            r0 = 0
        L_0x00bb:
            int r1 = r1 + r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "adjustVideoSpace isNeedNotifyAdjustLayout: "
            r0.append(r5)
            boolean r5 = r11.f169021g
            r0.append(r5)
            java.lang.String r5 = " needShow: "
            r0.append(r5)
            boolean r5 = r11.f169020f
            r0.append(r5)
            java.lang.String r5 = " height: "
            r0.append(r5)
            r0.append(r1)
            java.lang.String r5 = " isSkip: "
            r0.append(r5)
            boolean r5 = r11.f169019e
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r5 = "LiveVideoMarginAdjustController"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            fh1.s2 r0 = r11.f169018d
            if (r1 <= 0) goto L_0x011f
            android.widget.Space r5 = r0.f169027n
            if (r5 == 0) goto L_0x00ff
            int r5 = r5.getHeight()
            if (r5 != 0) goto L_0x00ff
            r3 = 1
        L_0x00ff:
            if (r3 == 0) goto L_0x0122
            int r3 = r0.f169030q
            if (r3 != 0) goto L_0x0122
            java.lang.Class<qj1.ze> r3 = qj1.C63170ze.class
            qj1.c r3 = r0.mo9307d3(r3)
            qj1.ze r3 = (qj1.C63170ze) r3
            if (r3 == 0) goto L_0x0122
            com.tencent.rtmp.ui.TXCloudVideoView r3 = r3.mo88092d1()
            r5 = 2
            int[] r5 = new int[r5]
            r3.getLocationOnScreen(r5)
            r3 = r5[r2]
            int r3 = r3 + r1
            r0.f169030q = r3
            goto L_0x0122
        L_0x011f:
            r0.getClass()
        L_0x0122:
            fh1.s2 r0 = r11.f169018d
            r0.mo84288o3(r1)
            fh1.s2 r0 = r11.f169018d
            r0.f169029p = r1
            boolean r0 = r11.f169021g
            if (r0 == 0) goto L_0x0174
            ok1.e r0 = ok1.C62042e.f176370a
            boolean r0 = r0.mo87030O0()
            if (r0 == 0) goto L_0x015d
            fh1.s2 r0 = r11.f169018d
            android.view.ViewGroup r0 = r0.f169026j
            boolean r1 = r0 instanceof com.tencent.p014mm.plugin.finder.live.view.C56061i
            if (r1 == 0) goto L_0x0143
            com.tencent.mm.plugin.finder.live.view.i r0 = (com.tencent.p014mm.plugin.finder.live.view.C56061i) r0
            r5 = r0
            goto L_0x0144
        L_0x0143:
            r5 = r4
        L_0x0144:
            if (r5 == 0) goto L_0x0174
            fl1.f r0 = r5.getStartUIC()
            if (r0 == 0) goto L_0x0174
            c50.b r0 = r0.f166839h
            if (r0 == 0) goto L_0x0154
            org.json.JSONObject r4 = r0.mo85677T()
        L_0x0154:
            r6 = r4
            r7 = 1
            r8 = 0
            r9 = 4
            r10 = 0
            com.tencent.p014mm.plugin.finder.live.view.C56032b.notifySEIMicUserChange$default(r5, r6, r7, r8, r9, r10)
            goto L_0x0174
        L_0x015d:
            fh1.s2 r0 = r11.f169018d
            android.view.ViewGroup r0 = r0.f169026j
            boolean r1 = r0 instanceof com.tencent.p014mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout
            if (r1 == 0) goto L_0x0168
            com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout r0 = (com.tencent.p014mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout) r0
            goto L_0x0169
        L_0x0168:
            r0 = r4
        L_0x0169:
            if (r0 == 0) goto L_0x0174
            hl1.k r0 = r0.getStartUIC()
            if (r0 == 0) goto L_0x0174
            hl1.C59988k.m69861q(r0, r4, r2, r2, r4)
        L_0x0174:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: fh1.C59076r2.invoke():java.lang.Object");
    }
}
