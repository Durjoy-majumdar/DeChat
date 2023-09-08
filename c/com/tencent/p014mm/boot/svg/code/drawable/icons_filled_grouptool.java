package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_grouptool */
public class icons_filled_grouptool extends C24542c {
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
            C24542c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
            canvas.save();
            Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-16777216);
            float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 12.0f, 0.0f, 1.0f, 12.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(15.652174f, 0.0f);
            Path path = instancePath;
            path.cubicTo(24.29663f, 0.0f, 31.304348f, 7.007716f, 31.304348f, 15.652174f);
            path.cubicTo(31.304348f, 24.29663f, 24.29663f, 31.304348f, 15.652174f, 31.304348f);
            path.cubicTo(7.007716f, 31.304348f, 0.0f, 24.29663f, 0.0f, 15.652174f);
            path.cubicTo(0.0f, 7.007716f, 7.007716f, 0.0f, 15.652174f, 0.0f);
            instancePath.close();
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            canvas.save();
            Paint instancePaint5 = C24542c.instancePaint(instancePaint3, looper);
            Path instancePath2 = C24542c.instancePath(looper);
            instancePath2.moveTo(56.347828f, 0.0f);
            Path path2 = instancePath2;
            path2.cubicTo(64.99229f, 0.0f, 72.0f, 7.007716f, 72.0f, 15.652174f);
            path2.cubicTo(72.0f, 24.29663f, 64.99229f, 31.304348f, 56.347828f, 31.304348f);
            path2.cubicTo(47.70337f, 31.304348f, 40.695656f, 24.29663f, 40.695656f, 15.652174f);
            path2.cubicTo(40.695656f, 7.007716f, 47.70337f, 0.0f, 56.347828f, 0.0f);
            instancePath2.close();
            canvas.drawPath(instancePath2, instancePaint5);
            canvas.restore();
            canvas.save();
            Paint instancePaint6 = C24542c.instancePaint(instancePaint3, looper);
            Path instancePath3 = C24542c.instancePath(looper);
            instancePath3.moveTo(15.652174f, 40.695656f);
            Path path3 = instancePath3;
            path3.cubicTo(24.29663f, 40.695656f, 31.304348f, 47.70337f, 31.304348f, 56.347828f);
            path3.cubicTo(31.304348f, 64.99229f, 24.29663f, 72.0f, 15.652174f, 72.0f);
            path3.cubicTo(7.007716f, 72.0f, 0.0f, 64.99229f, 0.0f, 56.347828f);
            path3.cubicTo(0.0f, 47.70337f, 7.007716f, 40.695656f, 15.652174f, 40.695656f);
            instancePath3.close();
            canvas.drawPath(instancePath3, instancePaint6);
            canvas.restore();
            canvas.save();
            Paint instancePaint7 = C24542c.instancePaint(instancePaint3, looper);
            Path instancePath4 = C24542c.instancePath(looper);
            instancePath4.moveTo(56.347828f, 40.695656f);
            Path path4 = instancePath4;
            path4.cubicTo(64.99229f, 40.695656f, 72.0f, 47.70337f, 72.0f, 56.347828f);
            path4.cubicTo(72.0f, 64.99229f, 64.99229f, 72.0f, 56.347828f, 72.0f);
            path4.cubicTo(47.70337f, 72.0f, 40.695656f, 64.99229f, 40.695656f, 56.347828f);
            path4.cubicTo(40.695656f, 47.70337f, 47.70337f, 40.695656f, 56.347828f, 40.695656f);
            instancePath4.close();
            canvas.drawPath(instancePath4, instancePaint7);
            canvas.restore();
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
