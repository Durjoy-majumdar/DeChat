package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.default_ipcall */
public class default_ipcall extends C24542c {
    private final int height = 108;
    private final int width = 108;

    public int doCommand(int i, Object... objArr) {
        int i2 = 108;
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
                instancePaint3.setColor(-12206054);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(0.0f, 0.0f);
                instancePath.lineTo(108.0f, 0.0f);
                instancePath.lineTo(108.0f, 108.0f);
                instancePath.lineTo(0.0f, 108.0f);
                instancePath.lineTo(0.0f, 0.0f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
                instancePaint4.setColor(-1);
                Path instancePath2 = C24542c.instancePath(looper);
                instancePath2.moveTo(47.0f, 61.0f);
                Path path = instancePath2;
                path.cubicTo(53.445965f, 67.115555f, 59.40413f, 69.98397f, 62.0f, 70.0f);
                path.cubicTo(63.810833f, 69.648026f, 69.2978f, 65.97824f, 72.0f, 66.0f);
                path.cubicTo(73.13301f, 66.05056f, 81.268166f, 71.4013f, 82.0f, 72.0f);
                path.cubicTo(83.237686f, 72.63856f, 84.15078f, 73.3612f, 84.0f, 74.0f);
                path.cubicTo(83.807396f, 75.19006f, 80.232086f, 85.26249f, 71.0f, 84.0f);
                path.cubicTo(61.976585f, 82.47289f, 49.251225f, 72.903206f, 42.0f, 66.0f);
                instancePath2.lineTo(47.0f, 61.0f);
                instancePath2.lineTo(47.0f, 61.0f);
                instancePath2.close();
                instancePath2.moveTo(47.0f, 61.0f);
                path.cubicTo(40.88444f, 54.554035f, 38.01603f, 48.59587f, 38.0f, 46.0f);
                path.cubicTo(38.35198f, 44.189167f, 42.021763f, 38.7022f, 42.0f, 36.0f);
                path.cubicTo(41.94944f, 34.86699f, 36.598705f, 26.731834f, 36.0f, 26.0f);
                path.cubicTo(35.36144f, 24.762312f, 34.638798f, 23.84922f, 34.0f, 24.0f);
                path.cubicTo(32.80994f, 24.192604f, 22.737509f, 27.767912f, 24.0f, 37.0f);
                path.cubicTo(25.52711f, 46.023415f, 35.096794f, 58.748775f, 42.0f, 66.0f);
                instancePath2.lineTo(47.0f, 61.0f);
                instancePath2.lineTo(47.0f, 61.0f);
                instancePath2.close();
                WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint4);
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i2;
    }
}
