package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.status_accountunkey */
public class status_accountunkey extends C24542c {
    private final int height = 46;
    private final int width = 46;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 46;
        if (!(i2 == 0 || i2 == 1)) {
            i3 = 0;
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
                C24542c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
                canvas.save();
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-6710887);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(23.0f, 0.0f);
                Path path = instancePath;
                path.cubicTo(35.70255f, 0.0f, 46.0f, 10.29745f, 46.0f, 23.0f);
                path.cubicTo(46.0f, 35.70255f, 35.70255f, 46.0f, 23.0f, 46.0f);
                path.cubicTo(10.29745f, 46.0f, 0.0f, 35.70255f, 0.0f, 23.0f);
                path.cubicTo(0.0f, 10.29745f, 10.29745f, 0.0f, 23.0f, 0.0f);
                instancePath.close();
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
                instancePaint4.setColor(-1);
                Path instancePath2 = C24542c.instancePath(looper);
                instancePath2.moveTo(29.837742f, 16.978155f);
                Path path2 = instancePath2;
                path2.cubicTo(29.663364f, 15.734242f, 29.332104f, 14.538659f, 28.424576f, 13.573514f);
                path2.cubicTo(25.837162f, 10.148845f, 20.172827f, 10.138831f, 17.585415f, 13.5635f);
                path2.cubicTo(15.967033f, 15.315889f, 16.176823f, 17.799276f, 15.827173f, 19.982252f);
                instancePath2.lineTo(13.0f, 19.982252f);
                instancePath2.cubicTo(13.00999f, 24.328176f, 13.00999f, 28.66409f, 13.00999f, 33.0f);
                instancePath2.lineTo(32.99001f, 33.0f);
                instancePath2.cubicTo(32.99001f, 28.66409f, 32.99001f, 24.328176f, 33.0f, 19.982252f);
                instancePath2.lineTo(31.586414f, 19.982252f);
                instancePath2.lineTo(26.086912f, 19.982252f);
                instancePath2.lineTo(18.824175f, 19.982252f);
                Path path3 = instancePath2;
                path3.cubicTo(18.804195f, 17.358675f, 19.713287f, 13.873924f, 22.99001f, 13.97406f);
                path3.cubicTo(25.067957f, 13.891255f, 26.212177f, 15.279206f, 26.759495f, 16.978155f);
                instancePath2.lineTo(29.837742f, 16.978155f);
                instancePath2.lineTo(29.837742f, 16.978155f);
                instancePath2.close();
                WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint4);
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i3;
    }
}
