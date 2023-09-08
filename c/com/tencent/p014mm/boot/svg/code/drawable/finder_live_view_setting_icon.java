package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.finder_live_view_setting_icon */
public class finder_live_view_setting_icon extends C24542c {
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
        canvas.save();
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(25.5f, 42.0f);
        instancePath.cubicTo(30.257812f, 42.0f, 34.273438f, 45.164062f, 35.566406f, 49.5f);
        instancePath.lineTo(66.0f, 49.5f);
        instancePath.lineTo(66.0f, 55.5f);
        instancePath.lineTo(35.5625f, 55.503906f);
        Path path = instancePath;
        path.cubicTo(34.273438f, 59.839844f, 30.253906f, 63.0f, 25.5f, 63.0f);
        path.cubicTo(20.746094f, 63.0f, 16.726562f, 59.839844f, 15.4375f, 55.503906f);
        instancePath.lineTo(6.0f, 55.5f);
        instancePath.lineTo(6.0f, 49.5f);
        instancePath.lineTo(15.433594f, 49.5f);
        path.cubicTo(16.726562f, 45.164062f, 20.742188f, 42.0f, 25.5f, 42.0f);
        instancePath.close();
        instancePath.moveTo(25.5f, 48.0f);
        path.cubicTo(23.015625f, 48.0f, 21.0f, 50.015625f, 21.0f, 52.5f);
        path.cubicTo(21.0f, 54.984375f, 23.015625f, 57.0f, 25.5f, 57.0f);
        path.cubicTo(27.984375f, 57.0f, 30.0f, 54.984375f, 30.0f, 52.5f);
        path.cubicTo(30.0f, 50.015625f, 27.984375f, 48.0f, 25.5f, 48.0f);
        instancePath.close();
        instancePath.moveTo(46.5f, 9.0f);
        path.cubicTo(52.92578f, 9.0f, 58.30078f, 13.488281f, 59.664062f, 19.5f);
        instancePath.lineTo(66.0f, 19.5f);
        instancePath.lineTo(66.0f, 25.5f);
        instancePath.lineTo(59.664062f, 25.503906f);
        Path path2 = instancePath;
        path2.cubicTo(58.30078f, 31.511719f, 52.921875f, 36.0f, 46.5f, 36.0f);
        path2.cubicTo(40.078125f, 36.0f, 34.69922f, 31.511719f, 33.335938f, 25.503906f);
        instancePath.lineTo(6.0f, 25.5f);
        instancePath.lineTo(6.0f, 19.5f);
        instancePath.lineTo(33.335938f, 19.5f);
        Path path3 = instancePath;
        path3.cubicTo(34.69922f, 13.488281f, 40.07422f, 9.0f, 46.5f, 9.0f);
        instancePath.close();
        instancePath.moveTo(46.5f, 15.0f);
        path3.cubicTo(42.359375f, 15.0f, 39.0f, 18.359375f, 39.0f, 22.5f);
        path3.cubicTo(39.0f, 26.640625f, 42.359375f, 30.0f, 46.5f, 30.0f);
        path3.cubicTo(50.640625f, 30.0f, 54.0f, 26.640625f, 54.0f, 22.5f);
        path3.cubicTo(54.0f, 18.359375f, 50.640625f, 15.0f, 46.5f, 15.0f);
        instancePath.close();
        instancePath.moveTo(46.5f, 15.0f);
        WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
