package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.note_alarm */
public class note_alarm extends C24542c {
    private final int height = 36;
    private final int width = 36;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 36;
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
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        instancePaint4.setColor(-15028967);
        instancePaint4.setStrokeWidth(2.0f);
        canvas.save();
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 3.0f, 0.0f, 1.0f, 3.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint4, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(2.0306435f, 11.052016f);
        Path path = instancePath;
        path.cubicTo(0.7812371f, 9.886849f, 0.0f, 8.226148f, 0.0f, 6.382979f);
        path.cubicTo(0.0f, 2.8577569f, 2.8577569f, 0.0f, 6.382979f, 0.0f);
        path.cubicTo(8.40088f, 0.0f, 10.200077f, 0.93637973f, 11.3697605f, 2.3983283f);
        path.cubicTo(7.022729f, 3.5833154f, 3.5322874f, 6.84528f, 2.0306435f, 11.052016f);
        instancePath.close();
        instancePath.moveTo(18.629875f, 2.3987827f);
        Path path2 = instancePath;
        path2.cubicTo(19.799551f, 0.9365738f, 21.598911f, 0.0f, 23.617022f, 0.0f);
        path2.cubicTo(27.142242f, 0.0f, 30.0f, 2.8577569f, 30.0f, 6.382979f);
        path2.cubicTo(30.0f, 8.226897f, 29.218128f, 9.8882f, 27.967833f, 11.053436f);
        path2.cubicTo(26.46666f, 6.8465524f, 22.976622f, 3.5842826f, 18.629875f, 2.3987827f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint5);
        canvas.restore();
        canvas.save();
        Paint instancePaint6 = C24542c.instancePaint(instancePaint4, looper);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(15.0f, 1.9148932f);
        Path path3 = instancePath2;
        path3.cubicTo(22.226706f, 1.9148932f, 28.085106f, 7.7732944f, 28.085106f, 15.0f);
        path3.cubicTo(28.085106f, 22.226706f, 22.226706f, 28.085106f, 15.0f, 28.085106f);
        path3.cubicTo(7.7732944f, 28.085106f, 1.9148932f, 22.226706f, 1.9148932f, 15.0f);
        path3.cubicTo(1.9148932f, 7.7732944f, 7.7732944f, 1.9148932f, 15.0f, 1.9148932f);
        instancePath2.close();
        canvas.drawPath(instancePath2, instancePaint6);
        canvas.restore();
        canvas.save();
        Paint instancePaint7 = C24542c.instancePaint(instancePaint4, looper);
        instancePaint7.setStrokeCap(Paint.Cap.SQUARE);
        Path instancePath3 = C24542c.instancePath(looper);
        instancePath3.moveTo(23.0f, 26.0f);
        instancePath3.lineTo(26.19149f, 29.19149f);
        canvas.drawPath(instancePath3, instancePaint7);
        canvas.restore();
        canvas.save();
        Paint instancePaint8 = C24542c.instancePaint(instancePaint4, looper);
        instancePaint8.setStrokeCap(Paint.Cap.SQUARE);
        float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, -1.0f, 0.0f, 10.553192f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        Path instancePath4 = C24542c.instancePath(looper);
        instancePath4.moveTo(4.0f, 26.0f);
        instancePath4.lineTo(6.5531917f, 29.829786f);
        canvas.drawPath(instancePath4, instancePaint8);
        canvas.restore();
        canvas.save();
        Paint instancePaint9 = C24542c.instancePaint(instancePaint4, looper);
        instancePaint9.setStrokeCap(Paint.Cap.SQUARE);
        Path instancePath5 = C24542c.instancePath(looper);
        instancePath5.moveTo(15.0f, 6.1363635f);
        instancePath5.lineTo(15.0f, 15.0f);
        canvas.drawPath(instancePath5, instancePaint9);
        canvas.restore();
        canvas.save();
        Paint instancePaint10 = C24542c.instancePaint(instancePaint4, looper);
        instancePaint10.setStrokeCap(Paint.Cap.SQUARE);
        Path instancePath6 = C24542c.instancePath(looper);
        instancePath6.moveTo(15.0f, 15.0f);
        instancePath6.lineTo(20.74468f, 18.40909f);
        canvas.drawPath(instancePath6, instancePaint10);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
