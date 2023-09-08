package com.tencent.p014mm.plugin.appbrand.p026ui.autofill;

import android.view.View;
import com.tencent.p014mm.plugin.appbrand.p026ui.autofill.AppBrandIDCardUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import te3.y44;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.autofill.d */
public class C115276d implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ y44 f345483d;

    /* renamed from: e */
    public final /* synthetic */ AppBrandIDCardShowFrag f345484e;

    public C115276d(AppBrandIDCardShowFrag appBrandIDCardShowFrag, y44 y44) {
        this.f345484e = appBrandIDCardShowFrag;
        this.f345483d = y44;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/ui/autofill/AppBrandIDCardShowFrag$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        AppBrandIDCardUI.C115272d dVar = this.f345484e.f345423d;
        if (dVar != null) {
            String str = this.f345483d.f354573r.get(0).f183445e;
            Log.m105924i("MicroMsg.AppBrandIDCardUI", "urlJump click");
            AppBrandIDCardUI.m162021H7(AppBrandIDCardUI.this, str);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/ui/autofill/AppBrandIDCardShowFrag$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
