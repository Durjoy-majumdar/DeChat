package com.tencent.p014mm.plugin.profile.p088ui;

import android.view.View;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import kr0.C76630x0;

/* renamed from: com.tencent.mm.plugin.profile.ui.j */
public class C42633j implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ BizBindWxaInfoPreference f115411d;

    public C42633j(BizBindWxaInfoPreference bizBindWxaInfoPreference) {
        this.f115411d = bizBindWxaInfoPreference;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/profile/ui/BizBindWxaInfoPreference$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Object tag = view.getTag();
        if (tag == null || !(tag instanceof String)) {
            C117292a.m165361g(this, "com/tencent/mm/plugin/profile/ui/BizBindWxaInfoPreference$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        AppBrandStatObject appBrandStatObject = new AppBrandStatObject();
        appBrandStatObject.f245533f = 1020;
        appBrandStatObject.f245534g = this.f115411d.f115293M.field_username;
        BizBindWxaInfoPreference bizBindWxaInfoPreference = this.f115411d;
        ((C76630x0) C86312j.m106911c(C76630x0.class)).Rg0(bizBindWxaInfoPreference.f121274d, (String) tag, (String) null, 0, 0, (String) null, appBrandStatObject, bizBindWxaInfoPreference.f115293M.field_appId);
        C117292a.m165361g(this, "com/tencent/mm/plugin/profile/ui/BizBindWxaInfoPreference$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
