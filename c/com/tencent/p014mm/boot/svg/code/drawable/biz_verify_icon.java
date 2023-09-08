package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.biz_verify_icon */
public class biz_verify_icon extends C24542c {
    private final int height = 48;
    private final int width = 48;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 48;
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
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-36352);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(15.346995f, 0.5783295f);
        instancePath.cubicTo(22.18465f, -1.1732551f, 29.903292f, 1.1388365f, 34.658615f, 6.363563f);
        Path path = instancePath;
        path.cubicTo(39.944534f, 11.888561f, 41.47625f, 20.57642f, 38.49291f, 27.612785f);
        path.cubicTo(35.00901f, 36.751053f, 24.08678f, 42.07587f, 14.7263f, 39.2333f);
        path.cubicTo(7.2579393f, 37.361607f, 1.3813599f, 30.705584f, 0.2901382f, 23.098701f);
        path.cubicTo(-1.5319017f, 13.179729f, 5.4358993f, 2.6401947f, 15.346995f, 0.5783295f);
        path.lineTo(15.346995f, 0.5783295f);
        path.close();
        WeChatSVGRenderC2Java.setFillType(path, 2);
        canvas.drawPath(path, instancePaint4);
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-70474);
        float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 2.0f, 0.0f, 1.0f, 2.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint6 = C24542c.instancePaint(instancePaint5, looper);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(13.42649f, 0.6276179f);
        Path path2 = instancePath2;
        path2.cubicTo(22.175201f, -1.8918488f, 32.143734f, 3.4270253f, 34.983315f, 12.055199f);
        path2.cubicTo(37.472946f, 18.893751f, 35.273273f, 27.092016f, 29.664099f, 31.721035f);
        path2.cubicTo(23.984934f, 36.70998f, 15.086246f, 37.41983f, 8.687188f, 33.41068f);
        path2.cubicTo(2.7280664f, 29.891422f, -0.7814165f, 22.712942f, 0.1484465f, 15.854395f);
        path2.cubicTo(0.91833305f, 8.685912f, 6.4475183f, 2.3772476f, 13.42649f, 0.6276179f);
        instancePath2.lineTo(13.42649f, 0.6276179f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint6);
        canvas.restore();
        canvas.restore();
        canvas.save();
        Paint instancePaint7 = C24542c.instancePaint(instancePaint, looper);
        instancePaint7.setColor(-36352);
        Path instancePath3 = C24542c.instancePath(looper);
        instancePath3.moveTo(15.0255995f, 27.656855f);
        instancePath3.lineTo(15.003011f, 27.679443f);
        instancePath3.lineTo(17.831438f, 30.50787f);
        instancePath3.lineTo(31.450668f, 16.88864f);
        instancePath3.lineTo(28.622242f, 14.060212f);
        instancePath3.lineTo(17.854027f, 24.828426f);
        instancePath3.lineTo(11.996721f, 18.971123f);
        instancePath3.lineTo(9.168295f, 21.79955f);
        instancePath3.lineTo(15.0255995f, 27.656855f);
        instancePath3.close();
        WeChatSVGRenderC2Java.setFillType(instancePath3, 2);
        canvas.drawPath(instancePath3, instancePaint7);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
