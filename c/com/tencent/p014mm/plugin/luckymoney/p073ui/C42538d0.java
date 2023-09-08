package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.util.DisplayMetrics;
import android.widget.LinearLayout;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.d0 */
public class C42538d0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ LuckyMoneyDetailUI f115092d;

    public C42538d0(LuckyMoneyDetailUI luckyMoneyDetailUI) {
        this.f115092d = luckyMoneyDetailUI;
    }

    public void run() {
        LuckyMoneyDetailUI luckyMoneyDetailUI = this.f115092d;
        int i = LuckyMoneyDetailUI.f199792r2;
        luckyMoneyDetailUI.getClass();
        new DisplayMetrics();
        DisplayMetrics displayMetrics = luckyMoneyDetailUI.getResources().getDisplayMetrics();
        if (displayMetrics != null) {
            int i2 = displayMetrics.widthPixels;
            double d = ((double) i2) / 750.0d;
            int i3 = (int) (240.0d * d);
            Log.m105925i("MicroMsg.LuckyMoneyDetailUI", "hy: screen  width: %d, scale : %f, fixedHeight: %d", Integer.valueOf(i2), Double.valueOf(d), Integer.valueOf(i3));
            luckyMoneyDetailUI.f199803F.setLayoutParams(new LinearLayout.LayoutParams(luckyMoneyDetailUI.f199803F.getLayoutParams().width, i3));
        }
        this.f115092d.f199803F.setVisibility(0);
    }
}
