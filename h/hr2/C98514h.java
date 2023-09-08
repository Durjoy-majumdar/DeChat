package hr2;

import android.animation.ValueAnimator;
import com.tencent.p014mm.plugin.sns.p104ad.widget.twistad.TwistDegreeView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: hr2.h */
public class C98514h implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ TwistDegreeView f288914d;

    /* renamed from: hr2.h$a */
    public class C98515a implements ValueAnimator.AnimatorUpdateListener {
        public C98515a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistDegreeView$1$1");
            C98514h.this.f288914d.f274585t = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C98514h.this.f288914d.invalidate();
            SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistDegreeView$1$1");
        }
    }

    public C98514h(TwistDegreeView twistDegreeView) {
        this.f288914d = twistDegreeView;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistDegreeView$1");
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{this.f288914d.f274585t, 0.9f});
        ofFloat.setDuration(150);
        ofFloat.addUpdateListener(new C98515a());
        ofFloat.start();
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistDegreeView$1");
    }
}
