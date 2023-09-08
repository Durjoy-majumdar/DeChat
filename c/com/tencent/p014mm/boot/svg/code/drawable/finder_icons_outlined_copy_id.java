package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.finder_icons_outlined_copy_id */
public class finder_icons_outlined_copy_id extends C24542c {
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
        canvas.save();
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-16777216);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(49.5f, 63.0f);
        instancePath.cubicTo(49.5f, 64.65685f, 48.156853f, 66.0f, 46.5f, 66.0f);
        instancePath.lineTo(16.5f, 66.0f);
        instancePath.cubicTo(14.843145f, 66.0f, 13.5f, 64.65685f, 13.5f, 63.0f);
        instancePath.lineTo(13.5f, 21.0f);
        instancePath.cubicTo(13.5f, 19.343145f, 14.843145f, 18.0f, 16.5f, 18.0f);
        instancePath.lineTo(25.5f, 18.0f);
        instancePath.lineTo(25.5f, 9.0f);
        instancePath.cubicTo(25.5f, 7.343146f, 26.843145f, 6.0f, 28.5f, 6.0f);
        instancePath.lineTo(49.8f, 6.0f);
        instancePath.lineTo(49.799f, 6.112f);
        instancePath.lineTo(61.379f, 17.7f);
        instancePath.lineTo(61.5f, 17.7f);
        instancePath.lineTo(61.499f, 17.82f);
        instancePath.lineTo(61.5f, 17.821234f);
        instancePath.lineTo(61.5f, 51.0f);
        instancePath.cubicTo(61.5f, 52.656853f, 60.156853f, 54.0f, 58.5f, 54.0f);
        instancePath.lineTo(49.5f, 54.0f);
        instancePath.lineTo(49.5f, 63.0f);
        instancePath.close();
        instancePath.moveTo(46.2f, 9.6f);
        instancePath.lineTo(29.1f, 9.6f);
        instancePath.lineTo(29.1f, 50.4f);
        instancePath.lineTo(57.9f, 50.4f);
        instancePath.lineTo(57.9f, 21.3f);
        instancePath.lineTo(51.0f, 21.3f);
        Path path = instancePath;
        path.cubicTo(48.349033f, 21.3f, 46.2f, 19.150967f, 46.2f, 16.5f);
        instancePath.lineTo(46.2f, 9.6f);
        instancePath.close();
        instancePath.moveTo(49.799f, 11.205f);
        instancePath.lineTo(49.8f, 16.5f);
        path.cubicTo(49.8f, 17.162743f, 50.337257f, 17.7f, 51.0f, 17.7f);
        instancePath.lineTo(56.291f, 17.7f);
        instancePath.lineTo(49.799f, 11.205f);
        instancePath.close();
        instancePath.moveTo(28.5f, 54.0f);
        instancePath.cubicTo(26.843145f, 54.0f, 25.5f, 52.656853f, 25.5f, 51.0f);
        instancePath.lineTo(25.5f, 21.599f);
        instancePath.lineTo(17.1f, 21.6f);
        instancePath.lineTo(17.1f, 62.4f);
        instancePath.lineTo(45.9f, 62.4f);
        instancePath.lineTo(45.9f, 54.0f);
        instancePath.lineTo(28.5f, 54.0f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
