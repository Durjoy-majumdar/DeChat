package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_speaker */
public class icons_outlined_speaker extends C24542c {
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
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(0.0f, 0.0f);
        instancePath.lineTo(24.0f, 0.0f);
        instancePath.lineTo(24.0f, 24.0f);
        instancePath.lineTo(0.0f, 24.0f);
        instancePath.lineTo(0.0f, 0.0f);
        instancePath.close();
        canvas.save();
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-16777216);
        Paint paint = instancePaint3;
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 5.2f, 0.0f, 1.0f, 3.5f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(paint, looper);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(7.212489f, 15.69777f);
        Path path = instancePath2;
        path.cubicTo(9.114182f, 13.796077f, 10.2f, 11.228917f, 10.2f, 8.485281f);
        path.cubicTo(10.2f, 5.7416463f, 9.114182f, 3.1744857f, 7.212489f, 1.2727922f);
        instancePath2.lineTo(8.485281f, 0.0f);
        path.cubicTo(10.656855f, 2.171573f, 12.0f, 5.1715727f, 12.0f, 8.485281f);
        path.cubicTo(12.0f, 11.79899f, 10.656855f, 14.79899f, 8.485281f, 16.970562f);
        instancePath2.lineTo(7.212489f, 15.69777f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(paint, looper);
        Path instancePath3 = C24542c.instancePath(looper);
        instancePath3.moveTo(4.2426405f, 12.727922f);
        Path path2 = instancePath3;
        path2.cubicTo(5.361765f, 11.608798f, 6.0f, 10.09984f, 6.0f, 8.485281f);
        path2.cubicTo(6.0f, 6.8707223f, 5.361765f, 5.361765f, 4.2426405f, 4.2426405f);
        instancePath3.lineTo(5.515433f, 2.9698484f);
        Path path3 = instancePath3;
        path3.cubicTo(6.926955f, 4.381371f, 7.8f, 6.331371f, 7.8f, 8.485281f);
        path3.cubicTo(7.8f, 10.639192f, 6.926955f, 12.589191f, 5.515433f, 14.000714f);
        instancePath3.lineTo(4.2426405f, 12.727922f);
        instancePath3.close();
        WeChatSVGRenderC2Java.setFillType(instancePath3, 2);
        canvas.drawPath(instancePath3, instancePaint5);
        canvas.restore();
        canvas.save();
        Paint instancePaint6 = C24542c.instancePaint(paint, looper);
        Path instancePath4 = C24542c.instancePath(looper);
        instancePath4.moveTo(2.5455844f, 11.030866f);
        Path path4 = instancePath4;
        path4.cubicTo(3.1970563f, 10.379394f, 3.6f, 9.479394f, 3.6f, 8.485281f);
        path4.cubicTo(3.6f, 7.491169f, 3.1970563f, 6.591169f, 2.5455844f, 5.939697f);
        instancePath4.lineTo(0.0f, 8.485281f);
        instancePath4.lineTo(2.5455844f, 11.030866f);
        instancePath4.close();
        WeChatSVGRenderC2Java.setFillType(instancePath4, 2);
        canvas.drawPath(instancePath4, instancePaint6);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
