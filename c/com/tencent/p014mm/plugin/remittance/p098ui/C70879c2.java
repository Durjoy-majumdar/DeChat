package com.tencent.p014mm.plugin.remittance.p098ui;

import android.view.MotionEvent;
import android.view.View;
import com.tencent.p014mm.wallet_core.keyboard.WcPayKeyboard;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.remittance.ui.c2 */
public class C70879c2 implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ boolean f205289d;

    /* renamed from: e */
    public final /* synthetic */ WalletMerchantPayUI f205290e;

    public C70879c2(WalletMerchantPayUI walletMerchantPayUI, boolean z) {
        this.f205290e = walletMerchantPayUI;
        this.f205289d = z;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/remittance/ui/WalletMerchantPayUI$20", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (this.f205289d) {
            this.f205290e.handleKeyboardTouchEvent(motionEvent);
        } else {
            WalletMerchantPayUI walletMerchantPayUI = this.f205290e;
            int i = WalletMerchantPayUI.f205217X;
            WcPayKeyboard wcPayKeyboard = walletMerchantPayUI.mWcKeyboard;
            if (wcPayKeyboard != null && wcPayKeyboard.isShown() && this.f205290e.mWcKeyboard.mo104748l()) {
                this.f205290e.mWcKeyboard.mo104741f();
            }
        }
        this.f205290e.hideTenpayKB();
        this.f205290e.hideVKB();
        this.f205290e.f205244h.getContentEt().clearFocus();
        WalletMerchantPayUI walletMerchantPayUI2 = this.f205290e;
        if (walletMerchantPayUI2.f205251r) {
            walletMerchantPayUI2.f205250q.clearFocus();
        }
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/remittance/ui/WalletMerchantPayUI$20", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
