package com.tencent.p014mm.plugin.scanner.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.scanner.view.MultiRectView */
public class MultiRectView extends View {

    /* renamed from: d */
    public List<Rect> f20611d;

    /* renamed from: e */
    public Paint f20612e = new Paint();

    /* renamed from: f */
    public Paint f20613f = new Paint();

    public MultiRectView(Context context) {
        super(context);
        new ArrayList();
        mo6148a();
    }

    /* renamed from: a */
    public final void mo6148a() {
        this.f20612e.setStyle(Paint.Style.STROKE);
        this.f20612e.setStrokeWidth(8.0f);
        this.f20612e.setColor(-65536);
        this.f20612e.setAntiAlias(true);
        this.f20613f.setAntiAlias(true);
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        List<Rect> list = this.f20611d;
        if (list != null && !list.isEmpty()) {
            for (Rect next : this.f20611d) {
                if (next != null) {
                    canvas.save();
                    canvas.clipRect(next, Region.Op.DIFFERENCE);
                    canvas.drawRect(next, this.f20612e);
                    canvas.restore();
                }
            }
        }
    }

    public void setRect(List<Rect> list) {
        this.f20611d = list;
        if (list == null || list.isEmpty()) {
            setVisibility(8);
            Log.m105920e("MicroMsg.MultiRectView", "setRect:" + list);
            return;
        }
        Log.m105924i("MicroMsg.MultiRectView", "setRect:" + list.size());
        setVisibility(0);
        invalidate();
    }

    public MultiRectView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new ArrayList();
        mo6148a();
    }

    public MultiRectView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        new ArrayList();
        mo6148a();
    }
}
