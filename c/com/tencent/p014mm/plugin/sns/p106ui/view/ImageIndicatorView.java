package com.tencent.p014mm.plugin.sns.p106ui.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;

/* renamed from: com.tencent.mm.plugin.sns.ui.view.ImageIndicatorView */
public class ImageIndicatorView extends View {

    /* renamed from: d */
    public Paint f21257d;

    /* renamed from: e */
    public int f21258e;

    /* renamed from: f */
    public int f21259f;

    /* renamed from: g */
    public int f21260g;

    /* renamed from: h */
    public int f21261h;

    /* renamed from: i */
    public int f21262i;

    public ImageIndicatorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21257d = new Paint();
        this.f21258e = 0;
        this.f21259f = 0;
        this.f21260g = 0;
        this.f21261h = 0;
        this.f21262i = 0;
        this.f21259f = C74942w4.m89784a(getContext(), 4);
        this.f21260g = C74942w4.m89784a(getContext(), 2);
    }

    /* renamed from: a */
    public void mo6498a(int i) {
        this.f21258e = i;
    }

    public void onDraw(Canvas canvas) {
        if (this.f21258e > 0) {
            int measuredWidth = getMeasuredWidth() / 2;
            int i = this.f21258e;
            if (i > 1) {
                int i2 = this.f21260g;
                measuredWidth -= (((i2 + i2) * i) + ((i - 1) * this.f21259f)) / 2;
            }
            for (int i3 = 0; i3 < this.f21258e; i3++) {
                if (i3 == 0) {
                    if (this.f21261h != 0) {
                        this.f21257d.setColor(getContext().getResources().getColor(this.f21261h));
                    } else {
                        this.f21257d.setColor(getContext().getResources().getColor(C0966R.color.Orange_100));
                    }
                } else if (this.f21262i != 0) {
                    this.f21257d.setColor(getContext().getResources().getColor(this.f21262i));
                } else {
                    this.f21257d.setColor(getContext().getResources().getColor(C0966R.color.BW_90));
                }
                int measuredHeight = getMeasuredHeight() - (getPaddingBottom() + getPaddingTop());
                int i4 = this.f21259f;
                int i5 = this.f21260g;
                canvas.drawCircle((float) (((i4 + i5 + i5) * i3) + measuredWidth), (float) (getPaddingTop() + (measuredHeight / 2)), (float) this.f21260g, this.f21257d);
            }
        }
    }

    public ImageIndicatorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f21257d = new Paint();
        this.f21258e = 0;
        this.f21259f = 0;
        this.f21260g = 0;
        this.f21261h = 0;
        this.f21262i = 0;
        this.f21259f = C74942w4.m89784a(getContext(), 4);
        this.f21260g = C74942w4.m89784a(getContext(), 2);
    }
}
