package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.finder_live_star_shine */
public class finder_live_star_shine extends C24542c {
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
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-1);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 0.70710677f, -0.70710677f, 12.117641f, 0.70710677f, 0.70710677f, -5.019291f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(12.1176405f, 15.899811f);
        instancePath.lineTo(7.188856f, 17.772009f);
        Path path = instancePath;
        path.cubicTo(6.898442f, 17.882322f, 6.573587f, 17.736322f, 6.463273f, 17.445908f);
        path.cubicTo(6.414396f, 17.317232f, 6.414396f, 17.1751f, 6.463273f, 17.046425f);
        instancePath.lineTo(8.335471f, 12.1176405f);
        instancePath.lineTo(8.335471f, 12.1176405f);
        instancePath.lineTo(6.463273f, 7.188856f);
        path.cubicTo(6.352959f, 6.898442f, 6.49896f, 6.573587f, 6.7893744f, 6.463273f);
        path.cubicTo(6.91805f, 6.414396f, 7.0601807f, 6.414396f, 7.188856f, 6.463273f);
        instancePath.lineTo(12.1176405f, 8.335471f);
        instancePath.lineTo(12.1176405f, 8.335471f);
        instancePath.lineTo(17.046425f, 6.463273f);
        path.cubicTo(17.33684f, 6.352959f, 17.661694f, 6.49896f, 17.772009f, 6.7893744f);
        path.cubicTo(17.820885f, 6.91805f, 17.820885f, 7.0601807f, 17.772009f, 7.188856f);
        instancePath.lineTo(15.899811f, 12.1176405f);
        instancePath.lineTo(15.899811f, 12.1176405f);
        instancePath.lineTo(17.772009f, 17.046425f);
        path.cubicTo(17.882322f, 17.33684f, 17.736322f, 17.661694f, 17.445908f, 17.772009f);
        path.cubicTo(17.317232f, 17.820885f, 17.1751f, 17.820885f, 17.046425f, 17.772009f);
        instancePath.lineTo(12.1176405f, 15.899811f);
        instancePath.lineTo(12.1176405f, 15.899811f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
