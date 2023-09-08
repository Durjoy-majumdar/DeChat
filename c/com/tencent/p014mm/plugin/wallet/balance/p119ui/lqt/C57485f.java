package com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt;

import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt.WalletKnowLqtFullScreenVideoUI;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.f */
public final class C57485f extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ WalletKnowLqtFullScreenVideoUI f164698d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C57485f(WalletKnowLqtFullScreenVideoUI walletKnowLqtFullScreenVideoUI) {
        super(0);
        this.f164698d = walletKnowLqtFullScreenVideoUI;
    }

    public Object invoke() {
        WalletKnowLqtFullScreenVideoUI.C57479a aVar = this.f164698d.f164680d;
        if (aVar != null) {
            aVar.mo24000p();
        }
        WalletKnowLqtFullScreenVideoUI walletKnowLqtFullScreenVideoUI = this.f164698d;
        ImageView imageView = walletKnowLqtFullScreenVideoUI.f164683g;
        if (imageView != null) {
            imageView.setImageDrawable(walletKnowLqtFullScreenVideoUI.getResources().getDrawable(C0966R.C0969drawable.cnn));
        }
        return C13598b0.f38549a;
    }
}
