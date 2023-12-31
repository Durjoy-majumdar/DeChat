package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.websearch_icon_emoji */
public class websearch_icon_emoji extends C24542c {
    private final int height = 16;
    private final int width = 16;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 16;
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
        instancePaint3.setColor(-5066062);
        Paint paint = instancePaint3;
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -72.0f, 0.0f, 1.0f, -603.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 66.0f, 0.0f, 1.0f, 602.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray3 = C24542c.setMatrixFloatArray(matrixFloatArray2, 1.0f, 0.0f, 5.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray3);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray4 = C24542c.setMatrixFloatArray(matrixFloatArray3, 1.0f, 0.0f, 1.5f, 0.0f, 1.0f, 1.5f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray4);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(paint, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(7.5f, 14.1f);
        Path path = instancePath;
        path.cubicTo(11.14508f, 14.1f, 14.1f, 11.14508f, 14.1f, 7.5f);
        path.cubicTo(14.1f, 3.8549206f, 11.14508f, 0.9f, 7.5f, 0.9f);
        path.cubicTo(3.8549206f, 0.9f, 0.9f, 3.8549206f, 0.9f, 7.5f);
        path.cubicTo(0.9f, 11.14508f, 3.8549206f, 14.1f, 7.5f, 14.1f);
        instancePath.close();
        instancePath.moveTo(7.5f, 15.0f);
        Path path2 = instancePath;
        path2.cubicTo(3.3578644f, 15.0f, 0.0f, 11.642136f, 0.0f, 7.5f);
        path2.cubicTo(0.0f, 3.3578644f, 3.3578644f, 0.0f, 7.5f, 0.0f);
        path2.cubicTo(11.642136f, 0.0f, 15.0f, 3.3578644f, 15.0f, 7.5f);
        path2.cubicTo(15.0f, 11.642136f, 11.642136f, 15.0f, 7.5f, 15.0f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(paint, looper);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(7.5f, 11.475f);
        instancePath2.cubicTo(9.177456f, 11.475f, 10.586946f, 10.327704f, 10.986585f, 8.775f);
        instancePath2.lineTo(4.013416f, 8.775f);
        instancePath2.cubicTo(4.4130545f, 10.327704f, 5.8225446f, 11.475f, 7.5f, 11.475f);
        instancePath2.close();
        instancePath2.moveTo(3.0f, 7.875f);
        instancePath2.lineTo(12.0f, 7.875f);
        Path path3 = instancePath2;
        path3.cubicTo(12.0f, 10.360281f, 9.985281f, 12.375f, 7.5f, 12.375f);
        path3.cubicTo(5.0147185f, 12.375f, 3.0f, 10.360281f, 3.0f, 7.875f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.save();
        Paint instancePaint6 = C24542c.instancePaint(paint, looper);
        Path instancePath3 = C24542c.instancePath(looper);
        instancePath3.moveTo(4.875f, 6.375f);
        Path path4 = instancePath3;
        path4.cubicTo(4.2536798f, 6.375f, 3.75f, 5.8713202f, 3.75f, 5.25f);
        path4.cubicTo(3.75f, 4.6286798f, 4.2536798f, 4.125f, 4.875f, 4.125f);
        path4.cubicTo(5.4963202f, 4.125f, 6.0f, 4.6286798f, 6.0f, 5.25f);
        path4.cubicTo(6.0f, 5.8713202f, 5.4963202f, 6.375f, 4.875f, 6.375f);
        instancePath3.close();
        instancePath3.moveTo(10.125f, 6.375f);
        Path path5 = instancePath3;
        path5.cubicTo(9.503679f, 6.375f, 9.0f, 5.8713202f, 9.0f, 5.25f);
        path5.cubicTo(9.0f, 4.6286798f, 9.503679f, 4.125f, 10.125f, 4.125f);
        path5.cubicTo(10.746321f, 4.125f, 11.25f, 4.6286798f, 11.25f, 5.25f);
        path5.cubicTo(11.25f, 5.8713202f, 10.746321f, 6.375f, 10.125f, 6.375f);
        instancePath3.close();
        WeChatSVGRenderC2Java.setFillType(instancePath3, 2);
        canvas.drawPath(instancePath3, instancePaint6);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
