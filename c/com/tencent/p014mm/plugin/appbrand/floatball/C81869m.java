package com.tencent.p014mm.plugin.appbrand.floatball;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import aw0.C79636p;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.backgroundrunning.AppBrandBackgroundRunningOperationParcel;
import com.tencent.p014mm.plugin.appbrand.backgroundrunning.C81590r;
import com.tencent.p014mm.plugin.appbrand.backgroundrunning.MMBackgroundRunningOperationParcel;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82835n;
import com.tencent.p014mm.plugin.ball.p1099ui.C105083o;
import com.tencent.p014mm.plugin.ball.service.C105052s;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import di3.C86312j;
import nj3.C76912y0;
import p447aw.C103918d;
import qo3.C47883u;
import qo3.C77426q;
import uv0.C111237j;
import xv0.C112181e;
import yv0.C112504a;

/* renamed from: com.tencent.mm.plugin.appbrand.floatball.m */
public class C81869m extends C105052s implements C82835n {

    /* renamed from: s */
    public AppBrandRuntimeWC f240159s;

    /* renamed from: t */
    public C81590r f240160t;

    /* renamed from: u */
    public Handler f240161u;

    /* renamed from: v */
    public C81590r.C29458b f240162v = new C81876f();

    /* renamed from: com.tencent.mm.plugin.appbrand.floatball.m$a */
    public class C81870a implements C81877g {

        /* renamed from: a */
        public final /* synthetic */ int f240163a;

        public C81870a(int i) {
            this.f240163a = i;
        }

