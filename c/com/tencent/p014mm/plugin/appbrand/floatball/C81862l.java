package com.tencent.p014mm.plugin.appbrand.floatball;

import android.content.Context;
import aw0.C79636p;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.backgroundrunning.AppBrandBackgroundRunningOperationParcel;
import com.tencent.p014mm.plugin.appbrand.backgroundrunning.C81590r;
import com.tencent.p014mm.plugin.appbrand.backgroundrunning.MMBackgroundRunningOperationParcel;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82835n;
import com.tencent.p014mm.plugin.appbrand.jsapi.xwebplugin.live.C83127a;
import com.tencent.p014mm.plugin.ball.p1099ui.C105083o;
import com.tencent.p014mm.plugin.ball.service.C105052s;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import di3.C86312j;
import nj3.C76912y0;
import p447aw.C103918d;
import qo3.C47883u;
import qo3.C77426q;
import uv0.C111237j;
import xv0.C112181e;
import yv0.C112504a;

/* renamed from: com.tencent.mm.plugin.appbrand.floatball.l */
public class C81862l extends C105052s implements C82835n {

    /* renamed from: s */
    public AppBrandRuntimeWC f240149s;

    /* renamed from: t */
    public C81590r f240150t;

    /* renamed from: u */
    public C81590r.C29458b f240151u = new C81867e();

    /* renamed from: com.tencent.mm.plugin.appbrand.floatball.l$a */
    public class C81863a implements C81868f {

        /* renamed from: a */
        public final /* synthetic */ int f240152a;

        public C81863a(int i) {
            this.f240152a = i;
        }

