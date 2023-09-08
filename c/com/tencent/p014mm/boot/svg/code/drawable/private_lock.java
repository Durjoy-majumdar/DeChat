package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.private_lock */
public class private_lock extends C24542c {
    private final int height = 15;
    private final int width = 12;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            return 12;
        }
        if (i2 == 1) {
            return 15;
        }
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
            canvas.save();
            Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-436207616);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(3.33365f, 3.50016f);
            Path path = instancePath;
            path.cubicTo(3.33365f, 2.0274f, 4.52755f, 0.833496f, 6.00031f, 0.833496f);
            path.cubicTo(7.47307f, 0.833496f, 8.66698f, 2.0274f, 8.66698f, 3.50016f);
            instancePath.lineTo(8.66698f, 5.5001f);
            instancePath.lineTo(10.6664f, 5.5001f);
            instancePath.cubicTo(11.0349f, 5.5001f, 11.3337f, 5.79842f, 11.3337f, 6.16577f);
            instancePath.lineTo(11.3337f, 13.5011f);
            instancePath.cubicTo(11.3337f, 13.8687f, 11.0372f, 14.1668f, 10.6664f, 14.1668f);
            instancePath.lineTo(1.33424f, 14.1668f);
            instancePath.cubicTo(0.965728f, 14.1668f, 0.666992f, 13.8684f, 0.666992f, 13.5011f);
            instancePath.lineTo(0.666992f, 6.16577f);
            instancePath.cubicTo(0.666992f, 5.79813f, 0.963411f, 5.5001f, 1.33424f, 5.5001f);
            instancePath.lineTo(3.33365f, 5.5001f);
            instancePath.lineTo(3.33365f, 3.50016f);
            instancePath.close();
            instancePath.moveTo(7.86698f, 3.50016f);
            instancePath.lineTo(7.86698f, 5.5001f);
            instancePath.lineTo(4.13365f, 5.5001f);
            instancePath.lineTo(4.13365f, 3.50016f);
            Path path2 = instancePath;
            path2.cubicTo(4.13365f, 2.46923f, 4.96938f, 1.63349f, 6.00031f, 1.63349f);
            path2.cubicTo(7.03124f, 1.63349f, 7.86698f, 2.46923f, 7.86698f, 3.50016f);
            instancePath.close();
            instancePath.moveTo(1.46695f, 13.3667f);
            instancePath.lineTo(1.46695f, 6.30006f);
            instancePath.lineTo(10.5336f, 6.30006f);
            instancePath.lineTo(10.5336f, 13.3667f);
            instancePath.lineTo(1.46695f, 13.3667f);
            instancePath.close();
            instancePath.moveTo(5.00032f, 9.16677f);
            instancePath.cubicTo(5.00032f, 9.57684f, 5.24714f, 9.92925f, 5.60032f, 10.0836f);
            instancePath.lineTo(5.60032f, 11.5001f);
            instancePath.lineTo(6.40032f, 11.5001f);
            instancePath.lineTo(6.40032f, 10.0836f);
            Path path3 = instancePath;
            path3.cubicTo(6.7535f, 9.92926f, 7.00032f, 9.57684f, 7.00032f, 9.16677f);
            path3.cubicTo(7.00032f, 8.61449f, 6.55261f, 8.16677f, 6.00032f, 8.16677f);
            path3.cubicTo(5.44804f, 8.16677f, 5.00032f, 8.61449f, 5.00032f, 9.16677f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 2);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
