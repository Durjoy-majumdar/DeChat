package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.view.View;
import com.tencent.p014mm.plugin.appbrand.config.C81661j;
import com.tencent.p014mm.plugin.appbrand.config.WxaProfileAttributes;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandProfileUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import j20.C117292a;
import java.util.ArrayList;
import kr0.C76629w0;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.c2 */
public class C84500c2 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ AppBrandProfileUI f246617d;

    public C84500c2(AppBrandProfileUI appBrandProfileUI) {
        this.f246617d = appBrandProfileUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/ui/AppBrandProfileUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        AppBrandProfileUI appBrandProfileUI = this.f246617d;
        String str = appBrandProfileUI.f246448d;
        WxaProfileAttributes wxaProfileAttributes = appBrandProfileUI.f246452h;
        if (wxaProfileAttributes == null) {
            wxaProfileAttributes = C81661j.m100177b(str, false);
        }
        if (wxaProfileAttributes == null) {
            Log.m105928w("MicroMsg.AppBrand.Profile.AppBrandProfileUI", "enterContact, attrs is null");
        } else {
            AppBrandProfileUI.C84455g gVar = new AppBrandProfileUI.C84455g(appBrandProfileUI, wxaProfileAttributes);
            WxaProfileAttributes wxaProfileAttributes2 = gVar.f246479b;
            String str2 = wxaProfileAttributes2.f239575d;
            String str3 = wxaProfileAttributes2.f239577f;
            Log.m105925i("MicroMsg.AppBrand.Profile.AppBrandProfileUI", "doEnter, username: %s, nickname: %s", str2, str3);
            C75700k0 k0Var = (C75700k0) C86709a0.m107533q(C75700k0.class);
            C72996z1 z1Var = k0Var.mo96097Ni().get(str2);
            if (z1Var == null || ((int) z1Var.f108320R1) == 0) {
                Log.m105924i("MicroMsg.AppBrand.Profile.AppBrandProfileUI", "doEnter, contact is null");
                C72996z1 z1Var2 = new C72996z1(str2);
                z1Var2.setType(0);
                z1Var2.mo62878U2(str3);
                k0Var.mo96097Ni().mo69667P3(z1Var2);
                Log.m105925i("MicroMsg.AppBrand.Profile.AppBrandProfileUI", "doEnter, %s save to contact table", str2);
                ((C76629w0) C86312j.m106911c(C76629w0.class)).mo106878CE(str2, gVar);
            } else {
                gVar.mo117101b();
            }
            appBrandProfileUI.mo117090L7(29, 1);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/ui/AppBrandProfileUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
