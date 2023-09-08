package com.tencent.p014mm.plugin.appbrand;

import android.text.TextUtils;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82554k;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82870p;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82919r2;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C40482o;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import fl0.C86920e;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import li0.C88508b;
import li0.C88509c;
import mm0.C88784a;
import org.json.JSONObject;
import p977hj.C87526a;
import wi0.C90988l;
import wq0.C91064f;
import wq0.C91065g;
import wq0.C91077n;
import wq0.C91078o;
import yq0.C91548e;
import yq0.C91572m;
import zn0.C91803c;

/* renamed from: com.tencent.mm.plugin.appbrand.f */
public class C81827f implements C82381f.C82384c {

    /* renamed from: a */
    public final C91065g f240087a;

    /* renamed from: b */
    public final C88509c f240088b;

    /* renamed from: c */
    public final C82381f f240089c;

    /* renamed from: com.tencent.mm.plugin.appbrand.f$a */
    public class C81828a implements C91065g.C91067b {

        /* renamed from: a */
        public final /* synthetic */ C82381f.C82383b f240090a;

        /* renamed from: b */
        public final /* synthetic */ C82870p f240091b;

        /* renamed from: c */
        public final /* synthetic */ String f240092c;

        /* renamed from: d */
        public final /* synthetic */ String f240093d;

        /* renamed from: e */
        public final /* synthetic */ int f240094e;

        public C81828a(C82381f.C82383b bVar, C82870p pVar, String str, String str2, int i) {
            this.f240090a = bVar;
            this.f240091b = pVar;
            this.f240092c = str;
            this.f240093d = str2;
            this.f240094e = i;
        }

        /* renamed from: a */
        public void mo114223a(C91065g.C91066a aVar) {
            C82381f fVar = C81827f.this.f240089c;
            if (fVar != null && fVar.isRunning()) {
                if (aVar.f261258a == 0) {
                    this.f240090a.proceed();
                    return;
                }
                this.f240090a.mo114785a(this.f240091b.mo115111l(TextUtils.isEmpty(aVar.f261259b) ? "fail:internal error" : aVar.f261259b, aVar.f261260c, (JSONObject) null));
            }
        }

        /* renamed from: b */
        public void mo114224b(int i) {
            C81827f.this.mo114222f(this.f240091b, this.f240092c, this.f240093d, this.f240094e, i);
        }
    }

    public C81827f(AppBrandRuntime appBrandRuntime, C82381f fVar, C91065g gVar) {
        Objects.requireNonNull(fVar);
        this.f240089c = fVar;
        Objects.requireNonNull(gVar);
        this.f240087a = gVar;
        C88509c cVar = appBrandRuntime.f238113K;
        Objects.requireNonNull(cVar);
        this.f240088b = cVar;
    }

    /* renamed from: a */
    public void mo114217a(C82870p pVar, String str, String str2, int i, String str3) {
    }

    /* renamed from: b */
    public void mo114218b(int i, String str) {
    }

    /* renamed from: c */
    public void mo114219c(C82919r2 r2Var, C40482o oVar, C82381f.C82383b bVar) {
        try {
            mo114221e(r2Var, oVar, bVar);
        } catch (NullPointerException e) {
            Log.printErrStackTrace("MicroMsg.AppBrandComponentInterceptor", e, "onDispatchImpl %s", r2Var.mo114779e());
        }
    }

