package hr2;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import com.tencent.p014mm.plugin.sns.p104ad.widget.twistad.TwistRoateCardsView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import java.util.HashMap;

/* renamed from: hr2.k */
public class C98518k implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ TwistRoateCardsView f288918d;

    public C98518k(TwistRoateCardsView twistRoateCardsView) {
        this.f288918d = twistRoateCardsView;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView$4");
        TwistRoateCardsView twistRoateCardsView = this.f288918d;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        HashMap<String, Bitmap> hashMap = TwistRoateCardsView.f274587y;
        SnsMethodCalculate.markStartTimeMs("access$602", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
        twistRoateCardsView.f274597p = floatValue;
        SnsMethodCalculate.markEndTimeMs("access$602", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
        this.f288918d.invalidate();
        SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView$4");
    }
}
