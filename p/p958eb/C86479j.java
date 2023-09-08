package p958eb;

import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import com.tencent.magicbrush.C80301a;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C40480g;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83185u;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83187w;
import com.tencent.p014mm.sdk.platformtools.Log;
import js0.C88016e;
import p1017od.C89165l;
import p1017od.k$$b;
import p284zb.C91631b;
import p284zb.C91635f;

/* renamed from: eb.j */
public class C86479j extends C91631b<C91635f> {

    /* renamed from: i */
    public boolean f251304i = false;

    public C86479j(C91635f fVar, C83185u uVar) {
        super(fVar, uVar);
    }

    /* renamed from: a */
    public C40480g mo120933a() {
        boolean z;
        C40480g a = super.mo120933a();
        if (a != null) {
            if (this.f251304i) {
                try {
                    C83187w wVar = (C83187w) a.mo63321n0(C83187w.class);
                    C86474e eVar = (C86474e) this.f262488d.mo125517G0(C86474e.class);
                    if (eVar != null) {
                        C80301a U = eVar.mo120910U();
                        long m = wVar.mo115417m();
                        long J0 = wVar.mo115393J0();
                        long j = wVar.mo115414j();
                        U.getClass();
                        U.mo111515k(new k$$b(new C89165l(m, J0, j), U));
                    } else {
                        Log.m105928w("MicroMsg.WAGameJsContextInterfaceLU", "No extension found!");
                    }
                } catch (NullPointerException e) {
                    Log.m105921e("MicroMsg.WAGameJsContextInterfaceLU", "injectNativeGlobal failed [%s]", e);
                    z = false;
                }
            }
            z = true;
            Log.m105925i("MicroMsg.WAGameJsContextInterfaceLU", "alloc injectNativeGlobal = [%b], ret = [%b]", Boolean.valueOf(this.f251304i), Boolean.valueOf(z));
        }
        return a;
    }

    @JavascriptInterface
    public int allocNativeGlobal() {
        this.f251304i = true;
        int alloc = alloc();
        Log.m105925i("MicroMsg.WAGameJsContextInterfaceLU", "alloc injectNativeGlobal = [%b], ret = [%d]", Boolean.valueOf(this.f251304i), Integer.valueOf(alloc));
        this.f251304i = false;
        return alloc;
    }

    /* renamed from: h */
    public String mo120935h() {
        return "WAGameSubContext.js";
    }

    /* renamed from: v */
    public void mo120936v() {
        super.mo120936v();
        Log.m105924i("MicroMsg.WAGameJsContextInterfaceLU", "hy: injected WAGameJSContextInterface");
    }

    /* renamed from: y */
    public void mo120937y(int i, String str) {
        if (this.f251304i) {
            this.f262489e.mo115375F0(i).evaluateJavascript(C88016e.m109548e("wxa_library/NativeGlobal-WAGame.js"), (ValueCallback<String>) null);
        }
    }
}
