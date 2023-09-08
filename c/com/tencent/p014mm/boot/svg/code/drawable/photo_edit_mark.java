package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.photo_edit_mark */
public class photo_edit_mark extends C24542c {
    private final int height = 44;
    private final int width = 54;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            return 54;
        }
        if (i2 == 1) {
            return 44;
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
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-1);
        canvas.save();
        Paint paint = instancePaint3;
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 0.5f, 0.0f, 1.0f, 0.5f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(paint, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(0.5f, 0.5f);
        instancePath.lineTo(46.5f, 0.5f);
        instancePath.lineTo(46.5f, 36.5f);
        instancePath.lineTo(0.5f, 36.5f);
        instancePath.lineTo(0.5f, 0.5f);
        instancePath.close();
        instancePath.moveTo(42.5f, 2.5f);
        instancePath.lineTo(42.5f, 32.5f);
        instancePath.lineTo(3.5f, 32.5f);
        instancePath.lineTo(3.5f, 2.5f);
        instancePath.lineTo(42.5f, 2.5f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(paint, looper);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(51.0f, 42.5f);
        instancePath2.lineTo(52.5f, 42.5f);
        instancePath2.lineTo(52.5f, 7.5f);
        instancePath2.lineTo(49.5f, 7.5f);
        instancePath2.lineTo(49.5f, 39.5f);
        instancePath2.lineTo(5.5f, 39.5f);
        instancePath2.lineTo(5.5f, 42.5f);
        instancePath2.lineTo(51.0f, 42.5f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.save();
        Paint instancePaint6 = C24542c.instancePaint(paint, looper);
        Path instancePath3 = C24542c.instancePath(looper);
        instancePath3.moveTo(36.170597f, 14.009804f);
        instancePath3.lineTo(28.390347f, 19.793558f);
        instancePath3.lineTo(15.891026f, 9.5f);
        instancePath3.lineTo(0.5576923f, 22.578432f);
        instancePath3.lineTo(0.5576923f, 32.5f);
        instancePath3.lineTo(46.557693f, 32.5f);
        instancePath3.lineTo(46.557693f, 22.578432f);
        instancePath3.close();
        WeChatSVGRenderC2Java.setFillType(instancePath3, 1);
        WeChatSVGRenderC2Java.setFillType(instancePath3, 2);
        canvas.drawPath(instancePath3, instancePaint6);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
