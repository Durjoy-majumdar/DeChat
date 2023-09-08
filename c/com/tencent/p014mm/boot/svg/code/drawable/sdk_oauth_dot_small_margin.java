package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.sdk_oauth_dot_small_margin */
public class sdk_oauth_dot_small_margin extends C24542c {
    private final int height = 6;
    private final int width = 6;

    public int doCommand(int i, Object... objArr) {
        if (i == 0 || i == 1) {
            return 6;
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
            canvas.save();
            Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-436207616);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(3.0f, 1.0f);
            Path path = instancePath;
            path.cubicTo(4.1045694f, 1.0f, 5.0f, 1.8954304f, 5.0f, 3.0f);
            path.cubicTo(5.0f, 4.1045694f, 4.1045694f, 5.0f, 3.0f, 5.0f);
            path.cubicTo(1.8954304f, 5.0f, 1.0f, 4.1045694f, 1.0f, 3.0f);
            path.cubicTo(1.0f, 1.8954304f, 1.8954304f, 1.0f, 3.0f, 1.0f);
            instancePath.close();
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
