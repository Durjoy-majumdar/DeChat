package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_colorful_handoff */
public class icons_outlined_colorful_handoff extends C24542c {
    private final int height = 96;
    private final int width = 96;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 96;
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
            canvas.save();
            Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-15683841);
            float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 6.0f, 0.0f, 1.0f, 9.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(52.60848f, 61.8f);
            instancePath.lineTo(57.329025f, 74.779816f);
            Path path = instancePath;
            path.cubicTo(57.781998f, 76.0255f, 57.139385f, 77.40253f, 55.893703f, 77.85551f);
            path.cubicTo(55.630817f, 77.951096f, 55.353245f, 78.0f, 55.07352f, 78.0f);
            instancePath.lineTo(25.92648f, 78.0f);
            Path path2 = instancePath;
            path2.cubicTo(24.600996f, 78.0f, 23.52648f, 76.92548f, 23.52648f, 75.6f);
            path2.cubicTo(23.52648f, 75.320274f, 23.57538f, 75.0427f, 23.670977f, 74.779816f);
            instancePath.lineTo(28.38948f, 61.8f);
            instancePath.lineTo(52.60848f, 61.8f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            canvas.save();
            Paint instancePaint5 = C24542c.instancePaint(instancePaint3, looper);
            Path instancePath2 = C24542c.instancePath(looper);
            instancePath2.moveTo(76.8f, 0.0f);
            instancePath2.cubicTo(79.1196f, 0.0f, 81.0f, 1.880404f, 81.0f, 4.2f);
            instancePath2.lineTo(81.0f, 52.8f);
            instancePath2.cubicTo(81.0f, 55.119595f, 79.1196f, 57.0f, 76.8f, 57.0f);
            instancePath2.lineTo(4.2f, 57.0f);
            Path path3 = instancePath2;
            path3.cubicTo(1.880404f, 57.0f, 0.0f, 55.119595f, 0.0f, 52.8f);
            instancePath2.lineTo(0.0f, 4.2f);
            path3.cubicTo(0.0f, 1.880404f, 1.880404f, 0.0f, 4.2f, 0.0f);
            instancePath2.lineTo(76.8f, 0.0f);
            instancePath2.close();
            instancePath2.moveTo(41.73377f, 13.646538f);
            instancePath2.cubicTo(41.009914f, 12.965146f, 39.87074f, 12.999569f, 39.189346f, 13.723424f);
            instancePath2.lineTo(39.189346f, 13.723424f);
            instancePath2.lineTo(25.5f, 28.265858f);
            instancePath2.lineTo(29.25f, 32.24955f);
            instancePath2.lineTo(37.851f, 23.114187f);
            instancePath2.lineTo(37.84835f, 43.84281f);
            instancePath2.lineTo(43.15165f, 43.84281f);
            instancePath2.lineTo(43.152f, 23.111187f);
            instancePath2.lineTo(51.75f, 32.24955f);
            instancePath2.lineTo(55.5f, 28.265858f);
            instancePath2.lineTo(44.25f, 16.314783f);
            instancePath2.lineTo(41.810654f, 13.723424f);
            instancePath2.cubicTo(41.785805f, 13.697027f, 41.760166f, 13.671387f, 41.73377f, 13.646538f);
            instancePath2.close();
            WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
            canvas.drawPath(instancePath2, instancePaint5);
            canvas.restore();
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
