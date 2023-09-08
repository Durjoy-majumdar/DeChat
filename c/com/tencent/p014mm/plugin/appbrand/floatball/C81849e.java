package com.tencent.p014mm.plugin.appbrand.floatball;

import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWCAccessible;
import com.tencent.p014mm.plugin.appbrand.floatball.C81862l;
import com.tencent.p014mm.plugin.ball.service.C105052s;
import com.tencent.p014mm.sdk.platformtools.Log;
import uv0.C111237j;

/* renamed from: com.tencent.mm.plugin.appbrand.floatball.e */
public class C81849e extends C105052s {

    /* renamed from: s */
    public AppBrandRuntimeWC f240125s;

    /* renamed from: com.tencent.mm.plugin.appbrand.floatball.e$a */
    public class C81850a implements C81862l.C81868f {

        /* renamed from: a */
        public final /* synthetic */ C105052s.C85051c f240126a;

        public C81850a(C81849e eVar, C105052s.C85051c cVar) {
            this.f240126a = cVar;
        }

        /* renamed from: a */
        public void mo114246a() {
            Log.m105924i("MicroMsg.AppBrandFloatBallHelper", "beforeOnMenuFloatBallSelected, afterShowVOIPTip");
            C105052s.C85051c cVar = this.f240126a;
            if (cVar != null) {
                ((C105052s.C105053b) cVar).mo149201a();
            }
        }
    }

    public C81849e(C111237j jVar, AppBrandRuntimeWC appBrandRuntimeWC) {
        super(jVar);
        this.f240125s = appBrandRuntimeWC;
        Log.m105925i("MicroMsg.AppBrandFloatBallHelper", "create, runtime:%s", Integer.valueOf(appBrandRuntimeWC.hashCode()));
    }

    /* renamed from: A */
    public void mo35648A(int i, String str) {
        Log.m105925i("MicroMsg.AppBrandFloatBallHelper", "onCreate, type:%s, key:%s", Integer.valueOf(i), str);
        super.mo35648A(i, str);
    }

    /* renamed from: A0 */
    public void mo67996A0() {
        Log.m105925i("MicroMsg.AppBrandFloatBallHelper", "onDestroy, runtime:%s", Integer.valueOf(this.f240125s.hashCode()));
        super.mo67996A0();
    }

    /* renamed from: C */
    public void mo64001C() {
        Log.m105925i("MicroMsg.AppBrandFloatBallHelper", "onExitPage, runtime:%s", Integer.valueOf(this.f240125s.hashCode()));
        super.mo64001C();
    }

    /* renamed from: V */
    public boolean mo35650V() {
        return !this.f240125s.mo113210l1().f239373d1;
    }

    /* renamed from: k0 */
    public void mo64002k0() {
        Log.m105925i("MicroMsg.AppBrandFloatBallHelper", "onReceivedFinishWhenSwitchBallEvent, runtime:%s", Integer.valueOf(this.f240125s.hashCode()));
        this.f311808n.mo23513d(true);
    }

    /* renamed from: o */
    public void mo64003o() {
        Log.m105925i("MicroMsg.AppBrandFloatBallHelper", "onEnterPage, runtime:%s", Integer.valueOf(this.f240125s.hashCode()));
        if (AppBrandRuntimeWCAccessible.isGame(this.f240125s)) {
            mo78184B0();
        } else {
            super.mo64003o();
        }
    }

    /* renamed from: w0 */
    public void mo114245w0(C105052s.C85051c cVar) {
        C81862l lVar = (C81862l) this.f240125s.mo113032U(C81862l.class);
        if (lVar == null || !lVar.mo114259F0()) {
            Log.m105924i("MicroMsg.AppBrandFloatBallHelper", "beforeOnMenuFloatBallSelected, not show vpip tip");
            if (cVar != null) {
                ((C105052s.C105053b) cVar).mo149201a();
                return;
            }
            return;
        }
        lVar.mo114260G0(this.f240125s.mo113026R(), new C81850a(this, cVar));
    }

    /* renamed from: y0 */
    public boolean mo64004y0(int i) {
        Log.m105925i("MicroMsg.AppBrandFloatBallHelper", "onClose, runtime:%s", Integer.valueOf(this.f240125s.hashCode()));
        return super.mo64004y0(i);
    }
}
