package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.file_float_ball_icon_pages */
public class file_float_ball_icon_pages extends C24542c {
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
        C24542c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
        canvas.save();
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-28160);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(0.0f, 0.0f);
        instancePath.lineTo(48.0f, 0.0f);
        instancePath.lineTo(48.0f, 48.0f);
        instancePath.lineTo(0.0f, 48.0f);
        instancePath.lineTo(0.0f, 0.0f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-1);
        Paint paint = instancePaint4;
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 14.0f, 0.0f, 1.0f, 14.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 0.892308f, 0.0f, 1.0f, 0.4f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(paint, looper);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(0.0f, 17.73077f);
        instancePath2.cubicTo(0.0f, 17.454628f, 0.22385761f, 17.23077f, 0.5f, 17.23077f);
        instancePath2.lineTo(18.207693f, 17.23077f);
        instancePath2.cubicTo(18.483835f, 17.23077f, 18.707693f, 17.454628f, 18.707693f, 17.73077f);
        instancePath2.lineTo(18.707693f, 17.73077f);
        instancePath2.cubicTo(18.707693f, 18.006912f, 18.483835f, 18.23077f, 18.207693f, 18.23077f);
        instancePath2.lineTo(0.5f, 18.23077f);
        instancePath2.cubicTo(0.22385761f, 18.23077f, 0.0f, 18.006912f, 0.0f, 17.73077f);
        instancePath2.lineTo(0.0f, 17.73077f);
        instancePath2.close();
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.save();
        Paint instancePaint6 = C24542c.instancePaint(paint, looper);
        float[] matrixFloatArray3 = C24542c.setMatrixFloatArray(matrixFloatArray2, 0.70710677f, -0.70710677f, 8.598819f, 0.70710677f, 0.70710677f, -3.5617476f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray3);
        canvas.concat(instanceMatrix);
        Path instancePath3 = C24542c.instancePath(looper);
        instancePath3.moveTo(9.703012f, 6.054795f);
        instancePath3.cubicTo(9.661864f, 8.2097f, 9.477281f, 11.611098f, 9.149263f, 16.258991f);
        instancePath3.lineTo(8.048376f, 16.258991f);
        instancePath3.cubicTo(7.720358f, 11.611098f, 7.5357747f, 8.2097f, 7.4946265f, 6.054795f);
        instancePath3.lineTo(9.703012f, 6.054795f);
        instancePath3.close();
        instancePath3.moveTo(9.711865f, 5.2044454f);
        instancePath3.lineTo(7.4857736f, 5.2044454f);
        Path path = instancePath3;
        path.cubicTo(7.4857736f, 3.151405f, 7.555957f, 0.86601716f, 7.6963243f, -1.6517187f);
        path.cubicTo(7.7212486f, -2.0988798f, 8.091116f, -2.4487016f, 8.538972f, -2.4487016f);
        instancePath3.lineTo(8.658668f, -2.4487014f);
        Path path2 = instancePath3;
        path2.cubicTo(9.10652f, -2.4487014f, 9.476385f, -2.0988822f, 9.501314f, -1.6517242f);
        path2.cubicTo(9.641682f, 0.86601377f, 9.711865f, 3.1514037f, 9.711865f, 5.2044454f);
        instancePath3.close();
        instancePath3.moveTo(9.088652f, 17.10934f);
        path2.cubicTo(9.068558f, 17.388567f, 9.047978f, 17.672018f, 9.026913f, 17.95969f);
        instancePath3.lineTo(8.765283f, 19.518766f);
        Path path3 = instancePath3;
        path3.cubicTo(8.749855f, 19.610703f, 8.662821f, 19.672724f, 8.570885f, 19.657297f);
        path3.cubicTo(8.499893f, 19.645384f, 8.444269f, 19.589758f, 8.432356f, 19.518766f);
        instancePath3.lineTo(8.170726f, 17.95969f);
        instancePath3.cubicTo(8.14966f, 17.672018f, 8.129081f, 17.388567f, 8.108988f, 17.10934f);
        instancePath3.lineTo(9.088652f, 17.10934f);
        instancePath3.close();
        WeChatSVGRenderC2Java.setFillType(instancePath3, 2);
        canvas.drawPath(instancePath3, instancePaint6);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
