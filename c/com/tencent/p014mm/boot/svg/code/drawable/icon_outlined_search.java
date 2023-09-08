package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icon_outlined_search */
public class icon_outlined_search extends C24542c {
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
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 3.6f, 0.0f, 1.0f, 3.6f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(7.245378f, 0.0f);
        Path path = instancePath2;
        path.cubicTo(11.246897f, 0.0f, 14.490756f, 3.2438593f, 14.490756f, 7.245378f);
        path.cubicTo(14.490756f, 9.048666f, 13.831973f, 10.698084f, 12.741946f, 11.966092f);
        instancePath2.lineTo(17.0f, 16.225233f);
        instancePath2.lineTo(16.121727f, 17.103506f);
        instancePath2.lineTo(11.853742f, 12.836574f);
        Path path2 = instancePath2;
        path2.cubicTo(10.601368f, 13.869984f, 8.995869f, 14.490756f, 7.245378f, 14.490756f);
        path2.cubicTo(3.2438593f, 14.490756f, 0.0f, 11.246897f, 0.0f, 7.245378f);
        path2.cubicTo(0.0f, 3.2438593f, 3.2438593f, 0.0f, 7.245378f, 0.0f);
        instancePath2.close();
        instancePath2.moveTo(7.245375f, 1.2420775f);
        Path path3 = instancePath2;
        path3.cubicTo(3.9298308f, 1.2420775f, 1.2420616f, 3.9298465f, 1.2420616f, 7.245391f);
        path3.cubicTo(1.2420616f, 10.560935f, 3.9298308f, 13.248704f, 7.245375f, 13.248704f);
        path3.cubicTo(10.560919f, 13.248704f, 13.248688f, 10.560935f, 13.248688f, 7.245391f);
        path3.cubicTo(13.248688f, 3.9298465f, 10.560919f, 1.2420775f, 7.245375f, 1.2420775f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
