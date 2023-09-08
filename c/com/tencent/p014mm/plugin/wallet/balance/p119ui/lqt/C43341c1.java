package com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt;

import android.animation.ValueAnimator;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.c1 */
public class C43341c1 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ float f117207d;

    /* renamed from: e */
    public final /* synthetic */ float f117208e;

    /* renamed from: f */
    public final /* synthetic */ WalletLqtPlanAddUI f117209f;

    public C43341c1(WalletLqtPlanAddUI walletLqtPlanAddUI, float f, float f2) {
        this.f117209f = walletLqtPlanAddUI;
        this.f117207d = f;
        this.f117208e = f2;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        int abs = (int) Math.abs(((Float) valueAnimator.getAnimatedValue()).floatValue());
        float f = (float) abs;
        float f2 = this.f117207d;
        if (f >= f2) {
            float f3 = this.f117208e;
            if (f <= f3) {
                WalletLqtPlanAddUI walletLqtPlanAddUI = this.f117209f;
                walletLqtPlanAddUI.f207998D = true;
                float f4 = (f - f2) / (f3 - f2);
                walletLqtPlanAddUI.setTitleAlpha(f4);
                Log.m105919d("MicroMsg.WalletLqtPlanAddUI", "onAnimationUpdate alpha:%s", Float.valueOf(f4));
                Log.m105919d("MicroMsg.WalletLqtPlanAddUI", "downMoveAnimator onAnimationUpdate() translationY:%s", Integer.valueOf(abs));
            }
        }
        WalletLqtPlanAddUI walletLqtPlanAddUI2 = this.f117209f;
        if (walletLqtPlanAddUI2.f207998D) {
            walletLqtPlanAddUI2.setTitleAlpha(0.0f);
            this.f117209f.setMMTitle("");
        }
        this.f117209f.f207998D = false;
        Log.m105919d("MicroMsg.WalletLqtPlanAddUI", "downMoveAnimator onAnimationUpdate() translationY:%s", Integer.valueOf(abs));
    }
}
