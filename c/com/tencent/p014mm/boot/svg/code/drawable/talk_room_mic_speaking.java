package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.talk_room_mic_speaking */
public class talk_room_mic_speaking extends C24542c {
    private final int height = 80;
    private final int width = 80;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 80;
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
            instancePaint3.setColor(-6626030);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(36.83f, 10.18f);
            Path path = instancePath;
            path.cubicTo(38.71f, 8.29f, 40.59f, 6.41f, 42.48f, 4.54f);
            path.cubicTo(53.62f, 15.45f, 56.31f, 33.8f, 48.53f, 47.35f);
            path.cubicTo(46.75f, 50.69f, 44.3f, 53.6f, 41.66f, 56.28f);
            path.cubicTo(39.84f, 54.34f, 38.0f, 52.42f, 36.19f, 50.48f);
            path.cubicTo(41.15f, 45.64f, 44.46f, 39.07f, 44.9f, 32.11f);
            path.cubicTo(45.62f, 24.06f, 42.44f, 15.94f, 36.83f, 10.18f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
            instancePaint4.setColor(-6626030);
            Path instancePath2 = C24542c.instancePath(looper);
            instancePath2.moveTo(29.09f, 17.92f);
            Path path2 = instancePath2;
            path2.cubicTo(30.73f, 16.27f, 32.37f, 14.63f, 34.02f, 12.99f);
            path2.cubicTo(39.1f, 18.26f, 41.84f, 25.78f, 40.78f, 33.09f);
            path2.cubicTo(40.19f, 38.61f, 37.33f, 43.62f, 33.49f, 47.54f);
            path2.cubicTo(31.88f, 45.86f, 30.27f, 44.18f, 28.68f, 42.48f);
            path2.cubicTo(35.5f, 36.1f, 35.71f, 24.52f, 29.09f, 17.92f);
            instancePath2.close();
            WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
            canvas.drawPath(instancePath2, instancePaint4);
            canvas.restore();
            canvas.save();
            Paint instancePaint5 = C24542c.instancePaint(instancePaint, looper);
            instancePaint5.setColor(-6626030);
            Path instancePath3 = C24542c.instancePath(looper);
            instancePath3.moveTo(13.42f, 19.61f);
            Path path3 = instancePath3;
            path3.cubicTo(19.82f, 17.14f, 27.45f, 22.12f, 27.94f, 28.9f);
            path3.cubicTo(28.83f, 35.53f, 22.57f, 41.8f, 15.94f, 40.95f);
            path3.cubicTo(9.72f, 40.5f, 4.88f, 34.08f, 6.19f, 27.96f);
            path3.cubicTo(6.92f, 24.17f, 9.75f, 20.85f, 13.42f, 19.61f);
            instancePath3.close();
            WeChatSVGRenderC2Java.setFillType(instancePath3, 1);
            canvas.drawPath(instancePath3, instancePaint5);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
