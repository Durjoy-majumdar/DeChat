package com.tencent.p014mm.plugin.appbrand.p026ui.autofill;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import com.tencent.p014mm.plugin.appbrand.p026ui.autofill.AppBrandIDCardUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import qo3.C77407n;
import te3.C64439i8;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.autofill.s */
public class C115291s implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ AppBrandIDCardVerifyPwdFrag f345500d;

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.autofill.s$a */
    public class C115292a implements C11182m0 {
        public C115292a() {
        }

        public void onCreateMMMenu(C76874e0 e0Var) {
            Log.m105925i("MicroMsg.AppBrandIDCardVerifyPwdFrag", "phone_list.size %d", Integer.valueOf(C115291s.this.f345500d.f345468e.f183767f.size()));
            Iterator<C64439i8> it = C115291s.this.f345500d.f345468e.f183767f.iterator();
            while (it.hasNext()) {
                C64439i8 next = it.next();
                if (Util.isNullOrNil(next.f183634d) || Util.isNullOrNil(next.f183635e)) {
                    Log.m105920e("MicroMsg.AppBrandIDCardVerifyPwdFrag", "phone_id or show_phone is empty, continue");
                } else {
                    e0Var.mo107142f(C115291s.this.f345500d.f345468e.f183767f.indexOf(next), next.f183635e);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.autofill.s$b */
    public class C115293b implements C11184p0 {
        public C115293b() {
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            C64439i8 i8Var = C115291s.this.f345500d.f345468e.f183767f.get(menuItem.getItemId());
            if (i8Var == null) {
                Log.m105921e("MicroMsg.AppBrandIDCardVerifyPwdFrag", "not find phone_id, menuItem id :%d", Integer.valueOf(menuItem.getItemId()));
                return;
            }
            Log.m105925i("MicroMsg.AppBrandIDCardVerifyPwdFrag", "select menuItem id:%d, phone_id:%s, show_phone:%s, bank_type:%s", Integer.valueOf(menuItem.getItemId()), i8Var.f183634d, i8Var.f183635e, i8Var.f183636f);
            AppBrandIDCardVerifyPwdFrag appBrandIDCardVerifyPwdFrag = C115291s.this.f345500d;
            appBrandIDCardVerifyPwdFrag.f345469f = i8Var;
            appBrandIDCardVerifyPwdFrag.f345474n.setText(i8Var.f183635e);
        }
    }

    public C115291s(AppBrandIDCardVerifyPwdFrag appBrandIDCardVerifyPwdFrag) {
        this.f345500d = appBrandIDCardVerifyPwdFrag;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/ui/autofill/AppBrandIDCardVerifyPwdFrag$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        AppBrandIDCardUI.C115272d dVar = this.f345500d.f345467d;
        if (dVar != null) {
            AppBrandIDCardUI.C115267a aVar = (AppBrandIDCardUI.C115267a) dVar;
            aVar.getClass();
            C115669n.INSTANCE.mo160131h(14943, AppBrandIDCardUI.this.f345442e, 6, AppBrandIDCardUI.this.f345449o.f354574s);
        }
        C77407n nVar = new C77407n((Context) this.f345500d.getContext(), 1, false);
        nVar.f225771i = new C115292a();
        nVar.f225782p = new C115293b();
        nVar.mo107573q();
        C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/ui/autofill/AppBrandIDCardVerifyPwdFrag$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
