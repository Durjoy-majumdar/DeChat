package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icon_outlined_search_arrow_down */
public class icon_outlined_search_arrow_down extends C24542c {
    private final int height = 12;
    private final int width = 24;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            return 24;
        }
        if (i2 == 1) {
            return 12;
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
            float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, -1.8369701E-16f, -1.0f, 24.0f, 1.0f, -1.8369701E-16f, 1.1021821E-15f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            canvas.save();
            float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 2.0f, 0.0f, 1.0f, 5.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray2);
            canvas.concat(instanceMatrix);
            canvas.save();
            Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(1275068416);
            float[] matrixFloatArray3 = C24542c.setMatrixFloatArray(matrixFloatArray2, -1.0f, 1.2246469E-16f, 8.041568f, -1.2246469E-16f, -1.0f, 14.01054f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray3);
            canvas.concat(instanceMatrix);
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(7.5875087f, 12.429892f);
            instancePath.lineTo(6.526849f, 13.490552f);
            instancePath.lineTo(0.7479515f, 7.7116547f);
            instancePath.cubicTo(0.35782623f, 7.3215294f, 0.3543658f, 6.692472f, 0.7479515f, 6.298886f);
            instancePath.lineTo(6.526849f, 0.519989f);
            instancePath.lineTo(7.5875087f, 1.5806491f);
            instancePath.lineTo(2.1628876f, 7.0052705f);
            instancePath.lineTo(7.5875087f, 12.429892f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 2);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            canvas.restore();
            canvas.restore();
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
