package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.badge_count_more */
public class badge_count_more extends C24542c {
    private final int height = 56;
    private final int width = 89;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            return 89;
        }
        if (i2 == 1) {
            return 56;
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
            float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            canvas.save();
            Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-372399);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(0.0f, 27.0f);
            instancePath.cubicTo(0.0f, 12.088312f, 12.096977f, 0.0f, 26.990974f, 0.0f);
            instancePath.lineTo(60.009026f, 0.0f);
            instancePath.cubicTo(74.915726f, 0.0f, 87.0f, 12.085033f, 87.0f, 27.0f);
            instancePath.lineTo(87.0f, 27.0f);
            instancePath.cubicTo(87.0f, 41.91169f, 74.90302f, 54.0f, 60.009026f, 54.0f);
            instancePath.lineTo(26.990974f, 54.0f);
            instancePath.cubicTo(12.084271f, 54.0f, 0.0f, 41.914967f, 0.0f, 27.0f);
            instancePath.lineTo(0.0f, 27.0f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 2);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
            instancePaint4.setColor(-1);
            Path instancePath2 = C24542c.instancePath(looper);
            instancePath2.moveTo(30.3f, 24.0f);
            Path path = instancePath2;
            path.cubicTo(31.2f, 24.0f, 31.98f, 24.3f, 32.64f, 24.96f);
            path.cubicTo(33.27f, 25.59f, 33.6f, 26.37f, 33.6f, 27.27f);
            path.cubicTo(33.6f, 28.17f, 33.27f, 28.92f, 32.64f, 29.58f);
            path.cubicTo(31.98f, 30.24f, 31.2f, 30.57f, 30.3f, 30.57f);
            path.cubicTo(29.4f, 30.57f, 28.62f, 30.24f, 27.96f, 29.58f);
            path.cubicTo(27.3f, 28.92f, 27.0f, 28.17f, 27.0f, 27.27f);
            path.cubicTo(27.0f, 26.37f, 27.3f, 25.59f, 27.96f, 24.96f);
            path.cubicTo(28.59f, 24.3f, 29.37f, 24.0f, 30.3f, 24.0f);
            instancePath2.close();
            instancePath2.moveTo(42.9f, 24.0f);
            Path path2 = instancePath2;
            path2.cubicTo(43.8f, 24.0f, 44.58f, 24.3f, 45.24f, 24.96f);
            path2.cubicTo(45.87f, 25.59f, 46.2f, 26.37f, 46.2f, 27.27f);
            path2.cubicTo(46.2f, 28.17f, 45.87f, 28.92f, 45.24f, 29.58f);
            path2.cubicTo(44.58f, 30.24f, 43.8f, 30.57f, 42.9f, 30.57f);
            path2.cubicTo(42.0f, 30.57f, 41.22f, 30.24f, 40.56f, 29.58f);
            path2.cubicTo(39.9f, 28.92f, 39.6f, 28.17f, 39.6f, 27.27f);
            path2.cubicTo(39.6f, 26.37f, 39.9f, 25.59f, 40.56f, 24.96f);
            path2.cubicTo(41.19f, 24.3f, 41.97f, 24.0f, 42.9f, 24.0f);
            instancePath2.close();
            instancePath2.moveTo(55.5f, 24.0f);
            Path path3 = instancePath2;
            path3.cubicTo(56.4f, 24.0f, 57.18f, 24.3f, 57.84f, 24.96f);
            path3.cubicTo(58.47f, 25.59f, 58.8f, 26.37f, 58.8f, 27.27f);
            path3.cubicTo(58.8f, 28.17f, 58.47f, 28.92f, 57.84f, 29.58f);
            path3.cubicTo(57.18f, 30.24f, 56.4f, 30.57f, 55.5f, 30.57f);
            path3.cubicTo(54.6f, 30.57f, 53.82f, 30.24f, 53.16f, 29.58f);
            path3.cubicTo(52.5f, 28.92f, 52.2f, 28.17f, 52.2f, 27.27f);
            path3.cubicTo(52.2f, 26.37f, 52.5f, 25.59f, 53.16f, 24.96f);
            path3.cubicTo(53.79f, 24.3f, 54.57f, 24.0f, 55.5f, 24.0f);
            instancePath2.close();
            WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
            canvas.drawPath(instancePath2, instancePaint4);
            canvas.restore();
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
