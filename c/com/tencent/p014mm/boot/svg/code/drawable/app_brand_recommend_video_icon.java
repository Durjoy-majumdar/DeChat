package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.app_brand_recommend_video_icon */
public class app_brand_recommend_video_icon extends C24542c {
    private final int height = 32;
    private final int width = 32;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 32;
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
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -307.0f, 0.0f, 1.0f, -1235.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 307.0f, 0.0f, 1.0f, 1235.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
        Paint instancePaint5 = C24542c.instancePaint(instancePaint3, looper);
        instancePaint4.setColor(855638016);
        instancePaint5.setColor(-1);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(16.0f, 31.5f);
        Path path = instancePath;
        path.cubicTo(24.560413f, 31.5f, 31.5f, 24.560413f, 31.5f, 16.0f);
        path.cubicTo(31.5f, 7.439586f, 24.560413f, 0.5f, 16.0f, 0.5f);
        path.cubicTo(7.439586f, 0.5f, 0.5f, 7.439586f, 0.5f, 16.0f);
        path.cubicTo(0.5f, 24.560413f, 7.439586f, 31.5f, 16.0f, 31.5f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.drawPath(instancePath, instancePaint5);
        canvas.restore();
        canvas.save();
        Paint instancePaint6 = C24542c.instancePaint(instancePaint, looper);
        instancePaint6.setColor(-1);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(14.023999f, 10.208398f);
        Path path2 = instancePath2;
        path2.cubicTo(13.896853f, 10.128932f, 13.749936f, 10.086796f, 13.6f, 10.086796f);
        path2.cubicTo(13.158173f, 10.086796f, 12.8f, 10.444968f, 12.8f, 10.886796f);
        instancePath2.lineTo(12.8f, 21.113203f);
        Path path3 = instancePath2;
        path3.cubicTo(12.8f, 21.26314f, 12.842135f, 21.410057f, 12.921601f, 21.537203f);
        path3.cubicTo(13.155769f, 21.911873f, 13.64933f, 22.02577f, 14.023999f, 21.791603f);
        instancePath2.lineTo(22.205126f, 16.678398f);
        Path path4 = instancePath2;
        path4.cubicTo(22.30814f, 16.614014f, 22.39514f, 16.527014f, 22.459524f, 16.424f);
        path4.cubicTo(22.693693f, 16.04933f, 22.579794f, 15.55577f, 22.205126f, 15.321602f);
        instancePath2.lineTo(14.023999f, 10.208398f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint6);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
