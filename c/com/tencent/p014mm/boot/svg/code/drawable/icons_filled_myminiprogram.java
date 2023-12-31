package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_myminiprogram */
public class icons_filled_myminiprogram extends C24542c {
    private final int height = 72;
    private final int width = 72;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 72;
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
        canvas.save();
        Paint instancePaint3 = C24542c.instancePaint(instancePaint2, looper);
        instancePaint3.setColor(-15360);
        instancePaint3.setStrokeWidth(1.2f);
        instancePaint3.setStrokeCap(Paint.Cap.BUTT);
        instancePaint3.setStrokeJoin(Paint.Join.MITER);
        instancePaint3.setStrokeMiter(4.0f);
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 3.0f, 0.0f, 0.0f, 0.0f, 3.0f, 0.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(17.0f, 3.60026f);
        Path path = instancePath;
        path.cubicTo(18.877604f, 3.60026f, 20.39974f, 5.122396f, 20.39974f, 7.0f);
        path.cubicTo(20.39974f, 8.877604f, 18.877604f, 10.39974f, 17.0f, 10.39974f);
        path.cubicTo(15.122396f, 10.39974f, 13.60026f, 8.877604f, 13.60026f, 7.0f);
        path.cubicTo(13.60026f, 5.122396f, 15.122396f, 3.60026f, 17.0f, 3.60026f);
        instancePath.close();
        instancePath.moveTo(17.0f, 3.60026f);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(43.484375f, 46.01953f);
        instancePath2.lineTo(46.03125f, 43.472656f);
        instancePath2.lineTo(63.0f, 60.441406f);
        instancePath2.lineTo(60.453125f, 62.98828f);
        instancePath2.close();
        instancePath2.moveTo(43.484375f, 46.01953f);
        WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint, looper);
        Path instancePath3 = C24542c.instancePath(looper);
        instancePath3.moveTo(42.0f, 42.0f);
        instancePath3.lineTo(57.0f, 42.0f);
        instancePath3.lineTo(57.0f, 45.601562f);
        instancePath3.lineTo(42.0f, 45.601562f);
        instancePath3.close();
        instancePath3.moveTo(42.0f, 42.0f);
        WeChatSVGRenderC2Java.setFillType(instancePath3, 1);
        canvas.drawPath(instancePath3, instancePaint5);
        canvas.restore();
        canvas.save();
        Paint instancePaint6 = C24542c.instancePaint(instancePaint, looper);
        Path instancePath4 = C24542c.instancePath(looper);
        instancePath4.moveTo(42.0f, 42.0f);
        instancePath4.lineTo(45.601562f, 42.0f);
        instancePath4.lineTo(45.601562f, 57.0f);
        instancePath4.lineTo(42.0f, 57.0f);
        instancePath4.close();
        instancePath4.moveTo(42.0f, 42.0f);
        WeChatSVGRenderC2Java.setFillType(instancePath4, 1);
        canvas.drawPath(instancePath4, instancePaint6);
        canvas.restore();
        canvas.save();
        Paint paint = instancePaint2;
        Paint instancePaint7 = C24542c.instancePaint(paint, looper);
        instancePaint7.setColor(-15360);
        instancePaint7.setStrokeWidth(1.2f);
        instancePaint7.setStrokeCap(Paint.Cap.BUTT);
        instancePaint7.setStrokeJoin(Paint.Join.MITER);
        instancePaint7.setStrokeMiter(4.0f);
        float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 3.0f, 0.0f, 0.0f, 0.0f, 3.0f, 0.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        Path instancePath5 = C24542c.instancePath(looper);
        instancePath5.moveTo(7.0f, 3.60026f);
        Path path2 = instancePath5;
        path2.cubicTo(8.877604f, 3.60026f, 10.39974f, 5.122396f, 10.39974f, 7.0f);
        path2.cubicTo(10.39974f, 8.877604f, 8.877604f, 10.39974f, 7.0f, 10.39974f);
        path2.cubicTo(5.122396f, 10.39974f, 3.60026f, 8.877604f, 3.60026f, 7.0f);
        path2.cubicTo(3.60026f, 5.122396f, 5.122396f, 3.60026f, 7.0f, 3.60026f);
        instancePath5.close();
        instancePath5.moveTo(7.0f, 3.60026f);
        canvas.drawPath(instancePath5, instancePaint7);
        canvas.restore();
        canvas.save();
        Paint instancePaint8 = C24542c.instancePaint(paint, looper);
        instancePaint8.setColor(-15360);
        instancePaint8.setStrokeWidth(1.2f);
        instancePaint8.setStrokeCap(Paint.Cap.BUTT);
        instancePaint8.setStrokeJoin(Paint.Join.MITER);
        instancePaint8.setStrokeMiter(4.0f);
        float[] matrixFloatArray3 = C24542c.setMatrixFloatArray(matrixFloatArray2, 3.0f, 0.0f, 0.0f, 0.0f, 3.0f, 0.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray3);
        canvas.concat(instanceMatrix);
        Path instancePath6 = C24542c.instancePath(looper);
        instancePath6.moveTo(7.0f, 13.60026f);
        Path path3 = instancePath6;
        path3.cubicTo(8.877604f, 13.60026f, 10.39974f, 15.122396f, 10.39974f, 17.0f);
        path3.cubicTo(10.39974f, 18.877604f, 8.877604f, 20.39974f, 7.0f, 20.39974f);
        path3.cubicTo(5.122396f, 20.39974f, 3.60026f, 18.877604f, 3.60026f, 17.0f);
        path3.cubicTo(3.60026f, 15.122396f, 5.122396f, 13.60026f, 7.0f, 13.60026f);
        instancePath6.close();
        instancePath6.moveTo(7.0f, 13.60026f);
        canvas.drawPath(instancePath6, instancePaint8);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
