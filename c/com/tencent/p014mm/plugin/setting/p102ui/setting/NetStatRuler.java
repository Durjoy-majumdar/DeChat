package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.NetStatRuler */
class NetStatRuler extends View {
    public NetStatRuler(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        TextPaint textPaint = new TextPaint();
        textPaint.setAntiAlias(true);
        textPaint.setDither(true);
        textPaint.setTextSize((float) getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3972lu));
        Rect rect = new Rect();
        getDrawingRect(rect);
        float height = (float) rect.height();
        float paddingLeft = (float) (rect.left + getPaddingLeft());
        int i = rect.top;
        float f = ((float) i) + (height / 3.0f);
        float f2 = ((float) i) + ((2.0f * height) / 3.0f);
        textPaint.setColor(-7829368);
        canvas.drawText(Util.getSizeMB((NetStatUnit.f205621f * 2) / 3), paddingLeft, f, textPaint);
        canvas.drawText(Util.getSizeMB(NetStatUnit.f205621f / 3), paddingLeft, f2, textPaint);
        canvas.drawText(Util.getSizeMB(0), paddingLeft, ((float) i) + height, textPaint);
    }

    public NetStatRuler(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
