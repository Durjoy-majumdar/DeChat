package com.tencent.p014mm.plugin.wallet_core.p125ui;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.k0 */
public class C5808k0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ String f21954d;

    /* renamed from: e */
    public final /* synthetic */ String f21955e;

    /* renamed from: f */
    public final /* synthetic */ int f21956f;

    /* renamed from: g */
    public final /* synthetic */ WalletOrderInfoNewUI f21957g;

    public C5808k0(WalletOrderInfoNewUI walletOrderInfoNewUI, String str, String str2, int i) {
        this.f21957g = walletOrderInfoNewUI;
        this.f21954d = str;
        this.f21955e = str2;
        this.f21956f = i;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/wallet_core/ui/WalletOrderInfoNewUI$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105925i("MicroMsg.WalletOrderInfoNewUI", "leadViewInfo click app username：%s，path：%s，version：%s ,mTransactionId：%s", this.f21954d, this.f21955e, Integer.valueOf(this.f21956f), this.f21957g.f210138p);
        C75228t.m90224Q(this.f21954d, this.f21955e, this.f21956f, 8);
        C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/ui/WalletOrderInfoNewUI$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
