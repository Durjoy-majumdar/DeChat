package hr2;

import android.animation.ValueAnimator;
import com.tencent.p014mm.plugin.sns.p104ad.widget.twistad.GLTwistRoateCardsView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import vr2.C102236a0;

/* renamed from: hr2.f */
public class C98512f implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ GLTwistRoateCardsView f288912d;

    public C98512f(GLTwistRoateCardsView gLTwistRoateCardsView) {
        this.f288912d = gLTwistRoateCardsView;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView$4");
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f288912d.invalidate();
        float abs = 180.0f - Math.abs(floatValue);
        GLTwistRoateCardsView gLTwistRoateCardsView = this.f288912d;
        int i = GLTwistRoateCardsView.f274526L;
        SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
        int i2 = gLTwistRoateCardsView.f274536J;
        SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
        if (abs - ((float) (i2 * 30)) >= 0.0f) {
            C102236a0.m134708C0(new long[]{0, 40});
            GLTwistRoateCardsView gLTwistRoateCardsView2 = this.f288912d;
            SnsMethodCalculate.markStartTimeMs("access$508", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
            gLTwistRoateCardsView2.f274536J++;
            SnsMethodCalculate.markEndTimeMs("access$508", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
            StringBuilder sb = new StringBuilder();
            sb.append("vabriate, idx=");
            GLTwistRoateCardsView gLTwistRoateCardsView3 = this.f288912d;
            SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
            int i3 = gLTwistRoateCardsView3.f274536J;
            SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
            sb.append(i3);
            Log.m105924i("GLTwistRoateCardsView", sb.toString());
        }
        SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView$4");
    }
}
