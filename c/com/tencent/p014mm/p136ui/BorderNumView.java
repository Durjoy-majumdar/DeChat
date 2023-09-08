package com.tencent.p014mm.p136ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;

/* renamed from: com.tencent.mm.ui.BorderNumView */
public class BorderNumView extends View {

    /* renamed from: g */
    public static int f24140g = 22;

    /* renamed from: h */
    public static int f24141h = 100;

    /* renamed from: d */
    public Context f24142d;

    /* renamed from: e */
    public Paint f24143e;

    /* renamed from: f */
    public int f24144f = 100;

    public BorderNumView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f24142d = context;
        this.f24143e = new Paint();
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i = this.f24144f;
        if (i < 100) {
            f24140g += 15;
        }
        if (i >= 1000) {
            f24141h -= 20;
        }
        float fromDPToPix = (float) BackwardSupportUtil.BitmapFactory.fromDPToPix(this.f24142d, (float) f24140g);
        float fromDPToPix2 = (float) BackwardSupportUtil.BitmapFactory.fromDPToPix(this.f24142d, (float) 105);
        String str = this.f24144f + "";
        this.f24143e.setAntiAlias(true);
        this.f24143e.setTextSize((float) f24141h);
        this.f24143e.setColor(-11491572);
        this.f24143e.setStyle(Paint.Style.STROKE);
        this.f24143e.setStrokeWidth(8.0f);
        canvas.drawText(str, fromDPToPix, fromDPToPix2, this.f24143e);
        this.f24143e.setTextSize((float) f24141h);
        this.f24143e.setColor(-1770573);
        this.f24143e.setStyle(Paint.Style.FILL);
        this.f24143e.setStrokeWidth(8.0f);
        canvas.drawText(str, fromDPToPix, fromDPToPix2, this.f24143e);
    }

    public void setPaintNum(int i) {
        this.f24144f = i;
    }

    public BorderNumView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24142d = context;
        this.f24143e = new Paint();
    }
}
