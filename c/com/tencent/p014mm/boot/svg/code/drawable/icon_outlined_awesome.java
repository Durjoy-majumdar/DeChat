package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icon_outlined_awesome */
public class icon_outlined_awesome extends C24542c {
    private final int height = 24;
    private final int width = 24;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 24;
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
                instancePaint3.setColor(-436207616);
                float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 2.757333f, 0.0f, 1.0f, 5.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(16.213623f, 7.6450953f);
                Path path = instancePath;
                path.cubicTo(17.65774f, 6.1567516f, 17.640882f, 3.7815373f, 16.17234f, 2.3129942f);
                path.cubicTo(14.688348f, 0.8290019f, 12.282321f, 0.8290019f, 10.798328f, 2.3129942f);
                path.cubicTo(10.606064f, 2.505259f, 10.362191f, 2.7404997f, 10.0655985f, 3.0199451f);
                instancePath.lineTo(9.242693f, 3.7952752f);
                instancePath.lineTo(8.419788f, 3.0199451f);
                Path path2 = instancePath;
                path2.cubicTo(8.123196f, 2.7404997f, 7.8793235f, 2.505259f, 7.6870584f, 2.3129942f);
                path2.cubicTo(6.2030663f, 0.8290019f, 3.7970393f, 0.8290019f, 2.313047f, 2.3129942f);
                path2.cubicTo(0.844522f, 3.7815192f, 0.82756805f, 6.1568704f, 2.2586584f, 7.6326175f);
                instancePath.lineTo(9.242651f, 14.616682f);
                instancePath.lineTo(16.213623f, 7.6450953f);
                instancePath.close();
                instancePath.moveTo(1.4645188f, 1.4644661f);
                Path path3 = instancePath;
                path3.cubicTo(3.4171402f, -0.48815536f, 6.5829654f, -0.48815536f, 8.535586f, 1.4644661f);
                path3.cubicTo(8.718393f, 1.6472728f, 8.954096f, 1.8746326f, 9.242693f, 2.1465456f);
                path3.cubicTo(9.531291f, 1.8746326f, 9.7669935f, 1.6472728f, 9.9498005f, 1.4644661f);
                path3.cubicTo(11.902422f, -0.48815536f, 15.068247f, -0.48815536f, 17.020868f, 1.4644661f);
                path3.cubicTo(18.955326f, 3.3989244f, 18.97332f, 6.5241203f, 17.07485f, 8.480731f);
                instancePath.lineTo(9.9498005f, 15.606602f);
                instancePath.cubicTo(9.559297f, 15.997147f, 8.926131f, 15.99718f, 8.535586f, 15.606676f);
                instancePath.lineTo(1.410126f, 8.481141f);
                instancePath.cubicTo(-0.4879337f, 6.5241203f, -0.4699394f, 3.3989244f, 1.4645188f, 1.4644661f);
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
