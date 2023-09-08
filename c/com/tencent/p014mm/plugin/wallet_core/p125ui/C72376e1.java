package com.tencent.p014mm.plugin.wallet_core.p125ui;

import android.content.DialogInterface;
import android.view.View;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wallet.pay.p121ui.WalletPayCustomUI;
import com.tencent.p014mm.plugin.wallet_core.p125ui.C72338c1;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.e1 */
public class C72376e1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ DialogInterface.OnCancelListener f210527d;

    /* renamed from: e */
    public final /* synthetic */ C72338c1 f210528e;

    public C72376e1(C72338c1 c1Var, DialogInterface.OnCancelListener onCancelListener) {
        this.f210528e = c1Var;
        this.f210527d = onCancelListener;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/wallet_core/ui/WalletPwdCustomDialog$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        DialogInterface.OnCancelListener onCancelListener = this.f210527d;
        if (onCancelListener != null) {
            onCancelListener.onCancel((DialogInterface) null);
        }
        C72338c1.C72344c cVar = this.f210528e.f210383w;
        if (cVar != null) {
            WalletPayCustomUI.this.finish();
        }
        this.f210528e.cancel();
        if (this.f210528e.f210353A.isShown()) {
            C115669n.INSTANCE.mo160131h(11977, 1, 0, 1, 0, 0, 0);
        } else {
            C115669n.INSTANCE.mo160131h(11977, 0, 0, 1, 0, 0, 0);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/ui/WalletPwdCustomDialog$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
