package com.tencent.p014mm.plugin.account.p024ui;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.account.ui.LoginUI$$u */
public class LoginUI$$u implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ LoginUI f10709d;

    public LoginUI$$u(LoginUI loginUI) {
        this.f10709d = loginUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/account/ui/LoginUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        LoginUI.m161848L7(this.f10709d, this.f10709d.getString(C0966R.string.f26, new Object[]{LocaleUtil.getApplicationLanguage()}));
        C117292a.m165361g(this, "com/tencent/mm/plugin/account/ui/LoginUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
