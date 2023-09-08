package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.xweb.util.WXWebReporter;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.connect_wx_album */
public class connect_wx_album extends C24542c {
    private final int height = WXWebReporter.KEY_FREQ_NEW_FAILED_15_TIMES;
    private final int width = 357;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            return 357;
        }
        if (i2 == 1) {
            return WXWebReporter.KEY_FREQ_NEW_FAILED_15_TIMES;
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
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-16777216);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(20.0f, 0.0f);
        instancePath.lineTo(21.0f, 0.0f);
        instancePath.lineTo(21.0f, 245.0f);
        instancePath.lineTo(20.0f, 245.0f);
        instancePath.lineTo(20.0f, 0.0f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-16777216);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(335.0f, 0.0f);
        instancePath2.lineTo(336.0f, 0.0f);
        instancePath2.lineTo(336.0f, 245.0f);
        instancePath2.lineTo(335.0f, 245.0f);
        instancePath2.lineTo(335.0f, 0.0f);
        instancePath2.close();
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.save();
        Paint instancePaint6 = C24542c.instancePaint(instancePaint3, looper);
        instancePaint6.setColor(-16777216);
        instancePaint6.setStrokeWidth(3.0f);
        Path instancePath3 = C24542c.instancePath(looper);
        instancePath3.moveTo(8.790844f, 1.5f);
        instancePath3.lineTo(1.506977f, 243.5f);
        instancePath3.lineTo(355.493f, 243.5f);
        instancePath3.lineTo(348.20917f, 1.5f);
        instancePath3.lineTo(8.790844f, 1.5f);
        instancePath3.close();
        canvas.drawPath(instancePath3, instancePaint6);
        canvas.restore();
        canvas.save();
        Paint instancePaint7 = C24542c.instancePaint(instancePaint3, looper);
        instancePaint7.setColor(-16777216);
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 37.0f, 0.0f, 1.0f, 25.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint8 = C24542c.instancePaint(instancePaint7, looper);
        Path instancePath4 = C24542c.instancePath(looper);
        instancePath4.moveTo(-0.5f, -0.5f);
        instancePath4.lineTo(285.5f, -0.5f);
        instancePath4.lineTo(285.5f, 192.5f);
        instancePath4.lineTo(-0.5f, 192.5f);
        instancePath4.lineTo(-0.5f, -0.5f);
        instancePath4.close();
        canvas.drawPath(instancePath4, instancePaint8);
        canvas.restore();
        canvas.restore();
        canvas.save();
        Paint instancePaint9 = C24542c.instancePaint(instancePaint3, looper);
        instancePaint9.setColor(-16777216);
        instancePaint9.setStrokeWidth(2.0f);
        float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 134.0f, 0.0f, 1.0f, 97.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint10 = C24542c.instancePaint(instancePaint9, looper);
        Path instancePath5 = C24542c.instancePath(looper);
        instancePath5.moveTo(1.0f, 3.0f);
        instancePath5.cubicTo(1.0f, 1.8954304f, 1.8954304f, 1.0f, 3.0f, 1.0f);
        instancePath5.lineTo(66.0f, 1.0f);
        instancePath5.cubicTo(67.10457f, 1.0f, 68.0f, 1.8954304f, 68.0f, 3.0f);
        instancePath5.lineTo(68.0f, 49.0f);
        instancePath5.cubicTo(68.0f, 50.10457f, 67.10457f, 51.0f, 66.0f, 51.0f);
        instancePath5.lineTo(3.0f, 51.0f);
        instancePath5.cubicTo(1.8954304f, 51.0f, 1.0f, 50.10457f, 1.0f, 49.0f);
        instancePath5.lineTo(1.0f, 3.0f);
        instancePath5.close();
        canvas.drawPath(instancePath5, instancePaint10);
        canvas.restore();
        canvas.save();
        Paint instancePaint11 = C24542c.instancePaint(instancePaint9, looper);
        Path instancePath6 = C24542c.instancePath(looper);
        instancePath6.moveTo(99.0f, 50.07509f);
        instancePath6.lineTo(99.0f, 2.0108225f);
        instancePath6.lineTo(75.39577f, 19.873486f);
        instancePath6.cubicTo(75.21011f, 20.013983f, 75.0f, 20.437353f, 75.0f, 20.675142f);
        instancePath6.lineTo(75.0f, 32.730263f);
        instancePath6.cubicTo(75.0f, 32.953712f, 75.21011f, 33.357872f, 75.39602f, 33.488506f);
        instancePath6.lineTo(99.0f, 50.07509f);
        instancePath6.close();
        canvas.drawPath(instancePath6, instancePaint11);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
