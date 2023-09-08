package com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt;

import android.animation.ValueAnimator;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.a1 */
public class C43336a1 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ float f117197d;

    /* renamed from: e */
    public final /* synthetic */ float f117198e;

    /* renamed from: f */
    public final /* synthetic */ WalletLqtPlanAddUI f117199f;

    public C43336a1(WalletLqtPlanAddUI walletLqtPlanAddUI, float f, float f2) {
        this.f117199f = walletLqtPlanAddUI;
        this.f117197d = f;
        this.f117198e = f2;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        int abs = (int) Math.abs(((Float) valueAnimator.getAnimatedValue()).floatValue());
        float f = (float) abs;
        if (f < this.f117197d || f > this.f117198e) {
            WalletLqtPlanAddUI walletLqtPlanAddUI = this.f117199f;
            if (walletLqtPlanAddUI.f207998D) {
                walletLqtPlanAddUI.setActionbarColor(walletLqtPlanAddUI.getResources().getColor(C0966R.color.al6));
            }
            this.f117199f.f207998D = false;
        } else {
            WalletLqtPlanAddUI walletLqtPlanAddUI2 = this.f117199f;
            if (!walletLqtPlanAddUI2.f207998D) {
                walletLqtPlanAddUI2.setTitleAlpha(0.0f);
                this.f117199f.setMMTitle(Util.isNullOrNil(this.f117199f.f207999E) ? this.f117199f.getString(C0966R.string.kyn) : this.f117199f.f207999E);
            }
            WalletLqtPlanAddUI walletLqtPlanAddUI3 = this.f117199f;
            walletLqtPlanAddUI3.f207998D = true;
            float f2 = this.f117197d;
            float f3 = (f - f2) / (this.f117198e - f2);
            walletLqtPlanAddUI3.setTitleAlpha(f3);
            Log.m105919d("MicroMsg.WalletLqtPlanAddUI", "onAnimationUpdate alpha:%s", Float.valueOf(f3));
        }
        Log.m105919d("MicroMsg.WalletLqtPlanAddUI", "upMoveAnimator onAnimationUpdate() translationY:%s", Integer.valueOf(abs));
    }
}
