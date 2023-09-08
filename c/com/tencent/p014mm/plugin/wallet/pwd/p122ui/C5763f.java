package com.tencent.p014mm.plugin.wallet.pwd.p122ui;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.f */
public class C5763f implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ WalletForgotPwdVerifyIdUI f21827d;

    public C5763f(WalletForgotPwdVerifyIdUI walletForgotPwdVerifyIdUI) {
        this.f21827d = walletForgotPwdVerifyIdUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/wallet/pwd/ui/WalletForgotPwdVerifyIdUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        WalletForgotPwdVerifyIdUI walletForgotPwdVerifyIdUI = this.f21827d;
        C75228t.m90219L(walletForgotPwdVerifyIdUI, HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.fls) + "/touch/scene_product.html?scene_id=kf3258", false);
        C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/pwd/ui/WalletForgotPwdVerifyIdUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
