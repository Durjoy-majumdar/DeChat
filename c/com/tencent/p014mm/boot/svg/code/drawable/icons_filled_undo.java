package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_undo */
public class icons_filled_undo extends C24542c {
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
        C24542c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
        canvas.save();
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-436207616);
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 6.0f, 0.0f, 1.0f, 12.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(35.25f, 22.13604f);
        instancePath.lineTo(43.47792f, 30.36396f);
        instancePath.lineTo(40.29594f, 33.54594f);
        instancePath.lineTo(30.75f, 24.0f);
        instancePath.lineTo(30.75f, 12.0f);
        instancePath.lineTo(35.25f, 12.0f);
        instancePath.lineTo(35.25f, 22.13604f);
        instancePath.close();
        instancePath.moveTo(9.395418f, 19.63806f);
        Path path = instancePath;
        path.cubicTo(11.446767f, 8.465796f, 21.234737f, -5.3290705E-15f, 33.0f, -7.1054274E-15f);
        path.cubicTo(46.254833f, -8.881784E-15f, 57.0f, 10.745166f, 57.0f, 24.0f);
        path.cubicTo(57.0f, 37.254833f, 46.254833f, 48.0f, 33.0f, 48.0f);
        path.cubicTo(26.372583f, 48.0f, 20.372583f, 45.31371f, 16.029438f, 40.970562f);
        instancePath.lineTo(20.272078f, 36.72792f);
        Path path2 = instancePath;
        path2.cubicTo(23.629839f, 40.085682f, 28.155792f, 42.0f, 33.0f, 42.0f);
        path2.cubicTo(42.941124f, 42.0f, 51.0f, 33.941124f, 51.0f, 24.0f);
        path2.cubicTo(51.0f, 14.058874f, 42.941124f, 6.0f, 33.0f, 6.0f);
        path2.cubicTo(24.319149f, 6.0f, 17.07356f, 12.145084f, 15.375973f, 20.322512f);
        instancePath.lineTo(21.213203f, 14.485281f);
        instancePath.lineTo(25.455845f, 18.727922f);
        instancePath.lineTo(13.788582f, 30.395184f);
        instancePath.cubicTo(13.202796f, 30.98097f, 12.253048f, 30.98097f, 11.667262f, 30.395184f);
        instancePath.lineTo(6.8034467E-13f, 18.727922f);
        instancePath.lineTo(4.2426405f, 14.485281f);
        instancePath.lineTo(9.395418f, 19.63806f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
