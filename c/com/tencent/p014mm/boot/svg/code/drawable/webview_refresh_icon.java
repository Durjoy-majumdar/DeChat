package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.webview_refresh_icon */
public class webview_refresh_icon extends C24542c {
    private final int height = 480;
    private final int width = 480;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 480;
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
                instancePaint3.setColor(-2236963);
                float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 98.0f, 0.0f, 1.0f, 78.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(138.88869f, 0.0f);
                Path path = instancePath;
                path.cubicTo(166.80278f, 17.73124f, 194.74689f, 35.43248f, 222.65099f, 53.18372f);
                path.cubicTo(194.72688f, 69.47486f, 166.81279f, 85.796f, 138.88869f, 102.08714f);
                path.cubicTo(138.86868f, 86.73607f, 138.89868f, 71.384995f, 138.86868f, 56.03392f);
                path.cubicTo(110.20447f, 56.683964f, 81.89031f, 67.48472f, 60.167118f, 86.21603f);
                path.cubicTo(38.493935f, 104.63732f, 23.331707f, 130.59914f, 18.18095f, 158.58109f);
                path.cubicTo(12.960182f, 186.033f, 17.110792f, 215.22505f, 30.112703f, 239.98679f);
                path.cubicTo(43.114613f, 265.19855f, 64.907814f, 285.74f, 90.861626f, 297.1908f);
                path.cubicTo(113.865005f, 307.4815f, 140.00885f, 310.49173f, 164.78249f, 305.9414f);
                path.cubicTo(194.64687f, 300.601f, 222.26093f, 283.87985f, 240.95367f, 259.99817f);
                path.cubicTo(257.82614f, 238.84671f, 267.42755f, 212.05482f, 267.95764f, 185.01294f);
                path.cubicTo(273.30844f, 185.01294f, 278.6492f, 184.99294f, 284.0f, 185.03294f);
                path.cubicTo(283.45993f, 212.18484f, 274.92868f, 239.11673f, 259.64642f, 261.5783f);
                path.cubicTo(242.84395f, 286.43002f, 218.0003f, 305.78137f, 189.70615f, 315.79208f);
                path.cubicTo(160.39185f, 326.2828f, 127.58702f, 326.73285f, 98.00268f, 317.0522f);
                path.cubicTo(69.78853f, 307.96155f, 44.704845f, 289.63025f, 27.252283f, 265.69858f);
                path.cubicTo(10.199777f, 242.43695f, 0.4983519f, 213.85495f, 0.048285786f, 185.00294f);
                path.cubicTo(-0.86184794f, 151.04056f, 11.129913f, 116.96818f, 33.003128f, 90.98637f);
                path.cubicTo(58.796917f, 59.824184f, 98.39273f, 40.662846f, 138.87868f, 40.0328f);
                path.cubicTo(138.88869f, 26.691866f, 138.86868f, 13.350934f, 138.88869f, 0.0f);
                instancePath.lineTo(138.88869f, 0.0f);
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
