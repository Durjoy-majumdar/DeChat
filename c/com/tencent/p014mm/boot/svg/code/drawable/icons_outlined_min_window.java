package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_min_window */
public class icons_outlined_min_window extends C24542c {
    private final int height = 72;
    private final int width = 72;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 72;
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
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(0.0f, 0.0f);
        instancePath.lineTo(72.0f, 0.0f);
        instancePath.lineTo(72.0f, 72.0f);
        instancePath.lineTo(0.0f, 72.0f);
        instancePath.lineTo(0.0f, 0.0f);
        instancePath.close();
        canvas.save();
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-1);
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 0.70710677f, -0.70710677f, 35.5717f, 0.70710677f, 0.70710677f, -16.49164f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(38.400127f, 39.172203f);
        instancePath2.lineTo(50.42094f, 51.19302f);
        instancePath2.lineTo(47.23896f, 54.375f);
        instancePath2.lineTo(39.942097f, 47.079018f);
        instancePath2.lineTo(39.94302f, 67.693016f);
        instancePath2.lineTo(35.44302f, 67.693016f);
        instancePath2.lineTo(35.442097f, 47.07702f);
        instancePath2.lineTo(28.147078f, 54.375f);
        instancePath2.lineTo(24.965097f, 51.19302f);
        instancePath2.lineTo(36.985912f, 39.172203f);
        instancePath2.cubicTo(37.37644f, 38.78168f, 38.0096f, 38.78168f, 38.400127f, 39.172203f);
        instancePath2.close();
        instancePath2.moveTo(39.94302f, 1.6930195f);
        instancePath2.lineTo(39.942097f, 22.30502f);
        instancePath2.lineTo(47.23896f, 15.011039f);
        instancePath2.lineTo(50.42094f, 18.19302f);
        instancePath2.lineTo(38.400127f, 30.213835f);
        instancePath2.cubicTo(38.0096f, 30.604359f, 37.37644f, 30.604359f, 36.985912f, 30.213835f);
        instancePath2.lineTo(36.985912f, 30.213835f);
        instancePath2.lineTo(24.965097f, 18.19302f);
        instancePath2.lineTo(28.147078f, 15.011039f);
        instancePath2.lineTo(35.442097f, 22.30902f);
        instancePath2.lineTo(35.44302f, 1.6930195f);
        instancePath2.lineTo(39.94302f, 1.6930195f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint3);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
