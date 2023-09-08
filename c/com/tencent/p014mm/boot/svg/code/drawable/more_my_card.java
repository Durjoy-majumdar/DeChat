package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.more_my_card */
public class more_my_card extends C24542c {
    private final int height = 72;
    private final int width = 72;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 72;
        }
        if (i2 == 2) {
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
            float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 9.0f, 0.0f, 1.0f, 10.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            canvas.save();
            Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-16726153);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(54.0f, 3.0685034f);
            instancePath.cubicTo(54.0f, 1.6369854f, 52.866337f, 0.657453f, 51.467896f, 0.85168105f);
            instancePath.lineTo(2.5321038f, 7.648319f);
            instancePath.cubicTo(1.1278667f, 7.843352f, 0.0f, 9.149959f, 0.0f, 10.568503f);
            instancePath.lineTo(3.6f, 11.134557f);
            instancePath.lineTo(50.4f, 4.6345563f);
            instancePath.lineTo(50.4f, 14.487597f);
            instancePath.lineTo(54.0f, 14.961282f);
            instancePath.lineTo(54.0f, 3.0685034f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
            instancePaint4.setColor(-15365900);
            Path instancePath2 = C24542c.instancePath(looper);
            instancePath2.moveTo(3.6f, 11.738222f);
            instancePath2.lineTo(3.6f, 41.976162f);
            instancePath2.lineTo(53.4f, 48.528793f);
            instancePath2.lineTo(53.4f, 18.290854f);
            instancePath2.lineTo(3.6f, 11.738222f);
            instancePath2.close();
            instancePath2.moveTo(0.0f, 10.638901f);
            instancePath2.cubicTo(0.0f, 8.979069f, 1.3527762f, 7.8115053f, 2.9843135f, 8.026181f);
            instancePath2.lineTo(54.477234f, 14.801565f);
            instancePath2.cubicTo(55.870518f, 14.984893f, 57.0f, 16.29693f, 57.0f, 17.711035f);
            instancePath2.lineTo(57.0f, 49.628117f);
            instancePath2.cubicTo(57.0f, 51.28795f, 55.647224f, 52.455513f, 54.015686f, 52.240837f);
            instancePath2.lineTo(2.522766f, 45.46545f);
            instancePath2.cubicTo(1.129481f, 45.282124f, 0.0f, 43.970085f, 0.0f, 42.55598f);
            instancePath2.lineTo(0.0f, 10.638901f);
            instancePath2.close();
            WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
            canvas.drawPath(instancePath2, instancePaint4);
            canvas.restore();
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
