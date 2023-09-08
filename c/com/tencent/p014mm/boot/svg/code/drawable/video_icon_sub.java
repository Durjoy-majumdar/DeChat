package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.video_icon_sub */
public class video_icon_sub extends C24542c {
    private final int height = 27;
    private final int width = 42;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            return 42;
        }
        if (i2 == 1) {
            return 27;
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
        Paint paint = instancePaint;
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.5f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint3 = C24542c.instancePaint(paint, looper);
        instancePaint3.setColor(-1);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(0.0f, 0.5f);
        instancePath.lineTo(26.0f, 0.5f);
        instancePath.lineTo(26.0f, 24.5f);
        instancePath.lineTo(0.0f, 24.5f);
        instancePath.lineTo(0.0f, 0.5f);
        instancePath.close();
        instancePath.moveTo(2.0f, 2.5f);
        instancePath.lineTo(2.0f, 22.5f);
        instancePath.lineTo(24.0f, 22.5f);
        instancePath.lineTo(24.0f, 2.5f);
        instancePath.lineTo(2.0f, 2.5f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 27.363636f, 0.0f, 1.0f, 1.090909f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        canvas.restore();
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(paint, looper);
        instancePaint4.setColor(-1);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(31.008236f, 11.565939f);
        instancePath2.lineTo(31.002834f, 13.579968f);
        instancePath2.lineTo(39.986187f, 19.714403f);
        instancePath2.lineTo(39.997097f, 5.3252935f);
        instancePath2.lineTo(31.008236f, 11.565939f);
        instancePath2.close();
        instancePath2.moveTo(29.011042f, 10.51777f);
        instancePath2.lineTo(42.0f, 1.5f);
        instancePath2.lineTo(41.983315f, 23.5f);
        instancePath2.lineTo(29.0f, 14.634123f);
        instancePath2.lineTo(29.011042f, 10.51777f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
