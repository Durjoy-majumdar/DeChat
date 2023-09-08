package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.tips_background_dark */
public class tips_background_dark extends C24542c {
    private final int height = 101;
    private final int width = 200;

    public int doCommand(int i, Object... objArr) {
        if (i == 0) {
            return 200;
        }
        if (i == 1) {
            return 101;
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
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
            Paint instancePaint5 = C24542c.instancePaint(instancePaint3, looper);
            instancePaint4.setColor(-13882324);
            instancePaint5.setColor(268435455);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(0.5f, 8.5f);
            instancePath.cubicTo(0.5f, 4.081722f, 4.081722f, 0.5f, 8.5f, 0.5f);
            instancePath.lineTo(191.5f, 0.5f);
            instancePath.cubicTo(195.91827f, 0.5f, 199.5f, 4.081722f, 199.5f, 8.5f);
            instancePath.lineTo(199.5f, 92.5f);
            instancePath.cubicTo(199.5f, 96.91828f, 195.91827f, 100.5f, 191.5f, 100.5f);
            instancePath.lineTo(8.5f, 100.5f);
            instancePath.cubicTo(4.081722f, 100.5f, 0.5f, 96.91828f, 0.5f, 92.5f);
            instancePath.lineTo(0.5f, 8.5f);
            instancePath.close();
            canvas.drawPath(instancePath, instancePaint4);
            canvas.drawPath(instancePath, instancePaint5);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
