package com.tencent.p014mm.plugin.wallet_core.p125ui.view;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.wallet_core.p125ui.view.WalletAwardShakeAnimView;
import com.tencent.p014mm.sdk.platformtools.PlaySound;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.view.a */
public class C72462a implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ WalletAwardShakeAnimView f210808d;

    public C72462a(WalletAwardShakeAnimView walletAwardShakeAnimView) {
        this.f210808d = walletAwardShakeAnimView;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/wallet_core/ui/view/WalletAwardShakeAnimView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        WalletAwardShakeAnimView walletAwardShakeAnimView = this.f210808d;
        if (!walletAwardShakeAnimView.f210717i) {
            walletAwardShakeAnimView.f210717i = true;
            PlaySound.play(walletAwardShakeAnimView.getContext(), C0966R.string.j5q);
            this.f210808d.mo99804b();
            WalletAwardShakeAnimView.C72444c cVar = this.f210808d.f210723r;
            if (cVar != null) {
                ((C72468g) cVar).mo99875a(false);
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/ui/view/WalletAwardShakeAnimView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
