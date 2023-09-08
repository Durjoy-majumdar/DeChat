package com.tencent.p014mm.plugin.account.p024ui;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.account.ui.y */
public class C1494y implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ LoginByMobileSendSmsUI f10847d;

    public C1494y(LoginByMobileSendSmsUI loginByMobileSendSmsUI) {
        this.f10847d = loginByMobileSendSmsUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/account/ui/LoginByMobileSendSmsUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SENDTO");
        intent.setData(Uri.parse("smsto:" + this.f10847d.f344477f));
        intent.putExtra("sms_body", this.f10847d.f344476e);
        try {
            LoginByMobileSendSmsUI loginByMobileSendSmsUI = this.f10847d;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(loginByMobileSendSmsUI, aVar.mo10232b(), "com/tencent/mm/plugin/account/ui/LoginByMobileSendSmsUI$3", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            loginByMobileSendSmsUI.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(loginByMobileSendSmsUI, "com/tencent/mm/plugin/account/ui/LoginByMobileSendSmsUI$3", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            this.f10847d.overridePendingTransition(C0966R.C0968anim.f2503er, C0966R.C0968anim.f2498em);
        } catch (Exception e) {
            Log.m105920e("MicroMsg.LoginByMobileSendSmsUI", e.getMessage());
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/account/ui/LoginByMobileSendSmsUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
