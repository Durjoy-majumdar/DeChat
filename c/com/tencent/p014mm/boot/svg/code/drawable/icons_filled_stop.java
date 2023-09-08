package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_stop */
public class icons_filled_stop extends C24542c {
    private final int height = 32;
    private final int width = 32;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 32;
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
            C24542c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
            canvas.save();
            Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-372399);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(16.0f, 0.0f);
            Path path = instancePath;
            path.cubicTo(24.836555f, 0.0f, 32.0f, 7.1634436f, 32.0f, 16.0f);
            path.cubicTo(32.0f, 24.836555f, 24.836555f, 32.0f, 16.0f, 32.0f);
            path.cubicTo(7.1634436f, 32.0f, 0.0f, 24.836555f, 0.0f, 16.0f);
            path.cubicTo(0.0f, 7.1634436f, 7.1634436f, 0.0f, 16.0f, 0.0f);
            instancePath.close();
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
            instancePaint4.setColor(-1);
            Path instancePath2 = C24542c.instancePath(looper);
            instancePath2.moveTo(10.0f, 11.0f);
            Path path2 = instancePath2;
            path2.cubicTo(10.0f, 10.447715f, 10.447715f, 10.0f, 11.0f, 10.0f);
            instancePath2.lineTo(21.0f, 10.0f);
            path2.cubicTo(21.552284f, 10.0f, 22.0f, 10.447715f, 22.0f, 11.0f);
            instancePath2.lineTo(22.0f, 21.0f);
            path2.cubicTo(22.0f, 21.552284f, 21.552284f, 22.0f, 21.0f, 22.0f);
            instancePath2.lineTo(11.0f, 22.0f);
            path2.cubicTo(10.447715f, 22.0f, 10.0f, 21.552284f, 10.0f, 21.0f);
            instancePath2.lineTo(10.0f, 11.0f);
            instancePath2.close();
            canvas.drawPath(instancePath2, instancePaint4);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
