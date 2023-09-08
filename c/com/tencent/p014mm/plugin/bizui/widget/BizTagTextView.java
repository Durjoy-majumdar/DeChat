package com.tencent.p014mm.plugin.bizui.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import kg3.C76577a;

/* renamed from: com.tencent.mm.plugin.bizui.widget.BizTagTextView */
public class BizTagTextView extends AppCompatTextView {

    /* renamed from: g */
    public RectF f197539g = new RectF(0.0f, 0.0f, 0.0f, 0.0f);

    /* renamed from: h */
    public Paint f197540h = new Paint();

    /* renamed from: i */
    public int f197541i = 3;

    /* renamed from: j */
    public int f197542j = 9;

    /* renamed from: n */
    public int f197543n = 0;

    public BizTagTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo94601a();
    }

    /* renamed from: a */
    public void mo94601a() {
        this.f197541i = Math.round(C76577a.m92156g(getContext()) * 1.0f);
        this.f197542j = C76577a.m92151b(getContext(), 3);
    }

    public void onDraw(Canvas canvas) {
        RectF rectF = this.f197539g;
        rectF.left = 0.0f;
        rectF.top = (float) this.f197541i;
        rectF.right = (float) getWidth();
        this.f197539g.bottom = (float) (getHeight() - this.f197541i);
        this.f197540h.setAntiAlias(true);
        int i = this.f197543n;
        if (i != 0) {
            this.f197540h.setColor(i);
            this.f197540h.setStyle(Paint.Style.FILL);
            RectF rectF2 = this.f197539g;
            int i2 = this.f197542j;
            canvas.drawRoundRect(rectF2, (float) i2, (float) i2, this.f197540h);
        }
        super.onDraw(canvas);
    }

    public void setFillColor(int i) {
        this.f197543n = i;
    }

    public BizTagTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo94601a();
    }
}
