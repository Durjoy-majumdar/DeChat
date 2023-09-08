package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.connect_mac */
public class connect_mac extends C24542c {
    private final int height = 104;
    private final int width = 104;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 104;
        }
        if (i2 != 2) {
            return 0;
        }
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
        instancePaint4.setColor(-16777216);
        instancePaint4.setStrokeWidth(0.8f);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(0.4f, 16.4f);
        instancePath.cubicTo(0.4f, 14.190861f, 2.190861f, 12.4f, 4.4f, 12.4f);
        instancePath.lineTo(99.6f, 12.4f);
        instancePath.cubicTo(101.809135f, 12.4f, 103.6f, 14.190861f, 103.6f, 16.4f);
        instancePath.lineTo(103.6f, 75.6f);
        instancePath.cubicTo(103.6f, 77.809135f, 101.809135f, 79.6f, 99.6f, 79.6f);
        instancePath.lineTo(4.4f, 79.6f);
        instancePath.cubicTo(2.190861f, 79.6f, 0.4f, 77.809135f, 0.4f, 75.6f);
        instancePath.lineTo(0.4f, 16.4f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint3, looper);
        instancePaint5.setColor(-16777216);
        instancePaint5.setStrokeWidth(0.8f);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(60.0f, 79.5f);
        instancePath2.lineTo(60.67726f, 85.25673f);
        instancePath2.cubicTo(60.871513f, 86.90786f, 62.066837f, 88.26671f, 63.67972f, 88.66993f);
        instancePath2.lineTo(68.029854f, 89.75746f);
        Path path = instancePath2;
        path.cubicTo(68.60001f, 89.9f, 69.0f, 90.41229f, 69.0f, 91.0f);
        path.cubicTo(69.0f, 91.552284f, 68.552284f, 92.0f, 68.0f, 92.0f);
        instancePath2.lineTo(36.0f, 92.0f);
        Path path2 = instancePath2;
        path2.cubicTo(35.447716f, 92.0f, 35.0f, 91.552284f, 35.0f, 91.0f);
        path2.cubicTo(35.0f, 90.41229f, 35.399982f, 89.9f, 35.970142f, 89.75746f);
        instancePath2.lineTo(40.32028f, 88.66993f);
        instancePath2.cubicTo(41.933163f, 88.26671f, 43.128487f, 86.90786f, 43.32274f, 85.25673f);
        instancePath2.lineTo(44.0f, 79.5f);
        instancePath2.lineTo(44.0f, 79.5f);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.save();
        Paint instancePaint6 = C24542c.instancePaint(instancePaint3, looper);
        instancePaint6.setColor(-16777216);
        instancePaint6.setStrokeWidth(0.8f);
        Path instancePath3 = C24542c.instancePath(looper);
        instancePath3.moveTo(0.0f, 66.5f);
        instancePath3.lineTo(104.0f, 66.5f);
        canvas.drawPath(instancePath3, instancePaint6);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
