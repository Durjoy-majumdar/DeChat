package com.tencent.p014mm.p136ui.widget.imageview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.util.AttributeSet;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.view.x2c.X2CAppCompatImageButton;
import yo3.C79142a;

/* renamed from: com.tencent.mm.ui.widget.imageview.WeImageButton */
public class WeImageButton extends X2CAppCompatImageButton {

    /* renamed from: f */
    public int f220608f;

    /* renamed from: g */
    public int f220609g;

    /* renamed from: h */
    public boolean f220610h = true;

    public WeImageButton(Context context) {
        super(context, (AttributeSet) null);
        mo104510c(context, (AttributeSet) null);
    }

    /* renamed from: c */
    public final void mo104510c(Context context, AttributeSet attributeSet) {
        int color = context.getResources().getColor(C0966R.color.FG_0);
        this.f220609g = color;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C79142a.f232413l);
            this.f220608f = obtainStyledAttributes.getColor(1, this.f220609g);
            obtainStyledAttributes.recycle();
            return;
        }
        this.f220608f = color;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (getDrawable() != null && this.f220610h) {
            getDrawable().setColorFilter(new PorterDuffColorFilter(this.f220608f, PorterDuff.Mode.SRC_ATOP));
            this.f220610h = false;
        }
    }

    public void setIconColor(int i) {
        this.f220608f = i;
        this.f220610h = true;
        invalidate();
    }

    public void setImageResource(int i) {
        super.setImageResource(i);
        setIconColor(this.f220608f);
    }

    public WeImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo104510c(context, attributeSet);
    }

    public WeImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo104510c(context, attributeSet);
    }
}
