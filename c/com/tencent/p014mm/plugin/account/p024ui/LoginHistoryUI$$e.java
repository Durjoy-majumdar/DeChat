package com.tencent.p014mm.plugin.account.p024ui;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.report.service.C115669n;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;

/* renamed from: com.tencent.mm.plugin.account.ui.LoginHistoryUI$$e */
public class LoginHistoryUI$$e implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ LoginHistoryUI f10689d;

    public LoginHistoryUI$$e(LoginHistoryUI loginHistoryUI) {
        this.f10689d = loginHistoryUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/account/ui/LoginHistoryUI$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C88144b.m109789g(this.f10689d, "login_exdevice", ".ui.LoginAsExDeviceUI");
        this.f10689d.overridePendingTransition(C0966R.C0968anim.f2468ds, C0966R.C0968anim.f2333y);
        C115669n.INSTANCE.mo175904A(1570, 4);
        C117292a.m165361g(this, "com/tencent/mm/plugin/account/ui/LoginHistoryUI$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
