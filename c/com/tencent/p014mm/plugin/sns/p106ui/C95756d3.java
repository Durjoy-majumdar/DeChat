package com.tencent.p014mm.plugin.sns.p106ui;

import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.List;
import jt2.C99023b;
import jt2.C99024c;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import qs2.C101255a0;
import vr2.C37817q;

/* renamed from: com.tencent.mm.plugin.sns.ui.d3 */
public class C95756d3 implements C99023b {

    /* renamed from: a */
    public final /* synthetic */ RecyclerView f279348a;

    /* renamed from: b */
    public final /* synthetic */ SnsAdNativeLandingPagesUI f279349b;

    /* renamed from: com.tencent.mm.plugin.sns.ui.d3$a */
    public class C95757a implements Animation.AnimationListener {

        /* renamed from: com.tencent.mm.plugin.sns.ui.d3$a$a */
        public class C95758a implements Animation.AnimationListener {
            public C95758a() {
            }

            public void onAnimationEnd(Animation animation) {
                SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$23$1$1");
                SnsAdNativeLandingPagesUI.m121804K7(C95756d3.this.f279349b).setVisibility(8);
                SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$23$1$1");
            }

            public void onAnimationRepeat(Animation animation) {
                SnsMethodCalculate.markStartTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$23$1$1");
                SnsMethodCalculate.markEndTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$23$1$1");
            }

            public void onAnimationStart(Animation animation) {
                SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$23$1$1");
                SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$23$1$1");
            }
        }

        public C95757a() {
        }

        public void onAnimationEnd(Animation animation) {
            SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$23$1");
            View childAt = C95756d3.this.f279348a.getChildAt(0);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(1.0f));
            View view = childAt;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingPagesUI$23$1", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            childAt.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingPagesUI$23$1", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(1);
            alphaAnimation.setAnimationListener(new C95758a());
            SnsAdNativeLandingPagesUI.m121804K7(C95756d3.this.f279349b).startAnimation(alphaAnimation);
            SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$23$1");
        }

        public void onAnimationRepeat(Animation animation) {
            SnsMethodCalculate.markStartTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$23$1");
            SnsMethodCalculate.markEndTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$23$1");
        }

