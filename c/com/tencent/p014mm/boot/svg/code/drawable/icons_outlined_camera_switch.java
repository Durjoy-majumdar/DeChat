package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_camera_switch */
public class icons_outlined_camera_switch extends C24542c {
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
        instancePath.moveTo(29.1f, 48.819073f);
        instancePath.lineTo(29.1f, 51.0f);
        instancePath.lineTo(25.5f, 51.0f);
        instancePath.lineTo(25.5f, 45.6f);
        instancePath.lineTo(25.5f, 43.5f);
        instancePath.cubicTo(25.5f, 42.671574f, 26.171574f, 42.0f, 27.0f, 42.0f);
        instancePath.lineTo(34.5f, 42.0f);
        instancePath.lineTo(34.5f, 45.6f);
        instancePath.lineTo(30.801285f, 45.6f);
        Path path = instancePath;
        path.cubicTo(32.25434f, 46.746292f, 34.07046f, 47.4f, 36.0f, 47.4f);
        path.cubicTo(40.63919f, 47.4f, 44.4f, 43.63919f, 44.4f, 39.0f);
        instancePath.lineTo(48.0f, 39.0f);
        Path path2 = instancePath;
        path2.cubicTo(48.0f, 45.62742f, 42.62742f, 51.0f, 36.0f, 51.0f);
        path2.cubicTo(33.431664f, 51.0f, 31.051779f, 50.19314f, 29.1f, 48.819073f);
        instancePath.close();
        instancePath.moveTo(42.9f, 29.18093f);
        instancePath.lineTo(42.9f, 27.0f);
        instancePath.lineTo(46.5f, 27.0f);
        instancePath.lineTo(46.5f, 34.5f);
        instancePath.cubicTo(46.5f, 35.328426f, 45.828426f, 36.0f, 45.0f, 36.0f);
        instancePath.lineTo(42.9f, 36.0f);
        instancePath.lineTo(37.5f, 36.0f);
        instancePath.lineTo(37.5f, 32.4f);
        instancePath.lineTo(41.198837f, 32.4f);
        Path path3 = instancePath;
        path3.cubicTo(39.747807f, 31.255857f, 37.931503f, 30.6f, 36.0f, 30.6f);
        path3.cubicTo(31.360807f, 30.6f, 27.6f, 34.36081f, 27.6f, 39.0f);
        instancePath.lineTo(24.0f, 39.0f);
        path3.cubicTo(24.0f, 32.37258f, 29.372583f, 27.0f, 36.0f, 27.0f);
        path3.cubicTo(38.568336f, 27.0f, 40.94822f, 27.80686f, 42.9f, 29.18093f);
        instancePath.close();
        instancePath.moveTo(43.073338f, 15.6f);
        instancePath.lineTo(28.926662f, 15.6f);
        instancePath.lineTo(22.926662f, 24.6f);
        instancePath.lineTo(9.6f, 24.6f);
        instancePath.lineTo(9.6f, 56.4f);
        instancePath.lineTo(62.4f, 56.4f);
        instancePath.lineTo(62.4f, 24.6f);
        instancePath.lineTo(49.073338f, 24.6f);
        instancePath.lineTo(43.073338f, 15.6f);
        instancePath.close();
        instancePath.moveTo(44.197224f, 12.0f);
        instancePath.cubicTo(44.698753f, 12.0f, 45.167103f, 12.250651f, 45.4453f, 12.66795f);
        instancePath.lineTo(51.0f, 21.0f);
        instancePath.lineTo(63.0f, 21.0f);
        instancePath.cubicTo(64.65685f, 21.0f, 66.0f, 22.343145f, 66.0f, 24.0f);
        instancePath.lineTo(66.0f, 57.0f);
        instancePath.cubicTo(66.0f, 58.656853f, 64.65685f, 60.0f, 63.0f, 60.0f);
        instancePath.lineTo(9.0f, 60.0f);
        instancePath.cubicTo(7.343146f, 60.0f, 6.0f, 58.656853f, 6.0f, 57.0f);
        instancePath.lineTo(6.0f, 24.0f);
        instancePath.cubicTo(6.0f, 22.343145f, 7.343146f, 21.0f, 9.0f, 21.0f);
        instancePath.lineTo(21.0f, 21.0f);
        instancePath.lineTo(26.5547f, 12.66795f);
        instancePath.cubicTo(26.8329f, 12.250651f, 27.301247f, 12.0f, 27.802776f, 12.0f);
        instancePath.lineTo(44.197224f, 12.0f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
