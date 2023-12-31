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

/* renamed from: com.tencent.mm.boot.svg.code.drawable.offline_bottom_logo */
public class offline_bottom_logo extends C24542c {
    private final int height = 60;
    private final int width = 69;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            return 69;
        }
        if (i2 == 1) {
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
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-16777216);
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.saveLayerAlpha((RectF) null, 25, 31);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(7.0f, 12.0f);
        Path path = instancePath;
        path.cubicTo(20.493433f, -2.788531f, 47.23359f, -2.778528f, 61.0f, 12.0f);
        path.cubicTo(52.72773f, 16.237268f, 44.191296f, 19.518269f, 36.0f, 23.0f);
        path.cubicTo(32.692627f, 24.629827f, 29.620312f, 26.500397f, 26.0f, 27.0f);
        path.cubicTo(22.454912f, 25.550108f, 19.53271f, 22.599209f, 16.0f, 21.0f);
        path.cubicTo(16.880709f, 25.780178f, 19.072361f, 30.011467f, 21.0f, 34.0f);
        path.cubicTo(21.914503f, 35.3631f, 22.444904f, 36.96359f, 24.0f, 37.0f);
        path.cubicTo(26.958305f, 36.253372f, 29.59029f, 34.442818f, 32.0f, 33.0f);
        path.cubicTo(40.868793f, 28.060873f, 49.445255f, 23.299421f, 58.0f, 18.0f);
        path.cubicTo(59.733013f, 17.267584f, 61.69449f, 16.477343f, 64.0f, 16.0f);
        path.cubicTo(67.03852f, 21.758953f, 68.209404f, 29.341263f, 66.0f, 36.0f);
        path.cubicTo(61.50435f, 46.006344f, 51.30666f, 52.538334f, 41.0f, 54.0f);
        path.cubicTo(35.554787f, 55.26917f, 30.130697f, 54.698994f, 25.0f, 54.0f);
        path.cubicTo(19.993055f, 52.598354f, 16.260242f, 56.709606f, 12.0f, 58.0f);
        path.cubicTo(12.337285f, 55.159134f, 12.547443f, 52.298264f, 13.0f, 49.0f);
        path.cubicTo(9.835399f, 45.706253f, 5.582193f, 42.685333f, 3.0f, 38.0f);
        path.cubicTo(-0.9327183f, 29.841415f, 0.7785717f, 19.25819f, 7.0f, 12.0f);
        instancePath.lineTo(7.0f, 12.0f);
        instancePath.lineTo(7.0f, 12.0f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
