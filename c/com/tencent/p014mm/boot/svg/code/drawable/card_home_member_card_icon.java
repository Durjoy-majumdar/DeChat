package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.card_home_member_card_icon */
public class card_home_member_card_icon extends C24542c {
    private final int height = 48;
    private final int width = 66;

    public int doCommand(int i, Object... objArr) {
        if (i == 0) {
            return 66;
        }
        if (i == 1) {
            return 48;
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
            instancePaint3.setColor(-15683841);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(0.1875f, 2.88f);
            instancePath.cubicTo(0.1875f, 1.2894199f, 1.4769199f, 0.0f, 3.0675f, 0.0f);
            instancePath.lineTo(62.9325f, 0.0f);
            instancePath.cubicTo(64.52308f, 0.0f, 65.8125f, 1.2894199f, 65.8125f, 2.88f);
            instancePath.lineTo(65.8125f, 45.12f);
            instancePath.cubicTo(65.8125f, 46.71058f, 64.52308f, 48.0f, 62.9325f, 48.0f);
            instancePath.lineTo(3.0675f, 48.0f);
            instancePath.cubicTo(1.4769199f, 48.0f, 0.1875f, 46.71058f, 0.1875f, 45.12f);
            instancePath.lineTo(0.1875f, 2.88f);
            instancePath.close();
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
            instancePaint4.setColor(-1);
            Path instancePath2 = C24542c.instancePath(looper);
            instancePath2.moveTo(14.4375f, 9.081081f);
            Path path = instancePath2;
            path.cubicTo(17.854763f, 9.081081f, 20.625f, 11.69477f, 20.625f, 14.918919f);
            path.cubicTo(20.625f, 18.143068f, 17.854763f, 20.756756f, 14.4375f, 20.756756f);
            path.cubicTo(11.020238f, 20.756756f, 8.25f, 18.143068f, 8.25f, 14.918919f);
            path.cubicTo(8.25f, 11.69477f, 11.020238f, 9.081081f, 14.4375f, 9.081081f);
            instancePath2.close();
            canvas.drawPath(instancePath2, instancePaint4);
            canvas.restore();
            canvas.save();
            Paint instancePaint5 = C24542c.instancePaint(instancePaint, looper);
            instancePaint5.setColor(-1);
            Path instancePath3 = C24542c.instancePath(looper);
            instancePath3.moveTo(8.25f, 29.837837f);
            instancePath3.lineTo(55.0f, 29.837837f);
            instancePath3.lineTo(55.0f, 36.705883f);
            instancePath3.lineTo(8.25f, 36.705883f);
            instancePath3.lineTo(8.25f, 29.837837f);
            instancePath3.close();
            canvas.drawPath(instancePath3, instancePaint5);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
