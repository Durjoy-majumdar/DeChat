package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.qqmail_attach_icon_normal */
public class qqmail_attach_icon_normal extends C24542c {
    private final int height = 96;
    private final int width = 96;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 96;
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
        instancePaint3.setColor(-6250336);
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 0.70710677f, -0.70710677f, 48.0f, 0.70710677f, 0.70710677f, -19.882248f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(62.0f, 28.517904f);
        instancePath.lineTo(62.0f, 66.0f);
        instancePath.lineTo(67.0f, 66.0f);
        instancePath.lineTo(67.0f, 28.517904f);
        Path path = instancePath;
        path.cubicTo(66.99998f, 28.51194f, 67.0f, 28.505972f, 67.0f, 28.5f);
        path.cubicTo(67.0f, 27.119287f, 65.880714f, 26.0f, 64.5f, 26.0f);
        path.cubicTo(63.11929f, 26.0f, 62.0f, 27.119287f, 62.0f, 28.5f);
        path.cubicTo(62.0f, 28.505972f, 62.00002f, 28.51194f, 62.00006f, 28.517904f);
        instancePath.close();
        instancePath.moveTo(40.0f, 39.482143f);
        instancePath.lineTo(40.0f, 66.0f);
        instancePath.lineTo(45.0f, 66.0f);
        instancePath.lineTo(45.0f, 39.482143f);
        path.cubicTo(44.990337f, 38.10965f, 43.874756f, 37.0f, 42.5f, 37.0f);
        path.cubicTo(41.125244f, 37.0f, 40.009663f, 38.10965f, 40.00006f, 39.482143f);
        instancePath.lineTo(40.0f, 39.482143f);
        instancePath.close();
        instancePath.moveTo(55.99748f, 24.0f);
        path.cubicTo(55.857f, 16.7968f, 49.867767f, 11.0f, 42.5f, 11.0f);
        path.cubicTo(35.132233f, 11.0f, 29.143f, 16.7968f, 29.002523f, 24.0f);
        instancePath.lineTo(34.01446f, 24.0f);
        Path path2 = instancePath;
        path2.cubicTo(34.27327f, 19.538311f, 37.973427f, 16.0f, 42.5f, 16.0f);
        path2.cubicTo(47.026573f, 16.0f, 50.72673f, 19.538311f, 50.98554f, 24.0f);
        instancePath.lineTo(55.99748f, 24.0f);
        instancePath.close();
        instancePath.moveTo(67.0f, 66.0f);
        path2.cubicTo(67.0f, 76.49341f, 58.493412f, 85.0f, 48.0f, 85.0f);
        path2.cubicTo(37.506588f, 85.0f, 29.0f, 76.49341f, 29.0f, 66.0f);
        instancePath.lineTo(34.0f, 66.0f);
        path2.cubicTo(34.0f, 73.73199f, 40.268013f, 80.0f, 48.0f, 80.0f);
        path2.cubicTo(55.731987f, 80.0f, 62.0f, 73.73199f, 62.0f, 66.0f);
        instancePath.lineTo(67.0f, 66.0f);
        instancePath.lineTo(67.0f, 66.0f);
        instancePath.close();
        instancePath.moveTo(56.0f, 66.0f);
        path2.cubicTo(56.0f, 70.41828f, 52.418278f, 74.0f, 48.0f, 74.0f);
        path2.cubicTo(43.581722f, 74.0f, 40.0f, 70.41828f, 40.0f, 66.0f);
        instancePath.lineTo(45.0f, 66.0f);
        path2.cubicTo(45.0f, 67.65685f, 46.343147f, 69.0f, 48.0f, 69.0f);
        path2.cubicTo(49.656853f, 69.0f, 51.0f, 67.65685f, 51.0f, 66.0f);
        instancePath.lineTo(56.0f, 66.0f);
        instancePath.lineTo(56.0f, 66.0f);
        instancePath.close();
        instancePath.moveTo(29.0f, 24.0f);
        instancePath.lineTo(34.0f, 24.0f);
        instancePath.lineTo(34.0f, 66.0f);
        instancePath.lineTo(29.0f, 66.0f);
        instancePath.lineTo(29.0f, 24.0f);
        instancePath.close();
        instancePath.moveTo(51.0f, 24.0f);
        instancePath.lineTo(56.0f, 24.0f);
        instancePath.lineTo(56.0f, 66.0f);
        instancePath.lineTo(51.0f, 66.0f);
        instancePath.lineTo(51.0f, 24.0f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
