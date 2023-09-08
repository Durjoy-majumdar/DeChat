package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.offline_reddot_icon */
public class offline_reddot_icon extends C24542c {
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
            Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
            instancePaint4.setColor(-564640);
            canvas.save();
            Paint instancePaint5 = C24542c.instancePaint(instancePaint4, looper);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(12.0f, 3.0f);
            Path path = instancePath;
            path.cubicTo(16.970562f, 3.0f, 21.0f, 7.029437f, 21.0f, 12.0f);
            path.cubicTo(21.0f, 16.970562f, 16.970562f, 21.0f, 12.0f, 21.0f);
            path.cubicTo(7.029437f, 21.0f, 3.0f, 16.970562f, 3.0f, 12.0f);
            path.cubicTo(3.0f, 7.029437f, 7.029437f, 3.0f, 12.0f, 3.0f);
            instancePath.close();
            canvas.drawPath(instancePath, instancePaint5);
            canvas.restore();
            canvas.save();
            Paint instancePaint6 = C24542c.instancePaint(instancePaint3, looper);
            instancePaint6.setColor(-1);
            instancePaint6.setStrokeWidth(3.0f);
            Path instancePath2 = C24542c.instancePath(looper);
            instancePath2.moveTo(12.0f, 1.5f);
            Path path2 = instancePath2;
            path2.cubicTo(17.79899f, 1.5f, 22.5f, 6.2010098f, 22.5f, 12.0f);
            path2.cubicTo(22.5f, 17.79899f, 17.79899f, 22.5f, 12.0f, 22.5f);
            path2.cubicTo(6.2010098f, 22.5f, 1.5f, 17.79899f, 1.5f, 12.0f);
            path2.cubicTo(1.5f, 6.2010098f, 6.2010098f, 1.5f, 12.0f, 1.5f);
            instancePath2.close();
            canvas.drawPath(instancePath2, instancePaint6);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
