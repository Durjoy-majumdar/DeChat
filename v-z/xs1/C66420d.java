package xs1;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import cl1.C54991o;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.live.bubble.FrameBubbleContentLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import d60.C58124b;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import o40.C61926c;
import og1.C62009b;
import rx3.C13598b0;

/* renamed from: xs1.d */
public final class C66420d extends C62009b {

    /* renamed from: r */
    public final C58124b f191162r;

    /* renamed from: s */
    public C66417a f191163s;

    /* renamed from: t */
    public C66438m f191164t;

    /* renamed from: u */
    public C66438m f191165u;

    /* renamed from: xs1.d$a */
    public static final class C66421a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C66420d f191166d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66421a(C66420d dVar) {
            super(0);
            this.f191166d = dVar;
        }

        public Object invoke() {
            Class cls = C54991o.class;
            if (((C54991o) this.f191166d.mo87696x0(cls)).mo75999e4()) {
                if (!((C54991o) this.f191166d.mo87696x0(cls)).f154285Y3) {
                    C66417a aVar = this.f191166d.f191163s;
                    if (aVar != null) {
                        aVar.mo90508h1();
                    }
                } else {
                    C66417a aVar2 = this.f191166d.f191163s;
                    if (aVar2 != null) {
                        aVar2.mo90507d();
                    }
                    ((C54991o) this.f191166d.mo87696x0(cls)).f154285Y3 = false;
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66420d(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f191162r = bVar;
        Context context = viewGroup.getContext();
        C87412m.m108593f(context, "root.context");
        this.f191163s = new C66422e(context, mo87684A0(), bVar);
        FrameBubbleContentLayout frameBubbleContentLayout = this.f176279q;
        Context context2 = viewGroup.getContext();
        C87412m.m108592e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        C66438m mVar = new C66438m(false, viewGroup, frameBubbleContentLayout, (MMActivity) context2, this.f191163s);
        this.f191164t = mVar;
        this.f191165u = mVar;
        C66417a aVar = this.f191163s;
        if (aVar != null) {
            aVar.onAttach(mVar);
        }
    }

    /* renamed from: a1 */
    public final boolean mo90514a1() {
        if (!C61926c.m72696u(((C54991o) mo87696x0(C54991o.class)).f154388y0, 131072)) {
            return false;
        }
        Log.m105924i("FinderLiveVoteBubblePlugin", "MMFinderGetLiveMsg_LiveExtFlag_DisableVote");
        mo10792g(8);
        return true;
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0043, code lost:
        r2 = r2.f169896a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00c9 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* renamed from: b1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo90515b1() {
        /*
            r8 = this;
            java.lang.Class<cl1.d0> r0 = cl1.C54963d0.class
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "isCustomMode: isMicMultiOverSize: "
            r1.append(r2)
            androidx.lifecycle.i0 r2 = r8.mo87696x0(r0)
            cl1.d0 r2 = (cl1.C54963d0) r2
            boolean r2 = r2.mo75912T3()
            r1.append(r2)
            java.lang.String r2 = " audienceSize:  "
            r1.append(r2)
            androidx.lifecycle.i0 r2 = r8.mo87696x0(r0)
            cl1.d0 r2 = (cl1.C54963d0) r2
            java.util.List<al1.j> r2 = r2.f154074q
            int r2 = r2.size()
            r1.append(r2)
            java.lang.String r2 = " micSize: "
            r1.append(r2)
            androidx.lifecycle.i0 r2 = r8.mo87696x0(r0)
            cl1.d0 r2 = (cl1.C54963d0) r2
            com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData<gi1.c> r2 = r2.f154077t
            java.lang.Object r2 = r2.getValue()
            gi1.c r2 = (gi1.C59464c) r2
            r3 = 0
            if (r2 == 0) goto L_0x0050
            java.util.LinkedList<gi1.a> r2 = r2.f169896a
            if (r2 == 0) goto L_0x0050
            int r2 = r2.size()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0051
        L_0x0050:
            r2 = r3
        L_0x0051:
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "FinderLiveVoteBubblePlugin"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            androidx.lifecycle.i0 r1 = r8.mo87696x0(r0)
            cl1.d0 r1 = (cl1.C54963d0) r1
            com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData<gi1.c> r1 = r1.f154077t
            java.lang.Object r1 = r1.getValue()
            gi1.c r1 = (gi1.C59464c) r1
            r2 = 0
            r4 = 1
            if (r1 == 0) goto L_0x00ac
            int r5 = r1.f169898c
            if (r5 != r4) goto L_0x00ac
            java.util.LinkedList<gi1.a> r1 = r1.f169896a
            java.util.Iterator r1 = r1.iterator()
        L_0x0079:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x009d
            java.lang.Object r5 = r1.next()
            r6 = r5
            gi1.a r6 = (gi1.C59463a) r6
            java.lang.String r6 = r6.mo84561a()
            java.lang.Class<cl1.u> r7 = cl1.C55001u.class
            androidx.lifecycle.i0 r7 = r8.mo87696x0(r7)
            cl1.u r7 = (cl1.C55001u) r7
            te3.bq2 r7 = r7.f154419p
            java.lang.String r7 = r7.f182319n
            boolean r6 = gy3.C87412m.m108589b(r6, r7)
            if (r6 == 0) goto L_0x0079
            r3 = r5
        L_0x009d:
            gi1.a r3 = (gi1.C59463a) r3
            if (r3 == 0) goto L_0x00ac
            gi1.f r1 = r3.f169895b
            if (r1 == 0) goto L_0x00ac
            int r1 = r1.f169903g
            r3 = 2
            if (r1 != r3) goto L_0x00ac
            r1 = 1
            goto L_0x00ad
        L_0x00ac:
            r1 = 0
        L_0x00ad:
            if (r1 != 0) goto L_0x00c9
            androidx.lifecycle.i0 r0 = r8.mo87696x0(r0)
            cl1.d0 r0 = (cl1.C54963d0) r0
            boolean r0 = r0.mo75912T3()
            if (r0 != 0) goto L_0x00c9
            java.lang.Class<cl1.c0> r0 = cl1.C54949c0.class
            androidx.lifecycle.i0 r0 = r8.mo87696x0(r0)
            cl1.c0 r0 = (cl1.C54949c0) r0
            boolean r0 = r0.mo75866g3()
            if (r0 == 0) goto L_0x00ca
        L_0x00c9:
            r2 = 1
        L_0x00ca:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: xs1.C66420d.mo90515b1():boolean");
    }

    /* renamed from: c1 */
    public final void mo90516c1() {
        if (!mo90514a1()) {
            C61926c.m72668M(new C66421a(this));
        }
    }

    /* renamed from: f0 */
    public int mo14483f0() {
        View view;
        if (!mo90515b1()) {
            return mo86896Z0().getVisibility();
        }
        C66438m mVar = this.f191165u;
        if (mVar == null || (view = mVar.mo86891b()) == null) {
            view = mo86896Z0();
        }
        return view.getVisibility();
    }

    /* JADX WARNING: type inference failed for: r3v5, types: [java.lang.String] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo10792g(int r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            boolean r2 = r18.mo90515b1()
            r3 = 0
            r4 = 0
            if (r2 == 0) goto L_0x005c
            xs1.m r2 = r0.f191165u
            if (r2 == 0) goto L_0x0014
            android.view.View r3 = r2.mo86891b()
        L_0x0014:
            if (r3 != 0) goto L_0x0017
            goto L_0x0059
        L_0x0017:
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r5 = k20.C60958c.f173611a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r19)
            r2.mo10233c(r5)
            java.lang.Object[] r6 = r2.mo10232b()
            java.lang.String r7 = "com/tencent/mm/plugin/finder/vote/plugin/FinderLiveVoteBubblePlugin"
            java.lang.String r8 = "setVisible"
            java.lang.String r9 = "(I)V"
            java.lang.String r10 = "android/view/View_EXEC_"
            java.lang.String r11 = "setVisibility"
            java.lang.String r12 = "(I)V"
            r5 = r3
            j20.C117292a.m165358d(r5, r6, r7, r8, r9, r10, r11, r12)
            java.lang.Object r2 = r2.mo10231a(r4)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r3.setVisibility(r2)
            java.lang.String r6 = "com/tencent/mm/plugin/finder/vote/plugin/FinderLiveVoteBubblePlugin"
            java.lang.String r7 = "setVisible"
            java.lang.String r8 = "(I)V"
            java.lang.String r9 = "android/view/View_EXEC_"
            java.lang.String r10 = "setVisibility"
            java.lang.String r11 = "(I)V"
            j20.C117292a.m165359e(r5, r6, r7, r8, r9, r10, r11)
        L_0x0059:
            r0.f177938i = r1
            return
        L_0x005c:
            java.lang.Class<ky2.i> r2 = ky2.C10432i.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            ky2.i r2 = (ky2.C10432i) r2
            boolean r2 = r2.mo10750e()
            if (r2 == 0) goto L_0x007a
            android.view.ViewGroup r1 = r0.f166287d
            r2 = 8
            r1.setVisibility(r2)
            java.lang.String r1 = "FinderLiveVoteBubblePlugin"
            java.lang.String r2 = "setVisible return for isTeenMode"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r2)
            return
        L_0x007a:
            android.view.View r2 = r18.mo86896Z0()
            k20.a r13 = new k20.a
            r13.<init>()
            java.lang.ThreadLocal<k20.a> r5 = k20.C60958c.f173611a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r19)
            r13.mo10233c(r5)
            java.lang.Object[] r6 = r13.mo10232b()
            java.lang.String r7 = "com/tencent/mm/plugin/finder/vote/plugin/FinderLiveVoteBubblePlugin"
            java.lang.String r8 = "setVisible"
            java.lang.String r9 = "(I)V"
            java.lang.String r10 = "android/view/View_EXEC_"
            java.lang.String r11 = "setVisibility"
            java.lang.String r12 = "(I)V"
            r5 = r2
            j20.C117292a.m165358d(r5, r6, r7, r8, r9, r10, r11, r12)
            java.lang.Object r5 = r13.mo10231a(r4)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r2.setVisibility(r5)
            java.lang.String r6 = "com/tencent/mm/plugin/finder/vote/plugin/FinderLiveVoteBubblePlugin"
            java.lang.String r7 = "setVisible"
            java.lang.String r8 = "(I)V"
            java.lang.String r9 = "android/view/View_EXEC_"
            java.lang.String r10 = "setVisibility"
            java.lang.String r11 = "(I)V"
            r5 = r2
            j20.C117292a.m165359e(r5, r6, r7, r8, r9, r10, r11)
            if (r1 != 0) goto L_0x0112
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            r5 = 1
            java.lang.String r6 = "type"
            r2.put(r6, r5)
            java.lang.Class<cl1.o> r5 = cl1.C54991o.class
            androidx.lifecycle.i0 r5 = r0.mo87696x0(r5)
            cl1.o r5 = (cl1.C54991o) r5
            te3.sa1 r5 = r5.f154275W3
            if (r5 == 0) goto L_0x00dd
            java.lang.String r3 = r5.f141393i
        L_0x00dd:
            java.lang.String r5 = "vote_id"
            r2.put(r5, r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "json.toString()"
            gy3.C87412m.m108593f(r2, r3)
            java.lang.String r3 = ","
            java.lang.String r5 = ";"
            java.lang.String r8 = z04.C112551y.m153814n(r2, r3, r5, r4)
            java.lang.Class<ak1.w> r2 = ak1.C54116w.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            java.lang.String r3 = "getService(HellLiveVisitorReoprter::class.java)"
            gy3.C87412m.m108593f(r2, r3)
            r6 = r2
            ak1.w r6 = (ak1.C54116w) r6
            ak1.f0$o0 r7 = ak1.C54067f0.C54076o0.LIVE_VOTE
            r9 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 252(0xfc, float:3.53E-43)
            r17 = 0
            ak1.C54116w.Ex0(r6, r7, r8, r9, r11, r12, r13, r14, r15, r16, r17)
        L_0x0112:
            super.mo10792g(r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xs1.C66420d.mo10792g(int):void");
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return true;
    }

    /* renamed from: i0 */
    public void mo8357i0() {
        StringBuilder sb = new StringBuilder();
        sb.append("mount ");
        sb.append(hashCode());
        sb.append(" presenter is empty:");
        boolean z = true;
        sb.append(this.f191163s == null);
        sb.append(",viewCallback is empty:");
        if (this.f191165u != null) {
            z = false;
        }
        sb.append(z);
        Log.m105924i("FinderLiveVoteBubblePlugin", sb.toString());
        super.mo8357i0();
        if (this.f191163s == null || this.f191165u == null) {
            Context context = this.f166287d.getContext();
            C87412m.m108593f(context, "root.context");
            this.f191163s = new C66422e(context, mo87684A0(), this.f191162r);
            ViewGroup viewGroup = this.f166287d;
            FrameBubbleContentLayout frameBubbleContentLayout = this.f176279q;
            Context context2 = viewGroup.getContext();
            C87412m.m108592e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            this.f191165u = new C66438m(false, viewGroup, frameBubbleContentLayout, (MMActivity) context2, this.f191163s);
        }
        C66417a aVar = this.f191163s;
        if (aVar != null) {
            C66438m mVar = this.f191165u;
            C87412m.m108591d(mVar);
            aVar.onAttach(mVar);
        }
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return ((C54991o) mo87696x0(C54991o.class)).f154287Z0 != 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008a, code lost:
        if (gy3.C87412m.m108589b(r5 != null ? r5.mo86891b() : null, r2) == false) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0175, code lost:
        if (gy3.C87412m.m108589b(r2 != null ? r2.mo86891b() : null, r1.f166287d) == false) goto L_0x0177;
     */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0295  */
    /* JADX WARNING: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0190  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01d4  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01dc  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x024b  */
    /* renamed from: m0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo11992m0(java.util.LinkedHashMap<java.lang.String, android.graphics.Rect> r24) {
        /*
            r23 = this;
            r1 = r23
            java.lang.Class<cl1.d0> r0 = cl1.C54963d0.class
            java.lang.String r2 = "micUserMap"
            r3 = r24
            gy3.C87412m.m108594g(r3, r2)
            java.lang.Class<ii1.e> r2 = ii1.C60291e.class
            qj1.c r2 = r1.mo87687E0(r2)
            ii1.e r2 = (ii1.C60291e) r2
            r3 = 0
            r4 = 0
            if (r2 == 0) goto L_0x0065
            li1.a r2 = r2.mo85276Z0()
            boolean r5 = r2.mo85558f()
            if (r5 != 0) goto L_0x0022
            goto L_0x0065
        L_0x0022:
            com.tencent.mm.view.ratio.RatioLayout r5 = r2.mo85556d()
            int r5 = r5.getChildCount()
            r6 = 0
        L_0x002b:
            if (r6 >= r5) goto L_0x0065
            com.tencent.mm.view.ratio.RatioLayout r7 = r2.mo85556d()
            android.view.View r7 = r7.getChildAt(r6)
            boolean r8 = r7 instanceof si1.C63902g
            if (r8 == 0) goto L_0x003c
            si1.g r7 = (si1.C63902g) r7
            goto L_0x003d
        L_0x003c:
            r7 = r3
        L_0x003d:
            if (r7 == 0) goto L_0x0062
            al1.j r8 = r7.getCurBindLinkMicUser()
            if (r8 == 0) goto L_0x0048
            java.lang.String r8 = r8.f151997a
            goto L_0x0049
        L_0x0048:
            r8 = r3
        L_0x0049:
            qj1.c r9 = r2.f174398c
            java.lang.Class<cl1.u> r10 = cl1.C55001u.class
            androidx.lifecycle.i0 r9 = r9.mo87696x0(r10)
            cl1.u r9 = (cl1.C55001u) r9
            te3.bq2 r9 = r9.f154419p
            java.lang.String r9 = r9.f182319n
            boolean r8 = gy3.C87412m.m108589b(r8, r9)
            if (r8 == 0) goto L_0x0062
            android.view.ViewGroup r2 = r7.getVoteBubbleRootView()
            goto L_0x0066
        L_0x0062:
            int r6 = r6 + 1
            goto L_0x002b
        L_0x0065:
            r2 = r3
        L_0x0066:
            boolean r5 = r23.mo90515b1()
            r13 = 8
            r14 = 1
            if (r5 == 0) goto L_0x015a
            if (r2 == 0) goto L_0x015a
            xs1.m r5 = r1.f191165u
            if (r5 == 0) goto L_0x007b
            boolean r6 = r5.f191191g
            if (r6 != 0) goto L_0x007b
            r6 = 1
            goto L_0x007c
        L_0x007b:
            r6 = 0
        L_0x007c:
            if (r6 != 0) goto L_0x008c
            if (r5 == 0) goto L_0x0085
            android.view.View r5 = r5.mo86891b()
            goto L_0x0086
        L_0x0085:
            r5 = r3
        L_0x0086:
            boolean r5 = gy3.C87412m.m108589b(r5, r2)
            if (r5 != 0) goto L_0x0241
        L_0x008c:
            xs1.m r5 = r1.f191165u
            if (r5 == 0) goto L_0x0095
            int r5 = r5.mo86888G0()
            goto L_0x0097
        L_0x0095:
            r5 = 8
        L_0x0097:
            k20.a r15 = new k20.a
            r15.<init>()
            java.lang.ThreadLocal<k20.a> r6 = k20.C60958c.f173611a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r15.mo10233c(r5)
            java.lang.Object[] r6 = r15.mo10232b()
            java.lang.String r7 = "com/tencent/mm/plugin/finder/vote/plugin/FinderLiveVoteBubblePlugin"
            java.lang.String r8 = "onMicUserChanged"
            java.lang.String r9 = "(Ljava/util/LinkedHashMap;)V"
            java.lang.String r10 = "android/view/View_EXEC_"
            java.lang.String r11 = "setVisibility"
            java.lang.String r12 = "(I)V"
            r5 = r2
            j20.C117292a.m165358d(r5, r6, r7, r8, r9, r10, r11, r12)
            java.lang.Object r5 = r15.mo10231a(r4)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r2.setVisibility(r5)
            java.lang.String r6 = "com/tencent/mm/plugin/finder/vote/plugin/FinderLiveVoteBubblePlugin"
            java.lang.String r7 = "onMicUserChanged"
            java.lang.String r8 = "(Ljava/util/LinkedHashMap;)V"
            java.lang.String r9 = "android/view/View_EXEC_"
            java.lang.String r10 = "setVisibility"
            java.lang.String r11 = "(I)V"
            r5 = r2
            j20.C117292a.m165359e(r5, r6, r7, r8, r9, r10, r11)
            xs1.m r5 = r1.f191165u
            if (r5 == 0) goto L_0x00e2
            android.view.View r5 = r5.mo86891b()
            r6 = r5
            goto L_0x00e3
        L_0x00e2:
            r6 = r3
        L_0x00e3:
            if (r6 != 0) goto L_0x00e6
            goto L_0x0124
        L_0x00e6:
            k20.a r5 = new k20.a
            r5.<init>()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r13)
            r5.mo10233c(r7)
            java.lang.Object[] r16 = r5.mo10232b()
            java.lang.String r17 = "com/tencent/mm/plugin/finder/vote/plugin/FinderLiveVoteBubblePlugin"
            java.lang.String r18 = "onMicUserChanged"
            java.lang.String r19 = "(Ljava/util/LinkedHashMap;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            r15 = r6
            j20.C117292a.m165358d(r15, r16, r17, r18, r19, r20, r21, r22)
            java.lang.Object r5 = r5.mo10231a(r4)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r6.setVisibility(r5)
            java.lang.String r7 = "com/tencent/mm/plugin/finder/vote/plugin/FinderLiveVoteBubblePlugin"
            java.lang.String r8 = "onMicUserChanged"
            java.lang.String r9 = "(Ljava/util/LinkedHashMap;)V"
            java.lang.String r10 = "android/view/View_EXEC_"
            java.lang.String r11 = "setVisibility"
            java.lang.String r12 = "(I)V"
            j20.C117292a.m165359e(r6, r7, r8, r9, r10, r11, r12)
        L_0x0124:
            xs1.m r5 = r1.f191165u
            if (r5 == 0) goto L_0x012c
            android.os.Bundle r3 = r5.mo90525L0()
        L_0x012c:
            xs1.m r11 = new xs1.m
            r6 = 1
            r8 = 0
            android.view.ViewGroup r5 = r1.f166287d
            android.content.Context r5 = r5.getContext()
            java.lang.String r7 = "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity"
            gy3.C87412m.m108592e(r5, r7)
            r9 = r5
            com.tencent.mm.ui.MMActivity r9 = (com.tencent.p014mm.p136ui.MMActivity) r9
            xs1.a r10 = r1.f191163s
            r5 = r11
            r7 = r2
            r5.<init>(r6, r7, r8, r9, r10)
            xs1.a r2 = r1.f191163s
            if (r2 == 0) goto L_0x014c
            r2.onAttach(r11)
        L_0x014c:
            r11.mo90522I0(r3)
            r1.f191165u = r11
            xs1.a r2 = r1.f191163s
            if (r2 == 0) goto L_0x0241
            r2.mo90509v1()
            goto L_0x0241
        L_0x015a:
            xs1.m r2 = r1.f191165u
            if (r2 == 0) goto L_0x0164
            boolean r5 = r2.f191191g
            if (r5 != r14) goto L_0x0164
            r5 = 1
            goto L_0x0165
        L_0x0164:
            r5 = 0
        L_0x0165:
            if (r5 != 0) goto L_0x0177
            if (r2 == 0) goto L_0x016e
            android.view.View r2 = r2.mo86891b()
            goto L_0x016f
        L_0x016e:
            r2 = r3
        L_0x016f:
            android.view.ViewGroup r5 = r1.f166287d
            boolean r2 = gy3.C87412m.m108589b(r2, r5)
            if (r2 != 0) goto L_0x0241
        L_0x0177:
            xs1.m r2 = r1.f191165u
            if (r2 == 0) goto L_0x0180
            int r2 = r2.mo86888G0()
            goto L_0x0182
        L_0x0180:
            r2 = 8
        L_0x0182:
            xs1.m r5 = r1.f191165u
            if (r5 == 0) goto L_0x018c
            android.view.View r5 = r5.mo86891b()
            r6 = r5
            goto L_0x018d
        L_0x018c:
            r6 = r3
        L_0x018d:
            if (r6 != 0) goto L_0x0190
            goto L_0x01d0
        L_0x0190:
            k20.a r5 = new k20.a
            r5.<init>()
            java.lang.ThreadLocal<k20.a> r7 = k20.C60958c.f173611a
            java.lang.Integer r7 = java.lang.Integer.valueOf(r13)
            r5.mo10233c(r7)
            java.lang.Object[] r16 = r5.mo10232b()
            java.lang.String r17 = "com/tencent/mm/plugin/finder/vote/plugin/FinderLiveVoteBubblePlugin"
            java.lang.String r18 = "onMicUserChanged"
            java.lang.String r19 = "(Ljava/util/LinkedHashMap;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            r15 = r6
            j20.C117292a.m165358d(r15, r16, r17, r18, r19, r20, r21, r22)
            java.lang.Object r5 = r5.mo10231a(r4)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r6.setVisibility(r5)
            java.lang.String r7 = "com/tencent/mm/plugin/finder/vote/plugin/FinderLiveVoteBubblePlugin"
            java.lang.String r8 = "onMicUserChanged"
            java.lang.String r9 = "(Ljava/util/LinkedHashMap;)V"
            java.lang.String r10 = "android/view/View_EXEC_"
            java.lang.String r11 = "setVisibility"
            java.lang.String r12 = "(I)V"
            j20.C117292a.m165359e(r6, r7, r8, r9, r10, r11, r12)
        L_0x01d0:
            xs1.m r5 = r1.f191165u
            if (r5 == 0) goto L_0x01d8
            android.os.Bundle r3 = r5.mo90525L0()
        L_0x01d8:
            xs1.m r5 = r1.f191164t
            if (r5 == 0) goto L_0x0241
            int r6 = r5.mo86888G0()
            if (r6 != r13) goto L_0x01e7
            if (r2 != 0) goto L_0x01e7
            r5.mo11421k0()
        L_0x01e7:
            r5.mo90522I0(r3)
            r1.f191165u = r5
            android.view.View r3 = r5.mo86891b()
            if (r3 != 0) goto L_0x01f3
            goto L_0x0233
        L_0x01f3:
            k20.a r6 = new k20.a
            r6.<init>()
            java.lang.ThreadLocal<k20.a> r7 = k20.C60958c.f173611a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r6.mo10233c(r2)
            java.lang.Object[] r16 = r6.mo10232b()
            java.lang.String r17 = "com/tencent/mm/plugin/finder/vote/plugin/FinderLiveVoteBubblePlugin"
            java.lang.String r18 = "onMicUserChanged"
            java.lang.String r19 = "(Ljava/util/LinkedHashMap;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            r15 = r3
            j20.C117292a.m165358d(r15, r16, r17, r18, r19, r20, r21, r22)
            java.lang.Object r2 = r6.mo10231a(r4)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r3.setVisibility(r2)
            java.lang.String r16 = "com/tencent/mm/plugin/finder/vote/plugin/FinderLiveVoteBubblePlugin"
            java.lang.String r17 = "onMicUserChanged"
            java.lang.String r18 = "(Ljava/util/LinkedHashMap;)V"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r21 = "(I)V"
            j20.C117292a.m165359e(r15, r16, r17, r18, r19, r20, r21)
        L_0x0233:
            xs1.a r2 = r1.f191163s
            if (r2 == 0) goto L_0x023a
            r2.onAttach(r5)
        L_0x023a:
            xs1.a r2 = r1.f191163s
            if (r2 == 0) goto L_0x0241
            r2.mo90509v1()
        L_0x0241:
            androidx.lifecycle.i0 r2 = r1.mo87696x0(r0)
            cl1.d0 r2 = (cl1.C54963d0) r2
            al1.j r2 = r2.f154073p
            if (r2 == 0) goto L_0x0291
            androidx.lifecycle.i0 r0 = r1.mo87696x0(r0)
            cl1.d0 r0 = (cl1.C54963d0) r0
            java.util.List<al1.j> r2 = r0.f154074q
            java.lang.String r0 = "business(LiveLinkMicSlic…).audienceLinkMicUserList"
            gy3.C87412m.m108593f(r2, r0)
            monitor-enter(r2)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x028e }
            r0.<init>()     // Catch:{ all -> 0x028e }
            java.util.Iterator r3 = r2.iterator()     // Catch:{ all -> 0x028e }
        L_0x0262:
            boolean r5 = r3.hasNext()     // Catch:{ all -> 0x028e }
            if (r5 == 0) goto L_0x027e
            java.lang.Object r5 = r3.next()     // Catch:{ all -> 0x028e }
            r6 = r5
            al1.j r6 = (al1.C54130j) r6     // Catch:{ all -> 0x028e }
            java.lang.Boolean r6 = r6.f152016t     // Catch:{ all -> 0x028e }
            java.lang.Boolean r7 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x028e }
            boolean r6 = gy3.C87412m.m108589b(r6, r7)     // Catch:{ all -> 0x028e }
            r6 = r6 ^ r14
            if (r6 == 0) goto L_0x0262
            r0.add(r5)     // Catch:{ all -> 0x028e }
            goto L_0x0262
        L_0x027e:
            monitor-exit(r2)
            int r0 = r0.size()
            r2 = 2
            if (r0 < r2) goto L_0x0291
            xs1.m r0 = r1.f191165u
            if (r0 == 0) goto L_0x0298
            r0.mo90524K0(r14)
            goto L_0x0298
        L_0x028e:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0291:
            xs1.m r0 = r1.f191165u
            if (r0 == 0) goto L_0x0298
            r0.mo90524K0(r4)
        L_0x0298:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xs1.C66420d.mo11992m0(java.util.LinkedHashMap):void");
    }

    /* renamed from: u0 */
    public void mo3210u0(C58124b.C58125b bVar, Bundle bundle) {
        C87412m.m108594g(bVar, "status");
        int ordinal = bVar.ordinal();
        if (ordinal != 98) {
            if (ordinal == 99) {
                mo10792g(8);
                C66438m mVar = this.f191165u;
                if (mVar != null) {
                    mVar.mo86889H0();
                }
            }
        } else if (mo14483f0() != 0) {
            mo10792g(0);
            C66438m mVar2 = this.f191165u;
            if (mVar2 != null) {
                mVar2.mo11422p();
            }
            C66438m mVar3 = this.f191165u;
            if (mVar3 != null) {
                mVar3.mo11421k0();
            }
        }
    }

    /* renamed from: w0 */
    public void mo3211w0() {
        StringBuilder sb = new StringBuilder();
        sb.append("unMount ");
        sb.append(hashCode());
        sb.append(" presenter is empty:");
        boolean z = true;
        sb.append(this.f191163s == null);
        sb.append(",viewCallback is empty:");
        if (this.f191165u != null) {
            z = false;
        }
        sb.append(z);
        Log.m105924i("FinderLiveVoteBubblePlugin", sb.toString());
        super.mo3211w0();
        C66417a aVar = this.f191163s;
        if (aVar != null) {
            aVar.onDetach();
        }
        C66438m mVar = this.f191165u;
        if (mVar != null) {
            mVar.mo86889H0();
        }
        mo10792g(8);
        this.f191165u = null;
    }
}
