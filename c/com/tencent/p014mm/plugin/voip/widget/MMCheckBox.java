package com.tencent.p014mm.plugin.voip.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckBox;

/* renamed from: com.tencent.mm.plugin.voip.widget.MMCheckBox */
public class MMCheckBox extends CheckBox {

    /* renamed from: d */
    public Drawable f318165d;

    /* renamed from: e */
    public int f318166e;

    public MMCheckBox(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f318165d != null) {
            this.f318165d.setState(getDrawableState());
            invalidate();
        }
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f318165d;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Drawable drawable = this.f318165d;
        if (drawable != null) {
            int gravity = getGravity() & 112;
            int gravity2 = getGravity() & 7;
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int i = 0;
            int height = gravity != 16 ? gravity != 80 ? 0 : getHeight() - intrinsicHeight : (getHeight() - intrinsicHeight) / 2;
            if (gravity2 == 1) {
                i = (getWidth() - intrinsicWidth) / 2;
            } else if (gravity2 == 5) {
                i = getWidth() - intrinsicWidth;
            }
            drawable.setBounds(i, height, intrinsicWidth + i, intrinsicHeight + height);
            drawable.draw(canvas);
        }
    }

    public void setButtonDrawable(int i) {
        if (i == 0 || i != this.f318166e) {
            this.f318166e = i;
            Drawable drawable = null;
            if (i != 0) {
                drawable = getResources().getDrawable(this.f318166e);
            }
            setButtonDrawable(drawable);
        }
    }

    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f318165d;
    }

    public MMCheckBox(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setButtonDrawable(Drawable drawable) {
        this.f318165d = drawable;
    }
}
