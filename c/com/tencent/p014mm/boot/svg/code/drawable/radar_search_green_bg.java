package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.radar_search_green_bg */
public class radar_search_green_bg extends C24542c {
    private final int height = 74;
    private final int width = 165;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            return 165;
        }
        if (i2 == 1) {
            return 74;
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
            instancePaint3.setColor(-7683054);
            float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 12.0f, 0.0f, 1.0f, 4.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(87.71f, 1.02f);
            Path path = instancePath;
            path.cubicTo(97.18f, 0.98f, 106.65f, 1.01f, 116.11f, 1.0f);
            path.cubicTo(122.86f, 0.94f, 129.37f, 4.23f, 133.81f, 9.23f);
            path.cubicTo(138.87f, 14.77f, 141.51f, 22.18f, 142.0f, 29.61f);
            instancePath.lineTo(142.0f, 36.95f);
            Path path2 = instancePath;
            path2.cubicTo(141.63f, 45.0f, 138.59f, 53.09f, 132.81f, 58.82f);
            path2.cubicTo(128.22f, 63.52f, 121.67f, 66.29f, 115.07f, 66.0f);
            path2.cubicTo(76.95f, 65.86f, 38.82f, 66.27f, 0.7f, 65.79f);
            path2.cubicTo(14.4f, 65.13f, 27.91f, 61.47f, 40.08f, 55.19f);
            path2.cubicTo(62.05f, 44.0f, 79.39f, 24.21f, 87.71f, 1.02f);
            instancePath.lineTo(87.71f, 1.02f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 2);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
