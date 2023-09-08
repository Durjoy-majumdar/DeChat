package com.tencent.p014mm.plugin.ball.service;

import android.app.Activity;
import android.graphics.Point;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.ball.model.BallInfo;
import com.tencent.p014mm.plugin.ball.p1099ui.C105062b0;
import com.tencent.p014mm.plugin.ball.p1099ui.C105066c0;
import com.tencent.p014mm.plugin.ball.p1099ui.C105071g;
import com.tencent.p014mm.plugin.ball.p1099ui.C105072h;
import com.tencent.p014mm.plugin.ball.p1099ui.C105083o;
import com.tencent.p014mm.plugin.ball.view.FloatIndicatorView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import di3.C86312j;
import nj3.C76912y0;
import p646pn.C110235f;
import uv0.C111237j;
import xv0.C112181e;
import yv0.C112504a;
import yv0.C112508e;

/* renamed from: com.tencent.mm.plugin.ball.service.s */
public class C105052s extends FloatBallHelper {

    /* renamed from: n */
    public C111237j f311808n;

    /* renamed from: o */
    public C112508e f311809o;

    /* renamed from: p */
    public C105062b0 f311810p;

    /* renamed from: q */
    public C105072h f311811q;

    /* renamed from: r */
    public C112504a f311812r;

    /* renamed from: com.tencent.mm.plugin.ball.service.s$a */
    public class C85050a implements C112504a {
        public C85050a() {
        }

        /* renamed from: a */
        public void mo114239a() {
            Log.m105924i("MicroMsg.PageFloatBallHelper", "onClose, transform to float ball animation cancel");
            C105052s.this.f311808n.mo23513d(true);
        }

        public void onAnimationEnd() {
            Log.m105924i("MicroMsg.PageFloatBallHelper", "onClose, transform to float ball animation end");
            C105052s.this.f311808n.mo23513d(false);
        }
    }

    /* renamed from: com.tencent.mm.plugin.ball.service.s$c */
    public interface C85051c {
    }

    /* renamed from: com.tencent.mm.plugin.ball.service.s$b */
    public class C105053b implements C85051c {

        /* renamed from: a */
        public final /* synthetic */ int f311813a;

        public C105053b(int i) {
            this.f311813a = i;
        }

        /* renamed from: a */
        public void mo149201a() {
            C105052s sVar = C105052s.this;
            C112181e eVar = sVar.f311729g;
            if (!(eVar != null ? eVar.mo149124h0(sVar.f311726d) : false)) {
                Activity activity = C105052s.this.f311808n.getActivity();
                C105052s sVar2 = C105052s.this;
                ((C110235f) C86312j.m106911c(C110235f.class)).mo161393AY(activity, 1, sVar2.f311726d, sVar2.mo149066Q(), C105052s.this.f311730h);
                return;
            }
            C105052s sVar3 = C105052s.this;
            if (sVar3.f311729g != null) {
                sVar3.getReportInfo().f311715d = this.f311813a;
                C105052s.this.mo68414O();
                Point k = C105052s.this.f311729g.mo149129k();
                if (k != null) {
                    C105052s sVar4 = C105052s.this;
                    C105083o.m141017a(sVar4.f311808n, k, sVar4.f311812r);
                }
            }
        }
    }

    public C105052s(C111237j jVar) {
        this.f311808n = jVar;
    }

    /* renamed from: v0 */
    public static void m140977v0(C105052s sVar) {
        sVar.mo149077r0(false);
        if (!sVar.mo90541w()) {
            BallInfo ballInfo = sVar.f311726d;
            if (ballInfo.f311686d == 20) {
                ballInfo.f311686d = ballInfo.f311687e;
                ballInfo.f311679D = 0;
                Log.m105927v("MicroMsg.FloatBallHelper", "alvinluo resetFloatBallInfo ballInfo: %s", ballInfo);
            }
            sVar.mo68419u();
        }
    }

