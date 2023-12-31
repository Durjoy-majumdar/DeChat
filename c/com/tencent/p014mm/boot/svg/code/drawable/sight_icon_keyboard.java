package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.sight_icon_keyboard */
public class sight_icon_keyboard extends C24542c {
    private final int height = 90;
    private final int width = 90;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 90;
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
        instancePaint3.setColor(-1);
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 16.0f, 0.0f, 1.0f, 30.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(1.7763568E-15f, 0.0f);
        instancePath.lineTo(6.0f, 0.0f);
        instancePath.cubicTo(5.9900165f, 2.0f, 5.9900165f, 4.0f, 6.0f, 6.0f);
        instancePath.lineTo(1.7763568E-15f, 6.0f);
        instancePath.lineTo(1.7763568E-15f, 0.0f);
        instancePath.lineTo(1.7763568E-15f, 0.0f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(10.0f, 0.0f);
        instancePath2.lineTo(16.0f, 0.0f);
        instancePath2.lineTo(16.0f, 6.0f);
        instancePath2.lineTo(10.0f, 6.0f);
        instancePath2.cubicTo(10.009983f, 4.0f, 10.009983f, 2.0f, 10.0f, 0.0f);
        instancePath2.lineTo(10.0f, 0.0f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.save();
        Paint instancePaint6 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath3 = C24542c.instancePath(looper);
        instancePath3.moveTo(21.0f, 0.0f);
        instancePath3.lineTo(27.0f, 0.0f);
        instancePath3.lineTo(27.0f, 6.0f);
        instancePath3.lineTo(21.0f, 6.0f);
        instancePath3.lineTo(21.0f, 0.0f);
        instancePath3.lineTo(21.0f, 0.0f);
        instancePath3.close();
        WeChatSVGRenderC2Java.setFillType(instancePath3, 2);
        canvas.drawPath(instancePath3, instancePaint6);
        canvas.restore();
        canvas.save();
        Paint instancePaint7 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath4 = C24542c.instancePath(looper);
        instancePath4.moveTo(31.0f, 0.0f);
        instancePath4.lineTo(37.0f, 0.0f);
        instancePath4.lineTo(37.0f, 6.0f);
        instancePath4.lineTo(31.0f, 6.0f);
        instancePath4.cubicTo(31.009983f, 4.0f, 31.009983f, 2.0f, 31.0f, 0.0f);
        instancePath4.lineTo(31.0f, 0.0f);
        instancePath4.close();
        WeChatSVGRenderC2Java.setFillType(instancePath4, 2);
        canvas.drawPath(instancePath4, instancePaint7);
        canvas.restore();
        canvas.save();
        Paint instancePaint8 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath5 = C24542c.instancePath(looper);
        instancePath5.moveTo(42.0f, 0.0f);
        instancePath5.lineTo(48.0f, 0.0f);
        instancePath5.cubicTo(47.990017f, 2.0f, 47.990017f, 4.0f, 48.0f, 6.0f);
        instancePath5.lineTo(42.0f, 6.0f);
        instancePath5.lineTo(42.0f, 0.0f);
        instancePath5.lineTo(42.0f, 0.0f);
        instancePath5.close();
        WeChatSVGRenderC2Java.setFillType(instancePath5, 2);
        canvas.drawPath(instancePath5, instancePaint8);
        canvas.restore();
        canvas.save();
        Paint instancePaint9 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath6 = C24542c.instancePath(looper);
        instancePath6.moveTo(52.0f, 0.0f);
        instancePath6.lineTo(58.0f, 0.0f);
        instancePath6.lineTo(58.0f, 6.0f);
        instancePath6.lineTo(52.0f, 6.0f);
        instancePath6.cubicTo(52.009983f, 4.0f, 52.009983f, 2.0f, 52.0f, 0.0f);
        instancePath6.lineTo(52.0f, 0.0f);
        instancePath6.close();
        WeChatSVGRenderC2Java.setFillType(instancePath6, 2);
        canvas.drawPath(instancePath6, instancePaint9);
        canvas.restore();
        canvas.save();
        Paint instancePaint10 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath7 = C24542c.instancePath(looper);
        instancePath7.moveTo(1.7763568E-15f, 12.0f);
        instancePath7.lineTo(6.0f, 12.0f);
        instancePath7.cubicTo(5.9900165f, 14.0f, 5.9900165f, 16.0f, 6.0f, 18.0f);
        instancePath7.lineTo(1.7763568E-15f, 18.0f);
        instancePath7.lineTo(1.7763568E-15f, 12.0f);
        instancePath7.lineTo(1.7763568E-15f, 12.0f);
        instancePath7.close();
        WeChatSVGRenderC2Java.setFillType(instancePath7, 2);
        canvas.drawPath(instancePath7, instancePaint10);
        canvas.restore();
        canvas.save();
        Paint instancePaint11 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath8 = C24542c.instancePath(looper);
        instancePath8.moveTo(10.0f, 12.0f);
        instancePath8.lineTo(16.0f, 12.0f);
        instancePath8.lineTo(16.0f, 18.0f);
        instancePath8.lineTo(10.0f, 18.0f);
        instancePath8.cubicTo(10.009983f, 16.0f, 10.009983f, 14.0f, 10.0f, 12.0f);
        instancePath8.lineTo(10.0f, 12.0f);
        instancePath8.close();
        WeChatSVGRenderC2Java.setFillType(instancePath8, 2);
        canvas.drawPath(instancePath8, instancePaint11);
        canvas.restore();
        canvas.save();
        Paint instancePaint12 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath9 = C24542c.instancePath(looper);
        instancePath9.moveTo(21.0f, 12.0f);
        instancePath9.lineTo(27.0f, 12.0f);
        instancePath9.lineTo(27.0f, 18.0f);
        instancePath9.lineTo(21.0f, 18.0f);
        instancePath9.lineTo(21.0f, 12.0f);
        instancePath9.lineTo(21.0f, 12.0f);
        instancePath9.close();
        WeChatSVGRenderC2Java.setFillType(instancePath9, 2);
        canvas.drawPath(instancePath9, instancePaint12);
        canvas.restore();
        canvas.save();
        Paint instancePaint13 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath10 = C24542c.instancePath(looper);
        instancePath10.moveTo(31.0f, 12.0f);
        instancePath10.lineTo(37.0f, 12.0f);
        instancePath10.lineTo(37.0f, 18.0f);
        instancePath10.lineTo(31.0f, 18.0f);
        instancePath10.lineTo(31.0f, 12.0f);
        instancePath10.lineTo(31.0f, 12.0f);
        instancePath10.close();
        WeChatSVGRenderC2Java.setFillType(instancePath10, 2);
        canvas.drawPath(instancePath10, instancePaint13);
        canvas.restore();
        canvas.save();
        Paint instancePaint14 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath11 = C24542c.instancePath(looper);
        instancePath11.moveTo(42.0f, 12.0f);
        instancePath11.lineTo(48.0f, 12.0f);
        instancePath11.lineTo(48.0f, 18.0f);
        instancePath11.lineTo(42.0f, 18.0f);
        instancePath11.lineTo(42.0f, 12.0f);
        instancePath11.lineTo(42.0f, 12.0f);
        instancePath11.close();
        WeChatSVGRenderC2Java.setFillType(instancePath11, 2);
        canvas.drawPath(instancePath11, instancePaint14);
        canvas.restore();
        canvas.save();
        Paint instancePaint15 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath12 = C24542c.instancePath(looper);
        instancePath12.moveTo(52.0f, 12.0f);
        instancePath12.lineTo(58.0f, 12.0f);
        instancePath12.lineTo(58.0f, 18.0f);
        instancePath12.lineTo(52.0f, 18.0f);
        Path path = instancePath12;
        instancePath12.cubicTo(52.009983f, 16.0f, 52.009983f, 14.0f, 52.0f, 12.0f);
        path.lineTo(52.0f, 12.0f);
        path.close();
        WeChatSVGRenderC2Java.setFillType(path, 2);
        canvas.drawPath(path, instancePaint15);
        canvas.restore();
        canvas.save();
        Paint instancePaint16 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath13 = C24542c.instancePath(looper);
        instancePath13.moveTo(10.0f, 24.0f);
        instancePath13.lineTo(48.0f, 24.0f);
        Path path2 = instancePath13;
        path2.cubicTo(47.989872f, 25.99852f, 47.989872f, 27.99704f, 48.0f, 30.0f);
        path2.cubicTo(35.329956f, 30.005552f, 22.670042f, 29.99556f, 10.0f, 30.0f);
        path2.cubicTo(10.010128f, 27.99704f, 10.010128f, 25.99852f, 10.0f, 24.0f);
        instancePath13.lineTo(10.0f, 24.0f);
        instancePath13.close();
        WeChatSVGRenderC2Java.setFillType(instancePath13, 2);
        canvas.drawPath(instancePath13, instancePaint16);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
