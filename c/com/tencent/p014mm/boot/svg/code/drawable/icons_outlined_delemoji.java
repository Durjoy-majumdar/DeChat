package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_delemoji */
public class icons_outlined_delemoji extends C24542c {
    private final int height = 24;
    private final int width = 24;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 24;
        }
        if (i2 != 2) {
            return 0;
        }
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
        instancePaint3.setColor(-436207616);
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 2.0f, 0.0f, 1.0f, 4.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(18.5f, 0.0f);
        instancePath.cubicTo(19.328426f, 0.0f, 20.0f, 0.67157286f, 20.0f, 1.5f);
        instancePath.lineTo(20.0f, 14.5f);
        Path path = instancePath;
        path.cubicTo(20.0f, 15.328427f, 19.328426f, 16.0f, 18.5f, 16.0f);
        instancePath.lineTo(6.4696865f, 16.0f);
        path.cubicTo(6.00243f, 16.0f, 5.561861f, 15.782256f, 5.278062f, 15.41106f);
        instancePath.lineTo(0.30846515f, 8.91106f);
        instancePath.cubicTo(-0.102702245f, 8.373273f, -0.102702245f, 7.626727f, 0.30846515f, 7.0889397f);
        instancePath.lineTo(5.278062f, 0.58893955f);
        instancePath.cubicTo(5.561861f, 0.21774355f, 6.00243f, 0.0f, 6.4696865f, 0.0f);
        instancePath.lineTo(18.5f, 0.0f);
        instancePath.close();
        instancePath.moveTo(18.5f, 1.2f);
        instancePath.lineTo(6.4696865f, 1.2f);
        instancePath.cubicTo(6.376235f, 1.2f, 6.288121f, 1.2435488f, 6.2313614f, 1.3177879f);
        instancePath.lineTo(1.2617648f, 7.817788f);
        instancePath.cubicTo(1.1795312f, 7.9253454f, 1.1795312f, 8.074655f, 1.2617648f, 8.182212f);
        instancePath.lineTo(6.2313614f, 14.682212f);
        instancePath.cubicTo(6.288121f, 14.756452f, 6.376235f, 14.8f, 6.4696865f, 14.8f);
        instancePath.lineTo(18.5f, 14.8f);
        instancePath.cubicTo(18.665686f, 14.8f, 18.8f, 14.665686f, 18.8f, 14.5f);
        instancePath.lineTo(18.8f, 1.5f);
        instancePath.cubicTo(18.8f, 1.3343146f, 18.665686f, 1.2f, 18.5f, 1.2f);
        instancePath.close();
        instancePath.moveTo(15.0f, 4.0f);
        instancePath.lineTo(16.0f, 5.0f);
        instancePath.lineTo(13.0f, 8.0f);
        instancePath.lineTo(16.0f, 11.0f);
        instancePath.lineTo(15.0f, 12.0f);
        instancePath.lineTo(12.0f, 9.0f);
        instancePath.lineTo(9.0f, 12.0f);
        instancePath.lineTo(8.0f, 11.0f);
        instancePath.lineTo(11.0f, 8.0f);
        instancePath.lineTo(8.0f, 5.0f);
        instancePath.lineTo(9.0f, 4.0f);
        instancePath.lineTo(12.0f, 7.0f);
        instancePath.lineTo(15.0f, 4.0f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
