package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.bottomsheet_icon_transmit */
public class bottomsheet_icon_transmit extends C24542c {
    private final int height = 96;
    private final int width = 96;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 96;
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
        instancePaint3.setColor(-8617594);
        canvas.save();
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 8.0f, 0.0f, 1.0f, 9.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(73.0f, 34.00018f);
        instancePath.lineTo(73.0f, 57.00018f);
        instancePath.cubicTo(72.9f, 59.03468f, 71.0865f, 60.857323f, 69.0f, 61.00018f);
        instancePath.lineTo(12.0f, 61.00018f);
        instancePath.cubicTo(9.91305f, 60.857323f, 8.1f, 59.03468f, 8.0f, 57.00018f);
        instancePath.lineTo(8.0f, 24.000181f);
        instancePath.cubicTo(8.1f, 21.966133f, 9.91305f, 20.143038f, 12.0f, 20.000181f);
        instancePath.lineTo(19.0f, 20.000181f);
        Path path = instancePath;
        path.cubicTo(19.35f, 20.13399f, 21.7467f, 16.067085f, 29.0f, 12.00018f);
        instancePath.lineTo(12.0f, 12.00018f);
        path.cubicTo(5.4396f, 12.00018f, 0.0f, 17.468561f, 0.0f, 24.000181f);
        instancePath.lineTo(0.0f, 57.00018f);
        path.cubicTo(0.0f, 63.5318f, 5.4396f, 69.00018f, 12.0f, 69.00018f);
        instancePath.lineTo(69.0f, 69.00018f);
        instancePath.cubicTo(75.5604f, 69.00018f, 81.0f, 63.5318f, 81.0f, 57.00018f);
        instancePath.lineTo(81.0f, 28.000181f);
        instancePath.lineTo(73.0f, 34.00018f);
        instancePath.close();
        instancePath.moveTo(53.0f, 29.000181f);
        instancePath.lineTo(53.0f, 41.00018f);
        instancePath.lineTo(77.0f, 20.000181f);
        instancePath.lineTo(53.0f, 1.8039216E-4f);
        instancePath.lineTo(53.0f, 12.00018f);
        Path path2 = instancePath;
        path2.cubicTo(32.732662f, 12.273722f, 16.57688f, 28.172049f, 16.0f, 48.00018f);
        path2.cubicTo(24.49405f, 36.795803f, 37.67185f, 29.378492f, 53.0f, 29.000181f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
