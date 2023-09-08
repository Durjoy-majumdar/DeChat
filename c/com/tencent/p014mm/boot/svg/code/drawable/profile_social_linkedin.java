package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.profile_social_linkedin */
public class profile_social_linkedin extends C24542c {
    private final int height = 76;
    private final int width = 76;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 76;
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
        instancePaint3.setColor(-789517);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(0.0f, 4.0f);
        Path path = instancePath;
        path.cubicTo(0.0f, 1.7908609f, 1.7908609f, 0.0f, 4.0f, 0.0f);
        instancePath.lineTo(72.0f, 0.0f);
        path.cubicTo(74.20914f, 0.0f, 76.0f, 1.7908609f, 76.0f, 4.0f);
        instancePath.lineTo(76.0f, 72.0f);
        path.cubicTo(76.0f, 74.20914f, 74.20914f, 76.0f, 72.0f, 76.0f);
        instancePath.lineTo(4.0f, 76.0f);
        path.cubicTo(1.7908609f, 76.0f, 0.0f, 74.20914f, 0.0f, 72.0f);
        instancePath.lineTo(0.0f, 4.0f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-5658199);
        Paint paint = instancePaint4;
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 15.0f, 0.0f, 1.0f, 14.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(paint, looper);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(3.077093f, 0.40822864f);
        Path path2 = instancePath2;
        path2.cubicTo(6.376807f, -1.1489923f, 10.591013f, 1.994287f, 9.93107f, 5.6854773f);
        path2.cubicTo(9.553961f, 9.520855f, 4.528967f, 11.36645f, 1.7572072f, 8.838369f);
        path2.cubicTo(-1.1371136f, 6.6563373f, -0.28861567f, 1.590563f, 3.077093f, 0.40822864f);
        instancePath2.lineTo(3.077093f, 0.40822864f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.save();
        Paint instancePaint6 = C24542c.instancePaint(paint, looper);
        Path instancePath3 = C24542c.instancePath(looper);
        instancePath3.moveTo(23.623188f, 16.071012f);
        Path path3 = instancePath3;
        path3.cubicTo(26.064592f, 14.068773f, 28.851942f, 12.245839f, 32.093967f, 12.086457f);
        path3.cubicTo(38.943733f, 11.219816f, 45.90223f, 16.98746f, 45.93188f, 24.050083f);
        path3.cubicTo(46.07026f, 31.361742f, 45.95165f, 38.6734f, 45.971416f, 45.985058f);
        path3.cubicTo(42.976498f, 46.004982f, 39.971695f, 46.004982f, 36.976776f, 45.985058f);
        path3.cubicTo(36.8977f, 39.330853f, 37.075615f, 32.676643f, 36.927353f, 26.022438f);
        path3.cubicTo(37.085503f, 22.396492f, 33.73475f, 19.238733f, 30.196198f, 19.418037f);
        path3.cubicTo(26.677414f, 19.28854f, 23.465042f, 22.436338f, 23.553999f, 25.992554f);
        path3.cubicTo(23.326662f, 32.656723f, 23.563883f, 39.32089f, 23.455156f, 45.995018f);
        instancePath3.lineTo(16.04199f, 45.995018f);
        Path path4 = instancePath3;
        path4.cubicTo(16.170485f, 35.127148f, 15.755347f, 24.249311f, 16.249557f, 13.391398f);
        path4.cubicTo(18.52293f, 13.431244f, 20.7963f, 13.441206f, 23.079557f, 13.431244f);
        path4.cubicTo(23.208052f, 14.088696f, 23.48481f, 15.403599f, 23.623188f, 16.071012f);
        instancePath3.lineTo(23.623188f, 16.071012f);
        instancePath3.close();
        WeChatSVGRenderC2Java.setFillType(instancePath3, 2);
        canvas.drawPath(instancePath3, instancePaint6);
        canvas.restore();
        canvas.save();
        Paint instancePaint7 = C24542c.instancePaint(paint, looper);
        Path instancePath4 = C24542c.instancePath(looper);
        instancePath4.moveTo(1.0f, 13.019893f);
        Path path5 = instancePath4;
        path5.cubicTo(3.6736567f, 12.989608f, 6.336828f, 12.989608f, 9.0f, 13.050178f);
        path5.cubicTo(8.968545f, 24.023357f, 9.010485f, 34.996536f, 8.979031f, 45.97981f);
        path5.cubicTo(6.3263435f, 45.989906f, 3.6841416f, 46.0f, 1.0314548f, 46.0f);
        path5.cubicTo(1.0f, 35.00663f, 1.0524247f, 24.013262f, 1.0f, 13.019893f);
        instancePath4.lineTo(1.0f, 13.019893f);
        instancePath4.close();
        WeChatSVGRenderC2Java.setFillType(instancePath4, 2);
        canvas.drawPath(instancePath4, instancePaint7);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
