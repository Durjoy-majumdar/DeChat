package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_done3 */
public class icons_outlined_done3 extends C24542c {
    private final int height = 80;
    private final int width = 80;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 80;
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
                instancePaint3.setColor(14211288);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(0.0f, 0.0f);
                instancePath.lineTo(80.0f, 0.0f);
                instancePath.lineTo(80.0f, 80.0f);
                instancePath.lineTo(0.0f, 80.0f);
                instancePath.lineTo(0.0f, 0.0f);
                instancePath.close();
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
                instancePaint4.setColor(-16268960);
                float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 11.0f, 0.0f, 1.0f, 11.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                Paint instancePaint5 = C24542c.instancePaint(instancePaint4, looper);
                Path instancePath2 = C24542c.instancePath(looper);
                instancePath2.moveTo(29.0f, 4.8333335f);
                Path path = instancePath2;
                path.cubicTo(42.34688f, 4.8333335f, 53.166668f, 15.653118f, 53.166668f, 29.0f);
                path.cubicTo(53.166668f, 42.34688f, 42.34688f, 53.166668f, 29.0f, 53.166668f);
                path.cubicTo(15.653118f, 53.166668f, 4.8333335f, 42.34688f, 4.8333335f, 29.0f);
                path.cubicTo(4.8333335f, 15.653118f, 15.653118f, 4.8333335f, 29.0f, 4.8333335f);
                instancePath2.close();
                instancePath2.moveTo(29.0f, 7.733333f);
                Path path2 = instancePath2;
                path2.cubicTo(17.254744f, 7.733333f, 7.733333f, 17.254744f, 7.733333f, 29.0f);
                path2.cubicTo(7.733333f, 40.745255f, 17.254744f, 50.266666f, 29.0f, 50.266666f);
                path2.cubicTo(40.745255f, 50.266666f, 50.266666f, 40.745255f, 50.266666f, 29.0f);
                path2.cubicTo(50.266666f, 17.254744f, 40.745255f, 7.733333f, 29.0f, 7.733333f);
                instancePath2.close();
                instancePath2.moveTo(40.205486f, 21.145834f);
                instancePath2.lineTo(42.256096f, 23.196444f);
                instancePath2.lineTo(27.87754f, 37.575f);
                instancePath2.cubicTo(26.933773f, 38.51877f, 25.403625f, 38.51877f, 24.459858f, 37.575f);
                instancePath2.lineTo(16.916666f, 30.031809f);
                instancePath2.lineTo(18.967276f, 27.9812f);
                instancePath2.lineTo(26.1687f, 35.18262f);
                instancePath2.lineTo(40.205486f, 21.145834f);
                instancePath2.close();
                WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint5);
                canvas.restore();
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i3;
    }
}
