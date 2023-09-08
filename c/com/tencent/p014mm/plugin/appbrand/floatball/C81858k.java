package com.tencent.p014mm.plugin.appbrand.floatball;

import aw0.C79636p;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.backgroundrunning.AppBrandBackgroundRunningOperationParcel;
import com.tencent.p014mm.plugin.appbrand.backgroundrunning.C81590r;
import com.tencent.p014mm.plugin.appbrand.backgroundrunning.MMBackgroundRunningOperationParcel;
import com.tencent.p014mm.plugin.ball.p1099ui.C105083o;
import com.tencent.p014mm.plugin.ball.service.C105052s;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import p447aw.C103918d;
import p646pn.C100824i;
import uv0.C111237j;
import yv0.C112504a;

/* renamed from: com.tencent.mm.plugin.appbrand.floatball.k */
public class C81858k extends C105052s {

    /* renamed from: s */
    public AppBrandRuntimeWC f240142s;

    /* renamed from: t */
    public C81590r f240143t;

    /* renamed from: u */
    public C81590r.C29458b f240144u = new C81861c();

    /* renamed from: com.tencent.mm.plugin.appbrand.floatball.k$a */
    public class C81859a implements C79636p {

        /* renamed from: a */
        public final /* synthetic */ int f240145a;

        public C81859a(int i) {
            this.f240145a = i;
        }

