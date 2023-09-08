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

/* renamed from: com.tencent.mm.boot.svg.code.drawable.guide_ic_01 */
public class guide_ic_01 extends C24542c {
    private final int height = 48;
    private final int width = 48;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 48;
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
        canvas.saveLayerAlpha((RectF) null, 38, 31);
        canvas.save();
        Paint paint = instancePaint3;
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -79.0f, 0.0f, 1.0f, -610.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 79.0f, 0.0f, 1.0f, 610.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-436207616);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(24.0f, 4.0f);
        Path path = instancePath;
        path.cubicTo(35.045696f, 4.0f, 44.0f, 12.954305f, 44.0f, 24.0f);
        path.cubicTo(44.0f, 35.045696f, 35.045696f, 44.0f, 24.0f, 44.0f);
        path.cubicTo(12.954305f, 44.0f, 4.0f, 35.045696f, 4.0f, 24.0f);
        path.cubicTo(4.0f, 12.954305f, 12.954305f, 4.0f, 24.0f, 4.0f);
        instancePath.close();
        instancePath.moveTo(24.0f, 6.4f);
        path.cubicTo(14.279788f, 6.4f, 6.4f, 14.279788f, 6.4f, 24.0f);
        path.cubicTo(6.4f, 33.72021f, 14.279788f, 41.6f, 24.0f, 41.6f);
        path.cubicTo(33.72021f, 41.6f, 41.6f, 33.72021f, 41.6f, 24.0f);
        path.cubicTo(41.6f, 14.279788f, 33.72021f, 6.4f, 24.0f, 6.4f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(paint, looper);
        instancePaint5.setColor(-16777216);
        instancePaint5.setStrokeWidth(2.4f);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(26.8f, 22.0f);
        instancePath2.cubicTo(26.8f, 18.907206f, 29.307203f, 16.4f, 32.399998f, 16.4f);
        instancePath2.lineTo(33.2f, 16.4f);
        instancePath2.cubicTo(36.292797f, 16.4f, 38.8f, 18.907206f, 38.8f, 22.0f);
        instancePath2.lineTo(38.8f, 21.999998f);
        instancePath2.cubicTo(38.8f, 25.092793f, 36.292797f, 27.599998f, 33.2f, 27.599998f);
        instancePath2.lineTo(32.399998f, 27.599998f);
        instancePath2.cubicTo(29.307203f, 27.599998f, 26.8f, 25.092793f, 26.8f, 21.999998f);
        instancePath2.lineTo(26.8f, 22.0f);
        instancePath2.close();
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.save();
        Paint instancePaint6 = C24542c.instancePaint(paint, looper);
        instancePaint6.setColor(-16777216);
        instancePaint6.setStrokeWidth(2.4f);
        Path instancePath3 = C24542c.instancePath(looper);
        instancePath3.moveTo(9.2f, 22.0f);
        instancePath3.cubicTo(9.2f, 18.907206f, 11.707205f, 16.4f, 14.799999f, 16.4f);
        instancePath3.lineTo(15.6f, 16.4f);
        instancePath3.cubicTo(18.692795f, 16.4f, 21.2f, 18.907206f, 21.2f, 22.0f);
        instancePath3.lineTo(21.2f, 21.999998f);
        instancePath3.cubicTo(21.2f, 25.092793f, 18.692795f, 27.599998f, 15.6f, 27.599998f);
        instancePath3.lineTo(14.799999f, 27.599998f);
        instancePath3.cubicTo(11.707205f, 27.599998f, 9.2f, 25.092793f, 9.2f, 21.999998f);
        instancePath3.lineTo(9.2f, 22.0f);
        instancePath3.close();
        canvas.drawPath(instancePath3, instancePaint6);
        canvas.restore();
        canvas.save();
        Paint instancePaint7 = C24542c.instancePaint(paint, looper);
        instancePaint7.setColor(-16777216);
        instancePaint7.setStrokeWidth(2.4f);
        Path instancePath4 = C24542c.instancePath(looper);
        instancePath4.moveTo(26.8f, 22.8f);
        Path path2 = instancePath4;
        path2.cubicTo(26.8f, 21.253603f, 25.546398f, 20.0f, 24.0f, 20.0f);
        path2.cubicTo(22.453602f, 20.0f, 21.2f, 21.253603f, 21.2f, 22.8f);
        canvas.drawPath(instancePath4, instancePaint7);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
