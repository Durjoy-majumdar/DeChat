package com.tencent.p014mm.plugin.wallet.balance.p119ui;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import p286zl.C16292g;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.m */
public class C71847m implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ Context f208400d;

    /* renamed from: e */
    public final /* synthetic */ String f208401e;

    /* renamed from: f */
    public final /* synthetic */ Dialog f208402f;

    public C71847m(WalletBalanceFetchUI walletBalanceFetchUI, Context context, String str, Dialog dialog) {
        this.f208400d = context;
        this.f208401e = str;
        this.f208402f = dialog;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/wallet/balance/ui/WalletBalanceFetchUI$31", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105924i("MicroMsg.WalletBalanceFetchUI", "showIdentifyInfoCompleteDialog completeBtn click");
        ((C16292g) C86312j.m106911c(C16292g.class)).nr0(this.f208400d, this.f208401e, 2, true);
        Dialog dialog = this.f208402f;
        if (dialog != null && dialog.isShowing()) {
            this.f208402f.dismiss();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/balance/ui/WalletBalanceFetchUI$31", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
