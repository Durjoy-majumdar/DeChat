package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.note_ul_unpress */
public class note_ul_unpress extends C24542c {
    private final int height = 144;
    private final int width = 144;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 144;
        }
        if (i2 != 2) {
            return 0;
        }
        Canvas canvas = objArr[0];
        Looper looper = objArr[1];
        Matrix instanceMatrix = C24542c.instanceMatrix(looper);
        float[] instanceMatrixArray = C24542c.instanceMatrixArray(looper);
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
        Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-855638017);
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint4, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(0.0f, 28.8f);
        Path path = instancePath;
        instancePath.cubicTo(0.0f, 12.894198f, 12.894198f, 0.0f, 28.8f, 0.0f);
        path.lineTo(115.2f, 0.0f);
        Path path2 = path;
        path2.cubicTo(131.1058f, 0.0f, 144.0f, 12.894198f, 144.0f, 28.8f);
        path.lineTo(144.0f, 115.2f);
        path2.cubicTo(144.0f, 131.1058f, 131.1058f, 144.0f, 115.2f, 144.0f);
        path.lineTo(28.8f, 144.0f);
        path.cubicTo(12.894198f, 144.0f, 0.0f, 131.1058f, 0.0f, 115.2f);
        path.lineTo(0.0f, 28.8f);
        path.close();
        canvas.drawPath(path, instancePaint5);
        canvas.restore();
        canvas.save();
        Paint paint = instancePaint3;
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 40.8f, 0.0f, 1.0f, 45.6f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint6 = C24542c.instancePaint(paint, looper);
        instancePaint6.setColor(-16777216);
        instancePaint6.setStrokeWidth(3.6f);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(17.28f, 4.4f);
        instancePath2.lineTo(64.8f, 4.4f);
        canvas.drawPath(instancePath2, instancePaint6);
        canvas.restore();
        canvas.save();
        Paint instancePaint7 = C24542c.instancePaint(paint, looper);
        instancePaint7.setColor(-16777216);
        instancePaint7.setStrokeWidth(3.6f);
        Path instancePath3 = C24542c.instancePath(looper);
        instancePath3.moveTo(17.28f, 26.4f);
        instancePath3.lineTo(64.8f, 26.4f);
        canvas.drawPath(instancePath3, instancePaint7);
        canvas.restore();
        canvas.save();
        Paint instancePaint8 = C24542c.instancePaint(paint, looper);
        instancePaint8.setColor(-16777216);
        instancePaint8.setStrokeWidth(3.6f);
        Path instancePath4 = C24542c.instancePath(looper);
        instancePath4.moveTo(17.28f, 48.4f);
        instancePath4.lineTo(64.8f, 48.4f);
        canvas.drawPath(instancePath4, instancePaint8);
        canvas.restore();
        canvas.save();
        Paint instancePaint9 = C24542c.instancePaint(instancePaint, looper);
        instancePaint9.setColor(-16777216);
        Path instancePath5 = C24542c.instancePath(looper);
        instancePath5.moveTo(3.456f, 0.0f);
        Path path3 = instancePath5;
        path3.cubicTo(5.3646965f, 0.0f, 6.912f, 1.5446175f, 6.912f, 3.45f);
        path3.cubicTo(6.912f, 5.3553824f, 5.3646965f, 6.9f, 3.456f, 6.9f);
        path3.cubicTo(1.5473038f, 6.9f, 0.0f, 5.3553824f, 0.0f, 3.45f);
        path3.cubicTo(0.0f, 1.5446175f, 1.5473038f, 0.0f, 3.456f, 0.0f);
        instancePath5.close();
        canvas.drawPath(instancePath5, instancePaint9);
        canvas.restore();
        canvas.save();
        Paint instancePaint10 = C24542c.instancePaint(instancePaint, looper);
        instancePaint10.setColor(-16777216);
        Path instancePath6 = C24542c.instancePath(looper);
        instancePath6.moveTo(3.456f, 22.0f);
        Path path4 = instancePath6;
        path4.cubicTo(5.3646965f, 22.0f, 6.912f, 23.575958f, 6.912f, 25.52f);
        path4.cubicTo(6.912f, 27.464043f, 5.3646965f, 29.04f, 3.456f, 29.04f);
        path4.cubicTo(1.5473038f, 29.04f, 0.0f, 27.464043f, 0.0f, 25.52f);
        path4.cubicTo(0.0f, 23.575958f, 1.5473038f, 22.0f, 3.456f, 22.0f);
        instancePath6.close();
        canvas.drawPath(instancePath6, instancePaint10);
        canvas.restore();
        canvas.save();
        Paint instancePaint11 = C24542c.instancePaint(instancePaint, looper);
        instancePaint11.setColor(-16777216);
        Path instancePath7 = C24542c.instancePath(looper);
        instancePath7.moveTo(3.456f, 44.0f);
        Path path5 = instancePath7;
        path5.cubicTo(5.3646965f, 44.0f, 6.912f, 45.57596f, 6.912f, 47.52f);
        path5.cubicTo(6.912f, 49.464043f, 5.3646965f, 51.04f, 3.456f, 51.04f);
        path5.cubicTo(1.5473038f, 51.04f, 0.0f, 49.464043f, 0.0f, 47.52f);
        path5.cubicTo(0.0f, 45.57596f, 1.5473038f, 44.0f, 3.456f, 44.0f);
        instancePath7.close();
        canvas.drawPath(instancePath7, instancePaint11);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
