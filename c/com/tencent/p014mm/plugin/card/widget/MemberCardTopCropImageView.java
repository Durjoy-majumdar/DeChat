package com.tencent.p014mm.plugin.card.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import kg3.C76577a;

/* renamed from: com.tencent.mm.plugin.card.widget.MemberCardTopCropImageView */
public class MemberCardTopCropImageView extends ImageView {

    /* renamed from: d */
    public int f312093d = -1;

    /* renamed from: e */
    public int f312094e = -1;

    /* renamed from: f */
    public float f312095f;

    /* renamed from: g */
    public float f312096g;

    /* renamed from: h */
    public Path f312097h;

    /* renamed from: i */
    public RectF f312098i;

    public MemberCardTopCropImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo149415a();
    }

    /* renamed from: a */
    public void mo149415a() {
        setScaleType(ImageView.ScaleType.MATRIX);
        this.f312093d = C76577a.m92157h(MMApplicationContext.getContext(), C0966R.dimen.f4220wn);
        this.f312094e = C76577a.m92157h(MMApplicationContext.getContext(), C0966R.dimen.f3913iq) * 2;
    }

    public float getShowScale() {
        return this.f312095f;
    }

    public void onDraw(Canvas canvas) {
        RectF rectF = this.f312098i;
        if (!(rectF == null || this.f312097h == null)) {
            rectF.right = (float) getWidth();
            this.f312098i.bottom = (float) getHeight();
            Path path = this.f312097h;
            RectF rectF2 = this.f312098i;
            float f = this.f312096g;
            path.addRoundRect(rectF2, f, f, Path.Direction.CW);
            canvas.clipPath(this.f312097h);
        }
        super.onDraw(canvas);
    }

    public boolean setFrame(int i, int i2, int i3, int i4) {
        if (getDrawable() == null) {
            return super.setFrame(i, i2, i3, i4);
        }
        Matrix imageMatrix = getImageMatrix();
        int intrinsicWidth = getDrawable().getIntrinsicWidth();
        int intrinsicHeight = getDrawable().getIntrinsicHeight();
        int i5 = getContext().getResources().getDisplayMetrics().widthPixels - this.f312094e;
        int i6 = this.f312093d;
        if (intrinsicWidth * i6 > intrinsicHeight * i5) {
            this.f312095f = ((float) i6) / ((float) intrinsicHeight);
        } else {
            this.f312095f = ((float) i5) / ((float) intrinsicWidth);
        }
        float f = this.f312095f;
        imageMatrix.setScale(f, f);
        setImageMatrix(imageMatrix);
        return super.setFrame(i, i2, i3, i4);
    }

    public void setRadius(float f) {
        this.f312096g = f;
        if (f > 0.0f) {
            this.f312097h = new Path();
            this.f312098i = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    public MemberCardTopCropImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo149415a();
    }
}
