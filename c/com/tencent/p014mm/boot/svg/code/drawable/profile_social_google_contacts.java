package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.profile_social_google_contacts */
public class profile_social_google_contacts extends C24542c {
    private final int height = 76;
    private final int width = 76;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 76;
        }
        if (i2 != 2) {
            return 0;
        }
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
        instancePaint3.setColor(-789517);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(0.0f, 4.0f);
        Path path = instancePath;
        path.cubicTo(0.0f, 1.7908609f, 1.7908609f, 0.0f, 4.0f, 0.0f);
        instancePath.lineTo(72.0f, 0.0f);
        path.cubicTo(74.20914f, 0.0f, 76.0f, 1.7908609f, 76.0f, 4.0f);
        instancePath.lineTo(76.0f, 72.0f);
        path.cubicTo(76.0f, 74.20914f, 74.20914f, 76.0f, 72.0f, 76.0f);
        instancePath.lineTo(4.0f, 76.0f);
        path.cubicTo(1.7908609f, 76.0f, 0.0f, 74.20914f, 0.0f, 72.0f);
        instancePath.lineTo(0.0f, 4.0f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-5658199);
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 12.0f, 0.0f, 1.0f, 16.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint4, looper);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(3.48f, 15.58f);
        Path path2 = instancePath2;
        path2.cubicTo(0.27f, 9.35f, 5.54f, 1.93f, 12.02f, 1.02f);
        path2.cubicTo(19.31f, 0.03f, 26.72f, 0.53f, 34.05f, 0.82f);
        path2.cubicTo(31.62f, 2.59f, 28.84f, 3.78f, 26.06f, 4.88f);
        path2.cubicTo(27.11f, 7.45f, 28.81f, 10.09f, 28.19f, 12.99f);
        path2.cubicTo(27.4f, 16.84f, 23.67f, 19.21f, 22.68f, 22.96f);
        path2.cubicTo(24.4f, 28.11f, 31.25f, 30.9f, 30.73f, 37.03f);
        path2.cubicTo(30.28f, 45.11f, 21.25f, 49.65f, 13.94f, 49.09f);
        path2.cubicTo(7.06f, 49.13f, -1.04f, 43.72f, 0.23f, 36.06f);
        path2.cubicTo(1.82f, 28.82f, 9.89f, 26.16f, 16.44f, 25.72f);
        path2.cubicTo(16.46f, 24.71f, 16.49f, 23.69f, 16.52f, 22.68f);
        path2.cubicTo(11.51f, 22.11f, 5.72f, 20.65f, 3.48f, 15.58f);
        instancePath2.lineTo(3.48f, 15.58f);
        instancePath2.close();
        instancePath2.moveTo(13.2f, 4.24f);
        path2.cubicTo(8.59f, 5.84f, 8.82f, 12.22f, 11.58f, 15.43f);
        path2.cubicTo(13.94f, 18.89f, 19.98f, 20.67f, 22.69f, 16.69f);
        path2.cubicTo(26.26f, 10.87f, 19.77f, 2.34f, 13.2f, 4.24f);
        instancePath2.lineTo(13.2f, 4.24f);
        instancePath2.close();
        instancePath2.moveTo(13.31f, 30.24f);
        path2.cubicTo(10.57f, 31.12f, 7.7f, 32.69f, 6.5f, 35.46f);
        path2.cubicTo(5.37f, 38.41f, 7.39f, 41.77f, 10.27f, 42.73f);
        path2.cubicTo(14.73f, 44.28f, 19.99f, 43.53f, 23.85f, 40.82f);
        path2.cubicTo(25.12f, 39.87f, 26.66f, 38.07f, 25.41f, 36.51f);
        path2.cubicTo(22.73f, 32.79f, 18.37f, 28.18f, 13.31f, 30.24f);
        instancePath2.lineTo(13.31f, 30.24f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.save();
        Paint instancePaint6 = C24542c.instancePaint(instancePaint4, looper);
        Path instancePath3 = C24542c.instancePath(looper);
        instancePath3.moveTo(40.61f, 12.53f);
        instancePath3.lineTo(45.05f, 12.53f);
        Path path3 = instancePath3;
        path3.cubicTo(45.05f, 15.02f, 45.05f, 17.5f, 45.06f, 19.99f);
        path3.cubicTo(47.58f, 20.0f, 50.09f, 20.01f, 52.61f, 20.02f);
        path3.cubicTo(52.6f, 21.52f, 52.59f, 23.02f, 52.58f, 24.52f);
        path3.cubicTo(50.08f, 24.52f, 47.57f, 24.53f, 45.06f, 24.54f);
        path3.cubicTo(45.05f, 27.02f, 45.05f, 29.51f, 45.05f, 31.99f);
        path3.cubicTo(43.57f, 32.0f, 42.08f, 32.0f, 40.6f, 32.0f);
        path3.cubicTo(40.6f, 29.51f, 40.59f, 27.03f, 40.58f, 24.54f);
        path3.cubicTo(38.07f, 24.53f, 35.56f, 24.52f, 33.05f, 24.52f);
        instancePath3.lineTo(33.05f, 20.01f);
        Path path4 = instancePath3;
        path4.cubicTo(35.56f, 20.0f, 38.08f, 19.99f, 40.59f, 19.99f);
        path4.cubicTo(40.6f, 17.5f, 40.6f, 15.02f, 40.61f, 12.53f);
        instancePath3.lineTo(40.61f, 12.53f);
        instancePath3.close();
        WeChatSVGRenderC2Java.setFillType(instancePath3, 2);
        canvas.drawPath(instancePath3, instancePaint6);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
