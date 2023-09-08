package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.finder_live_music_menu */
public class finder_live_music_menu extends C24542c {
    private final int height = 24;
    private final int width = 24;

    public int doCommand(int i, Object... objArr) {
        int i2 = 24;
        if (!(i == 0 || i == 1)) {
            i2 = 0;
            if (i == 2) {
                Canvas canvas = objArr[0];
                Looper looper = objArr[1];
                C24542c.instanceMatrix(looper);
                C24542c.instanceMatrixArray(looper);
                Paint instancePaint = C24542c.instancePaint(looper);
                instancePaint.setFlags(385);
                instancePaint.setStyle(Paint.Style.FILL);
                Paint instancePaint2 = C24542c.instancePaint(looper);
                instancePaint2.setFlags(385);
                instancePaint2.setStyle(Paint.Style.STROKE);
                instancePaint.setColor(-16777216);
                instancePaint2.setStrokeWidth(1.0f);
                instancePaint2.setStrokeCap(Paint.Cap.BUTT);
                instancePaint2.setStrokeJoin(Paint.Join.MITER);
                instancePaint2.setStrokeMiter(4.0f);
                instancePaint2.setPathEffect((PathEffect) null);
                C24542c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(0.0f, 0.0f);
                instancePath.lineTo(24.0f, 0.0f);
                instancePath.lineTo(24.0f, 24.0f);
                instancePath.lineTo(0.0f, 24.0f);
                instancePath.lineTo(0.0f, 0.0f);
                instancePath.close();
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-1);
                Path instancePath2 = C24542c.instancePath(looper);
                instancePath2.moveTo(6.0f, 17.0f);
                instancePath2.lineTo(6.0f, 18.4f);
                instancePath2.lineTo(4.0f, 18.4f);
                instancePath2.lineTo(4.0f, 17.0f);
                instancePath2.lineTo(6.0f, 17.0f);
                instancePath2.close();
                instancePath2.moveTo(20.0f, 17.0f);
                instancePath2.lineTo(20.0f, 18.4f);
                instancePath2.lineTo(7.6f, 18.4f);
                instancePath2.lineTo(7.6f, 17.0f);
                instancePath2.lineTo(20.0f, 17.0f);
                instancePath2.close();
                instancePath2.moveTo(6.0f, 11.0f);
                instancePath2.lineTo(6.0f, 12.4f);
                instancePath2.lineTo(4.0f, 12.4f);
                instancePath2.lineTo(4.0f, 11.0f);
                instancePath2.lineTo(6.0f, 11.0f);
                instancePath2.close();
                instancePath2.moveTo(20.0f, 11.0f);
                instancePath2.lineTo(20.0f, 12.4f);
                instancePath2.lineTo(7.6f, 12.4f);
                instancePath2.lineTo(7.6f, 11.0f);
                instancePath2.lineTo(20.0f, 11.0f);
                instancePath2.close();
                instancePath2.moveTo(20.0f, 5.0f);
                instancePath2.lineTo(20.0f, 6.4f);
                instancePath2.lineTo(7.6f, 6.399f);
                instancePath2.lineTo(7.6f, 5.0f);
                instancePath2.lineTo(20.0f, 5.0f);
                instancePath2.close();
                instancePath2.moveTo(6.0f, 6.399f);
                instancePath2.lineTo(4.0f, 6.4f);
                instancePath2.lineTo(4.0f, 5.0f);
                instancePath2.lineTo(6.0f, 5.0f);
                instancePath2.lineTo(6.0f, 6.399f);
                instancePath2.close();
                canvas.saveLayerAlpha((RectF) null, 205, 31);
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint4);
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i2;
    }
}
