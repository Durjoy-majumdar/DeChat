package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.finder_live_icon */
public class finder_live_icon extends C24542c {
    private final int height = 24;
    private final int width = 24;

    public int doCommand(int i, Object... objArr) {
        if (i == 0 || i == 1) {
            return 24;
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
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(0.0f, 0.0f);
            instancePath.lineTo(24.0f, 0.0f);
            instancePath.lineTo(24.0f, 24.0f);
            instancePath.lineTo(0.0f, 24.0f);
            instancePath.lineTo(0.0f, 0.0f);
            instancePath.close();
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
            instancePaint4.setColor(-40634);
            instancePaint4.setStrokeWidth(1.5f);
            Path instancePath2 = C24542c.instancePath(looper);
            instancePath2.moveTo(12.0f, 2.75f);
            Path path = instancePath2;
            path.cubicTo(17.108635f, 2.75f, 21.25f, 6.891366f, 21.25f, 12.0f);
            path.cubicTo(21.25f, 17.108635f, 17.108635f, 21.25f, 12.0f, 21.25f);
            path.cubicTo(6.891366f, 21.25f, 2.75f, 17.108635f, 2.75f, 12.0f);
            path.cubicTo(2.75f, 6.891366f, 6.891366f, 2.75f, 12.0f, 2.75f);
            instancePath2.close();
            canvas.drawPath(instancePath2, instancePaint4);
            canvas.restore();
            canvas.save();
            Paint instancePaint5 = C24542c.instancePaint(instancePaint, looper);
            instancePaint5.setColor(-40634);
            Path instancePath3 = C24542c.instancePath(looper);
            instancePath3.moveTo(12.0f, 6.5f);
            Path path2 = instancePath3;
            path2.cubicTo(15.037566f, 6.5f, 17.5f, 8.962434f, 17.5f, 12.0f);
            path2.cubicTo(17.5f, 15.037566f, 15.037566f, 17.5f, 12.0f, 17.5f);
            path2.cubicTo(8.962434f, 17.5f, 6.5f, 15.037566f, 6.5f, 12.0f);
            path2.cubicTo(6.5f, 8.962434f, 8.962434f, 6.5f, 12.0f, 6.5f);
            instancePath3.close();
            canvas.drawPath(instancePath3, instancePaint5);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
