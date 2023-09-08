package p1025qb;

import com.tencent.luggage.sdk.customize.impl.FullSdkExternalToolsHelper;
import com.tencent.p014mm.plugin.appbrand.app.C81169m2;
import com.tencent.p014mm.plugin.appbrand.debugger.C81733f0;
import com.tencent.p014mm.plugin.appbrand.jsapi.C40469j0;
import com.tencent.p014mm.plugin.appbrand.page.C83827i3;
import com.tencent.p014mm.plugin.appbrand.widget.input.C84981s1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import js0.C46574u;
import js0.C88017h;
import js0.C88019j;
import kr0.C88256b;
import mj0.C88732a;
import p1026rb.C89911a;
import p1038ta.C90383b;
import p1044ub.C90629b;
import p284zb.C91633d;
import p284zb.C91638g;
import p284zb.C91655s;
import p284zb.d$$m;
import p958eb.a$$h;

/* renamed from: qb.c */
public class C89584c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C90383b.C90386c f257785d;

    /* renamed from: e */
    public final /* synthetic */ C89585d f257786e;

    public C89584c(C89585d dVar, C90383b.C90386c cVar) {
        this.f257786e = dVar;
        this.f257785d = cVar;
    }

    public void run() {
        this.f257785d.mo114853b(C40469j0.class, new FullSdkExternalToolsHelper());
        this.f257785d.mo114853b(C46574u.C46575a.class, new C89911a());
        this.f257785d.mo114853b(C83827i3.C83828a.class, new C84981s1.C84982b());
        this.f257785d.mo114853b(C88019j.class, new C88017h());
        ((C81169m2) this.f257786e).getClass();
        if (MMApplicationContext.isAppBrandProcess()) {
            Log.m105924i("Luggage.FullSdkLuggageInitDelegate", "hy: trigger registerServiceLogicImp");
            C91638g.m115119b().mo124762a(new d$$m(), C91633d.class);
            C91638g b = C91638g.m115119b();
            C90629b bVar = C91655s.f262634j;
            b.mo124762a(bVar, C91655s.class);
            C91638g.m115119b().mo124762a(new d$$m(), C88256b.class);
            C91638g.m115119b().mo124762a(new a$$h(), C88732a.class);
            C91638g.m115119b().mo124762a(bVar, C81733f0.class);
        }
    }
}
