package po3;

import android.animation.ValueAnimator;
import com.tencent.p014mm.p136ui.widget.cropview.CropLayout;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import gy3.C87412m;

/* renamed from: po3.l */
public final class C110242l implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public int f329768d;

    /* renamed from: e */
    public int f329769e;

    /* renamed from: f */
    public final /* synthetic */ CropLayout f329770f;

    public C110242l(CropLayout cropLayout) {
        this.f329770f = cropLayout;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        C87412m.m108594g(valueAnimator, LocaleUtil.ITALIAN);
        Object animatedValue = valueAnimator.getAnimatedValue("transX");
        C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) animatedValue).intValue();
        Object animatedValue2 = valueAnimator.getAnimatedValue("transY");
        C87412m.m108592e(animatedValue2, "null cannot be cast to non-null type kotlin.Int");
        int intValue2 = ((Integer) animatedValue2).intValue();
        this.f329770f.mo154441I((float) (intValue - this.f329768d), (float) (intValue2 - this.f329769e));
        this.f329768d = intValue;
        this.f329769e = intValue2;
    }
}
