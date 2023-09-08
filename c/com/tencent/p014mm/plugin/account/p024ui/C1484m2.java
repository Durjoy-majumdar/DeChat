package com.tencent.p014mm.plugin.account.p024ui;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import j20.C117292a;
import java.util.ArrayList;
import nc0.C76850a;
import qg0.C12215a;

/* renamed from: com.tencent.mm.plugin.account.ui.m2 */
public class C1484m2 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ RegAffiliateAccountUI f10830d;

    public C1484m2(RegAffiliateAccountUI regAffiliateAccountUI) {
        this.f10830d = regAffiliateAccountUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/account/ui/RegAffiliateAccountUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        RegAffiliateAccountUI regAffiliateAccountUI = this.f10830d;
        String e = C76850a.m92633e(regAffiliateAccountUI, "CN", regAffiliateAccountUI.getString(C0966R.string.bvs));
        RegAffiliateAccountUI regAffiliateAccountUI2 = this.f10830d;
        C12215a.m11778c(regAffiliateAccountUI2, regAffiliateAccountUI2.getString(C0966R.string.f361485k83, new Object[]{LocaleUtil.getApplicationLanguage(), e}), 0, false);
        C117292a.m165361g(this, "com/tencent/mm/plugin/account/ui/RegAffiliateAccountUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
