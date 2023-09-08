package com.tencent.p014mm.plugin.webview.luggage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/* renamed from: com.tencent.mm.plugin.webview.luggage.RedDotView */
public class RedDotView extends View {

    /* renamed from: d */
    public Paint f22081d = new Paint();

    public RedDotView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f22081d.setColor(-65536);
        canvas.drawCircle(((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f, (float) (getWidth() / 2), this.f22081d);
    }
}
