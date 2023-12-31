package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_news */
public class icons_filled_news extends C24542c {
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
        instancePath.moveTo(22.171946f, 30.944338f);
        instancePath.lineTo(12.183209f, 36.60729f);
        instancePath.lineTo(8.831939f, 24.219584f);
        Path path = instancePath;
        path.cubicTo(8.278817f, 22.160328f, 9.515207f, 20.03672f, 11.59755f, 19.48973f);
        instancePath.lineTo(24.091606f, 16.175617f);
        instancePath.lineTo(24.124142f, 27.565872f);
        path.cubicTo(24.124142f, 28.949434f, 23.3758f, 30.23647f, 22.171946f, 30.944338f);
        instancePath.close();
        instancePath.moveTo(24.124142f, 45.61653f);
        instancePath.lineTo(24.091606f, 57.006786f);
        instancePath.lineTo(11.59755f, 53.692673f);
        instancePath.cubicTo(9.515207f, 53.145683f, 8.278817f, 51.022076f, 8.831939f, 48.962822f);
        instancePath.lineTo(12.183209f, 36.60729f);
        instancePath.lineTo(22.171946f, 42.27024f);
        instancePath.cubicTo(23.3758f, 42.945934f, 24.124142f, 44.23297f, 24.124142f, 45.61653f);
        instancePath.close();
        instancePath.moveTo(37.984734f, 51.279484f);
        instancePath.lineTo(47.940933f, 57.006786f);
        instancePath.lineTo(38.765614f, 66.0482f);
        Path path2 = instancePath;
        path2.cubicTo(37.236393f, 67.56047f, 34.76361f, 67.56047f, 33.23439f, 66.0482f);
        instancePath.lineTo(24.091606f, 57.006786f);
        instancePath.lineTo(34.047806f, 51.279484f);
        path2.cubicTo(35.25166f, 50.571613f, 36.748344f, 50.571613f, 37.984734f, 51.279484f);
        instancePath.close();
        instancePath.moveTo(49.828056f, 42.238068f);
        instancePath.lineTo(59.816795f, 36.575115f);
        instancePath.lineTo(63.168064f, 48.930645f);
        instancePath.cubicTo(63.721188f, 50.989902f, 62.484795f, 53.113506f, 60.402454f, 53.660496f);
        instancePath.lineTo(47.908398f, 56.974613f);
        instancePath.lineTo(47.875862f, 45.584354f);
        instancePath.cubicTo(47.875862f, 44.23297f, 48.624203f, 42.945934f, 49.828056f, 42.238068f);
        instancePath.close();
        instancePath.moveTo(47.875862f, 27.565872f);
        instancePath.lineTo(47.908398f, 16.175617f);
        instancePath.lineTo(60.402454f, 19.48973f);
        instancePath.cubicTo(62.484795f, 20.03672f, 63.721188f, 22.160328f, 63.168064f, 24.219584f);
        instancePath.lineTo(59.816795f, 36.575115f);
        instancePath.lineTo(49.828056f, 30.912163f);
        instancePath.cubicTo(48.624203f, 30.23647f, 47.875862f, 28.949434f, 47.875862f, 27.565872f);
        instancePath.close();
        instancePath.moveTo(34.047806f, 21.90292f);
        instancePath.lineTo(24.091606f, 16.175617f);
        instancePath.lineTo(33.23439f, 7.134199f);
        Path path3 = instancePath;
        path3.cubicTo(34.76361f, 5.6219335f, 37.236393f, 5.6219335f, 38.765614f, 7.134199f);
        instancePath.lineTo(47.908398f, 16.175617f);
        instancePath.lineTo(37.952198f, 21.90292f);
        path3.cubicTo(36.748344f, 22.61079f, 35.25166f, 22.61079f, 34.047806f, 21.90292f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
