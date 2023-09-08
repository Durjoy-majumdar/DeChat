package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.get_location_icon */
public class get_location_icon extends C24542c {
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
                float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 9.0f, 0.0f, 1.0f, 3.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(25.094501f, 1.2469155f);
                Path path = instancePath;
                path.cubicTo(32.743237f, 3.0203025f, 39.219376f, 8.896839f, 41.072548f, 16.177034f);
                path.cubicTo(43.13704f, 22.67836f, 41.587963f, 29.62878f, 38.076664f, 35.088516f);
                path.cubicTo(34.412243f, 42.962852f, 28.066027f, 49.068085f, 21.099989f, 54.0f);
                path.cubicTo(12.755159f, 48.05386f, 5.0597496f, 40.37757f, 1.127431f, 30.11181f);
                path.cubicTo(-0.9466681f, 23.652811f, -0.27706745f, 15.399808f, 4.123315f, 9.209645f);
                path.cubicTo(9.027383f, 3.1793966f, 17.492334f, 0.06711942f, 25.094501f, 1.2469155f);
                instancePath.close();
                instancePath.moveTo(16.216259f, 28.788422f);
                Path path2 = instancePath;
                path2.cubicTo(21.350666f, 32.136604f, 29.266953f, 28.065493f, 28.989613f, 22.434635f);
                path2.cubicTo(29.309687f, 16.169382f, 22.162594f, 11.960802f, 17.280704f, 15.021884f);
                path2.cubicTo(11.992141f, 17.4383f, 11.564811f, 25.432486f, 16.216259f, 28.788422f);
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
