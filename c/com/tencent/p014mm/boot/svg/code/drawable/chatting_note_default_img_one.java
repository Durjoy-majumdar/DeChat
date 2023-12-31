package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.chatting_note_default_img_one */
public class chatting_note_default_img_one extends C24542c {
    private final int height = 135;
    private final int width = 300;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            return 300;
        }
        if (i2 == 1) {
            return 135;
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
        instancePaint3.setColor(-921103);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(0.0f, 0.0f);
        instancePath.lineTo(300.0f, 0.0f);
        instancePath.lineTo(300.0f, 136.0f);
        instancePath.lineTo(0.0f, 136.0f);
        instancePath.lineTo(0.0f, 0.0f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-3552823);
        Paint paint = instancePaint4;
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 111.0f, 0.0f, 1.0f, 39.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(paint, looper);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(0.0f, 3.004289f);
        instancePath2.cubicTo(0.0f, 1.345066f, 1.3380457f, 0.0f, 3.0004263f, 0.0f);
        instancePath2.lineTo(75.99957f, 0.0f);
        instancePath2.cubicTo(77.65666f, 0.0f, 79.0f, 1.3527762f, 79.0f, 3.004289f);
        instancePath2.lineTo(79.0f, 53.995712f);
        instancePath2.cubicTo(79.0f, 55.654934f, 77.66196f, 57.0f, 75.99957f, 57.0f);
        instancePath2.lineTo(3.0004263f, 57.0f);
        instancePath2.cubicTo(1.3433366f, 57.0f, 0.0f, 55.647224f, 0.0f, 53.995712f);
        instancePath2.lineTo(0.0f, 3.004289f);
        instancePath2.close();
        instancePath2.moveTo(4.0f, 4.0f);
        instancePath2.lineTo(75.0f, 4.0f);
        instancePath2.lineTo(75.0f, 53.0f);
        instancePath2.lineTo(4.0f, 53.0f);
        instancePath2.lineTo(4.0f, 4.0f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.save();
        Paint instancePaint6 = C24542c.instancePaint(paint, looper);
        Path instancePath3 = C24542c.instancePath(looper);
        instancePath3.moveTo(60.92106f, 30.279995f);
        instancePath3.lineTo(50.039062f, 38.768322f);
        instancePath3.lineTo(53.85942f, 46.690155f);
        instancePath3.lineTo(27.17777f, 22.0f);
        instancePath3.lineTo(2.0f, 45.710293f);
        instancePath3.lineTo(2.0f, 56.5f);
        instancePath3.lineTo(77.96154f, 56.5f);
        instancePath3.lineTo(77.96154f, 45.710293f);
        instancePath3.close();
        WeChatSVGRenderC2Java.setFillType(instancePath3, 1);
        WeChatSVGRenderC2Java.setFillType(instancePath3, 2);
        canvas.drawPath(instancePath3, instancePaint6);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
