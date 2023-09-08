package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_multiple_choice */
public class icons_filled_multiple_choice extends C24542c {
    private final int height = 72;
    private final int width = 72;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 72;
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
                float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 7.0f, 0.0f, 1.0f, 12.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-1);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(55.334522f, 27.0f);
                instancePath.lineTo(61.698486f, 33.36396f);
                instancePath.lineTo(43.879395f, 51.183052f);
                instancePath.cubicTo(43.566975f, 51.495472f, 43.16828f, 51.669037f, 42.760006f, 51.70375f);
                instancePath.lineTo(42.6066f, 51.71026f);
                instancePath.cubicTo(42.145943f, 51.71026f, 41.68528f, 51.534523f, 41.33381f, 51.183052f);
                instancePath.lineTo(32.0f, 41.849243f);
                instancePath.lineTo(38.36396f, 35.485283f);
                instancePath.lineTo(42.606f, 39.727f);
                instancePath.lineTo(55.334522f, 27.0f);
                instancePath.close();
                instancePath.moveTo(29.0f, 39.0f);
                instancePath.lineTo(29.0f, 48.0f);
                instancePath.lineTo(14.0f, 48.0f);
                instancePath.lineTo(14.0f, 39.0f);
                instancePath.lineTo(29.0f, 39.0f);
                instancePath.close();
                instancePath.moveTo(9.5f, 39.0f);
                instancePath.lineTo(9.5f, 48.0f);
                instancePath.lineTo(0.5f, 48.0f);
                instancePath.lineTo(0.5f, 39.0f);
                instancePath.lineTo(9.5f, 39.0f);
                instancePath.close();
                instancePath.moveTo(47.0f, 19.5f);
                instancePath.lineTo(47.0f, 28.5f);
                instancePath.lineTo(14.0f, 28.5f);
                instancePath.lineTo(14.0f, 19.5f);
                instancePath.lineTo(47.0f, 19.5f);
                instancePath.close();
                instancePath.moveTo(9.5f, 19.5f);
                instancePath.lineTo(9.5f, 28.5f);
                instancePath.lineTo(0.5f, 28.5f);
                instancePath.lineTo(0.5f, 19.5f);
                instancePath.lineTo(9.5f, 19.5f);
                instancePath.close();
                instancePath.moveTo(53.0f, 0.0f);
                instancePath.lineTo(53.0f, 9.0f);
                instancePath.lineTo(14.0f, 9.0f);
                instancePath.lineTo(14.0f, 0.0f);
                instancePath.lineTo(53.0f, 0.0f);
                instancePath.close();
                instancePath.moveTo(9.5f, 0.0f);
                instancePath.lineTo(9.5f, 9.0f);
                instancePath.lineTo(0.5f, 9.0f);
                instancePath.lineTo(0.5f, 0.0f);
                instancePath.lineTo(9.5f, 0.0f);
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
