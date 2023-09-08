package com.tencent.p014mm.plugin.appbrand.p026ui.autofill;

import android.view.View;
import com.tencent.p014mm.plugin.appbrand.p026ui.autofill.AppBrandIDCardUI;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.autofill.r */
public class C115290r implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ AppBrandIDCardVerifyPwdFrag f345499d;

    public C115290r(AppBrandIDCardVerifyPwdFrag appBrandIDCardVerifyPwdFrag) {
        this.f345499d = appBrandIDCardVerifyPwdFrag;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/ui/autofill/AppBrandIDCardVerifyPwdFrag$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        AppBrandIDCardUI.C115272d dVar = this.f345499d.f345467d;
        if (dVar != null) {
            AppBrandIDCardUI appBrandIDCardUI = AppBrandIDCardUI.this;
            int i = AppBrandIDCardUI.f345438C;
            appBrandIDCardUI.mo175053I7();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/ui/autofill/AppBrandIDCardVerifyPwdFrag$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
