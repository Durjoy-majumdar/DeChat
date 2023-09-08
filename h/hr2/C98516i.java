package hr2;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import com.tencent.p014mm.plugin.sns.p104ad.widget.twistad.TwistRoateCardsView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import vr2.C102236a0;

/* renamed from: hr2.i */
public class C98516i implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ TwistRoateCardsView f288916d;

    public C98516i(TwistRoateCardsView twistRoateCardsView) {
        this.f288916d = twistRoateCardsView;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView$2");
        TwistRoateCardsView twistRoateCardsView = this.f288916d;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        HashMap<String, Bitmap> hashMap = TwistRoateCardsView.f274587y;
        SnsMethodCalculate.markStartTimeMs("access$302", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
        twistRoateCardsView.f274596o = floatValue;
        SnsMethodCalculate.markEndTimeMs("access$302", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
        this.f288916d.invalidate();
        TwistRoateCardsView twistRoateCardsView2 = this.f288916d;
        SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
        float f = twistRoateCardsView2.f274596o;
        SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
        float abs = 180.0f - Math.abs(f);
        TwistRoateCardsView twistRoateCardsView3 = this.f288916d;
        SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
        int i = twistRoateCardsView3.f274604w;
        SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
        if (abs - ((float) (i * 30)) >= 0.0f) {
            C102236a0.m134708C0(new long[]{0, 40});
            TwistRoateCardsView twistRoateCardsView4 = this.f288916d;
            SnsMethodCalculate.markStartTimeMs("access$408", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
            twistRoateCardsView4.f274604w++;
            SnsMethodCalculate.markEndTimeMs("access$408", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
            StringBuilder sb = new StringBuilder();
            sb.append("vabriate, idx=");
            TwistRoateCardsView twistRoateCardsView5 = this.f288916d;
            SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
            int i2 = twistRoateCardsView5.f274604w;
            SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
            sb.append(i2);
            Log.m105924i("TwistRoateCardsView", sb.toString());
        }
        SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView$2");
    }
}
