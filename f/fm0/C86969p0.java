package fm0;

import android.graphics.Bitmap;
import android.view.View;
import bt0.C79808b;
import bt0.C79809c;
import bu0.C79840l;
import bu0.C79842m;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82554k;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import tq0.C90574e;

/* renamed from: fm0.p0 */
public class C86969p0 extends C79842m {

    /* renamed from: a */
    public final /* synthetic */ C83780d1 f252423a;

    /* renamed from: b */
    public final /* synthetic */ C82554k f252424b;

    /* renamed from: c */
    public final /* synthetic */ int f252425c;

    /* renamed from: d */
    public final /* synthetic */ C86973q0 f252426d;

    /* renamed from: fm0.p0$a */
    public class C86970a implements View.OnClickListener {
        public C86970a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/appbrand/jsapi/page/JsApiSetNavigationBarRightButton$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C83780d1 d1Var = C86969p0.this.f252423a;
            Log.m105924i("OnCustomRightButtonClickEvent", "OnCustomRightButtonClickEvent dispatch");
            C90574e eVar = new C90574e();
            eVar.mo115194p(d1Var.mo116160O0());
            eVar.mo115158h();
            C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/jsapi/page/JsApiSetNavigationBarRightButton$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C86969p0(C86973q0 q0Var, C83780d1 d1Var, C82554k kVar, int i) {
        this.f252426d = q0Var;
        this.f252423a = d1Var;
        this.f252424b = kVar;
        this.f252425c = i;
    }

    /* renamed from: a */
    public void mo110010a(Bitmap bitmap, C79840l lVar) {
        C79840l.C79841a aVar;
        if (!(lVar == null || (aVar = lVar.f233991d) == null)) {
            aVar.mo110028a(lVar.f233992e);
        }
        if (this.f252423a.isRunning()) {
            C79808b bVar = this.f252423a.f244554F;
            C86970a aVar2 = new C86970a();
            bVar.getClass();
            bVar.post(new C79809c(bVar, bitmap, aVar2));
        }
        this.f252424b.mo109647a(this.f252425c, this.f252426d.mo115109j("ok"));
    }
}
