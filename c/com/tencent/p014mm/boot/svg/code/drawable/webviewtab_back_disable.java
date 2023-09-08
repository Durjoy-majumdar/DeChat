package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.webviewtab_back_disable */
public class webviewtab_back_disable extends C24542c {
    private final int height = 96;
    private final int width = 48;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            return 48;
        }
        if (i2 == 1) {
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
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.3333334f, 0.0f, 0.0f, 0.0f, 1.3333334f, 0.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        C24542c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
        canvas.save();
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(1275068416);
        float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, -1.0f, 1.2246469E-16f, 36.0f, -1.2246469E-16f, -1.0f, 72.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(28.637825f, 52.258053f);
        instancePath.lineTo(25.455845f, 55.440033f);
        instancePath.lineTo(8.119153f, 38.10334f);
        instancePath.cubicTo(6.948777f, 36.932964f, 6.951566f, 35.032623f, 8.119153f, 33.865036f);
        instancePath.lineTo(25.455845f, 16.528345f);
        instancePath.lineTo(28.637825f, 19.710325f);
        instancePath.lineTo(12.363961f, 35.984188f);
        instancePath.lineTo(28.637825f, 52.258053f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
