package com.tencent.p014mm.plugin.textstatus.p112ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R$\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0014"}, mo182094d2 = {"Lcom/tencent/mm/plugin/textstatus/ui/AutoAnimImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "", "duration", "Lrx3/b0;", "setDurationMsPerDp", "Landroid/animation/ValueAnimator;", "f", "Landroid/animation/ValueAnimator;", "getAnimator", "()Landroid/animation/ValueAnimator;", "setAnimator", "(Landroid/animation/ValueAnimator;)V", "animator", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-textstatus_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.textstatus.ui.AutoAnimImageView */
public final class AutoAnimImageView extends AppCompatImageView {

    /* renamed from: f */
    public ValueAnimator f164586f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AutoAnimImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
    }

    public final ValueAnimator getAnimator() {
        return this.f164586f;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ValueAnimator valueAnimator = this.f164586f;
        if (valueAnimator != null) {
            valueAnimator.resume();
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f164586f;
        if (valueAnimator != null) {
            valueAnimator.pause();
        }
    }

    public final void setAnimator(ValueAnimator valueAnimator) {
        this.f164586f = valueAnimator;
    }

    public final void setDurationMsPerDp(int i) {
    }
}
