package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.note_style_press */
public class note_style_press extends C24542c {
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
        Paint instancePaint3 = C24542c.instancePaint(instancePaint2, looper);
        instancePaint3.setStrokeWidth(1.0f);
        canvas.save();
        Paint paint = instancePaint3;
        Paint paint2 = instancePaint;
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 3.0f, 0.0f, 1.0f, 6.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(paint, looper);
        instancePaint4.setColor(-15028967);
        instancePaint4.setStrokeWidth(3.6f);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(21.0f, 11.55f);
        instancePath.lineTo(63.0f, 11.55f);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(paint, looper);
        instancePaint5.setColor(-15028967);
        instancePaint5.setStrokeWidth(3.6f);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(21.0f, 31.8f);
        instancePath2.lineTo(63.0f, 31.8f);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.save();
        Paint instancePaint6 = C24542c.instancePaint(paint, looper);
        instancePaint6.setColor(-15028967);
        instancePaint6.setStrokeWidth(3.6f);
        Path instancePath3 = C24542c.instancePath(looper);
        instancePath3.moveTo(21.0f, 52.05f);
        instancePath3.lineTo(63.0f, 52.05f);
        canvas.drawPath(instancePath3, instancePaint6);
        canvas.restore();
        canvas.save();
        Paint instancePaint7 = C24542c.instancePaint(paint2, looper);
        instancePaint7.setColor(-15028967);
        Path instancePath4 = C24542c.instancePath(looper);
        instancePath4.moveTo(5.0906253f, 18.0f);
        instancePath4.lineTo(5.0906253f, 7.06875f);
        instancePath4.lineTo(5.034375f, 7.06875f);
        instancePath4.lineTo(1.584375f, 9.45f);
        instancePath4.lineTo(1.584375f, 6.8999996f);
        instancePath4.lineTo(5.08125f, 4.4718747f);
        instancePath4.lineTo(7.89375f, 4.4718747f);
        instancePath4.lineTo(7.89375f, 18.0f);
        instancePath4.close();
        WeChatSVGRenderC2Java.setFillType(instancePath4, 1);
        WeChatSVGRenderC2Java.setFillType(instancePath4, 2);
        canvas.drawPath(instancePath4, instancePaint7);
        canvas.restore();
        canvas.save();
        Paint instancePaint8 = C24542c.instancePaint(paint2, looper);
        instancePaint8.setColor(-15028967);
        Path instancePath5 = C24542c.instancePath(looper);
        instancePath5.moveTo(6.375f, 27.75f);
        Path path = instancePath5;
        path.cubicTo(8.238961f, 27.75f, 9.75f, 29.26104f, 9.75f, 31.125f);
        path.cubicTo(9.75f, 32.98896f, 8.238961f, 34.5f, 6.375f, 34.5f);
        path.cubicTo(4.511039f, 34.5f, 3.0f, 32.98896f, 3.0f, 31.125f);
        path.cubicTo(3.0f, 29.26104f, 4.511039f, 27.75f, 6.375f, 27.75f);
        instancePath5.close();
        canvas.drawPath(instancePath5, instancePaint8);
        canvas.restore();
        canvas.save();
        Paint instancePaint9 = C24542c.instancePaint(paint2, looper);
        instancePaint9.setColor(-15028967);
        Path instancePath6 = C24542c.instancePath(looper);
        instancePath6.moveTo(3.0f, 48.0f);
        instancePath6.lineTo(9.75f, 48.0f);
        instancePath6.lineTo(9.75f, 54.75f);
        instancePath6.lineTo(3.0f, 54.75f);
        instancePath6.lineTo(3.0f, 48.0f);
        instancePath6.close();
        canvas.drawPath(instancePath6, instancePaint9);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
