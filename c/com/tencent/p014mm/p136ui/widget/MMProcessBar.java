package com.tencent.p014mm.p136ui.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;

/* renamed from: com.tencent.mm.ui.widget.MMProcessBar */
public class MMProcessBar extends View {

    /* renamed from: d */
    public float f165510d = 0.0f;

    /* renamed from: e */
    public Animation f165511e = new RotateAnimation(0.0f, 360.0f);

    public MMProcessBar(Context context) {
        super(context);
    }

    /* renamed from: a */
    public void mo82301a(float f) {
        Animation animation = this.f165511e;
        if (animation != null && !animation.hasEnded()) {
            this.f165511e.cancel();
        }
        float f2 = this.f165510d + f;
        this.f165510d = f2;
        setRotation(f2 * 360.0f);
    }

    /* renamed from: b */
    public void mo82302b(int i, int i2) {
        try {
            Drawable drawable = getResources().getDrawable(i);
            drawable.setColorFilter(MMApplicationContext.getContext().getResources().getColor(C0966R.color.BW_70), PorterDuff.Mode.SRC_ATOP);
            if (i2 != 0) {
                drawable.setTintList(ColorStateList.valueOf(i2));
            }
            setBackground(drawable);
        } catch (Exception unused) {
        }
    }

    /* renamed from: c */
    public void mo82303c() {
        if (getVisibility() == 0) {
            startAnimation(this.f165511e);
            return;
        }
        Log.m105929w("MicroMsg.MMProcessBar", "[startRotate] startRotate fail. this view Visibility=%s", Integer.valueOf(getVisibility()));
    }

    /* renamed from: d */
    public void mo82304d() {
        Animation animation = this.f165511e;
        if (animation != null) {
            animation.cancel();
        }
        clearAnimation();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        mo82303c();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo82304d();
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            mo82304d();
            RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 72000.0f, ((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f);
            this.f165511e = rotateAnimation;
            rotateAnimation.setRepeatMode(-1);
            this.f165511e.setRepeatCount(-1);
            this.f165511e.setDuration(70000);
            this.f165511e.setInterpolator(new LinearInterpolator());
            if (getVisibility() == 0) {
                mo82303c();
            }
        }
    }

    public void setDuration(long j) {
        this.f165511e.setDuration(j);
    }

    public void setInterpolator(Interpolator interpolator) {
        this.f165511e.setInterpolator(interpolator);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0) {
            mo82303c();
        } else {
            mo82304d();
        }
    }

    public MMProcessBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MMProcessBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
