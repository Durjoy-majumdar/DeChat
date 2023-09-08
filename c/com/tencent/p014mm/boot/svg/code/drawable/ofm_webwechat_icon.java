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

/* renamed from: com.tencent.mm.boot.svg.code.drawable.ofm_webwechat_icon */
public class ofm_webwechat_icon extends C24542c {
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
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 16.0f, 0.0f, 1.0f, 21.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-1);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(1.0493919f, 4.9551387f);
        Path path = instancePath;
        path.cubicTo(0.73974586f, 3.1585698f, 1.9383756f, 0.9428011f, 3.976046f, 1.1024961f);
        path.cubicTo(22.345047f, 0.9727439f, 40.724033f, 1.0725534f, 59.093037f, 1.0525914f);
        path.cubicTo(60.89098f, 0.72322047f, 63.00856f, 1.970838f, 62.908672f, 3.9570448f);
        path.cubicTo(63.04851f, 17.002132f, 62.948627f, 30.04722f, 62.958614f, 43.092308f);
        path.cubicTo(63.238297f, 44.82899f, 62.07962f, 46.994858f, 60.11187f, 46.895046f);
        path.cubicTo(53.07991f, 47.05474f, 46.03796f, 46.90503f, 38.99601f, 46.954933f);
        instancePath.lineTo(38.99601f, 50.95729f);
        Path path2 = instancePath;
        path2.cubicTo(42.32221f, 50.927345f, 45.658394f, 50.8475f, 48.984592f, 51.17687f);
        path2.cubicTo(48.984592f, 52.274773f, 48.914673f, 54.400715f, 47.17666f, 53.93161f);
        path2.cubicTo(37.068214f, 53.951572f, 26.95977f, 53.951572f, 16.851326f, 53.93161f);
        path2.cubicTo(15.083348f, 54.410694f, 14.993451f, 52.25481f, 15.093336f, 51.136948f);
        path2.cubicTo(18.389568f, 50.87744f, 21.705776f, 50.917366f, 25.011997f, 50.95729f);
        instancePath.lineTo(25.011997f, 46.954933f);
        Path path3 = instancePath;
        path3.cubicTo(17.980036f, 46.90503f, 10.948075f, 47.05474f, 3.926103f, 46.895046f);
        path3.cubicTo(1.9084098f, 47.0248f, 0.73974586f, 44.80903f, 1.0493919f, 43.032425f);
        path3.cubicTo(1.0294148f, 30.336668f, 1.0294148f, 17.650894f, 1.0493919f, 4.9551387f);
        instancePath.lineTo(1.0493919f, 4.9551387f);
        instancePath.close();
        instancePath.moveTo(5.0f, 5.0f);
        instancePath.lineTo(5.0f, 39.0f);
        instancePath.lineTo(59.0f, 39.0f);
        instancePath.lineTo(59.0f, 5.0f);
        instancePath.lineTo(5.0f, 5.0f);
        instancePath.lineTo(5.0f, 5.0f);
        instancePath.close();
        instancePath.moveTo(31.225903f, 41.13082f);
        Path path4 = instancePath;
        path4.cubicTo(28.789328f, 42.126995f, 30.338081f, 45.77963f, 32.794384f, 44.84987f);
        path4.cubicTo(35.201366f, 43.844208f, 33.65261f, 40.276962f, 31.225903f, 41.13082f);
        instancePath.lineTo(31.225903f, 41.13082f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-15658735);
        float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 29.0f, 0.0f, 1.0f, 40.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        canvas.saveLayerAlpha((RectF) null, 17, 31);
        canvas.save();
        Paint instancePaint6 = C24542c.instancePaint(instancePaint5, looper);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(2.2259018f, 1.130823f);
        Path path5 = instancePath2;
        path5.cubicTo(4.6526113f, 0.2769606f, 6.2013645f, 3.8442078f, 3.7943847f, 4.849868f);
        path5.cubicTo(1.3380812f, 5.779629f, -0.21067229f, 2.1269958f, 2.2259018f, 1.130823f);
        instancePath2.lineTo(2.2259018f, 1.130823f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint6);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
