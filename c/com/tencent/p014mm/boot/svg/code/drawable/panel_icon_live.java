package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.panel_icon_live */
public class panel_icon_live extends C24542c {
    private final int height = 96;
    private final int width = 96;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 96;
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
            Paint instancePaint3 = C24542c.instancePaint(instancePaint2, looper);
            instancePaint3.setStrokeWidth(1.0f);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(0.0f, 0.0f);
            instancePath.lineTo(96.0f, 0.0f);
            instancePath.lineTo(96.0f, 96.0f);
            instancePath.lineTo(0.0f, 96.0f);
            instancePath.lineTo(0.0f, 0.0f);
            instancePath.close();
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
            instancePaint4.setColor(-16777216);
            instancePaint4.setStrokeWidth(6.0f);
            Path instancePath2 = C24542c.instancePath(looper);
            instancePath2.moveTo(48.0f, 11.0f);
            Path path = instancePath2;
            path.cubicTo(68.43454f, 11.0f, 85.0f, 27.565464f, 85.0f, 48.0f);
            path.cubicTo(85.0f, 68.43454f, 68.43454f, 85.0f, 48.0f, 85.0f);
            path.cubicTo(27.565464f, 85.0f, 11.0f, 68.43454f, 11.0f, 48.0f);
            path.cubicTo(11.0f, 27.565464f, 27.565464f, 11.0f, 48.0f, 11.0f);
            instancePath2.close();
            canvas.drawPath(instancePath2, instancePaint4);
            canvas.restore();
            canvas.save();
            Paint instancePaint5 = C24542c.instancePaint(instancePaint, looper);
            Paint instancePaint6 = C24542c.instancePaint(instancePaint3, looper);
            instancePaint5.setColor(-16777216);
            instancePaint6.setColor(-16777216);
            instancePaint6.setStrokeWidth(3.3333333f);
            Path instancePath3 = C24542c.instancePath(looper);
            instancePath3.moveTo(48.0f, 26.0f);
            Path path2 = instancePath3;
            path2.cubicTo(60.150265f, 26.0f, 70.0f, 35.849735f, 70.0f, 48.0f);
            path2.cubicTo(70.0f, 60.150265f, 60.150265f, 70.0f, 48.0f, 70.0f);
            path2.cubicTo(35.849735f, 70.0f, 26.0f, 60.150265f, 26.0f, 48.0f);
            path2.cubicTo(26.0f, 35.849735f, 35.849735f, 26.0f, 48.0f, 26.0f);
            instancePath3.close();
            canvas.drawPath(instancePath3, instancePaint5);
            canvas.drawPath(instancePath3, instancePaint6);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
