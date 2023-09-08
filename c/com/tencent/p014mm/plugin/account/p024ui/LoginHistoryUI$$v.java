package com.tencent.p014mm.plugin.account.p024ui;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.account.ui.LoginHistoryUI$$v */
public class LoginHistoryUI$$v implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ LoginHistoryUI f10691d;

    public LoginHistoryUI$$v(LoginHistoryUI loginHistoryUI) {
        this.f10691d = loginHistoryUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/account/ui/LoginHistoryUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        LoginHistoryUI.m161830R7(this.f10691d, this.f10691d.getString(C0966R.string.gcz) + LocaleUtil.getApplicationLanguage());
        C117292a.m165361g(this, "com/tencent/mm/plugin/account/ui/LoginHistoryUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
