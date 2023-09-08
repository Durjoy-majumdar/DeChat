package com.tencent.p014mm.plugin.card.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.TextView;
import kg3.C76577a;

/* renamed from: com.tencent.mm.plugin.card.widget.CardTagTextView */
public class CardTagTextView extends TextView {

    /* renamed from: d */
    public RectF f197614d = new RectF(0.0f, 0.0f, 0.0f, 0.0f);

    /* renamed from: e */
    public Paint f197615e = new Paint();

    /* renamed from: f */
    public int f197616f = 3;

    /* renamed from: g */
    public int f197617g = 9;

    /* renamed from: h */
    public int f197618h = 0;

    /* renamed from: i */
    public int f197619i = 0;

    public CardTagTextView(Context context) {
        super(context);
        mo94631a();
    }

    /* renamed from: a */
    public void mo94631a() {
        this.f197616f = Math.round(C76577a.m92156g(getContext()) * 0.5f);
        this.f197617g = C76577a.m92151b(getContext(), 3);
        this.f197618h = getCurrentTextColor();
    }

    public void onDraw(Canvas canvas) {
        RectF rectF = this.f197614d;
        rectF.left = (float) this.f197617g;
        rectF.top = (float) this.f197616f;
        rectF.right = (float) (getWidth() - this.f197617g);
        this.f197614d.bottom = (float) (getHeight() - this.f197616f);
        this.f197615e.setAntiAlias(true);
        int i = this.f197619i;
        if (i != 0) {
            this.f197615e.setColor(i);
            this.f197615e.setStyle(Paint.Style.FILL);
            canvas.drawRoundRect(this.f197614d, (float) ((getHeight() / 2) - this.f197616f), (float) ((getHeight() / 2) - this.f197616f), this.f197615e);
        }
        this.f197615e.setColor(this.f197618h);
        this.f197615e.setStrokeWidth((float) this.f197616f);
        this.f197615e.setStyle(Paint.Style.STROKE);
        canvas.drawRoundRect(this.f197614d, (float) ((getHeight() / 2) - this.f197616f), (float) ((getHeight() / 2) - this.f197616f), this.f197615e);
        super.onDraw(canvas);
    }

    public void setFillColor(int i) {
        this.f197619i = i;
    }

    public void setTextColor(int i) {
        this.f197618h = i;
        super.setTextColor(i);
    }

    public CardTagTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo94631a();
    }

    public CardTagTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo94631a();
    }
}
