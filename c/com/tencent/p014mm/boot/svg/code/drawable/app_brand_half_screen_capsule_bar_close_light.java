package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.app_brand_half_screen_capsule_bar_close_light */
public class app_brand_half_screen_capsule_bar_close_light extends C24542c {
    private final int height = 32;
    private final int width = 32;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 32;
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
        Paint paint = instancePaint;
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -29.0f, 0.0f, 1.0f, -29.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 29.0f, 0.0f, 1.0f, 29.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(paint, looper);
        Paint instancePaint5 = C24542c.instancePaint(instancePaint3, looper);
        instancePaint4.setColor(-1728053249);
        instancePaint5.setColor(865572759);
        instancePaint5.setStrokeWidth(0.5f);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(16.0f, 0.25f);
        Path path = instancePath;
        path.cubicTo(24.698486f, 0.25f, 31.75f, 7.3015146f, 31.75f, 16.0f);
        path.cubicTo(31.75f, 24.698486f, 24.698486f, 31.75f, 16.0f, 31.75f);
        path.cubicTo(7.3015146f, 31.75f, 0.25f, 24.698486f, 0.25f, 16.0f);
        path.cubicTo(0.25f, 7.3015146f, 7.3015146f, 0.25f, 16.0f, 0.25f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint4);
        canvas.drawPath(instancePath, instancePaint5);
        canvas.restore();
        canvas.save();
        Paint instancePaint6 = C24542c.instancePaint(paint, looper);
        instancePaint6.setColor(-436207616);
        float[] matrixFloatArray3 = C24542c.setMatrixFloatArray(matrixFloatArray2, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 4.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray3);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray4 = C24542c.setMatrixFloatArray(matrixFloatArray3, 1.0f, 0.0f, 6.0f, 0.0f, 1.0f, 6.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray4);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint7 = C24542c.instancePaint(instancePaint6, looper);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(6.0f, 4.8f);
        instancePath2.lineTo(10.8f, 0.0f);
        instancePath2.lineTo(12.0f, 1.2f);
        instancePath2.lineTo(7.2f, 6.0f);
        instancePath2.lineTo(12.0f, 10.8f);
        instancePath2.lineTo(10.8f, 12.0f);
        instancePath2.lineTo(6.0f, 7.2f);
        instancePath2.lineTo(1.2f, 12.0f);
        instancePath2.lineTo(0.0f, 10.8f);
        instancePath2.lineTo(4.8f, 6.0f);
        instancePath2.lineTo(0.0f, 1.2f);
        instancePath2.lineTo(1.2f, 0.0f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint7);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
