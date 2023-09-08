package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.honey_pay_add_friend */
public class honey_pay_add_friend extends C24542c {
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
        canvas.save();
        C24542c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -175.0f, 0.0f, 1.0f, -368.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-11048043);
        float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 7.0f, 0.0f, 1.0f, 339.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(179.0f, 40.0f);
        instancePath.lineTo(179.0f, 30.0f);
        Path path = instancePath;
        path.cubicTo(179.0f, 29.447716f, 179.44771f, 29.0f, 180.0f, 29.0f);
        path.cubicTo(180.55229f, 29.0f, 181.0f, 29.447716f, 181.0f, 30.0f);
        instancePath.lineTo(181.0f, 40.0f);
        instancePath.lineTo(191.0f, 40.0f);
        Path path2 = instancePath;
        path2.cubicTo(191.55229f, 40.0f, 192.0f, 40.447716f, 192.0f, 41.0f);
        path2.cubicTo(192.0f, 41.552284f, 191.55229f, 42.0f, 191.0f, 42.0f);
        instancePath.lineTo(181.0f, 42.0f);
        instancePath.lineTo(181.0f, 52.0f);
        Path path3 = instancePath;
        path3.cubicTo(181.0f, 52.552284f, 180.55229f, 53.0f, 180.0f, 53.0f);
        path3.cubicTo(179.44771f, 53.0f, 179.0f, 52.552284f, 179.0f, 52.0f);
        instancePath.lineTo(179.0f, 42.0f);
        instancePath.lineTo(169.0f, 42.0f);
        Path path4 = instancePath;
        path4.cubicTo(168.44771f, 42.0f, 168.0f, 41.552284f, 168.0f, 41.0f);
        path4.cubicTo(168.0f, 40.447716f, 168.44771f, 40.0f, 169.0f, 40.0f);
        instancePath.lineTo(179.0f, 40.0f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
