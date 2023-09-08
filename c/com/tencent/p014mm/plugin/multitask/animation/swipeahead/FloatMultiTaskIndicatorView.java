package com.tencent.p014mm.plugin.multitask.animation.swipeahead;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Vibrator;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.multitask.C105922o;
import g92.C107791e;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B)\b\u0007\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\b\b\u0002\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0012\u0010\u000b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\n\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\n\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016R$\u0010\u0016\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u001d\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006&"}, mo182094d2 = {"Lcom/tencent/mm/plugin/multitask/animation/swipeahead/FloatMultiTaskIndicatorView;", "Landroid/widget/FrameLayout;", "", "Landroid/view/View;", "getView", "Landroid/graphics/drawable/Drawable;", "drawable", "Lrx3/b0;", "setIconDrawable", "Lg92/e;", "orientationChangedListener", "setOnOrientationChangedListener", "Landroid/widget/ImageView;", "getInnerIndicatorImageView", "Landroid/widget/TextView;", "getInnerIndicatorTextView", "e", "Landroid/widget/ImageView;", "getIndicatorImageView", "()Landroid/widget/ImageView;", "setIndicatorImageView", "(Landroid/widget/ImageView;)V", "indicatorImageView", "f", "Landroid/widget/TextView;", "getIndicatorTextView", "()Landroid/widget/TextView;", "setIndicatorTextView", "(Landroid/widget/TextView;)V", "indicatorTextView", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-multitask_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.multitask.animation.swipeahead.FloatMultiTaskIndicatorView */
public final class FloatMultiTaskIndicatorView extends FrameLayout {

    /* renamed from: d */
    public ImageView f315102d;

    /* renamed from: e */
    public ImageView f315103e;

    /* renamed from: f */
    public TextView f315104f;

    /* renamed from: g */
    public Vibrator f315105g;

    /* renamed from: h */
    public Animator f315106h;

    /* renamed from: i */
    public Animator f315107i;

    /* renamed from: j */
    public C107791e f315108j;

    /* renamed from: n */
    public Drawable f315109n;

    public FloatMultiTaskIndicatorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (C8480h) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FloatMultiTaskIndicatorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108591d(context);
        View.inflate(context, C0966R.C0971layout.b4h, this);
        this.f315102d = (ImageView) findViewById(C0966R.C0970id.a3b);
        this.f315103e = (ImageView) findViewById(C0966R.C0970id.f6l);
        this.f315104f = (TextView) findViewById(C0966R.C0970id.f6m);
        Object systemService = context.getSystemService("vibrator");
        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.os.Vibrator");
        this.f315105g = (Vibrator) systemService;
        float f = C105922o.f315117g;
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f315102d, "scaleX", new float[]{f, 1.0f});
        ofFloat.setDuration(200);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f315102d, "scaleY", new float[]{f, 1.0f});
        ofFloat2.setDuration(200);
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
        this.f315106h = animatorSet;
        AnimatorSet animatorSet2 = new AnimatorSet();
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f315102d, "scaleX", new float[]{1.0f, f});
        ofFloat3.setDuration(200);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.f315102d, "scaleY", new float[]{1.0f, f});
        ofFloat4.setDuration(200);
        animatorSet2.playTogether(new Animator[]{ofFloat3, ofFloat4});
        this.f315107i = animatorSet2;
    }

    public final ImageView getIndicatorImageView() {
        return this.f315103e;
    }

    public final TextView getIndicatorTextView() {
        return this.f315104f;
    }

    public ImageView getInnerIndicatorImageView() {
        return this.f315103e;
    }

    public TextView getInnerIndicatorTextView() {
        return this.f315104f;
    }

    public View getView() {
        return this;
    }

    public void onConfigurationChanged(Configuration configuration) {
        C87412m.m108594g(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        C107791e eVar = this.f315108j;
        if (eVar != null && eVar != null) {
            eVar.mo158204a(configuration.orientation == 2);
        }
    }

    public void setIconDrawable(Drawable drawable) {
        C87412m.m108594g(drawable, "drawable");
        this.f315109n = drawable;
        ImageView imageView = this.f315103e;
        if (imageView != null) {
            imageView.setImageDrawable(drawable);
        }
    }

    public final void setIndicatorImageView(ImageView imageView) {
        this.f315103e = imageView;
    }

    public final void setIndicatorTextView(TextView textView) {
        this.f315104f = textView;
    }

    public void setOnOrientationChangedListener(C107791e eVar) {
        this.f315108j = eVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FloatMultiTaskIndicatorView(Context context, AttributeSet attributeSet, int i, int i2, C8480h hVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
