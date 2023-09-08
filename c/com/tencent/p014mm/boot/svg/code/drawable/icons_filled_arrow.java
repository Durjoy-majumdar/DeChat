package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_arrow */
public class icons_filled_arrow extends C24542c {
    private final int height = 72;
    private final int width = 36;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            return 36;
        }
        if (i2 == 1) {
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
            float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, -0.70710677f, -0.70710677f, 48.51019f, 0.70710677f, -0.70710677f, 51.930187f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(3.0f, 22.511883f);
            instancePath.lineTo(27.0f, 22.511883f);
            instancePath.lineTo(27.0f, 28.511883f);
            instancePath.lineTo(6.0f, 28.511883f);
            instancePath.lineTo(6.0f, 49.511883f);
            instancePath.lineTo(0.0f, 49.511883f);
            instancePath.lineTo(0.0f, 25.511883f);
            instancePath.cubicTo(-2.0290612E-16f, 23.855028f, 1.3431457f, 22.511883f, 3.0f, 22.511883f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 2);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
