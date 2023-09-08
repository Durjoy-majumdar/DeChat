package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.NetStatUnit */
class NetStatUnit extends View {

    /* renamed from: f */
    public static long f205621f;

    /* renamed from: d */
    public long f205622d;

    /* renamed from: e */
    public long f205623e;

    public NetStatUnit(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public void mo97696a(long j, long j2) {
        this.f205622d = j;
        this.f205623e = j2;
        long j3 = 94371840;
        if (j > 94371840) {
            this.f205622d = 94371840;
        }
        if (j2 > 94371840) {
            this.f205623e = 94371840;
        }
        if (j <= j2) {
            j = j2;
        }
        long j4 = ((j / 1572864) + 1) * 1572864;
        if (94371840 > j4) {
            j3 = j4;
        }
        if (3145728 >= j3) {
            j3 = 3145728;
        }
        if (j3 > f205621f) {
            f205621f = j3;
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        Rect rect = new Rect();
        getDrawingRect(rect);
        float height = (((float) rect.height()) * ((float) this.f205623e)) / ((float) f205621f);
        int i = rect.left;
        int i2 = rect.bottom;
        Rect rect2 = new Rect(i, (int) (((float) i2) - height), (int) (((float) i) + (((float) rect.width()) * 0.6f)), i2);
        paint.setColor(-7829368);
        canvas.drawRect(rect2, paint);
        float height2 = (((float) rect.height()) * ((float) this.f205622d)) / ((float) f205621f);
        int i3 = rect.left;
        int i4 = rect.bottom;
        Rect rect3 = new Rect(i3, (int) (((float) i4) - height2), (int) (((float) i3) + (((float) rect.width()) * 0.6f)), i4);
        paint.setColor(-16711936);
        canvas.drawRect(rect3, paint);
    }

    public NetStatUnit(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
