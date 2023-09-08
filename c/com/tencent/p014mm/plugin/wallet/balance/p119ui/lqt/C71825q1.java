package com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt;

import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.plugin.wallet.balance.model.lqt.CgiLqtPlanOrderList;
import com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt.WalletLqtPlanHomeUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import te3.C78017yd3;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.q1 */
public class C71825q1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C78017yd3 f208368d;

    /* renamed from: e */
    public final /* synthetic */ WalletLqtPlanHomeUI.C71756g f208369e;

    public C71825q1(WalletLqtPlanHomeUI.C71756g gVar, C78017yd3 yd32) {
        this.f208369e = gVar;
        this.f208368d = yd32;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtPlanHomeUI$ViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        WalletLqtPlanHomeUI walletLqtPlanHomeUI = WalletLqtPlanHomeUI.this;
        C78017yd3 yd32 = this.f208368d;
        int i = WalletLqtPlanHomeUI.f208085s;
        walletLqtPlanHomeUI.getClass();
        Log.m105924i("MicroMsg.WalletLqtPlanHomeUI", "go to Plan DetailUI");
        Intent intent = new Intent(walletLqtPlanHomeUI, WalletLqtPlanDetailUI.class);
        intent.putExtra("key_plan_item_detail", CgiLqtPlanOrderList.m84100l(yd32));
        walletLqtPlanHomeUI.startActivityForResult(intent, 5);
        C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtPlanHomeUI$ViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
