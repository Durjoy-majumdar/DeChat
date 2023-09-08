package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.sns_shoot_location_pressed */
public class sns_shoot_location_pressed extends C24542c {
    private final int height = 60;
    private final int width = 60;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 60;
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
                instancePaint3.setColor(-12206054);
                float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 9.0f, 0.0f, 1.0f, 2.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(4.24f, 9.3f);
                Path path = instancePath;
                path.cubicTo(8.92f, 2.94f, 17.39f, -0.19f, 25.1f, 1.41f);
                path.cubicTo(32.66f, 2.78f, 39.15f, 8.72f, 41.17f, 16.14f);
                path.cubicTo(43.04f, 22.59f, 41.49f, 29.57f, 38.39f, 35.38f);
                path.cubicTo(34.3f, 42.96f, 27.97f, 49.1f, 21.0f, 54.04f);
                path.cubicTo(12.64f, 48.07f, 4.94f, 40.33f, 1.47f, 30.46f);
                path.cubicTo(-1.06f, 23.52f, -0.39f, 15.22f, 4.24f, 9.3f);
                instancePath.lineTo(4.24f, 9.3f);
                instancePath.close();
                instancePath.moveTo(17.121176f, 14.014381f);
                path.cubicTo(11.980267f, 16.542173f, 11.574966f, 24.57351f, 16.44923f, 27.602592f);
                path.cubicTo(21.355494f, 31.324953f, 29.25884f, 27.197294f, 28.949532f, 21.032469f);
                path.cubicTo(29.25884f, 15.198284f, 22.102098f, 10.963966f, 17.121176f, 14.014381f);
                instancePath.lineTo(17.121176f, 14.014381f);
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
