package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_clip */
public class icons_filled_clip extends C24542c {
    private final int height = 72;
    private final int width = 72;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 72;
        }
        if (i2 == 2) {
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
            float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 9.0f, 0.0f, 1.0f, 9.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(39.0f, 45.0f);
            instancePath.lineTo(12.0f, 45.0f);
            instancePath.cubicTo(10.343145f, 45.0f, 9.0f, 43.656853f, 9.0f, 42.0f);
            instancePath.lineTo(9.0f, 15.0f);
            instancePath.lineTo(0.0f, 15.0f);
            instancePath.lineTo(0.0f, 9.0f);
            instancePath.lineTo(9.0f, 9.0f);
            instancePath.lineTo(9.0f, 0.0f);
            instancePath.lineTo(15.0f, 0.0f);
            instancePath.lineTo(15.0f, 9.0f);
            instancePath.lineTo(42.0f, 9.0f);
            instancePath.cubicTo(43.656853f, 9.0f, 45.0f, 10.343145f, 45.0f, 12.0f);
            instancePath.lineTo(45.0f, 39.0f);
            instancePath.lineTo(54.0f, 39.0f);
            instancePath.lineTo(54.0f, 45.0f);
            instancePath.lineTo(45.0f, 45.0f);
            instancePath.lineTo(45.0f, 54.0f);
            instancePath.lineTo(39.0f, 54.0f);
            instancePath.lineTo(39.0f, 45.0f);
            instancePath.close();
            instancePath.moveTo(39.0f, 39.0f);
            instancePath.lineTo(39.0f, 15.0f);
            instancePath.lineTo(15.0f, 15.0f);
            instancePath.lineTo(15.0f, 39.0f);
            instancePath.lineTo(39.0f, 39.0f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
