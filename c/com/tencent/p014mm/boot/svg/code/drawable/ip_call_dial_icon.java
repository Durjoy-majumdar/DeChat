package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.ip_call_dial_icon */
public class ip_call_dial_icon extends C24542c {
    private final int height = 156;
    private final int width = 156;

    public int doCommand(int i, Object... objArr) {
        if (i == 0 || i == 1) {
            return 156;
        }
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
            Paint instancePaint3 = C24542c.instancePaint(instancePaint2, looper);
            instancePaint3.setStrokeWidth(1.0f);
            Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
            instancePaint4.setColor(-16139513);
            instancePaint4.setStrokeWidth(3.0f);
            canvas.save();
            Paint instancePaint5 = C24542c.instancePaint(instancePaint4, looper);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(108.804146f, 97.68627f);
            Path path = instancePath;
            path.cubicTo(107.96773f, 97.08867f, 99.06952f, 91.14659f, 97.824875f, 91.09063f);
            path.cubicTo(94.858475f, 91.06664f, 88.83385f, 95.10098f, 86.8456f, 95.487724f);
            path.cubicTo(83.99598f, 95.469734f, 77.45433f, 92.31682f, 70.376686f, 85.59425f);
            path.cubicTo(63.662365f, 78.50793f, 60.51331f, 71.95825f, 60.495342f, 69.10513f);
            path.cubicTo(60.881615f, 67.11444f, 64.911f, 61.083424f, 64.887054f, 58.112385f);
            path.cubicTo(64.831154f, 56.867207f, 58.957245f, 47.924107f, 58.299488f, 47.119637f);
            path.cubicTo(57.319336f, 45.788513f, 56.33819f, 44.814156f, 55.664463f, 45.030014f);
            path.cubicTo(54.35793f, 45.241875f, 43.738976f, 49.063354f, 45.12436f, 59.21166f);
            path.cubicTo(46.801193f, 69.13111f, 57.308357f, 83.11889f, 64.887054f, 91.09063f);
            path.cubicTo(72.84902f, 98.67962f, 86.82065f, 109.19868f, 96.726944f, 110.87757f);
            path.cubicTo(106.86381f, 112.264656f, 110.7894f, 101.4348f, 111.0f, 100.12666f);
            path.cubicTo(111.001f, 99.37716f, 109.640564f, 98.28388f, 108.804146f, 97.68627f);
            canvas.drawPath(instancePath, instancePaint5);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
