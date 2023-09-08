package com.tencent.p014mm.plugin.wallet_core.p125ui;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.j0 */
public class C5807j0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ String f21952d;

    /* renamed from: e */
    public final /* synthetic */ WalletOrderInfoNewUI f21953e;

    public C5807j0(WalletOrderInfoNewUI walletOrderInfoNewUI, String str) {
        this.f21953e = walletOrderInfoNewUI;
        this.f21952d = str;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/wallet_core/ui/WalletOrderInfoNewUI$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105925i("MicroMsg.WalletOrderInfoNewUI", "leadViewInfo h5 url：%s，mTransactionId：%s", this.f21952d, this.f21953e.f210138p);
        C75228t.m90221N(this.f21953e, this.f21952d, true);
        C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/ui/WalletOrderInfoNewUI$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
