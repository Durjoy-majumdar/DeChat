package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.app_attach_file_icon_rar_simple */
public class app_attach_file_icon_rar_simple extends C24542c {
    private final int height = 40;
    private final int width = 40;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 40;
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
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 4.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-7645398);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(16.0f, 0.0f);
        instancePath.lineTo(24.0f, 8.0f);
        instancePath.lineTo(23.999853f, 0.87259364f);
        instancePath.cubicTo(23.99995f, 0.8780137f, 24.0f, 0.88344556f, 24.0f, 0.8888889f);
        instancePath.lineTo(24.0f, 31.11111f);
        instancePath.cubicTo(24.0f, 31.602032f, 23.602032f, 32.0f, 23.11111f, 32.0f);
        instancePath.lineTo(0.8888889f, 32.0f);
        instancePath.cubicTo(0.3979691f, 32.0f, 5.9309735E-14f, 31.602032f, 5.684342E-14f, 31.11111f);
        instancePath.lineTo(5.684342E-14f, 0.8888889f);
        instancePath.cubicTo(5.67833E-14f, 0.3979691f, 0.3979691f, 5.342697E-16f, 0.8888889f, 0.0f);
        instancePath.lineTo(16.0f, 0.0f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-16777216);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(24.0f, 8.0f);
        instancePath2.lineTo(16.88889f, 8.0f);
        instancePath2.cubicTo(16.397968f, 8.0f, 16.0f, 7.6020308f, 16.0f, 7.111111f);
        instancePath2.lineTo(16.0f, 0.0f);
        instancePath2.lineTo(16.0f, 0.0f);
        instancePath2.lineTo(24.0f, 8.0f);
        instancePath2.close();
        canvas.saveLayerAlpha((RectF) null, 51, 31);
        Paint instancePaint5 = C24542c.instancePaint(instancePaint4, looper);
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
