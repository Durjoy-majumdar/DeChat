package po3;

import android.animation.ValueAnimator;
import com.tencent.p014mm.p136ui.widget.cropview.CropLayout;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import gy3.C59741c0;
import gy3.C87412m;

/* renamed from: po3.i */
public final class C110239i implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ CropLayout f329760d;

    /* renamed from: e */
    public final /* synthetic */ C59741c0 f329761e;

    public C110239i(CropLayout cropLayout, C59741c0 c0Var) {
        this.f329760d = cropLayout;
        this.f329761e = c0Var;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Object animatedValue = valueAnimator.getAnimatedValue(FFmpegMetadataRetriever.METADATA_KEY_VIDEO_ROTATION);
        C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((Float) animatedValue).floatValue();
        CropLayout.m144362j(this.f329760d, floatValue - this.f329761e.f170634d);
        this.f329761e.f170634d = floatValue;
    }
}
