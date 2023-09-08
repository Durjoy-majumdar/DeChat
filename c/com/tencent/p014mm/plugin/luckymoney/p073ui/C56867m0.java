package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.view.ViewGroup;
import com.tencent.p014mm.p136ui.C75044y4;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.m0 */
public class C56867m0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ LuckyMoneyDetailUI f162911d;

    public C56867m0(LuckyMoneyDetailUI luckyMoneyDetailUI) {
        this.f162911d = luckyMoneyDetailUI;
    }

    public void run() {
        int f = C75044y4.m89994f(this.f162911d.getContext());
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f162911d.f199806G1.getLayoutParams();
        marginLayoutParams.topMargin = f;
        this.f162911d.f199806G1.setLayoutParams(marginLayoutParams);
    }
}
