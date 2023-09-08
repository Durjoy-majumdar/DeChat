package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.offline_lucky_icon */
public class offline_lucky_icon extends C24542c {
    private final int height = 73;
    private final int width = 68;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            return 68;
        }
        if (i2 == 1) {
            return 73;
        }
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
            instancePaint3.setColor(-757915);
            canvas.save();
            float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 9.45f, 0.0f, 1.0f, 6.75f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(0.0f, 2.533342f);
            instancePath.cubicTo(0.0f, 1.1342157f, 1.1371257f, 0.0f, 2.5456994f, 0.0f);
            instancePath.lineTo(47.4043f, 0.0f);
            instancePath.cubicTo(48.810253f, 0.0f, 49.95f, 1.1335528f, 49.95f, 2.533342f);
            instancePath.lineTo(49.95f, 56.866657f);
            instancePath.cubicTo(49.95f, 58.265785f, 48.812874f, 59.4f, 47.4043f, 59.4f);
            instancePath.lineTo(2.5456994f, 59.4f);
            instancePath.cubicTo(1.1397485f, 59.4f, 0.0f, 58.26645f, 0.0f, 56.866657f);
            instancePath.lineTo(0.0f, 2.533342f);
            instancePath.close();
            instancePath.moveTo(4.2814283f, 4.242857f);
            instancePath.lineTo(45.66857f, 4.242857f);
            instancePath.lineTo(45.66857f, 55.157143f);
            instancePath.lineTo(4.2814283f, 55.157143f);
            instancePath.lineTo(4.2814283f, 4.242857f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 2);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            canvas.save();
            Paint instancePaint5 = C24542c.instancePaint(instancePaint3, looper);
            Path instancePath2 = C24542c.instancePath(looper);
            instancePath2.moveTo(24.975f, 21.214287f);
            Path path = instancePath2;
            path.cubicTo(27.733664f, 21.214287f, 29.970001f, 23.430477f, 29.970001f, 26.164286f);
            path.cubicTo(29.970001f, 28.898094f, 27.733664f, 31.114285f, 24.975f, 31.114285f);
            path.cubicTo(22.216337f, 31.114285f, 19.98f, 28.898094f, 19.98f, 26.164286f);
            path.cubicTo(19.98f, 23.430477f, 22.216337f, 21.214287f, 24.975f, 21.214287f);
            instancePath2.close();
            canvas.drawPath(instancePath2, instancePaint5);
            canvas.restore();
            canvas.save();
            Paint instancePaint6 = C24542c.instancePaint(instancePaint3, looper);
            Path instancePath3 = C24542c.instancePath(looper);
            instancePath3.moveTo(32.8229f, 26.016615f);
            Path path2 = instancePath3;
            path2.cubicTo(42.771538f, 23.7808f, 49.95f, 17.410063f, 49.95f, 9.9f);
            path2.cubicTo(49.95f, 7.916405f, 49.449215f, 6.0122924f, 48.528873f, 4.242857f);
            instancePath3.lineTo(45.262028f, 4.242857f);
            Path path3 = instancePath3;
            path3.cubicTo(45.528664f, 5.0701585f, 45.66857f, 5.96271f, 45.66857f, 6.9225564f);
            path3.cubicTo(45.66857f, 13.030636f, 40.002968f, 20.055094f, 32.067444f, 22.827524f);
            path3.cubicTo(32.532673f, 23.796925f, 32.801483f, 24.876797f, 32.8229f, 26.016615f);
            instancePath3.close();
            instancePath3.moveTo(17.1271f, 26.016615f);
            Path path4 = instancePath3;
            path4.cubicTo(7.178464f, 23.7808f, 0.0f, 17.410063f, 0.0f, 9.9f);
            path4.cubicTo(0.0f, 7.916405f, 0.5007839f, 6.0122924f, 1.421125f, 4.242857f);
            instancePath3.lineTo(4.6879735f, 4.242857f);
            Path path5 = instancePath3;
            path5.cubicTo(4.4213357f, 5.0701585f, 4.2814283f, 5.96271f, 4.2814283f, 6.9225564f);
            path5.cubicTo(4.2814283f, 13.030636f, 9.947033f, 20.055094f, 17.882557f, 22.827524f);
            path5.cubicTo(17.417328f, 23.796925f, 17.148516f, 24.876797f, 17.1271f, 26.016615f);
            instancePath3.close();
            WeChatSVGRenderC2Java.setFillType(instancePath3, 2);
            canvas.drawPath(instancePath3, instancePaint6);
            canvas.restore();
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
