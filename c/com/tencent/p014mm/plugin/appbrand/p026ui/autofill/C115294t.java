package com.tencent.p014mm.plugin.appbrand.p026ui.autofill;

import android.app.Activity;
import android.content.DialogInterface;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;
import com.tencent.p014mm.plugin.appbrand.p026ui.autofill.AppBrandIDCardUI;
import com.tencent.p014mm.plugin.appbrand.phonenumber.PhoneItem;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C76879j;
import ob0.C47350c;
import te3.C64439i8;
import te3.C64599o04;
import te3.C64618p04;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.autofill.t */
public class C115294t implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ AppBrandIDCardVerifyPwdFrag f345503d;

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.autofill.t$a */
    public class C115295a implements DialogInterface.OnClickListener {
        public C115295a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            PhoneItem phoneItem;
            C115294t.this.f345503d.f345477q.mo101693b();
            Log.m105924i("MicroMsg.AppBrandIDCardVerifyPwdFrag", "sendSms click");
            AppBrandIDCardVerifyPwdFrag appBrandIDCardVerifyPwdFrag = C115294t.this.f345503d;
            AppBrandIDCardUI.C115272d dVar = appBrandIDCardVerifyPwdFrag.f345467d;
            if (dVar != null) {
                C64439i8 i8Var = appBrandIDCardVerifyPwdFrag.f345469f;
                AppBrandIDCardUI.C115267a aVar = (AppBrandIDCardUI.C115267a) dVar;
                aVar.getClass();
                C115669n.INSTANCE.mo160131h(14943, AppBrandIDCardUI.this.f345442e, 7, AppBrandIDCardUI.this.f345449o.f354574s);
                Log.m105924i("MicroMsg.AppBrandIDCardUI", "sendSms");
                C47350c.C47352b bVar = new C47350c.C47352b();
                bVar.f127066a = new C64599o04();
                bVar.f127067b = new C64618p04();
                bVar.f127068c = "/cgi-bin/mmbiz-bin/userdata/sendsms";
                bVar.f127069d = 1762;
                bVar.f127070e = 0;
                bVar.f127071f = 0;
                C47350c a = bVar.mo72403a();
                C64599o04 o042 = (C64599o04) a.f127055a.f127080a;
                AppBrandIDCardUI appBrandIDCardUI = AppBrandIDCardUI.this;
                o042.f184605d = appBrandIDCardUI.f345442e;
                o042.f184606e = appBrandIDCardUI.f345451q;
                o042.f184607f = appBrandIDCardUI.f345453s;
                o042.f184608g = i8Var.f183634d;
                o042.f184610i = i8Var.f183636f;
                o042.f184609h = appBrandIDCardUI.f345449o.f354574s;
                int i2 = appBrandIDCardUI.f345456v;
                if ((i2 == 1 || i2 == 2) && (phoneItem = appBrandIDCardUI.f345439A) != null && !phoneItem.f245278n) {
                    o042.f184611j = Util.nullAsNil(phoneItem.f245271d);
                }
                ((C40324j) C86312j.m106911c(C40324j.class)).mo63013cp(a, new C115282j(aVar), AppBrandIDCardUI.this.theCreate());
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.autofill.t$b */
    public class C115296b implements DialogInterface.OnClickListener {
        public C115296b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C115294t.this.f345503d.f345477q.mo101694c();
        }
    }

    public C115294t(AppBrandIDCardVerifyPwdFrag appBrandIDCardVerifyPwdFrag) {
        this.f345503d = appBrandIDCardVerifyPwdFrag;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/ui/autofill/AppBrandIDCardVerifyPwdFrag$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Activity context = this.f345503d.getContext();
        C76879j.m92709C(context, this.f345503d.getString(C0966R.string.f7725pf) + this.f345503d.f345469f.f183635e, this.f345503d.getString(C0966R.string.f7722pa), this.f345503d.getString(C0966R.string.a18), this.f345503d.getString(C0966R.string.f7926wf), false, new C115295a(), new C115296b());
        C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/ui/autofill/AppBrandIDCardVerifyPwdFrag$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
