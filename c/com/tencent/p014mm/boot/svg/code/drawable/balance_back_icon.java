package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.balance_back_icon */
public class balance_back_icon extends C24542c {
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
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-16777216);
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 24.0f, 0.0f, 1.0f, 23.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(1.0f, 25.019958f);
        Path path = instancePath;
        path.cubicTo(9.014991f, 17.016632f, 17.029982f, 9.003326f, 25.054966f, 1.0f);
        path.cubicTo(26.47408f, 2.4370062f, 27.893192f, 3.8740125f, 29.292316f, 5.3209977f);
        path.cubicTo(23.73579f, 10.869439f, 18.179262f, 16.4079f, 12.63273f, 21.95634f);
        path.cubicTo(24.755154f, 21.96632f, 36.877575f, 21.95634f, 49.0f, 21.96632f);
        instancePath.lineTo(49.0f, 28.013721f);
        instancePath.lineTo(12.582761f, 28.013721f);
        Path path2 = instancePath;
        path2.cubicTo(18.129293f, 33.612057f, 23.725796f, 39.15052f, 29.292316f, 44.728897f);
        path2.cubicTo(27.873203f, 46.155926f, 26.444098f, 47.57297f, 25.01499f, 49.0f);
        path2.cubicTo(17.009995f, 41.006653f, 9.004997f, 33.013306f, 1.0f, 25.019958f);
        instancePath.lineTo(1.0f, 25.019958f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
