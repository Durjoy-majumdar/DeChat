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

/* renamed from: com.tencent.mm.boot.svg.code.drawable.actionbar_loud_icon */
public class actionbar_loud_icon extends C24542c {
    private final int height = 96;
    private final int width = 96;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 96;
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
        instancePaint3.setColor(-3355444);
        Paint paint = instancePaint3;
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 13.0f, 0.0f, 1.0f, 19.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.saveLayerAlpha((RectF) null, 204, 31);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(paint, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(15.987003f, 13.975044f);
        instancePath.cubicTo(22.005089f, 9.323351f, 28.003181f, 4.6516933f, 34.021267f, 0.0f);
        instancePath.lineTo(38.0f, 0.0f);
        instancePath.lineTo(38.0f, 56.0f);
        Path path = instancePath;
        path.cubicTo(36.340527f, 55.740463f, 34.401146f, 56.13975f, 33.03158f, 54.961853f);
        path.cubicTo(27.323397f, 50.619606f, 21.645203f, 46.247414f, 15.937019f, 41.91515f);
        path.cubicTo(11.648384f, 41.835293f, 7.339755f, 42.134758f, 3.0611162f, 41.78538f);
        path.cubicTo(1.2217014f, 41.605705f, 0.93179363f, 39.499466f, 1.0117682f, 38.032085f);
        path.cubicTo(1.0017713f, 31.314081f, 1.0017713f, 24.596079f, 1.0117682f, 17.878075f);
        path.cubicTo(0.94179046f, 16.440641f, 1.2117046f, 14.274509f, 3.0511193f, 14.144741f);
        path.cubicTo(7.3497515f, 13.735473f, 11.678374f, 14.074866f, 15.987003f, 13.975044f);
        instancePath.lineTo(15.987003f, 13.975044f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(paint, looper);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(53.339943f, 7.6842885f);
        Path path2 = instancePath2;
        path2.cubicTo(50.13705f, 5.6012874f, 53.26988f, 0.3937841f, 56.58287f, 2.4867043f);
        path2.cubicTo(68.53366f, 9.856561f, 73.35802f, 26.480894f, 67.53276f, 39.147526f);
        path2.cubicTo(65.27071f, 44.42446f, 61.207047f, 48.66982f, 56.58287f, 51.9927f);
        path2.cubicTo(53.500084f, 52.151405f, 50.997826f, 49.701397f, 52.39909f, 46.68601f);
        path2.cubicTo(60.506413f, 42.37122f, 65.41084f, 32.83901f, 63.689285f, 23.80275f);
        path2.cubicTo(62.758446f, 17.20658f, 58.504604f, 11.681667f, 53.339943f, 7.6842885f);
        instancePath2.lineTo(53.339943f, 7.6842885f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.save();
        Paint instancePaint6 = C24542c.instancePaint(paint, looper);
        Path instancePath3 = C24542c.instancePath(looper);
        instancePath3.moveTo(45.38676f, 13.448668f);
        Path path3 = instancePath3;
        path3.cubicTo(48.04146f, 11.830107f, 49.88165f, 14.987299f, 51.44028f, 16.635832f);
        path3.cubicTo(55.512833f, 20.991959f, 57.161964f, 27.55612f, 55.13072f, 33.21109f);
        path3.cubicTo(53.984367f, 36.618057f, 51.44028f, 39.365616f, 48.57441f, 41.46375f);
        path3.cubicTo(47.025837f, 42.682663f, 44.481747f, 41.693542f, 44.05941f, 39.805225f);
        path3.cubicTo(43.808018f, 38.60629f, 44.421413f, 37.467304f, 44.652695f, 36.318325f);
        path3.cubicTo(46.301826f, 35.149364f, 48.16213f, 34.02037f, 49.036972f, 32.11207f);
        path3.cubicTo(51.239166f, 27.815887f, 49.348698f, 22.320776f, 45.47726f, 19.643158f);
        path3.cubicTo(44.300747f, 17.834766f, 42.94323f, 14.857414f, 45.38676f, 13.448668f);
        instancePath3.lineTo(45.38676f, 13.448668f);
        instancePath3.close();
        WeChatSVGRenderC2Java.setFillType(instancePath3, 2);
        canvas.drawPath(instancePath3, instancePaint6);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
