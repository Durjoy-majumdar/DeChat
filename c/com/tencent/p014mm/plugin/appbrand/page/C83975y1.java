package com.tencent.p014mm.plugin.appbrand.page;

import android.graphics.Bitmap;
import android.view.View;
import bt0.C79808b;
import bt0.C79809c;
import bu0.C79840l;
import bu0.C79842m;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import tq0.C90574e;

/* renamed from: com.tencent.mm.plugin.appbrand.page.y1 */
public class C83975y1 extends C79842m {

    /* renamed from: a */
    public final /* synthetic */ C83928t1 f245163a;

    /* renamed from: com.tencent.mm.plugin.appbrand.page.y1$a */
    public class C83976a implements View.OnClickListener {
        public C83976a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/appbrand/page/AppBrandPageViewWC$9$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105924i("MicroMsg.AppBrandPageViewWC", "CustomRightButton click");
            C83928t1 t1Var = C83975y1.this.f245163a;
            Log.m105924i("OnCustomRightButtonClickEvent", "OnCustomRightButtonClickEvent dispatch");
            C90574e eVar = new C90574e();
            eVar.mo115194p(t1Var.mo116160O0());
            eVar.mo115158h();
            C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/page/AppBrandPageViewWC$9$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C83975y1(C83928t1 t1Var) {
        this.f245163a = t1Var;
    }

    /* renamed from: a */
    public void mo110010a(Bitmap bitmap, C79840l lVar) {
        C79840l.C79841a aVar;
        if (!(lVar == null || (aVar = lVar.f233991d) == null)) {
            aVar.mo110028a(lVar.f233992e);
        }
        C79808b bVar = this.f245163a.f244554F;
        C83976a aVar2 = new C83976a();
        bVar.getClass();
        bVar.post(new C79809c(bVar, bitmap, aVar2));
    }
}
