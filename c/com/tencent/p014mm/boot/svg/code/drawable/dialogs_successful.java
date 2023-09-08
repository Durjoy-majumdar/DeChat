package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.dialogs_successful */
public class dialogs_successful extends C24542c {
    private final int height = 160;
    private final int width = 235;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            return 235;
        }
        if (i2 == 1) {
            return 160;
        }
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
            instancePaint3.setColor(-12206054);
            float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 3.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(212.0f, 0.0f);
            Path path = instancePath;
            path.cubicTo(216.63023f, 5.5596924f, 222.31512f, 11.159097f, 228.0f, 16.0f);
            path.cubicTo(200.60638f, 43.807625f, 144.0f, 96.0f, 144.0f, 96.0f);
            path.cubicTo(144.0f, 96.0f, 103.635574f, 139.2875f, 84.0f, 160.0f);
            path.cubicTo(55.03448f, 132.87665f, 27.537401f, 105.75329f, 0.0f, 80.0f);
            path.cubicTo(5.6445622f, 72.9511f, 11.329443f, 67.31199f, 16.0f, 60.0f);
            path.cubicTo(38.94748f, 83.276245f, 60.719364f, 104.83991f, 84.0f, 128.0f);
            path.cubicTo(125.47056f, 84.22934f, 168.12732f, 42.0551f, 212.0f, 0.0f);
            instancePath.lineTo(212.0f, 0.0f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 2);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
