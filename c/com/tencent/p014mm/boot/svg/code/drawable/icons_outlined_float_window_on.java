package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_float_window_on */
public class icons_outlined_float_window_on extends C24542c {
    private final int height = 72;
    private final int width = 72;

    public int doCommand(int i, Object... objArr) {
        if (i == 0 || i == 1) {
            return 72;
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
            instancePaint4.setColor(-16777216);
            instancePaint4.setStrokeWidth(3.6f);
            canvas.save();
            Paint instancePaint5 = C24542c.instancePaint(instancePaint4, looper);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(36.0f, 7.799999f);
            Path path = instancePath;
            path.cubicTo(51.574432f, 7.799999f, 64.2f, 20.425568f, 64.2f, 36.0f);
            path.cubicTo(64.2f, 51.574432f, 51.574432f, 64.2f, 36.0f, 64.2f);
            path.cubicTo(20.425568f, 64.2f, 7.799999f, 51.574432f, 7.799999f, 36.0f);
            path.cubicTo(7.799999f, 20.425568f, 20.425568f, 7.799999f, 36.0f, 7.799999f);
            instancePath.close();
            canvas.drawPath(instancePath, instancePaint5);
            canvas.restore();
            canvas.save();
            Paint instancePaint6 = C24542c.instancePaint(instancePaint4, looper);
            Path instancePath2 = C24542c.instancePath(looper);
            instancePath2.moveTo(36.0f, 19.8f);
            Path path2 = instancePath2;
            path2.cubicTo(44.947014f, 19.8f, 52.2f, 27.052986f, 52.2f, 36.0f);
            path2.cubicTo(52.2f, 44.947014f, 44.947014f, 52.2f, 36.0f, 52.2f);
            path2.cubicTo(27.052986f, 52.2f, 19.8f, 44.947014f, 19.8f, 36.0f);
            path2.cubicTo(19.8f, 27.052986f, 27.052986f, 19.8f, 36.0f, 19.8f);
            instancePath2.close();
            canvas.drawPath(instancePath2, instancePaint6);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
