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

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_winningrecord */
public class icons_outlined_winningrecord extends C24542c {
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
        canvas.saveLayerAlpha((RectF) null, 230, 31);
        canvas.save();
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-16777216);
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 12.0f, 0.0f, 1.0f, 6.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(29.993713f, 0.0f);
        instancePath.lineTo(48.0f, 18.0f);
        instancePath.lineTo(48.0f, 57.004063f);
        instancePath.cubicTo(48.0f, 58.66269f, 46.662483f, 60.0f, 45.012573f, 60.0f);
        instancePath.lineTo(2.9874256f, 60.0f);
        instancePath.cubicTo(1.3467606f, 60.0f, 0.0f, 58.658672f, 0.0f, 57.004063f);
        instancePath.lineTo(0.0f, 2.9959373f);
        instancePath.cubicTo(0.0f, 1.3373097f, 1.337516f, 0.0f, 2.9874256f, 0.0f);
        instancePath.lineTo(29.993713f, 0.0f);
        instancePath.close();
        instancePath.moveTo(25.197f, 3.597f);
        instancePath.lineTo(3.6f, 3.6f);
        instancePath.lineTo(3.6f, 56.4f);
        instancePath.lineTo(44.4f, 56.4f);
        instancePath.lineTo(44.397f, 22.8f);
        instancePath.lineTo(30.0f, 22.8f);
        instancePath.cubicTo(27.349033f, 22.8f, 25.2f, 20.650967f, 25.2f, 18.0f);
        instancePath.lineTo(25.197f, 3.597f);
        instancePath.close();
        instancePath.moveTo(44.106f, 19.2f);
        instancePath.lineTo(28.797f, 3.894f);
        instancePath.lineTo(28.8f, 18.0f);
        instancePath.cubicTo(28.8f, 18.662743f, 29.337257f, 19.2f, 30.0f, 19.2f);
        instancePath.lineTo(44.106f, 19.2f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 9.0f, 0.0f, 1.0f, 22.5f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(0.0f, 9.0f);
        instancePath2.lineTo(22.5f, 9.0f);
        instancePath2.lineTo(22.5f, 12.6f);
        instancePath2.lineTo(0.0f, 12.6f);
        instancePath2.lineTo(0.0f, 9.0f);
        instancePath2.close();
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.save();
        Paint instancePaint6 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath3 = C24542c.instancePath(looper);
        instancePath3.moveTo(0.0f, 18.0f);
        instancePath3.lineTo(12.0f, 18.0f);
        instancePath3.lineTo(12.0f, 21.6f);
        instancePath3.lineTo(0.0f, 21.6f);
        instancePath3.lineTo(0.0f, 18.0f);
        instancePath3.close();
        canvas.drawPath(instancePath3, instancePaint6);
        canvas.restore();
        canvas.save();
        Paint instancePaint7 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath4 = C24542c.instancePath(looper);
        instancePath4.moveTo(0.0f, 0.0f);
        instancePath4.lineTo(12.0f, 0.0f);
        instancePath4.lineTo(12.0f, 3.6000001f);
        instancePath4.lineTo(0.0f, 3.6000001f);
        instancePath4.lineTo(0.0f, 0.0f);
        instancePath4.close();
        canvas.drawPath(instancePath4, instancePaint7);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
