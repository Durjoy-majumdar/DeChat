package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_call_good */
public class icons_filled_call_good extends C24542c {
    private final int height = 72;
    private final int width = 72;

    public int doCommand(int i, Object... objArr) {
        if (i == 0 || i == 1) {
            return 72;
        }
        if (i == 2) {
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
            instancePath.moveTo(46.996094f, 20.203125f);
            instancePath.lineTo(46.429688f, 28.664062f);
            instancePath.lineTo(58.664062f, 28.664062f);
            instancePath.cubicTo(62.027344f, 28.664062f, 65.47266f, 32.296875f, 64.9375f, 36.777344f);
            instancePath.lineTo(64.859375f, 37.21875f);
            instancePath.lineTo(60.660156f, 57.234375f);
            instancePath.cubicTo(59.945312f, 60.621094f, 57.539062f, 62.76953f, 54.628906f, 62.976562f);
            instancePath.lineTo(54.164062f, 62.992188f);
            instancePath.lineTo(26.621094f, 62.976562f);
            instancePath.cubicTo(25.203125f, 62.972656f, 24.050781f, 61.820312f, 24.050781f, 60.402344f);
            instancePath.lineTo(24.050781f, 33.527344f);
            Path path = instancePath;
            path.cubicTo(24.050781f, 32.304688f, 24.910156f, 31.253906f, 26.105469f, 31.007812f);
            path.cubicTo(26.136719f, 31.0f, 26.167969f, 30.996094f, 26.195312f, 30.988281f);
            path.cubicTo(30.003906f, 30.054688f, 33.160156f, 23.785156f, 33.73828f, 18.203125f);
            instancePath.lineTo(33.76953f, 17.726562f);
            instancePath.lineTo(33.835938f, 16.019531f);
            instancePath.lineTo(33.90625f, 15.195312f);
            Path path2 = instancePath;
            path2.cubicTo(34.128906f, 13.082031f, 34.757812f, 10.429688f, 37.13672f, 9.402344f);
            path2.cubicTo(43.38672f, 6.714844f, 47.339844f, 14.878906f, 46.996094f, 20.203125f);
            instancePath.close();
            instancePath.moveTo(16.972656f, 62.98047f);
            instancePath.lineTo(12.625f, 62.98828f);
            Path path3 = instancePath;
            path3.cubicTo(11.207031f, 62.992188f, 10.054688f, 61.839844f, 10.050781f, 60.421875f);
            path3.cubicTo(10.050781f, 60.41797f, 10.050781f, 60.41797f, 10.050781f, 60.41797f);
            instancePath.lineTo(10.050781f, 33.820312f);
            instancePath.cubicTo(10.050781f, 32.40625f, 11.195312f, 31.253906f, 12.613281f, 31.25f);
            instancePath.lineTo(16.957031f, 31.234375f);
            Path path4 = instancePath;
            path4.cubicTo(18.378906f, 31.230469f, 19.53125f, 32.378906f, 19.539062f, 33.796875f);
            path4.cubicTo(19.539062f, 33.80078f, 19.539062f, 33.804688f, 19.539062f, 33.804688f);
            instancePath.lineTo(19.539062f, 60.40625f);
            instancePath.cubicTo(19.539062f, 61.82422f, 18.390625f, 62.976562f, 16.972656f, 62.98047f);
            instancePath.close();
            instancePath.moveTo(16.972656f, 62.98047f);
            WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
