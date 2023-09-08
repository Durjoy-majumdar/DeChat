package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_favour_on */
public class icons_outlined_favour_on extends C24542c {
    private final int height = 72;
    private final int width = 72;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 72;
        }
        if (i2 == 2) {
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
            instancePath.moveTo(46.964844f, 20.390625f);
            instancePath.lineTo(46.429688f, 28.664062f);
            instancePath.lineTo(58.45703f, 28.664062f);
            instancePath.cubicTo(62.5f, 28.664062f, 65.53516f, 32.820312f, 64.92578f, 36.953125f);
            instancePath.lineTo(64.84375f, 37.398438f);
            instancePath.lineTo(60.558594f, 57.628906f);
            instancePath.cubicTo(59.921875f, 60.60547f, 57.5f, 62.765625f, 54.628906f, 62.976562f);
            instancePath.lineTo(54.171875f, 62.992188f);
            instancePath.lineTo(13.050781f, 62.976562f);
            instancePath.cubicTo(11.394531f, 62.976562f, 10.050781f, 61.632812f, 10.050781f, 59.976562f);
            instancePath.lineTo(10.050781f, 34.234375f);
            instancePath.cubicTo(10.050781f, 32.578125f, 11.394531f, 31.234375f, 13.050781f, 31.234375f);
            instancePath.lineTo(20.375f, 31.234375f);
            instancePath.lineTo(24.160156f, 31.144531f);
            instancePath.lineTo(25.410156f, 31.089844f);
            instancePath.lineTo(25.914062f, 31.046875f);
            Path path = instancePath;
            path.cubicTo(25.949219f, 31.042969f, 25.976562f, 31.039062f, 26.0f, 31.03125f);
            path.cubicTo(30.066406f, 30.085938f, 33.16797f, 23.8125f, 33.73828f, 18.203125f);
            instancePath.lineTo(33.76953f, 17.722656f);
            instancePath.lineTo(33.835938f, 16.007812f);
            instancePath.lineTo(33.902344f, 15.179688f);
            Path path2 = instancePath;
            path2.cubicTo(34.121094f, 13.058594f, 34.80078f, 10.5625f, 37.14453f, 9.53125f);
            path2.cubicTo(43.304688f, 6.828125f, 47.30078f, 15.035156f, 46.964844f, 20.390625f);
            instancePath.close();
            instancePath.moveTo(38.589844f, 12.828125f);
            instancePath.cubicTo(38.109375f, 13.039062f, 37.746094f, 13.710938f, 37.554688f, 14.96875f);
            instancePath.lineTo(37.492188f, 15.46875f);
            instancePath.lineTo(37.433594f, 16.144531f);
            instancePath.lineTo(37.36328f, 17.957031f);
            instancePath.lineTo(37.320312f, 18.566406f);
            instancePath.cubicTo(36.5625f, 26.023438f, 32.476562f, 33.222656f, 26.816406f, 34.539062f);
            instancePath.lineTo(26.523438f, 34.59375f);
            instancePath.lineTo(25.914062f, 34.660156f);
            instancePath.lineTo(25.367188f, 34.69922f);
            instancePath.lineTo(24.597656f, 34.726562f);
            instancePath.lineTo(24.597656f, 59.382812f);
            instancePath.lineTo(54.04297f, 59.39453f);
            instancePath.lineTo(54.367188f, 59.38672f);
            instancePath.cubicTo(55.51172f, 59.30078f, 56.53125f, 58.472656f, 56.933594f, 57.257812f);
            instancePath.lineTo(57.039062f, 56.882812f);
            instancePath.lineTo(61.30078f, 36.757812f);
            instancePath.lineTo(61.36328f, 36.42578f);
            instancePath.cubicTo(61.660156f, 34.421875f, 60.30078f, 32.503906f, 58.75f, 32.285156f);
            instancePath.lineTo(58.45703f, 32.265625f);
            instancePath.lineTo(42.59375f, 32.265625f);
            instancePath.lineTo(43.371094f, 20.164062f);
            instancePath.cubicTo(43.64453f, 15.820312f, 40.78125f, 11.867188f, 38.589844f, 12.828125f);
            instancePath.close();
            instancePath.moveTo(20.996094f, 34.820312f);
            instancePath.lineTo(20.375f, 34.835938f);
            instancePath.lineTo(13.648438f, 34.83203f);
            instancePath.lineTo(13.648438f, 59.375f);
            instancePath.lineTo(20.996094f, 59.378906f);
            instancePath.close();
            instancePath.moveTo(20.996094f, 34.820312f);
            WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