        public void onAnimationStart(Animation animation) {
            SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$23$1");
            SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$23$1");
        }
    }

    public C95756d3(SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI, RecyclerView recyclerView) {
        this.f279349b = snsAdNativeLandingPagesUI;
        this.f279348a = recyclerView;
    }

    /* renamed from: a */
    public void mo130378a(float f) {
        SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$23");
        SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI = this.f279349b;
        List<C101255a0> list = SnsAdNativeLandingPagesUI.f277498D2;
        SnsMethodCalculate.markStartTimeMs("access$5700", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        ImageView imageView = snsAdNativeLandingPagesUI.f277606q;
        SnsMethodCalculate.markEndTimeMs("access$5700", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        float f2 = 1.0f - f;
        imageView.setAlpha(f2);
        View I7 = SnsAdNativeLandingPagesUI.m121802I7(this.f279349b);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf(f2));
        View view = I7;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingPagesUI$23", "onAnimationUpdate", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        I7.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingPagesUI$23", "onAnimationUpdate", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$23");
    }

    public void onAnimationEnd() {
        String str;
        SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$23");
        SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI = this.f279349b;
        List<C101255a0> list = SnsAdNativeLandingPagesUI.f277498D2;
        SnsMethodCalculate.markStartTimeMs("access$5802", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        snsAdNativeLandingPagesUI.f277594m1 = false;
        SnsMethodCalculate.markEndTimeMs("access$5802", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        Log.m105924i("MicroMsg.SnsAdNativeLandingPagesUI", "sns enter anim end");
        if (!SnsAdNativeLandingPagesUI.m121811R7(this.f279349b)) {
            SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI2 = this.f279349b;
            SnsMethodCalculate.markStartTimeMs("access$1500", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            View view = snsAdNativeLandingPagesUI2.f277567c1;
            SnsMethodCalculate.markEndTimeMs("access$1500", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            str = "onAnimationEnd";
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingPagesUI$23", "onAnimationEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingPagesUI$23", "onAnimationEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            str = "onAnimationEnd";
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(200);
        SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI3 = this.f279349b;
        SnsMethodCalculate.markStartTimeMs("access$1500", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        View view3 = snsAdNativeLandingPagesUI3.f277567c1;
        SnsMethodCalculate.markEndTimeMs("access$1500", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        view3.startAnimation(alphaAnimation);
        if (SnsAdNativeLandingPagesUI.m121803J7(this.f279349b)) {
            this.f279348a.setVisibility(0);
            View childAt = this.f279348a.getChildAt(0);
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(Float.valueOf(0.01f));
            View view4 = childAt;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingPagesUI$23", "onAnimationEnd", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            childAt.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingPagesUI$23", "onAnimationEnd", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            AlphaAnimation alphaAnimation2 = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation2.setDuration(150);
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, (float) C76577a.m92151b(this.f279349b, 15), 0.0f);
            translateAnimation.setDuration(150);
            translateAnimation.setAnimationListener(new C95757a());
            AnimationSet animationSet = new AnimationSet(false);
            animationSet.addAnimation(alphaAnimation2);
            animationSet.addAnimation(translateAnimation);
            this.f279348a.startAnimation(animationSet);
        } else {
            View I7 = SnsAdNativeLandingPagesUI.m121802I7(this.f279349b);
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
            aVar3.mo10233c(0);
            View view5 = I7;
            C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingPagesUI$23", "onAnimationEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            I7.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view5, "com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingPagesUI$23", "onAnimationEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f279349b.mo132500I8();
        this.f279349b.mo132503L8();
        SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI4 = this.f279349b;
        if (!snsAdNativeLandingPagesUI4.f277515G1 && snsAdNativeLandingPagesUI4.isSupportNavigationSwipeBack()) {
            this.f279349b.getSwipeBackLayout().setEnableGesture(true);
        }
        SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI5 = this.f279349b;
        SnsMethodCalculate.markStartTimeMs("access$5900", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        C99024c cVar = snsAdNativeLandingPagesUI5.f277590k1;
        SnsMethodCalculate.markEndTimeMs("access$5900", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        if (cVar != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("");
            SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI6 = this.f279349b;
            SnsMethodCalculate.markStartTimeMs("access$2700", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            int i = snsAdNativeLandingPagesUI6.f277508D;
            SnsMethodCalculate.markEndTimeMs("access$2700", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            sb.append(i);
            String sb4 = sb.toString();
            SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI7 = this.f279349b;
            SnsMethodCalculate.markStartTimeMs("access$5900", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            C99024c cVar2 = snsAdNativeLandingPagesUI7.f277590k1;
            SnsMethodCalculate.markEndTimeMs("access$5900", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            cVar2.getClass();
            SnsMethodCalculate.markStartTimeMs("getReportAnimUpdateCount", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeEnterAnimation");
            int i2 = cVar2.f290313m;
            SnsMethodCalculate.markEndTimeMs("getReportAnimUpdateCount", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeEnterAnimation");
            SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI8 = this.f279349b;
            SnsMethodCalculate.markStartTimeMs("access$5900", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            C99024c cVar3 = snsAdNativeLandingPagesUI8.f277590k1;
            SnsMethodCalculate.markEndTimeMs("access$5900", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            cVar3.getClass();
            SnsMethodCalculate.markStartTimeMs("getReportCostTime", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeEnterAnimation");
            SnsMethodCalculate.markEndTimeMs("getReportCostTime", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeEnterAnimation");
            C37817q.m41546b("landing_page_report_anim_cost", sb4, i2, (int) (cVar3.f290315o - cVar3.f290314n), "snsId=" + this.f279349b.f277522K);
        }
        SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$23");
    }

    public void onAnimationStart() {
        SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$23");
        Log.m105924i("MicroMsg.SnsAdNativeLandingPagesUI", "sns enter anim start");
        if (SnsAdNativeLandingPagesUI.m121803J7(this.f279349b)) {
            View I7 = SnsAdNativeLandingPagesUI.m121802I7(this.f279349b);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view = I7;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingPagesUI$23", "onAnimationStart", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            I7.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingPagesUI$23", "onAnimationStart", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f279348a.setVisibility(4);
        } else {
            View I72 = SnsAdNativeLandingPagesUI.m121802I7(this.f279349b);
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(4);
            View view2 = I72;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingPagesUI$23", "onAnimationStart", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            I72.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingPagesUI$23", "onAnimationStart", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$23");
    }
}
