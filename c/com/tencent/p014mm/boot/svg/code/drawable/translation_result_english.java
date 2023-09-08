package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.translation_result_english */
public class translation_result_english extends C24542c {
    private final int height = 131;
    private final int width = 131;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 131;
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
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 28.0f, 0.0f, 1.0f, 28.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 2.777778f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(paint, looper);
        instancePaint4.setColor(-1);
        instancePaint4.setStrokeWidth(4.1666665f);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(22.242647f, 9.672728f);
        instancePath.lineTo(6.25f, 9.672728f);
        instancePath.cubicTo(2.7982204f, 9.672728f, -4.2272108E-16f, 12.470947f, 0.0f, 15.922728f);
        instancePath.lineTo(0.0f, 21.607521f);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(paint2, looper);
        instancePaint5.setColor(-1);
        float[] matrixFloatArray3 = C24542c.setMatrixFloatArray(matrixFloatArray2, -0.70710677f, -0.70710677f, 33.52646f, 0.70710677f, -0.70710677f, 5.469288f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray3);
        canvas.concat(instanceMatrix);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(13.547169f, 7.605474f);
        instancePath2.lineTo(13.547169f, 15.896383f);
        instancePath2.lineTo(9.380502f, 15.896383f);
        instancePath2.lineTo(9.380502f, 7.605474f);
        instancePath2.lineTo(9.380502f, 3.4600194f);
        instancePath2.lineTo(21.880503f, 3.4600194f);
        instancePath2.lineTo(21.880503f, 7.605474f);
        instancePath2.lineTo(13.547169f, 7.605474f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.restore();
        canvas.save();
        Paint instancePaint6 = C24542c.instancePaint(paint, looper);
        instancePaint6.setColor(-1);
        instancePaint6.setStrokeWidth(5.0f);
        Path instancePath3 = C24542c.instancePath(looper);
        instancePath3.moveTo(3.127724f, 28.754545f);
        instancePath3.cubicTo(2.7848487f, 28.754545f, 2.5f, 29.040102f, 2.5f, 29.385191f);
        instancePath3.lineTo(2.5f, 72.869354f);
        instancePath3.cubicTo(2.5f, 73.223274f, 2.775803f, 73.5f, 3.127724f, 73.5f);
        instancePath3.lineTo(46.872276f, 73.5f);
        instancePath3.cubicTo(47.215153f, 73.5f, 47.5f, 73.21445f, 47.5f, 72.869354f);
        instancePath3.lineTo(47.5f, 29.385191f);
        instancePath3.cubicTo(47.5f, 29.03127f, 47.224197f, 28.754545f, 46.872276f, 28.754545f);
        instancePath3.lineTo(3.127724f, 28.754545f);
        instancePath3.close();
        canvas.drawPath(instancePath3, instancePaint6);
        canvas.restore();
        canvas.save();
        Paint instancePaint7 = C24542c.instancePaint(paint2, looper);
        instancePaint7.setColor(-1);
        Path instancePath4 = C24542c.instancePath(looper);
        instancePath4.moveTo(50.0f, 42.836365f);
        instancePath4.lineTo(50.0f, 37.861816f);
        instancePath4.lineTo(70.0f, 37.861816f);
        instancePath4.lineTo(70.0f, 6.356364f);
        instancePath4.lineTo(38.333332f, 6.356364f);
        instancePath4.lineTo(38.333332f, 26.254545f);
        instancePath4.lineTo(33.333332f, 26.254545f);
        instancePath4.lineTo(33.333332f, 4.497647f);
        instancePath4.cubicTo(33.333332f, 2.761085f, 34.735474f, 1.3818182f, 36.465107f, 1.3818182f);
        instancePath4.lineTo(71.868225f, 1.3818182f);
        instancePath4.cubicTo(73.61368f, 1.3818182f, 75.0f, 2.776822f, 75.0f, 4.497647f);
        instancePath4.lineTo(75.0f, 39.720535f);
        instancePath4.cubicTo(75.0f, 41.457096f, 73.597855f, 42.836365f, 71.868225f, 42.836365f);
        instancePath4.lineTo(50.0f, 42.836365f);
        instancePath4.close();
        WeChatSVGRenderC2Java.setFillType(instancePath4, 1);
        canvas.drawPath(instancePath4, instancePaint7);
        canvas.restore();
        canvas.save();
        Paint instancePaint8 = C24542c.instancePaint(paint2, looper);
        instancePaint8.setColor(-1);
        Path instancePath5 = C24542c.instancePath(looper);
        instancePath5.moveTo(31.18659f, 60.8f);
        instancePath5.lineTo(29.49906f, 55.437435f);
        instancePath5.lineTo(21.721077f, 55.437435f);
        instancePath5.lineTo(20.033546f, 60.8f);
        instancePath5.lineTo(15.277778f, 60.8f);
        instancePath5.lineTo(22.963713f, 38.69091f);
        instancePath5.lineTo(28.409834f, 38.69091f);
        instancePath5.lineTo(36.11111f, 60.8f);
        instancePath5.lineTo(31.18659f, 60.8f);
        instancePath5.close();
        instancePath5.moveTo(25.556374f, 42.919674f);
        instancePath5.lineTo(22.718254f, 51.97475f);
        instancePath5.lineTo(28.501883f, 51.97475f);
        instancePath5.lineTo(25.663763f, 42.919674f);
        instancePath5.lineTo(25.556374f, 42.919674f);
        instancePath5.close();
        WeChatSVGRenderC2Java.setFillType(instancePath5, 2);
        canvas.drawPath(instancePath5, instancePaint8);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
