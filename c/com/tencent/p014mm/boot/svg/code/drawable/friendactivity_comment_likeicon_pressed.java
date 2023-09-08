package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.friendactivity_comment_likeicon_pressed */
public class friendactivity_comment_likeicon_pressed extends C24542c {
    private final int height = 72;
    private final int width = 80;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            return 80;
        }
        if (i2 == 1) {
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
            float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.3333334f, 0.0f, 0.0f, 0.0f, 1.3333334f, 0.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            canvas.save();
            Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-2171170);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(10.02f, 4.03f);
            Path path = instancePath;
            path.cubicTo(16.37f, -0.03f, 25.25f, 2.32f, 30.0f, 7.82f);
            path.cubicTo(34.75f, 2.31f, 43.65f, -0.03f, 50.0f, 4.04f);
            path.cubicTo(56.64f, 8.75f, 57.4f, 18.37f, 54.62f, 25.46f);
            path.cubicTo(49.99f, 36.69f, 40.55f, 45.38f, 30.0f, 51.04f);
            path.cubicTo(19.44f, 45.38f, 10.0f, 36.68f, 5.38f, 25.44f);
            path.cubicTo(2.59f, 18.35f, 3.37f, 8.73f, 10.02f, 4.03f);
            instancePath.moveTo(10.78f, 12.53f);
            Path path2 = instancePath;
            path2.cubicTo(9.05f, 17.39f, 9.87f, 23.01f, 12.63f, 27.35f);
            path2.cubicTo(16.91f, 34.26f, 23.39f, 39.46f, 30.0f, 44.02f);
            path2.cubicTo(35.84f, 40.01f, 41.47f, 35.49f, 45.75f, 29.79f);
            path2.cubicTo(48.53f, 26.15f, 50.43f, 21.67f, 50.08f, 17.01f);
            path2.cubicTo(50.12f, 13.43f, 48.4f, 9.15f, 44.52f, 8.35f);
            path2.cubicTo(38.67f, 6.6f, 34.27f, 11.91f, 30.0f, 14.96f);
            path2.cubicTo(26.8f, 12.47f, 23.72f, 9.6f, 19.86f, 8.15f);
            path2.cubicTo(16.34f, 7.44f, 12.05f, 8.89f, 10.78f, 12.53f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
