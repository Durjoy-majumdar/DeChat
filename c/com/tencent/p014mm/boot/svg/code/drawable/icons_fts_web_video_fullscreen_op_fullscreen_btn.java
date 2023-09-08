package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_fts_web_video_fullscreen_op_fullscreen_btn */
public class icons_fts_web_video_fullscreen_op_fullscreen_btn extends C24542c {
    private final int height = 75;
    private final int width = 72;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            return 72;
        }
        if (i2 == 1) {
            return 75;
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
            instancePaint3.setColor(-1);
            float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -482.0f, 0.0f, 1.0f, -537.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            canvas.save();
            float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 482.0f, 0.0f, 1.0f, 537.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray2);
            canvas.concat(instanceMatrix);
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(29.0f, 26.032377f);
            instancePath.lineTo(4.2026215f, 1.2349988f);
            Path path = instancePath;
            path.cubicTo(3.2408514f, 0.2732287f, 1.6913689f, 0.2762538f, 0.7338114f, 1.2338114f);
            path.cubicTo(-0.23042212f, 2.1980448f, -0.22321457f, 3.7444081f, 0.7349988f, 4.7026215f);
            instancePath.lineTo(25.532377f, 29.5f);
            instancePath.lineTo(5.754876f, 29.5f);
            Path path2 = instancePath;
            path2.cubicTo(4.4981537f, 29.5f, 3.5f, 30.507359f, 3.5f, 31.75f);
            path2.cubicTo(3.5f, 33.001305f, 4.5095425f, 34.0f, 5.754876f, 34.0f);
            instancePath.lineTo(31.245125f, 34.0f);
            Path path3 = instancePath;
            path3.cubicTo(31.245937f, 34.0f, 31.24675f, 34.0f, 31.247562f, 34.0f);
            path3.cubicTo(31.248375f, 34.0f, 31.249187f, 34.0f, 31.25f, 34.0f);
            path3.cubicTo(31.874836f, 34.0f, 32.436684f, 33.748272f, 32.842648f, 33.34116f);
            path3.cubicTo(33.251106f, 32.932365f, 33.5f, 32.370518f, 33.5f, 31.75f);
            path3.cubicTo(33.5f, 31.749187f, 33.5f, 31.748375f, 33.5f, 31.747562f);
            path3.cubicTo(33.5f, 31.74675f, 33.5f, 31.745937f, 33.5f, 31.745125f);
            instancePath.lineTo(33.5f, 6.254876f);
            Path path4 = instancePath;
            path4.cubicTo(33.5f, 4.9981537f, 32.49264f, 4.0f, 31.25f, 4.0f);
            path4.cubicTo(29.998695f, 4.0f, 29.0f, 5.0095425f, 29.0f, 6.254876f);
            instancePath.lineTo(29.0f, 26.032377f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 2);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            canvas.save();
            Paint instancePaint5 = C24542c.instancePaint(instancePaint3, looper);
            Path instancePath2 = C24542c.instancePath(looper);
            instancePath2.moveTo(44.0f, 49.468422f);
            instancePath2.lineTo(67.828835f, 73.29726f);
            Path path5 = instancePath2;
            path5.cubicTo(68.79079f, 74.25921f, 70.34059f, 74.25615f, 71.29837f, 73.29837f);
            path5.cubicTo(72.262825f, 72.333916f, 72.25565f, 70.787224f, 71.29726f, 69.828835f);
            instancePath2.lineTo(47.468422f, 46.0f);
            instancePath2.lineTo(67.245125f, 46.0f);
            Path path6 = instancePath2;
            path6.cubicTo(68.50185f, 46.0f, 69.5f, 44.99264f, 69.5f, 43.75f);
            path6.cubicTo(69.5f, 42.498695f, 68.490456f, 41.5f, 67.245125f, 41.5f);
            instancePath2.lineTo(41.754875f, 41.5f);
            Path path7 = instancePath2;
            path7.cubicTo(41.754063f, 41.5f, 41.75325f, 41.5f, 41.752438f, 41.5f);
            path7.cubicTo(41.751625f, 41.5f, 41.750813f, 41.5f, 41.75f, 41.5f);
            path7.cubicTo(41.129482f, 41.5f, 40.567635f, 41.748894f, 40.16059f, 42.15459f);
            path7.cubicTo(39.748894f, 42.567635f, 39.5f, 43.129482f, 39.5f, 43.75f);
            path7.cubicTo(39.5f, 43.750813f, 39.5f, 43.751625f, 39.5f, 43.752438f);
            path7.cubicTo(39.5f, 43.75325f, 39.5f, 43.754063f, 39.5f, 43.754875f);
            instancePath2.lineTo(39.5f, 69.245125f);
            Path path8 = instancePath2;
            path8.cubicTo(39.5f, 70.490456f, 40.498695f, 71.5f, 41.75f, 71.5f);
            path8.cubicTo(42.99264f, 71.5f, 44.0f, 70.50185f, 44.0f, 69.245125f);
            instancePath2.lineTo(44.0f, 49.468422f);
            instancePath2.close();
            WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
            canvas.drawPath(instancePath2, instancePaint5);
            canvas.restore();
            canvas.restore();
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
