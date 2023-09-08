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

/* renamed from: com.tencent.mm.boot.svg.code.drawable.kinda_right_arrow */
public class kinda_right_arrow extends C24542c {
    private final int height = 20;
    private final int width = 10;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            return 10;
        }
        if (i2 == 1) {
            return 20;
        }
        if (i2 == 2) {
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
            Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
            Paint instancePaint4 = C24542c.instancePaint(instancePaint2, looper);
            instancePaint3.setColor(-16777216);
            instancePaint4.setStrokeWidth(1.0f);
            canvas.saveLayerAlpha((RectF) null, 204, 31);
            canvas.save();
            float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 1.666667f, 0.0f, 1.0f, 4.166667f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            canvas.save();
            Paint instancePaint5 = C24542c.instancePaint(instancePaint3, looper);
            instancePaint5.setColor(-436207616);
            float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, -1.0f, 1.2246469E-16f, 6.701306f, -1.2246469E-16f, -1.0f, 11.67545f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray2);
            canvas.concat(instanceMatrix);
            canvas.save();
            Paint instancePaint6 = C24542c.instancePaint(instancePaint5, looper);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(6.322924f, 10.358243f);
            instancePath.lineTo(5.4390407f, 11.242126f);
            instancePath.lineTo(0.6232929f, 6.4263787f);
            instancePath.cubicTo(0.29818854f, 6.1012745f, 0.29530483f, 5.5770597f, 0.6232929f, 5.2490716f);
            instancePath.lineTo(5.4390407f, 0.4333242f);
            instancePath.lineTo(6.322924f, 1.3172077f);
            instancePath.lineTo(1.8024063f, 5.837725f);
            instancePath.lineTo(6.322924f, 10.358243f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 2);
            canvas.drawPath(instancePath, instancePaint6);
            canvas.restore();
            canvas.restore();
            canvas.restore();
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
