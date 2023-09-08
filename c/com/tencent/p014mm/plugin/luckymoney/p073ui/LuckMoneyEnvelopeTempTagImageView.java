package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.widget.ImageView;
import kg3.C76577a;
import tb3.C77881d;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckMoneyEnvelopeTempTagImageView */
public class LuckMoneyEnvelopeTempTagImageView extends ImageView {

    /* renamed from: d */
    public Paint f199626d = new Paint();

    /* renamed from: e */
    public Path f199627e = new Path();

    /* renamed from: f */
    public String f199628f = "";

    public LuckMoneyEnvelopeTempTagImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f199626d.setAntiAlias(true);
        mo95499a(context, attributeSet, -1);
    }

    /* renamed from: a */
    public final void mo95499a(Context context, AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C77881d.f226908b, i, 0);
        this.f199628f = obtainStyledAttributes.getString(0);
        this.f199626d.setColor(obtainStyledAttributes.getColor(1, 0));
        this.f199626d.setTextSize((float) obtainStyledAttributes.getDimensionPixelSize(2, 0));
        obtainStyledAttributes.recycle();
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f199627e.moveTo(0.0f, 0.0f);
        float b = (float) C76577a.m92151b(getContext(), 98);
        this.f199627e.lineTo(b, b);
        canvas.drawTextOnPath(this.f199628f, this.f199627e, (float) ((int) ((((float) C76577a.m92151b(getContext(), 139)) - this.f199626d.measureText(this.f199628f)) / 2.0f)), -30.0f, this.f199626d);
    }

    public LuckMoneyEnvelopeTempTagImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f199626d.setAntiAlias(true);
        mo95499a(context, attributeSet, i);
    }
}
