package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.attach_send_stop_pressed */
public class attach_send_stop_pressed extends C24542c {
    private final int height = 66;
    private final int width = 66;

    public int doCommand(int i, Object... objArr) {
        if (i == 0 || i == 1) {
            return 66;
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
            instancePaint3.setColor(-372399);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(33.0f, 0.0f);
            Path path = instancePath;
            path.cubicTo(51.225395f, 0.0f, 66.0f, 14.774603f, 66.0f, 33.0f);
            path.cubicTo(66.0f, 51.225395f, 51.225395f, 66.0f, 33.0f, 66.0f);
            path.cubicTo(14.774603f, 66.0f, 0.0f, 51.225395f, 0.0f, 33.0f);
            path.cubicTo(0.0f, 14.774603f, 14.774603f, 0.0f, 33.0f, 0.0f);
            instancePath.close();
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
            instancePaint4.setColor(-1);
            Path instancePath2 = C24542c.instancePath(looper);
            instancePath2.moveTo(40.0f, 18.0f);
            instancePath2.lineTo(44.0f, 18.0f);
            instancePath2.lineTo(44.0f, 48.0f);
            instancePath2.lineTo(40.0f, 48.0f);
            instancePath2.lineTo(40.0f, 18.0f);
            instancePath2.close();
            canvas.drawPath(instancePath2, instancePaint4);
            canvas.restore();
            canvas.save();
            Paint instancePaint5 = C24542c.instancePaint(instancePaint, looper);
            instancePaint5.setColor(-1);
            Path instancePath3 = C24542c.instancePath(looper);
            instancePath3.moveTo(22.0f, 18.0f);
            instancePath3.lineTo(26.0f, 18.0f);
            instancePath3.lineTo(26.0f, 48.0f);
            instancePath3.lineTo(22.0f, 48.0f);
            instancePath3.lineTo(22.0f, 18.0f);
            instancePath3.close();
            canvas.drawPath(instancePath3, instancePaint5);
            canvas.restore();
            canvas.save();
            Paint instancePaint6 = C24542c.instancePaint(instancePaint, looper);
            instancePaint6.setColor(419430400);
            Path instancePath4 = C24542c.instancePath(looper);
            instancePath4.moveTo(33.0f, 0.0f);
            Path path2 = instancePath4;
            path2.cubicTo(51.225395f, 0.0f, 66.0f, 14.774603f, 66.0f, 33.0f);
            path2.cubicTo(66.0f, 51.225395f, 51.225395f, 66.0f, 33.0f, 66.0f);
            path2.cubicTo(14.774603f, 66.0f, 0.0f, 51.225395f, 0.0f, 33.0f);
            path2.cubicTo(0.0f, 14.774603f, 14.774603f, 0.0f, 33.0f, 0.0f);
            instancePath4.close();
            canvas.drawPath(instancePath4, instancePaint6);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
