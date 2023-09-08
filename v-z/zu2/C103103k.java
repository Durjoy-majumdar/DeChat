package zu2;

import android.animation.ValueAnimator;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.previewimageview.DynamicGridView;

/* renamed from: zu2.k */
public class C103103k implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ DynamicGridView f304207d;

    public C103103k(DynamicGridView dynamicGridView) {
        this.f304207d = dynamicGridView;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$7");
        this.f304207d.invalidate();
        SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$7");
    }
}
