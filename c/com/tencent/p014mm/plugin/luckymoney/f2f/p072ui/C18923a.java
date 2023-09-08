package com.tencent.p014mm.plugin.luckymoney.f2f.p072ui;

import af0.C16457a;
import android.animation.ValueAnimator;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.luckymoney.f2f.p072ui.ShuffleView;
import com.tencent.p014mm.plugin.luckymoney.model.C69242l1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import j20.C117292a;
import java.util.LinkedList;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.luckymoney.f2f.ui.a */
public class C18923a implements ShuffleView.C18921l {

    /* renamed from: a */
    public final /* synthetic */ LuckyMoneyF2FQRCodeUI f53121a;

    public C18923a(LuckyMoneyF2FQRCodeUI luckyMoneyF2FQRCodeUI) {
        this.f53121a = luckyMoneyF2FQRCodeUI;
    }

    /* renamed from: a */
    public void mo23956a(ValueAnimator valueAnimator, View view) {
        View view2 = view;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (floatValue == 0.0f) {
            this.f53121a.f53017N = view.getTranslationX();
            this.f53121a.f53018P = view.getTranslationY();
            View findViewById = view2.findViewById(C0966R.C0970id.gfb);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(findViewById, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/f2f/ui/LuckyMoneyF2FQRCodeUI$12", "update", "(Landroid/animation/ValueAnimator;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(findViewById, "com/tencent/mm/plugin/luckymoney/f2f/ui/LuckyMoneyF2FQRCodeUI$12", "update", "(Landroid/animation/ValueAnimator;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        float f = 1.0f - floatValue;
        view2.setTranslationX(this.f53121a.f53017N * f);
        LuckyMoneyF2FQRCodeUI luckyMoneyF2FQRCodeUI = this.f53121a;
        view2.setTranslationY((luckyMoneyF2FQRCodeUI.f53018P * f) - ((((float) luckyMoneyF2FQRCodeUI.f53059z.getHeight()) + (this.f53121a.f53018P * 8.0f)) * floatValue));
        float f2 = (0.5f * floatValue) + 1.0f;
        view2.setScaleX(f2);
        view2.setScaleY(f2);
        Pair pair = (Pair) ((LinkedList) this.f53121a.f53053v).peek();
        if (pair != null && !Util.isNullOrNil(this.f53121a.f53015L) && this.f53121a.f53015L.equals(pair.first)) {
            View view3 = this.f53121a.f53008E;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(Float.valueOf(floatValue));
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/luckymoney/f2f/ui/LuckyMoneyF2FQRCodeUI$12", "update", "(Landroid/animation/ValueAnimator;Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view3.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/luckymoney/f2f/ui/LuckyMoneyF2FQRCodeUI$12", "update", "(Landroid/animation/ValueAnimator;Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        Log.m105925i("LuckyMoneyF2FQRCodeUI", "fireworkBottomLayer %f", Float.valueOf(floatValue));
        if (floatValue >= 0.9f) {
            float f3 = f * 10.0f;
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
            aVar3.mo10233c(Float.valueOf(f3));
            C117292a.m165358d(view, aVar3.mo10232b(), "com/tencent/mm/plugin/luckymoney/f2f/ui/LuckyMoneyF2FQRCodeUI$12", "update", "(Landroid/animation/ValueAnimator;Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((Float) aVar3.mo10231a(0)).floatValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/luckymoney/f2f/ui/LuckyMoneyF2FQRCodeUI$12", "update", "(Landroid/animation/ValueAnimator;Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            View view5 = this.f53121a.f53042i;
            float f4 = 1.0f - f3;
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(Float.valueOf(f4));
            C117292a.m165358d(view5, aVar4.mo10232b(), "com/tencent/mm/plugin/luckymoney/f2f/ui/LuckyMoneyF2FQRCodeUI$12", "update", "(Landroid/animation/ValueAnimator;Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view5.setAlpha(((Float) aVar4.mo10231a(0)).floatValue());
            C117292a.m165359e(view5, "com/tencent/mm/plugin/luckymoney/f2f/ui/LuckyMoneyF2FQRCodeUI$12", "update", "(Landroid/animation/ValueAnimator;Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            this.f53121a.f53042i.setScaleX(floatValue);
            this.f53121a.f53042i.setScaleY(floatValue);
            View view6 = this.f53121a.f53042i;
            C9556a aVar5 = new C9556a();
            aVar5.mo10233c(0);
            C117292a.m165358d(view6, aVar5.mo10232b(), "com/tencent/mm/plugin/luckymoney/f2f/ui/LuckyMoneyF2FQRCodeUI$12", "update", "(Landroid/animation/ValueAnimator;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
            C117292a.m165359e(view6, "com/tencent/mm/plugin/luckymoney/f2f/ui/LuckyMoneyF2FQRCodeUI$12", "update", "(Landroid/animation/ValueAnimator;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (floatValue == 1.0f) {
            this.f53121a.f53011H.mo107445a("packet_received.m4a");
            ShuffleView shuffleView = this.f53121a.f53059z;
            shuffleView.removeView(shuffleView.getExitView());
            LuckyMoneyF2FQRCodeUI luckyMoneyF2FQRCodeUI2 = this.f53121a;
            luckyMoneyF2FQRCodeUI2.f53043j = (ImageView) luckyMoneyF2FQRCodeUI2.f53042i.findViewById(C0966R.C0970id.gig);
            luckyMoneyF2FQRCodeUI2.f53044n = (TextView) luckyMoneyF2FQRCodeUI2.f53042i.findViewById(C0966R.C0970id.gih);
            luckyMoneyF2FQRCodeUI2.f53045o = (TextView) luckyMoneyF2FQRCodeUI2.f53042i.findViewById(C0966R.C0970id.gi4);
            Pair pair2 = (Pair) ((LinkedList) luckyMoneyF2FQRCodeUI2.f53053v).poll();
            if (pair2 != null) {
                C69242l1.m81595a(luckyMoneyF2FQRCodeUI2.f53043j, (String) null, (String) pair2.first);
                C69242l1.m81616v(luckyMoneyF2FQRCodeUI2, luckyMoneyF2FQRCodeUI2.f53044n, C69242l1.m81602h((String) pair2.first));
                luckyMoneyF2FQRCodeUI2.f53045o.setText(C75228t.m90260n(((double) ((Integer) pair2.second).intValue()) / 100.0d));
                if (!Util.isNullOrNil(luckyMoneyF2FQRCodeUI2.f53015L) && luckyMoneyF2FQRCodeUI2.f53015L.equals(pair2.first)) {
                    C16457a.m15296a(luckyMoneyF2FQRCodeUI2.f53006C, luckyMoneyF2FQRCodeUI2.f53036Y0).mo14933b(800, 100);
                    C16457a.m15296a(luckyMoneyF2FQRCodeUI2.f53007D, luckyMoneyF2FQRCodeUI2.f53038Z0).mo14933b(800, 100);
                    luckyMoneyF2FQRCodeUI2.f53011H.mo107445a("most_lucky.m4a");
                    if (((Integer) pair2.second).intValue() >= 19000) {
                        luckyMoneyF2FQRCodeUI2.f53011H.mo107445a("whistle.m4a");
                    }
                }
            }
            this.f53121a.f53016M.start();
        }
    }
}
