package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.ofm_nearby_icon */
public class ofm_nearby_icon extends C24542c {
    private final int height = 96;
    private final int width = 96;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 96;
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
                instancePaint3.setColor(-1);
                float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 15.0f, 0.0f, 1.0f, 22.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(11.0f, 11.0f);
                Path path = instancePath;
                path.cubicTo(9.951573f, 6.6049995f, 12.71513f, 1.5564079f, 17.0f, 0.0f);
                path.cubicTo(21.716715f, -1.1690271f, 27.1437f, 2.21011f, 28.0f, 7.0f);
                path.cubicTo(28.655645f, 10.929491f, 26.342669f, 14.70085f, 23.0f, 17.0f);
                path.cubicTo(22.998363f, 17.164803f, 22.988352f, 18.482265f, 23.0f, 19.0f);
                path.cubicTo(29.656933f, 19.135967f, 36.345543f, 19.135967f, 43.0f, 19.0f);
                path.cubicTo(43.014122f, 18.341467f, 42.9941f, 16.762526f, 43.0f, 16.0f);
                path.cubicTo(38.368145f, 12.920768f, 37.58714f, 5.5791903f, 42.0f, 2.0f);
                path.cubicTo(46.198223f, -1.7623875f, 53.61777f, 0.14843407f, 55.0f, 5.0f);
                path.cubicTo(57.172344f, 9.672371f, 54.939472f, 14.49971f, 51.0f, 17.0f);
                path.cubicTo(51.034447f, 17.154747f, 51.024433f, 18.472208f, 51.0f, 19.0f);
                path.cubicTo(55.329975f, 19.246593f, 59.665554f, 18.8946f, 64.0f, 19.0f);
                path.cubicTo(66.66456f, 20.041092f, 66.674576f, 24.21473f, 64.0f, 25.0f);
                path.cubicTo(59.68558f, 25.411507f, 55.329975f, 25.059513f, 51.0f, 25.0f);
                path.cubicTo(51.104538f, 26.909994f, 50.694008f, 28.840929f, 52.0f, 30.0f);
                path.cubicTo(55.269897f, 36.816093f, 59.144882f, 43.07152f, 63.0f, 50.0f);
                path.cubicTo(64.07122f, 52.49489f, 59.635513f, 55.491863f, 58.0f, 53.0f);
                path.cubicTo(53.777977f, 47.154644f, 50.623917f, 40.979675f, 47.0f, 35.0f);
                path.cubicTo(43.875233f, 40.617626f, 40.731186f, 46.229404f, 38.0f, 52.0f);
                path.cubicTo(36.195347f, 54.536453f, 31.709576f, 54.566624f, 30.0f, 53.0f);
                path.cubicTo(26.062307f, 46.97362f, 22.888222f, 40.909275f, 19.0f, 35.0f);
                path.cubicTo(15.989344f, 40.879105f, 12.835284f, 46.90322f, 9.0f, 53.0f);
                path.cubicTo(7.3382096f, 55.75334f, 2.1615477f, 52.52506f, 4.0f, 49.0f);
                path.cubicTo(7.588532f, 42.7497f, 11.543622f, 36.273018f, 15.0f, 30.0f);
                path.cubicTo(16.159563f, 28.348139f, 15.919253f, 26.68874f, 16.0f, 25.0f);
                path.cubicTo(11.383416f, 25.059513f, 6.677359f, 25.411507f, 2.0f, 25.0f);
                path.cubicTo(-0.6520735f, 24.275072f, -0.692125f, 20.010921f, 2.0f, 19.0f);
                path.cubicTo(6.6473207f, 18.824202f, 11.333351f, 19.276764f, 16.0f, 19.0f);
                path.cubicTo(15.979331f, 18.482265f, 15.969317f, 17.164803f, 16.0f, 17.0f);
                path.cubicTo(13.89665f, 15.19364f, 11.924111f, 13.433673f, 11.0f, 11.0f);
                instancePath.lineTo(11.0f, 11.0f);
                instancePath.close();
                instancePath.moveTo(23.0f, 25.0f);
                path.cubicTo(23.14918f, 26.464657f, 22.83093f, 28.077757f, 24.0f, 29.0f);
                path.cubicTo(26.858776f, 34.93591f, 30.081055f, 40.458057f, 33.0f, 46.0f);
                path.cubicTo(36.276978f, 40.774742f, 39.32024f, 35.569275f, 42.0f, 30.0f);
                path.cubicTo(43.31825f, 28.74081f, 42.860767f, 26.771442f, 43.0f, 25.0f);
                instancePath.lineTo(23.0f, 25.0f);
                instancePath.lineTo(23.0f, 25.0f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i3;
    }
}
