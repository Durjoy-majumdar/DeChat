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

/* renamed from: com.tencent.mm.boot.svg.code.drawable.toolbar_icon_dark_fav_disable */
public class toolbar_icon_dark_fav_disable extends C24542c {
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
        canvas.saveLayerAlpha((RectF) null, 76, 31);
        canvas.save();
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 12.0f, 0.0f, 1.0f, 12.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 9.0f, 0.0f, 1.0f, 6.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-1);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(48.7577f, 15.974849f);
        instancePath.lineTo(27.774939f, 3.7349038f);
        instancePath.cubicTo(27.466654f, 3.5550714f, 26.53348f, 3.554993f, 26.225061f, 3.7349038f);
        instancePath.lineTo(5.2423f, 15.974849f);
        instancePath.lineTo(27.0f, 28.536663f);
        instancePath.lineTo(48.7577f, 15.974849f);
        instancePath.close();
        instancePath.moveTo(50.4f, 19.183588f);
        instancePath.lineTo(28.8f, 31.654354f);
        instancePath.lineTo(28.8f, 56.89739f);
        instancePath.lineTo(49.59719f, 44.765697f);
        Path path = instancePath;
        path.cubicTo(49.920998f, 44.57681f, 50.4f, 43.743988f, 50.4f, 43.37328f);
        instancePath.lineTo(50.4f, 19.183588f);
        instancePath.close();
        instancePath.moveTo(3.6f, 19.183588f);
        instancePath.lineTo(3.6f, 43.37328f);
        path.cubicTo(3.6f, 43.73662f, 4.0836716f, 44.579533f, 4.402809f, 44.765697f);
        instancePath.lineTo(25.2f, 56.89739f);
        instancePath.lineTo(25.2f, 31.654354f);
        instancePath.lineTo(3.6f, 19.183588f);
        instancePath.close();
        instancePath.moveTo(24.411127f, 0.62529963f);
        instancePath.cubicTo(25.840921f, -0.20874764f, 28.160156f, -0.20811874f, 29.588873f, 0.62529963f);
        instancePath.lineTo(51.411125f, 13.354947f);
        instancePath.cubicTo(52.840923f, 14.188994f, 54.0f, 16.21864f, 54.0f, 17.856966f);
        instancePath.lineTo(54.0f, 43.37328f);
        instancePath.cubicTo(54.0f, 45.02563f, 52.839844f, 47.04188f, 51.411125f, 47.8753f);
        instancePath.lineTo(29.588873f, 60.604946f);
        instancePath.cubicTo(28.159079f, 61.438995f, 25.839844f, 61.438366f, 24.411127f, 60.604946f);
        instancePath.lineTo(2.5888736f, 47.8753f);
        instancePath.cubicTo(1.1590781f, 47.041252f, 0.0f, 45.01161f, 0.0f, 43.37328f);
        instancePath.lineTo(0.0f, 17.856966f);
        instancePath.cubicTo(0.0f, 16.204617f, 1.1601562f, 14.188366f, 2.5888736f, 13.354947f);
        instancePath.lineTo(24.411127f, 0.62529963f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
