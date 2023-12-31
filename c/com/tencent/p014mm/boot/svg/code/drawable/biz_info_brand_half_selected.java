package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.biz_info_brand_half_selected */
public class biz_info_brand_half_selected extends C24542c {
    private final int height = 60;
    private final int width = 60;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 60;
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
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 5.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-2697514);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(18.307041f, 16.743668f);
        Path path = instancePath;
        path.cubicTo(20.848019f, 11.149101f, 23.42901f, 5.5745506f, 25.989996f, 0.0f);
        path.cubicTo(28.641016f, 5.5545344f, 31.141977f, 11.189134f, 33.752983f, 16.773693f);
        path.cubicTo(39.83532f, 17.174019f, 45.91766f, 17.574347f, 52.0f, 17.984682f);
        path.cubicTo(47.568295f, 22.03799f, 43.07657f, 26.03125f, 38.66487f, 30.104576f);
        path.cubicTo(40.075413f, 36.399715f, 41.475952f, 42.694855f, 42.87649f, 48.98999f);
        path.cubicTo(37.25433f, 45.867443f, 31.64217f, 42.724876f, 26.010004f, 39.622345f);
        path.cubicTo(20.377838f, 42.734886f, 14.765679f, 45.867443f, 9.143517f, 49.0f);
        path.cubicTo(10.544055f, 42.694855f, 11.954597f, 36.399715f, 13.355137f, 30.104576f);
        path.cubicTo(9.113505f, 26.24142f, 4.921893f, 22.338236f, 0.58022314f, 18.59518f);
        path.cubicTo(0.4401693f, 18.59518f, 0.15005772f, 18.58517f, 0.0f, 18.575163f);
        instancePath.lineTo(0.0f, 18.324959f);
        instancePath.cubicTo(6.03232f, 17.22406f, 12.214698f, 17.354166f, 18.307041f, 16.743668f);
        instancePath.lineTo(18.307041f, 16.743668f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-14629309);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(0.0f, -3.0f);
        instancePath2.lineTo(26.0f, -3.0f);
        instancePath2.lineTo(26.0f, 50.0f);
        instancePath2.lineTo(0.0f, 50.0f);
        instancePath2.lineTo(0.0f, -3.0f);
        instancePath2.close();
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
