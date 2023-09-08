package com.tencent.p014mm.plugin.appbrand.p026ui.autofill;

import android.view.View;
import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;
import com.tencent.p014mm.plugin.appbrand.p026ui.autofill.AppBrandIDCardUI;
import com.tencent.p014mm.plugin.appbrand.phonenumber.PhoneItem;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import ob0.C47350c;
import te3.C64439i8;
import te3.hq4;
import te3.iq4;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.autofill.u */
public class C115297u implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ AppBrandIDCardVerifyPwdFrag f345506d;

    public C115297u(AppBrandIDCardVerifyPwdFrag appBrandIDCardVerifyPwdFrag) {
        this.f345506d = appBrandIDCardVerifyPwdFrag;
    }

    public void onClick(View view) {
        PhoneItem phoneItem;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/ui/autofill/AppBrandIDCardVerifyPwdFrag$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105924i("MicroMsg.AppBrandIDCardVerifyPwdFrag", "verify sms click");
        AppBrandIDCardVerifyPwdFrag appBrandIDCardVerifyPwdFrag = this.f345506d;
        AppBrandIDCardUI.C115272d dVar = appBrandIDCardVerifyPwdFrag.f345467d;
        if (dVar != null) {
            String obj = appBrandIDCardVerifyPwdFrag.f345477q.getText().toString();
            C64439i8 i8Var = this.f345506d.f345469f;
            AppBrandIDCardUI.C115267a aVar = (AppBrandIDCardUI.C115267a) dVar;
            aVar.getClass();
            if (Util.isNullOrNil(obj)) {
                Log.m105920e("MicroMsg.AppBrandIDCardUI", "verifyCode is null, err, return");
            } else {
                Log.m105924i("MicroMsg.AppBrandIDCardUI", "verifySms");
                C47350c.C47352b bVar = new C47350c.C47352b();
                bVar.f127066a = new hq4();
                bVar.f127067b = new iq4();
                bVar.f127068c = "/cgi-bin/mmbiz-bin/userdata/verifysmscode";
                bVar.f127069d = 1721;
                bVar.f127070e = 0;
                bVar.f127071f = 0;
                C47350c a = bVar.mo72403a();
                hq4 hq4 = (hq4) a.f127055a.f127080a;
                AppBrandIDCardUI appBrandIDCardUI = AppBrandIDCardUI.this;
                hq4.f183535d = appBrandIDCardUI.f345442e;
                hq4.f183536e = appBrandIDCardUI.f345451q;
                hq4.f183537f = appBrandIDCardUI.f345453s;
                hq4.f183538g = i8Var.f183634d;
                hq4.f183539h = appBrandIDCardUI.f345449o.f354574s;
                hq4.f183540i = obj;
                hq4.f183541j = appBrandIDCardUI.f345454t;
                hq4.f183542n = i8Var.f183636f;
                int i = appBrandIDCardUI.f345456v;
                if ((i == 1 || i == 2) && (phoneItem = appBrandIDCardUI.f345439A) != null && !phoneItem.f245278n) {
                    hq4.f183543o = Util.nullAsNil(phoneItem.f245271d);
                }
                ((C40324j) C86312j.m106911c(C40324j.class)).mo63013cp(a, new C115283k(aVar), AppBrandIDCardUI.this.theCreate());
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/ui/autofill/AppBrandIDCardVerifyPwdFrag$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
