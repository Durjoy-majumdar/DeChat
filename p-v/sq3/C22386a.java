package sq3;

import com.tencent.p014mm.view.refreshLayout.WxRefreshLayout;
import gy3.C87412m;
import mq3.C21524b;
import oq3.C21805g;
import rq3.C22243b;

/* renamed from: sq3.a */
public final class C22386a {

    /* renamed from: a */
    public final WxRefreshLayout f63469a;

    /* renamed from: b */
    public C22243b f63470b;

    /* renamed from: c */
    public C22243b f63471c;

    /* renamed from: d */
    public C21524b f63472d;

    public C22386a(WxRefreshLayout wxRefreshLayout) {
        C87412m.m108594g(wxRefreshLayout, "layout");
        this.f63469a = wxRefreshLayout;
        C22243b bVar = C22243b.None;
        this.f63470b = bVar;
        this.f63471c = bVar;
    }

    /* renamed from: a */
    public final boolean mo35529a() {
        return this.f63470b == C22243b.Loading;
    }

    /* renamed from: b */
    public final boolean mo35530b() {
        return this.f63470b == C22243b.Refreshing;
    }

    /* renamed from: c */
    public final void mo35531c(C22243b bVar) {
        C87412m.m108594g(bVar, "state");
        C22243b bVar2 = this.f63470b;
        if (bVar2 != bVar) {
            this.f63470b = bVar;
            this.f63471c = bVar;
            WxRefreshLayout wxRefreshLayout = this.f63469a;
            wxRefreshLayout.getClass();
            C21805g gVar = wxRefreshLayout.f56664e;
            if (gVar != null) {
                gVar.mo35206a(wxRefreshLayout, wxRefreshLayout.f56667h.f63470b, bVar);
            }
            C21805g gVar2 = wxRefreshLayout.f56665f;
            if (gVar2 != null) {
                gVar2.mo35206a(wxRefreshLayout, wxRefreshLayout.f56667h.f63470b, bVar);
            }
            if (bVar == C22243b.LoadFinish) {
                C21524b bVar3 = wxRefreshLayout.f56671o;
                if (bVar3 != null) {
                    bVar3.f60963f = false;
                } else {
                    C87412m.m108603p("cValues");
                    throw null;
                }
            }
        } else if (this.f63471c != bVar2) {
            this.f63471c = bVar2;
        }
    }

