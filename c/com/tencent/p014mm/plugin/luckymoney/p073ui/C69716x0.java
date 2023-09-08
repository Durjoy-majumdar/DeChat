package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.content.DialogInterface;
import android.os.Build;
import android.view.View;
import com.tencent.p014mm.p136ui.C85875k4;
import qo3.C77390c0;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.x0 */
public class C69716x0 implements DialogInterface.OnShowListener {

    /* renamed from: d */
    public final /* synthetic */ C77390c0 f201136d;

    public C69716x0(LuckyMoneyHistoryEnvelopeUI luckyMoneyHistoryEnvelopeUI, C77390c0 c0Var) {
        this.f201136d = c0Var;
    }

    public void onShow(DialogInterface dialogInterface) {
        if (Build.VERSION.SDK_INT >= 23) {
            View decorView = this.f201136d.getWindow().getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(C85875k4.m106211z() ? systemUiVisibility & -8193 : systemUiVisibility | 8192);
        }
    }
}
