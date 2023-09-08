package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_quote_voice */
public class icons_outlined_quote_voice extends C24542c {
    private final int height = 72;
    private final int width = 72;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 72;
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
            instancePaint3.setColor(-16777216);
            canvas.save();
            float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, -1.0f, 0.0f, 58.5f, 0.0f, 1.0f, 4.5f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
            float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, -1.0f, 0.0f, 45.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray2);
            canvas.concat(instanceMatrix);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(45.0f, 31.5f);
            instancePath.cubicTo(45.0f, 43.80101f, 39.963615f, 54.937534f, 31.820807f, 62.99901f);
            instancePath.lineTo(27.822594f, 59.043167f);
            Path path = instancePath;
            path.cubicTo(34.82541f, 51.969753f, 39.15f, 42.23991f, 39.15f, 31.5f);
            path.cubicTo(39.15f, 20.760595f, 34.825813f, 11.031158f, 27.82358f, 3.9578285f);
            instancePath.lineTo(31.819805f, -1.314504E-13f);
            Path path2 = instancePath;
            path2.cubicTo(39.963203f, 8.061553f, 45.0f, 19.198484f, 45.0f, 31.5f);
            instancePath.close();
            instancePath.moveTo(29.25f, 31.5f);
            path2.cubicTo(29.25f, 39.49548f, 25.976496f, 46.734077f, 20.683876f, 51.974007f);
            instancePath.lineTo(16.629457f, 47.962723f);
            Path path3 = instancePath;
            path3.cubicTo(20.815128f, 43.734924f, 23.4f, 37.919327f, 23.4f, 31.5f);
            path3.cubicTo(23.4f, 25.081179f, 20.815536f, 19.265991f, 16.630445f, 15.038276f);
            instancePath.lineTo(20.683878f, 11.025995f);
            instancePath.cubicTo(25.976496f, 16.265926f, 29.25f, 23.50452f, 29.25f, 31.5f);
            instancePath.close();
            instancePath.moveTo(9.546944f, 22.050993f);
            Path path4 = instancePath;
            path4.cubicTo(11.989374f, 24.46938f, 13.5f, 27.810051f, 13.5f, 31.5f);
            path4.cubicTo(13.5f, 35.190456f, 11.988961f, 38.531532f, 9.545941f, 40.95f);
            instancePath.lineTo(0.0f, 31.5f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
