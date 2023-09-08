package p284zb;

import com.tencent.p014mm.appbrand.p942v8.C80662g;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83165i;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83174m;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83181q;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.skia_canvas.XWebLibraryLoader;
import fo0.C32141h;
import fo0.C87023i;
import fo0.C87024j;
import fo0.C87026k;
import fo0.C87027l;
import p206nj.C88957l;
import zi0.C91755a;
import zi0.C91759b;

/* renamed from: zb.v */
public final class C91659v {

    /* renamed from: a */
    public final boolean f262637a;

    public C91659v(boolean z) {
        this.f262637a = z;
    }

    /* renamed from: a */
    public void mo125543a(C83165i iVar, C81925i2 i2Var) {
        String str = this.f262637a ? "SkiaCanvasNativeGlobal" : "";
        if (!C87027l.f252546a) {
            C88957l.m111079o("c++_shared", C80662g.class.getClassLoader());
            XWebLibraryLoader.initXWebLibraryLoader(new C32141h());
            C87027l.f252546a = true;
        }
        C83181q qVar = (C83181q) iVar.mo63321n0(C83181q.class);
        if (qVar != null) {
            qVar.mo115423q0(new C87024j(iVar, i2Var, str, qVar));
            C83174m mVar = (C83174m) iVar.mo63321n0(C83174m.class);
            if (mVar != null) {
                mVar.mo115384z0(new C87027l.C87028a(new C87026k(i2Var)));
            } else {
                Log.m105920e("Luggage.XWebCanvasLogic", "addonDestroyListener is null, fail");
            }
        }
    }

    /* renamed from: b */
    public void mo125544b(AppBrandRuntime appBrandRuntime, C83165i iVar, C81925i2 i2Var) {
        C91759b bVar = (C91759b) i2Var.mo109668l(C91759b.class);
        C91755a aVar = (C91755a) i2Var.mo109668l(C91755a.class);
        if (!C87027l.f252546a) {
            C88957l.m111079o("c++_shared", C80662g.class.getClassLoader());
            XWebLibraryLoader.initXWebLibraryLoader(new C32141h());
            C87027l.f252546a = true;
        }
        C83165i jsRuntime = i2Var.getJsRuntime();
        if (jsRuntime != null) {
            C83181q qVar = (C83181q) jsRuntime.mo63321n0(C83181q.class);
            if (qVar != null) {
                qVar.mo115423q0(new C87023i(bVar, aVar, i2Var));
            } else {
                Log.m105920e("Luggage.XWebCanvasLogic", "jsThreadAddon is null, fail");
            }
        }
    }
}
