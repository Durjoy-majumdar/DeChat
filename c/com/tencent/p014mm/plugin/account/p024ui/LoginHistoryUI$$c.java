package com.tencent.p014mm.plugin.account.p024ui;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.account.ui.LoginHistoryUI$$c */
public class LoginHistoryUI$$c implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ LoginHistoryUI f10687d;

    public LoginHistoryUI$$c(LoginHistoryUI loginHistoryUI) {
        this.f10687d = loginHistoryUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/account/ui/LoginHistoryUI$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        LoginHistoryUI loginHistoryUI = this.f10687d;
        LoginHistoryUI.m161830R7(loginHistoryUI, this.f10687d.getString(C0966R.string.liq) + LocaleUtil.getApplicationLanguage());
        C117292a.m165361g(this, "com/tencent/mm/plugin/account/ui/LoginHistoryUI$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
