package com.tencent.p014mm.plugin.luckymoney.f2f.p072ui;

import android.animation.ValueAnimator;
import android.view.View;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.luckymoney.f2f.ui.c */
public class C105450c implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ LuckyMoneyF2FQRCodeUI f313527d;

    public C105450c(LuckyMoneyF2FQRCodeUI luckyMoneyF2FQRCodeUI) {
        this.f313527d = luckyMoneyF2FQRCodeUI;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        LuckyMoneyF2FQRCodeUI luckyMoneyF2FQRCodeUI = this.f313527d;
        luckyMoneyF2FQRCodeUI.f53042i.setTranslationY(-0.5f * floatValue * ((float) luckyMoneyF2FQRCodeUI.f53019Q.heightPixels));
        View view = this.f313527d.f53008E;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf(1.0f - floatValue));
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/f2f/ui/LuckyMoneyF2FQRCodeUI$14", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/luckymoney/f2f/ui/LuckyMoneyF2FQRCodeUI$14", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        if (floatValue == 1.0f) {
            View view2 = this.f313527d.f53042i;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(8);
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/luckymoney/f2f/ui/LuckyMoneyF2FQRCodeUI$14", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/luckymoney/f2f/ui/LuckyMoneyF2FQRCodeUI$14", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f313527d.f53042i.setTranslationY(0.0f);
            this.f313527d.mo23902K7();
            this.f313527d.f53054w.notifyDataSetChanged();
            this.f313527d.f53050s.mo153449j(0);
        }
    }
}
