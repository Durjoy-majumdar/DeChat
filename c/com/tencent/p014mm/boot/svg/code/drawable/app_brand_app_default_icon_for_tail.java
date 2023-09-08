package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.app_brand_app_default_icon_for_tail */
public class app_brand_app_default_icon_for_tail extends C24542c {
    private final int height = 40;
    private final int width = 40;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 40;
        if (!(i2 == 0 || i2 == 1)) {
            i3 = 0;
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
                float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -637.0f, 0.0f, 1.0f, -1392.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 637.0f, 0.0f, 1.0f, 1392.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray2);
                canvas.concat(instanceMatrix);
                canvas.save();
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-921103);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(0.0f, 0.0f);
                instancePath.lineTo(40.0f, 0.0f);
                instancePath.lineTo(40.0f, 40.0f);
                instancePath.lineTo(0.0f, 40.0f);
                instancePath.lineTo(0.0f, 0.0f);
                instancePath.close();
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
                instancePaint4.setColor(-3552823);
                Path instancePath2 = C24542c.instancePath(looper);
                instancePath2.moveTo(16.955261f, 20.434963f);
                Path path = instancePath2;
                path.cubicTo(18.24053f, 22.476675f, 16.106638f, 23.401121f, 15.21541f, 23.914665f);
                path.cubicTo(11.381262f, 26.095942f, 9.705882f, 26.912895f, 9.705882f, 27.974316f);
                instancePath2.lineTo(9.705882f, 29.424192f);
                Path path2 = instancePath2;
                path2.cubicTo(9.705882f, 29.890316f, 10.054523f, 30.294117f, 10.575808f, 30.294117f);
                instancePath2.lineTo(29.424192f, 30.294117f);
                path2.cubicTo(29.945477f, 30.294117f, 30.294117f, 29.890316f, 30.294117f, 29.424192f);
                instancePath2.lineTo(30.294117f, 27.974316f);
                Path path3 = instancePath2;
                path3.cubicTo(30.294117f, 26.912895f, 28.618738f, 26.095942f, 24.78459f, 23.914665f);
                path3.cubicTo(23.893362f, 23.401121f, 21.75947f, 22.476675f, 23.044739f, 20.434963f);
                path3.cubicTo(24.186148f, 18.739943f, 25.076778f, 18.04949f, 25.074566f, 15.21541f);
                path3.cubicTo(25.076778f, 12.524936f, 23.08713f, 9.705882f, 20.144987f, 9.705882f);
                path3.cubicTo(16.91287f, 9.705882f, 14.923222f, 12.524936f, 14.925435f, 15.21541f);
                path3.cubicTo(14.923222f, 18.04949f, 15.813852f, 18.739943f, 16.955261f, 20.434963f);
                instancePath2.close();
                WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint4);
                canvas.restore();
                canvas.restore();
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i3;
    }
}
