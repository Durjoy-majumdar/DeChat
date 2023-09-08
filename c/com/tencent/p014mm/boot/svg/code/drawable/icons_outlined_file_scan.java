package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_file_scan */
public class icons_outlined_file_scan extends C24542c {
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
        instancePaint3.setColor(-16777216);
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 6.0f, 0.0f, 1.0f, 6.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(12.6f, 40.2f);
        instancePath.lineTo(12.6f, 56.4f);
        instancePath.lineTo(50.4f, 56.4f);
        instancePath.lineTo(50.4f, 40.2f);
        instancePath.lineTo(54.0f, 40.2f);
        instancePath.lineTo(54.0f, 57.004063f);
        instancePath.cubicTo(54.0f, 58.66269f, 52.662483f, 60.0f, 51.012573f, 60.0f);
        instancePath.lineTo(11.987426f, 60.0f);
        instancePath.cubicTo(10.346761f, 60.0f, 9.0f, 58.658672f, 9.0f, 57.004063f);
        instancePath.lineTo(9.0f, 40.2f);
        instancePath.lineTo(12.6f, 40.2f);
        instancePath.close();
        instancePath.moveTo(0.0f, 36.6f);
        instancePath.lineTo(0.0f, 33.0f);
        instancePath.lineTo(9.0f, 33.0f);
        instancePath.lineTo(9.0f, 2.9959373f);
        instancePath.cubicTo(9.0f, 1.3373097f, 10.337516f, 0.0f, 11.987426f, 0.0f);
        instancePath.lineTo(35.993713f, 0.0f);
        instancePath.lineTo(54.0f, 18.0f);
        instancePath.lineTo(54.0f, 33.0f);
        instancePath.lineTo(60.0f, 33.0f);
        instancePath.lineTo(60.0f, 36.6f);
        instancePath.lineTo(0.0f, 36.6f);
        instancePath.close();
        instancePath.moveTo(31.199f, 3.6f);
        instancePath.lineTo(12.6f, 3.6f);
        instancePath.lineTo(12.6f, 33.0f);
        instancePath.lineTo(50.4f, 33.0f);
        instancePath.lineTo(50.4f, 22.799f);
        instancePath.lineTo(36.0f, 22.8f);
        instancePath.cubicTo(33.349033f, 22.8f, 31.2f, 20.650967f, 31.2f, 18.0f);
        instancePath.lineTo(31.199f, 3.6f);
        instancePath.close();
        instancePath.moveTo(34.799f, 3.897f);
        instancePath.lineTo(34.8f, 18.0f);
        instancePath.cubicTo(34.8f, 18.662743f, 35.337257f, 19.2f, 36.0f, 19.2f);
        instancePath.lineTo(50.109f, 19.2f);
        instancePath.lineTo(34.799f, 3.897f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
