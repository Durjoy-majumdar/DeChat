package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.app_brand_show_toast_success */
public class app_brand_show_toast_success extends C24542c {
    private final int height = 200;
    private final int width = 200;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 200;
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
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-1);
                canvas.save();
                float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 1.0f, 0.0f, 1.0f, 29.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(0.31970137f, 77.93319f);
                instancePath.cubicTo(-0.063724294f, 77.53636f, -0.108552635f, 76.85273f, 0.2193248f, 76.40659f);
                instancePath.lineTo(9.792403f, 63.380688f);
                instancePath.cubicTo(10.120393f, 62.934402f, 10.738718f, 62.842735f, 11.176576f, 63.17833f);
                instancePath.lineTo(61.002815f, 101.36729f);
                instancePath.cubicTo(62.317314f, 102.37477f, 64.42048f, 102.32714f, 65.687584f, 101.27154f);
                instancePath.lineTo(186.95796f, 0.24350294f);
                instancePath.cubicTo(187.37868f, -0.10698287f, 188.04178f, -0.07305191f, 188.42578f, 0.3061832f);
                instancePath.lineTo(197.7745f, 9.538964f);
                instancePath.cubicTo(198.16446f, 9.9240675f, 198.16162f, 10.550133f, 197.76987f, 10.935685f);
                instancePath.lineTo(64.80481f, 141.79317f);
                instancePath.cubicTo(64.01734f, 142.56815f, 62.75824f, 142.55399f, 61.988094f, 141.75691f);
                instancePath.lineTo(0.31970137f, 77.93319f);
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
