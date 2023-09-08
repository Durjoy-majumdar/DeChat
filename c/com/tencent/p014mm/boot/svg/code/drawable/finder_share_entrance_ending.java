package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.finder_share_entrance_ending */
public class finder_share_entrance_ending extends C24542c {
    private final int height = 4;
    private final int width = 68;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            return 68;
        }
        if (i2 == 1) {
            return 4;
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
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(2.0816682E-15f, 1.5f);
        instancePath.lineTo(24.0f, 1.5f);
        instancePath.lineTo(24.0f, 2.5f);
        instancePath.lineTo(2.0816682E-15f, 2.5f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        Paint paint = instancePaint;
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 32.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(paint, looper);
        instancePaint4.setColor(-16777216);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(2.0f, 0.0f);
        Path path = instancePath2;
        path.cubicTo(3.1045694f, 0.0f, 4.0f, 0.89543045f, 4.0f, 2.0f);
        path.cubicTo(4.0f, 3.1045694f, 3.1045694f, 4.0f, 2.0f, 4.0f);
        path.cubicTo(0.89543045f, 4.0f, 0.0f, 3.1045694f, 0.0f, 2.0f);
        path.cubicTo(0.0f, 0.89543045f, 0.89543045f, 0.0f, 2.0f, 0.0f);
        instancePath2.close();
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        Path instancePath3 = C24542c.instancePath(looper);
        instancePath3.moveTo(4.5474735E-13f, 0.0f);
        instancePath3.lineTo(4.0f, 0.0f);
        instancePath3.lineTo(4.0f, 4.0f);
        instancePath3.lineTo(4.5474735E-13f, 4.0f);
        instancePath3.lineTo(4.5474735E-13f, 0.0f);
        instancePath3.close();
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(paint, looper);
        instancePaint5.setColor(-16777216);
        Path instancePath4 = C24542c.instancePath(looper);
        instancePath4.moveTo(44.0f, 1.5f);
        instancePath4.lineTo(68.0f, 1.5f);
        instancePath4.lineTo(68.0f, 2.5f);
        instancePath4.lineTo(44.0f, 2.5f);
        instancePath4.lineTo(44.0f, 1.5f);
        instancePath4.close();
        canvas.drawPath(instancePath4, instancePaint5);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
