package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.sight_list_checkbox_selected_red */
public class sight_list_checkbox_selected_red extends C24542c {
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
                C24542c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
                canvas.save();
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-27648);
                float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 12.0f, 0.0f, 1.0f, 11.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(26.41996f, 1.7123995f);
                Path path = instancePath;
                path.cubicTo(42.029785f, -1.784037f, 59.069595f, 7.9460464f, 64.08954f, 23.090612f);
                path.cubicTo(69.899475f, 38.474934f, 61.969563f, 57.26578f, 46.91973f, 63.879044f);
                path.cubicTo(32.549892f, 71.01177f, 13.600102f, 65.46742f, 5.210196f, 51.84131f);
                path.cubicTo(-2.9097135f, 39.703682f, -1.3797306f, 22.281437f, 8.690157f, 11.712208f);
                path.cubicTo(13.340105f, 6.6174006f, 19.670034f, 3.110974f, 26.41996f, 1.7123995f);
                instancePath.lineTo(26.41996f, 1.7123995f);
                instancePath.close();
                instancePath.moveTo(12.0f, 32.0f);
                instancePath.lineTo(12.0f, 36.0f);
                instancePath.lineTo(54.0f, 36.0f);
                instancePath.lineTo(54.0f, 32.0f);
                instancePath.lineTo(12.0f, 32.0f);
                instancePath.lineTo(12.0f, 32.0f);
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
