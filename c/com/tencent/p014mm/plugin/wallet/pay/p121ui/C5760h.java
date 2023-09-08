package com.tencent.p014mm.plugin.wallet.pay.p121ui;

import android.view.View;
import android.widget.CheckBox;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.wallet.pay.ui.h */
public class C5760h implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ CheckBox f21816d;

    public C5760h(WalletPayUI walletPayUI, CheckBox checkBox) {
        this.f21816d = checkBox;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/wallet/pay/ui/WalletPayUI$29", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        CheckBox checkBox = this.f21816d;
        checkBox.setChecked(!checkBox.isChecked());
        C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/pay/ui/WalletPayUI$29", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
