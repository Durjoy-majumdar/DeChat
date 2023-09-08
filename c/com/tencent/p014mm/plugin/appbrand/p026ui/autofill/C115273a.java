package com.tencent.p014mm.plugin.appbrand.p026ui.autofill;

import android.view.View;
import com.tencent.p014mm.plugin.appbrand.p026ui.autofill.AppBrandIDCardUI;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.autofill.a */
public class C115273a implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ AppBrandIDCardShowFrag f345479d;

    public C115273a(AppBrandIDCardShowFrag appBrandIDCardShowFrag) {
        this.f345479d = appBrandIDCardShowFrag;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/ui/autofill/AppBrandIDCardShowFrag$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        AppBrandIDCardUI.C115272d dVar = this.f345479d.f345423d;
        if (dVar != null) {
            AppBrandIDCardUI appBrandIDCardUI = AppBrandIDCardUI.this;
            int i = AppBrandIDCardUI.f345438C;
            appBrandIDCardUI.mo175053I7();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/ui/autofill/AppBrandIDCardShowFrag$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
