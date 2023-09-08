package com.tencent.p014mm.p136ui.widget.imageview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.util.AttributeSet;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.view.x2c.X2CImageView;
import yo3.C79142a;

/* renamed from: com.tencent.mm.ui.widget.imageview.WeImageView */
public class WeImageView extends X2CImageView {

    /* renamed from: f */
    public int f220611f;

    /* renamed from: g */
    public float f220612g = 1.0f;

    /* renamed from: h */
    public int f220613h;

    /* renamed from: i */
    public int f220614i = 255;

    /* renamed from: j */
    public int f220615j = 255;

    /* renamed from: n */
    public boolean f220616n = true;

    /* renamed from: o */
    public boolean f220617o = false;

    /* renamed from: p */
    public boolean f220618p = true;

    /* renamed from: q */
    public boolean f220619q = false;

    public WeImageView(Context context) {
        super(context);
        mo104516p(context, (AttributeSet) null);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        int i = this.f220614i;
        if (isPressed()) {
            i = 127;
        } else if (isEnabled()) {
            i = this.f220614i;
        }
        if (!isEnabled() || !isFocusable()) {
            i = 255;
        }
        if (isPressed() && this.f220619q) {
            i = (int) (((double) this.f220614i) * 0.5d);
        }
        if (i != this.f220615j) {
            this.f220615j = i;
            if (getDrawable() != null) {
                getDrawable().setAlpha(i);
            }
        }
    }

    public int getIconColor() {
        return this.f220611f;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f220617o && this.f220616n) {
            getDrawable().mutate().clearColorFilter();
            this.f220617o = false;
            this.f220616n = false;
        } else if (!this.f220618p && getDrawable() != null && this.f220616n) {
            getDrawable().mutate().clearColorFilter();
            this.f220616n = false;
        } else if (this.f220618p && getDrawable() != null && this.f220616n) {
            int i = this.f220611f;
            int i2 = i != 0 ? (16777215 & i) | -16777216 : i;
            int alpha = Color.alpha(i);
            float f = this.f220612g;
            if (f != 1.0f) {
                alpha = (int) (f * 255.0f);
            }
            getDrawable().mutate().setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_ATOP));
            if (this.f220611f != 0) {
                this.f220614i = alpha;
                getDrawable().setAlpha(alpha);
            }
            this.f220616n = false;
        }
    }

    /* renamed from: p */
    public final void mo104516p(Context context, AttributeSet attributeSet) {
        int color = context.getResources().getColor(C0966R.color.FG_0);
        this.f220613h = color;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C79142a.f232414m);
            this.f220611f = obtainStyledAttributes.getColor(1, this.f220613h);
            this.f220612g = obtainStyledAttributes.getFloat(0, 1.0f);
            obtainStyledAttributes.recycle();
            return;
        }
        this.f220611f = color;
    }

    /* renamed from: q */
    public void mo104517q(int i, float f) {
        this.f220611f = i;
        this.f220612g = f;
        this.f220616n = true;
        invalidate();
    }

    /* renamed from: r */
    public void mo104518r(int i, int i2) {
        setImageResource(i);
        setIconColor(getContext().getResources().getColor(i2));
    }

    public void setClearColorFilter(boolean z) {
        this.f220617o = z;
        this.f220616n = true;
        invalidate();
    }

    public void setEnableColorFilter(boolean z) {
        if (this.f220618p != z) {
            this.f220618p = z;
            this.f220616n = true;
            invalidate();
        }
    }

    public void setEnableHighlight(boolean z) {
        this.f220619q = z;
    }

    public void setIconAlpha(float f) {
        this.f220612g = f;
        this.f220616n = true;
        invalidate();
    }

    public void setIconColor(int i) {
        this.f220611f = i;
        this.f220616n = true;
        invalidate();
    }

    public void setImageResource(int i) {
        super.setImageResource(i);
        setIconColor(this.f220611f);
    }

    public WeImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo104516p(context, attributeSet);
    }

    public WeImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo104516p(context, attributeSet);
    }
}
