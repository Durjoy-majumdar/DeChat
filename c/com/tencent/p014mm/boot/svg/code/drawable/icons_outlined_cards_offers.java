package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_cards_offers */
public class icons_outlined_cards_offers extends C24542c {
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
            Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-16777216);
            canvas.save();
            float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 9.0f, 0.0f, 1.0f, 9.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(3.6f, 12.738222f);
            instancePath.lineTo(3.6f, 42.976162f);
            instancePath.lineTo(53.4f, 49.528793f);
            instancePath.lineTo(53.4f, 19.290854f);
            instancePath.lineTo(3.6f, 12.738222f);
            instancePath.close();
            instancePath.moveTo(0.0f, 11.568503f);
            instancePath.cubicTo(0.0f, 10.149958f, 1.1278667f, 8.843351f, 2.5321038f, 8.648319f);
            instancePath.lineTo(51.467896f, 1.8516811f);
            instancePath.cubicTo(52.866337f, 1.657453f, 54.0f, 2.6369855f, 54.0f, 4.0685034f);
            instancePath.lineTo(54.0f, 15.738771f);
            instancePath.lineTo(54.477234f, 15.801565f);
            instancePath.cubicTo(55.870518f, 15.984893f, 57.0f, 17.29693f, 57.0f, 18.711035f);
            instancePath.lineTo(57.0f, 50.628117f);
            instancePath.cubicTo(57.0f, 52.28795f, 55.647224f, 53.455513f, 54.015686f, 53.240837f);
            instancePath.lineTo(2.522766f, 46.46545f);
            instancePath.cubicTo(1.129481f, 46.282124f, 0.0f, 44.970085f, 0.0f, 43.55598f);
            instancePath.lineTo(0.0f, 11.638901f);
            instancePath.cubicTo(0.0f, 11.615377f, 2.7169473E-4f, 11.591954f, 8.120272E-4f, 11.568631f);
            instancePath.close();
            instancePath.moveTo(14.793063f, 10.579965f);
            instancePath.lineTo(50.4f, 15.265087f);
            instancePath.lineTo(50.4f, 5.6345563f);
            instancePath.lineTo(14.793063f, 10.579965f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