        /* renamed from: a */
        public void mo114249a() {
            C81869m.this.mo114263D0(this.f240163a);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.floatball.m$b */
    public class C81871b implements C47883u {

        /* renamed from: a */
        public final /* synthetic */ C81877g f240165a;

        public C81871b(C81869m mVar, C81877g gVar) {
            this.f240165a = gVar;
        }

        /* renamed from: a */
        public void mo353a(boolean z, String str) {
            Log.m105924i("MicroMsg.AppBrand.AppBrandVoIP1v1FloatBallHelper", "showVOIPTip, has shown tip");
            MultiProcessMMKV.getDefault().encode("has_shown_appbrand_voip_1v1_tip", true);
            C81877g gVar = this.f240165a;
            if (gVar != null) {
                gVar.mo114249a();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.floatball.m$c */
    public class C81872c implements C79636p {

        /* renamed from: a */
        public final /* synthetic */ int f240166a;

        public C81872c(int i) {
            this.f240166a = i;
        }

        /* renamed from: a */
        public void mo109774a(boolean z) {
            Log.m105925i("MicroMsg.AppBrand.AppBrandVoIP1v1FloatBallHelper", "onCloseAfterCheckingTip, checkFloatBallPermission isOK:%b", Boolean.valueOf(z));
            if (z) {
                C81869m.this.mo114264E0(this.f240166a);
                return;
            }
            Log.m105928w("MicroMsg.AppBrand.AppBrandVoIP1v1FloatBallHelper", "onCloseAfterCheckingTip, refuse permission, remove ball and stop voip");
            C81869m.this.mo68418k();
            C81869m.this.mo114266G0();
            C81869m.this.f311808n.mo23513d(true);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.floatball.m$d */
    public class C81873d implements C112504a {
        public C81873d() {
        }

        /* renamed from: a */
        public void mo114239a() {
            Log.m105924i("MicroMsg.AppBrand.AppBrandVoIP1v1FloatBallHelper", "onCloseInternal, transform to float ball animation cancel");
            C81869m.this.f311808n.mo23513d(true);
        }

        public void onAnimationEnd() {
            Log.m105924i("MicroMsg.AppBrand.AppBrandVoIP1v1FloatBallHelper", "onCloseInternal, transform to float ball animation end");
            C81869m.this.f311808n.mo23513d(false);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.floatball.m$e */
    public class C81874e implements Runnable {

        /* renamed from: com.tencent.mm.plugin.appbrand.floatball.m$e$a */
        public class C81875a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ int f240170d;

            public C81875a(int i) {
                this.f240170d = i;
            }

            public void run() {
                C81869m.this.mo149078s0(this.f240170d);
            }
        }

        public C81874e() {
        }

        public void run() {
            int C0 = C81869m.this.mo114262C0();
            Handler handler = C81869m.this.f240161u;
            if (handler != null) {
                handler.post(new C81875a(C0));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.floatball.m$f */
    public class C81876f implements C81590r.C29458b {
        public C81876f() {
        }

        /* renamed from: a */
        public void mo56715a(AppBrandBackgroundRunningOperationParcel appBrandBackgroundRunningOperationParcel) {
            AppBrandRuntimeWC appBrandRuntimeWC;
            if (appBrandBackgroundRunningOperationParcel != null && (appBrandRuntimeWC = C81869m.this.f240159s) != null && appBrandRuntimeWC.f238147j.equals(appBrandBackgroundRunningOperationParcel.f239222d) && C81869m.this.f240159s.f238149o.f239365g == appBrandBackgroundRunningOperationParcel.f239223e && appBrandBackgroundRunningOperationParcel.f239224f == 16 && appBrandBackgroundRunningOperationParcel.f239225g == 1) {
                C81869m mVar = C81869m.this;
                if (!mVar.mo90541w()) {
                    Log.m105924i("MicroMsg.AppBrand.AppBrandVoIP1v1FloatBallHelper", "onVOIPStateChanged, add passive float ball");
                    mVar.mo149077r0(true);
                    mVar.mo90537e(false);
                    mVar.mo149078s0(mVar.mo114262C0());
                    mVar.mo68419u();
                    return;
                }
                Log.m105924i("MicroMsg.AppBrand.AppBrandVoIP1v1FloatBallHelper", "onVOIPStateChanged, already add this float ball, so update state");
                mVar.mo149078s0(mVar.mo114262C0());
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.floatball.m$g */
    public interface C81877g {
        /* renamed from: a */
        void mo114249a();
    }

    public C81869m(C111237j jVar, AppBrandRuntimeWC appBrandRuntimeWC) {
        super(jVar);
        this.f240159s = appBrandRuntimeWC;
        appBrandRuntimeWC.mo113059i(this);
        Log.m105925i("MicroMsg.AppBrand.AppBrandVoIP1v1FloatBallHelper", "create, runtime:%s", Integer.valueOf(appBrandRuntimeWC.hashCode()));
        this.f240160t = (C81590r) C86312j.m106911c(C81590r.class);
        this.f240161u = new Handler(Looper.getMainLooper());
    }

    /* renamed from: A */
    public void mo35648A(int i, String str) {
        Log.m105925i("MicroMsg.AppBrand.AppBrandVoIP1v1FloatBallHelper", "onCreate, type:%s, key:%s", Integer.valueOf(i), str);
        super.mo35648A(i, str);
        C81590r rVar = this.f240160t;
        if (rVar != null) {
            rVar.ke0(this.f240162v);
        }
    }

    /* renamed from: A0 */
    public void mo67996A0() {
        Log.m105925i("MicroMsg.AppBrand.AppBrandVoIP1v1FloatBallHelper", "onDestroy, runtime:%s", Integer.valueOf(this.f240159s.hashCode()));
        super.mo67996A0();
        C81590r rVar = this.f240160t;
        if (rVar != null) {
            rVar.n50(this.f240162v);
        }
    }

    /* renamed from: C */
    public void mo64001C() {
        Log.m105925i("MicroMsg.AppBrand.AppBrandVoIP1v1FloatBallHelper", "onExitPage, runtime:%s", Integer.valueOf(this.f240159s.hashCode()));
        if (mo149069e0() != null) {
            mo149080u0(true);
            C76912y0.makeText((Context) this.f240159s.mo113026R(), (int) C0966R.string.a9k, 0).show();
        }
        C112181e eVar = this.f311729g;
        if (eVar != null) {
            eVar.mo149088F(this.f311726d);
        }
        ThreadPool.post(new C81874e(), "");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003a A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* renamed from: C0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo114262C0() {
        /*
            r5 = this;
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r0 = r5.f240159s
            r1 = 32
            if (r0 == 0) goto L_0x003c
            java.lang.Class<jp.b> r0 = p576jp.C88007b.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            jp.b r0 = (p576jp.C88007b) r0
            jp.c r0 = r0.mo59116Bp()
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.w r0 = (com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C105181w) r0
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.w$i r2 = r0.f312381n
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.w$i r3 = com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C105181w.C85161i.InRoom
            r4 = 0
            if (r2 != r3) goto L_0x0025
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.g r0 = r0.f312377g
            qh.f r2 = r0.f312175b
            if (r2 != 0) goto L_0x0022
            goto L_0x0025
        L_0x0022:
            boolean r0 = r0.f312186m
            goto L_0x0026
        L_0x0025:
            r0 = 0
        L_0x0026:
            r2 = 1
            r0 = r0 ^ r2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            r2[r4] = r3
            java.lang.String r3 = "MicroMsg.AppBrand.AppBrandVoIP1v1FloatBallHelper"
            java.lang.String r4 = "getCurrentVOIPState, enableMic:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r4, r2)
            if (r0 == 0) goto L_0x003a
            goto L_0x003c
        L_0x003a:
            r1 = 64
        L_0x003c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.floatball.C81869m.mo114262C0():int");
    }

    /* renamed from: D0 */
    public final void mo114263D0(int i) {
        if (!((C103918d) C86312j.m106911c(C103918d.class)).mo125772Jn(this.f311808n.getActivity())) {
            AppBrandFloatBallPermissionHelper.m100447a(this.f311808n.getActivity(), 19, new C81872c(i));
        } else {
            mo114264E0(i);
        }
    }

    /* renamed from: E0 */
    public final void mo114264E0(int i) {
        getReportInfo().f311721j = mo149199x0(i);
        mo68414O();
        C105083o.m141017a(this.f311808n, this.f311729g.mo149129k(), new C81873d());
    }

    /* renamed from: F0 */
    public void mo114265F0(Context context, C81877g gVar) {
        C77426q qVar = new C77426q(context);
        qVar.mo107595g(context.getString(C0966R.string.a9i));
        qVar.mo107601m(C0966R.string.a9j);
        qVar.mo107600l(new C81871b(this, gVar));
        qVar.mo107603o();
    }

    /* renamed from: G0 */
    public final void mo114266G0() {
        Class cls = C81590r.class;
        if (C86312j.m106911c(cls) != null) {
            MMBackgroundRunningOperationParcel mMBackgroundRunningOperationParcel = new MMBackgroundRunningOperationParcel();
            mMBackgroundRunningOperationParcel.f239244d = this.f240159s.f238147j;
            mMBackgroundRunningOperationParcel.f239245e = 16;
            mMBackgroundRunningOperationParcel.f239246f = 2;
            Log.m105925i("MicroMsg.AppBrand.AppBrandVoIP1v1FloatBallHelper", "stopVOIP, appId:%s", this.f240159s.f238147j);
            ((C81590r) C86312j.m106911c(cls)).mo56712qa(mMBackgroundRunningOperationParcel);
        }
    }

    /* renamed from: j0 */
    public void mo68417j0() {
        Log.m105925i("MicroMsg.AppBrand.AppBrandVoIP1v1FloatBallHelper", "onReceivedBallInfoRemovedEvent, runtime:%s", Integer.valueOf(this.f240159s.hashCode()));
        mo149200z0();
        mo114266G0();
    }

    /* renamed from: k0 */
    public void mo64002k0() {
        Log.m105925i("MicroMsg.AppBrand.AppBrandVoIP1v1FloatBallHelper", "onReceivedFinishWhenSwitchBallEvent, runtime:%s", Integer.valueOf(this.f240159s.hashCode()));
        this.f311808n.mo23513d(true);
    }

    /* renamed from: o */
    public void mo64003o() {
        Log.m105925i("MicroMsg.AppBrand.AppBrandVoIP1v1FloatBallHelper", "onEnterPage, runtime:%s", Integer.valueOf(this.f240159s.hashCode()));
        if (mo149069e0() != null) {
            mo149080u0(false);
        }
    }

    /* renamed from: y0 */
    public boolean mo64004y0(int i) {
        boolean z = true;
        Log.m105925i("MicroMsg.AppBrand.AppBrandVoIP1v1FloatBallHelper", "onClose, runtime:%s", Integer.valueOf(this.f240159s.hashCode()));
        if (mo90541w()) {
            boolean decodeBool = MultiProcessMMKV.getDefault().decodeBool("has_shown_appbrand_voip_1v1_tip", false);
            if (!mo90541w() || decodeBool) {
                z = false;
            }
            if (z) {
                Log.m105924i("MicroMsg.AppBrand.AppBrandVoIP1v1FloatBallHelper", "onClose, should show voip tip");
                mo114265F0(this.f311808n.getActivity(), new C81870a(i));
            } else {
                mo114263D0(i);
            }
        }
        return false;
    }
}
