package com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt;

import android.content.Intent;
import android.view.View;
import di3.C86312j;
import ht1.C60200t1;
import j20.C117292a;
import java.util.ArrayList;
import o40.C61926c;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.y */
public class C57494y implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ WalletLqtDetailUI f164712d;

    public C57494y(WalletLqtDetailUI walletLqtDetailUI) {
        this.f164712d = walletLqtDetailUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$34", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Intent intent = new Intent();
        intent.putExtra("feed_object_id", C61926c.m72671P(this.f164712d.f207962f.f228708R.f185006j.f183980e));
        intent.putExtra("feed_object_nonceId", this.f164712d.f207962f.f228708R.f185006j.f183981f);
        intent.putExtra("key_comment_scene", 1);
        intent.putExtra("tab_type", 1001);
        ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76864nr(this.f164712d.getContext(), intent);
        C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$34", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
