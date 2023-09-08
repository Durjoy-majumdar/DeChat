package com.tencent.p014mm.plugin.appbrand.floatball;

import android.content.Context;
import aw0.C79636p;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82234f;
import com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82250m;
import com.tencent.p014mm.plugin.ball.p1099ui.C105083o;
import com.tencent.p014mm.plugin.ball.service.C105052s;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import p447aw.C103918d;
import uv0.C111237j;
import yv0.C112504a;

/* renamed from: com.tencent.mm.plugin.appbrand.floatball.c */
public final class C81845c extends C105052s {

    /* renamed from: s */
    public final AppBrandRuntime f240117s;

    /* renamed from: t */
    public final String f240118t;

    /* renamed from: u */
    public volatile C82250m.C82253c f240119u;

    /* renamed from: com.tencent.mm.plugin.appbrand.floatball.c$a */
    public static final class C81846a implements C79636p {

        /* renamed from: a */
        public final /* synthetic */ C81845c f240120a;

        /* renamed from: b */
        public final /* synthetic */ int f240121b;

        public C81846a(C81845c cVar, int i) {
            this.f240120a = cVar;
            this.f240121b = i;
        }

        /* renamed from: a */
        public final void mo109774a(boolean z) {
            String str = this.f240120a.f240118t;
            Log.m105924i(str, "onCheckResult#onClose, isOk: " + z);
            if (z) {
                this.f240120a.mo114242C0(this.f240121b);
                return;
            }
            this.f240120a.mo68418k();
            this.f240120a.f311808n.mo23513d(true);
            C82250m a = C82234f.f241133b.mo114632a(this.f240120a.f240117s);
            if (a != null) {
                C82250m.C82251a.m101007a(a, false, 1, (Object) null);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.floatball.c$b */
    public static final class C81847b implements C112504a {

        /* renamed from: a */
        public final /* synthetic */ C81845c f240122a;

        public C81847b(C81845c cVar) {
            this.f240122a = cVar;
        }

        /* renamed from: a */
        public void mo114239a() {
            Log.m105924i(this.f240122a.f240118t, "onAnimationCancel#onClosePermissionAllowed");
            this.f240122a.f311808n.mo23513d(true);
        }

        public void onAnimationEnd() {
            Log.m105924i(this.f240122a.f240118t, "onAnimationEnd#onClosePermissionAllowed");
            this.f240122a.f311808n.mo23513d(false);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C81845c(C111237j jVar, AppBrandRuntime appBrandRuntime) {
        super(jVar);
        C87412m.m108594g(jVar, "pageAdapter");
        C87412m.m108594g(appBrandRuntime, "runtime");
        this.f240117s = appBrandRuntime;
        this.f240118t = "MicroMsg.AppBrand.AppBrandBluetoothFloatBallHelper#" + C82234f.f241133b.mo114635d(appBrandRuntime);
    }

    /* renamed from: A */
    public void mo35648A(int i, String str) {
        String str2 = this.f240118t;
        Log.m105924i(str2, "onCreate, floatBallType: " + str + ", floatBallKey: " + str);
        super.mo35648A(i, str);
        C82250m b = C82234f.f241133b.mo114633b(this.f240117s);
        C82250m.C82253c cVar = this.f240119u;
        if (cVar == null) {
            Log.m105924i(this.f240118t, "requireBackgroundSupportStateListener, create");
            cVar = new C81848d(this);
            this.f240119u = cVar;
        }
        b.mo114626n(cVar);
    }

    /* renamed from: A0 */
    public void mo67996A0() {
        C82250m a;
        Log.m105924i(this.f240118t, "onDestroy");
        super.mo67996A0();
        C82250m.C82253c cVar = this.f240119u;
        if (cVar != null && (a = C82234f.f241133b.mo114632a(this.f240117s)) != null) {
            a.mo114619T(cVar);
        }
    }

    /* renamed from: C */
    public void mo64001C() {
        Log.m105924i(this.f240118t, "onExitPage");
        if (mo149069e0() != null) {
            mo149080u0(true);
        }
    }

    /* renamed from: C0 */
    public final void mo114242C0(int i) {
        getReportInfo().f311721j = mo149199x0(i);
        mo68414O();
        C105083o.m141017a(this.f311808n, this.f311729g.mo149129k(), new C81847b(this));
    }

    /* renamed from: j0 */
    public void mo68417j0() {
        Log.m105924i(this.f240118t, "onReceivedBallInfoRemovedEvent");
        mo149200z0();
        C82250m a = C82234f.f241133b.mo114632a(this.f240117s);
        if (a != null) {
            C82250m.C82251a.m101007a(a, false, 1, (Object) null);
        }
    }

    /* renamed from: k0 */
    public void mo64002k0() {
        Log.m105924i(this.f240118t, "onReceivedFinishWhenSwitchBallEvent");
        this.f311808n.mo23513d(true);
    }

    /* renamed from: o */
    public void mo64003o() {
        Log.m105924i(this.f240118t, "onEnterPage");
        if (mo149069e0() != null) {
            mo149080u0(false);
        }
    }

    /* renamed from: y0 */
    public boolean mo64004y0(int i) {
        String str = this.f240118t;
        Log.m105924i(str, "onClose, way: " + i);
        if (!mo90541w()) {
            return false;
        }
        Context context = this.f240117s.f238141d;
        C87412m.m108593f(context, "runtime.appContext");
        if (((C103918d) C86312j.m106911c(C103918d.class)).mo125772Jn(context)) {
            mo114242C0(i);
            return true;
        }
        AppBrandFloatBallPermissionHelper.m100447a(context, 33, new C81846a(this, i));
        return true;
    }
}
