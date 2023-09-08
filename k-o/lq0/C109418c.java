package lq0;

import android.animation.ValueAnimator;
import com.tencent.p014mm.plugin.appbrand.openmaterial.p470ui.hybrid.HybridOpenMaterialView;

/* renamed from: lq0.c */
public class C109418c implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ HybridOpenMaterialView f327540d;

    public C109418c(HybridOpenMaterialView hybridOpenMaterialView) {
        this.f327540d = hybridOpenMaterialView;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        HybridOpenMaterialView hybridOpenMaterialView = this.f327540d;
        hybridOpenMaterialView.f311230A = hybridOpenMaterialView.f311235d.getTranslationY();
        this.f327540d.mo148651c();
    }
}
