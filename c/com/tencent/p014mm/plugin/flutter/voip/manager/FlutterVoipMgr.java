package com.tencent.p014mm.plugin.flutter.voip.manager;

import a14.C53973z1;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.view.View;
import androidx.lifecycle.C39623j;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.plugin.voip.model.NewVoipMgr;
import com.tencent.p014mm.plugin.voip.widget.C106510c;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.pigeon.VoIPFlutterPluginApi;
import di3.C86312j;
import f40.C86709a0;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import h43.C108065b0;
import h43.C108077f0;
import h43.C108091j;
import h43.C108126x0;
import java.util.concurrent.CancellationException;
import l33.C109247e;
import p220pr.C62491f;
import p646pn.C110234e;
import p646pn.C62408g;
import rx3.C13598b0;
import vu1.C111618b;
import vu1.C111621d;
import vu1.C111622e;
import wu1.C111864b;
import wv0.C78727a;
import yu1.C112489b;
import yu1.C112499f;
import yu1.C39182e;
import yu1.C39183h;
import yu1.C39186k;
import zt3.C119157j;
import zu1.C112686a;
import zu1.C112689b;

/* renamed from: com.tencent.mm.plugin.flutter.voip.manager.FlutterVoipMgr */
public final class FlutterVoipMgr extends NewVoipMgr {

    /* renamed from: f1 */
    public final String f313161f1;

    /* renamed from: g1 */
    public int f313162g1;

    /* renamed from: h1 */
    public long f313163h1;

    /* renamed from: i1 */
    public boolean f313164i1;

    /* renamed from: j1 */
    public boolean f313165j1;

    /* renamed from: k1 */
    public boolean f313166k1;

    /* renamed from: l1 */
    public boolean f313167l1;

    /* renamed from: m1 */
    public C112686a f313168m1;

    /* renamed from: n1 */
    public C112686a f313169n1;

    /* renamed from: o1 */
    public Activity f313170o1;

    /* renamed from: p1 */
    public boolean f313171p1;

    /* renamed from: q1 */
    public final C62408g f313172q1 = ((C110234e) C86312j.m106911c(C110234e.class)).mo161397YJ();

    /* renamed from: r1 */
    public IListener<?> f313173r1 = new FlutterVoipMgr$hardCoderSystemEventListener$1(this, C40008f.f107254d);

    /* renamed from: com.tencent.mm.plugin.flutter.voip.manager.FlutterVoipMgr$a */
    public static final class C105361a implements C112686a.C112688b {

        /* renamed from: a */
        public final /* synthetic */ C108077f0 f313174a;

        /* renamed from: b */
        public final /* synthetic */ C108091j f313175b;

        /* renamed from: c */
        public final /* synthetic */ int f313176c;

        public C105361a(C108077f0 f0Var, C108091j jVar, int i) {
            this.f313174a = f0Var;
            this.f313175b = jVar;
            this.f313176c = i;
        }

        /* renamed from: a */
        public void mo150004a(int i, int i2) {
            Log.m105924i("MicroMsg.FlutterVoipMgr", "onSurfaceTextureSizeChanged: width=" + i + ", height=" + i2);
            this.f313174a.mo158492g(this.f313175b, i, i2, this.f313176c);
        }

        /* renamed from: b */
        public void mo150005b() {
            Log.m105928w("MicroMsg.FlutterVoipMgr", "onSurfaceTextureDestroy");
            C108077f0 f0Var = this.f313174a;
            C108091j jVar = this.f313175b;
            int i = this.f313176c;
            f0Var.getClass();
            C87412m.m108594g(jVar, "renderGLSurface");
            C108126x0 x0Var = f0Var.f323646f;
            if (x0Var != null) {
                x0Var.mo158530c(jVar, i);
            }
        }

