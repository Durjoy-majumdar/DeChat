package zu2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.previewimageview.DynamicGridView;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: zu2.i */
public class C103101i extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ DynamicGridView f304206d;

    public C103101i(DynamicGridView dynamicGridView) {
        this.f304206d = dynamicGridView;
    }

    public void onAnimationEnd(Animator animator) {
        SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$5");
        DynamicGridView.m123189f(this.f304206d, false);
        DynamicGridView.m123190g(this.f304206d);
        Log.m105924i("DynamicGridView", "animate end 1");
        SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$5");
    }

    public void onAnimationStart(Animator animator) {
        SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$5");
        DynamicGridView.m123189f(this.f304206d, true);
        DynamicGridView.m123190g(this.f304206d);
        Log.m105924i("DynamicGridView", "animate start 1 ");
        SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$5");
    }
}
