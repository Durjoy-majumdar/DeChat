package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_android_pad */
public class icons_outlined_android_pad extends C24542c {
    private final int height = 72;
    private final int width = 72;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 72;
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
        instancePaint3.setColor(-16777216);
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 6.123234E-17f, 1.0f, 0.0f, -1.0f, 6.123234E-17f, 72.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(57.0f, 6.0f);
        instancePath.cubicTo(58.656853f, 6.0f, 60.0f, 7.343146f, 60.0f, 9.0f);
        instancePath.lineTo(60.0f, 63.0f);
        instancePath.cubicTo(60.0f, 64.65685f, 58.656853f, 66.0f, 57.0f, 66.0f);
        instancePath.lineTo(15.0f, 66.0f);
        instancePath.cubicTo(13.343145f, 66.0f, 12.0f, 64.65685f, 12.0f, 63.0f);
        instancePath.lineTo(12.0f, 9.0f);
        instancePath.cubicTo(12.0f, 7.343146f, 13.343145f, 6.0f, 15.0f, 6.0f);
        instancePath.lineTo(57.0f, 6.0f);
        instancePath.close();
        instancePath.moveTo(56.4f, 9.6f);
        instancePath.lineTo(15.6f, 9.6f);
        instancePath.lineTo(15.6f, 62.4f);
        instancePath.lineTo(56.4f, 62.4f);
        instancePath.lineTo(56.4f, 9.6f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-16777216);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(36.0f, 18.0f);
        Path path = instancePath2;
        path.cubicTo(37.656853f, 18.0f, 39.0f, 19.343145f, 39.0f, 21.0f);
        path.cubicTo(39.0f, 22.656855f, 37.656853f, 24.0f, 36.0f, 24.0f);
        path.cubicTo(34.343147f, 24.0f, 33.0f, 22.656855f, 33.0f, 21.0f);
        path.cubicTo(33.0f, 19.343145f, 34.343147f, 18.0f, 36.0f, 18.0f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
