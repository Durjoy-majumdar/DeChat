package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.view.View;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.luckymoney.model.C69209e1;
import com.tencent.p014mm.plugin.luckymoney.model.C69218g1;
import com.tencent.xweb.IXWebBroadcastListener;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUIV2$$i */
public class LuckyMoneyNewYearReceiveUIV2$$i implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f200187d;

    /* renamed from: e */
    public final /* synthetic */ LuckyMoneyNewYearReceiveUIV2 f200188e;

    public LuckyMoneyNewYearReceiveUIV2$$i(LuckyMoneyNewYearReceiveUIV2 luckyMoneyNewYearReceiveUIV2, int i) {
        this.f200188e = luckyMoneyNewYearReceiveUIV2;
        this.f200187d = i;
    }

    public void run() {
        int i = this.f200187d;
        if (i == 0) {
            View view = this.f200188e.f200109F;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUIV2$23", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUIV2$23", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f200188e.f200108E.setVisibility(0);
            this.f200188e.mo95628P7();
        } else if (i == 1) {
            View view3 = this.f200188e.f200109F;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUIV2$23", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUIV2$23", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f200188e.f200108E.setVisibility(8);
            View view5 = this.f200188e.f200119Q;
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(0);
            View view6 = view5;
            C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUIV2$23", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view6, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUIV2$23", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f200188e.f200121R.setVisibility(0);
            LuckyMoneyNewYearReceiveUIV2 luckyMoneyNewYearReceiveUIV2 = this.f200188e;
            luckyMoneyNewYearReceiveUIV2.f200121R.post(new C69713w1(luckyMoneyNewYearReceiveUIV2, IXWebBroadcastListener.STAGE_START));
        } else if (i == 2) {
            View view7 = this.f200188e.f200109F;
            C9556a aVar4 = new C9556a();
            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
            aVar4.mo10233c(0);
            View view8 = view7;
            C117292a.m165358d(view8, aVar4.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUIV2$23", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view7.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view8, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUIV2$23", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f200188e.f200108E.setVisibility(8);
            this.f200188e.mo95628P7();
            LuckyMoneyNewYearReceiveUIV2.m81813K7(this.f200188e);
        } else if (i == 3) {
            View view9 = this.f200188e.f200109F;
            C9556a aVar5 = new C9556a();
            ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
            aVar5.mo10233c(0);
            View view10 = view9;
            C117292a.m165358d(view10, aVar5.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUIV2$23", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view9.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
            C117292a.m165359e(view10, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUIV2$23", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f200188e.f200108E.setVisibility(8);
            this.f200188e.f200110G.setVisibility(8);
            this.f200188e.f200167v.setVisibility(0);
            this.f200188e.f200168w.setImageResource(C0966R.raw.lucky_money_newyear_creat_loading);
            this.f200188e.f200168w.setImageResource(C0966R.C0969drawable.aw6);
            RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 359.0f, 1, 0.5f, 1, 0.5f);
            rotateAnimation.setDuration(1000);
            rotateAnimation.setRepeatCount(-1);
            rotateAnimation.setInterpolator(new LinearInterpolator());
            this.f200188e.f200168w.startAnimation(rotateAnimation);
            this.f200188e.f200152j1.alive();
            C69209e1 e1Var = this.f200188e.f200127U;
            C69218g1.m81555b(e1Var.f199136d, e1Var.f199137e);
        }
    }
}
