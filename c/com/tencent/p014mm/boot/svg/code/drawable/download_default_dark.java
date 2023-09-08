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

/* renamed from: com.tencent.mm.boot.svg.code.drawable.download_default_dark */
public class download_default_dark extends C24542c {
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
        Paint paint = instancePaint;
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -264.0f, 0.0f, 1.0f, -40.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 264.0f, 0.0f, 1.0f, 40.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        Paint instancePaint3 = C24542c.instancePaint(paint, looper);
        instancePaint3.setColor(-2565928);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(0.0f, 0.0f);
        instancePath.lineTo(24.0f, 0.0f);
        instancePath.lineTo(24.0f, 23.0f);
        instancePath.lineTo(24.0f, 24.0f);
        instancePath.lineTo(0.0f, 24.0f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.saveLayerAlpha((RectF) null, 0, 31);
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(paint, looper);
        instancePaint5.setColor(-855638017);
        float[] matrixFloatArray3 = C24542c.setMatrixFloatArray(matrixFloatArray2, 1.0f, 0.0f, 2.0f, 0.0f, 1.0f, 2.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray3);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint6 = C24542c.instancePaint(instancePaint5, looper);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(10.0f, 0.0f);
        Path path = instancePath2;
        path.cubicTo(15.522847f, 0.0f, 20.0f, 4.4771523f, 20.0f, 10.0f);
        path.cubicTo(20.0f, 15.522847f, 15.522847f, 20.0f, 10.0f, 20.0f);
        path.cubicTo(4.4771523f, 20.0f, 0.0f, 15.522847f, 0.0f, 10.0f);
        path.cubicTo(0.0f, 4.4771523f, 4.4771523f, 0.0f, 10.0f, 0.0f);
        instancePath2.close();
        instancePath2.moveTo(10.0f, 1.6666666f);
        path.cubicTo(5.397627f, 1.6666666f, 1.6666666f, 5.397627f, 1.6666666f, 10.0f);
        path.cubicTo(1.6666666f, 14.602373f, 5.397627f, 18.333334f, 10.0f, 18.333334f);
        path.cubicTo(14.602373f, 18.333334f, 18.333334f, 14.602373f, 18.333334f, 10.0f);
        path.cubicTo(18.333334f, 5.397627f, 14.602373f, 1.6666666f, 10.0f, 1.6666666f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint6);
        canvas.restore();
        canvas.save();
        float[] matrixFloatArray4 = C24542c.setMatrixFloatArray(matrixFloatArray3, 1.0f, 0.0f, 4.451329f, 0.0f, 1.0f, 4.496923f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray4);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint7 = C24542c.instancePaint(instancePaint5, looper);
        Path instancePath3 = C24542c.instancePath(looper);
        instancePath3.moveTo(6.4001856f, 1.8651747E-13f);
        instancePath3.lineTo(6.400015f, 8.271f);
        instancePath3.lineTo(8.856973f, 5.815717f);
        instancePath3.lineTo(10.104809f, 7.063553f);
        instancePath3.lineTo(6.1533294f, 11.015032f);
        instancePath3.cubicTo(5.8352556f, 11.333106f, 5.3347573f, 11.3575735f, 4.9886184f, 11.088433f);
        instancePath3.lineTo(4.905494f, 11.015032f);
        instancePath3.lineTo(0.95401496f, 7.063553f);
        instancePath3.lineTo(2.2018504f, 5.815717f);
        instancePath3.lineTo(4.635015f, 8.25f);
        instancePath3.lineTo(4.63548f, 1.8651747E-13f);
        instancePath3.lineTo(6.4001856f, 1.8651747E-13f);
        instancePath3.close();
        WeChatSVGRenderC2Java.setFillType(instancePath3, 2);
        canvas.drawPath(instancePath3, instancePaint7);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
