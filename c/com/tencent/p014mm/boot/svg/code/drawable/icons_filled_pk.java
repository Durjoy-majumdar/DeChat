package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_pk */
public class icons_filled_pk extends C24542c {
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
            instancePath.moveTo(25.148438f, 21.0f);
            Path path = instancePath;
            path.cubicTo(26.285156f, 21.011719f, 27.417969f, 21.082031f, 28.546875f, 21.203125f);
            path.cubicTo(29.839844f, 21.34375f, 31.09375f, 21.738281f, 32.222656f, 22.355469f);
            path.cubicTo(33.484375f, 23.078125f, 34.414062f, 24.226562f, 34.828125f, 25.574219f);
            path.cubicTo(35.335938f, 27.121094f, 35.46875f, 28.761719f, 35.20703f, 30.363281f);
            path.cubicTo(35.01172f, 31.964844f, 34.527344f, 33.51953f, 33.777344f, 34.964844f);
            path.cubicTo(33.039062f, 36.42578f, 31.925781f, 37.679688f, 30.542969f, 38.617188f);
            path.cubicTo(29.417969f, 39.34375f, 28.160156f, 39.86328f, 26.832031f, 40.148438f);
            path.cubicTo(25.257812f, 40.410156f, 23.660156f, 40.527344f, 22.058594f, 40.5f);
            instancePath.lineTo(13.90625f, 40.5f);
            instancePath.lineTo(11.835938f, 51.0f);
            instancePath.lineTo(4.5f, 50.953125f);
            instancePath.lineTo(10.621094f, 21.0f);
            instancePath.close();
            instancePath.moveTo(57.296875f, 21.117188f);
            instancePath.lineTo(66.92969f, 21.132812f);
            instancePath.lineTo(52.316406f, 34.359375f);
            instancePath.lineTo(62.765625f, 50.90625f);
            instancePath.lineTo(54.554688f, 50.953125f);
            instancePath.lineTo(47.039062f, 39.117188f);
            instancePath.lineTo(42.59375f, 43.25f);
            instancePath.lineTo(41.101562f, 51.0f);
            instancePath.lineTo(33.765625f, 50.953125f);
            instancePath.lineTo(39.785156f, 21.132812f);
            instancePath.lineTo(46.921875f, 21.132812f);
            instancePath.lineTo(44.67578f, 32.527344f);
            instancePath.close();
            instancePath.moveTo(23.984375f, 27.710938f);
            instancePath.lineTo(16.433594f, 27.710938f);
            instancePath.lineTo(15.230469f, 33.79297f);
            instancePath.lineTo(23.078125f, 33.79297f);
            instancePath.cubicTo(23.390625f, 33.80078f, 23.703125f, 33.785156f, 24.015625f, 33.75f);
            instancePath.lineTo(24.480469f, 33.683594f);
            Path path2 = instancePath;
            path2.cubicTo(24.867188f, 33.59375f, 25.238281f, 33.433594f, 25.566406f, 33.203125f);
            path2.cubicTo(25.972656f, 32.914062f, 26.296875f, 32.523438f, 26.511719f, 32.066406f);
            path2.cubicTo(26.734375f, 31.617188f, 26.875f, 31.128906f, 26.933594f, 30.632812f);
            path2.cubicTo(27.007812f, 30.132812f, 26.972656f, 29.621094f, 26.820312f, 29.136719f);
            path2.cubicTo(26.699219f, 28.71875f, 26.429688f, 28.359375f, 26.058594f, 28.132812f);
            path2.cubicTo(25.726562f, 27.941406f, 25.359375f, 27.820312f, 24.980469f, 27.773438f);
            instancePath.lineTo(24.484375f, 27.730469f);
            instancePath.close();
            instancePath.moveTo(23.984375f, 27.710938f);
            WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
