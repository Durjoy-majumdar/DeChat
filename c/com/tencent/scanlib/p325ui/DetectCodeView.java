package com.tencent.scanlib.p325ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.scanlib.model.DetectCode;
import java.util.List;

/* renamed from: com.tencent.scanlib.ui.DetectCodeView */
public class DetectCodeView extends View {

    /* renamed from: d */
    public List<DetectCode> f221379d;

    /* renamed from: e */
    public Paint f221380e = new Paint();

    public DetectCodeView(Context context) {
        super(context);
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        List<DetectCode> list = this.f221379d;
        if (list != null && !list.isEmpty()) {
            for (DetectCode next : this.f221379d) {
                if (next.f221377e.size() == 4) {
                    canvas.drawRect(new Rect(next.f221377e.get(0).x, next.f221377e.get(0).y, next.f221377e.get(2).x, next.f221377e.get(2).y), this.f221380e);
                }
            }
        }
    }

    public void setDetectedCodes(List<DetectCode> list) {
        this.f221379d = list;
        if (list != null && !list.isEmpty()) {
            this.f221380e.reset();
            this.f221380e.setColor(-65536);
            this.f221380e.setStyle(Paint.Style.STROKE);
            this.f221380e.setAntiAlias(true);
            this.f221380e.setStrokeWidth(getResources().getDimension(C0966R.dimen.alm));
        }
        postInvalidate();
    }

    public DetectCodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DetectCodeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
