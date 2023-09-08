package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.editor_split_unpress */
public class editor_split_unpress extends C24542c {
    private final int height = 144;
    private final int width = 144;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 144;
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
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-855638017);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(0.0f, 28.8f);
        instancePath.cubicTo(0.0f, 12.894198f, 12.894198f, 0.0f, 28.8f, 0.0f);
        instancePath.lineTo(115.2f, 0.0f);
        instancePath.cubicTo(131.1058f, 0.0f, 144.0f, 12.894198f, 144.0f, 28.8f);
        instancePath.lineTo(144.0f, 115.2f);
        instancePath.cubicTo(144.0f, 131.1058f, 131.1058f, 144.0f, 115.2f, 144.0f);
        instancePath.lineTo(28.8f, 144.0f);
        instancePath.cubicTo(12.894198f, 144.0f, 0.0f, 131.1058f, 0.0f, 115.2f);
        instancePath.lineTo(0.0f, 28.8f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-16777216);
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 39.0f, 0.0f, 1.0f, 48.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint6 = C24542c.instancePaint(instancePaint5, looper);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(3.1316513E-15f, 25.08f);
        instancePath2.lineTo(-3.1316513E-15f, 21.72f);
        instancePath2.lineTo(64.8f, 21.72f);
        instancePath2.lineTo(64.8f, 25.08f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint6);
        canvas.restore();
        canvas.save();
        Paint instancePaint7 = C24542c.instancePaint(instancePaint5, looper);
        Path instancePath3 = C24542c.instancePath(looper);
        instancePath3.moveTo(-3.0222737E-15f, 4.08f);
        instancePath3.lineTo(-3.0222737E-15f, 0.72f);
        instancePath3.lineTo(3.456f, 0.72f);
        instancePath3.lineTo(3.456f, 4.08f);
        instancePath3.lineTo(-3.0222737E-15f, 4.08f);
        instancePath3.close();
        instancePath3.moveTo(6.912f, 4.08f);
        instancePath3.lineTo(6.912f, 0.72f);
        instancePath3.lineTo(10.368f, 0.72f);
        instancePath3.lineTo(10.368f, 4.08f);
        instancePath3.lineTo(6.912f, 4.08f);
        instancePath3.close();
        instancePath3.moveTo(13.824f, 4.08f);
        instancePath3.lineTo(13.824f, 0.72f);
        instancePath3.lineTo(17.28f, 0.72f);
        instancePath3.lineTo(17.28f, 4.08f);
        instancePath3.lineTo(13.824f, 4.08f);
        instancePath3.close();
        instancePath3.moveTo(20.736f, 4.08f);
        instancePath3.lineTo(20.736f, 0.72f);
        instancePath3.lineTo(24.192001f, 0.72f);
        instancePath3.lineTo(24.192001f, 4.08f);
        instancePath3.lineTo(20.736f, 4.08f);
        instancePath3.close();
        instancePath3.moveTo(27.648f, 4.08f);
        instancePath3.lineTo(27.648f, 0.72f);
        instancePath3.lineTo(31.104f, 0.72f);
        instancePath3.lineTo(31.104f, 4.08f);
        instancePath3.lineTo(27.648f, 4.08f);
        instancePath3.close();
        instancePath3.moveTo(34.56f, 4.08f);
        instancePath3.lineTo(34.56f, 0.72f);
        instancePath3.lineTo(38.016003f, 0.72f);
        instancePath3.lineTo(38.016003f, 4.08f);
        instancePath3.lineTo(34.56f, 4.08f);
        instancePath3.close();
        instancePath3.moveTo(41.472f, 4.08f);
        instancePath3.lineTo(41.472f, 0.72f);
        instancePath3.lineTo(44.928f, 0.72f);
        instancePath3.lineTo(44.928f, 4.08f);
        instancePath3.lineTo(41.472f, 4.08f);
        instancePath3.close();
        instancePath3.moveTo(48.384003f, 4.08f);
        instancePath3.lineTo(48.384003f, 0.72f);
        instancePath3.lineTo(51.84f, 0.72f);
        instancePath3.lineTo(51.84f, 4.08f);
        instancePath3.lineTo(48.384003f, 4.08f);
        instancePath3.close();
        instancePath3.moveTo(55.296f, 4.08f);
        instancePath3.lineTo(55.296f, 0.72f);
        instancePath3.lineTo(58.752003f, 0.72f);
        instancePath3.lineTo(58.752003f, 4.08f);
        instancePath3.lineTo(55.296f, 4.08f);
        instancePath3.close();
        instancePath3.moveTo(62.208f, 4.08f);
        instancePath3.lineTo(62.208f, 0.72f);
        instancePath3.lineTo(65.664f, 0.72f);
        instancePath3.lineTo(65.664f, 4.08f);
        instancePath3.lineTo(62.208f, 4.08f);
        instancePath3.close();
        WeChatSVGRenderC2Java.setFillType(instancePath3, 1);
        canvas.drawPath(instancePath3, instancePaint7);
        canvas.restore();
        canvas.save();
        Paint instancePaint8 = C24542c.instancePaint(instancePaint5, looper);
        Path instancePath4 = C24542c.instancePath(looper);
        instancePath4.moveTo(-3.4540271E-15f, 46.08f);
        instancePath4.lineTo(-3.4540271E-15f, 42.72f);
        instancePath4.lineTo(3.456f, 42.72f);
        instancePath4.lineTo(3.456f, 46.08f);
        instancePath4.lineTo(-3.4540271E-15f, 46.08f);
        instancePath4.close();
        instancePath4.moveTo(6.912f, 46.08f);
        instancePath4.lineTo(6.912f, 42.72f);
        instancePath4.lineTo(10.368f, 42.72f);
        instancePath4.lineTo(10.368f, 46.08f);
        instancePath4.lineTo(6.912f, 46.08f);
        instancePath4.close();
        instancePath4.moveTo(13.824f, 46.08f);
        instancePath4.lineTo(13.824f, 42.72f);
        instancePath4.lineTo(17.28f, 42.72f);
        instancePath4.lineTo(17.28f, 46.08f);
        instancePath4.lineTo(13.824f, 46.08f);
        instancePath4.close();
        instancePath4.moveTo(20.736f, 46.08f);
        instancePath4.lineTo(20.736f, 42.72f);
        instancePath4.lineTo(24.192001f, 42.72f);
        instancePath4.lineTo(24.192001f, 46.08f);
        instancePath4.lineTo(20.736f, 46.08f);
        instancePath4.close();
        instancePath4.moveTo(27.648f, 46.08f);
        instancePath4.lineTo(27.648f, 42.72f);
        instancePath4.lineTo(31.104f, 42.72f);
        instancePath4.lineTo(31.104f, 46.08f);
        instancePath4.lineTo(27.648f, 46.08f);
        instancePath4.close();
        instancePath4.moveTo(34.56f, 46.08f);
        instancePath4.lineTo(34.56f, 42.72f);
        instancePath4.lineTo(38.016003f, 42.72f);
        instancePath4.lineTo(38.016003f, 46.08f);
        instancePath4.lineTo(34.56f, 46.08f);
        instancePath4.close();
        instancePath4.moveTo(41.472f, 46.08f);
        instancePath4.lineTo(41.472f, 42.72f);
        instancePath4.lineTo(44.928f, 42.72f);
        instancePath4.lineTo(44.928f, 46.08f);
        instancePath4.lineTo(41.472f, 46.08f);
        instancePath4.close();
        instancePath4.moveTo(48.384003f, 46.08f);
        instancePath4.lineTo(48.384003f, 42.72f);
        instancePath4.lineTo(51.84f, 42.72f);
        instancePath4.lineTo(51.84f, 46.08f);
        instancePath4.lineTo(48.384003f, 46.08f);
        instancePath4.close();
        instancePath4.moveTo(55.296f, 46.08f);
        instancePath4.lineTo(55.296f, 42.72f);
        instancePath4.lineTo(58.752003f, 42.72f);
        instancePath4.lineTo(58.752003f, 46.08f);
        instancePath4.lineTo(55.296f, 46.08f);
        instancePath4.close();
        instancePath4.moveTo(62.208f, 46.08f);
        instancePath4.lineTo(62.208f, 42.72f);
        instancePath4.lineTo(65.664f, 42.72f);
        instancePath4.lineTo(65.664f, 46.08f);
        instancePath4.lineTo(62.208f, 46.08f);
        instancePath4.close();
        WeChatSVGRenderC2Java.setFillType(instancePath4, 1);
        canvas.drawPath(instancePath4, instancePaint8);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
