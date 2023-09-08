package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.chatting_status_tick */
public class chatting_status_tick extends C24542c {
    private final int height = 50;
    private final int width = 50;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 50;
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
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-8618884);
        canvas.saveLayerAlpha((RectF) null, 153, 31);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(23.26f, 0.0f);
        instancePath.lineTo(26.42f, 0.0f);
        instancePath.cubicTo(38.63f, 0.57f, 49.24f, 11.0f, 50.0f, 23.21f);
        instancePath.lineTo(50.0f, 26.5f);
        instancePath.cubicTo(49.44f, 38.71f, 38.94f, 49.21f, 26.78f, 50.0f);
        instancePath.lineTo(23.52f, 50.0f);
        Path path = instancePath;
        path.cubicTo(11.33f, 49.41f, 0.78f, 38.99f, 0.0f, 26.81f);
        instancePath.lineTo(0.0f, 23.43f);
        path.cubicTo(0.62f, 11.24f, 11.09f, 0.77f, 23.26f, 0.0f);
        instancePath.lineTo(23.26f, 0.0f);
        instancePath.close();
        instancePath.moveTo(35.370926f, 15.0f);
        path.cubicTo(30.458647f, 20.306633f, 25.646616f, 25.703379f, 20.70426f, 30.989988f);
        path.cubicTo(18.659147f, 28.787233f, 16.654135f, 26.554443f, 14.609022f, 24.341677f);
        path.cubicTo(13.39599f, 25.673342f, 12.192983f, 27.005007f, 11.0f, 28.346684f);
        path.cubicTo(14.197995f, 31.931164f, 17.47619f, 35.435543f, 20.70426f, 39.0f);
        path.cubicTo(26.8396f, 32.371716f, 32.914787f, 25.683353f, 39.0f, 19.005007f);
        path.cubicTo(37.80702f, 17.653316f, 36.60401f, 16.321651f, 35.370926f, 15.0f);
        instancePath.lineTo(35.370926f, 15.0f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-394759);
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 11.0f, 0.0f, 1.0f, 15.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint6 = C24542c.instancePaint(instancePaint5, looper);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(24.370928f, -1.7763568E-15f);
        Path path2 = instancePath2;
        path2.cubicTo(25.60401f, 1.321652f, 26.807018f, 2.6533167f, 28.0f, 4.0050063f);
        path2.cubicTo(21.914787f, 10.683354f, 15.839599f, 17.371716f, 9.704261f, 24.0f);
        path2.cubicTo(6.4761906f, 20.435545f, 3.197995f, 16.931164f, 0.0f, 13.3466835f);
        path2.cubicTo(1.1929824f, 12.005006f, 2.39599f, 10.673342f, 3.6090226f, 9.341677f);
        path2.cubicTo(5.654135f, 11.554443f, 7.6591477f, 13.787234f, 9.704261f, 15.989987f);
        path2.cubicTo(14.646617f, 10.70338f, 19.458647f, 5.3066335f, 24.370928f, -1.7763568E-15f);
        instancePath2.lineTo(24.370928f, -1.7763568E-15f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint6);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