        /* renamed from: a */
        public void mo109774a(boolean z) {
            Log.m105925i("MicroMsg.AppBrandLocationFloatBallHelper", "onClose, checkFloatBallPermission isOK:%b", Boolean.valueOf(z));
            if (z) {
                C81858k.this.mo114254C0(this.f240145a);
                return;
            }
            Log.m105928w("MicroMsg.AppBrandLocationFloatBallHelper", "onClose, refuse permission, remove ball and stop location");
            C81858k.this.mo68418k();
            C81858k.this.mo114255D0();
            C81858k.this.f311808n.mo23513d(true);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.floatball.k$b */
    public class C81860b implements C112504a {
        public C81860b() {
        }

        /* renamed from: a */
        public void mo114239a() {
            Log.m105924i("MicroMsg.AppBrandLocationFloatBallHelper", "onCloseInternal, transform to float ball animation cancel");
            C81858k.this.f311808n.mo23513d(true);
        }

        public void onAnimationEnd() {
            Log.m105924i("MicroMsg.AppBrandLocationFloatBallHelper", "onCloseInternal, transform to float ball animation end");
            C81858k.this.f311808n.mo23513d(false);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.floatball.k$c */
    public class C81861c implements C81590r.C29458b {
        public C81861c() {
        }

        /* renamed from: a */
        public void mo56715a(AppBrandBackgroundRunningOperationParcel appBrandBackgroundRunningOperationParcel) {
            AppBrandRuntimeWC appBrandRuntimeWC;
            if (appBrandBackgroundRunningOperationParcel != null && (appBrandRuntimeWC = C81858k.this.f240142s) != null && appBrandRuntimeWC.f238147j.equals(appBrandBackgroundRunningOperationParcel.f239222d) && C81858k.this.f240142s.f238149o.f239365g == appBrandBackgroundRunningOperationParcel.f239223e && appBrandBackgroundRunningOperationParcel.f239224f == 2 && appBrandBackgroundRunningOperationParcel.f239225g == 1) {
                C81858k kVar = C81858k.this;
                Class cls = C100824i.class;
                if (!kVar.mo90541w()) {
                    Log.m105924i("MicroMsg.AppBrandLocationFloatBallHelper", "onBackgroundLocationStateChanged, add passive location float ball");
                    kVar.mo149077r0(true);
                    kVar.mo90537e(true);
                    kVar.mo149078s0(((C100824i) C86312j.m106911c(cls)).mo139644ye(kVar.f311726d.f311679D, 1));
                    kVar.mo68419u();
                    return;
                }
                Log.m105924i("MicroMsg.AppBrandLocationFloatBallHelper", "onBackgroundLocationStateChanged, add location state to float ball");
                kVar.mo149078s0(((C100824i) C86312j.m106911c(cls)).mo139644ye(kVar.f311726d.f311679D, 1));
            }
        }
    }

    public C81858k(C111237j jVar, AppBrandRuntimeWC appBrandRuntimeWC) {
        super(jVar);
        this.f240142s = appBrandRuntimeWC;
        Log.m105925i("MicroMsg.AppBrandLocationFloatBallHelper", "create, runtime:%s", Integer.valueOf(appBrandRuntimeWC.hashCode()));
        this.f240143t = (C81590r) C86312j.m106911c(C81590r.class);
    }

    /* renamed from: A */
    public void mo35648A(int i, String str) {
        Log.m105925i("MicroMsg.AppBrandLocationFloatBallHelper", "onCreate, type:%s, key:%s", Integer.valueOf(i), str);
        super.mo35648A(i, str);
        C81590r rVar = this.f240143t;
        if (rVar != null) {
            rVar.ke0(this.f240144u);
        }
    }

    /* renamed from: A0 */
    public void mo67996A0() {
        Log.m105925i("MicroMsg.AppBrandLocationFloatBallHelper", "onDestroy, runtime:%s", Integer.valueOf(this.f240142s.hashCode()));
        super.mo67996A0();
        C81590r rVar = this.f240143t;
        if (rVar != null) {
            rVar.n50(this.f240144u);
        }
    }

    /* renamed from: C */
    public void mo64001C() {
        Log.m105925i("MicroMsg.AppBrandLocationFloatBallHelper", "onExitPage, runtime:%s", Integer.valueOf(this.f240142s.hashCode()));
        if (mo149069e0() != null) {
            mo149080u0(true);
        }
    }

    /* renamed from: C0 */
    public final void mo114254C0(int i) {
        getReportInfo().f311721j = mo149199x0(i);
        mo68414O();
        C105083o.m141017a(this.f311808n, this.f311729g.mo149129k(), new C81860b());
    }

    /* renamed from: D0 */
    public final void mo114255D0() {
        Class cls = C81590r.class;
        if (C86312j.m106911c(cls) != null) {
            MMBackgroundRunningOperationParcel mMBackgroundRunningOperationParcel = new MMBackgroundRunningOperationParcel();
            mMBackgroundRunningOperationParcel.f239244d = this.f240142s.f238147j;
            mMBackgroundRunningOperationParcel.f239245e = 2;
            mMBackgroundRunningOperationParcel.f239246f = 2;
            Log.m105925i("MicroMsg.AppBrandLocationFloatBallHelper", "stopLocationBackground, appId:%s", this.f240142s.f238147j);
            ((C81590r) C86312j.m106911c(cls)).mo56712qa(mMBackgroundRunningOperationParcel);
        }
    }

    /* renamed from: j0 */
    public void mo68417j0() {
        Log.m105925i("MicroMsg.AppBrandLocationFloatBallHelper", "onReceivedBallInfoRemovedEvent, runtime:%s", Integer.valueOf(this.f240142s.hashCode()));
        mo149200z0();
        mo114255D0();
    }

    /* renamed from: k0 */
    public void mo64002k0() {
        Log.m105925i("MicroMsg.AppBrandLocationFloatBallHelper", "onReceivedFinishWhenSwitchBallEvent, runtime:%s", Integer.valueOf(this.f240142s.hashCode()));
        this.f311808n.mo23513d(true);
    }

    /* renamed from: o */
    public void mo64003o() {
        Log.m105925i("MicroMsg.AppBrandLocationFloatBallHelper", "onEnterPage, runtime:%s", Integer.valueOf(this.f240142s.hashCode()));
        if (mo149069e0() != null) {
            mo149080u0(false);
        }
    }

    /* renamed from: y0 */
    public boolean mo64004y0(int i) {
        Log.m105925i("MicroMsg.AppBrandLocationFloatBallHelper", "onClose, runtime:%s", Integer.valueOf(this.f240142s.hashCode()));
        if (!mo90541w()) {
            return false;
        }
        if (!((C103918d) C86312j.m106911c(C103918d.class)).mo125772Jn(this.f311808n.getActivity())) {
            AppBrandFloatBallPermissionHelper.m100447a(this.f311808n.getActivity(), 7, new C81859a(i));
        } else {
            mo114254C0(i);
        }
        return true;
    }
}
