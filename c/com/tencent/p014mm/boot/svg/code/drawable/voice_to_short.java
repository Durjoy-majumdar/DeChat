package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.voice_to_short */
public class voice_to_short extends C24542c {
    private final int height = 80;
    private final int width = 80;

    public int doCommand(int i, Object... objArr) {
        int i2 = 80;
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
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-1);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(40.0f, 73.333336f);
                Path path = instancePath;
                path.cubicTo(21.590508f, 73.333336f, 6.6666665f, 58.409492f, 6.6666665f, 40.0f);
                path.cubicTo(6.6666665f, 21.590508f, 21.590508f, 6.6666665f, 40.0f, 6.6666665f);
                path.cubicTo(58.409492f, 6.6666665f, 73.333336f, 21.590508f, 73.333336f, 40.0f);
                path.cubicTo(73.333336f, 58.409492f, 58.409492f, 73.333336f, 40.0f, 73.333336f);
                instancePath.close();
                instancePath.moveTo(37.45573f, 20.452475f);
                instancePath.lineTo(37.820312f, 45.77474f);
                instancePath.lineTo(42.172527f, 45.77474f);
                instancePath.lineTo(42.53711f, 20.452475f);
                instancePath.lineTo(37.45573f, 20.452475f);
                instancePath.close();
                instancePath.moveTo(39.985027f, 57.008465f);
                Path path2 = instancePath;
                path2.cubicTo(41.69401f, 57.008465f, 42.99284f, 55.73242f, 42.99284f, 54.06901f);
                path2.cubicTo(42.99284f, 52.405598f, 41.69401f, 51.12956f, 39.985027f, 51.12956f);
                path2.cubicTo(38.321617f, 51.12956f, 37.0f, 52.405598f, 37.0f, 54.06901f);
                path2.cubicTo(37.0f, 55.73242f, 38.321617f, 57.008465f, 39.985027f, 57.008465f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i2;
    }
}
