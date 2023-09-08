package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.radar_search_hi */
public class radar_search_hi extends C24542c {
    private final int height = 48;
    private final int width = 48;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 48;
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
                float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 5.0f, 0.0f, 1.0f, 8.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(0.0f, 0.0f);
                instancePath.lineTo(6.0f, 0.0f);
                instancePath.lineTo(6.0f, 13.0f);
                instancePath.lineTo(19.0f, 13.0f);
                instancePath.lineTo(19.0f, 0.0f);
                instancePath.lineTo(25.0f, 0.0f);
                instancePath.lineTo(25.0f, 32.0f);
                instancePath.lineTo(19.0f, 32.0f);
                instancePath.lineTo(19.0f, 18.0f);
                Path path = instancePath;
                path.cubicTo(14.64f, 17.98f, 10.29f, 18.1f, 5.94f, 18.07f);
                path.cubicTo(5.95f, 22.71f, 6.03f, 27.36f, 6.0f, 32.0f);
                instancePath.lineTo(0.0f, 32.0f);
                instancePath.lineTo(0.0f, 0.0f);
                instancePath.lineTo(0.0f, 0.0f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                canvas.save();
                Paint instancePaint5 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath2 = C24542c.instancePath(looper);
                instancePath2.moveTo(31.0f, 0.0f);
                instancePath2.lineTo(37.0f, 0.0f);
                instancePath2.lineTo(37.0f, 5.0f);
                instancePath2.lineTo(31.0f, 5.0f);
                instancePath2.lineTo(31.0f, 0.0f);
                instancePath2.lineTo(31.0f, 0.0f);
                instancePath2.close();
                WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint5);
                canvas.restore();
                canvas.save();
                Paint instancePaint6 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath3 = C24542c.instancePath(looper);
                instancePath3.moveTo(31.0f, 9.0f);
                instancePath3.lineTo(37.0f, 9.0f);
                instancePath3.lineTo(37.0f, 32.0f);
                instancePath3.lineTo(31.0f, 32.0f);
                instancePath3.lineTo(31.0f, 9.0f);
                instancePath3.lineTo(31.0f, 9.0f);
                instancePath3.close();
                WeChatSVGRenderC2Java.setFillType(instancePath3, 2);
                canvas.drawPath(instancePath3, instancePaint6);
                canvas.restore();
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i3;
    }
}
