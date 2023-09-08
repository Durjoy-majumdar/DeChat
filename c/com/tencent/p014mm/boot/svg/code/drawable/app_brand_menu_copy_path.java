package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.app_brand_menu_copy_path */
public class app_brand_menu_copy_path extends C24542c {
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
        C24542c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
        canvas.save();
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-16777216);
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -77.0f, 0.0f, 1.0f, -93.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 77.0f, 0.0f, 1.0f, 93.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(13.866667f, 4.0f);
        instancePath.lineTo(5.866667f, 26.666666f);
        instancePath.lineTo(4.0f, 26.666666f);
        instancePath.lineTo(12.0f, 4.0f);
        instancePath.lineTo(13.866667f, 4.0f);
        instancePath.close();
        instancePath.moveTo(12.8f, 24.0f);
        Path path = instancePath;
        path.cubicTo(13.53638f, 24.0f, 14.133333f, 24.596954f, 14.133333f, 25.333334f);
        path.cubicTo(14.133333f, 26.069714f, 13.53638f, 26.666666f, 12.8f, 26.666666f);
        path.cubicTo(12.063621f, 26.666666f, 11.466667f, 26.069714f, 11.466667f, 25.333334f);
        path.cubicTo(11.466667f, 24.596954f, 12.063621f, 24.0f, 12.8f, 24.0f);
        instancePath.close();
        instancePath.moveTo(19.733334f, 24.0f);
        Path path2 = instancePath;
        path2.cubicTo(20.469713f, 24.0f, 21.066668f, 24.596954f, 21.066668f, 25.333334f);
        path2.cubicTo(21.066668f, 26.069714f, 20.469713f, 26.666666f, 19.733334f, 26.666666f);
        path2.cubicTo(18.996954f, 26.666666f, 18.4f, 26.069714f, 18.4f, 25.333334f);
        path2.cubicTo(18.4f, 24.596954f, 18.996954f, 24.0f, 19.733334f, 24.0f);
        instancePath.close();
        instancePath.moveTo(26.666666f, 24.0f);
        path2.cubicTo(27.403046f, 24.0f, 28.0f, 24.596954f, 28.0f, 25.333334f);
        path2.cubicTo(28.0f, 26.069714f, 27.403046f, 26.666666f, 26.666666f, 26.666666f);
        path2.cubicTo(25.930286f, 26.666666f, 25.333334f, 26.069714f, 25.333334f, 25.333334f);
        path2.cubicTo(25.333334f, 24.596954f, 25.930286f, 24.0f, 26.666666f, 24.0f);
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
