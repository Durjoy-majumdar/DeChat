package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.live_net_normal_icon */
public class live_net_normal_icon extends C24542c {
    private final int height = 16;
    private final int width = 16;

    public int doCommand(int i, Object... objArr) {
        if (i == 0 || i == 1) {
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
            C24542c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
            canvas.save();
            Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-352965);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(8.0f, 4.0f);
            Path path = instancePath;
            path.cubicTo(10.209139f, 4.0f, 12.0f, 5.790861f, 12.0f, 8.0f);
            path.cubicTo(12.0f, 10.209139f, 10.209139f, 12.0f, 8.0f, 12.0f);
            path.cubicTo(5.790861f, 12.0f, 4.0f, 10.209139f, 4.0f, 8.0f);
            path.cubicTo(4.0f, 5.790861f, 5.790861f, 4.0f, 8.0f, 4.0f);
            instancePath.close();
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
            instancePaint4.setColor(16777215);
            Path instancePath2 = C24542c.instancePath(looper);
            instancePath2.moveTo(0.0f, 0.0f);
            instancePath2.lineTo(16.0f, 0.0f);
            instancePath2.lineTo(16.0f, 16.0f);
            instancePath2.lineTo(0.0f, 16.0f);
            instancePath2.lineTo(0.0f, 0.0f);
            instancePath2.close();
            canvas.drawPath(instancePath2, instancePaint4);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
