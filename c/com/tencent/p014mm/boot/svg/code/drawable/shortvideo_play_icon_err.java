package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.shortvideo_play_icon_err */
public class shortvideo_play_icon_err extends C24542c {
    private final int height = 120;
    private final int width = 120;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 120;
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
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.6666666f, 0.0f, 0.0f, 0.0f, 1.6666666f, 0.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        C24542c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
        canvas.save();
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(637534208);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(36.0f, 0.0f);
        Path path = instancePath;
        path.cubicTo(55.88225f, 0.0f, 72.0f, 16.117748f, 72.0f, 36.0f);
        path.cubicTo(72.0f, 55.88225f, 55.88225f, 72.0f, 36.0f, 72.0f);
        path.cubicTo(16.117748f, 72.0f, 0.0f, 55.88225f, 0.0f, 36.0f);
        path.cubicTo(0.0f, 16.117748f, 16.117748f, 0.0f, 36.0f, 0.0f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-1);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(36.0f, 0.0f);
        Path path2 = instancePath2;
        path2.cubicTo(55.88225f, 0.0f, 72.0f, 16.117748f, 72.0f, 36.0f);
        path2.cubicTo(72.0f, 55.88225f, 55.88225f, 72.0f, 36.0f, 72.0f);
        path2.cubicTo(16.117748f, 72.0f, 0.0f, 55.88225f, 0.0f, 36.0f);
        path2.cubicTo(0.0f, 16.117748f, 16.117748f, 0.0f, 36.0f, 0.0f);
        instancePath2.close();
        instancePath2.moveTo(36.0f, 2.16f);
        Path path3 = instancePath2;
        path3.cubicTo(17.310684f, 2.16f, 2.16f, 17.310684f, 2.16f, 36.0f);
        path3.cubicTo(2.16f, 54.689316f, 17.310684f, 69.84f, 36.0f, 69.84f);
        path3.cubicTo(54.689316f, 69.84f, 69.84f, 54.689316f, 69.84f, 36.0f);
        path3.cubicTo(69.84f, 17.310684f, 54.689316f, 2.16f, 36.0f, 2.16f);
        instancePath2.close();
        instancePath2.moveTo(35.98428f, 47.686035f);
        Path path4 = instancePath2;
        path4.cubicTo(37.778713f, 47.686035f, 39.142483f, 49.02588f, 39.142483f, 50.77246f);
        path4.cubicTo(39.142483f, 52.519043f, 37.778713f, 53.858887f, 35.98428f, 53.858887f);
        path4.cubicTo(34.237698f, 53.858887f, 32.850002f, 52.519043f, 32.850002f, 50.77246f);
        path4.cubicTo(32.850002f, 49.02588f, 34.237698f, 47.686035f, 35.98428f, 47.686035f);
        instancePath2.close();
        instancePath2.moveTo(38.663967f, 15.475098f);
        instancePath2.lineTo(38.281155f, 42.063477f);
        instancePath2.lineTo(33.71133f, 42.063477f);
        instancePath2.lineTo(33.328518f, 15.475098f);
        instancePath2.lineTo(38.663967f, 15.475098f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
