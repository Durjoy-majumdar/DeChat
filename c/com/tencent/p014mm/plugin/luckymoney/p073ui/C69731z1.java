package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.luckymoney.model.C69210e2;
import com.tencent.p014mm.plugin.luckymoney.model.C69242l1;
import com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyAutoScrollView;
import com.tencent.p014mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper;
import f40.C86709a0;
import lc3.C10485b;
import yq3.C79148e;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.z1 */
public class C69731z1 implements LuckyMoneyAutoScrollView.C69337a {

    /* renamed from: a */
    public final /* synthetic */ C69210e2 f201156a;

    /* renamed from: b */
    public final /* synthetic */ LuckyMoneyNewYearReceiveUIV2 f201157b;

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.z1$a */
    public class C69732a implements Animation.AnimationListener {
        public C69732a() {
        }

        public void onAnimationEnd(Animation animation) {
            if (((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("PlayCoinSound", 0) > 0) {
                C115591q5.m162472a(C69731z1.this.f201157b.getContext(), C0966R.string.gek);
            }
            C69731z1 z1Var = C69731z1.this;
            RealnameGuideHelper realnameGuideHelper = z1Var.f201156a.f199154p;
            if (realnameGuideHelper != null) {
                realnameGuideHelper.mo99370a(z1Var.f201157b, (Bundle) null, (DialogInterface.OnClickListener) null, (C79148e.C79149a) null);
            }
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    public C69731z1(LuckyMoneyNewYearReceiveUIV2 luckyMoneyNewYearReceiveUIV2, C69210e2 e2Var) {
        this.f201157b = luckyMoneyNewYearReceiveUIV2;
        this.f201156a = e2Var;
    }

    /* renamed from: a */
    public void mo95516a() {
        C69242l1.m81616v(this.f201157b.getContext(), this.f201157b.f200158o, this.f201156a.f199149h.f198968h);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(500);
        alphaAnimation.setAnimationListener(new C69732a());
        this.f201157b.f200158o.startAnimation(alphaAnimation);
        this.f201157b.mo95634V7(true);
    }
}
