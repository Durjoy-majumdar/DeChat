package com.tencent.p014mm.plugin.account.p024ui;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.report.service.C115669n;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;

/* renamed from: com.tencent.mm.plugin.account.ui.MobileInputUI$$m */
public class MobileInputUI$$m implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ MobileInputUI f10740d;

    public MobileInputUI$$m(MobileInputUI mobileInputUI) {
        this.f10740d = mobileInputUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/account/ui/MobileInputUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C88144b.m109789g(this.f10740d, "login_exdevice", ".ui.LoginAsExDeviceUI");
        this.f10740d.overridePendingTransition(C0966R.C0968anim.f2468ds, C0966R.C0968anim.f2333y);
        C115669n.INSTANCE.mo175904A(1570, 3);
        C117292a.m165361g(this, "com/tencent/mm/plugin/account/ui/MobileInputUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
