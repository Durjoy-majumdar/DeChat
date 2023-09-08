package com.tencent.p014mm.plugin.wallet.bind.p120ui;

import android.view.View;
import b63.C67184f;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardManageUI$$d */
public class WalletBankcardManageUI$$d implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C67184f f208468d;

    /* renamed from: e */
    public final /* synthetic */ WalletBankcardManageUI f208469e;

    public WalletBankcardManageUI$$d(WalletBankcardManageUI walletBankcardManageUI, C67184f fVar) {
        this.f208469e = walletBankcardManageUI;
        this.f208468d = fVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/wallet/bind/ui/WalletBankcardManageUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (!Util.isNullOrNil(this.f208468d.f192884b)) {
            C75228t.m90221N(this.f208469e.getContext(), this.f208468d.f192884b, false);
            C115669n.INSTANCE.mo160131h(14422, 6);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/bind/ui/WalletBankcardManageUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
