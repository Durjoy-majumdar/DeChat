package com.tencent.p014mm.plugin.sns.p106ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import kg3.C76577a;
import yn2.C79141n0;

/* renamed from: com.tencent.mm.plugin.sns.ui.widget.SnsTextProgressBar */
public class SnsTextProgressBar extends ProgressBar {

    /* renamed from: d */
    public String f206221d;

    /* renamed from: e */
    public Paint f206222e;

    /* renamed from: f */
    public Context f206223f;

    /* renamed from: g */
    public int f206224g;

    /* renamed from: h */
    public String f206225h;

    public SnsTextProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f206223f = context;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C79141n0.f232401b, 0, 0);
        try {
            setTextSize(obtainStyledAttributes.getInteger(0, 18));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private void setText(int i) {
        SnsMethodCalculate.markStartTimeMs("setText", "com.tencent.mm.plugin.sns.ui.widget.SnsTextProgressBar");
        this.f206221d = String.valueOf(i) + "%";
        SnsMethodCalculate.markEndTimeMs("setText", "com.tencent.mm.plugin.sns.ui.widget.SnsTextProgressBar");
    }

    public synchronized void onDraw(Canvas canvas) {
        int i;
        SnsMethodCalculate.markStartTimeMs("onDraw", "com.tencent.mm.plugin.sns.ui.widget.SnsTextProgressBar");
        super.onDraw(canvas);
        Paint paint = new Paint();
        this.f206222e = paint;
        paint.setAntiAlias(true);
        String str = this.f206225h;
        if (str != null) {
            if (str.length() > 0) {
                i = Color.parseColor(this.f206225h);
                this.f206222e.setColor(i);
                this.f206222e.setTextSize((float) this.f206224g);
                Rect rect = new Rect();
                Paint paint2 = this.f206222e;
                String str2 = this.f206221d;
                paint2.getTextBounds(str2, 0, str2.length(), rect);
                float height = (float) ((getHeight() / 2) - rect.centerY());
                canvas.drawText(this.f206221d, (float) ((getWidth() / 2) - rect.centerX()), height, this.f206222e);
                SnsMethodCalculate.markEndTimeMs("onDraw", "com.tencent.mm.plugin.sns.ui.widget.SnsTextProgressBar");
            }
        }
        i = this.f206223f.getResources().getColor(C0966R.color.alb);
        this.f206222e.setColor(i);
        this.f206222e.setTextSize((float) this.f206224g);
        Rect rect2 = new Rect();
        Paint paint22 = this.f206222e;
        String str22 = this.f206221d;
        paint22.getTextBounds(str22, 0, str22.length(), rect2);
        float height2 = (float) ((getHeight() / 2) - rect2.centerY());
        canvas.drawText(this.f206221d, (float) ((getWidth() / 2) - rect2.centerX()), height2, this.f206222e);
        SnsMethodCalculate.markEndTimeMs("onDraw", "com.tencent.mm.plugin.sns.ui.widget.SnsTextProgressBar");
    }

    public void setPaintColor(String str) {
        SnsMethodCalculate.markStartTimeMs("setPaintColor", "com.tencent.mm.plugin.sns.ui.widget.SnsTextProgressBar");
        this.f206225h = str;
        SnsMethodCalculate.markEndTimeMs("setPaintColor", "com.tencent.mm.plugin.sns.ui.widget.SnsTextProgressBar");
    }

    public void setProgress(int i) {
        SnsMethodCalculate.markStartTimeMs("setProgress", "com.tencent.mm.plugin.sns.ui.widget.SnsTextProgressBar");
        setText(i);
        super.setProgress(i);
        SnsMethodCalculate.markEndTimeMs("setProgress", "com.tencent.mm.plugin.sns.ui.widget.SnsTextProgressBar");
    }

    public void setTextSize(int i) {
        SnsMethodCalculate.markStartTimeMs("setTextSize", "com.tencent.mm.plugin.sns.ui.widget.SnsTextProgressBar");
        this.f206224g = C76577a.m92151b(this.f206223f, i);
        SnsMethodCalculate.markEndTimeMs("setTextSize", "com.tencent.mm.plugin.sns.ui.widget.SnsTextProgressBar");
    }
}