        /* renamed from: c */
        public void mo150006c(SurfaceTexture surfaceTexture) {
            C87412m.m108594g(surfaceTexture, "surfaceTexture");
            Log.m105924i("MicroMsg.FlutterVoipMgr", "onSurfaceTextureReady: " + surfaceTexture);
            this.f313174a.mo158493h(this.f313175b, this.f313176c);
        }
    }

    /* renamed from: com.tencent.mm.plugin.flutter.voip.manager.FlutterVoipMgr$b */
    public static final class C105362b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FlutterVoipMgr f313177d;

        /* renamed from: e */
        public final /* synthetic */ C108077f0 f313178e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C105362b(FlutterVoipMgr flutterVoipMgr, C108077f0 f0Var) {
            super(0);
            this.f313177d = flutterVoipMgr;
            this.f313178e = f0Var;
        }

        public Object invoke() {
            Log.m105924i("MicroMsg.FlutterVoipMgr", "gl init done");
            FlutterVoipMgr flutterVoipMgr = this.f313177d;
            flutterVoipMgr.f313165j1 = this.f313178e.f323651k;
            flutterVoipMgr.mo149995f1();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.flutter.voip.manager.FlutterVoipMgr$c */
    public static final class C105363c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FlutterVoipMgr f313179d;

        /* renamed from: e */
        public final /* synthetic */ boolean f313180e;

        /* renamed from: f */
        public final /* synthetic */ View f313181f;

        /* renamed from: g */
        public final /* synthetic */ C32226l<Boolean, C13598b0> f313182g;

        /* renamed from: com.tencent.mm.plugin.flutter.voip.manager.FlutterVoipMgr$c$a */
        public static final class C105364a extends AnimatorListenerAdapter {

            /* renamed from: d */
            public final /* synthetic */ C32226l<Boolean, C13598b0> f313183d;

            public C105364a(C32226l<? super Boolean, C13598b0> lVar) {
                this.f313183d = lVar;
            }

            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                this.f313183d.invoke(Boolean.TRUE);
            }

            public void onAnimationStart(Animator animator) {
                super.onAnimationStart(animator);
            }
        }

        public C105363c(FlutterVoipMgr flutterVoipMgr, boolean z, View view, C32226l<? super Boolean, C13598b0> lVar) {
            this.f313179d = flutterVoipMgr;
            this.f313180e = z;
            this.f313181f = view;
            this.f313182g = lVar;
        }

