package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.mall_order_new_notify_icon */
public class mall_order_new_notify_icon extends C24542c {
    private final int height = 30;
    private final int width = 30;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 30;
        if (!(i2 == 0 || i2 == 1)) {
            i3 = 0;
            if (i2 == 2) {
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
                instancePaint3.setColor(-1158579);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(13.68f, 0.0f);
                instancePath.lineTo(16.09f, 0.0f);
                instancePath.cubicTo(23.29f, 0.5f, 29.35f, 6.53f, 30.0f, 13.69f);
                instancePath.lineTo(30.0f, 16.12f);
                instancePath.cubicTo(29.49f, 23.29f, 23.49f, 29.33f, 16.34f, 30.0f);
                instancePath.lineTo(13.89f, 30.0f);
                instancePath.cubicTo(6.7f, 29.49f, 0.65f, 23.47f, 0.0f, 16.32f);
                instancePath.lineTo(0.0f, 13.88f);
                instancePath.cubicTo(0.52f, 6.7f, 6.53f, 0.66f, 13.68f, 0.0f);
                instancePath.lineTo(13.68f, 0.0f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i3;
    }
}
