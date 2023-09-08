package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.view.View;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.d5 */
public class C69582d5 implements View.OnFocusChangeListener {

    /* renamed from: d */
    public final /* synthetic */ LuckyMoneyTextInputView f200893d;

    public C69582d5(LuckyMoneyTextInputView luckyMoneyTextInputView) {
        this.f200893d = luckyMoneyTextInputView;
    }

    public void onFocusChange(View view, boolean z) {
        LuckyMoneyTextInputView luckyMoneyTextInputView = this.f200893d;
        C69727y2 y2Var = luckyMoneyTextInputView.f200812i;
        if (y2Var != null) {
            y2Var.mo95263Q(true, luckyMoneyTextInputView.getInputViewId());
        }
    }
}
