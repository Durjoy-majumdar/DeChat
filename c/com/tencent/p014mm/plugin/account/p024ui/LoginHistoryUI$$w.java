package com.tencent.p014mm.plugin.account.p024ui;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.account.ui.LoginHistoryUI$$w */
public class LoginHistoryUI$$w implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ LoginHistoryUI f10692d;

    public LoginHistoryUI$$w(LoginHistoryUI loginHistoryUI) {
        this.f10692d = loginHistoryUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/account/ui/LoginHistoryUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        LoginHistoryUI.m161830R7(this.f10692d, this.f10692d.getString(C0966R.string.f26, new Object[]{LocaleUtil.getApplicationLanguage()}));
        C117292a.m165361g(this, "com/tencent/mm/plugin/account/ui/LoginHistoryUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
