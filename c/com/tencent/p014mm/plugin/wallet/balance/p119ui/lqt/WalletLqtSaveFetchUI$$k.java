package com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt;

import android.view.MotionEvent;
import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI$$k */
public class WalletLqtSaveFetchUI$$k implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ WalletLqtSaveFetchUI f208258d;

    public WalletLqtSaveFetchUI$$k(WalletLqtSaveFetchUI walletLqtSaveFetchUI) {
        this.f208258d = walletLqtSaveFetchUI;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtSaveFetchUI$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        this.f208258d.handleKeyboardTouchEvent(motionEvent);
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtSaveFetchUI$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
