package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_move_pc_to_cellphone */
public class icons_outlined_move_pc_to_cellphone extends C24542c {
    private final int height = 80;
    private final int width = 168;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            return 168;
        }
        if (i2 == 1) {
            return 80;
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
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(0.0f, 0.0f);
        instancePath.lineTo(168.0f, 0.0f);
        instancePath.lineTo(168.0f, 80.0f);
        instancePath.lineTo(0.0f, 80.0f);
        instancePath.lineTo(0.0f, 0.0f);
        instancePath.close();
        canvas.save();
        Paint paint = instancePaint3;
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 8.0f, 0.0f, 1.0f, 12.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(paint, looper);
        instancePaint4.setColor(-16777216);
        instancePaint4.setStrokeWidth(1.2f);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(0.6f, 3.883483f);
        instancePath2.cubicTo(0.6f, 2.0700653f, 2.0700653f, 0.6f, 3.883483f, 0.6f);
        instancePath2.lineTo(66.116516f, 0.6f);
        instancePath2.cubicTo(67.92993f, 0.6f, 69.4f, 2.0700653f, 69.4f, 3.883483f);
        instancePath2.lineTo(69.4f, 44.116516f);
        instancePath2.cubicTo(69.4f, 45.929935f, 67.92993f, 47.399998f, 66.116516f, 47.399998f);
        instancePath2.lineTo(3.883483f, 47.399998f);
        instancePath2.cubicTo(2.0700653f, 47.399998f, 0.6f, 45.929935f, 0.6f, 44.116516f);
        instancePath2.lineTo(0.6f, 3.883483f);
        instancePath2.close();
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-16777216);
        Path instancePath3 = C24542c.instancePath(looper);
        instancePath3.moveTo(19.0f, 55.3f);
        instancePath3.cubicTo(19.0f, 55.134315f, 19.134314f, 55.0f, 19.3f, 55.0f);
        instancePath3.lineTo(50.7f, 55.0f);
        instancePath3.cubicTo(50.865685f, 55.0f, 51.0f, 55.134315f, 51.0f, 55.3f);
        instancePath3.lineTo(51.0f, 55.9f);
        instancePath3.cubicTo(51.0f, 56.065685f, 50.865685f, 56.2f, 50.7f, 56.2f);
        instancePath3.lineTo(19.3f, 56.2f);
        instancePath3.cubicTo(19.134314f, 56.2f, 19.0f, 56.065685f, 19.0f, 55.9f);
        instancePath3.lineTo(19.0f, 55.3f);
        instancePath3.close();
        canvas.drawPath(instancePath3, instancePaint5);
        canvas.restore();
        canvas.save();
        Paint instancePaint6 = C24542c.instancePaint(instancePaint, looper);
        instancePaint6.setColor(-16777216);
        float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 32.0f, 0.0f, 1.0f, 47.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint7 = C24542c.instancePaint(instancePaint6, looper);
        float[] matrixFloatArray3 = C24542c.setMatrixFloatArray(matrixFloatArray2, 6.123234E-17f, -1.0f, 5.2f, 1.0f, 6.123234E-17f, 3.9999998f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray3);
        canvas.concat(instanceMatrix);
        Path instancePath4 = C24542c.instancePath(looper);
        instancePath4.moveTo(-3.4f, 4.0f);
        instancePath4.lineTo(4.6f, 4.0f);
        instancePath4.lineTo(4.6f, 5.2f);
        instancePath4.lineTo(-3.4f, 5.2f);
        instancePath4.lineTo(-3.4f, 4.0f);
        instancePath4.close();
        canvas.drawPath(instancePath4, instancePaint7);
        canvas.restore();
        canvas.save();
        Paint instancePaint8 = C24542c.instancePaint(instancePaint6, looper);
        float[] matrixFloatArray4 = C24542c.setMatrixFloatArray(matrixFloatArray3, 6.123234E-17f, -1.0f, 9.8f, 1.0f, 6.123234E-17f, -1.8000002f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray4);
        canvas.concat(instanceMatrix);
        Path instancePath5 = C24542c.instancePath(looper);
        instancePath5.moveTo(1.8f, 3.4f);
        instancePath5.lineTo(9.8f, 3.4f);
        instancePath5.lineTo(9.8f, 4.6000004f);
        instancePath5.lineTo(1.8f, 4.6000004f);
        instancePath5.lineTo(1.8f, 3.4f);
        instancePath5.close();
        canvas.drawPath(instancePath5, instancePaint8);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        canvas.save();
        Paint instancePaint9 = C24542c.instancePaint(instancePaint, looper);
        instancePaint9.setColor(-436207616);
        float[] matrixFloatArray5 = C24542c.setMatrixFloatArray(matrixFloatArray4, 1.0f, 0.0f, 86.0f, 0.0f, 1.0f, 28.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray5);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray6 = C24542c.setMatrixFloatArray(matrixFloatArray5, -1.0f, 0.0f, 24.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray6);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray7 = C24542c.setMatrixFloatArray(matrixFloatArray6, 1.0f, 0.0f, 5.0f, 0.0f, 1.0f, 7.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray7);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint10 = C24542c.instancePaint(instancePaint9, looper);
        Path instancePath6 = C24542c.instancePath(looper);
        instancePath6.moveTo(4.2426405f, 0.7573593f);
        instancePath6.lineTo(5.303301f, 1.8180195f);
        instancePath6.lineTo(2.8711069f, 4.249359f);
        instancePath6.lineTo(8.0f, 4.25f);
        instancePath6.lineTo(8.0f, 5.75f);
        instancePath6.lineTo(2.8711069f, 5.749359f);
        instancePath6.lineTo(5.303301f, 8.18198f);
        instancePath6.lineTo(4.2426405f, 9.2426405f);
        instancePath6.lineTo(0.35355338f, 5.3535533f);
        instancePath6.cubicTo(0.15829125f, 5.1582913f, 0.15829125f, 4.8417087f, 0.35355338f, 4.6464467f);
        instancePath6.lineTo(1.0606601f, 3.9393399f);
        instancePath6.lineTo(1.0611068f, 3.9393594f);
        instancePath6.lineTo(4.2426405f, 0.7573593f);
        instancePath6.close();
        instancePath6.moveTo(11.0f, 4.25f);
        instancePath6.lineTo(11.0f, 5.75f);
        instancePath6.lineTo(9.5f, 5.75f);
        instancePath6.lineTo(9.5f, 4.25f);
        instancePath6.lineTo(11.0f, 4.25f);
        instancePath6.close();
        instancePath6.moveTo(14.0f, 4.25f);
        instancePath6.lineTo(14.0f, 5.75f);
        instancePath6.lineTo(12.5f, 5.75f);
        instancePath6.lineTo(12.5f, 4.25f);
        instancePath6.lineTo(14.0f, 4.25f);
        instancePath6.close();
        WeChatSVGRenderC2Java.setFillType(instancePath6, 2);
        canvas.drawPath(instancePath6, instancePaint10);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        canvas.restore();
        canvas.save();
        float[] matrixFloatArray8 = C24542c.setMatrixFloatArray(matrixFloatArray7, 1.0f, 0.0f, 118.0f, 0.0f, 1.0f, 11.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray8);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint11 = C24542c.instancePaint(paint, looper);
        instancePaint11.setColor(-16777216);
        instancePaint11.setStrokeWidth(1.2f);
        Path instancePath7 = C24542c.instancePath(looper);
        instancePath7.moveTo(0.6f, 3.975f);
        instancePath7.cubicTo(0.6f, 2.1110387f, 2.1110387f, 0.6f, 3.975f, 0.6f);
        instancePath7.lineTo(32.024998f, 0.6f);
        instancePath7.cubicTo(33.888958f, 0.6f, 35.399998f, 2.1110387f, 35.399998f, 3.975f);
        instancePath7.lineTo(35.399998f, 52.024998f);
        instancePath7.cubicTo(35.399998f, 53.888958f, 33.888958f, 55.399998f, 32.024998f, 55.399998f);
        instancePath7.lineTo(3.975f, 55.399998f);
        instancePath7.cubicTo(2.1110387f, 55.399998f, 0.6f, 53.888958f, 0.6f, 52.024998f);
        instancePath7.lineTo(0.6f, 3.975f);
        instancePath7.close();
        canvas.drawPath(instancePath7, instancePaint11);
        canvas.restore();
        canvas.save();
        Paint instancePaint12 = C24542c.instancePaint(instancePaint, looper);
        instancePaint12.setColor(-436207616);
        Path instancePath8 = C24542c.instancePath(looper);
        instancePath8.moveTo(13.0f, 51.0f);
        instancePath8.lineTo(23.0f, 51.0f);
        instancePath8.lineTo(23.0f, 52.2f);
        instancePath8.lineTo(13.0f, 52.2f);
        instancePath8.lineTo(13.0f, 51.0f);
        instancePath8.close();
        canvas.drawPath(instancePath8, instancePaint12);
        canvas.restore();
        canvas.restore();
        canvas.save();
        Paint instancePaint13 = C24542c.instancePaint(instancePaint, looper);
        instancePaint13.setColor(-15658735);
        Path instancePath9 = C24542c.instancePath(looper);
        instancePath9.moveTo(17.0f, 22.0f);
        instancePath9.lineTo(29.0f, 22.0f);
        instancePath9.lineTo(29.0f, 23.2f);
        instancePath9.lineTo(17.0f, 23.2f);
        instancePath9.lineTo(17.0f, 22.0f);
        instancePath9.close();
        canvas.drawPath(instancePath9, instancePaint13);
        canvas.restore();
        canvas.save();
        Paint instancePaint14 = C24542c.instancePaint(instancePaint, looper);
        instancePaint14.setColor(-15658735);
        Path instancePath10 = C24542c.instancePath(looper);
        instancePath10.moveTo(17.0f, 29.0f);
        instancePath10.lineTo(35.0f, 29.0f);
        instancePath10.lineTo(35.0f, 30.2f);
        instancePath10.lineTo(17.0f, 30.2f);
        instancePath10.lineTo(17.0f, 29.0f);
        instancePath10.close();
        canvas.drawPath(instancePath10, instancePaint14);
        canvas.restore();
        canvas.save();
        Paint instancePaint15 = C24542c.instancePaint(instancePaint, looper);
        instancePaint15.setColor(-15658735);
        Path instancePath11 = C24542c.instancePath(looper);
        instancePath11.moveTo(17.0f, 36.0f);
        instancePath11.lineTo(26.5f, 36.0f);
        instancePath11.lineTo(26.5f, 37.2f);
        instancePath11.lineTo(17.0f, 37.2f);
        instancePath11.lineTo(17.0f, 36.0f);
        instancePath11.close();
        canvas.drawPath(instancePath11, instancePaint15);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
