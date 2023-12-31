package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.voice_password_icon_normal */
public class voice_password_icon_normal extends C24542c {
    private final int height = 240;
    private final int width = 240;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 240;
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
                float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -4094.0f, 0.0f, 1.0f, -5370.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 4094.0f, 0.0f, 1.0f, 5370.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray2);
                canvas.concat(instanceMatrix);
                canvas.save();
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-16268960);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(120.0f, 0.0f);
                Path path = instancePath;
                path.cubicTo(186.27417f, 0.0f, 240.0f, 53.72583f, 240.0f, 120.0f);
                path.cubicTo(240.0f, 186.27417f, 186.27417f, 240.0f, 120.0f, 240.0f);
                path.cubicTo(53.72583f, 240.0f, 0.0f, 186.27417f, 0.0f, 120.0f);
                path.cubicTo(0.0f, 53.72583f, 53.72583f, 0.0f, 120.0f, 0.0f);
                instancePath.close();
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
                instancePaint4.setColor(-1);
                Path instancePath2 = C24542c.instancePath(looper);
                instancePath2.moveTo(87.27273f, 109.09091f);
                instancePath2.lineTo(87.27273f, 121.55844f);
                Path path2 = instancePath2;
                path2.cubicTo(87.27273f, 140.49391f, 102.62296f, 155.84416f, 121.55844f, 155.84416f);
                path2.cubicTo(140.49391f, 155.84416f, 155.84416f, 140.49391f, 155.84416f, 121.55844f);
                instancePath2.lineTo(155.84416f, 109.09091f);
                instancePath2.lineTo(165.19481f, 109.09091f);
                instancePath2.lineTo(165.19481f, 121.55844f);
                instancePath2.cubicTo(165.19481f, 144.07864f, 148.13507f, 162.61435f, 126.233894f, 164.94727f);
                instancePath2.lineTo(126.233765f, 183.8961f);
                instancePath2.lineTo(116.88312f, 183.8961f);
                instancePath2.lineTo(116.88344f, 164.94731f);
                instancePath2.cubicTo(94.98204f, 162.6146f, 77.92208f, 144.0788f, 77.92208f, 121.55844f);
                instancePath2.lineTo(77.92208f, 109.09091f);
                instancePath2.lineTo(87.27273f, 109.09091f);
                instancePath2.close();
                instancePath2.moveTo(121.55844f, 59.22078f);
                instancePath2.cubicTo(135.3297f, 59.22078f, 146.4935f, 70.38459f, 146.4935f, 84.155846f);
                instancePath2.lineTo(146.4935f, 84.155846f);
                instancePath2.lineTo(146.4935f, 121.55844f);
                Path path3 = instancePath2;
                path3.cubicTo(146.4935f, 135.3297f, 135.3297f, 146.4935f, 121.55844f, 146.4935f);
                path3.cubicTo(107.787186f, 146.4935f, 96.623375f, 135.3297f, 96.623375f, 121.55844f);
                instancePath2.lineTo(96.623375f, 121.55844f);
                instancePath2.lineTo(96.623375f, 84.155846f);
                instancePath2.cubicTo(96.623375f, 70.38459f, 107.787186f, 59.22078f, 121.55844f, 59.22078f);
                instancePath2.close();
                WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint4);
                canvas.restore();
                canvas.restore();
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i3;
    }
}
