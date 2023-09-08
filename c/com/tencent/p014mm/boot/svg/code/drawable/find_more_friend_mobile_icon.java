package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.find_more_friend_mobile_icon */
public class find_more_friend_mobile_icon extends C24542c {
    private final int height = 96;
    private final int width = 96;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 96;
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
                instancePaint3.setColor(-11615450);
                float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 18.0f, 0.0f, 1.0f, 18.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(2.1112194f, 10.565054f);
                Path path = instancePath;
                path.cubicTo(4.587666f, 6.591597f, 8.452122f, 3.6065128f, 12.426419f, 1.2503928f);
                path.cubicTo(14.263783f, 0.21210259f, 15.3522215f, 2.6680582f, 16.330818f, 3.7762334f);
                path.cubicTo(18.937078f, 7.849526f, 22.262306f, 11.45359f, 24.48911f, 15.746521f);
                path.cubicTo(22.951319f, 19.690027f, 17.718826f, 20.53863f, 14.313711f, 22.535341f);
                path.cubicTo(15.721691f, 27.826628f, 19.156763f, 32.249344f, 22.871433f, 36.152916f);
                path.cubicTo(27.245157f, 40.69544f, 32.267952f, 44.898514f, 38.409138f, 46.75546f);
                path.cubicTo(40.096718f, 43.281178f, 41.464756f, 39.487427f, 44.190845f, 36.66208f);
                path.cubicTo(45.83848f, 36.172886f, 47.17656f, 37.660435f, 48.49467f, 38.419186f);
                path.cubicTo(52.08951f, 41.23455f, 56.06381f, 43.56072f, 59.52884f, 46.53582f);
                path.cubicTo(60.647232f, 47.71388f, 59.508865f, 49.14153f, 58.84981f, 50.199787f);
                path.cubicTo(56.333424f, 53.624146f, 53.677235f, 57.22821f, 49.81278f, 59.224922f);
                path.cubicTo(46.797104f, 60.81231f, 43.34206f, 59.654217f, 40.39629f, 58.48614f);
                path.cubicTo(23.520502f, 51.367863f, 9.690345f, 37.480732f, 2.520632f, 20.638466f);
                path.cubicTo(1.1725662f, 17.503628f, 0.10409919f, 13.679925f, 2.1112194f, 10.565054f);
                instancePath.lineTo(2.1112194f, 10.565054f);
                instancePath.lineTo(2.1112194f, 10.565054f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i3;
    }
}
