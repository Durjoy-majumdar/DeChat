package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.finder_like_new_style_outlined_normal_bold */
public class finder_like_new_style_outlined_normal_bold extends C24542c {
    private final int height = 72;
    private final int width = 72;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 72;
        }
        if (i2 != 2) {
            return 0;
        }
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
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-2565928);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(0.0f, 0.0f);
        instancePath.lineTo(72.0f, 0.0f);
        instancePath.lineTo(72.0f, 72.0f);
        instancePath.lineTo(0.0f, 72.0f);
        instancePath.lineTo(0.0f, 0.0f);
        instancePath.close();
        canvas.saveLayerAlpha((RectF) null, 0, 31);
        canvas.drawPath(instancePath, C24542c.instancePaint(instancePaint3, looper));
        canvas.restore();
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-16777216);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(30.362f, 14.999f);
        instancePath2.lineTo(40.5f, 15.0f);
        instancePath2.cubicTo(50.441124f, 15.0f, 58.5f, 23.058874f, 58.5f, 33.0f);
        instancePath2.lineTo(58.5f, 49.826546f);
        instancePath2.lineTo(61.34056f, 46.988377f);
        instancePath2.lineTo(66.00747f, 51.65528f);
        instancePath2.lineTo(55.188732f, 62.474014f);
        instancePath2.lineTo(44.37f, 51.65528f);
        instancePath2.lineTo(49.036903f, 46.988377f);
        instancePath2.lineTo(51.9f, 49.852547f);
        instancePath2.lineTo(51.9f, 33.0f);
        instancePath2.cubicTo(51.9f, 26.900705f, 47.110058f, 21.920162f, 41.086643f, 21.614834f);
        instancePath2.lineTo(40.5f, 21.6f);
        instancePath2.lineTo(36.963f, 21.599f);
        instancePath2.lineTo(30.362f, 14.999f);
        instancePath2.close();
        instancePath2.moveTo(16.758734f, 9.516547f);
        instancePath2.lineTo(27.577467f, 20.335281f);
        instancePath2.lineTo(22.910563f, 25.002186f);
        instancePath2.lineTo(20.1f, 22.192547f);
        instancePath2.lineTo(20.1f, 39.0f);
        instancePath2.cubicTo(20.1f, 45.099297f, 24.88994f, 50.079838f, 30.913357f, 50.385166f);
        instancePath2.lineTo(31.5f, 50.4f);
        instancePath2.lineTo(35.036f, 50.399f);
        instancePath2.lineTo(41.635f, 56.999f);
        instancePath2.lineTo(31.5f, 57.0f);
        instancePath2.cubicTo(21.558874f, 57.0f, 13.5f, 48.941124f, 13.5f, 39.0f);
        instancePath2.lineTo(13.5f, 22.106548f);
        instancePath2.lineTo(10.606905f, 25.002186f);
        instancePath2.lineTo(5.94f, 20.335281f);
        instancePath2.lineTo(16.758734f, 9.516547f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
