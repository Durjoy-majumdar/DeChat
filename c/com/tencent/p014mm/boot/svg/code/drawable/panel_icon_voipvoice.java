package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.panel_icon_voipvoice */
public class panel_icon_voipvoice extends C24542c {
    private final int height = 192;
    private final int width = 192;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 192;
        if (!(i2 == 0 || i2 == 1)) {
            i3 = 0;
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
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-13421773);
                float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 48.0f, 0.0f, 1.0f, 48.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 9.0f, 0.0f, 1.0f, 15.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray2);
                canvas.concat(instanceMatrix);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(28.1486f, 43.8514f);
                Path path = instancePath;
                path.cubicTo(35.63314f, 51.33594f, 42.724827f, 54.84645f, 45.347363f, 54.640877f);
                path.cubicTo(47.9699f, 54.435303f, 54.500744f, 49.944027f, 57.583836f, 50.003807f);
                path.cubicTo(59.065594f, 50.03254f, 68.74844f, 56.581047f, 69.92055f, 57.33816f);
                path.cubicTo(71.09266f, 58.095276f, 72.17947f, 58.979683f, 71.975105f, 60.09881f);
                path.cubicTo(71.77075f, 61.217937f, 67.51525f, 73.545105f, 56.65097f, 71.83807f);
                path.cubicTo(45.786686f, 70.13104f, 30.640358f, 58.419163f, 22.009607f, 49.99039f);
                instancePath.lineTo(28.1486f, 43.8514f);
                instancePath.lineTo(28.1486f, 43.8514f);
                instancePath.close();
                instancePath.moveTo(28.1486f, 43.8514f);
                path.cubicTo(20.66406f, 36.36686f, 17.15355f, 29.275175f, 17.359123f, 26.65264f);
                path.cubicTo(17.564697f, 24.030104f, 22.055973f, 17.499258f, 21.996193f, 14.416165f);
                path.cubicTo(21.967463f, 12.934404f, 15.418953f, 3.2515578f, 14.661838f, 2.079449f);
                path.cubicTo(13.904722f, 0.9073399f, 13.020318f, -0.17946438f, 11.901191f, 0.024891442f);
                path.cubicTo(10.782063f, 0.22924727f, -1.5451031f, 4.484747f, 0.16192652f, 15.34903f);
                path.cubicTo(1.8689562f, 26.213312f, 13.580837f, 41.359642f, 22.009607f, 49.99039f);
                instancePath.lineTo(28.1486f, 43.8514f);
                instancePath.lineTo(28.1486f, 43.8514f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                canvas.restore();
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i3;
    }
}
