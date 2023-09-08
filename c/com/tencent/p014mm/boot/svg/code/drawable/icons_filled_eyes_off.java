package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_eyes_off */
public class icons_filled_eyes_off extends C24542c {
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
        instancePaint3.setColor(-16777216);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(56.765636f, 50.401676f);
        instancePath.lineTo(66.27565f, 59.91169f);
        instancePath.lineTo(63.09367f, 63.09367f);
        instancePath.lineTo(12.18198f, 12.18198f);
        instancePath.lineTo(15.363961f, 9.0f);
        instancePath.lineTo(23.576626f, 17.212666f);
        Path path = instancePath;
        path.cubicTo(27.459063f, 15.780132f, 31.641382f, 15.0f, 36.0f, 15.0f);
        path.cubicTo(50.42337f, 15.0f, 62.91619f, 23.542883f, 69.0f, 36.0f);
        path.cubicTo(66.16364f, 41.807686f, 61.934246f, 46.76459f, 56.765636f, 50.401676f);
        instancePath.close();
        instancePath.moveTo(32.47154f, 26.107576f);
        instancePath.lineTo(45.89242f, 39.52846f);
        Path path2 = instancePath;
        path2.cubicTo(46.285793f, 38.4257f, 46.5f, 37.237865f, 46.5f, 36.0f);
        path2.cubicTo(46.5f, 30.20101f, 41.79899f, 25.5f, 36.0f, 25.5f);
        path2.cubicTo(34.762135f, 25.5f, 33.5743f, 25.714207f, 32.47154f, 26.107576f);
        instancePath.close();
        instancePath.moveTo(48.423374f, 54.787334f);
        path2.cubicTo(44.54094f, 56.219868f, 40.358616f, 57.0f, 36.0f, 57.0f);
        path2.cubicTo(21.576628f, 57.0f, 9.08381f, 48.45712f, 3.0f, 36.0f);
        path2.cubicTo(5.8363595f, 30.192312f, 10.065755f, 25.235407f, 15.234364f, 21.598326f);
        instancePath.lineTo(26.107576f, 32.47154f);
        path2.cubicTo(25.714207f, 33.5743f, 25.5f, 34.762135f, 25.5f, 36.0f);
        path2.cubicTo(25.5f, 41.79899f, 30.20101f, 46.5f, 36.0f, 46.5f);
        path2.cubicTo(37.237865f, 46.5f, 38.4257f, 46.285793f, 39.52846f, 45.89242f);
        instancePath.lineTo(48.423374f, 54.787334f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
