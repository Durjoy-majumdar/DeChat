package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.sight_list_checkbox_unselected */
public class sight_list_checkbox_unselected extends C24542c {
    private final int height = 90;
    private final int width = 90;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 90;
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
                Paint instancePaint3 = C24542c.instancePaint(instancePaint2, looper);
                instancePaint3.setStrokeWidth(1.0f);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                instancePaint4.setStrokeWidth(3.0f);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(45.0f, 11.0f);
                Path path = instancePath;
                path.cubicTo(63.225395f, 11.0f, 78.0f, 25.774603f, 78.0f, 44.0f);
                path.cubicTo(78.0f, 62.225395f, 63.225395f, 77.0f, 45.0f, 77.0f);
                path.cubicTo(26.774603f, 77.0f, 12.0f, 62.225395f, 12.0f, 44.0f);
                path.cubicTo(12.0f, 25.774603f, 26.774603f, 11.0f, 45.0f, 11.0f);
                instancePath.close();
                Paint instancePaint5 = C24542c.instancePaint(looper);
                instancePaint5.setFlags(385);
                instancePaint5.setStyle(Paint.Style.FILL);
                Paint instancePaint6 = C24542c.instancePaint(looper);
                instancePaint6.setFlags(385);
                instancePaint6.setStyle(Paint.Style.STROKE);
                instancePaint5.setColor(-16777216);
                instancePaint6.setStrokeWidth(1.0f);
                instancePaint6.setStrokeCap(Paint.Cap.BUTT);
                instancePaint6.setStrokeJoin(Paint.Join.MITER);
                instancePaint6.setStrokeMiter(4.0f);
                instancePaint6.setPathEffect((PathEffect) null);
                float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 66.0f, 0.0f, 12.0f, 0.0f, 66.0f, 11.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                WeChatSVGRenderC2Java.setLinearGradient(instancePaint4, 0.5f, 0.0f, 0.5f, 1.0f, new int[]{-11019676, -5439996}, new float[]{0.0f, 1.0f}, instanceMatrix, 0);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i3;
    }
}