    /* renamed from: d */
    public boolean mo114220d(C82870p pVar, String str, String str2, int i, C82381f.C82383b bVar) {
        C91065g.C91066a aVar;
        boolean z;
        boolean z2;
        C82870p pVar2 = pVar;
        C91065g gVar = this.f240087a;
        C82381f fVar = this.f240089c;
        C81828a aVar2 = new C81828a(bVar, pVar, str, str2, i);
        gVar.getClass();
        if (pVar2 == null || fVar == null) {
            aVar = C91065g.C91066a.f261256g;
        } else {
            C88508b c = gVar.f261241a.f238113K.mo122980c();
            int c2 = gVar.mo125130c(fVar, pVar, str, str2, C91065g.m114238f(pVar), true);
            String appId = fVar.getAppId();
            aVar2.mo114224b(c2);
            if (c2 == 6) {
                String e = pVar.mo114779e();
                C91077n nVar = (C91077n) fVar.mo109668l(C91077n.class);
                if (nVar != null) {
                    nVar.i60(e);
                }
                aVar = C91065g.C91066a.f261256g;
            } else if (c2 == 1) {
                if (!(fVar instanceof C81925i2) || c != C88508b.SUSPEND || !C87526a.m108857b(C91065g.f261240o, pVar.mo114779e())) {
                    aVar = C91065g.C91066a.f261257h;
                } else {
                    aVar = new C91065g.C91066a(-1, String.format(Locale.US, "fail: jsapi has no permission, event=%s, runningState=%s, permissionMsg=%s, detail=%s", new Object[]{pVar.mo114779e(), c.name().toLowerCase(), "permission ok", "network api interrupted in suspend state"}), C86920e.f252321k);
                }
            } else if (c2 == 4) {
                String e2 = pVar.mo114779e();
                Set c3 = C91548e.f262377e.mo122462c(appId, false);
                if (c3 != null) {
                    synchronized (c3) {
                        z = c3.contains(e2);
                    }
                } else {
                    z = false;
                }
                if (z) {
                    aVar = C91065g.C91066a.f261257h;
                } else {
                    C82554k kVar = (C82554k) fVar;
                    if (pVar.mo114779e().equals(C91803c.NAME)) {
                        C90988l d0 = kVar.getRuntime().mo113051d0();
                        Log.m105925i("MicroMsg.AppBrandJsApiUserAuth", "getWifiList jump userauth:%b", Boolean.valueOf(!d0.f261069o));
                        z2 = !d0.f261069o;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        aVar = C91065g.C91066a.f261257h;
                    } else {
                        C91548e.m114887d(new C91572m((C81879g) fVar, pVar.mo114779e(), str, str2, i), new C91064f(gVar, aVar2));
                        aVar = C91065g.C91066a.f261255f;
                    }
                }
            } else if (c2 == 7) {
                if (gVar.f261241a.f238113K.mo122979b()) {
                    aVar = C91065g.C91066a.f261257h;
                } else {
                    aVar = new C91065g.C91066a(-1, String.format(Locale.US, "fail: jsapi has no permission, event=%s, runningState=%s, permissionMsg=%s, detail=%s", new Object[]{pVar.mo114779e(), c.name().toLowerCase(), "permission ok", "jsapi permission required playing audio but current not playing audio in background state"}), C86920e.f252321k);
                }
            } else if (c2 == 8) {
                synchronized (gVar.f261244d) {
                    gVar.f261244d.addLast(aVar2);
                }
                aVar = C91065g.C91066a.f261255f;
            } else {
                aVar = C91065g.C91066a.f261256g;
            }
        }
        int i2 = aVar.f261258a;
        if (-2 == i2) {
            return true;
        }
        if (i2 == 0) {
            return false;
        }
        bVar.mo114785a(pVar2.mo115111l(aVar.f261259b, aVar.f261260c, (JSONObject) null));
        return true;
    }

    /* renamed from: e */
    public final void mo114221e(C82919r2 r2Var, C40482o oVar, C82381f.C82383b bVar) {
        C88509c cVar = this.f240088b;
        if (cVar.f255667a.f255687u.get()) {
            bVar.mo114785a("fail:interrupted");
        } else if (!this.f240089c.mo109648b(r2Var.mo114779e(), oVar)) {
            Log.m105921e("MicroMsg.AppBrandComponentInterceptor", "onDispatch, event[%s], appId[%s], envStopped", r2Var.mo114779e(), this.f240089c.getAppId());
            bVar.mo114785a("fail:interrupted");
        } else {
            C88508b c = cVar.mo122980c();
            boolean a = this.f240087a.mo125128a(this.f240089c, r2Var.getClass());
            boolean z = C88508b.SUSPEND == c || a;
            C91078o oVar2 = (C91078o) this.f240089c.mo109668l(C91078o.class);
            if (oVar2 == null || !oVar2.mo125139aS(r2Var)) {
                Log.m105925i("MicroMsg.AppBrandComponentInterceptor", "dispatchToService, canSend %B, event %s, state %s, hasPermission %b", Boolean.valueOf(z), r2Var.mo114779e(), c, Boolean.valueOf(a));
                if (WeChatEnvironment.hasDebugger()) {
                    if (r2Var.mo114779e().equals(C88784a.NAME)) {
                        Log.m105919d("MicroMsg.AppBrandComponentInterceptor", "dispatchToAutoTest, event %s, data %d, ", r2Var.mo114779e(), Integer.valueOf(r2Var.mo115160j().length()));
                    } else {
                        Log.m105919d("MicroMsg.AppBrandComponentInterceptor", "dispatchToAutoTest, event %s, data %s, ", r2Var.mo114779e(), r2Var.mo115160j());
                    }
                }
            }
            if (!z) {
                bVar.mo114785a("fail:access denied");
            } else {
                bVar.proceed();
            }
        }
    }

    /* renamed from: f */
    public void mo114222f(C82870p pVar, String str, String str2, int i, int i2) {
    }
}
