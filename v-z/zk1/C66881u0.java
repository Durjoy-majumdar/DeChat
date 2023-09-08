package zk1;

import ak1.C54067f0;
import ak1.C54116w;
import al1.C54127h;
import al1.C54129i;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.Fragment;
import cj1.C54738b1;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.live.api.LiveConfig;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.tools.C7020t0;
import com.tencent.p014mm.p136ui.tools.KeyboardHeightProvider;
import com.tencent.p014mm.plugin.finder.live.FinderLivePresenter;
import com.tencent.p014mm.plugin.finder.live.FinderLiveViewCallback;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import com.tencent.p014mm.plugin.finder.live.view.C56090m1;
import com.tencent.p014mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C7335d;
import di3.C86312j;
import eg1.C58584k0;
import fj1.C45795b;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import hl1.C59988k;
import java.util.LinkedList;
import java.util.Map;
import jj1.C60874a;
import l31.C61212e;
import ok1.C62042e;
import p50.C62193a;
import p646pn.C110234e;
import p671qy.C63344h;
import qj1.C12282d7;
import r50.C63363c;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C90364q0;
import te3.C48770aw0;
import te3.C49765hx0;
import te3.C64273c21;
import te3.C64347eq2;
import xv0.C112181e;

/* renamed from: zk1.u0 */
public class C66881u0 extends UIComponent {

    /* renamed from: d */
    public boolean f192145d;

    /* renamed from: e */
    public int f192146e;

    /* renamed from: f */
    public boolean f192147f;

    /* renamed from: g */
    public boolean f192148g;

    /* renamed from: h */
    public boolean f192149h;

    /* renamed from: i */
    public KeyboardHeightProvider f192150i;

    /* renamed from: j */
    public FinderLivePresenter f192151j;

    /* renamed from: n */
    public FinderLiveViewCallback f192152n;

    /* renamed from: o */
    public C56090m1 f192153o;

    /* renamed from: p */
    public final C13601g f192154p = C36568h.m40985a(new C66886d(this));

    /* renamed from: q */
    public Runnable f192155q;

    /* renamed from: r */
    public boolean f192156r;

    /* renamed from: zk1.u0$a */
    public static final class C66882a extends C87413o implements C32227p<Boolean, C49765hx0, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C45795b f192157d;

        /* renamed from: e */
        public final /* synthetic */ boolean f192158e;

        /* renamed from: f */
        public final /* synthetic */ boolean f192159f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66882a(C45795b bVar, boolean z, boolean z2) {
            super(2);
            this.f192157d = bVar;
            this.f192158e = z;
            this.f192159f = z2;
        }

