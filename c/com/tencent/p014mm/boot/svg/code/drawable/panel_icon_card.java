package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.panel_icon_card */
public class panel_icon_card extends C24542c {
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
                float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 7.0f, 0.0f, 1.0f, 11.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray2);
                canvas.concat(instanceMatrix);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(75.89474f, 16.806137f);
                instancePath.lineTo(14.976727f, 8.670719f);
                instancePath.lineTo(73.35111f, 0.44189858f);
                instancePath.cubicTo(74.75592f, 0.24386846f, 75.89474f, 1.2097455f, 75.89474f, 2.635098f);
                instancePath.lineTo(75.89474f, 16.806137f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                canvas.save();
                Paint instancePaint5 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath2 = C24542c.instancePath(looper);
                instancePath2.moveTo(0.0f, 11.98748f);
                instancePath2.cubicTo(0.0f, 10.332561f, 1.3374251f, 9.169593f, 2.9742775f, 9.38819f);
                instancePath2.lineTo(75.47119f, 19.069935f);
                instancePath2.cubicTo(76.86781f, 19.25645f, 78.0f, 20.54868f, 78.0f, 21.960325f);
                instancePath2.lineTo(78.0f, 65.49449f);
                instancePath2.cubicTo(78.0f, 67.14941f, 76.662575f, 68.31238f, 75.02573f, 68.09378f);
                instancePath2.lineTo(2.5288117f, 58.412033f);
                instancePath2.cubicTo(1.1321876f, 58.225517f, 0.0f, 56.93329f, 0.0f, 55.52164f);
                instancePath2.lineTo(0.0f, 11.98748f);
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
