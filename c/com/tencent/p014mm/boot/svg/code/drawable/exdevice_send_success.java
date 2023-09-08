package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.exdevice_send_success */
public class exdevice_send_success extends C24542c {
    private final int height = 64;
    private final int width = 64;

    public int doCommand(int i, Object... objArr) {
        int i2 = 64;
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
                canvas.save();
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-16268960);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(32.0f, 0.0f);
                Path path = instancePath;
                path.cubicTo(49.67311f, 0.0f, 64.0f, 14.326888f, 64.0f, 32.0f);
                path.cubicTo(64.0f, 49.67311f, 49.67311f, 64.0f, 32.0f, 64.0f);
                path.cubicTo(14.326888f, 64.0f, 0.0f, 49.67311f, 0.0f, 32.0f);
                path.cubicTo(0.0f, 14.326888f, 14.326888f, 0.0f, 32.0f, 0.0f);
                instancePath.close();
                instancePath.moveTo(46.152813f, 20.928f);
                instancePath.lineTo(28.234999f, 38.845814f);
                instancePath.lineTo(19.38412f, 29.994934f);
                instancePath.lineTo(16.0f, 33.379055f);
                instancePath.lineTo(26.956928f, 44.343906f);
                instancePath.cubicTo(26.956797f, 44.344173f, 26.956863f, 44.34424f, 26.956928f, 44.344303f);
                instancePath.lineTo(27.07918f, 44.456097f);
                instancePath.cubicTo(27.793375f, 45.05233f, 28.85748f, 45.015285f, 29.528028f, 44.34464f);
                instancePath.lineTo(29.528028f, 44.34464f);
                instancePath.lineTo(49.552902f, 24.328089f);
                instancePath.lineTo(46.152813f, 20.928f);
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
