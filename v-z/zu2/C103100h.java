package zu2;

import android.animation.ValueAnimator;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.previewimageview.DynamicGridView;

/* renamed from: zu2.h */
public class C103100h implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ DynamicGridView f304205d;

    public C103100h(DynamicGridView dynamicGridView) {
        this.f304205d = dynamicGridView;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$4");
        this.f304205d.invalidate();
        SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$4");
    }
}
