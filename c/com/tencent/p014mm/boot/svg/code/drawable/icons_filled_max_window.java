package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_max_window */
public class icons_filled_max_window extends C24542c {
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
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 9.0f, 0.0f, 1.0f, 9.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(54.0f, 36.0f);
        instancePath.lineTo(54.0f, 51.0f);
        Path path = instancePath;
        path.cubicTo(54.0f, 52.656853f, 52.656853f, 54.0f, 51.0f, 54.0f);
        instancePath.lineTo(36.0f, 54.0f);
        instancePath.lineTo(36.0f, 48.0f);
        instancePath.lineTo(48.0f, 48.0f);
        instancePath.lineTo(48.0f, 36.0f);
        instancePath.lineTo(54.0f, 36.0f);
        instancePath.close();
        instancePath.moveTo(18.0f, 0.0f);
        instancePath.lineTo(18.0f, 6.0f);
        instancePath.lineTo(6.0f, 6.0f);
        instancePath.lineTo(6.0f, 18.0f);
        instancePath.lineTo(0.0f, 18.0f);
        instancePath.lineTo(0.0f, 3.0f);
        path.cubicTo(0.0f, 1.3431457f, 1.3431457f, 1.9984014E-15f, 3.0f, 1.9984014E-15f);
        instancePath.lineTo(18.0f, 0.0f);
        instancePath.close();
        instancePath.moveTo(43.751884f, 6.0f);
        instancePath.lineTo(36.0f, 6.0f);
        instancePath.lineTo(36.0f, 0.0f);
        instancePath.lineTo(51.0f, 0.0f);
        path.cubicTo(52.656853f, -3.043592E-16f, 54.0f, 1.3431457f, 54.0f, 3.0f);
        instancePath.lineTo(54.0f, 18.0f);
        instancePath.lineTo(48.0f, 18.0f);
        instancePath.lineTo(48.0f, 10.240922f);
        instancePath.lineTo(34.90264f, 23.334524f);
        instancePath.lineTo(30.66f, 19.091883f);
        instancePath.lineTo(43.751884f, 6.0f);
        instancePath.close();
        instancePath.moveTo(10.2481165f, 47.994526f);
        instancePath.lineTo(18.0f, 47.994526f);
        instancePath.lineTo(18.0f, 53.994526f);
        instancePath.lineTo(3.0f, 53.994526f);
        instancePath.cubicTo(1.3431457f, 53.994526f, 0.0f, 52.65138f, 0.0f, 50.994526f);
        instancePath.lineTo(0.0f, 35.994526f);
        instancePath.lineTo(6.0f, 35.994526f);
        instancePath.lineTo(6.0f, 43.7536f);
        instancePath.lineTo(19.097359f, 30.66f);
        instancePath.lineTo(23.34f, 34.90264f);
        instancePath.lineTo(10.2481165f, 47.994526f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
