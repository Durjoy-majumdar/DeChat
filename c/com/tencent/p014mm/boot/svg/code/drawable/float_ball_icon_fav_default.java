package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.float_ball_icon_fav_default */
public class float_ball_icon_fav_default extends C24542c {
    private final int height = 120;
    private final int width = 120;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 120;
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
                canvas.save();
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-1);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(0.0f, 0.0f);
                instancePath.lineTo(120.0f, 0.0f);
                instancePath.lineTo(120.0f, 120.0f);
                instancePath.lineTo(0.0f, 120.0f);
                instancePath.lineTo(0.0f, 0.0f);
                instancePath.close();
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                canvas.save();
                float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 24.0f, 0.0f, 1.0f, 24.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
                instancePaint4.setColor(-15432210);
                Path instancePath2 = C24542c.instancePath(looper);
                instancePath2.moveTo(60.597374f, 19.200624f);
                instancePath2.lineTo(36.0f, 33.401924f);
                instancePath2.lineTo(11.402575f, 19.200594f);
                instancePath2.cubicTo(11.4641075f, 19.16046f, 11.526233f, 19.122423f, 11.588874f, 19.086618f);
                instancePath2.lineTo(33.411125f, 6.612736f);
                instancePath2.cubicTo(34.840923f, 5.7954464f, 37.160156f, 5.796063f, 38.588875f, 6.612736f);
                instancePath2.lineTo(60.411125f, 19.086618f);
                instancePath2.cubicTo(60.47375f, 19.122416f, 60.53586f, 19.160461f, 60.597374f, 19.200624f);
                instancePath2.lineTo(60.597374f, 19.200624f);
                instancePath2.close();
                WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint4);
                canvas.restore();
                canvas.save();
                Paint instancePaint5 = C24542c.instancePaint(instancePaint, looper);
                instancePaint5.setColor(-372399);
                Path instancePath3 = C24542c.instancePath(looper);
                instancePath3.moveTo(62.96887f, 23.027594f);
                instancePath3.cubicTo(62.98936f, 23.187063f, 63.0f, 23.344381f, 63.0f, 23.49818f);
                instancePath3.lineTo(63.0f, 48.50182f);
                instancePath3.cubicTo(63.0f, 50.120968f, 61.839844f, 52.09671f, 60.411125f, 52.913383f);
                instancePath3.lineTo(38.588875f, 65.38726f);
                instancePath3.cubicTo(38.480747f, 65.44907f, 38.36753f, 65.5062f, 38.25f, 65.558655f);
                instancePath3.lineTo(38.25f, 37.299038f);
                instancePath3.lineTo(62.96887f, 23.027594f);
                instancePath3.lineTo(62.96887f, 23.027594f);
                instancePath3.close();
                WeChatSVGRenderC2Java.setFillType(instancePath3, 2);
                canvas.drawPath(instancePath3, instancePaint5);
                canvas.restore();
                canvas.save();
                Paint instancePaint6 = C24542c.instancePaint(instancePaint, looper);
                instancePaint6.setColor(-15616);
                Path instancePath4 = C24542c.instancePath(looper);
                instancePath4.moveTo(33.75f, 65.55865f);
                instancePath4.cubicTo(33.632458f, 65.506195f, 33.51924f, 65.449066f, 33.411125f, 65.38726f);
                instancePath4.lineTo(11.588874f, 52.913383f);
                instancePath4.cubicTo(10.159078f, 52.096092f, 9.0f, 50.107227f, 9.0f, 48.50182f);
                instancePath4.lineTo(9.0f, 23.49818f);
                instancePath4.cubicTo(9.0f, 23.344044f, 9.010513f, 23.186676f, 9.030771f, 23.027386f);
                instancePath4.lineTo(33.75f, 37.299038f);
                instancePath4.lineTo(33.75f, 65.55865f);
                instancePath4.lineTo(33.75f, 65.55865f);
                instancePath4.close();
                WeChatSVGRenderC2Java.setFillType(instancePath4, 2);
                canvas.drawPath(instancePath4, instancePaint6);
                canvas.restore();
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i3;
    }
}
