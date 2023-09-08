package qp0;

import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.multitask.C56887p;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: qp0.c */
public class C89785c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AppBrandRuntimeWC f258165d;

    /* renamed from: e */
    public final /* synthetic */ C89787d f258166e;

    /* renamed from: qp0.c$a */
    public class C89786a implements Runnable {
        public C89786a() {
        }

        public void run() {
            C89784b bVar = C89785c.this.f258166e.f258168a;
            if (bVar != null) {
                bVar.mo74188E();
            }
        }
    }

    public C89785c(C89787d dVar, AppBrandRuntimeWC appBrandRuntimeWC) {
        this.f258166e = dVar;
        this.f258165d = appBrandRuntimeWC;
    }

    public void run() {
        if (this.f258165d.mo113064k0() || this.f258165d.f238117P) {
            Log.m105928w("MicroMsg.AppBrandMultiTaskLogic", "initFloatBallHelper in work thread, but runtime finished");
            return;
        }
        C89784b bVar = this.f258166e.f258168a;
        if (bVar != null) {
            bVar.getClass();
        }
        C89788e eVar = new C89788e(this.f258165d);
        this.f258166e.f258168a = new C89784b(eVar, this.f258165d);
        this.f258166e.f258168a.mo35809D(1, C56887p.m65608b(this.f258165d.f238147j, this.f258165d.f238149o.f239365g));
        if (this.f258165d.mo113210l1().f239394y1 != null) {
            this.f258166e.f258168a.mo160099Y(this.f258165d.mo113210l1().f239394y1.f238428d);
        } else {
            Log.m105921e("MicroMsg.AppBrandMultiTaskLogic", "multiTaskData null! enter scene:%d", Integer.valueOf(this.f258165d.mo113208k1()));
            if (this.f258165d.mo113208k1() == 1089 || this.f258165d.mo113208k1() == 1104) {
                this.f258166e.f258168a.f326432n = true;
            } else {
                this.f258166e.f258168a.f326432n = false;
            }
        }
        this.f258165d.mo113020N0(new C89786a());
    }
}
