package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icon_filled_subscriptions */
public class icon_filled_subscriptions extends C24542c {
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
                canvas.save();
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-436207616);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(4.0f, 3.0f);
                instancePath.cubicTo(4.0f, 2.44772f, 4.44772f, 2.0f, 5.0f, 2.0f);
                instancePath.lineTo(19.0f, 2.0f);
                instancePath.cubicTo(19.5523f, 2.0f, 20.0f, 2.44772f, 20.0f, 3.0f);
                instancePath.lineTo(20.0f, 21.0f);
                instancePath.cubicTo(20.0f, 21.5523f, 19.5523f, 22.0f, 19.0f, 22.0f);
                instancePath.lineTo(5.0f, 22.0f);
                instancePath.cubicTo(4.44772f, 22.0f, 4.0f, 21.5523f, 4.0f, 21.0f);
                instancePath.lineTo(4.0f, 3.0f);
                instancePath.close();
                instancePath.moveTo(8.5f, 8.0f);
                Path path = instancePath;
                path.cubicTo(9.32843f, 8.0f, 10.0f, 7.32843f, 10.0f, 6.5f);
                path.cubicTo(10.0f, 5.67157f, 9.32843f, 5.0f, 8.5f, 5.0f);
                path.cubicTo(7.67157f, 5.0f, 7.0f, 5.67157f, 7.0f, 6.5f);
                path.cubicTo(7.0f, 7.32843f, 7.67157f, 8.0f, 8.5f, 8.0f);
                instancePath.close();
                instancePath.moveTo(7.0f, 10.0f);
                instancePath.lineTo(7.0f, 11.5f);
                instancePath.lineTo(14.5f, 11.5f);
                instancePath.lineTo(14.5f, 10.0f);
                instancePath.lineTo(7.0f, 10.0f);
                instancePath.close();
                instancePath.moveTo(7.0f, 13.0f);
                instancePath.lineTo(7.0f, 14.5f);
                instancePath.lineTo(11.0f, 14.5f);
                instancePath.lineTo(11.0f, 13.0f);
                instancePath.lineTo(7.0f, 13.0f);
                instancePath.close();
                instancePath.moveTo(7.0f, 16.0f);
                instancePath.lineTo(7.0f, 17.5f);
                instancePath.lineTo(11.0f, 17.5f);
                instancePath.lineTo(11.0f, 16.0f);
                instancePath.lineTo(7.0f, 16.0f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i2;
    }
}
