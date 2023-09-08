package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.game_comment_rectangle */
public class game_comment_rectangle extends C24542c {
    private final int height = 16;
    private final int width = 2;

    public int doCommand(int i, Object... objArr) {
        if (i == 0) {
            return 2;
        }
        if (i == 1) {
            return 16;
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
            instancePaint3.setColor(637534208);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(0.0f, 1.0f);
            Path path = instancePath;
            path.cubicTo(0.0f, 0.44771522f, 0.44771522f, 0.0f, 1.0f, 0.0f);
            instancePath.lineTo(1.0f, 0.0f);
            path.cubicTo(1.5522847f, 0.0f, 2.0f, 0.44771522f, 2.0f, 1.0f);
            instancePath.lineTo(2.0f, 15.0f);
            instancePath.cubicTo(2.0f, 15.552285f, 1.5522847f, 16.0f, 1.0f, 16.0f);
            instancePath.lineTo(1.0f, 16.0f);
            instancePath.cubicTo(0.44771522f, 16.0f, 0.0f, 15.552285f, 0.0f, 15.0f);
            instancePath.lineTo(0.0f, 1.0f);
            instancePath.close();
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
