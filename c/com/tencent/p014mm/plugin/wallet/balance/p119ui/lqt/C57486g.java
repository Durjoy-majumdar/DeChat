package com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt;

import android.text.format.DateFormat;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt.WalletKnowLqtFullScreenVideoUI;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import fy3.C32224a;
import gy3.C87413o;
import java.util.regex.Pattern;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.g */
public final class C57486g extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ WalletKnowLqtFullScreenVideoUI f164699d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C57486g(WalletKnowLqtFullScreenVideoUI walletKnowLqtFullScreenVideoUI) {
        super(0);
        this.f164699d = walletKnowLqtFullScreenVideoUI;
    }

    public Object invoke() {
        WalletKnowLqtFullScreenVideoUI.C57479a aVar = this.f164699d.f164680d;
        if (aVar != null) {
            long totalLength = aVar.getTotalLength();
            WalletKnowLqtFullScreenVideoUI walletKnowLqtFullScreenVideoUI = this.f164699d;
            TextView textView = walletKnowLqtFullScreenVideoUI.f164685i;
            if (textView != null) {
                String string = walletKnowLqtFullScreenVideoUI.getContext().getString(C0966R.string.n3i);
                Pattern pattern = C75228t.f221346a;
                textView.setText(DateFormat.format(string, totalLength).toString());
            }
        }
        return C13598b0.f38549a;
    }
}
