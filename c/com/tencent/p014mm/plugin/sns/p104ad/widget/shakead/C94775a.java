package com.tencent.p014mm.plugin.sns.p104ad.widget.shakead;

import android.animation.Animator;
import android.view.View;
import com.tencent.p014mm.plugin.sns.p104ad.landingpage.helper.anim.AdLandingPageEggCardHelper;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tenpay.tsm.TSMException;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import lo2.C99574x0;
import sq2.C13774c;

/* renamed from: com.tencent.mm.plugin.sns.ad.widget.shakead.a */
public class C94775a extends C13774c {

    /* renamed from: d */
    public final /* synthetic */ CardAnimView f274509d;

    /* renamed from: com.tencent.mm.plugin.sns.ad.widget.shakead.a$a */
    public class C94776a implements Runnable {
        public C94776a() {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView$3$1");
            Log.m105924i("ShakeCardAnimView", "startFlip");
            CardAnimView cardAnimView = C94775a.this.f274509d;
            int i = CardAnimView.f274438p;
            SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView");
            cardAnimView.getClass();
            SnsMethodCalculate.markStartTimeMs("startFlip", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView");
            StringBuilder sb = new StringBuilder();
            sb.append("startFlip, target=null?");
            boolean z = true;
            sb.append(cardAnimView.f274443h == null);
            sb.append(", mainView=null?");
            if (cardAnimView.f274444i != null) {
                z = false;
            }
            sb.append(z);
            Log.m105924i("ShakeCardAnimView", sb.toString());
            View view = cardAnimView.f274443h;
            if (!(view == null || cardAnimView.f274444i == null)) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Float.valueOf(1.0f));
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ad/widget/shakead/CardAnimView", "startFlip", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ad/widget/shakead/CardAnimView", "startFlip", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                View view3 = cardAnimView.f274443h;
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(0);
                View view4 = view3;
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ad/widget/shakead/CardAnimView", "startFlip", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/sns/ad/widget/shakead/CardAnimView", "startFlip", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                C99574x0 x0Var = new C99574x0(cardAnimView.f274443h, cardAnimView.f274444i, cardAnimView.f274439d, false, 1000, TSMException.ERR_JNIV2_BEGIN);
                C94777b bVar = new C94777b(cardAnimView);
                SnsMethodCalculate.markStartTimeMs("setOnFlipListener", "com.tencent.mm.plugin.sns.ad.helper.ShakeAdFlipCardAnimHelper");
                x0Var.f291876h = bVar;
                SnsMethodCalculate.markEndTimeMs("setOnFlipListener", "com.tencent.mm.plugin.sns.ad.helper.ShakeAdFlipCardAnimHelper");
                x0Var.mo138942b();
            }
            SnsMethodCalculate.markEndTimeMs("startFlip", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView");
            SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView");
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView$3$1");
        }
    }

    public C94775a(CardAnimView cardAnimView) {
        this.f274509d = cardAnimView;
    }

    public void onAnimationEnd(Animator animator) {
        SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView$3");
        if (CardAnimView.m120052a(this.f274509d) != null) {
            Log.m105924i("ShakeCardAnimView", "onPrepareCard");
            ((AdLandingPageEggCardHelper.C94708e) CardAnimView.m120052a(this.f274509d)).mo130370b();
        }
        CardAnimView cardAnimView = this.f274509d;
        SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView");
        View view = cardAnimView.f274443h;
        SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView");
        if (view == null) {
            Log.m105920e("ShakeCardAnimView", "playMainCardAnim, targetView==null");
            SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView$3");
            return;
        }
        MMHandlerThread.postToMainThreadDelayed(new C94776a(), 100);
        SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView$3");
    }
}
