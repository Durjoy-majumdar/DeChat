package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.ip_call_dial_entrance */
public class ip_call_dial_entrance extends C24542c {
    private final int height = 75;
    private final int width = 75;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 75;
        }
        if (i2 != 2) {
            return 0;
        }
        Canvas canvas = objArr[0];
        Looper looper = objArr[1];
        C24542c.instanceMatrix(looper);
        C24542c.instanceMatrixArray(looper);
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
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-15028967);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(37.5f, 45.0f);
        Path path = instancePath;
        path.cubicTo(41.642136f, 45.0f, 45.0f, 41.642136f, 45.0f, 37.5f);
        path.cubicTo(45.0f, 33.357864f, 41.642136f, 30.0f, 37.5f, 30.0f);
        path.cubicTo(33.357864f, 30.0f, 30.0f, 33.357864f, 30.0f, 37.5f);
        path.cubicTo(30.0f, 41.642136f, 33.357864f, 45.0f, 37.5f, 45.0f);
        instancePath.close();
        instancePath.moveTo(64.5f, 45.0f);
        path.cubicTo(68.642136f, 45.0f, 72.0f, 41.642136f, 72.0f, 37.5f);
        path.cubicTo(72.0f, 33.357864f, 68.642136f, 30.0f, 64.5f, 30.0f);
        path.cubicTo(60.357864f, 30.0f, 57.0f, 33.357864f, 57.0f, 37.5f);
        path.cubicTo(57.0f, 41.642136f, 60.357864f, 45.0f, 64.5f, 45.0f);
        instancePath.close();
        instancePath.moveTo(10.5f, 45.0f);
        path.cubicTo(14.642136f, 45.0f, 18.0f, 41.642136f, 18.0f, 37.5f);
        path.cubicTo(18.0f, 33.357864f, 14.642136f, 30.0f, 10.5f, 30.0f);
        path.cubicTo(6.3578644f, 30.0f, 3.0f, 33.357864f, 3.0f, 37.5f);
        path.cubicTo(3.0f, 41.642136f, 6.3578644f, 45.0f, 10.5f, 45.0f);
        instancePath.close();
        instancePath.moveTo(37.5f, 72.0f);
        path.cubicTo(41.642136f, 72.0f, 45.0f, 68.642136f, 45.0f, 64.5f);
        path.cubicTo(45.0f, 60.357864f, 41.642136f, 57.0f, 37.5f, 57.0f);
        path.cubicTo(33.357864f, 57.0f, 30.0f, 60.357864f, 30.0f, 64.5f);
        path.cubicTo(30.0f, 68.642136f, 33.357864f, 72.0f, 37.5f, 72.0f);
        instancePath.close();
        instancePath.moveTo(64.5f, 72.0f);
        path.cubicTo(68.642136f, 72.0f, 72.0f, 68.642136f, 72.0f, 64.5f);
        path.cubicTo(72.0f, 60.357864f, 68.642136f, 57.0f, 64.5f, 57.0f);
        path.cubicTo(60.357864f, 57.0f, 57.0f, 60.357864f, 57.0f, 64.5f);
        path.cubicTo(57.0f, 68.642136f, 60.357864f, 72.0f, 64.5f, 72.0f);
        instancePath.close();
        instancePath.moveTo(10.5f, 72.0f);
        path.cubicTo(14.642136f, 72.0f, 18.0f, 68.642136f, 18.0f, 64.5f);
        path.cubicTo(18.0f, 60.357864f, 14.642136f, 57.0f, 10.5f, 57.0f);
        path.cubicTo(6.3578644f, 57.0f, 3.0f, 60.357864f, 3.0f, 64.5f);
        path.cubicTo(3.0f, 68.642136f, 6.3578644f, 72.0f, 10.5f, 72.0f);
        instancePath.close();
        instancePath.moveTo(37.5f, 18.0f);
        path.cubicTo(41.642136f, 18.0f, 45.0f, 14.642136f, 45.0f, 10.5f);
        path.cubicTo(45.0f, 6.3578644f, 41.642136f, 3.0f, 37.5f, 3.0f);
        path.cubicTo(33.357864f, 3.0f, 30.0f, 6.3578644f, 30.0f, 10.5f);
        path.cubicTo(30.0f, 14.642136f, 33.357864f, 18.0f, 37.5f, 18.0f);
        instancePath.close();
        instancePath.moveTo(64.5f, 18.0f);
        path.cubicTo(68.642136f, 18.0f, 72.0f, 14.642136f, 72.0f, 10.5f);
        path.cubicTo(72.0f, 6.3578644f, 68.642136f, 3.0f, 64.5f, 3.0f);
        path.cubicTo(60.357864f, 3.0f, 57.0f, 6.3578644f, 57.0f, 10.5f);
        path.cubicTo(57.0f, 14.642136f, 60.357864f, 18.0f, 64.5f, 18.0f);
        instancePath.close();
        instancePath.moveTo(10.5f, 18.0f);
        path.cubicTo(14.642136f, 18.0f, 18.0f, 14.642136f, 18.0f, 10.5f);
        path.cubicTo(18.0f, 6.3578644f, 14.642136f, 3.0f, 10.5f, 3.0f);
        path.cubicTo(6.3578644f, 3.0f, 3.0f, 6.3578644f, 3.0f, 10.5f);
        path.cubicTo(3.0f, 14.642136f, 6.3578644f, 18.0f, 10.5f, 18.0f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
