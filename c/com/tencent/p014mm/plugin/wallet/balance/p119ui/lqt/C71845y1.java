package com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt;

import android.view.MotionEvent;
import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.y1 */
public class C71845y1 implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ WalletLqtSaveFetchUI f208398d;

    public C71845y1(WalletLqtSaveFetchUI walletLqtSaveFetchUI) {
        this.f208398d = walletLqtSaveFetchUI;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtSaveFetchUI$25", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        WalletLqtSaveFetchUI walletLqtSaveFetchUI = this.f208398d;
        if (walletLqtSaveFetchUI.f208189c1) {
            walletLqtSaveFetchUI.f208189c1 = false;
            walletLqtSaveFetchUI.showNormalStWcKb();
        }
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtSaveFetchUI$25", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
