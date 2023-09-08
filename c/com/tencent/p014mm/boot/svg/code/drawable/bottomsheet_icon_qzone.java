package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.bottomsheet_icon_qzone */
public class bottomsheet_icon_qzone extends C24542c {
    private final int height = 96;
    private final int width = 96;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 96;
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
                float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 7.0f, 0.0f, 1.0f, 10.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-13032);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(80.04755f, 28.325209f);
                instancePath.lineTo(56.156776f, 25.964645f);
                instancePath.cubicTo(54.329502f, 25.794123f, 53.919743f, 25.509708f, 53.34809f, 24.029768f);
                instancePath.lineTo(43.131153f, 1.436689f);
                instancePath.cubicTo(42.196808f, -0.47889635f, 40.668846f, -0.47889635f, 39.735756f, 1.436689f);
                instancePath.lineTo(28.844881f, 24.029768f);
                instancePath.cubicTo(28.10255f, 25.28193f, 27.759935f, 25.565722f, 25.960896f, 25.736866f);
                instancePath.lineTo(2.8181033f, 28.325209f);
                instancePath.cubicTo(0.69213665f, 28.536808f, 0.21711986f, 29.913439f, 1.76265f, 31.384047f);
                instancePath.lineTo(19.921844f, 48.020016f);
                instancePath.cubicTo(20.777754f, 48.817863f, 20.79156f, 49.157665f, 20.549345f, 50.254242f);
                instancePath.lineTo(15.893301f, 74.66893f);
                instancePath.cubicTo(15.499859f, 76.76437f, 16.692736f, 77.6033f, 18.542603f, 76.53722f);
                instancePath.lineTo(39.269524f, 64.60993f);
                instancePath.cubicTo(40.725323f, 63.699436f, 42.067543f, 63.672676f, 43.495102f, 64.55392f);
                instancePath.lineTo(64.322426f, 76.53722f);
                instancePath.cubicTo(66.173546f, 77.6033f, 67.37081f, 76.76189f, 66.98364f, 74.66831f);
                instancePath.lineTo(63.421963f, 55.188213f);
                instancePath.cubicTo(65.55483f, 54.46878f, 67.621185f, 53.588158f, 68.85673f, 52.591778f);
                instancePath.lineTo(68.35536f, 52.689487f);
                Path path = instancePath;
                path.cubicTo(66.16225f, 53.104595f, 64.444786f, 53.42386f, 63.106956f, 53.669064f);
                path.cubicTo(63.014088f, 52.996304f, 63.002163f, 52.988216f, 63.002163f, 52.988216f);
                instancePath.lineTo(62.52464f, 50.28785f);
                instancePath.cubicTo(62.335133f, 49.07365f, 62.52464f, 48.654808f, 63.44016f, 47.781654f);
                instancePath.lineTo(81.07351f, 31.351685f);
                instancePath.cubicTo(82.63599f, 29.90037f, 82.174774f, 28.536808f, 80.04755f, 28.325209f);
                instancePath.lineTo(80.04755f, 28.325209f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
                instancePaint4.setColor(-1);
                Path instancePath2 = C24542c.instancePath(looper);
                instancePath2.moveTo(15.39444f, 33.37369f);
                Path path2 = instancePath2;
                path2.cubicTo(15.39444f, 33.37369f, 37.508133f, 28.2163f, 62.77564f, 32.517963f);
                path2.cubicTo(62.856586f, 32.531654f, 62.796974f, 32.706535f, 62.877293f, 32.72147f);
                path2.cubicTo(62.877293f, 32.72147f, 55.036694f, 38.18817f, 47.961014f, 43.054306f);
                path2.cubicTo(42.398235f, 46.880497f, 37.30796f, 50.276646f, 36.87248f, 50.75025f);
                path2.cubicTo(36.87248f, 50.75025f, 36.560608f, 50.806263f, 36.962208f, 51.00666f);
                path2.cubicTo(37.262154f, 51.156025f, 37.981266f, 51.21577f, 37.981266f, 51.21577f);
                path2.cubicTo(37.981266f, 51.21577f, 56.060143f, 53.18239f, 68.62267f, 52.667084f);
                path2.cubicTo(68.62267f, 52.667084f, 50.095764f, 58.072792f, 22.619463f, 54.425217f);
                path2.cubicTo(22.619463f, 54.425217f, 22.295673f, 54.306347f, 22.56236f, 54.132713f);
                path2.cubicTo(24.73037f, 52.718117f, 43.409134f, 39.430378f, 48.48435f, 35.899178f);
                path2.cubicTo(48.48435f, 35.899178f, 48.836372f, 35.622856f, 48.522625f, 35.565598f);
                path2.cubicTo(48.772995f, 35.611652f, 45.382618f, 34.984947f, 40.362f, 34.538727f);
                path2.cubicTo(33.066067f, 33.89086f, 22.360306f, 33.546703f, 15.55759f, 33.412277f);
                path2.cubicTo(15.4885645f, 33.409786f, 15.460955f, 33.37307f, 15.39444f, 33.37369f);
                instancePath2.lineTo(15.39444f, 33.37369f);
                instancePath2.close();
                WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint4);
                canvas.restore();
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i3;
    }
}
