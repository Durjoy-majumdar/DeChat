package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.location_cross_hair */
public class location_cross_hair extends C24542c {
    private final int height = 24;
    private final int width = 24;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 24;
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
        instancePaint3.setColor(-16777216);
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 2.0f, 0.0f, 1.0f, 2.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(20.0f, 9.285714f);
        instancePath.lineTo(18.535715f, 9.285714f);
        Path path = instancePath;
        path.cubicTo(18.196428f, 5.125f, 14.875f, 1.8035715f, 10.714286f, 1.4642857f);
        instancePath.lineTo(10.714286f, 0.0f);
        instancePath.lineTo(9.285714f, 0.0f);
        instancePath.lineTo(9.285714f, 1.4642857f);
        path.cubicTo(5.125f, 1.8035715f, 1.8035715f, 5.125f, 1.4642857f, 9.285714f);
        instancePath.lineTo(0.0f, 9.285714f);
        instancePath.lineTo(0.0f, 10.714286f);
        instancePath.lineTo(1.4642857f, 10.714286f);
        path.cubicTo(1.8035715f, 14.875f, 5.125f, 18.196428f, 9.285714f, 18.535715f);
        instancePath.lineTo(9.285714f, 20.0f);
        instancePath.lineTo(10.714286f, 20.0f);
        instancePath.lineTo(10.714286f, 18.535715f);
        path.cubicTo(14.875f, 18.196428f, 18.196428f, 14.875f, 18.535715f, 10.714286f);
        instancePath.lineTo(20.0f, 10.714286f);
        instancePath.lineTo(20.0f, 9.285714f);
        instancePath.close();
        instancePath.moveTo(10.0f, 17.142857f);
        path.cubicTo(6.053571f, 17.142857f, 2.857143f, 13.946428f, 2.857143f, 10.0f);
        path.cubicTo(2.857143f, 6.053571f, 6.053571f, 2.857143f, 10.0f, 2.857143f);
        path.cubicTo(13.946428f, 2.857143f, 17.142857f, 6.053571f, 17.142857f, 10.0f);
        path.cubicTo(17.142857f, 13.946428f, 13.946428f, 17.142857f, 10.0f, 17.142857f);
        instancePath.close();
        instancePath.moveTo(12.857142f, 10.0f);
        path.cubicTo(12.857142f, 11.571428f, 11.571428f, 12.857142f, 10.0f, 12.857142f);
        path.cubicTo(8.428572f, 12.857142f, 7.142857f, 11.571428f, 7.142857f, 10.0f);
        path.cubicTo(7.142857f, 8.428572f, 8.428572f, 7.142857f, 10.0f, 7.142857f);
        path.cubicTo(11.571428f, 7.142857f, 12.857142f, 8.428572f, 12.857142f, 10.0f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.restore();
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(0.0f, 0.0f);
        instancePath2.lineTo(24.0f, 0.0f);
        instancePath2.lineTo(24.0f, 24.0f);
        instancePath2.lineTo(0.0f, 24.0f);
        instancePath2.lineTo(0.0f, 0.0f);
        instancePath2.close();
        C24542c.done(looper);
        return 0;
    }
}
