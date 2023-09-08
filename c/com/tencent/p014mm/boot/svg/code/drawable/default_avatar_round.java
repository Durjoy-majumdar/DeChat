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

/* renamed from: com.tencent.mm.boot.svg.code.drawable.default_avatar_round */
public class default_avatar_round extends C24542c {
    private final int height = 160;
    private final int width = 160;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 160;
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
        instancePaint3.setColor(-526345);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(80.0f, 0.0f);
        Path path = instancePath;
        path.cubicTo(124.182785f, 0.0f, 160.0f, 35.81722f, 160.0f, 80.0f);
        path.cubicTo(160.0f, 124.182785f, 124.182785f, 160.0f, 80.0f, 160.0f);
        path.cubicTo(35.81722f, 160.0f, 0.0f, 124.182785f, 0.0f, 80.0f);
        path.cubicTo(0.0f, 35.81722f, 35.81722f, 0.0f, 80.0f, 0.0f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-436207616);
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 40.0f, 0.0f, 1.0f, 40.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.saveLayerAlpha((RectF) null, 25, 31);
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint4, looper);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(8.333333f, 66.666664f);
        instancePath2.lineTo(8.333333f, 64.38488f);
        instancePath2.lineTo(8.333333f, 64.38488f);
        instancePath2.cubicTo(8.333333f, 62.10125f, 9.993836f, 59.439693f, 12.046992f, 58.437775f);
        instancePath2.lineTo(30.914835f, 49.230476f);
        instancePath2.cubicTo(33.651257f, 47.895134f, 34.28753f, 44.937542f, 32.311485f, 42.595463f);
        instancePath2.lineTo(31.106375f, 41.167126f);
        instancePath2.cubicTo(28.654392f, 38.260952f, 26.666666f, 32.831654f, 26.666666f, 29.030968f);
        instancePath2.lineTo(26.666666f, 23.331934f);
        Path path2 = instancePath2;
        path2.cubicTo(26.666666f, 15.96891f, 32.651188f, 10.0f, 40.0f, 10.0f);
        path2.cubicTo(47.363796f, 10.0f, 53.333332f, 15.976601f, 53.333332f, 23.334024f);
        instancePath2.lineTo(53.333332f, 29.033953f);
        instancePath2.cubicTo(53.333332f, 32.830986f, 51.33644f, 38.2762f, 48.893623f, 41.17191f);
        instancePath2.lineTo(47.688515f, 42.60044f);
        instancePath2.cubicTo(45.723442f, 44.929836f, 46.33729f, 47.894657f, 49.085163f, 49.235035f);
        instancePath2.lineTo(67.95301f, 58.438526f);
        instancePath2.cubicTo(70.004005f, 59.438976f, 71.666664f, 62.0839f, 71.666664f, 64.38488f);
        instancePath2.lineTo(71.666664f, 66.666664f);
        instancePath2.cubicTo(71.666664f, 68.507614f, 70.174286f, 70.0f, 68.333336f, 70.0f);
        instancePath2.lineTo(11.666667f, 70.0f);
        instancePath2.cubicTo(9.825718f, 70.0f, 8.333333f, 68.507614f, 8.333333f, 66.666664f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
