package com.tencent.p014mm.plugin.appbrand.p026ui.autofill;

import android.view.View;
import com.tencent.p014mm.plugin.appbrand.p026ui.autofill.AppBrandIDCardUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.autofill.b */
public class C115274b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ AppBrandIDCardShowFrag f345480d;

    public C115274b(AppBrandIDCardShowFrag appBrandIDCardShowFrag) {
        this.f345480d = appBrandIDCardShowFrag;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/ui/autofill/AppBrandIDCardShowFrag$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105924i("MicroMsg.AppBrandIDCardShowFrag", "verifyPayPassword click");
        AppBrandIDCardUI.C115272d dVar = this.f345480d.f345423d;
        if (dVar != null) {
            ((AppBrandIDCardUI.C115267a) dVar).mo175055b();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/ui/autofill/AppBrandIDCardShowFrag$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
