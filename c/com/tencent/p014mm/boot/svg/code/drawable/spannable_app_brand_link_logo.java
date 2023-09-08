package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.spannable_app_brand_link_logo */
public class spannable_app_brand_link_logo extends C24542c {
    private final int height = 60;
    private final int width = 60;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 60;
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
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -415.0f, 0.0f, 1.0f, -651.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 415.0f, 0.0f, 1.0f, 651.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-723724);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(0.0f, 30.0f);
        Path path = instancePath;
        path.cubicTo(0.0f, 13.4314575f, 13.4314575f, 0.0f, 30.0f, 0.0f);
        instancePath.lineTo(30.0f, 0.0f);
        path.cubicTo(46.568542f, 0.0f, 60.0f, 13.4314575f, 60.0f, 30.0f);
        instancePath.lineTo(60.0f, 30.0f);
        path.cubicTo(60.0f, 46.568542f, 46.568542f, 60.0f, 30.0f, 60.0f);
        instancePath.lineTo(30.0f, 60.0f);
        path.cubicTo(13.4314575f, 60.0f, 0.0f, 46.568542f, 0.0f, 30.0f);
        instancePath.lineTo(0.0f, 30.0f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-9074981);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(39.0f, 12.0f);
        Path path2 = instancePath2;
        path2.cubicTo(36.80045f, 12.0f, 34.7991f, 12.586f, 33.0f, 14.0f);
        path2.cubicTo(29.98325f, 15.412f, 27.9f, 18.645334f, 28.0f, 22.0f);
        instancePath2.lineTo(28.0f, 38.0f);
        Path path3 = instancePath2;
        path3.cubicTo(27.9f, 40.428f, 25.2805f, 42.666668f, 22.0f, 43.0f);
        path3.cubicTo(18.81885f, 42.666668f, 16.2f, 40.428f, 16.0f, 38.0f);
        path3.cubicTo(16.2f, 35.701332f, 17.5299f, 34.006f, 19.0f, 33.0f);
        path3.cubicTo(19.59885f, 33.13f, 19.7399f, 33.074f, 20.0f, 33.0f);
        path3.cubicTo(21.0997f, 32.524666f, 22.14165f, 31.586f, 23.0f, 30.0f);
        path3.cubicTo(23.09975f, 28.886667f, 22.03635f, 27.582666f, 20.0f, 28.0f);
        path3.cubicTo(19.68465f, 27.582666f, 19.20885f, 27.664f, 19.0f, 28.0f);
        path3.cubicTo(18.748f, 27.811333f, 18.74605f, 27.812f, 19.0f, 28.0f);
        path3.cubicTo(16.0219f, 28.614f, 13.75015f, 30.371334f, 12.0f, 33.0f);
        path3.cubicTo(11.5057f, 34.15f, 11.0f, 35.853333f, 11.0f, 38.0f);
        path3.cubicTo(11.0f, 43.364666f, 15.9569f, 48.0f, 22.0f, 48.0f);
        path3.cubicTo(24.19955f, 48.0f, 26.2009f, 47.414f, 28.0f, 46.0f);
        path3.cubicTo(31.01675f, 44.588f, 33.1f, 41.354668f, 33.0f, 38.0f);
        instancePath2.lineTo(33.0f, 22.0f);
        Path path4 = instancePath2;
        path4.cubicTo(33.1f, 19.572f, 35.71885f, 17.333334f, 39.0f, 17.0f);
        path4.cubicTo(42.1805f, 17.333334f, 44.8f, 19.572f, 45.0f, 22.0f);
        path4.cubicTo(44.8f, 24.382668f, 43.35765f, 26.144f, 41.0f, 27.0f);
        path4.cubicTo(39.96075f, 27.374f, 38.8694f, 28.362667f, 38.0f, 30.0f);
        path4.cubicTo(37.8853f, 31.135334f, 38.9435f, 32.434f, 41.0f, 32.0f);
        path4.cubicTo(41.2419f, 32.434f, 41.6709f, 32.359333f, 42.0f, 32.0f);
        path4.cubicTo(42.1571f, 32.218666f, 42.2247f, 32.197334f, 42.0f, 32.0f);
        path4.cubicTo(44.9976f, 31.370667f, 47.2557f, 29.618668f, 49.0f, 27.0f);
        path4.cubicTo(49.4943f, 25.850666f, 50.0f, 24.146667f, 50.0f, 22.0f);
        path4.cubicTo(50.0f, 16.635334f, 45.0431f, 12.0f, 39.0f, 12.0f);
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
