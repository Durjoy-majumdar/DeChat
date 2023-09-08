package rr2;

import android.animation.Animator;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.thumbplayer.view.MMTPEffectVideoLayout;
import gy3.C87412m;

/* renamed from: rr2.i */
public final class C101456i implements Animator.AnimatorListener {

    /* renamed from: d */
    public final /* synthetic */ C101452g f297125d;

    public C101456i(C101452g gVar) {
        this.f297125d = gVar;
    }

    public void onAnimationCancel(Animator animator) {
        SnsMethodCalculate.markStartTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectPreviewPlugin$showCropScaleAnimation$1");
        C87412m.m108594g(animator, "animation");
        SnsMethodCalculate.markEndTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectPreviewPlugin$showCropScaleAnimation$1");
    }

    public void onAnimationEnd(Animator animator) {
        SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectPreviewPlugin$showCropScaleAnimation$1");
        C87412m.m108594g(animator, "animation");
        C101452g gVar = this.f297125d;
        SnsMethodCalculate.markStartTimeMs("access$getEffectView", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectPreviewPlugin");
        MMTPEffectVideoLayout y = gVar.mo140954y();
        SnsMethodCalculate.markEndTimeMs("access$getEffectView", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectPreviewPlugin");
        y.requestLayout();
        SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectPreviewPlugin$showCropScaleAnimation$1");
    }

    public void onAnimationRepeat(Animator animator) {
        SnsMethodCalculate.markStartTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectPreviewPlugin$showCropScaleAnimation$1");
        C87412m.m108594g(animator, "animation");
        SnsMethodCalculate.markEndTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectPreviewPlugin$showCropScaleAnimation$1");
    }

    public void onAnimationStart(Animator animator) {
        SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectPreviewPlugin$showCropScaleAnimation$1");
        C87412m.m108594g(animator, "animation");
        SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectPreviewPlugin$showCropScaleAnimation$1");
    }
}
