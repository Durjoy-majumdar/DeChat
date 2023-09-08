package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_pic_error1 */
public class icons_filled_pic_error1 extends C24542c {
    private final int height = 40;
    private final int width = 40;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 40;
        if (!(i2 == 0 || i2 == 1)) {
            i3 = 0;
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
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-16777216);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                instancePaint4.setColor(201326592);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(0.0f, 0.0f);
                instancePath.lineTo(40.0f, 0.0f);
                instancePath.lineTo(40.0f, 40.0f);
                instancePath.lineTo(0.0f, 40.0f);
                instancePath.lineTo(0.0f, 0.0f);
                instancePath.close();
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                canvas.save();
                Paint instancePaint5 = C24542c.instancePaint(instancePaint3, looper);
                instancePaint5.setColor(419430400);
                float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 10.0f, 0.0f, 1.0f, 10.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                Paint instancePaint6 = C24542c.instancePaint(instancePaint5, looper);
                Path instancePath2 = C24542c.instancePath(looper);
                instancePath2.moveTo(17.50683f, 3.3333333f);
                instancePath2.cubicTo(17.953913f, 3.3333333f, 18.333334f, 3.7342808f, 18.333334f, 4.2288747f);
                instancePath2.lineTo(18.333334f, 15.771126f);
                instancePath2.cubicTo(18.333334f, 16.267626f, 17.963295f, 16.666666f, 17.50683f, 16.666666f);
                instancePath2.lineTo(2.4931693f, 16.666666f);
                instancePath2.cubicTo(2.046088f, 16.666666f, 1.6666666f, 16.265718f, 1.6666666f, 15.771126f);
                instancePath2.lineTo(1.6666666f, 4.2288747f);
                instancePath2.cubicTo(1.6666666f, 3.7323735f, 2.0367045f, 3.3333333f, 2.4931693f, 3.3333333f);
                instancePath2.lineTo(17.50683f, 3.3333333f);
                instancePath2.close();
                instancePath2.moveTo(17.083334f, 4.5833335f);
                instancePath2.lineTo(2.9166667f, 4.5833335f);
                instancePath2.lineTo(2.9166667f, 11.541333f);
                instancePath2.lineTo(6.8327045f, 8.374382f);
                instancePath2.cubicTo(7.218166f, 8.0626545f, 7.8371882f, 8.077773f, 8.208746f, 8.404237f);
                instancePath2.lineTo(11.939102f, 11.681855f);
                instancePath2.lineTo(13.840919f, 10.064582f);
                instancePath2.cubicTo(14.226098f, 9.737031f, 14.838936f, 9.743686f, 15.212859f, 10.079236f);
                instancePath2.lineTo(17.082666f, 11.779333f);
                instancePath2.lineTo(17.083334f, 4.5833335f);
                instancePath2.close();
                WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint6);
                canvas.restore();
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i3;
    }
}
