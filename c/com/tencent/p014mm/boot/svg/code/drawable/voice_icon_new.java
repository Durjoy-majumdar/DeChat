package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.voice_icon_new */
public class voice_icon_new extends C24542c {
    private final int height = 64;
    private final int width = 64;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 64;
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
        Paint instancePaint3 = C24542c.instancePaint(instancePaint2, looper);
        instancePaint3.setStrokeWidth(1.0f);
        canvas.save();
        Paint paint = instancePaint3;
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -175.0f, 0.0f, 1.0f, -135.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 175.0f, 0.0f, 1.0f, 135.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(0.0f, 0.0f);
        instancePath.lineTo(64.0f, 0.0f);
        instancePath.lineTo(64.0f, 64.0f);
        instancePath.lineTo(0.0f, 64.0f);
        instancePath.lineTo(0.0f, 0.0f);
        instancePath.close();
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(paint, looper);
        instancePaint4.setColor(-16268960);
        instancePaint4.setStrokeWidth(1.8f);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(26.700413f, 3.093279f);
        Path path = instancePath2;
        path.cubicTo(28.064548f, 4.255864f, 28.746616f, 5.761179f, 28.746616f, 7.609224f);
        path.cubicTo(28.746616f, 9.457269f, 28.872177f, 12.242247f, 29.123295f, 15.964156f);
        path.cubicTo(29.465658f, 19.42503f, 30.267292f, 21.823332f, 31.528196f, 23.159063f);
        path.cubicTo(33.41955f, 25.162659f, 37.74745f, 27.630077f, 36.95324f, 29.369883f);
        path.cubicTo(36.159027f, 31.109686f, 35.577835f, 31.529346f, 34.16275f, 31.529346f);
        path.cubicTo(32.74767f, 31.529346f, 32.21389f, 31.529346f, 31.5f, 31.529346f);
        path.cubicTo(30.78611f, 31.529346f, 30.393202f, 33.559628f, 31.058168f, 34.209072f);
        path.cubicTo(31.723135f, 34.85852f, 32.794903f, 35.911564f, 32.794903f, 36.54873f);
        path.cubicTo(32.794903f, 37.185894f, 30.783512f, 39.04614f, 29.606718f, 39.480206f);
        path.cubicTo(28.82219f, 39.76958f, 28.82219f, 40.02983f, 29.606718f, 40.260956f);
        path.cubicTo(30.73126f, 40.59107f, 31.293531f, 41.09683f, 31.293531f, 41.778236f);
        path.cubicTo(31.293531f, 42.800343f, 29.123295f, 43.23497f, 29.123295f, 43.632874f);
        path.cubicTo(29.123295f, 44.03078f, 30.46682f, 46.61914f, 29.606718f, 48.448452f);
        path.cubicTo(28.746616f, 50.27776f, 28.264374f, 51.93774f, 24.89458f, 52.441f);
        path.cubicTo(21.524788f, 52.944263f, 16.85091f, 51.918377f, 16.33844f, 51.918377f);
        path.cubicTo(15.825968f, 51.918377f, 15.04994f, 52.186184f, 14.557779f, 52.980396f);
        path.cubicTo(14.065618f, 53.77461f, 13.413575f, 54.587006f, 12.610861f, 55.8167f);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(paint, looper);
        instancePaint5.setColor(-16268960);
        instancePaint5.setStrokeWidth(1.8f);
        instancePaint5.setStrokeCap(Paint.Cap.ROUND);
        Path instancePath3 = C24542c.instancePath(looper);
        instancePath3.moveTo(43.92474f, 26.987627f);
        Path path2 = instancePath3;
        path2.cubicTo(45.33654f, 28.716976f, 46.042442f, 30.578243f, 46.042442f, 32.57143f);
        path2.cubicTo(46.042442f, 34.564613f, 45.33654f, 36.303696f, 43.92474f, 37.78867f);
        canvas.drawPath(instancePath3, instancePaint5);
        canvas.restore();
        canvas.save();
        Paint instancePaint6 = C24542c.instancePaint(paint, looper);
        instancePaint6.setColor(-16268960);
        instancePaint6.setStrokeWidth(1.8f);
        instancePaint6.setStrokeCap(Paint.Cap.ROUND);
        Path instancePath4 = C24542c.instancePath(looper);
        instancePath4.moveTo(50.042442f, 21.78867f);
        Path path3 = instancePath4;
        path3.cubicTo(52.042442f, 25.15097f, 53.042442f, 28.76975f, 53.042442f, 32.64501f);
        path3.cubicTo(53.042442f, 36.520275f, 52.042442f, 39.901493f, 50.042442f, 42.78867f);
        canvas.drawPath(instancePath4, instancePaint6);
        canvas.restore();
        canvas.save();
        Paint instancePaint7 = C24542c.instancePaint(instancePaint, looper);
        instancePaint7.setColor(-16268960);
        Path instancePath5 = C24542c.instancePath(looper);
        instancePath5.moveTo(31.5f, 2.0f);
        instancePath5.cubicTo(40.92126f, 2.0f, 49.344826f, 6.271633f, 54.939583f, 12.98378f);
        instancePath5.lineTo(53.373825f, 13.918858f);
        Path path4 = instancePath5;
        path4.cubicTo(48.109505f, 7.7277417f, 40.26344f, 3.8f, 31.5f, 3.8f);
        path4.cubicTo(15.649427f, 3.8f, 2.8f, 16.649427f, 2.8f, 32.5f);
        path4.cubicTo(2.8f, 48.35057f, 15.649427f, 61.2f, 31.5f, 61.2f);
        path4.cubicTo(41.44958f, 61.2f, 50.21665f, 56.13705f, 55.365406f, 48.446945f);
        instancePath5.lineTo(56.925854f, 49.35163f);
        Path path5 = instancePath5;
        path5.cubicTo(51.46296f, 57.577583f, 42.114716f, 63.0f, 31.5f, 63.0f);
        path5.cubicTo(14.655315f, 63.0f, 1.0f, 49.344685f, 1.0f, 32.5f);
        path5.cubicTo(1.0f, 15.655315f, 14.655315f, 2.0f, 31.5f, 2.0f);
        instancePath5.close();
        instancePath5.moveTo(62.0f, 32.5f);
        instancePath5.cubicTo(62.0f, 37.748707f, 60.674194f, 42.68775f, 58.339203f, 47.000515f);
        instancePath5.lineTo(56.909565f, 45.85579f);
        Path path6 = instancePath5;
        path6.cubicTo(59.010757f, 41.866486f, 60.2f, 37.322124f, 60.2f, 32.5f);
        path6.cubicTo(60.2f, 26.564457f, 58.398167f, 21.049755f, 55.311638f, 16.473034f);
        instancePath5.lineTo(56.765415f, 15.409236f);
        instancePath5.cubicTo(60.06973f, 20.2845f, 62.0f, 26.16683f, 62.0f, 32.5f);
        instancePath5.close();
        WeChatSVGRenderC2Java.setFillType(instancePath5, 1);
        canvas.drawPath(instancePath5, instancePaint7);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
