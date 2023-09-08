package hr2;

import android.animation.ValueAnimator;
import com.tencent.p014mm.plugin.sns.p104ad.widget.twistad.GLTwistRoateCardsView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: hr2.d */
public class C98510d implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ GLTwistRoateCardsView f288910d;

    public C98510d(GLTwistRoateCardsView gLTwistRoateCardsView) {
        this.f288910d = gLTwistRoateCardsView;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView$2");
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        GLTwistRoateCardsView gLTwistRoateCardsView = this.f288910d;
        int i = GLTwistRoateCardsView.f274526L;
        SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
        int i2 = gLTwistRoateCardsView.f274542w;
        SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
        SnsMethodCalculate.markStartTimeMs("access$102", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
        gLTwistRoateCardsView.f274541v = (int) (((float) i2) * floatValue);
        SnsMethodCalculate.markEndTimeMs("access$102", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
        GLTwistRoateCardsView gLTwistRoateCardsView2 = this.f288910d;
        SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
        gLTwistRoateCardsView2.mo130619i();
        SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
        this.f288910d.invalidate();
        SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView$2");
    }
}
