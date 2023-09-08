package zk1;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import bk1.C54488b;
import cj1.C54738b1;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.FinderLiveScrollSquareStatusEvent;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.live.scrollsquare.widget.FinderLiveScrollSquareLayout;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import gy3.C87412m;
import rx3.C13598b0;
import te3.C64836xp2;

/* renamed from: zk1.o0 */
public final class C66878o0 extends UIComponent implements C54488b {

    /* renamed from: d */
    public C54738b1 f192122d;

    /* renamed from: e */
    public int f192123e = -1;

    /* renamed from: f */
    public boolean f192124f = true;

    /* renamed from: g */
    public FinderLiveScrollSquareLayout f192125g;

    /* renamed from: h */
    public boolean f192126h;

    /* renamed from: i */
    public long f192127i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66878o0(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
    }

    /* renamed from: O0 */
    public void mo75313O0() {
        C64836xp2 xp22 = new C64836xp2();
        xp22.f186375j = 0;
        C13598b0 b0Var = C13598b0.f38549a;
        mo90871d3(1, xp22);
    }

    /* renamed from: T1 */
    public void mo75314T1() {
        C64836xp2 xp22 = new C64836xp2();
        xp22.f186375j = 1;
        C13598b0 b0Var = C13598b0.f38549a;
        mo90871d3(1, xp22);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
        r0 = (r0 = r0.mo74924b()).f151977d;
     */
    /* renamed from: c3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo90870c3() {
        /*
            r6 = this;
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r0 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r0.getClass()
            al1.i r0 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159398z
            if (r0 == 0) goto L_0x001a
            al1.h r0 = r0.mo74924b()
            if (r0 == 0) goto L_0x001a
            com.tencent.mm.live.api.LiveConfig r0 = r0.f151977d
            if (r0 == 0) goto L_0x001a
            long r0 = r0.f157075s
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            goto L_0x001b
        L_0x001a:
            r0 = 0
        L_0x001b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "isCurrentClickItem enterFeedId: "
            r1.append(r2)
            long r2 = r6.f192127i
            r1.append(r2)
            java.lang.String r2 = " currentLiveFeedId: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "FinderLiveScrollSquareUIC"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            long r1 = r6.f192127i
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0051
            if (r0 != 0) goto L_0x0046
            goto L_0x004f
        L_0x0046:
            long r3 = r0.longValue()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x004f
            goto L_0x0051
        L_0x004f:
            r0 = 0
            goto L_0x0052
        L_0x0051:
            r0 = 1
        L_0x0052:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: zk1.C66878o0.mo90870c3():boolean");
    }

    /* renamed from: d3 */
    public final FinderLiveScrollSquareStatusEvent mo90871d3(long j, C64836xp2 xp22) {
        FinderLiveScrollSquareStatusEvent finderLiveScrollSquareStatusEvent = new FinderLiveScrollSquareStatusEvent();
        FinderLiveScrollSquareStatusEvent.C1050a aVar = finderLiveScrollSquareStatusEvent.f9216d;
        aVar.f9217a = j;
        aVar.f9218b = xp22;
        finderLiveScrollSquareStatusEvent.publish();
        return finderLiveScrollSquareStatusEvent;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x005e, code lost:
        r4 = r4.f154420q;
     */
    /* renamed from: e0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo75315e0(float r9) {
        /*
            r8 = this;
            java.lang.Class<com.tencent.mm.plugin.finder.live.viewmodel.component.FinderLiveExitAnimateOpUIC> r0 = com.tencent.p014mm.plugin.finder.live.viewmodel.component.FinderLiveExitAnimateOpUIC.class
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "onScrollOverFinish translationY: "
            r1.append(r2)
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            java.lang.String r1 = "FinderLiveScrollSquareUIC"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r9)
            te3.xp2 r9 = new te3.xp2
            r9.<init>()
            r2 = 1
            r9.f186375j = r2
            rx3.b0 r3 = rx3.C13598b0.f38549a
            r3 = 1
            r8.mo90871d3(r3, r9)
            r8.f192126h = r2
            bl3.r r9 = bl3.C39818r.f106831a
            androidx.appcompat.app.AppCompatActivity r3 = r8.getActivity()
            bl3.r$a r3 = r9.mo62444c(r3)
            androidx.lifecycle.i0 r3 = r3.mo75002a(r0)
            com.tencent.mm.plugin.finder.live.viewmodel.component.FinderLiveExitAnimateOpUIC r3 = (com.tencent.p014mm.plugin.finder.live.viewmodel.component.FinderLiveExitAnimateOpUIC) r3
            r3.f160022q = r2
            androidx.appcompat.app.AppCompatActivity r3 = r8.getActivity()
            bl3.r$a r9 = r9.mo62444c(r3)
            androidx.lifecycle.i0 r9 = r9.mo75002a(r0)
            com.tencent.mm.plugin.finder.live.viewmodel.component.FinderLiveExitAnimateOpUIC r9 = (com.tencent.p014mm.plugin.finder.live.viewmodel.component.FinderLiveExitAnimateOpUIC) r9
            r9.f160024s = r2
            r2 = 3
            te3.xp2 r9 = new te3.xp2
            r9.<init>()
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r0 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            java.lang.Class<cl1.u> r4 = cl1.C55001u.class
            androidx.lifecycle.i0 r4 = r0.mo77630e(r4)
            cl1.u r4 = (cl1.C55001u) r4
            if (r4 == 0) goto L_0x0065
            te3.c21 r4 = r4.f154420q
            if (r4 == 0) goto L_0x0065
            long r4 = r4.f182392d
            goto L_0x0067
        L_0x0065:
            r4 = 0
        L_0x0067:
            r9.f186373h = r4
            ok1.e r4 = ok1.C62042e.f176370a
            androidx.appcompat.app.AppCompatActivity r5 = r8.getActivity()
            long r6 = r9.f186373h
            te3.h71 r1 = r4.mo87008H(r5, r6, r1)
            r9.f186372g = r1
            long r4 = r8.f192127i
            r9.f186376n = r4
            java.lang.Class<kq.g> r1 = p185kq.C61130g.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            kq.g r1 = (p185kq.C61130g) r1
            java.lang.String r1 = r1.mo33244gK()
            if (r1 != 0) goto L_0x008b
            java.lang.String r1 = ""
        L_0x008b:
            r9.f186377o = r1
            r8.mo90871d3(r2, r9)
            ek1.a r9 = ek1.C7728a.f26169a
            r1 = 3
            r9.mo8843a(r1)
            android.graphics.Point r9 = new android.graphics.Point
            com.tencent.mm.plugin.finder.live.scrollsquare.widget.FinderLiveScrollSquareLayout r1 = r8.f192125g
            if (r1 == 0) goto L_0x00a1
            int r1 = r1.getWidth()
            goto L_0x00a5
        L_0x00a1:
            wh1.a r1 = wh1.C66114a.f190029a
            int r1 = wh1.C66114a.f190030b
        L_0x00a5:
            com.tencent.mm.plugin.finder.live.scrollsquare.widget.FinderLiveScrollSquareLayout r2 = r8.f192125g
            if (r2 == 0) goto L_0x00ae
            int r2 = r2.getHeight()
            goto L_0x00b2
        L_0x00ae:
            wh1.a r2 = wh1.C66114a.f190029a
            int r2 = wh1.C66114a.f190031c
        L_0x00b2:
            r9.<init>(r1, r2)
            r0.mo77607H(r9)
            androidx.fragment.app.Fragment r9 = r8.getFragment()
            if (r9 == 0) goto L_0x00c7
            androidx.fragment.app.FragmentActivity r9 = r9.getActivity()
            if (r9 == 0) goto L_0x00c7
            r9.finish()
        L_0x00c7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zk1.C66878o0.mo75315e0(float):void");
    }

    public void onCreate(Bundle bundle) {
        C54738b1 b1Var;
        super.onCreate(bundle);
        this.f192122d = C54738b1.f153409B.mo560b(getIntent());
        FinderLiveScrollSquareLayout finderLiveScrollSquareLayout = (FinderLiveScrollSquareLayout) getRootView().findViewById(C0966R.C0970id.jtu);
        this.f192125g = finderLiveScrollSquareLayout;
        if (finderLiveScrollSquareLayout != null) {
            finderLiveScrollSquareLayout.setScrollCallback(this);
        }
        long longExtra = getIntent().getLongExtra("CURRENT_FEED_ID", 0);
        this.f192127i = longExtra;
        if (longExtra == 0 && (b1Var = this.f192122d) != null) {
            FinderObject finderObject = b1Var.f153429r;
            long j = finderObject != null ? finderObject.f164794id : 0;
            this.f192127i = j;
            if (j == 0 && b1Var.f153423l.size() > 0) {
                this.f192127i = b1Var.f153423l.get(0).f157075s;
            }
        }
    }
}