        /* renamed from: a */
        public void mo114246a() {
            C81862l.this.mo114257D0(this.f240152a);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.floatball.l$b */
    public class C81864b implements C47883u {

        /* renamed from: a */
        public final /* synthetic */ C81868f f240154a;

        public C81864b(C81862l lVar, C81868f fVar) {
            this.f240154a = fVar;
        }

        /* renamed from: a */
        public void mo353a(boolean z, String str) {
            Log.m105924i("MicroMsg.AppBrand.AppBrandVOIPFloatBallHelper", "showVOIPTip, has shown tip");
            MultiProcessMMKV.getDefault().encode("has_shown_appbrand_voip_tip", true);
            C81868f fVar = this.f240154a;
            if (fVar != null) {
                fVar.mo114246a();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.floatball.l$c */
    public class C81865c implements C79636p {

        /* renamed from: a */
        public final /* synthetic */ int f240155a;

        public C81865c(int i) {
            this.f240155a = i;
        }

        /* renamed from: a */
        public void mo109774a(boolean z) {
            Log.m105925i("MicroMsg.AppBrand.AppBrandVOIPFloatBallHelper", "onCloseAfterCheckingTip, checkFloatBallPermission isOK:%b", Boolean.valueOf(z));
            if (z) {
                C81862l.this.mo114258E0(this.f240155a);
                return;
            }
            Log.m105928w("MicroMsg.AppBrand.AppBrandVOIPFloatBallHelper", "onCloseAfterCheckingTip, refuse permission, remove ball and stop voip");
            C81862l.this.mo68418k();
            C81862l.this.mo114261H0();
            C81862l.this.f311808n.mo23513d(true);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.floatball.l$d */
    public class C81866d implements C112504a {
        public C81866d() {
        }

        /* renamed from: a */
        public void mo114239a() {
            Log.m105924i("MicroMsg.AppBrand.AppBrandVOIPFloatBallHelper", "onCloseInternal, transform to float ball animation cancel");
            C81862l.this.f311808n.mo23513d(true);
        }

        public void onAnimationEnd() {
            Log.m105924i("MicroMsg.AppBrand.AppBrandVOIPFloatBallHelper", "onCloseInternal, transform to float ball animation end");
            C81862l.this.f311808n.mo23513d(false);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.floatball.l$e */
    public class C81867e implements C81590r.C29458b {
        public C81867e() {
        }

        /* renamed from: a */
        public void mo56715a(AppBrandBackgroundRunningOperationParcel appBrandBackgroundRunningOperationParcel) {
            AppBrandRuntimeWC appBrandRuntimeWC;
            if (appBrandBackgroundRunningOperationParcel != null && (appBrandRuntimeWC = C81862l.this.f240149s) != null && appBrandRuntimeWC.f238147j.equals(appBrandBackgroundRunningOperationParcel.f239222d) && C81862l.this.f240149s.f238149o.f239365g == appBrandBackgroundRunningOperationParcel.f239223e && appBrandBackgroundRunningOperationParcel.f239224f == 4 && appBrandBackgroundRunningOperationParcel.f239225g == 1) {
                C81862l lVar = C81862l.this;
                if (!lVar.mo90541w()) {
                    Log.m105924i("MicroMsg.AppBrand.AppBrandVOIPFloatBallHelper", "onVOIPStateChanged, add passive float ball");
                    lVar.mo149077r0(true);
                    lVar.mo90537e(true);
                    lVar.mo149078s0(lVar.mo114256C0());
                    lVar.mo68419u();
                    return;
                }
                Log.m105924i("MicroMsg.AppBrand.AppBrandVOIPFloatBallHelper", "onVOIPStateChanged, already add this float ball, so update state");
                lVar.mo149078s0(lVar.mo114256C0());
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.floatball.l$f */
    public interface C81868f {
        /* renamed from: a */
        void mo114246a();
    }

    public C81862l(C111237j jVar, AppBrandRuntimeWC appBrandRuntimeWC) {
        super(jVar);
        this.f240149s = appBrandRuntimeWC;
        appBrandRuntimeWC.mo113059i(this);
        Log.m105925i("MicroMsg.AppBrand.AppBrandVOIPFloatBallHelper", "create, runtime:%s", Integer.valueOf(appBrandRuntimeWC.hashCode()));
        this.f240150t = (C81590r) C86312j.m106911c(C81590r.class);
    }

    /* renamed from: A */
    public void mo35648A(int i, String str) {
        Log.m105925i("MicroMsg.AppBrand.AppBrandVOIPFloatBallHelper", "onCreate, type:%s, key:%s", Integer.valueOf(i), str);
        super.mo35648A(i, str);
        C81590r rVar = this.f240150t;
        if (rVar != null) {
            rVar.ke0(this.f240151u);
        }
    }

    /* renamed from: A0 */
    public void mo67996A0() {
        Log.m105925i("MicroMsg.AppBrand.AppBrandVOIPFloatBallHelper", "onDestroy, runtime:%s", Integer.valueOf(this.f240149s.hashCode()));
        super.mo67996A0();
        C81590r rVar = this.f240150t;
        if (rVar != null) {
            rVar.n50(this.f240151u);
        }
    }

    /* renamed from: C */
    public void mo64001C() {
        Log.m105925i("MicroMsg.AppBrand.AppBrandVOIPFloatBallHelper", "onExitPage, runtime:%s", Integer.valueOf(this.f240149s.hashCode()));
        if (mo149069e0() != null) {
            mo149080u0(true);
            C76912y0.makeText((Context) this.f240149s.mo113026R(), (int) C0966R.string.a9k, 0).show();
        }
        C112181e eVar = this.f311729g;
        if (eVar != null) {
            eVar.mo149088F(this.f311726d);
        }
    }

    /* renamed from: C0 */
    public final int mo114256C0() {
        C83127a aVar;
        AppBrandRuntimeWC appBrandRuntimeWC = this.f240149s;
        if (appBrandRuntimeWC == null || (aVar = (C83127a) appBrandRuntimeWC.mo113032U(C83127a.class)) == null) {
            return 32;
        }
        boolean z = aVar.f242928h;
        Log.m105925i("MicroMsg.AppBrand.AppBrandVOIPFloatBallHelper", "getCurrentVOIPState, enableMic:%s", Boolean.valueOf(z));
        return z ? 32 : 64;
    }

    /* renamed from: D0 */
    public final void mo114257D0(int i) {
        if (!((C103918d) C86312j.m106911c(C103918d.class)).mo125772Jn(this.f311808n.getActivity())) {
            AppBrandFloatBallPermissionHelper.m100447a(this.f311808n.getActivity(), 17, new C81865c(i));
        } else {
            mo114258E0(i);
        }
    }

    /* renamed from: E0 */
    public final void mo114258E0(int i) {
        getReportInfo().f311721j = mo149199x0(i);
        mo68414O();
        C105083o.m141017a(this.f311808n, this.f311729g.mo149129k(), new C81866d());
    }

    /* renamed from: F0 */
    public boolean mo114259F0() {
        return mo90541w() && !MultiProcessMMKV.getDefault().decodeBool("has_shown_appbrand_voip_tip", false);
    }

    /* renamed from: G0 */
    public void mo114260G0(Context context, C81868f fVar) {
        C77426q qVar = new C77426q(context);
        qVar.mo107595g(context.getString(C0966R.string.a9i));
        qVar.mo107601m(C0966R.string.a9j);
        qVar.mo107600l(new C81864b(this, fVar));
        qVar.mo107603o();
    }

    /* renamed from: H0 */
    public final void mo114261H0() {
        Class cls = C81590r.class;
        if (C86312j.m106911c(cls) != null) {
            MMBackgroundRunningOperationParcel mMBackgroundRunningOperationParcel = new MMBackgroundRunningOperationParcel();
            mMBackgroundRunningOperationParcel.f239244d = this.f240149s.f238147j;
            mMBackgroundRunningOperationParcel.f239245e = 4;
            mMBackgroundRunningOperationParcel.f239246f = 2;
            Log.m105925i("MicroMsg.AppBrand.AppBrandVOIPFloatBallHelper", "stopVOIP, appId:%s", this.f240149s.f238147j);
            ((C81590r) C86312j.m106911c(cls)).mo56712qa(mMBackgroundRunningOperationParcel);
        }
    }

    /* renamed from: j0 */
    public void mo68417j0() {
        Log.m105925i("MicroMsg.AppBrand.AppBrandVOIPFloatBallHelper", "onReceivedBallInfoRemovedEvent, runtime:%s", Integer.valueOf(this.f240149s.hashCode()));
        mo149200z0();
        mo114261H0();
    }

    /* renamed from: k0 */
    public void mo64002k0() {
        Log.m105925i("MicroMsg.AppBrand.AppBrandVOIPFloatBallHelper", "onReceivedFinishWhenSwitchBallEvent, runtime:%s", Integer.valueOf(this.f240149s.hashCode()));
        this.f311808n.mo23513d(true);
    }

    /* renamed from: o */
    public void mo64003o() {
        Log.m105925i("MicroMsg.AppBrand.AppBrandVOIPFloatBallHelper", "onEnterPage, runtime:%s", Integer.valueOf(this.f240149s.hashCode()));
        if (mo149069e0() != null) {
            mo149080u0(false);
        }
    }

    /* renamed from: y0 */
    public boolean mo64004y0(int i) {
        Log.m105925i("MicroMsg.AppBrand.AppBrandVOIPFloatBallHelper", "onClose, runtime:%s", Integer.valueOf(this.f240149s.hashCode()));
        if (mo90541w()) {
            if (mo114259F0()) {
                Log.m105924i("MicroMsg.AppBrand.AppBrandVOIPFloatBallHelper", "onClose, should show voip tip");
                mo114260G0(this.f311808n.getActivity(), new C81863a(i));
            } else {
                mo114257D0(i);
            }
        }
        return false;
    }
}
