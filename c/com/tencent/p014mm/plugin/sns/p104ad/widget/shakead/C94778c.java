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

/* renamed from: com.tencent.mm.plugin.sns.ad.widget.shakead.c */
public class C94778c extends C13774c {

    /* renamed from: d */
    public final /* synthetic */ GLCardAnimView f274512d;

    /* renamed from: com.tencent.mm.plugin.sns.ad.widget.shakead.c$a */
    public class C94779a implements Runnable {
        public C94779a() {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView$3$1");
            Log.m105924i("GLCardAnimView", "startFlip");
            GLCardAnimView gLCardAnimView = C94778c.this.f274512d;
            int i = GLCardAnimView.f274448B;
            SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView");
            gLCardAnimView.getClass();
            SnsMethodCalculate.markStartTimeMs("startFlip", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView");
            StringBuilder sb = new StringBuilder();
            sb.append("startFlip, target=null?");
            boolean z = true;
            sb.append(gLCardAnimView.f274454w == null);
            sb.append(", mainView=null?");
            if (gLCardAnimView.f274455x != null) {
                z = false;
            }
            sb.append(z);
            Log.m105924i("GLCardAnimView", sb.toString());
            View view = gLCardAnimView.f274454w;
            if (!(view == null || gLCardAnimView.f274455x == null)) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Float.valueOf(1.0f));
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ad/widget/shakead/GLCardAnimView", "startFlip", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ad/widget/shakead/GLCardAnimView", "startFlip", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                View view3 = gLCardAnimView.f274454w;
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(0);
                View view4 = view3;
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ad/widget/shakead/GLCardAnimView", "startFlip", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/sns/ad/widget/shakead/GLCardAnimView", "startFlip", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                C99574x0 x0Var = new C99574x0(gLCardAnimView.f274454w, gLCardAnimView.f274455x, gLCardAnimView.f274450s, false, 1000, TSMException.ERR_JNIV2_BEGIN);
                C94780d dVar = new C94780d(gLCardAnimView);
                SnsMethodCalculate.markStartTimeMs("setOnFlipListener", "com.tencent.mm.plugin.sns.ad.helper.ShakeAdFlipCardAnimHelper");
                x0Var.f291876h = dVar;
                SnsMethodCalculate.markEndTimeMs("setOnFlipListener", "com.tencent.mm.plugin.sns.ad.helper.ShakeAdFlipCardAnimHelper");
                x0Var.mo138942b();
            }
            SnsMethodCalculate.markEndTimeMs("startFlip", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView");
            SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView");
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView$3$1");
        }
    }

    public C94778c(GLCardAnimView gLCardAnimView) {
        this.f274512d = gLCardAnimView;
    }

    public void onAnimationEnd(Animator animator) {
        SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView$3");
        if (GLCardAnimView.m120056h(this.f274512d) != null) {
            Log.m105924i("GLCardAnimView", "onPrepareCard");
            ((AdLandingPageEggCardHelper.C94708e) GLCardAnimView.m120056h(this.f274512d)).mo130370b();
        }
        GLCardAnimView gLCardAnimView = this.f274512d;
        SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView");
        View view = gLCardAnimView.f274454w;
        SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView");
        if (view == null) {
            Log.m105920e("GLCardAnimView", "playMainCardAnim, targetView==null");
            SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView$3");
            return;
        }
        MMHandlerThread.postToMainThreadDelayed(new C94779a(), 100);
        SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView$3");
    }
}
