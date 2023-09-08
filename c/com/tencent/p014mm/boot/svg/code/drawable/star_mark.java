package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.star_mark */
public class star_mark extends C24542c {
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
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-16384);
                canvas.save();
                float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 3.0f, 0.0f, 1.0f, 3.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(26.87f, 0.42f);
                Path path = instancePath;
                path.cubicTo(28.24f, 1.13f, 33.563488f, 13.02894f, 35.87f, 18.42f);
                path.cubicTo(41.73349f, 18.56894f, 48.16f, 18.15f, 53.87f, 19.42f);
                path.cubicTo(50.37f, 25.09f, 45.03f, 29.01f, 40.87f, 33.42f);
                path.cubicTo(42.32f, 40.56f, 44.71f, 47.31f, 45.87f, 54.42f);
                path.cubicTo(43.24f, 54.42f, 31.38f, 45.55f, 27.87f, 42.42f);
                path.cubicTo(23.65f, 45.43f, 12.0f, 54.43f, 8.87f, 54.42f);
                path.cubicTo(10.3f, 47.31f, 12.76f, 40.59f, 14.87f, 33.42f);
                path.cubicTo(9.97f, 29.01f, 4.64f, 25.09f, 0.87f, 19.42f);
                path.cubicTo(6.83f, 18.15f, 13.348559f, 18.55894f, 18.87f, 18.42f);
                path.cubicTo(22.098558f, 12.01894f, 23.88f, 6.36f, 26.87f, 0.42f);
                instancePath.lineTo(26.87f, 0.42f);
                instancePath.lineTo(26.87f, 0.42f);
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
