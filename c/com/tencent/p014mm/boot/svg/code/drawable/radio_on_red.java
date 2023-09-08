package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.radio_on_red */
public class radio_on_red extends C24542c {
    private final int height = 60;
    private final int width = 60;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
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
        instancePaint3.setColor(-899014);
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -218.0f, 0.0f, 1.0f, -230.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 224.0f, 0.0f, 1.0f, 236.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(0.0f, 24.0f);
        Path path = instancePath;
        path.cubicTo(0.0f, 10.8f, 10.8f, 0.0f, 24.0f, 0.0f);
        path.cubicTo(37.2f, 0.0f, 48.0f, 10.8f, 48.0f, 24.0f);
        path.cubicTo(48.0f, 37.2f, 37.2f, 48.0f, 24.0f, 48.0f);
        path.cubicTo(10.8f, 48.0f, 0.0f, 37.2f, 0.0f, 24.0f);
        instancePath.close();
        instancePath.moveTo(4.0f, 24.0f);
        path.cubicTo(4.0f, 35.0f, 13.0f, 44.0f, 24.0f, 44.0f);
        path.cubicTo(35.0f, 44.0f, 44.0f, 35.0f, 44.0f, 24.0f);
        path.cubicTo(44.0f, 13.0f, 35.0f, 4.0f, 24.0f, 4.0f);
        path.cubicTo(13.0f, 4.0f, 4.0f, 13.0f, 4.0f, 24.0f);
        instancePath.close();
        instancePath.moveTo(10.0f, 24.0f);
        Path path2 = instancePath;
        path2.cubicTo(10.0f, 31.7f, 16.3f, 38.0f, 24.0f, 38.0f);
        path2.cubicTo(31.7f, 38.0f, 38.0f, 31.7f, 38.0f, 24.0f);
        path2.cubicTo(38.0f, 16.3f, 31.7f, 10.0f, 24.0f, 10.0f);
        path2.cubicTo(16.3f, 10.0f, 10.0f, 16.3f, 10.0f, 24.0f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