        public final void run() {
            this.f313179d.mo152433L(true);
            if (this.f313180e) {
                C62408g gVar = this.f313179d.f313172q1;
                if (gVar != null) {
                    gVar.mo87457b((Intent) null, this.f313181f, new Point(1, 1), (C78727a) null, new C105364a(this.f313182g));
                    return;
                }
                return;
            }
            this.f313182g.invoke(Boolean.TRUE);
        }
    }

    /* renamed from: com.tencent.mm.plugin.flutter.voip.manager.FlutterVoipMgr$d */
    public static final class C105365d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f313184d;

        /* renamed from: e */
        public final /* synthetic */ FlutterVoipMgr f313185e;

        public C105365d(int i, FlutterVoipMgr flutterVoipMgr) {
            this.f313184d = i;
            this.f313185e = flutterVoipMgr;
        }

        public final void run() {
            C112489b.f336867d.mo164234O(this.f313184d, this.f313185e.f317090e.f337213a);
        }
    }

    public FlutterVoipMgr(String str) {
        C87412m.m108594g(str, "engineId");
        this.f313161f1 = str;
    }

    /* renamed from: E0 */
    public void mo149983E0() {
        super.mo149983E0();
        if (!(this.f317093h instanceof C112689b)) {
            C112489b.f336867d.mo164239q(C111618b.Rejected);
        }
    }

    /* renamed from: G */
    public void mo149984G(int i) {
        super.mo149984G(i);
        C109247e.vx0().f333448h = i;
    }

    /* renamed from: K0 */
    public C108077f0 mo149985K0() {
        C108077f0 K0 = super.mo149985K0();
        K0.f323650j = new C105362b(this, K0);
        mo149995f1();
        return K0;
    }

    /* renamed from: L0 */
    public void mo149986L0() {
        super.mo149986L0();
        this.f313171p1 = true;
    }

    /* renamed from: O0 */
    public void mo149987O0() {
        Log.m105924i("MicroMsg.FlutterVoipMgr", "finish: activity=" + this.f313170o1);
        if (this.f313170o1 == null) {
            ((C62491f) C86312j.m106911c(C62491f.class)).mo87522V3(this.f313161f1);
        }
        C112489b.f336867d.mo164237d();
        this.f313173r1.dead();
        this.f313168m1 = null;
        this.f313169n1 = null;
        mo152440P0(false);
    }

    /* renamed from: W0 */
    public void mo149988W0(boolean z) {
        Log.m105924i("MicroMsg.FlutterVoipMgr", "do minimizeVoip");
        if (2 != this.f317055E || Build.VERSION.SDK_INT >= 24) {
            int i = this.f317090e.f337213a;
            if (262 == i || 8 == i) {
                Log.m105921e("MicroMsg.FlutterVoipMgr", "voip call has finished!，state is %s", Integer.valueOf(i));
                return;
            }
            if (this.f317093h != null) {
                this.f317093h.setScreenEnable(true);
            }
            mo152437N0(14);
            this.f317055E = 2;
            this.f317056F++;
            this.f317059I = new C106510c(this, this.f317090e.f337213a, this.f317100q, this.f317102s, this.f317101r, z);
            int i2 = this.f317090e.f337213a;
            if ((260 == i2 || 6 == i2) && 1 != C86709a0.m107535s().mo121142i().mo119688i(327948, 0)) {
                C86709a0.m107535s().mo121142i().mo119679M(327948, 1);
            }
            mo152463c1();
            C109247e.xx0().mo152593G(true, z);
            C111864b bVar = C111864b.f334908a;
            Log.m105924i("MicroMsg.FlutterVoIPReportAgent", "onMinimized");
            C111864b.C111865a aVar = C111864b.f334912e;
            if (aVar.f334913a > 0) {
                aVar.f334914b += System.currentTimeMillis() - C111864b.f334912e.f334913a;
            }
            C111864b.f334912e.f334913a = -1;
            C53973z1 z1Var = C111864b.f334911d;
            if (z1Var != null) {
                C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
            }
            C111864b.f334911d = null;
            return;
        }
        Log.m105920e("MicroMsg.FlutterVoipMgr", "already is widget");
    }

    /* renamed from: X0 */
    public void mo149989X0(boolean z) {
        C112489b bVar = C112489b.f336867d;
        VoIPFlutterPluginApi.FLBoolType build = new VoIPFlutterPluginApi.FLBoolType.Builder().setValue(Boolean.valueOf(z)).build();
        C87412m.m108593f(build, "Builder()\n            .s…Value(isScreenOn).build()");
        ((C119157j) C119157j.f356862d).mo183895z(new C39186k(build, z));
    }

    /* renamed from: b0 */
    public void mo149990b0(C32226l<? super Boolean, C13598b0> lVar) {
        C87412m.m108594g(lVar, "miniOk");
        C112489b bVar = C112489b.f336867d;
        VoIPFlutterPluginApi.VoIPFlutterApi voIPFlutterApi = C112489b.f336868e;
        if (voIPFlutterApi != null) {
            voIPFlutterApi.onMinimized(C39183h.f105424a);
        }
    }

    /* renamed from: c0 */
    public void mo149991c0() {
        C112489b bVar = C112489b.f336867d;
        VoIPFlutterPluginApi.VoIPFlutterApi voIPFlutterApi = C112489b.f336868e;
        if (voIPFlutterApi != null) {
            voIPFlutterApi.onMinimized(C39183h.f105424a);
        }
        mo152437N0(17);
    }

    /* renamed from: d1 */
    public void mo149992d1(int i) {
        super.mo149992d1(i);
        if (!(this.f317093h instanceof C112689b)) {
            ((C119157j) C119157j.f356862d).mo183895z(new C105365d(i, this));
        }
    }

    /* renamed from: e0 */
    public void mo149993e0() {
        C108077f0 f0Var = this.f317092g;
        if (f0Var != null) {
            f0Var.mo158491f();
        }
    }

    /* renamed from: e1 */
    public final void mo149994e1(C112686a aVar, int i) {
        Log.m105924i("MicroMsg.FlutterVoipMgr", "addRenderSurfaceTexture, renderMode:" + i + ", mVoipRenderMgr:" + this.f317092g);
        C108077f0 f0Var = this.f317092g;
        if (f0Var != null) {
            SurfaceTexture surfaceTexture = aVar.f337403d;
            C87412m.m108594g(surfaceTexture, "surfaceTexture");
            boolean z = false;
            C108091j jVar = new C108091j(surfaceTexture, 0, 0);
            C108126x0 x0Var = f0Var.f323646f;
            if (x0Var != null) {
                if (x0Var.mo158529b(jVar)) {
                    z = true;
                }
                if (z) {
                    C108126x0 x0Var2 = f0Var.f323646f;
                    if (x0Var2 != null) {
                        x0Var2.mo158528a(jVar, i);
                    }
                    f0Var.mo158493h(jVar, i);
                    if (i == 0) {
                        C108065b0.C108066a aVar2 = f0Var.f323663w.f323592a;
                        aVar2.f323594a = surfaceTexture;
                        aVar2.f323595b = jVar;
                    } else {
                        C108065b0.C108066a aVar3 = f0Var.f323663w.f323593b;
                        aVar3.f323594a = surfaceTexture;
                        aVar3.f323595b = jVar;
                    }
                }
            }
            C105361a aVar4 = new C105361a(f0Var, jVar, i);
            aVar.f337404e = aVar4;
            aVar4.mo150006c(aVar.f337403d);
            aVar.f337406g.mo145136d(C39623j.C39626c.STARTED);
        }
    }

    /* renamed from: f1 */
    public final void mo149995f1() {
        C112686a aVar;
        C112686a aVar2;
        if (this.f313165j1) {
            if (!this.f313166k1 && (aVar2 = this.f313168m1) != null) {
                this.f313166k1 = true;
                mo149994e1(aVar2, 0);
            }
            if (!this.f313167l1 && (aVar = this.f313169n1) != null) {
                this.f313167l1 = true;
                mo149994e1(aVar, 1);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
        r1 = r1.getWindow();
     */
    /* renamed from: g1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo149996g1(boolean r5, fy3.C32226l<? super java.lang.Boolean, rx3.C13598b0> r6) {
        /*
            r4 = this;
            java.lang.String r0 = "miniOk"
            gy3.C87412m.m108594g(r6, r0)
            r0 = 1
            boolean r1 = r4.mo152429I0(r0)
            r2 = 0
            if (r1 != 0) goto L_0x0013
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            r6.invoke(r5)
            return r2
        L_0x0013:
            android.app.Activity r1 = r4.f313170o1
            if (r1 == 0) goto L_0x0022
            android.view.Window r1 = r1.getWindow()
            if (r1 == 0) goto L_0x0022
            android.view.View r1 = r1.getDecorView()
            goto L_0x0023
        L_0x0022:
            r1 = 0
        L_0x0023:
            android.app.Activity r3 = r4.f313170o1
            vv0.C65884b.m77629a(r3, r2)
            zt3.t r2 = zt3.C119157j.f356862d
            com.tencent.mm.plugin.flutter.voip.manager.FlutterVoipMgr$c r3 = new com.tencent.mm.plugin.flutter.voip.manager.FlutterVoipMgr$c
            r3.<init>(r4, r5, r1, r6)
            zt3.j r2 = (zt3.C119157j) r2
            r2.mo183895z(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.flutter.voip.manager.FlutterVoipMgr.mo149996g1(boolean, fy3.l):boolean");
    }

    /* renamed from: h0 */
    public void mo149997h0(boolean z) {
        super.mo149997h0(z);
        C112489b.f336867d.mo164232B(z ? C111622e.RemoteCapturePause : C111622e.RemoteCaptureResume, (String) null);
    }

    /* renamed from: h1 */
    public final boolean mo149998h1() {
        boolean z;
        try {
            Object systemService = MMApplicationContext.getContext().getSystemService("phone");
            C87412m.m108592e(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
            int callState = ((TelephonyManager) systemService).getCallState();
            z = callState == 2;
            try {
                Log.m105925i("MicroMsg.FlutterVoipMgr", "TelephoneManager.callState is %d", Integer.valueOf(callState));
            } catch (Exception e) {
                e = e;
            }
        } catch (Exception e2) {
            e = e2;
            z = false;
            Log.m105921e("MicroMsg.FlutterVoipMgr", "get callState error , errMsg is %s", e.getLocalizedMessage());
            return z;
        }
        return z;
    }

    /* renamed from: i0 */
    public void mo149999i0() {
        super.mo149999i0();
        Log.m105924i("MicroMsg.FlutterVoipMgr", "onConnected");
        C112489b bVar = C112489b.f336867d;
        int n = C109247e.xx0().mo152615n();
        VoIPFlutterPluginApi.FLIntType build = new VoIPFlutterPluginApi.FLIntType.Builder().setValue(Long.valueOf((long) n)).build();
        C87412m.m108593f(build, "Builder()\n            .s…(roomId.toLong()).build()");
        VoIPFlutterPluginApi.VoIPFlutterApi voIPFlutterApi = C112489b.f336868e;
        if (voIPFlutterApi != null) {
            voIPFlutterApi.onConnected(build, new C39182e(n));
        }
        C111864b bVar2 = C111864b.f334908a;
        Log.m105924i("MicroMsg.FlutterVoIPReportAgent", "onConnected");
        C111864b.f334912e.f334920h = true;
        if (this.f317089d.mo164337b()) {
            mo152476l(true);
        }
    }

    /* renamed from: w0 */
    public void mo150000w0(boolean z) {
        C112489b.f336867d.mo164239q(C111618b.AnotherHangup);
        super.mo150000w0(z);
        Log.m105924i("MicroMsg.FlutterVoipMgr", "onShutdown withTip:" + z);
    }

    /* renamed from: x0 */
    public void mo150001x0() {
        super.mo150001x0();
        this.f313162g1 = C109247e.xx0().mo152615n();
        this.f313163h1 = C109247e.xx0().mo152616o();
        Log.m105924i("MicroMsg.FlutterVoipMgr", "onRoomReady, roomId:" + this.f313162g1 + ", roomKey:" + this.f313163h1);
    }

    /* renamed from: y0 */
    public void mo150002y0(int i, String str, int i2) {
        C111621d dVar;
        C112489b bVar = C112489b.f336867d;
        if (i == -9000) {
            dVar = C111621d.NetworkError;
        } else if (i == 211) {
            dVar = C111621d.UserBusy;
        } else if (i == 233) {
            dVar = C111621d.NotInContact;
        } else if (i == 241) {
            dVar = C111621d.ServerOverload;
        } else if (i != 1200) {
            switch (i) {
                case 235:
                    dVar = C111621d.VideoNotSupported;
                    break;
                case 236:
                    dVar = C111621d.UserInOtherBlacklist;
                    break;
                case 237:
                    dVar = C111621d.VoIPNotEnabled;
                    break;
                default:
                    dVar = C111621d.Unknown;
                    break;
            }
        } else {
            dVar = C111621d.UserNotOtherFriend;
        }
        VoIPFlutterPluginApi.FLIntType build = new VoIPFlutterPluginApi.FLIntType.Builder().setValue(Long.valueOf((long) dVar.ordinal())).build();
        C87412m.m108593f(build, "Builder()\n            .s…ordinal.toLong()).build()");
        VoIPFlutterPluginApi.VoIPFlutterApi voIPFlutterApi = C112489b.f336868e;
        if (voIPFlutterApi != null) {
            ((C119157j) C119157j.f356862d).mo183895z(new C112499f(voIPFlutterApi, build));
        }
        C111864b.f334908a.mo163610a();
        super.mo150002y0(i, str, i2);
        Log.m105924i("MicroMsg.FlutterVoipMgr", "onError " + i + ", " + str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo150003z(android.util.Size r4, int r5) {
        /*
            r3 = this;
            java.lang.String r0 = "size"
            gy3.C87412m.m108594g(r4, r0)
            r0 = 1
            if (r5 != 0) goto L_0x0009
            goto L_0x0019
        L_0x0009:
            v33.b r1 = l33.C109247e.vx0()
            boolean r2 = r1.mo163050d()
            if (r2 == 0) goto L_0x0019
            boolean r2 = z33.C112595h.f337172g
            if (r2 == 0) goto L_0x0019
            int r0 = r1.f333448h
        L_0x0019:
            boolean r1 = z33.C112595h.f337171f
            if (r1 == 0) goto L_0x0055
            r1 = 0
            if (r5 != 0) goto L_0x0031
            h43.f0 r5 = r3.f317092g
            if (r5 == 0) goto L_0x0042
            uu1.d r5 = r5.f323665y
            if (r5 == 0) goto L_0x0042
            uu1.c r5 = r5.mo162971a()
            if (r5 == 0) goto L_0x0042
            uu1.e r5 = r5.f333050c
            goto L_0x0043
        L_0x0031:
            h43.f0 r5 = r3.f317092g
            if (r5 == 0) goto L_0x0042
            uu1.d r5 = r5.f323665y
            if (r5 == 0) goto L_0x0042
            uu1.c r5 = r5.mo162972b()
            if (r5 == 0) goto L_0x0042
            uu1.e r5 = r5.f333050c
            goto L_0x0043
        L_0x0042:
            r5 = r1
        L_0x0043:
            if (r5 == 0) goto L_0x0047
            fy3.p<android.util.Size, java.lang.Integer, rx3.b0> r1 = r5.f333056f
        L_0x0047:
            if (r1 != 0) goto L_0x004a
            goto L_0x007c
        L_0x004a:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            java.lang.Object r4 = r1.invoke(r4, r5)
            rx3.b0 r4 = (rx3.C13598b0) r4
            goto L_0x007c
        L_0x0055:
            if (r5 != 0) goto L_0x006a
            zu1.a r5 = r3.f313168m1
            if (r5 == 0) goto L_0x007c
            fy3.p<? super android.util.Size, ? super java.lang.Integer, rx3.b0> r5 = r5.f337405f
            if (r5 == 0) goto L_0x007c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r4 = r5.invoke(r4, r0)
            rx3.b0 r4 = (rx3.C13598b0) r4
            goto L_0x007c
        L_0x006a:
            zu1.a r5 = r3.f313169n1
            if (r5 == 0) goto L_0x007c
            fy3.p<? super android.util.Size, ? super java.lang.Integer, rx3.b0> r5 = r5.f337405f
            if (r5 == 0) goto L_0x007c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r4 = r5.invoke(r4, r0)
            rx3.b0 r4 = (rx3.C13598b0) r4
        L_0x007c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.flutter.voip.manager.FlutterVoipMgr.mo150003z(android.util.Size, int):void");
    }
}
