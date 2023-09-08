package com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt;

import android.content.Intent;
import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.w */
public class C57493w implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ WalletLqtDetailUI f164711d;

    public C57493w(WalletLqtDetailUI walletLqtDetailUI) {
        this.f164711d = walletLqtDetailUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$32", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Intent intent = new Intent(this.f164711d.getContext(), WalletKnowLqtFullScreenVideoUI.class);
        intent.putExtra("videoUrl", this.f164711d.f207962f.f228708R.f185005i.f143953e);
        this.f164711d.startActivityForResult(intent);
        C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$32", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
