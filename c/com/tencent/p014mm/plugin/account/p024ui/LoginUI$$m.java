package com.tencent.p014mm.plugin.account.p024ui;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.report.service.C115669n;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;

/* renamed from: com.tencent.mm.plugin.account.ui.LoginUI$$m */
public class LoginUI$$m implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ LoginUI f10706d;

    public LoginUI$$m(LoginUI loginUI) {
        this.f10706d = loginUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/account/ui/LoginUI$20", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C88144b.m109789g(this.f10706d, "login_exdevice", ".ui.LoginAsExDeviceUI");
        this.f10706d.overridePendingTransition(C0966R.C0968anim.f2468ds, C0966R.C0968anim.f2333y);
        C115669n.INSTANCE.mo175904A(1570, 2);
        C117292a.m165361g(this, "com/tencent/mm/plugin/account/ui/LoginUI$20", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
