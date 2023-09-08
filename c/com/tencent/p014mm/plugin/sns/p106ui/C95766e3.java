package com.tencent.p014mm.plugin.sns.p106ui;

import android.view.View;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.List;
import jt2.C99023b;
import k20.C60958c;
import k20.C9556a;
import qs2.C101255a0;

/* renamed from: com.tencent.mm.plugin.sns.ui.e3 */
public class C95766e3 implements C99023b {

    /* renamed from: a */
    public final /* synthetic */ SnsAdNativeLandingPagesUI f279390a;

    public C95766e3(SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI) {
        this.f279390a = snsAdNativeLandingPagesUI;
    }

    /* renamed from: a */
    public void mo130378a(float f) {
        SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$25");
        if (SnsAdNativeLandingPagesUI.m121803J7(this.f279390a)) {
            float f2 = 1.0f - (f * 4.0f);
            if (f2 < 0.0f) {
                f2 = 0.0f;
            }
            View I7 = SnsAdNativeLandingPagesUI.m121802I7(this.f279390a);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(f2));
            View view = I7;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingPagesUI$25", "onAnimationUpdate", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            I7.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingPagesUI$25", "onAnimationUpdate", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        } else {
            SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI = this.f279390a;
            SnsMethodCalculate.markStartTimeMs("access$5700", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            ImageView imageView = snsAdNativeLandingPagesUI.f277606q;
            SnsMethodCalculate.markEndTimeMs("access$5700", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            imageView.setAlpha(1.0f - f);
        }
        SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$25");
    }

    public void onAnimationEnd() {
        SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$25");
        SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI = this.f279390a;
        List<C101255a0> list = SnsAdNativeLandingPagesUI.f277498D2;
        SnsMethodCalculate.markStartTimeMs("access$5802", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        snsAdNativeLandingPagesUI.f277594m1 = false;
        SnsMethodCalculate.markEndTimeMs("access$5802", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        Log.m105924i("MicroMsg.SnsAdNativeLandingPagesUI", "sns exit anim end");
        this.f279390a.finish();
        this.f279390a.overridePendingTransition(C0966R.C0968anim.f2333y, C0966R.C0968anim.f2333y);
        SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI2 = this.f279390a;
        if (!snsAdNativeLandingPagesUI2.f277515G1 && snsAdNativeLandingPagesUI2.isSupportNavigationSwipeBack()) {
            this.f279390a.getSwipeBackLayout().setEnableGesture(true);
        }
        SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$25");
    }

    public void onAnimationStart() {
        SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$25");
        Log.m105924i("MicroMsg.SnsAdNativeLandingPagesUI", "sns exit anim start");
        if (SnsAdNativeLandingPagesUI.m121803J7(this.f279390a)) {
            SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI = this.f279390a;
            SnsMethodCalculate.markStartTimeMs("access$5700", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            ImageView imageView = snsAdNativeLandingPagesUI.f277606q;
            SnsMethodCalculate.markEndTimeMs("access$5700", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            imageView.setAlpha(0.0f);
        } else {
            View I7 = SnsAdNativeLandingPagesUI.m121802I7(this.f279390a);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(4);
            C117292a.m165358d(I7, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingPagesUI$25", "onAnimationStart", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            I7.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(I7, "com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingPagesUI$25", "onAnimationStart", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$25");
    }
}
