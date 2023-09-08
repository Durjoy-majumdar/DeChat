package com.tencent.p014mm.plugin.ipcall.p065ui;

import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.report.service.C115669n;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.f */
public class C105407f implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C105394b f313375d;

    public C105407f(C105394b bVar) {
        this.f313375d = bVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/ipcall/ui/DialPadController$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C115669n.INSTANCE.mo160131h(12061, 0, 0, 0, 1, 0, 0);
        String replace = this.f313375d.f313338c.getText().toString().replace("+", "");
        Intent intent = new Intent(this.f313375d.f313346k, IPCallCountryCodeSelectUI.class);
        intent.putExtra("couttry_code", replace);
        intent.putExtra("CountryCodeUI_isShowCountryCode", true);
        this.f313375d.f313346k.startActivityForResult(intent, 100);
        this.f313375d.f313346k.overridePendingTransition(C0966R.C0968anim.f2471dv, -1);
        C117292a.m165361g(this, "com/tencent/mm/plugin/ipcall/ui/DialPadController$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
