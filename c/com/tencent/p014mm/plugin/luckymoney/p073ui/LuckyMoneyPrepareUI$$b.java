package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.view.KeyEvent;
import android.widget.TextView;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI$$b */
public final /* synthetic */ class LuckyMoneyPrepareUI$$b implements TextView.OnEditorActionListener {

    /* renamed from: d */
    public final /* synthetic */ LuckyMoneyPrepareUI f200799d;

    public /* synthetic */ LuckyMoneyPrepareUI$$b(LuckyMoneyPrepareUI luckyMoneyPrepareUI) {
        this.f200799d = luckyMoneyPrepareUI;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        LuckyMoneyPrepareUI luckyMoneyPrepareUI = this.f200799d;
        String str = LuckyMoneyPrepareUI.f200649T1;
        luckyMoneyPrepareUI.getClass();
        if (keyEvent != null && keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 66) {
            luckyMoneyPrepareUI.f200651A1.mo104741f();
        }
        return true;
    }
}
