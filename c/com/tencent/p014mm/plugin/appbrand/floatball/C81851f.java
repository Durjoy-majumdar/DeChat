package com.tencent.p014mm.plugin.appbrand.floatball;

import aw0.C79635e;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;

/* renamed from: com.tencent.mm.plugin.appbrand.floatball.f */
public class C81851f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AppBrandRuntimeWC f240127d;

    /* renamed from: e */
    public final /* synthetic */ C81855i f240128e;

    /* renamed from: com.tencent.mm.plugin.appbrand.floatball.f$a */
    public class C81852a implements Runnable {
        public C81852a() {
        }

        public void run() {
            C81849e eVar = C81851f.this.f240128e.f240135b;
            if (eVar != null) {
                eVar.mo64003o();
            }
            C81858k kVar = C81851f.this.f240128e.f240136c;
            if (kVar != null) {
                kVar.mo64003o();
            }
            C81862l lVar = C81851f.this.f240128e.f240137d;
            if (lVar != null) {
                lVar.mo64003o();
            }
            C81840a aVar = C81851f.this.f240128e.f240139f;
            if (aVar != null) {
                aVar.mo64003o();
            }
            C81869m mVar = C81851f.this.f240128e.f240138e;
            if (mVar != null) {
                mVar.mo64003o();
            }
        }
    }

    public C81851f(C81855i iVar, AppBrandRuntimeWC appBrandRuntimeWC) {
        this.f240128e = iVar;
        this.f240127d = appBrandRuntimeWC;
    }

    public void run() {
        if (this.f240127d.mo113064k0() || this.f240127d.f238117P) {
            Log.m105928w("MicroMsg.AppBrandFloatBallLogic", "initFloatBallHelper in work thread, but runtime finished");
            return;
        }
        C81849e eVar = this.f240128e.f240135b;
        if (eVar != null) {
            eVar.mo67996A0();
        }
        C81856j jVar = new C81856j(this.f240127d.mo113026R(), this.f240127d);
        this.f240128e.f240135b = new C81849e(jVar, this.f240127d);
        this.f240128e.f240135b.mo35648A(1, C79635e.m96713a(this.f240127d.f238147j, this.f240127d.f238149o.f239365g));
        C81849e eVar2 = this.f240128e.f240135b;
        AppBrandInitConfigWC M1 = this.f240127d.mo113210l1();
        eVar2.getClass();
        if (M1 != null) {
            Log.m105925i("MicroMsg.AppBrandFloatBallHelper", "updateBallInfoWithInitConfig, initConfig:%s", M1);
            eVar2.f311726d.f311695p = eVar2.f240125s.mo113210l1().f239364f;
            eVar2.f311726d.f311699t = eVar2.f240125s.mo113210l1().f239363e;
            if (eVar2.f240125s.f238149o.f239365g == 1) {
                eVar2.f311726d.f311701v = MMApplicationContext.getContext().getString(C0966R.string.f7602l3);
            } else if (eVar2.f240125s.f238149o.f239365g == 2) {
                eVar2.f311726d.f311701v = MMApplicationContext.getContext().getString(C0966R.string.f7601l2);
            } else {
                eVar2.f311726d.f311701v = null;
            }
            eVar2.f311726d.mo149049o("appId", eVar2.f240125s.mo113210l1().f239362d);
            eVar2.f311726d.mo149049o("username", eVar2.f240125s.mo113210l1().f234839s);
            eVar2.f311726d.mo149048m("versionType", eVar2.f240125s.mo113210l1().f239365g);
            C81855i.m100487c(eVar2, M1);
            eVar2.getReportInfo().f311717f = 6;
            eVar2.mo68414O();
        }
        C81858k kVar = this.f240128e.f240136c;
        if (kVar != null) {
            kVar.mo67996A0();
        }
        C81856j jVar2 = new C81856j(this.f240127d.mo113026R(), this.f240127d);
        this.f240128e.f240136c = new C81858k(jVar2, this.f240127d);
        this.f240128e.f240136c.mo35648A(7, C79635e.m96714b(this.f240127d.f238147j, this.f240127d.f238149o.f239365g));
        C81858k kVar2 = this.f240128e.f240136c;
        AppBrandInitConfigWC M12 = this.f240127d.mo113210l1();
        kVar2.getClass();
        if (M12 != null) {
            Log.m105925i("MicroMsg.AppBrandLocationFloatBallHelper", "updateBallInfoWithInitConfig, initConfig:%s", M12);
            kVar2.f311726d.f311695p = kVar2.f240142s.mo113210l1().f239364f;
            kVar2.f311726d.f311699t = kVar2.f240142s.mo113210l1().f239363e;
            if (kVar2.f240142s.f238149o.f239365g == 1) {
                kVar2.f311726d.f311701v = MMApplicationContext.getContext().getString(C0966R.string.f7602l3);
            } else if (kVar2.f240142s.f238149o.f239365g == 2) {
                kVar2.f311726d.f311701v = MMApplicationContext.getContext().getString(C0966R.string.f7601l2);
            } else {
                kVar2.f311726d.f311701v = null;
            }
            C81855i.m100487c(kVar2, M12);
            kVar2.getReportInfo().f311717f = 2;
            kVar2.mo68414O();
        }
        C81862l lVar = this.f240128e.f240137d;
        if (lVar != null) {
            lVar.mo67996A0();
        }
        C81856j jVar3 = new C81856j(this.f240127d.mo113026R(), this.f240127d);
        this.f240128e.f240137d = new C81862l(jVar3, this.f240127d);
        this.f240128e.f240137d.mo35648A(17, C79635e.m96714b(this.f240127d.f238147j, this.f240127d.f238149o.f239365g));
        C81862l lVar2 = this.f240128e.f240137d;
        AppBrandInitConfigWC M13 = this.f240127d.mo113210l1();
        lVar2.getClass();
        if (M13 != null) {
            Log.m105925i("MicroMsg.AppBrand.AppBrandVOIPFloatBallHelper", "updateBallInfoWithInitConfig, initConfig:%s", M13);
            lVar2.f311726d.f311695p = lVar2.f240149s.mo113210l1().f239364f;
            lVar2.f311726d.f311699t = lVar2.f240149s.mo113210l1().f239363e;
            if (lVar2.f240149s.f238149o.f239365g == 1) {
                lVar2.f311726d.f311701v = MMApplicationContext.getContext().getString(C0966R.string.f7602l3);
            } else if (lVar2.f240149s.f238149o.f239365g == 2) {
                lVar2.f311726d.f311701v = MMApplicationContext.getContext().getString(C0966R.string.f7601l2);
            } else {
                lVar2.f311726d.f311701v = null;
            }
            lVar2.f311726d.mo149049o("appId", lVar2.f240149s.mo113210l1().f239362d);
            lVar2.f311726d.mo149049o("username", lVar2.f240149s.mo113210l1().f234839s);
            lVar2.f311726d.mo149048m("versionType", lVar2.f240149s.mo113210l1().f239365g);
            C81855i.m100487c(lVar2, M13);
            lVar2.getReportInfo().f311717f = 12;
            lVar2.mo68414O();
        }
        C81840a aVar = this.f240128e.f240139f;
        if (aVar != null) {
            aVar.mo67996A0();
        }
        C81856j jVar4 = new C81856j(this.f240127d.mo113026R(), this.f240127d);
        this.f240128e.f240139f = new C81840a(jVar4, this.f240127d);
        this.f240128e.f240139f.mo35648A(18, C79635e.m96713a(this.f240127d.f238147j, this.f240127d.f238149o.f239365g));
        C81840a aVar2 = this.f240128e.f240139f;
        AppBrandInitConfigWC M14 = this.f240127d.mo113210l1();
        if (M14 != null) {
            Log.m105925i(aVar2.f240106s, "updateBallInfoWithInitConfig, initConfig:%s", M14);
            aVar2.f311726d.f311695p = aVar2.f240107t.mo113210l1().f239364f;
            aVar2.f311726d.f311699t = aVar2.mo114235D0();
            if (aVar2.f240107t.f238149o.f239365g == 1) {
                aVar2.f311726d.f311701v = MMApplicationContext.getContext().getString(C0966R.string.f7602l3);
            } else if (aVar2.f240107t.f238149o.f239365g == 2) {
                aVar2.f311726d.f311701v = MMApplicationContext.getContext().getString(C0966R.string.f7601l2);
            } else {
                aVar2.f311726d.f311701v = null;
            }
            aVar2.mo68414O();
        } else {
            aVar2.getClass();
        }
        C81869m mVar = this.f240128e.f240138e;
        if (mVar != null) {
            mVar.mo67996A0();
        }
        C81878n nVar = new C81878n(this.f240127d.mo113026R(), this.f240127d);
        this.f240128e.f240138e = new C81869m(nVar, this.f240127d);
        this.f240128e.f240138e.mo35648A(19, C79635e.m96714b(this.f240127d.f238147j, this.f240127d.f238149o.f239365g));
        C81869m mVar2 = this.f240128e.f240138e;
        AppBrandInitConfigWC M15 = this.f240127d.mo113210l1();
        mVar2.getClass();
        if (M15 != null) {
            Log.m105925i("MicroMsg.AppBrand.AppBrandVoIP1v1FloatBallHelper", "updateBallInfoWithInitConfig, initConfig:%s", M15);
            mVar2.f311726d.f311695p = mVar2.f240159s.mo113210l1().f239364f;
            mVar2.f311726d.f311699t = mVar2.f240159s.mo113210l1().f239363e;
            if (mVar2.f240159s.f238149o.f239365g == 1) {
                mVar2.f311726d.f311701v = MMApplicationContext.getContext().getString(C0966R.string.f7602l3);
            } else if (mVar2.f240159s.f238149o.f239365g == 2) {
                mVar2.f311726d.f311701v = MMApplicationContext.getContext().getString(C0966R.string.f7601l2);
            } else {
                mVar2.f311726d.f311701v = null;
            }
            mVar2.f311726d.mo149049o("appId", mVar2.f240159s.mo113210l1().f239362d);
            mVar2.f311726d.mo149049o("username", mVar2.f240159s.mo113210l1().f234839s);
            mVar2.f311726d.mo149048m("versionType", mVar2.f240159s.mo113210l1().f239365g);
            C81855i.m100487c(mVar2, M15);
            mVar2.getReportInfo().f311717f = 14;
            mVar2.mo68414O();
        }
        this.f240127d.mo113020N0(new C81852a());
    }
}