    /* renamed from: d */
    public final void mo35532d(C22243b bVar) {
        C87412m.m108594g(bVar, "state");
        C22243b bVar2 = this.f63470b;
        if (bVar2.f63046f && bVar2.f63044d != bVar.f63044d) {
            mo35531c(C22243b.None);
        }
        if (this.f63471c != bVar) {
            this.f63471c = bVar;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0068, code lost:
        if (r7.f60980w == false) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00dc, code lost:
        if (r7.f60980w == false) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0121, code lost:
        if (r7.f60980w == false) goto L_0x0128;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo35533e(rq3.C22243b r7) {
        /*
            r6 = this;
            java.lang.String r0 = "state"
            gy3.C87412m.m108594g(r7, r0)
            int r0 = r7.ordinal()
            r1 = 0
            r2 = 0
            java.lang.String r3 = "commonValue"
            switch(r0) {
                case 1: goto L_0x0203;
                case 2: goto L_0x01ac;
                case 3: goto L_0x0188;
                case 4: goto L_0x0161;
                case 5: goto L_0x013f;
                case 6: goto L_0x00f5;
                case 7: goto L_0x00ac;
                case 8: goto L_0x0011;
                case 9: goto L_0x008a;
                case 10: goto L_0x0081;
                case 11: goto L_0x0038;
                case 12: goto L_0x0016;
                default: goto L_0x0011;
            }
        L_0x0011:
            r6.mo35531c(r7)
            goto L_0x0222
        L_0x0016:
            rq3.b r7 = r6.f63470b
            boolean r7 = r7.f63047g
            if (r7 != 0) goto L_0x0031
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r7 = r6.f63469a
            mq3.a r0 = r7.getCommonConfig()
            boolean r0 = r0.f126541c
            boolean r7 = r7.mo26618p(r0)
            if (r7 == 0) goto L_0x0031
            rq3.b r7 = rq3.C22243b.ReleaseToRefresh
            r6.mo35531c(r7)
            goto L_0x0222
        L_0x0031:
            rq3.b r7 = rq3.C22243b.ReleaseToRefresh
            r6.mo35532d(r7)
            goto L_0x0222
        L_0x0038:
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r7 = r6.f63469a
            mq3.a r0 = r7.getCommonConfig()
            boolean r0 = r0.f126542d
            boolean r7 = r7.mo26618p(r0)
            if (r7 == 0) goto L_0x007a
            rq3.b r7 = r6.f63470b
            boolean r0 = r7.f63047g
            if (r0 != 0) goto L_0x007a
            boolean r7 = r7.f63048h
            if (r7 != 0) goto L_0x007a
            mq3.b r7 = r6.f63472d
            if (r7 == 0) goto L_0x0076
            boolean r7 = r7.f60979v
            if (r7 == 0) goto L_0x006f
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r7 = r6.f63469a
            mq3.a r7 = r7.getCommonConfig()
            boolean r7 = r7.f126546h
            if (r7 == 0) goto L_0x006f
            mq3.b r7 = r6.f63472d
            if (r7 == 0) goto L_0x006b
            boolean r7 = r7.f60980w
            if (r7 != 0) goto L_0x007a
            goto L_0x006f
        L_0x006b:
            gy3.C87412m.m108603p(r3)
            throw r2
        L_0x006f:
            rq3.b r7 = rq3.C22243b.ReleaseToLoad
            r6.mo35531c(r7)
            goto L_0x0222
        L_0x0076:
            gy3.C87412m.m108603p(r3)
            throw r2
        L_0x007a:
            rq3.b r7 = rq3.C22243b.ReleaseToLoad
            r6.mo35532d(r7)
            goto L_0x0222
        L_0x0081:
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r7 = r6.f63469a
            int r0 = com.tencent.p014mm.view.refreshLayout.WxRefreshLayout.f56656G
            r7.setRefreshingState(r1)
            goto L_0x0222
        L_0x008a:
            rq3.b r7 = r6.f63470b
            boolean r7 = r7.f63047g
            if (r7 != 0) goto L_0x00a5
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r7 = r6.f63469a
            mq3.a r0 = r7.getCommonConfig()
            boolean r0 = r0.f126541c
            boolean r7 = r7.mo26618p(r0)
            if (r7 == 0) goto L_0x00a5
            rq3.b r7 = rq3.C22243b.RefreshReleased
            r6.mo35531c(r7)
            goto L_0x0222
        L_0x00a5:
            rq3.b r7 = rq3.C22243b.RefreshReleased
            r6.mo35532d(r7)
            goto L_0x0222
        L_0x00ac:
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r7 = r6.f63469a
            mq3.a r0 = r7.getCommonConfig()
            boolean r0 = r0.f126542d
            boolean r7 = r7.mo26618p(r0)
            if (r7 == 0) goto L_0x00ee
            rq3.b r7 = r6.f63470b
            boolean r0 = r7.f63047g
            if (r0 != 0) goto L_0x00ee
            boolean r7 = r7.f63048h
            if (r7 != 0) goto L_0x00ee
            mq3.b r7 = r6.f63472d
            if (r7 == 0) goto L_0x00ea
            boolean r7 = r7.f60979v
            if (r7 == 0) goto L_0x00e3
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r7 = r6.f63469a
            mq3.a r7 = r7.getCommonConfig()
            boolean r7 = r7.f126546h
            if (r7 == 0) goto L_0x00e3
            mq3.b r7 = r6.f63472d
            if (r7 == 0) goto L_0x00df
            boolean r7 = r7.f60980w
            if (r7 != 0) goto L_0x00ee
            goto L_0x00e3
        L_0x00df:
            gy3.C87412m.m108603p(r3)
            throw r2
        L_0x00e3:
            rq3.b r7 = rq3.C22243b.PullUpToLoad
            r6.mo35531c(r7)
            goto L_0x0222
        L_0x00ea:
            gy3.C87412m.m108603p(r3)
            throw r2
        L_0x00ee:
            rq3.b r7 = rq3.C22243b.PullUpToLoad
            r6.mo35532d(r7)
            goto L_0x0222
        L_0x00f5:
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r7 = r6.f63469a
            mq3.a r0 = r7.getCommonConfig()
            boolean r0 = r0.f126542d
            boolean r7 = r7.mo26618p(r0)
            if (r7 == 0) goto L_0x0138
            rq3.b r7 = r6.f63470b
            boolean r7 = r7.f63047g
            if (r7 != 0) goto L_0x0138
            mq3.b r7 = r6.f63472d
            if (r7 == 0) goto L_0x0134
            boolean r7 = r7.f60979v
            if (r7 == 0) goto L_0x0128
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r7 = r6.f63469a
            mq3.a r7 = r7.getCommonConfig()
            boolean r7 = r7.f126546h
            if (r7 == 0) goto L_0x0128
            mq3.b r7 = r6.f63472d
            if (r7 == 0) goto L_0x0124
            boolean r7 = r7.f60980w
            if (r7 != 0) goto L_0x0138
            goto L_0x0128
        L_0x0124:
            gy3.C87412m.m108603p(r3)
            throw r2
        L_0x0128:
            rq3.b r7 = rq3.C22243b.PullUpCanceled
            r6.mo35531c(r7)
            rq3.b r7 = rq3.C22243b.None
            r6.mo35533e(r7)
            goto L_0x0222
        L_0x0134:
            gy3.C87412m.m108603p(r3)
            throw r2
        L_0x0138:
            rq3.b r7 = rq3.C22243b.PullUpCanceled
            r6.mo35532d(r7)
            goto L_0x0222
        L_0x013f:
            rq3.b r7 = r6.f63470b
            boolean r7 = r7.f63047g
            if (r7 != 0) goto L_0x015a
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r7 = r6.f63469a
            mq3.a r0 = r7.getCommonConfig()
            boolean r0 = r0.f126541c
            boolean r7 = r7.mo26618p(r0)
            if (r7 == 0) goto L_0x015a
            rq3.b r7 = rq3.C22243b.PullDownToRefresh
            r6.mo35531c(r7)
            goto L_0x0222
        L_0x015a:
            rq3.b r7 = rq3.C22243b.PullDownToRefresh
            r6.mo35532d(r7)
            goto L_0x0222
        L_0x0161:
            rq3.b r7 = r6.f63470b
            boolean r7 = r7.f63047g
            if (r7 != 0) goto L_0x0181
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r7 = r6.f63469a
            mq3.a r0 = r7.getCommonConfig()
            boolean r0 = r0.f126541c
            boolean r7 = r7.mo26618p(r0)
            if (r7 == 0) goto L_0x0181
            rq3.b r7 = rq3.C22243b.PullDownCanceled
            r6.mo35531c(r7)
            rq3.b r7 = rq3.C22243b.None
            r6.mo35533e(r7)
            goto L_0x0222
        L_0x0181:
            rq3.b r7 = rq3.C22243b.PullDownCanceled
            r6.mo35532d(r7)
            goto L_0x0222
        L_0x0188:
            mq3.b r7 = r6.f63472d
            if (r7 == 0) goto L_0x01a8
            r7.f60976s = r1
            rq3.b r0 = r6.f63470b
            rq3.b r2 = rq3.C22243b.None
            if (r0 == r2) goto L_0x019d
            int r0 = r7.f60959b
            if (r0 != 0) goto L_0x019d
            r6.mo35531c(r2)
            goto L_0x0222
        L_0x019d:
            int r7 = r7.f60959b
            if (r7 == 0) goto L_0x0222
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r7 = r6.f63469a
            r7.mo26571c(r1)
            goto L_0x0222
        L_0x01a8:
            gy3.C87412m.m108603p(r3)
            throw r2
        L_0x01ac:
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r7 = r6.f63469a
            r7.getClass()
            lq3.b r0 = new lq3.b
            r0.<init>(r7)
            sq3.a r1 = r7.f56667h
            rq3.b r3 = rq3.C22243b.LoadReleased
            r1.mo35531c(r3)
            mq3.c r1 = r7.getFooterConfig()
            int r1 = r1.f174983a
            int r1 = -r1
            android.animation.ValueAnimator r1 = r7.mo26571c(r1)
            if (r1 == 0) goto L_0x01cd
            r1.addListener(r0)
        L_0x01cd:
            oq3.g r3 = r7.f56665f
            if (r3 == 0) goto L_0x01fd
            mq3.c r4 = r7.getFooterConfig()
            float r4 = r4.f174985c
            r5 = 1092616192(0x41200000, float:10.0)
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 >= 0) goto L_0x01ed
            mq3.c r4 = r7.getFooterConfig()
            int r4 = r4.f174983a
            float r4 = (float) r4
            mq3.c r5 = r7.getFooterConfig()
            float r5 = r5.f174985c
            float r4 = r4 * r5
            goto L_0x01f3
        L_0x01ed:
            mq3.c r4 = r7.getFooterConfig()
            float r4 = r4.f174985c
        L_0x01f3:
            mq3.c r5 = r7.getFooterConfig()
            int r5 = r5.f174983a
            int r4 = (int) r4
            r3.mo34231h(r7, r5, r4)
        L_0x01fd:
            if (r1 != 0) goto L_0x0222
            r0.onAnimationEnd(r2)
            goto L_0x0222
        L_0x0203:
            rq3.b r7 = r6.f63470b
            boolean r7 = r7.f63047g
            if (r7 != 0) goto L_0x021d
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r7 = r6.f63469a
            mq3.a r0 = r7.getCommonConfig()
            boolean r0 = r0.f126542d
            boolean r7 = r7.mo26618p(r0)
            if (r7 == 0) goto L_0x021d
            rq3.b r7 = rq3.C22243b.LoadReleased
            r6.mo35531c(r7)
            goto L_0x0222
        L_0x021d:
            rq3.b r7 = rq3.C22243b.LoadReleased
            r6.mo35532d(r7)
        L_0x0222:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sq3.C22386a.mo35533e(rq3.b):void");
    }
}
