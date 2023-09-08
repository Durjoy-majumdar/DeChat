package com.tencent.p014mm.plugin.appbrand.pip;

import android.view.View;
import com.tencent.p014mm.plugin.appbrand.pip.C84021a;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.appbrand.pip.u */
public class C84064u implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C84059t f245445d;

    public C84064u(C84059t tVar) {
        this.f245445d = tVar;
    }

    public void onClick(View view) {
        C84036e eVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/pip/AppBrandPipManager$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105924i(this.f245445d.f245415a, "onCloseButtonClick");
        if (this.f245445d.f245431q) {
            Log.m105928w(this.f245445d.f245415a, "onCloseButtonClick when mPipClickProcessing, return");
            C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/pip/AppBrandPipManager$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        C84059t tVar = this.f245445d;
        if (tVar.f245434t) {
            Log.m105928w(tVar.f245415a, "onCloseButtonClick when mIsTransfering, return");
            C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/pip/AppBrandPipManager$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        C84021a.C84024c cVar = tVar.f245429o;
        if (!(cVar == null || (eVar = tVar.f245413B) == null)) {
            ((C84025a0) eVar).mo116680b(cVar.f245309h, C84043h.PIP_CLOSE_BUTTON_CLICKED);
        }
        C84059t.m103575d(this.f245445d);
        C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/pip/AppBrandPipManager$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
