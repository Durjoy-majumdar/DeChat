package zu2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.previewimageview.DynamicGridView;

/* renamed from: zu2.l */
public class C103104l extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ DynamicGridView f304208d;

    public C103104l(DynamicGridView dynamicGridView) {
        this.f304208d = dynamicGridView;
    }

    public void onAnimationEnd(Animator animator) {
        SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$9");
        DynamicGridView dynamicGridView = this.f304208d;
        int i = DynamicGridView.f280798x0;
        SnsMethodCalculate.markStartTimeMs("access$1602", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        dynamicGridView.f280802D = false;
        SnsMethodCalculate.markEndTimeMs("access$1602", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        DynamicGridView.m123190g(this.f304208d);
        SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$9");
    }

    public void onAnimationStart(Animator animator) {
        SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$9");
        DynamicGridView dynamicGridView = this.f304208d;
        int i = DynamicGridView.f280798x0;
        SnsMethodCalculate.markStartTimeMs("access$1602", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        dynamicGridView.f280802D = true;
        SnsMethodCalculate.markEndTimeMs("access$1602", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        DynamicGridView.m123190g(this.f304208d);
        SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$9");
    }
}
