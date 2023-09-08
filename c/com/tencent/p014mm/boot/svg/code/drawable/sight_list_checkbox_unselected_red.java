package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.sight_list_checkbox_unselected_red */
public class sight_list_checkbox_unselected_red extends C24542c {
    private final int height = 90;
    private final int width = 90;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 90;
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
                instancePaint3.setColor(-27648);
                float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 11.0f, 0.0f, 1.0f, 11.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(26.4f, 1.66f);
                Path path = instancePath;
                path.cubicTo(42.28f, -1.94f, 59.61f, 8.21f, 64.37f, 23.75f);
                path.cubicTo(69.73f, 39.03f, 61.77f, 57.35f, 46.96f, 63.88f);
                path.cubicTo(32.58f, 71.02f, 13.62f, 65.47f, 5.24f, 51.82f);
                path.cubicTo(-2.86f, 39.68f, -1.34f, 22.27f, 8.7f, 11.7f);
                path.cubicTo(13.34f, 6.59f, 19.66f, 3.07f, 26.4f, 1.66f);
                instancePath.lineTo(26.4f, 1.66f);
                instancePath.close();
                instancePath.moveTo(26.42f, 4.73f);
                path.cubicTo(22.56f, 5.59f, 18.89f, 7.26f, 15.66f, 9.55f);
                path.cubicTo(3.91f, 17.54f, -0.47f, 34.34f, 5.99f, 47.02f);
                path.cubicTo(12.27f, 60.81f, 29.81f, 67.79f, 43.84f, 61.97f);
                path.cubicTo(58.14f, 56.76f, 66.51f, 39.71f, 61.68f, 25.23f);
                path.cubicTo(57.54f, 10.62f, 41.2f, 1.03f, 26.42f, 4.73f);
                instancePath.lineTo(26.42f, 4.73f);
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
