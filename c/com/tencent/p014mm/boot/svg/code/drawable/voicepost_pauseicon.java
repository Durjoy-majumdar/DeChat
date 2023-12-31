package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.voicepost_pauseicon */
public class voicepost_pauseicon extends C24542c {
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
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
            instancePaint4.setColor(-15028967);
            instancePaint4.setStrokeWidth(3.6f);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(36.0f, 1.7999992f);
            Path path = instancePath;
            path.cubicTo(54.888138f, 1.7999992f, 70.2f, 17.11186f, 70.2f, 36.0f);
            path.cubicTo(70.2f, 54.888138f, 54.888138f, 70.2f, 36.0f, 70.2f);
            path.cubicTo(17.11186f, 70.2f, 1.7999992f, 54.888138f, 1.7999992f, 36.0f);
            path.cubicTo(1.7999992f, 17.11186f, 17.11186f, 1.7999992f, 36.0f, 1.7999992f);
            instancePath.close();
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            canvas.save();
            Paint instancePaint5 = C24542c.instancePaint(instancePaint, looper);
            instancePaint5.setColor(-15028967);
            Path instancePath2 = C24542c.instancePath(looper);
            instancePath2.moveTo(24.0f, 19.5f);
            instancePath2.lineTo(29.4f, 19.5f);
            instancePath2.lineTo(29.4f, 52.5f);
            instancePath2.lineTo(24.0f, 52.5f);
            instancePath2.lineTo(24.0f, 19.5f);
            instancePath2.close();
            canvas.drawPath(instancePath2, instancePaint5);
            canvas.restore();
            canvas.save();
            Paint instancePaint6 = C24542c.instancePaint(instancePaint, looper);
            instancePaint6.setColor(-15028967);
            Path instancePath3 = C24542c.instancePath(looper);
            instancePath3.moveTo(42.59999f, 19.5f);
            instancePath3.lineTo(47.999992f, 19.5f);
            instancePath3.lineTo(47.999992f, 52.5f);
            instancePath3.lineTo(42.59999f, 52.5f);
            instancePath3.lineTo(42.59999f, 19.5f);
            instancePath3.close();
            canvas.drawPath(instancePath3, instancePaint6);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
