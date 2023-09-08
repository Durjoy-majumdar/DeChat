package qj1;

import ak1.C54067f0;
import ak1.C54116w;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import bl3.C39818r;
import cj1.C54738b1;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.live.viewmodel.component.FinderLiveExitAnimateOpUIC;
import com.tencent.p014mm.sdk.platformtools.Log;
import d60.C58124b;
import di3.C7335d;
import di3.C86312j;
import e50.C116693a;
import e50.C58529d;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import ok1.C62042e;
import p165hr.C60106t;
import rx3.C13598b0;
import te3.C49712hj1;
import wg1.C66110y2;
import zt3.C119157j;

/* renamed from: qj1.og */
public final class C62917og extends C62660c {

    /* renamed from: p */
    public final C58124b f178539p;

    /* renamed from: q */
    public final View f178540q;

    /* renamed from: qj1.og$a */
    public static final class C62918a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C62917og f178541d;

        /* renamed from: e */
        public final /* synthetic */ ViewGroup f178542e;

        /* renamed from: qj1.og$a$a */
        public static final class C62919a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C62917og f178543d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C62919a(C62917og ogVar) {
                super(0);
                this.f178543d = ogVar;
            }

            public Object invoke() {
                ((C54991o) this.f178543d.mo87696x0(C54991o.class)).f154245Q3 = 1;
                this.f178543d.mo87864Z0();
                return C13598b0.f38549a;
            }
        }

        public C62918a(C62917og ogVar, ViewGroup viewGroup) {
            this.f178541d = ogVar;
            this.f178542e = viewGroup;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:27:0x014c, code lost:
            if ((r0 != null && r0.mo62927s3()) != false) goto L_0x0165;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r14) {
            /*
                r13 = this;
                java.lang.Class<cl1.b> r0 = cl1.C0654b.class
                java.lang.Class<cl1.o> r1 = cl1.C54991o.class
                java.lang.String r2 = "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorClosePlugin$1"
                java.lang.String r3 = "android/view/View$OnClickListener"
                java.lang.String r4 = "onClick"
                java.lang.String r5 = "(Landroid/view/View;)V"
                java.util.ArrayList r6 = new java.util.ArrayList
                r6.<init>()
                r6.add(r14)
                java.lang.Object[] r7 = r6.toArray()
                r6.clear()
                r6 = r13
                j20.C117292a.m165356b(r2, r3, r4, r5, r6, r7)
                java.lang.String r14 = "Finder.FinderLiveVisitorClosePlugin"
                java.lang.String r2 = "close click!"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r2)
                qj1.og r14 = r13.f178541d
                androidx.lifecycle.i0 r14 = r14.mo87696x0(r1)
                cl1.o r14 = (cl1.C54991o) r14
                boolean r14 = r14.mo75990Y3()
                r2 = 1
                if (r14 != 0) goto L_0x01e8
                android.view.ViewGroup r14 = r13.f178542e
                android.content.Context r14 = r14.getContext()
                java.lang.String r3 = "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity"
                gy3.C87412m.m108592e(r14, r3)
                androidx.appcompat.app.AppCompatActivity r14 = (androidx.appcompat.app.AppCompatActivity) r14
                android.content.Intent r14 = r14.getIntent()
                java.lang.String r3 = "KEY_MINI_APP_AD_FLOW_INFO"
                boolean r14 = r14.hasExtra(r3)
                if (r14 == 0) goto L_0x0050
                goto L_0x01e8
            L_0x0050:
                qj1.og r14 = r13.f178541d
                boolean r14 = r14.mo82893g0()
                if (r14 != 0) goto L_0x01e2
                qj1.og r14 = r13.f178541d
                androidx.lifecycle.i0 r14 = r14.mo87696x0(r1)
                cl1.o r14 = (cl1.C54991o) r14
                d14.u0<java.lang.Boolean> r14 = r14.f154189C3
                d14.j1 r14 = (d14.C58052j1) r14
                java.lang.Object r14 = r14.getValue()
                java.lang.Boolean r14 = (java.lang.Boolean) r14
                boolean r14 = r14.booleanValue()
                if (r14 == 0) goto L_0x01e2
                rx3.g r14 = cj1.C0523c1.f1279a
                qj1.og r14 = r13.f178541d
                fj1.b r14 = r14.mo87684A0()
                androidx.lifecycle.i0 r14 = r14.mo71262a(r1)
                cl1.o r14 = (cl1.C54991o) r14
                java.lang.String r14 = r14.f154345o
                qj1.og r1 = r13.f178541d
                fj1.b r1 = r1.mo87684A0()
                androidx.lifecycle.i0 r1 = r1.mo71262a(r0)
                cl1.b r1 = (cl1.C0654b) r1
                java.lang.String r1 = r1.f1545g
                qj1.og r3 = r13.f178541d
                fj1.b r3 = r3.mo87684A0()
                androidx.lifecycle.i0 r0 = r3.mo71262a(r0)
                cl1.b r0 = (cl1.C0654b) r0
                boolean r0 = r0.f1544f
                java.lang.String r3 = "anchorUserName"
                gy3.C87412m.m108594g(r14, r3)
                java.lang.String r3 = "bizUsername"
                gy3.C87412m.m108594g(r1, r3)
                pe1.c<java.lang.Integer> r3 = gg1.C32444a.f86129c
                java.lang.Object r3 = r3.mo60266n()
                java.lang.Number r3 = (java.lang.Number) r3
                int r3 = r3.intValue()
                r4 = 0
                if (r3 != r2) goto L_0x00b7
                goto L_0x01d2
            L_0x00b7:
                long r5 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
                ok1.e r3 = ok1.C62042e.f176370a
                com.tencent.mm.sdk.platformtools.MultiProcessMMKV r7 = r3.mo87106p0()
                java.lang.String r8 = "last_show_follow_guide_time"
                r9 = 0
                long r7 = r7.getLong(r8, r9)
                long r7 = r5 - r7
                r9 = 86400(0x15180, double:4.26873E-319)
                int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                if (r11 >= 0) goto L_0x00dc
                java.lang.String r14 = "Finder.FinderLiveCloseShowFollowGuideLogic"
                java.lang.String r0 = "shouldShowFollowGuide showed in 24 hour"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r0)
                goto L_0x0165
            L_0x00dc:
                java.lang.Class<hr.t> r7 = p165hr.C60106t.class
                di3.d r7 = di3.C86312j.m106911c(r7)
                hr.t r7 = (p165hr.C60106t) r7
                rx3.g r7 = r7.f171520t
                rx3.n r7 = (rx3.C36570n) r7
                java.lang.Object r7 = r7.getValue()
                ik1.a r7 = (ik1.C33339a) r7
                ks3.d r8 = ks3.C10407d.UnFollowAnchor
                r7.getClass()
                java.lang.String r8 = r7.mo59077jo(r14, r8)
                monitor-enter(r7)
                ig1.a r9 = new ig1.a     // Catch:{ all -> 0x01df }
                r9.<init>()     // Catch:{ all -> 0x01df }
                r9.field_actionTag = r8     // Catch:{ all -> 0x01df }
                java.lang.String[] r10 = new java.lang.String[r4]     // Catch:{ all -> 0x01df }
                boolean r9 = r7.get(r9, (java.lang.String[]) r10)     // Catch:{ all -> 0x01df }
                java.lang.String r10 = "Finder.FinderLiveActionRecordStorage"
                java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x01df }
                r11.<init>()     // Catch:{ all -> 0x01df }
                java.lang.String r12 = "hadEverAction tag:"
                r11.append(r12)     // Catch:{ all -> 0x01df }
                r11.append(r8)     // Catch:{ all -> 0x01df }
                java.lang.String r8 = " suc:"
                r11.append(r8)     // Catch:{ all -> 0x01df }
                r11.append(r9)     // Catch:{ all -> 0x01df }
                java.lang.String r8 = r11.toString()     // Catch:{ all -> 0x01df }
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r10, r8)     // Catch:{ all -> 0x01df }
                monitor-exit(r7)
                if (r9 == 0) goto L_0x012f
                java.lang.String r14 = "Finder.FinderLiveCloseShowFollowGuideLogic"
                java.lang.String r0 = "shouldShowFollowGuide had unfollow"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r0)
                goto L_0x0165
            L_0x012f:
                if (r0 == 0) goto L_0x014f
                java.lang.Class<f62.k0> r0 = f62.C75700k0.class
                k40.a r0 = f40.C86709a0.m107533q(r0)
                f62.k0 r0 = (f62.C75700k0) r0
                com.tencent.mm.storage.u3 r0 = r0.mo96097Ni()
                com.tencent.mm.storage.z1 r0 = r0.get(r1)
                if (r0 == 0) goto L_0x014b
                boolean r0 = r0.mo62927s3()
                if (r0 != r2) goto L_0x014b
                r0 = 1
                goto L_0x014c
            L_0x014b:
                r0 = 0
            L_0x014c:
                if (r0 == 0) goto L_0x0167
                goto L_0x0165
            L_0x014f:
                java.lang.Class<tf0.p1> r0 = tf0.C64916p1.class
                di3.d r0 = di3.C86312j.m106911c(r0)
                tf0.p1 r0 = (tf0.C64916p1) r0
                boolean r0 = r0.mo76650AV(r14)
                if (r0 == 0) goto L_0x0167
                java.lang.String r14 = "Finder.FinderLiveCloseShowFollowGuideLogic"
                java.lang.String r0 = "shouldShowFollowGuide followed"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r0)
            L_0x0165:
                r2 = 0
                goto L_0x01d2
            L_0x0167:
                rx3.g r0 = cj1.C28578k5.f78446a
                long r0 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
                rx3.g r7 = cj1.C28578k5.f78446a
                rx3.n r7 = (rx3.C36570n) r7
                java.lang.Object r7 = r7.getValue()
                java.util.Map r7 = (java.util.Map) r7
                java.lang.Object r14 = r7.get(r14)
                java.lang.Long r14 = (java.lang.Long) r14
                if (r14 == 0) goto L_0x0184
                long r7 = r14.longValue()
                goto L_0x0185
            L_0x0184:
                r7 = r0
            L_0x0185:
                long r0 = r0 - r7
                java.lang.String r14 = "Finder.FinderLiveCloseShowFollowGuideLogic"
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r8 = "shouldShowFollowGuide watchTime:"
                r7.append(r8)
                r7.append(r0)
                java.lang.String r8 = " threshold:"
                r7.append(r8)
                rx3.g r8 = cj1.C0523c1.f1279a
                r9 = r8
                rx3.n r9 = (rx3.C36570n) r9
                java.lang.Object r9 = r9.getValue()
                java.lang.Number r9 = (java.lang.Number) r9
                int r9 = r9.intValue()
                r7.append(r9)
                java.lang.String r7 = r7.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r7)
                rx3.n r8 = (rx3.C36570n) r8
                java.lang.Object r14 = r8.getValue()
                java.lang.Number r14 = (java.lang.Number) r14
                int r14 = r14.intValue()
                long r7 = (long) r14
                int r14 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
                if (r14 < 0) goto L_0x01c6
                goto L_0x01c7
            L_0x01c6:
                r2 = 0
            L_0x01c7:
                if (r2 == 0) goto L_0x01d2
                com.tencent.mm.sdk.platformtools.MultiProcessMMKV r14 = r3.mo87106p0()
                java.lang.String r0 = "last_show_follow_guide_time"
                r14.putLong(r0, r5)
            L_0x01d2:
                if (r2 == 0) goto L_0x01e2
                qj1.og r14 = r13.f178541d
                d60.b r14 = r14.f178539p
                d60.b$b r0 = d60.C58124b.C58125b.FINDER_LIVE_SHOW_FOLLOW_GUIDE
                r1 = 0
                r14.statusChange(r0, r1)
                goto L_0x021a
            L_0x01df:
                r14 = move-exception
                monitor-exit(r7)
                throw r14
            L_0x01e2:
                qj1.og r14 = r13.f178541d
                r14.mo87864Z0()
                goto L_0x021a
            L_0x01e8:
                qj1.og r14 = r13.f178541d
                androidx.lifecycle.i0 r14 = r14.mo87696x0(r1)
                cl1.o r14 = (cl1.C54991o) r14
                boolean r14 = r14.f154236O3
                if (r14 == 0) goto L_0x0204
                qj1.og r14 = r13.f178541d
                androidx.lifecycle.i0 r14 = r14.mo87696x0(r1)
                cl1.o r14 = (cl1.C54991o) r14
                r14.f154245Q3 = r2
                qj1.og r14 = r13.f178541d
                r14.mo87864Z0()
                goto L_0x021a
            L_0x0204:
                qj1.og r14 = r13.f178541d
                java.lang.Class<hq1.d> r0 = hq1.C60085d.class
                qj1.c r14 = r14.mo87687E0(r0)
                hq1.d r14 = (hq1.C60085d) r14
                if (r14 == 0) goto L_0x021a
                qj1.og$a$a r0 = new qj1.og$a$a
                qj1.og r1 = r13.f178541d
                r0.<init>(r1)
                r14.mo84952d1(r0)
            L_0x021a:
                java.lang.String r14 = "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorClosePlugin$1"
                java.lang.String r0 = "android/view/View$OnClickListener"
                java.lang.String r1 = "onClick"
                java.lang.String r2 = "(Landroid/view/View;)V"
                j20.C117292a.m165361g(r13, r14, r0, r1, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: qj1.C62917og.C62918a.onClick(android.view.View):void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62917og(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar, (C49712hj1) null);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statueMonitor");
        this.f178539p = bVar;
        View findViewById = viewGroup.findViewById(C0966R.C0970id.g0d);
        this.f178540q = findViewById;
        C75044y4.m89991c(viewGroup.getContext());
        findViewById.setOnClickListener(new C62918a(this, viewGroup));
        if (viewGroup.getLayoutParams() != null && (viewGroup.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            if (mo82893g0()) {
                ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ((ViewGroup.MarginLayoutParams) layoutParams).setMarginEnd(C74942w4.m89784a(viewGroup.getContext(), 32));
            } else {
                ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
                C87412m.m108592e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ((ViewGroup.MarginLayoutParams) layoutParams2).setMarginEnd(C74942w4.m89784a(viewGroup.getContext(), 8));
            }
        }
        C62042e.f176370a.mo87071d(this);
    }

    /* renamed from: Z0 */
    public final void mo87864Z0() {
        Class cls = C60106t.class;
        Class cls2 = C54116w.class;
        Class cls3 = C54991o.class;
        Context context = this.f177935f.getContext();
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity != null) {
            ((FinderLiveExitAnimateOpUIC) C39818r.f106831a.mo62443b(activity).mo75002a(FinderLiveExitAnimateOpUIC.class)).f160022q = true;
            C54991o oVar = (C54991o) FinderLiveService.f159376d.mo77630e(cls3);
            if (oVar != null && oVar.mo75996d3() == 1) {
                if (C116693a.f349962W == null) {
                    C116693a.f349962W = new C116693a();
                }
                C87412m.m108591d(C116693a.f349962W);
                if (C116693a.f349963X) {
                    C116693a aVar = C116693a.f349962W;
                    if (aVar != null) {
                        ((C119157j) C119157j.f356862d).mo183876g(new C58529d(aVar), "MMXp2pWrapper-THREAD-POOL-TAG");
                    }
                    Log.m105924i("Finder.FinderLiveService", "releaseP2P");
                }
            }
            C54067f0.C54079q0 q0Var = C54067f0.C54079q0.CloseTypeFull;
            ((C54116w) C86312j.m106911c(cls2)).Gy0(q0Var);
            C58124b.C7172a.m7372a(this.f178539p, C58124b.C58125b.CLOSE_LIVE, (Bundle) null, 2, (Object) null);
            C66110y2.f190024a.mo90149a(3, ((C54991o) mo87684A0().mo71262a(cls3)).f154284Y2, ((C54991o) mo87684A0().mo71262a(cls3)).f154291a1, true);
            C7335d c = C86312j.m106911c(cls2);
            C87412m.m108593f(c, "getService(HellLiveVisitorReoprter::class.java)");
            C54116w.wy0((C54116w) c, this.f166287d.getContext(), q0Var, (Bundle) null, false, 12, (Object) null);
            ((C60106t) C86312j.m106911c(cls)).Cx0().mo58846jo();
            ((C60106t) C86312j.m106911c(cls)).yx0().mo9439Yt();
            C54738b1.f153409B.mo559a();
        }
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return true;
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return true;
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return true;
    }

    /* renamed from: s0 */
    public void mo3209s0() {
        if (C75044y4.m89991c(this.f166287d.getContext()) == 0) {
            C74942w4.m89784a(this.f166287d.getContext(), 16);
        }
    }

    /* renamed from: u0 */
    public void mo3210u0(C58124b.C58125b bVar, Bundle bundle) {
        C87412m.m108594g(bVar, "status");
        int ordinal = bVar.ordinal();
        if (ordinal != 5) {
            if (ordinal == 7) {
                mo10792g(0);
                return;
            } else if (ordinal == 189) {
                mo87864Z0();
                return;
            } else if (!(ordinal == 27 || ordinal == 28)) {
                return;
            }
        }
        mo10792g(8);
    }
}