        public Object invoke(Object obj, Object obj2) {
            C12282d7 d7Var;
            C49765hx0 hx02 = (C49765hx0) obj2;
            if (((Boolean) obj).booleanValue()) {
                ((C54991o) this.f192157d.mo71262a(C54991o.class)).mo76018p4(hx02 != null ? hx02.f134930r : null);
                boolean z = this.f192158e;
                C62042e eVar = C62042e.f176370a;
                if (!(z == eVar.mo87081g1(this.f192157d) && this.f192159f == eVar.mo87087i1(this.f192157d, (LinkedList<C48770aw0>) null))) {
                    FinderLiveService.f159376d.getClass();
                    C56032b bVar = FinderLiveService.f159379g;
                    if (!(bVar == null || (d7Var = (C12282d7) bVar.getPlugin(C12282d7.class)) == null)) {
                        C12282d7.m11835p1(d7Var, (C12282d7.C12289d) null, (String) null, 3, (Object) null);
                    }
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: zk1.u0$b */
    public static final class C66883b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C66881u0 f192160d;

        public C66883b(C66881u0 u0Var) {
            this.f192160d = u0Var;
        }

        public final void run() {
            this.f192160d.mo90886k3();
        }
    }

    /* renamed from: zk1.u0$c */
    public static final class C66884c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C66881u0 f192161d;

        /* renamed from: zk1.u0$c$a */
        public static final class C66885a implements C7020t0 {

            /* renamed from: d */
            public final /* synthetic */ C66881u0 f192162d;

            public C66885a(C66881u0 u0Var) {
                this.f192162d = u0Var;
            }

            /* renamed from: Q1 */
            public final void mo531Q1(int i, boolean z) {
                FinderLiveVisitorPluginLayout finderLiveVisitorPluginLayout;
                Log.m105924i("Finder.FinderLiveVisitorUIC", "onKeyboardHeightChanged, height:" + i + ", isResized:" + z);
                C66881u0 u0Var = this.f192162d;
                boolean z2 = i > 0;
                if (u0Var.f192145d != z2 || u0Var.f192146e != i) {
                    u0Var.f192146e = i;
                    u0Var.f192145d = z2;
                    FinderLiveViewCallback finderLiveViewCallback = u0Var.f192152n;
                    if (finderLiveViewCallback != null && (finderLiveVisitorPluginLayout = finderLiveViewCallback.f159223t.f167728e) != null) {
                        finderLiveVisitorPluginLayout.keyboardChange(z2, i);
                    }
                }
            }
        }

        public C66884c(C66881u0 u0Var) {
            this.f192161d = u0Var;
        }

        public final void run() {
            C66881u0 u0Var = this.f192161d;
            if (u0Var.f192150i == null) {
                Activity context = u0Var.getContext();
                C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
                u0Var.f192150i = new KeyboardHeightProvider(context);
                C66881u0 u0Var2 = this.f192161d;
                KeyboardHeightProvider keyboardHeightProvider = u0Var2.f192150i;
                if (keyboardHeightProvider != null) {
                    keyboardHeightProvider.f220015b = new C66885a(u0Var2);
                }
            }
            KeyboardHeightProvider keyboardHeightProvider2 = this.f192161d.f192150i;
            if (keyboardHeightProvider2 != null) {
                keyboardHeightProvider2.mo104022e();
            }
        }
    }

    /* renamed from: zk1.u0$d */
    public static final class C66886d extends C87413o implements C32224a<Window> {

        /* renamed from: d */
        public final /* synthetic */ C66881u0 f192163d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66886d(C66881u0 u0Var) {
            super(0);
            this.f192163d = u0Var;
        }

        public Object invoke() {
            return this.f192163d.getActivity().getWindow();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66881u0(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
    }

    /* renamed from: c3 */
    public final boolean mo90879c3() {
        boolean booleanExtra = getIntent().getBooleanExtra("KEY_ENTER_LIVE_BACK_NEED_MINI_WINDOW", true);
        Log.m105924i("Finder.FinderLiveVisitorUIC", "backAndDismissMiniWindow: " + this.f192149h + ' ' + booleanExtra);
        return this.f192149h && !booleanExtra;
    }

    /* renamed from: d3 */
    public final C60874a mo90880d3() {
        FinderLiveVisitorPluginLayout finderLiveVisitorPluginLayout;
        FinderLiveViewCallback finderLiveViewCallback = this.f192152n;
        if (finderLiveViewCallback == null || (finderLiveVisitorPluginLayout = finderLiveViewCallback.f159223t.f167728e) == null) {
            return null;
        }
        return finderLiveVisitorPluginLayout.getIFinderLiveCommonAdapter();
    }

    /* renamed from: e3 */
    public final Window mo90881e3() {
        return (Window) ((C36570n) this.f192154p).getValue();
    }

    /* renamed from: f3 */
    public final void mo90882f3(int i, int i2) {
        Map g = C90364q0.m113148g(new C13604l("live_share_type", Integer.valueOf(i)), new C13604l("live_share_type_count", Integer.valueOf(i2)));
        g.putAll(C59988k.f171146g2.mo84902a());
        ((C61212e) C86312j.m106911c(C61212e.class)).mo86153W7("finder_live_room_share_event", (Object) null, g, 25561);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0020, code lost:
        if ((r0 != null && ((cl1.C54979h1) r0.mo71262a(cl1.C54979h1.class)).f154109A) != false) goto L_0x0024;
     */
    /* renamed from: g3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo90883g3() {
        /*
            r4 = this;
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r0 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r0.getClass()
            boolean r0 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159380h
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0023
            fj1.b$a r0 = fj1.C45795b.f123697j
            fj1.b r0 = fj1.C45795b.f123698n
            if (r0 == 0) goto L_0x001f
            java.lang.Class<cl1.h1> r3 = cl1.C54979h1.class
            androidx.lifecycle.i0 r0 = r0.mo71262a(r3)
            cl1.h1 r0 = (cl1.C54979h1) r0
            boolean r0 = r0.f154109A
            if (r0 != r1) goto L_0x001f
            r0 = 1
            goto L_0x0020
        L_0x001f:
            r0 = 0
        L_0x0020:
            if (r0 == 0) goto L_0x0023
            goto L_0x0024
        L_0x0023:
            r1 = 0
        L_0x0024:
            java.lang.String r0 = "Finder.FinderLiveVisitorUIC"
            if (r1 != 0) goto L_0x004d
            java.lang.String r1 = r4.toString()
            com.tencent.p014mm.plugin.finder.live.view.C56090m1.f159950s = r1
            com.tencent.mm.plugin.finder.live.view.m1 r1 = r4.f192153o
            if (r1 == 0) goto L_0x0035
            r1.mo78184B0()
        L_0x0035:
            java.lang.Class<pn.e> r1 = p646pn.C110234e.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            pn.e r1 = (p646pn.C110234e) r1
            xv0.e r1 = r1.mo161399pY()
            if (r1 == 0) goto L_0x0046
            r1.mo149144t()
        L_0x0046:
            java.lang.String r1 = "tryHideFloatBallWhenEnterPage hideFloatBall"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            goto L_0x0053
        L_0x004d:
            java.lang.String r1 = "tryHideFloatBallWhenEnterPage current shoppingInMiniProgram"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
        L_0x0053:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zk1.C66881u0.mo90883g3():void");
    }

    public int getLayoutId() {
        return C0966R.C0971layout.d6_;
    }

    /* renamed from: i3 */
    public final void mo90884i3() {
        C112181e pY;
        if (Util.isEqual(toString(), C56090m1.f159950s)) {
            C45795b.C32059a aVar = C45795b.f123697j;
            C45795b bVar = C45795b.f123698n;
            C54991o oVar = bVar != null ? (C54991o) bVar.mo71262a(C54991o.class) : null;
            if (oVar == null || oVar.f154350p0) {
                C56090m1 m1Var = this.f192153o;
                if (m1Var != null) {
                    m1Var.mo78185C0(false);
                }
            } else {
                C56090m1 m1Var2 = this.f192153o;
                if (m1Var2 != null) {
                    m1Var2.mo78185C0(true);
                }
            }
            FinderLiveService finderLiveService = FinderLiveService.f159376d;
            finderLiveService.getClass();
            if (FinderLiveService.f159365R && (pY = ((C110234e) C86312j.m106911c(C110234e.class)).mo161399pY()) != null) {
                pY.mo149130k0();
            }
            StringBuilder sb = new StringBuilder();
            sb.append("tryShowFloatBallWhenExitPage resumeFloatBall, gainFocus: ");
            finderLiveService.getClass();
            sb.append(FinderLiveService.f159365R);
            Log.m105924i("Finder.FinderLiveVisitorUIC", sb.toString());
        }
    }

    /* renamed from: j3 */
    public final void mo90885j3() {
        C64273c21 c212;
        C54127h data;
        LiveConfig liveConfig;
        Class cls = C54116w.class;
        Log.m105924i("Finder.FinderLiveVisitorUIC", "uninitBusiness");
        C13598b0 b0Var = null;
        if (mo90879c3()) {
            C45795b.C32059a aVar = C45795b.f123697j;
            C45795b bVar = C45795b.f123698n;
            C54991o oVar = bVar != null ? (C54991o) bVar.mo71262a(C54991o.class) : null;
            if (oVar != null) {
                oVar.f154350p0 = false;
            }
            C54067f0.C54079q0 q0Var = C54067f0.C54079q0.CloseTypeFull;
            ((C54116w) C86312j.m106911c(cls)).Gy0(q0Var);
            C7335d c = C86312j.m106911c(cls);
            C87412m.m108593f(c, "getService(HellLiveVisitorReoprter::class.java)");
            C54116w.wy0((C54116w) c, getContext(), q0Var, (Bundle) null, false, 12, (Object) null);
        }
        FinderLiveViewCallback finderLiveViewCallback = this.f192152n;
        if (finderLiveViewCallback != null) {
            Log.m105924i("Finder.FinderLiveViewCallback", "[LiveLifecycle]onUninit " + finderLiveViewCallback);
            C58584k0 k0Var = finderLiveViewCallback.f159223t;
            String str = k0Var.f167726c;
            StringBuilder sb = new StringBuilder();
            sb.append("ViewManagerRelease:");
            sb.append(k0Var.f167728e);
            sb.append(" it.isManualClosed: ");
            FinderLiveVisitorPluginLayout finderLiveVisitorPluginLayout = k0Var.f167728e;
            sb.append(finderLiveVisitorPluginLayout != null ? Boolean.valueOf(finderLiveVisitorPluginLayout.isManualClosed()) : null);
            sb.append(" liveId: ");
            FinderLiveVisitorPluginLayout finderLiveVisitorPluginLayout2 = k0Var.f167728e;
            sb.append((finderLiveVisitorPluginLayout2 == null || (data = finderLiveVisitorPluginLayout2.getData()) == null || (liveConfig = data.f151977d) == null) ? null : Long.valueOf(liveConfig.f157064e));
            sb.append(" activityFinish: ");
            sb.append(k0Var.f167724a.isFinishing());
            Log.m105924i(str, sb.toString());
            k0Var.f167727d = true;
            FinderLiveVisitorPluginLayout finderLiveVisitorPluginLayout3 = k0Var.f167728e;
            if (finderLiveVisitorPluginLayout3 != null) {
                finderLiveVisitorPluginLayout3.checkMiniWindow();
                finderLiveVisitorPluginLayout3.unMount();
                if (finderLiveVisitorPluginLayout3.isManualClosed()) {
                    C62193a.f176816k1.mo87260a();
                } else {
                    FinderLiveService.f159376d.getClass();
                    C45795b bVar2 = FinderLiveService.f159348A;
                    long j = (bVar2 == null || (c212 = ((C55001u) bVar2.mo71262a(C55001u.class)).f154420q) == null) ? 0 : c212.f182392d;
                    String str2 = k0Var.f167726c;
                    Log.m105924i(str2, "ViewManagerRelease curService bind liveId: " + j);
                    C62193a.f176816k1.mo87263d(j);
                }
                b0Var = C13598b0.f38549a;
            }
            if (b0Var == null && k0Var.f167724a.isFinishing()) {
                C62193a.f176816k1.mo87260a();
            }
        }
        ((C63344h) C86312j.m106911c(C63344h.class)).destroy();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0011, code lost:
        r2 = ((cl1.C55001u) r2.mo71262a(cl1.C55001u.class)).f154420q;
     */
    /* renamed from: k3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo90886k3() {
        /*
            r17 = this;
            r0 = r17
            boolean r1 = r0.f192156r
            if (r1 == 0) goto L_0x0007
            return
        L_0x0007:
            r17.mo90885j3()
            r1 = 1
            r0.f192156r = r1
            fj1.b r2 = fj1.C45795b.f123698n
            if (r2 == 0) goto L_0x0020
            java.lang.Class<cl1.u> r3 = cl1.C55001u.class
            androidx.lifecycle.i0 r2 = r2.mo71262a(r3)
            cl1.u r2 = (cl1.C55001u) r2
            te3.c21 r2 = r2.f154420q
            if (r2 == 0) goto L_0x0020
            long r2 = r2.f182392d
            goto L_0x0022
        L_0x0020:
            r2 = 0
        L_0x0022:
            fj1.b r4 = fj1.C45795b.f123698n
            r5 = 0
            if (r4 == 0) goto L_0x0032
            java.lang.Class<cl1.o> r6 = cl1.C54991o.class
            androidx.lifecycle.i0 r4 = r4.mo71262a(r6)
            cl1.o r4 = (cl1.C54991o) r4
            boolean r4 = r4.f154355q1
            goto L_0x0033
        L_0x0032:
            r4 = 0
        L_0x0033:
            p50.a$a r6 = p50.C62193a.f176816k1
            p50.a r6 = r6.mo87262c(r2)
            if (r6 == 0) goto L_0x0044
            d50.i r7 = r6.f172989A
            if (r7 == 0) goto L_0x0044
            boolean r7 = r7.mo82881c()
            goto L_0x0045
        L_0x0044:
            r7 = 0
        L_0x0045:
            if (r6 == 0) goto L_0x0050
            d50.i r6 = r6.f172989A
            if (r6 == 0) goto L_0x0050
            boolean r6 = r6.mo82888j()
            goto L_0x0051
        L_0x0050:
            r6 = 0
        L_0x0051:
            java.lang.Class<aw.d> r8 = p447aw.C103918d.class
            di3.d r8 = di3.C86312j.m106911c(r8)
            aw.d r8 = (p447aw.C103918d) r8
            android.app.Activity r9 = r17.getContext()
            r10 = 21
            boolean r8 = r8.mo125776TW(r9, r10)
            if (r8 != 0) goto L_0x0066
            goto L_0x00c7
        L_0x0066:
            if (r7 != 0) goto L_0x00c7
            if (r6 == 0) goto L_0x006b
            goto L_0x00c7
        L_0x006b:
            if (r4 == 0) goto L_0x006e
            goto L_0x00c7
        L_0x006e:
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, p50.a> r4 = p50.C62193a.f176817l1
            java.util.Set r4 = r4.entrySet()
            java.lang.String r6 = "instanceArray.entries"
            gy3.C87412m.m108593f(r4, r6)
            java.util.Iterator r4 = r4.iterator()
            r6 = 0
        L_0x007e:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x00ac
            java.lang.Object r7 = r4.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.lang.Object r8 = r7.getValue()
            p50.a r8 = (p50.C62193a) r8
            b50.g r8 = r8.f176822Y0
            boolean r8 = r8.mo75229c()
            if (r8 == 0) goto L_0x007e
            java.lang.Object r6 = r7.getValue()
            p50.a r6 = (p50.C62193a) r6
            r6.mo87256C0(r5)
            java.lang.Object r6 = r7.getValue()
            p50.a r6 = (p50.C62193a) r6
            r6.mo75581i0()
            r6 = 1
            goto L_0x007e
        L_0x00ac:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r7 = "checkPlayerLeak "
            r4.append(r7)
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            java.lang.String r7 = "FinderLiveVisitorPlayCore"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r4)
            if (r6 != 0) goto L_0x00c5
            goto L_0x00c7
        L_0x00c5:
            r10 = 0
            goto L_0x00c8
        L_0x00c7:
            r10 = 1
        L_0x00c8:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "[LiveLifecycle]onDestroy "
            r1.append(r4)
            r1.append(r0)
            java.lang.String r4 = " playerLeakAssert:"
            r1.append(r4)
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            java.lang.String r4 = "Finder.FinderLiveVisitorUIC"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r1)
            ft1.a r8 = ft1.C59319a.f169618b
            r11 = 0
            r12 = 0
            r13 = 0
            zk1.t0 r14 = new zk1.t0
            r14.<init>(r2)
            r15 = 28
            r16 = 0
            java.lang.String r9 = "liveCdnPlayerLeak"
            o40.C11348f.C11349a.m11178b(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zk1.C66881u0.mo90886k3():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01ce  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01e4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r17, int r18, android.content.Intent r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            java.lang.Class<qj1.o> r4 = qj1.C62898o.class
            java.lang.Class<ak1.w> r5 = ak1.C54116w.class
            com.tencent.mm.plugin.finder.live.FinderLiveViewCallback r6 = r0.f192152n
            if (r6 == 0) goto L_0x0019
            eg1.k0 r6 = r6.f159223t
            com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout r6 = r6.f167728e
            if (r6 == 0) goto L_0x0019
            r6.onActivityResult(r1, r2, r3)
        L_0x0019:
            r6 = -1
            r7 = 2
            r8 = 0
            r9 = 0
            r10 = 1
            if (r2 != r6) goto L_0x01a1
            r2 = 1005(0x3ed, float:1.408E-42)
            r6 = 1006(0x3ee, float:1.41E-42)
            if (r1 == r2) goto L_0x0052
            if (r1 == r6) goto L_0x002a
            goto L_0x0182
        L_0x002a:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            android.app.Activity r3 = r16.getContext()
            android.app.Activity r11 = r16.getContext()
            android.content.res.Resources r11 = r11.getResources()
            r12 = 2131821641(0x7f110449, float:1.927603E38)
            java.lang.String r11 = r11.getString(r12)
            nj3.C76912y0.m92768g(r3, r11)
            di3.d r3 = di3.C86312j.m106911c(r5)
            ak1.w r3 = (ak1.C54116w) r3
            ak1.l0 r5 = ak1.C54097l0.Timeline
            r3.qw0(r8, r5, r2)
            goto L_0x0182
        L_0x0052:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            if (r3 == 0) goto L_0x0066
            java.lang.String r2 = "SendMsgUsernames"
            java.util.ArrayList r2 = r3.getStringArrayListExtra(r2)
            if (r2 != 0) goto L_0x0066
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r9)
        L_0x0066:
            boolean r3 = r2.isEmpty()
            r3 = r3 ^ r10
            if (r3 == 0) goto L_0x0182
            java.util.Iterator r3 = r2.iterator()
            java.lang.String r11 = ""
            r12 = r11
            r13 = 0
            r14 = 0
        L_0x0076:
            boolean r15 = r3.hasNext()
            java.lang.String r6 = "@chatroom"
            if (r15 == 0) goto L_0x00ad
            java.lang.Object r15 = r3.next()
            java.lang.String r15 = (java.lang.String) r15
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r12)
            r10.append(r15)
            r12 = 59
            r10.append(r12)
            java.lang.String r12 = r10.toString()
            java.lang.String r10 = "user"
            gy3.C87412m.m108593f(r15, r10)
            boolean r6 = z04.C112550d0.m153801u(r15, r6, r9)
            if (r6 == 0) goto L_0x00a7
            int r14 = r14 + 1
            goto L_0x00a9
        L_0x00a7:
            int r13 = r13 + 1
        L_0x00a9:
            r6 = 1006(0x3ee, float:1.41E-42)
            r10 = 1
            goto L_0x0076
        L_0x00ad:
            java.lang.String r3 = ";"
            boolean r3 = z04.C112551y.m153808h(r12, r3, r9, r7, r8)
            if (r3 == 0) goto L_0x00c5
            int r3 = r12.length()
            r10 = 1
            int r3 = r3 - r10
            java.lang.String r12 = r12.substring(r9, r3)
            java.lang.String r3 = "this as java.lang.String…ing(startIndex, endIndex)"
            gy3.C87412m.m108593f(r12, r3)
        L_0x00c5:
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            fj1.b r10 = fj1.C45795b.f123698n
            if (r10 == 0) goto L_0x00ff
            up1.f r10 = up1.C37521f.f99374d
            r10.getClass()
            pe1.c<java.lang.Integer> r10 = up1.C37521f.f99245O1
            java.lang.Object r10 = r10.mo60266n()
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            r15 = 1
            if (r10 != r15) goto L_0x00e4
            r10 = 1
            goto L_0x00e5
        L_0x00e4:
            r10 = 0
        L_0x00e5:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "local enable:"
            r7.append(r8)
            r7.append(r10)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "Finder.BoxCommon"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r7)
            if (r10 != r15) goto L_0x00ff
            r7 = 1
            goto L_0x0100
        L_0x00ff:
            r7 = 0
        L_0x0100:
            if (r7 == 0) goto L_0x0176
            fj1.b r7 = fj1.C45795b.f123698n
            if (r7 == 0) goto L_0x0176
            java.lang.Class<cl1.j> r8 = cl1.C39975j.class
            androidx.lifecycle.i0 r7 = r7.mo71262a(r8)
            cl1.j r7 = (cl1.C39975j) r7
            androidx.lifecycle.z<te3.lw0> r7 = r7.f107170j
            java.lang.Object r7 = r7.getValue()
            te3.lw0 r7 = (te3.C50317lw0) r7
            if (r7 == 0) goto L_0x011e
            java.lang.String r7 = r7.f137677e
            if (r7 != 0) goto L_0x011d
            goto L_0x011e
        L_0x011d:
            r11 = r7
        L_0x011e:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x0127:
            boolean r8 = r2.hasNext()
            if (r8 == 0) goto L_0x0144
            java.lang.Object r8 = r2.next()
            r10 = r8
            java.lang.String r10 = (java.lang.String) r10
            r19 = r2
            r2 = 0
            r15 = 2
            boolean r10 = z04.C112551y.m153808h(r10, r6, r9, r15, r2)
            if (r10 == 0) goto L_0x0141
            r7.add(r8)
        L_0x0141:
            r2 = r19
            goto L_0x0127
        L_0x0144:
            java.lang.Object r2 = sx3.C110818d0.m150925W(r7)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x0176
            java.lang.String r6 = "group_box_number"
            r3.put(r6, r11)
            int r6 = r2.length()
            if (r6 != 0) goto L_0x0159
            r6 = 1
            goto L_0x015a
        L_0x0159:
            r6 = 0
        L_0x015a:
            if (r6 == 0) goto L_0x015e
            r2 = 0
            goto L_0x016a
        L_0x015e:
            java.lang.Class<wo.b> r6 = p740wo.C53193b.class
            di3.d r6 = di3.C86312j.m106911c(r6)
            wo.b r6 = (p740wo.C53193b) r6
            int r2 = r6.mo73729p1(r2)
        L_0x016a:
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r6 = "group_users_number"
            java.lang.Object r2 = r3.put(r6, r2)
            java.lang.String r2 = (java.lang.String) r2
        L_0x0176:
            di3.d r2 = di3.C86312j.m106911c(r5)
            ak1.w r2 = (ak1.C54116w) r2
            ak1.l0 r5 = ak1.C54097l0.Chat
            r2.qw0(r12, r5, r3)
            goto L_0x0184
        L_0x0182:
            r13 = 0
            r14 = 0
        L_0x0184:
            if (r13 <= 0) goto L_0x0189
            r0.mo90882f3(r9, r13)
        L_0x0189:
            r2 = 1
            if (r14 <= 0) goto L_0x018f
            r0.mo90882f3(r2, r14)
        L_0x018f:
            r3 = 1006(0x3ee, float:1.41E-42)
            if (r1 == r3) goto L_0x019d
            r3 = 1008(0x3f0, float:1.413E-42)
            if (r1 == r3) goto L_0x0198
            goto L_0x01a1
        L_0x0198:
            r3 = 3
            r0.mo90882f3(r3, r2)
            goto L_0x01a1
        L_0x019d:
            r3 = 2
            r0.mo90882f3(r3, r2)
        L_0x01a1:
            r2 = 1010(0x3f2, float:1.415E-42)
            if (r1 != r2) goto L_0x01ed
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r2 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r2.getClass()
            com.tencent.mm.plugin.finder.live.view.b r3 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159379g
            if (r3 == 0) goto L_0x01cb
            qj1.c r3 = r3.getPlugin(r4)
            qj1.o r3 = (qj1.C62898o) r3
            if (r3 == 0) goto L_0x01cb
            cl1.d$c r3 = r3.mo87843b1()
            if (r3 == 0) goto L_0x01c5
            u62.d r3 = r3.getPlayer()
            boolean r3 = r3.isPlaying()
            goto L_0x01c6
        L_0x01c5:
            r3 = 0
        L_0x01c6:
            r5 = 1
            if (r3 != r5) goto L_0x01cb
            r10 = 1
            goto L_0x01cc
        L_0x01cb:
            r10 = 0
        L_0x01cc:
            if (r10 == 0) goto L_0x01e4
            com.tencent.mm.plugin.finder.live.view.b r2 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159379g
            if (r2 == 0) goto L_0x01ed
            qj1.c r2 = r2.getPlugin(r4)
            qj1.o r2 = (qj1.C62898o) r2
            if (r2 == 0) goto L_0x01ed
            cl1.d$c r2 = r2.mo87843b1()
            if (r2 == 0) goto L_0x01ed
            r2.setMute(r9)
            goto L_0x01ed
        L_0x01e4:
            p50.e r2 = r2.mo77631e0()
            if (r2 == 0) goto L_0x01ed
            r2.mo87273O0(r9)
        L_0x01ed:
            r2 = 1011(0x3f3, float:1.417E-42)
            if (r1 != r2) goto L_0x0231
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r2 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r2.getClass()
            cj1.n5 r2 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159396y
            if (r2 == 0) goto L_0x0231
            cj1.t r2 = (cj1.C54820t) r2
            fj1.b r3 = r2.f153692b
            java.lang.Class<cl1.h1> r4 = cl1.C54979h1.class
            androidx.lifecycle.i0 r3 = r3.mo71262a(r4)
            cl1.h1 r3 = (cl1.C54979h1) r3
            cm1.i2 r3 = r3.f154147v
            if (r3 == 0) goto L_0x0231
            boolean r4 = r3 instanceof sk1.C63962r
            if (r4 == 0) goto L_0x020f
            goto L_0x0210
        L_0x020f:
            r3 = 0
        L_0x0210:
            if (r3 == 0) goto L_0x0231
            boolean r4 = r3 instanceof sk1.C63962r
            if (r4 == 0) goto L_0x0219
            sk1.r r3 = (sk1.C63962r) r3
            goto L_0x021a
        L_0x0219:
            r3 = 0
        L_0x021a:
            if (r3 == 0) goto L_0x0231
            te3.w51 r4 = r3.f181314s
            dj1.k1 r5 = new dj1.k1
            fj1.b r2 = r2.f153692b
            r5.<init>(r2, r4)
            nr3.e r2 = r5.mo9225i()
            cj1.p0 r4 = new cj1.p0
            r4.<init>(r3)
            r2.mo123420E(r4)
        L_0x0231:
            r2 = 1016(0x3f8, float:1.424E-42)
            if (r1 != r2) goto L_0x025e
            fj1.b r1 = fj1.C45795b.f123698n
            if (r1 == 0) goto L_0x025e
            ok1.e r2 = ok1.C62042e.f176370a
            boolean r3 = r2.mo87081g1(r1)
            r4 = 0
            boolean r2 = r2.mo87087i1(r1, r4)
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r5 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r5.getClass()
            cj1.n5 r5 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159396y
            if (r5 == 0) goto L_0x025e
            zc1.b r6 = zc1.C66785b.f191882e
            java.lang.String r6 = r6.mo90662O5()
            zk1.u0$a r7 = new zk1.u0$a
            r7.<init>(r1, r3, r2)
            cj1.t r5 = (cj1.C54820t) r5
            r1 = 2
            r5.mo75733f(r6, r1, r4, r7)
        L_0x025e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zk1.C66881u0.onActivityResult(int, int, android.content.Intent):void");
    }

    public boolean onBackPressed() {
        FinderLiveVisitorPluginLayout finderLiveVisitorPluginLayout;
        FinderLiveViewCallback finderLiveViewCallback = this.f192152n;
        boolean z = false;
        if (!(finderLiveViewCallback == null || (finderLiveVisitorPluginLayout = finderLiveViewCallback.f159223t.f167728e) == null)) {
            z = finderLiveVisitorPluginLayout.onBackPress();
        }
        if (!z) {
            this.f192149h = true;
        }
        Log.m105924i("Finder.FinderLiveVisitorUIC", "[LiveLifecycle]onBackPressed " + this + ", ret:" + z + ", leaveByBack:" + this.f192149h);
        return z;
    }

    public void onBeforeFinish(Intent intent) {
        super.onBeforeFinish(intent);
        if (this.f192147f) {
            mo90885j3();
        } else {
            this.f192155q = new C66883b(this);
        }
        this.f192148g = true;
    }

    public void onConfigurationChanged(Configuration configuration) {
        FinderLiveVisitorPluginLayout finderLiveVisitorPluginLayout;
        C87412m.m108594g(configuration, "newConfig");
        Log.m105924i("Finder.FinderLiveVisitorUIC", "[LiveLifecycle]onConfigurationChanged orientation:" + configuration.orientation);
        super.onConfigurationChanged(configuration);
        FinderLiveViewCallback finderLiveViewCallback = this.f192152n;
        if (finderLiveViewCallback != null && (finderLiveVisitorPluginLayout = finderLiveViewCallback.f159223t.f167728e) != null) {
            finderLiveVisitorPluginLayout.onConfigurationChanged(configuration);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x00d0, code lost:
        r5 = ((cl1.C55001u) r5.mo71262a(cl1.C55001u.class)).f154420q;
     */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0386  */
    /* JADX WARNING: Removed duplicated region for block: B:116:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r32) {
        /*
            r31 = this;
            r1 = r31
            super.onCreate(r32)
            androidx.appcompat.app.AppCompatActivity r0 = r31.getActivity()
            boolean r0 = r0 instanceof com.tencent.p014mm.p136ui.MMActivity
            java.lang.String r2 = "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity"
            if (r0 == 0) goto L_0x001d
            androidx.appcompat.app.AppCompatActivity r0 = r31.getActivity()
            gy3.C87412m.m108592e(r0, r2)
            com.tencent.mm.ui.MMActivity r0 = (com.tencent.p014mm.p136ui.MMActivity) r0
            r3 = 8
            r0.setSelfNavigationBarVisible(r3)
        L_0x001d:
            android.view.Window r0 = r31.mo90881e3()
            r3 = 2097280(0x200080, float:2.938915E-39)
            r0.addFlags(r3)
            android.view.Window r0 = r31.mo90881e3()
            r3 = 67108864(0x4000000, float:1.5046328E-36)
            r0.addFlags(r3)
            android.view.Window r0 = r31.mo90881e3()
            r4 = 1024(0x400, float:1.435E-42)
            r0.clearFlags(r4)
            android.view.Window r0 = r31.mo90881e3()
            r5 = 512(0x200, float:7.175E-43)
            r0.clearFlags(r5)
            android.view.Window r0 = r31.mo90881e3()
            r0.clearFlags(r3)
            android.app.Activity r0 = r31.getContext()
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.orientation
            r3 = 2
            if (r0 != r3) goto L_0x006f
            android.view.Window r0 = r31.mo90881e3()
            android.view.View r0 = r0.getDecorView()
            r3 = 7942(0x1f06, float:1.1129E-41)
            r0.setSystemUiVisibility(r3)
            android.view.Window r0 = r31.mo90881e3()
            r0.addFlags(r4)
            goto L_0x007c
        L_0x006f:
            android.view.Window r0 = r31.mo90881e3()
            android.view.View r0 = r0.getDecorView()
            r3 = 1792(0x700, float:2.511E-42)
            r0.setSystemUiVisibility(r3)
        L_0x007c:
            android.view.Window r0 = r31.mo90881e3()
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r0.addFlags(r3)
            android.view.Window r0 = r31.mo90881e3()
            r3 = 0
            r0.setStatusBarColor(r3)
            android.view.Window r0 = r31.mo90881e3()
            r0.setNavigationBarColor(r3)
            android.view.Window r0 = r31.mo90881e3()
            r4 = -3
            r0.setFormat(r4)
            android.view.Window r0 = r31.mo90881e3()
            r4 = 51
            r0.setSoftInputMode(r4)
            cj1.b1$a r0 = cj1.C54738b1.f153409B
            android.content.Intent r4 = r31.getIntent()
            cj1.b1 r0 = r0.mo560b(r4)
            if (r0 != 0) goto L_0x00b2
            goto L_0x00be
        L_0x00b2:
            android.content.Intent r4 = r31.getIntent()
            java.lang.String r5 = "KEY_PARAMS_ENTRANCE_REPORT_INFO"
            android.os.Bundle r4 = r4.getBundleExtra(r5)
            r0.f153435x = r4
        L_0x00be:
            android.content.Intent r4 = r31.getIntent()
            java.lang.String r5 = "KEY_PARAMS_RESET_LIVE"
            boolean r4 = r4.getBooleanExtra(r5, r3)
            fj1.b$a r5 = fj1.C45795b.f123697j
            fj1.b r5 = fj1.C45795b.f123698n
            r6 = 0
            if (r5 == 0) goto L_0x00df
            java.lang.Class<cl1.u> r8 = cl1.C55001u.class
            androidx.lifecycle.i0 r5 = r5.mo71262a(r8)
            cl1.u r5 = (cl1.C55001u) r5
            te3.c21 r5 = r5.f154420q
            if (r5 == 0) goto L_0x00df
            long r8 = r5.f182392d
            goto L_0x00e0
        L_0x00df:
            r8 = r6
        L_0x00e0:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r10 = "[LiveLifecycle] onCreate comeFromReset:"
            r5.append(r10)
            r5.append(r4)
            java.lang.String r10 = ", across_live "
            r5.append(r10)
            r5.append(r8)
            java.lang.String r10 = " configProvider:"
            r5.append(r10)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            android.content.Intent r10 = r31.getIntent()
            java.lang.String r11 = "KEY_PARAMS_NOT_KEEP_CUR_LIVE"
            boolean r10 = r10.getBooleanExtra(r11, r3)
            java.lang.String r11 = "Finder.FinderLiveVisitorUIC"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r5)
            qt1.b r12 = qt1.C63329b.f179694a
            r12.mo88233d(r11, r5)
            java.lang.String r5 = "rootView.findViewById(R.…finder_live_content_root)"
            java.lang.String r13 = "rootView.findViewById(R.id.finder_live_rf)"
            java.lang.String r15 = ""
            r16 = 0
            if (r0 == 0) goto L_0x0266
            com.tencent.mm.live.api.LiveConfig r14 = r0.mo75635d()
            r18 = r13
            if (r14 == 0) goto L_0x012f
            long r12 = r14.f157064e
            int r14 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r14 != 0) goto L_0x012f
            r12 = 1
            goto L_0x0130
        L_0x012f:
            r12 = 0
        L_0x0130:
            if (r12 != 0) goto L_0x0263
            if (r4 != 0) goto L_0x0263
            bl3.r r4 = bl3.C39818r.f106831a
            androidx.appcompat.app.AppCompatActivity r11 = r31.getActivity()
            bl3.r$a r4 = r4.mo62444c(r11)
            java.lang.Class<ht1.g4> r11 = ht1.C60172g4.class
            bl3.c r4 = r4.mo62447c(r11)
            ht1.g4 r4 = (ht1.C60172g4) r4
            java.lang.String r4 = r4.mo12866v3()
            r0.f153428q = r4
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r4 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r4.getClass()
            al1.i r11 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159398z
            int r12 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r12 == 0) goto L_0x015c
            if (r10 != 0) goto L_0x015c
            r27 = 1
            goto L_0x015e
        L_0x015c:
            r27 = 0
        L_0x015e:
            al1.i r6 = new al1.i
            r6.<init>()
            if (r27 == 0) goto L_0x019b
            if (r11 == 0) goto L_0x018d
            java.util.ArrayList<al1.h> r7 = r11.f151990e
            if (r7 == 0) goto L_0x018d
            java.util.Iterator r7 = r7.iterator()
        L_0x016f:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto L_0x018b
            java.lang.Object r10 = r7.next()
            r11 = r10
            al1.h r11 = (al1.C54127h) r11
            com.tencent.mm.live.api.LiveConfig r11 = r11.f151977d
            long r11 = r11.f157064e
            int r13 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r13 != 0) goto L_0x0186
            r11 = 1
            goto L_0x0187
        L_0x0186:
            r11 = 0
        L_0x0187:
            if (r11 == 0) goto L_0x016f
            r16 = r10
        L_0x018b:
            al1.h r16 = (al1.C54127h) r16
        L_0x018d:
            r7 = r16
            r6.mo74927e(r0)
            if (r7 != 0) goto L_0x0195
            goto L_0x019e
        L_0x0195:
            java.util.ArrayList<al1.h> r0 = r6.f151990e
            r0.add(r3, r7)
            goto L_0x019e
        L_0x019b:
            r6.mo74927e(r0)
        L_0x019e:
            android.content.Intent r0 = r31.getIntent()
            java.lang.String r7 = "PRE_JOIN_LIVE_INFO"
            byte[] r0 = r0.getByteArrayExtra(r7)
            if (r0 == 0) goto L_0x01c1
            te3.m51 r7 = new te3.m51
            r7.<init>()
            r7.parseFrom(r0)     // Catch:{ Exception -> 0x01b3 }
            goto L_0x01bf
        L_0x01b3:
            r0 = move-exception
            r8 = r0
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r3] = r8
            java.lang.String r8 = "safeParser"
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r8, r15, r0)
        L_0x01bf:
            r6.f151995j = r7
        L_0x01c1:
            r4.mo77615R(r6)
            com.tencent.mm.plugin.finder.live.FinderLivePresenter r0 = new com.tencent.mm.plugin.finder.live.FinderLivePresenter
            android.app.Activity r4 = r31.getContext()
            r0.<init>(r4)
            r1.f192151j = r0
            bl3.r r0 = bl3.C39818r.f106831a
            androidx.appcompat.app.AppCompatActivity r4 = r31.getActivity()
            bl3.r$a r0 = r0.mo62444c(r4)
            java.lang.Class<zk1.r0> r4 = zk1.C66879r0.class
            androidx.lifecycle.i0 r0 = r0.mo75002a(r4)
            zk1.r0 r0 = (zk1.C66879r0) r0
            com.tencent.mm.plugin.finder.live.FinderLivePresenter r4 = r1.f192151j
            java.lang.String r6 = r0.f192128d
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "onFirstEnter, presenter:"
            r7.append(r8)
            if (r4 == 0) goto L_0x01f6
            int r8 = r4.hashCode()
            goto L_0x01f7
        L_0x01f6:
            r8 = 0
        L_0x01f7:
            r7.append(r8)
            r8 = 32
            r7.append(r8)
            int r8 = r0.mo90873d3()
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r7)
            int r6 = r0.mo90873d3()
            r7 = 1
            if (r6 != r7) goto L_0x0216
            r0.f192131g = r7
        L_0x0216:
            r0.f192132h = r4
            com.tencent.mm.plugin.finder.live.FinderLiveViewCallback r0 = new com.tencent.mm.plugin.finder.live.FinderLiveViewCallback
            android.view.View r4 = r31.getRootView()
            r6 = 2131304236(0x7f091f2c, float:1.8226609E38)
            android.view.View r4 = r4.findViewById(r6)
            r10 = r18
            gy3.C87412m.m108593f(r4, r10)
            r21 = r4
            com.tencent.mm.view.RefreshLoadMoreLayout r21 = (com.tencent.p014mm.view.RefreshLoadMoreLayout) r21
            android.view.View r4 = r31.getRootView()
            r6 = 2131303420(0x7f091bfc, float:1.8224954E38)
            android.view.View r4 = r4.findViewById(r6)
            gy3.C87412m.m108593f(r4, r5)
            androidx.appcompat.app.AppCompatActivity r5 = r31.getActivity()
            gy3.C87412m.m108592e(r5, r2)
            r23 = r5
            com.tencent.mm.ui.MMActivity r23 = (com.tencent.p014mm.p136ui.MMActivity) r23
            androidx.fragment.app.Fragment r24 = r31.getFragment()
            com.tencent.mm.plugin.finder.live.FinderLivePresenter r5 = r1.f192151j
            r20 = r0
            r22 = r4
            r25 = r5
            r26 = r27
            r20.<init>(r21, r22, r23, r24, r25, r26, r27)
            com.tencent.mm.plugin.finder.live.FinderLivePresenter r4 = r1.f192151j
            if (r4 == 0) goto L_0x025f
            r4.mo77492G(r0)
        L_0x025f:
            r1.f192152n = r0
            goto L_0x0351
        L_0x0263:
            r10 = r18
            goto L_0x0267
        L_0x0266:
            r10 = r13
        L_0x0267:
            int r4 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x02f7
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r4 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r4.getClass()
            al1.i r4 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159398z
            if (r4 == 0) goto L_0x0283
            java.util.ArrayList<al1.h> r4 = r4.f151990e
            if (r4 == 0) goto L_0x0283
            java.lang.Object r4 = sx3.C110818d0.m150916N(r4)
            al1.h r4 = (al1.C54127h) r4
            if (r4 == 0) goto L_0x0283
            com.tencent.mm.live.api.LiveConfig r4 = r4.f151977d
            goto L_0x0285
        L_0x0283:
            r4 = r16
        L_0x0285:
            if (r4 != 0) goto L_0x0288
            goto L_0x029e
        L_0x0288:
            if (r0 == 0) goto L_0x029c
            java.util.ArrayList<com.tencent.mm.live.api.LiveConfig> r0 = r0.f153423l
            if (r0 == 0) goto L_0x029c
            java.lang.Object r0 = sx3.C110818d0.m150916N(r0)
            com.tencent.mm.live.api.LiveConfig r0 = (com.tencent.p014mm.live.api.LiveConfig) r0
            if (r0 == 0) goto L_0x029c
            java.lang.String r0 = r0.f157047E
            if (r0 != 0) goto L_0x029b
            goto L_0x029c
        L_0x029b:
            r15 = r0
        L_0x029c:
            r4.f157047E = r15
        L_0x029e:
            com.tencent.mm.plugin.finder.live.FinderLivePresenter r0 = new com.tencent.mm.plugin.finder.live.FinderLivePresenter
            android.app.Activity r4 = r31.getContext()
            r0.<init>(r4)
            r1.f192151j = r0
            com.tencent.mm.plugin.finder.live.FinderLiveViewCallback r0 = new com.tencent.mm.plugin.finder.live.FinderLiveViewCallback
            android.view.View r4 = r31.getRootView()
            r6 = 2131304236(0x7f091f2c, float:1.8226609E38)
            android.view.View r4 = r4.findViewById(r6)
            gy3.C87412m.m108593f(r4, r10)
            r19 = r4
            com.tencent.mm.view.RefreshLoadMoreLayout r19 = (com.tencent.p014mm.view.RefreshLoadMoreLayout) r19
            android.view.View r4 = r31.getRootView()
            r6 = 2131303420(0x7f091bfc, float:1.8224954E38)
            android.view.View r4 = r4.findViewById(r6)
            gy3.C87412m.m108593f(r4, r5)
            androidx.appcompat.app.AppCompatActivity r5 = r31.getActivity()
            gy3.C87412m.m108592e(r5, r2)
            r21 = r5
            com.tencent.mm.ui.MMActivity r21 = (com.tencent.p014mm.p136ui.MMActivity) r21
            androidx.fragment.app.Fragment r22 = r31.getFragment()
            com.tencent.mm.plugin.finder.live.FinderLivePresenter r5 = r1.f192151j
            r24 = 1
            r25 = 0
            r26 = 64
            r27 = 0
            r18 = r0
            r20 = r4
            r23 = r5
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27)
            com.tencent.mm.plugin.finder.live.FinderLivePresenter r4 = r1.f192151j
            if (r4 == 0) goto L_0x02f4
            r4.mo77492G(r0)
        L_0x02f4:
            r1.f192152n = r0
            goto L_0x0351
        L_0x02f7:
            fj1.b r0 = fj1.C45795b.f123698n
            if (r0 == 0) goto L_0x030c
            java.lang.Class<cl1.o> r4 = cl1.C54991o.class
            androidx.lifecycle.i0 r0 = r0.mo71262a(r4)
            cl1.o r0 = (cl1.C54991o) r0
            boolean r0 = r0.mo75997d4()
            r4 = 1
            if (r0 != r4) goto L_0x030c
            r12 = 1
            goto L_0x030d
        L_0x030c:
            r12 = 0
        L_0x030d:
            if (r12 == 0) goto L_0x0324
            ft1.a r13 = ft1.C59319a.f169618b
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 60
            r21 = 0
            java.lang.String r14 = "liveVisitorUIParamsInvalidFinish"
            o40.C11348f.C11349a.m11178b(r13, r14, r15, r16, r17, r18, r19, r20, r21)
            goto L_0x0339
        L_0x0324:
            ft1.a r22 = ft1.C59319a.f169618b
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 60
            r30 = 0
            java.lang.String r23 = "liveVisitorUIParamsInvalid"
            o40.C11348f.C11349a.m11178b(r22, r23, r24, r25, r26, r27, r28, r29, r30)
        L_0x0339:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "onCreate err stack:"
            r0.append(r4)
            com.tencent.mm.sdk.platformtools.MMStack r4 = com.tencent.p014mm.sdk.platformtools.Util.getStack()
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r0)
        L_0x0351:
            com.tencent.mm.plugin.finder.live.view.m1 r0 = new com.tencent.mm.plugin.finder.live.view.m1
            uv0.i r4 = new uv0.i
            androidx.appcompat.app.AppCompatActivity r5 = r31.getActivity()
            gy3.C87412m.m108592e(r5, r2)
            com.tencent.mm.ui.MMActivity r5 = (com.tencent.p014mm.p136ui.MMActivity) r5
            r4.<init>(r5)
            r0.<init>(r4)
            r1.f192153o = r0
            r2 = 21
            java.lang.String r4 = "LiveFloatBall"
            r0.mo35648A(r2, r4)
            android.content.Intent r0 = r31.getIntent()
            java.lang.String r2 = "LAUNCH_WITH_ANIM"
            boolean r0 = r0.getBooleanExtra(r2, r3)
            if (r0 != 0) goto L_0x038b
            android.view.View r0 = r31.getRootView()
            r2 = 2131303421(0x7f091bfd, float:1.8224956E38)
            android.view.View r0 = r0.findViewById(r2)
            if (r0 == 0) goto L_0x038b
            r2 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0.setBackgroundColor(r2)
        L_0x038b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zk1.C66881u0.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        super.onDestroy();
        Log.m105924i("Finder.FinderLiveVisitorUIC", "[LiveLifecycle]onDestroy " + this + ' ' + this.f192148g + ' ' + this.f192147f);
        if (!this.f192148g || !this.f192147f) {
            mo90886k3();
        }
        FinderLivePresenter finderLivePresenter = this.f192151j;
        if (finderLivePresenter != null) {
            finderLivePresenter.onDetach();
        }
        C56090m1 m1Var = this.f192153o;
        if (m1Var != null) {
            m1Var.mo67996A0();
        }
    }

    public void onNewIntent(Intent intent) {
        FinderLiveVisitorPluginLayout finderLiveVisitorPluginLayout;
        super.onNewIntent(intent);
        FinderLiveViewCallback finderLiveViewCallback = this.f192152n;
        if (finderLiveViewCallback != null && (finderLiveVisitorPluginLayout = finderLiveViewCallback.f159223t.f167728e) != null) {
            finderLiveVisitorPluginLayout.onNewIntent(intent);
        }
    }

    public void onPause() {
        Log.m105924i("Finder.FinderLiveVisitorUIC", "[LiveLifecycle]onPause " + this + ", " + this.f192155q);
        super.onPause();
        this.f192147f = true;
        KeyboardHeightProvider keyboardHeightProvider = this.f192150i;
        if (keyboardHeightProvider != null) {
            keyboardHeightProvider.mo104021d();
        }
        KeyboardHeightProvider keyboardHeightProvider2 = this.f192150i;
        if (keyboardHeightProvider2 != null) {
            keyboardHeightProvider2.f220015b = null;
        }
        this.f192150i = null;
        Runnable runnable = this.f192155q;
        if (runnable != null) {
            runnable.run();
        }
        this.f192155q = null;
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        FinderLiveVisitorPluginLayout finderLiveVisitorPluginLayout;
        C87412m.m108594g(strArr, "permissions");
        C87412m.m108594g(iArr, "grantResults");
        super.onRequestPermissionsResult(i, strArr, iArr);
        FinderLiveViewCallback finderLiveViewCallback = this.f192152n;
        if (finderLiveViewCallback != null && (finderLiveVisitorPluginLayout = finderLiveViewCallback.f159223t.f167728e) != null) {
            finderLiveVisitorPluginLayout.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0050, code lost:
        r2 = ((cl1.C55001u) r2.mo71262a(cl1.C55001u.class)).f154420q;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onRestoreInstanceState(android.os.Bundle r12) {
        /*
            r11 = this;
            super.onRestoreInstanceState(r12)
            cj1.b1$a r0 = cj1.C54738b1.f153409B
            r1 = 0
            if (r12 != 0) goto L_0x000a
            r12 = 0
            goto L_0x0040
        L_0x000a:
            java.lang.String r2 = "KEY_PARAMS_CONFIG_KEY"
            java.lang.String r2 = r12.getString(r2)
            if (r2 != 0) goto L_0x0014
            java.lang.String r2 = ""
        L_0x0014:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "getFromBundle "
            r3.append(r4)
            int r12 = r12.hashCode()
            r3.append(r12)
            java.lang.String r12 = ", key:"
            r3.append(r12)
            r3.append(r2)
            java.lang.String r12 = r3.toString()
            java.lang.Object[] r3 = new java.lang.Object[r1]
            java.lang.String r4 = "Finder.FinderLiveBundle"
            com.tencent.p014mm.sdk.platformtools.Log.printInfoStack(r4, r12, r3)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, cj1.b1> r12 = cj1.C54738b1.f153410C
            java.lang.Object r12 = r12.get(r2)
            cj1.b1 r12 = (cj1.C54738b1) r12
        L_0x0040:
            android.content.Intent r2 = r11.getIntent()
            cj1.b1 r0 = r0.mo560b(r2)
            fj1.b$a r2 = fj1.C45795b.f123697j
            fj1.b r2 = fj1.C45795b.f123698n
            r3 = 0
            if (r2 == 0) goto L_0x005f
            java.lang.Class<cl1.u> r5 = cl1.C55001u.class
            androidx.lifecycle.i0 r2 = r2.mo71262a(r5)
            cl1.u r2 = (cl1.C55001u) r2
            te3.c21 r2 = r2.f154420q
            if (r2 == 0) goto L_0x005f
            long r5 = r2.f182392d
            goto L_0x0060
        L_0x005f:
            r5 = r3
        L_0x0060:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r7 = "[LiveLifecycle] onRestoreInstanceState "
            r2.append(r7)
            r2.append(r11)
            java.lang.String r7 = " configProvider:"
            r2.append(r7)
            r2.append(r0)
            java.lang.String r7 = " restoreConfigProvider:"
            r2.append(r7)
            r2.append(r12)
            java.lang.String r7 = " curLiveId:"
            r2.append(r7)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            java.lang.String r7 = "Finder.FinderLiveVisitorUIC"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r2)
            if (r0 != 0) goto L_0x0106
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0106
            if (r12 == 0) goto L_0x0106
            com.tencent.mm.live.api.LiveConfig r0 = r12.mo75635d()
            if (r0 == 0) goto L_0x00a3
            long r5 = r0.f157064e
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x00a3
            r1 = 1
        L_0x00a3:
            if (r1 != 0) goto L_0x0106
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r0 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            al1.i r1 = new al1.i
            r1.<init>()
            r1.mo74927e(r12)
            r0.mo77615R(r1)
            com.tencent.mm.plugin.finder.live.FinderLivePresenter r12 = new com.tencent.mm.plugin.finder.live.FinderLivePresenter
            android.app.Activity r0 = r11.getContext()
            r12.<init>(r0)
            r11.f192151j = r12
            com.tencent.mm.plugin.finder.live.FinderLiveViewCallback r12 = new com.tencent.mm.plugin.finder.live.FinderLiveViewCallback
            android.view.View r0 = r11.getRootView()
            r1 = 2131304236(0x7f091f2c, float:1.8226609E38)
            android.view.View r0 = r0.findViewById(r1)
            java.lang.String r1 = "rootView.findViewById(R.id.finder_live_rf)"
            gy3.C87412m.m108593f(r0, r1)
            r2 = r0
            com.tencent.mm.view.RefreshLoadMoreLayout r2 = (com.tencent.p014mm.view.RefreshLoadMoreLayout) r2
            android.view.View r0 = r11.getRootView()
            r1 = 2131303420(0x7f091bfc, float:1.8224954E38)
            android.view.View r3 = r0.findViewById(r1)
            java.lang.String r0 = "rootView.findViewById(R.…finder_live_content_root)"
            gy3.C87412m.m108593f(r3, r0)
            androidx.appcompat.app.AppCompatActivity r0 = r11.getActivity()
            java.lang.String r1 = "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity"
            gy3.C87412m.m108592e(r0, r1)
            r4 = r0
            com.tencent.mm.ui.MMActivity r4 = (com.tencent.p014mm.p136ui.MMActivity) r4
            androidx.fragment.app.Fragment r5 = r11.getFragment()
            com.tencent.mm.plugin.finder.live.FinderLivePresenter r6 = r11.f192151j
            r7 = 0
            r8 = 0
            r9 = 64
            r10 = 0
            r1 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            com.tencent.mm.plugin.finder.live.FinderLivePresenter r0 = r11.f192151j
            if (r0 == 0) goto L_0x0104
            r0.mo77492G(r12)
        L_0x0104:
            r11.f192152n = r12
        L_0x0106:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zk1.C66881u0.onRestoreInstanceState(android.os.Bundle):void");
    }

    public void onResume() {
        View decorView;
        Log.m105924i("Finder.FinderLiveVisitorUIC", "[LiveLifecycle]onResume " + this + ',');
        super.onResume();
        Activity context = getContext();
        C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
        Window window = context.getWindow();
        if (!(window == null || (decorView = window.getDecorView()) == null)) {
            decorView.post(new C66884c(this));
        }
        Log.m105924i("Finder.FinderLiveVisitorUIC", "initBusiness");
        FinderLiveViewCallback finderLiveViewCallback = this.f192152n;
        if (finderLiveViewCallback != null) {
            Log.m105924i("Finder.FinderLiveViewCallback", "[LiveLifecycle]onInit " + finderLiveViewCallback);
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        C54738b1 b1Var;
        Class cls = C54991o.class;
        super.onSaveInstanceState(bundle);
        StringBuilder sb = new StringBuilder();
        sb.append("[LiveLifecycle] onSaveInstanceState ");
        sb.append(this);
        sb.append(" curData:");
        C45795b bVar = C45795b.f123698n;
        Integer num = null;
        sb.append(bVar != null ? (C54991o) bVar.mo71262a(cls) : null);
        Log.m105924i("Finder.FinderLiveVisitorUIC", sb.toString());
        C45795b bVar2 = C45795b.f123698n;
        if (bVar2 != null) {
            C55001u uVar = (C55001u) bVar2.mo71262a(C55001u.class);
            LiveConfig.C55204b bVar3 = new LiveConfig.C55204b();
            bVar3.f157091a = 1;
            bVar3.f157093c = uVar.f154420q.f182392d;
            bVar3.f157106p = uVar.f154423t;
            bVar3.f157101k = uVar.f154416j;
            bVar3.f157096f = ((C54991o) uVar.business(cls)).f154345o;
            bVar3.f157102l = ((C54991o) uVar.business(cls)).f154252S0;
            LiveConfig a = bVar3.mo76374a();
            a.f157062U = uVar.f154413g;
            C54738b1 b1Var2 = new C54738b1();
            b1Var2.f153423l.add(a);
            FinderLiveService.f159376d.getClass();
            C54129i iVar = FinderLiveService.f159398z;
            b1Var2.f153411A = (iVar == null || (b1Var = iVar.f151991f) == null) ? null : b1Var.f153411A;
            StringBuilder sb4 = new StringBuilder();
            sb4.append("checkstreamparams onSaveInstanceState ");
            C64347eq2 eq22 = b1Var2.f153411A;
            if (eq22 != null) {
                num = Integer.valueOf(eq22.hashCode());
            }
            sb4.append(num);
            Log.m105924i("Finder.FinderLiveVisitorUIC", sb4.toString());
            C54738b1.f153409B.mo561c(bundle, b1Var2);
        }
    }

    public void onStart() {
        Log.m105924i("Finder.FinderLiveVisitorUIC", "[LiveLifecycle]onStart " + this + ", activateUIKey:" + C56090m1.f159950s);
        super.onStart();
        mo90883g3();
        C63363c.C63364a.f179734a.getClass();
        C63363c.C63364a.f179735b.f179732a.mo90534J().f311689g = null;
    }

    public void onStop() {
        Log.m105924i("Finder.FinderLiveVisitorUIC", "[LiveLifecycle]onStop " + this + ", activateUIKey:" + C56090m1.f159950s);
        super.onStop();
        mo90884i3();
    }
}
