package vo2;

import android.animation.ValueAnimator;
import com.tencent.p014mm.plugin.sns.model.AdLandingPagesProxy;
import com.tencent.p014mm.plugin.sns.p104ad.landingpage.halfscreen.C94696a;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: vo2.a */
public class C102227a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ int f301014d;

    /* renamed from: e */
    public final /* synthetic */ C94696a f301015e;

    public C102227a(C94696a aVar, int i) {
        this.f301015e = aVar;
        this.f301014d = i;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdHalfScreenLandingPageHelper$4");
        if (C65833d.m77546a() && this.f301014d != 0) {
            C94696a aVar = this.f301015e;
            SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdHalfScreenLandingPageHelper");
            boolean z = aVar.f274078f;
            SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdHalfScreenLandingPageHelper");
            if (!z) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                C94696a aVar2 = this.f301015e;
                SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdHalfScreenLandingPageHelper");
                int i = aVar2.f274077e;
                SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdHalfScreenLandingPageHelper");
                AdLandingPagesProxy.getInstance().onHalfScreenHeightChange((floatValue - ((float) i)) / ((float) this.f301014d));
            }
        }
        SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdHalfScreenLandingPageHelper$4");
    }
}
