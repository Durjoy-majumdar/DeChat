package fr2;

import android.animation.Animator;
import com.tencent.p014mm.plugin.sns.p104ad.widget.shakead.ShakeCoverView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import sq2.C13774c;

/* renamed from: fr2.e */
public class C97955e extends C13774c {
    public C97955e(ShakeCoverView shakeCoverView) {
    }

    public void onAnimationEnd(Animator animator) {
        SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView$3");
        SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView$3");
    }
}
