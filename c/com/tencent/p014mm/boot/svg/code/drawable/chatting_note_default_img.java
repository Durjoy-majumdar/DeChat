package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.chatting_note_default_img */
public class chatting_note_default_img extends C24542c {
    private final int height = 136;
    private final int width = 136;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 136;
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
        Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-921103);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(0.0f, 0.0f);
        instancePath.lineTo(136.0f, 0.0f);
        instancePath.lineTo(136.0f, 136.0f);
        instancePath.lineTo(0.0f, 136.0f);
        instancePath.lineTo(0.0f, 0.0f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 34.0f, 0.0f, 1.0f, 42.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint3, looper);
        instancePaint5.setColor(-3552823);
        instancePaint5.setStrokeWidth(3.0f);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(1.5f, 6.0f);
        instancePath2.cubicTo(1.5f, 3.5147185f, 3.5147185f, 1.5f, 6.0f, 1.5f);
        instancePath2.lineTo(63.0f, 1.5f);
        instancePath2.cubicTo(65.48528f, 1.5f, 67.5f, 3.5147185f, 67.5f, 6.0f);
        instancePath2.lineTo(67.5f, 47.0f);
        instancePath2.cubicTo(67.5f, 49.485283f, 65.48528f, 51.5f, 63.0f, 51.5f);
        instancePath2.lineTo(6.0f, 51.5f);
        instancePath2.cubicTo(3.5147185f, 51.5f, 1.5f, 49.485283f, 1.5f, 47.0f);
        instancePath2.lineTo(1.5f, 6.0f);
        instancePath2.close();
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.save();
        Paint instancePaint6 = C24542c.instancePaint(instancePaint, looper);
        instancePaint6.setColor(-3552823);
        Path instancePath3 = C24542c.instancePath(looper);
        instancePath3.moveTo(2.0f, 40.47622f);
        instancePath3.lineTo(23.9226f, 20.0f);
        instancePath3.lineTo(48.016544f, 43.06765f);
        instancePath3.lineTo(44.84195f, 35.311966f);
        instancePath3.lineTo(54.734417f, 27.538553f);
        instancePath3.lineTo(68.0f, 40.47622f);
        instancePath3.lineTo(68.0f, 50.245495f);
        instancePath3.lineTo(2.0f, 50.245495f);
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
