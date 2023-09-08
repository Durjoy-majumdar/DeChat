package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icon_outlined_promote */
public class icon_outlined_promote extends C24542c {
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
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(0.0f, 0.0f);
        instancePath.lineTo(72.0f, 0.0f);
        instancePath.lineTo(72.0f, 72.0f);
        instancePath.lineTo(0.0f, 72.0f);
        instancePath.lineTo(0.0f, 0.0f);
        instancePath.close();
        canvas.save();
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-16777216);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(60.0f, 9.0f);
        Path path = instancePath2;
        path.cubicTo(61.656853f, 9.0f, 63.0f, 10.343145f, 63.0f, 12.0f);
        instancePath2.lineTo(63.0f, 60.0f);
        path.cubicTo(63.0f, 61.656853f, 61.656853f, 63.0f, 60.0f, 63.0f);
        instancePath2.lineTo(12.0f, 63.0f);
        path.cubicTo(10.343145f, 63.0f, 9.0f, 61.656853f, 9.0f, 60.0f);
        instancePath2.lineTo(9.0f, 12.0f);
        path.cubicTo(9.0f, 10.343145f, 10.343145f, 9.0f, 12.0f, 9.0f);
        instancePath2.lineTo(60.0f, 9.0f);
        instancePath2.close();
        instancePath2.moveTo(59.4f, 12.6f);
        instancePath2.lineTo(12.6f, 12.6f);
        instancePath2.lineTo(12.6f, 59.4f);
        instancePath2.lineTo(59.4f, 59.4f);
        instancePath2.lineTo(59.4f, 12.6f);
        instancePath2.close();
        instancePath2.moveTo(52.2f, 24.0f);
        instancePath2.cubicTo(53.0947f, 24.0f, 53.83694f, 24.65277f, 53.97644f, 25.50803f);
        instancePath2.lineTo(54.0f, 25.8f);
        instancePath2.lineTo(54.0f, 36.3f);
        instancePath2.lineTo(50.4f, 36.3f);
        instancePath2.lineTo(50.396206f, 30.144f);
        instancePath2.lineTo(38.772793f, 41.772793f);
        instancePath2.cubicTo(38.147953f, 42.397633f, 37.178024f, 42.467056f, 36.4765f, 41.98107f);
        instancePath2.lineTo(36.227207f, 41.772793f);
        instancePath2.lineTo(31.5f, 37.047f);
        instancePath2.lineTo(19.272793f, 49.272793f);
        instancePath2.lineTo(16.727207f, 46.727207f);
        instancePath2.lineTo(30.227207f, 33.227207f);
        instancePath2.cubicTo(30.852047f, 32.602367f, 31.821974f, 32.532944f, 32.5235f, 33.01893f);
        instancePath2.lineTo(32.772793f, 33.227207f);
        instancePath2.lineTo(37.5f, 37.953f);
        instancePath2.lineTo(47.85521f, 27.597f);
        instancePath2.lineTo(41.7f, 27.6f);
        instancePath2.lineTo(41.7f, 24.0f);
        instancePath2.lineTo(52.2f, 24.0f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint3);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
