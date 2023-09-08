package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.music_pauseicon_pressed */
public class music_pauseicon_pressed extends C24542c {
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
        instancePath2.moveTo(46.5f, 22.5f);
        path3.cubicTo(48.156853f, 22.5f, 49.5f, 23.843145f, 49.5f, 25.5f);
        instancePath2.lineTo(49.5f, 46.5f);
        path3.cubicTo(49.5f, 48.156853f, 48.156853f, 49.5f, 46.5f, 49.5f);
        instancePath2.lineTo(25.5f, 49.5f);
        path3.cubicTo(23.843145f, 49.5f, 22.5f, 48.156853f, 22.5f, 46.5f);
        instancePath2.lineTo(22.5f, 25.5f);
        path3.cubicTo(22.5f, 23.843145f, 23.843145f, 22.5f, 25.5f, 22.5f);
        instancePath2.lineTo(46.5f, 22.5f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(419430400);
        Path instancePath3 = C24542c.instancePath(looper);
        instancePath3.moveTo(36.0f, 0.0f);
        Path path4 = instancePath3;
        path4.cubicTo(55.88225f, 0.0f, 72.0f, 16.117748f, 72.0f, 36.0f);
        path4.cubicTo(72.0f, 55.88225f, 55.88225f, 72.0f, 36.0f, 72.0f);
        path4.cubicTo(16.117748f, 72.0f, 0.0f, 55.88225f, 0.0f, 36.0f);
        path4.cubicTo(0.0f, 16.117748f, 16.117748f, 0.0f, 36.0f, 0.0f);
        instancePath3.close();
        canvas.drawPath(instancePath3, instancePaint5);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
