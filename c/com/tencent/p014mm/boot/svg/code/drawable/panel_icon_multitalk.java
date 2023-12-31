package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.panel_icon_multitalk */
public class panel_icon_multitalk extends C24542c {
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
                float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 9.0f, 0.0f, 1.0f, 12.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray2);
                canvas.concat(instanceMatrix);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(28.1486f, 46.8514f);
                Path path = instancePath;
                path.cubicTo(35.63314f, 54.33594f, 42.724827f, 57.84645f, 45.347363f, 57.640877f);
                path.cubicTo(47.9699f, 57.435303f, 54.500744f, 52.944027f, 57.583836f, 53.003807f);
                path.cubicTo(59.065594f, 53.03254f, 68.74844f, 59.581047f, 69.92055f, 60.33816f);
                path.cubicTo(71.09266f, 61.095276f, 72.17947f, 61.979683f, 71.975105f, 63.09881f);
                path.cubicTo(71.77075f, 64.21793f, 67.51525f, 76.545105f, 56.65097f, 74.83807f);
                path.cubicTo(45.786686f, 73.13104f, 30.640358f, 61.419163f, 22.009607f, 52.99039f);
                instancePath.lineTo(28.1486f, 46.8514f);
                instancePath.lineTo(28.1486f, 46.8514f);
                instancePath.close();
                instancePath.moveTo(28.1486f, 46.8514f);
                path.cubicTo(20.66406f, 39.36686f, 17.15355f, 32.275173f, 17.359123f, 29.65264f);
                path.cubicTo(17.564697f, 27.030104f, 22.055973f, 20.499258f, 21.996193f, 17.416164f);
                path.cubicTo(21.967463f, 15.934404f, 15.418953f, 6.251558f, 14.661838f, 5.0794487f);
                path.cubicTo(13.904722f, 3.9073398f, 13.020318f, 2.8205357f, 11.901191f, 3.0248914f);
                path.cubicTo(10.782063f, 3.2292473f, -1.5451031f, 7.484747f, 0.16192652f, 18.34903f);
                path.cubicTo(1.8689562f, 29.213312f, 13.580837f, 44.359642f, 22.009607f, 52.99039f);
                instancePath.lineTo(28.1486f, 46.8514f);
                instancePath.lineTo(28.1486f, 46.8514f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                canvas.save();
                Paint instancePaint5 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath2 = C24542c.instancePath(looper);
                instancePath2.moveTo(36.0f, 2.5528953f);
                instancePath2.cubicTo(36.0f, 1.9161688f, 36.537994f, 1.4f, 37.198494f, 1.4f);
                instancePath2.lineTo(60.001503f, 1.4f);
                instancePath2.cubicTo(60.663414f, 1.4f, 61.2f, 1.9141779f, 61.2f, 2.5528953f);
                instancePath2.lineTo(61.2f, 19.847105f);
                instancePath2.cubicTo(61.2f, 20.483831f, 60.662003f, 21.0f, 60.001503f, 21.0f);
                instancePath2.lineTo(37.198494f, 21.0f);
                instancePath2.cubicTo(36.536583f, 21.0f, 36.0f, 20.485823f, 36.0f, 19.847105f);
                instancePath2.lineTo(36.0f, 2.5528953f);
                instancePath2.close();
                instancePath2.moveTo(71.9625f, 22.315844f);
                instancePath2.cubicTo(71.603096f, 21.929012f, 67.161896f, 17.713648f, 64.0f, 14.820552f);
                instancePath2.lineTo(64.0f, 7.4903607f);
                Path path2 = instancePath2;
                path2.cubicTo(67.086624f, 4.6363034f, 71.430885f, 0.5419411f, 71.9625f, 0.07080274f);
                path2.cubicTo(72.85872f, -0.1871373f, 73.8f, 0.26488438f, 73.8f, 1.3419479f);
                instancePath2.lineTo(73.8f, 21.044699f);
                instancePath2.cubicTo(73.8f, 22.006937f, 72.94881f, 22.635838f, 71.9625f, 22.315844f);
                instancePath2.close();
                WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint5);
                canvas.restore();
                canvas.restore();
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i3;
    }
}
