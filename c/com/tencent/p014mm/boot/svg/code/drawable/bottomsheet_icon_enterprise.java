package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.bottomsheet_icon_enterprise */
public class bottomsheet_icon_enterprise extends C24542c {
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
                float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 7.0f, 0.0f, 1.0f, 13.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-8617851);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(40.5001f, 1.0E-4f);
                Path path = instancePath;
                path.cubicTo(16.1941f, 1.0E-4f, 1.0E-4f, 14.5371f, 1.0E-4f, 32.4701f);
                path.cubicTo(1.0E-4f, 42.0741f, 4.6671f, 50.7011f, 12.7231f, 56.6461f);
                instancePath.lineTo(8.1001f, 69.0001f);
                instancePath.lineTo(23.6971f, 62.3011f);
                Path path2 = instancePath;
                path2.cubicTo(28.6931f, 63.9971f, 34.3371f, 64.9411f, 40.5001f, 64.9411f);
                path2.cubicTo(64.7401f, 64.9411f, 81.0001f, 50.4031f, 81.0001f, 32.4701f);
                path2.cubicTo(81.0001f, 14.5371f, 64.8061f, 1.0E-4f, 40.5001f, 1.0E-4f);
                instancePath.close();
                instancePath.moveTo(70.6401f, 39.7451f);
                instancePath.lineTo(68.6931f, 45.4211f);
                Path path3 = instancePath;
                path3.cubicTo(66.3191f, 44.6061f, 61.0241f, 42.3231f, 56.2901f, 37.0491f);
                path3.cubicTo(49.8301f, 45.3031f, 42.3131f, 46.0001f, 40.0001f, 46.0001f);
                path3.cubicTo(37.6871f, 46.0001f, 30.1701f, 45.3031f, 23.7101f, 37.0491f);
                path3.cubicTo(18.9761f, 42.3231f, 13.6811f, 44.6061f, 11.3071f, 45.4211f);
                instancePath.lineTo(9.3601f, 39.7451f);
                Path path4 = instancePath;
                path4.cubicTo(11.3931f, 39.0471f, 16.1241f, 36.9871f, 20.1311f, 32.0001f);
                path4.cubicTo(16.1241f, 27.0121f, 11.3931f, 24.9531f, 9.3601f, 24.2551f);
                instancePath.lineTo(11.3071f, 18.5791f);
                Path path5 = instancePath;
                path5.cubicTo(13.6811f, 19.3941f, 18.9761f, 21.6771f, 23.7101f, 26.9511f);
                path5.cubicTo(30.1701f, 18.6971f, 37.6871f, 18.0001f, 40.0001f, 18.0001f);
                path5.cubicTo(42.3131f, 18.0001f, 49.8301f, 18.6971f, 56.2901f, 26.9511f);
                path5.cubicTo(61.0241f, 21.6771f, 66.3191f, 19.3941f, 68.6931f, 18.5791f);
                instancePath.lineTo(70.6401f, 24.2551f);
                Path path6 = instancePath;
                path6.cubicTo(68.6071f, 24.9531f, 63.8751f, 27.0121f, 59.8681f, 32.0001f);
                path6.cubicTo(63.8751f, 36.9871f, 68.6071f, 39.0471f, 70.6401f, 39.7451f);
                instancePath.close();
                instancePath.moveTo(40.0f, 24.0f);
                Path path7 = instancePath;
                path7.cubicTo(38.298f, 24.0f, 32.505f, 24.612f, 27.463f, 32.0f);
                path7.cubicTo(32.505f, 39.388f, 38.298f, 40.0f, 40.0f, 40.0f);
                path7.cubicTo(41.702f, 40.0f, 47.495f, 39.388f, 52.537f, 32.0f);
                path7.cubicTo(47.495f, 24.612f, 41.702f, 24.0f, 40.0f, 24.0f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i3;
    }
}
