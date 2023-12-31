package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.translation_result_chinese_highlighted */
public class translation_result_chinese_highlighted extends C24542c {
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
        instancePaint4.setColor(-14494688);
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
        instancePaint5.setColor(-14494688);
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
        instancePaint6.setColor(-14494688);
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
        instancePaint7.setColor(-14494688);
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
        instancePaint8.setColor(-14494688);
        Path instancePath5 = C24542c.instancePath(looper);
        instancePath5.moveTo(29.208591f, 45.839653f);
        instancePath5.lineTo(21.85212f, 45.839653f);
        Path path = instancePath5;
        path.cubicTo(22.811659f, 48.09166f, 24.115648f, 50.098885f, 25.76409f, 51.836845f);
        path.cubicTo(27.2157f, 50.172318f, 28.37207f, 48.18957f, 29.208591f, 45.839653f);
        instancePath5.close();
        instancePath5.moveTo(36.95872f, 45.839653f);
        instancePath5.lineTo(33.24358f, 45.839653f);
        path.cubicTo(32.08721f, 49.168705f, 30.51258f, 51.934757f, 28.495087f, 54.211243f);
        path.cubicTo(30.955446f, 55.973682f, 33.93248f, 57.271034f, 37.5f, 58.05434f);
        path.cubicTo(36.68808f, 58.837646f, 35.630127f, 60.40426f, 35.08885f, 61.383392f);
        path.cubicTo(31.299896f, 60.40426f, 28.224447f, 58.886604f, 25.690279f, 56.854904f);
        path.cubicTo(23.008488f, 58.960037f, 19.760815f, 60.502174f, 15.873447f, 61.57922f);
        path.cubicTo(15.479791f, 60.72248f, 14.397233f, 59.057953f, 13.708332f, 58.22569f);
        path.cubicTo(17.472681f, 57.393425f, 20.54813f, 56.120552f, 23.03309f, 54.309155f);
        path.cubicTo(20.990993f, 51.959236f, 19.416365f, 49.14423f, 18.136978f, 45.839653f);
        instancePath5.lineTo(14.249611f, 45.839653f);
        instancePath5.lineTo(14.249611f, 42.36373f);
        instancePath5.lineTo(24.386288f, 42.36373f);
        path.cubicTo(24.140253f, 41.384598f, 23.697388f, 40.136204f, 23.22992f, 39.15707f);
        instancePath5.lineTo(27.068079f, 38.031067f);
        instancePath5.cubicTo(27.683168f, 39.181545f, 28.37207f, 40.723682f, 28.618105f, 41.75177f);
        instancePath5.lineTo(26.625216f, 42.36373f);
        instancePath5.lineTo(36.95872f, 42.36373f);
        instancePath5.lineTo(36.95872f, 45.839653f);
        instancePath5.close();
        WeChatSVGRenderC2Java.setFillType(instancePath5, 2);
        canvas.drawPath(instancePath5, instancePaint8);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