    /* renamed from: A */
    public void mo35648A(int i, String str) {
        super.mo35648A(i, str);
        this.f311809o = new C105054u(this);
        this.f311812r = new C85052t(this);
        if (mo35651f0()) {
            BallInfo d0 = mo68416d0();
            if (d0 == null || d0.f311680E) {
                C105062b0 b0Var = new C105062b0(this.f311808n, this.f311809o);
                this.f311810p = b0Var;
                b0Var.mo149213a();
                int decodeInt = MultiProcessMMKV.getMMKV(((C110235f) C86312j.m106911c(C110235f.class)).mo161394CM("float_ball_storage")).decodeInt("ActiveCount", 0);
                Log.m105925i("MicroMsg.PageFloatBallHelper", "onCreate, activeCount:%s", Integer.valueOf(decodeInt));
                FloatIndicatorView floatIndicatorView = this.f311810p.f311832b;
                if (floatIndicatorView != null) {
                    floatIndicatorView.mo149356a(decodeInt);
                    return;
                }
                return;
            }
            C105072h hVar = new C105072h(this.f311808n, this.f311809o);
            this.f311811q = hVar;
            Log.m105924i("MicroMsg.FloatBallFadeInController", "start FloatBallFadeInController");
            if (hVar.f311852a.mo23516g()) {
                hVar.f311852a.mo23514e(new C105071g(hVar));
                return;
            }
            return;
        }
        Log.m105924i("MicroMsg.PageFloatBallHelper", "onCreate, do not support swipe to float ball");
    }

    /* renamed from: A0 */
    public void mo67996A0() {
        C112181e eVar = this.f311729g;
        if (eVar != null) {
            eVar.mo149119f(this.f311726d);
        }
        C105062b0 b0Var = this.f311810p;
        if (b0Var != null) {
            Log.m105924i("MicroMsg.FloatIndicatorController", "stop FloatIndicatorController");
            MMHandlerThread.postToMainThread(new C105066c0(b0Var));
            b0Var.f311831a.mo23514e((C111237j.C52621a) null);
        }
    }

    /* renamed from: B0 */
    public void mo78184B0() {
        this.f311728f = false;
        C112181e eVar = this.f311729g;
        if (eVar != null) {
            eVar.mo149126i0(this.f311726d);
        }
        if (this.f311726d != null) {
            mo149073m0();
            mo149072l0();
        }
    }

    /* renamed from: C */
    public void mo64001C() {
        super.mo64001C();
    }

    /* renamed from: g0 */
    public void mo149070g0(boolean z, int i) {
        if (z) {
            Log.m105924i("MicroMsg.PageFloatBallHelper", "onMenuFloatBallSelected, enter float ball");
            mo114245w0(new C105053b(i));
            return;
        }
        Log.m105924i("MicroMsg.PageFloatBallHelper", "onMenuFloatBallSelected, exit float ball");
        BallInfo d0 = mo68416d0();
        if (d0 != null) {
            if (d0.f311679D != 0) {
                mo149077r0(true);
                return;
            }
            getReportInfo().f311721j = 8;
            mo68414O();
            mo68418k();
            mo149200z0();
            if (this.f311808n.getActivity() != null) {
                C76912y0.m92768g(this.f311808n.getActivity(), this.f311808n.getActivity().getString(C0966R.string.f7546j_));
            }
        }
    }

    /* renamed from: i0 */
    public void mo149071i0(int i) {
        FloatIndicatorView floatIndicatorView;
        C105062b0 b0Var = this.f311810p;
        if (b0Var != null && (floatIndicatorView = b0Var.f311832b) != null) {
            floatIndicatorView.mo149356a(i);
        }
    }

    /* renamed from: j0 */
    public void mo68417j0() {
        mo149200z0();
    }

    /* renamed from: k0 */
    public void mo64002k0() {
    }

    /* renamed from: o */
    public void mo64003o() {
        super.mo64003o();
    }

    /* renamed from: w0 */
    public void mo114245w0(C85051c cVar) {
        if (cVar != null) {
            ((C105053b) cVar).mo149201a();
        }
    }

    /* renamed from: x0 */
    public int mo149199x0(int i) {
        if (i == 1) {
            return 4;
        }
        if (i == 2) {
            return 7;
        }
        return i == 3 ? 5 : 6;
    }

    /* renamed from: y0 */
    public boolean mo64004y0(int i) {
        if (!mo90541w() || this.f311729g == null) {
            return false;
        }
        Log.m105924i("MicroMsg.PageFloatBallHelper", "onClose, resume this ball");
        getReportInfo().f311721j = mo149199x0(i);
        mo68414O();
        C105083o.m141017a(this.f311808n, this.f311729g.mo149129k(), new C85050a());
        return true;
    }

    /* renamed from: z0 */
    public final void mo149200z0() {
        C105072h hVar = this.f311811q;
        if (hVar != null) {
            hVar.getClass();
            Log.m105924i("MicroMsg.FloatBallFadeInController", "stop FloatIndicatorController");
            hVar.f311852a.mo23514e((C111237j.C52621a) null);
        }
        if (mo35651f0()) {
            C105062b0 b0Var = new C105062b0(this.f311808n, this.f311809o);
            this.f311810p = b0Var;
            b0Var.mo149213a();
        }
    }
}
