package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_link */
public class icons_outlined_link extends C24542c {
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
        instancePath.moveTo(52.96875f, 36.0f);
        instancePath.lineTo(50.42578f, 33.453125f);
        instancePath.lineTo(56.789062f, 27.089844f);
        Path path = instancePath;
        path.cubicTo(60.070312f, 23.808594f, 60.070312f, 18.492188f, 56.789062f, 15.210938f);
        path.cubicTo(53.507812f, 11.929688f, 48.191406f, 11.929688f, 44.910156f, 15.210938f);
        instancePath.lineTo(33.242188f, 26.878906f);
        Path path2 = instancePath;
        path2.cubicTo(29.960938f, 30.160156f, 29.960938f, 35.476562f, 33.242188f, 38.757812f);
        instancePath.lineTo(30.695312f, 41.304688f);
        path2.cubicTo(26.011719f, 36.617188f, 26.011719f, 29.019531f, 30.695312f, 24.332031f);
        instancePath.lineTo(42.36328f, 12.664062f);
        Path path3 = instancePath;
        path3.cubicTo(47.05078f, 7.980469f, 54.648438f, 7.980469f, 59.335938f, 12.664062f);
        path3.cubicTo(64.01953f, 17.351562f, 64.01953f, 24.949219f, 59.335938f, 29.636719f);
        instancePath.close();
        instancePath.moveTo(19.03125f, 36.0f);
        instancePath.lineTo(21.574219f, 38.546875f);
        instancePath.lineTo(15.210938f, 44.910156f);
        Path path4 = instancePath;
        path4.cubicTo(11.929688f, 48.191406f, 11.929688f, 53.507812f, 15.210938f, 56.789062f);
        path4.cubicTo(18.492188f, 60.070312f, 23.808594f, 60.070312f, 27.089844f, 56.789062f);
        instancePath.lineTo(38.757812f, 45.121094f);
        Path path5 = instancePath;
        path5.cubicTo(42.039062f, 41.839844f, 42.039062f, 36.523438f, 38.757812f, 33.242188f);
        instancePath.lineTo(41.304688f, 30.695312f);
        path5.cubicTo(45.98828f, 35.382812f, 45.98828f, 42.98047f, 41.304688f, 47.66797f);
        instancePath.lineTo(29.636719f, 59.335938f);
        Path path6 = instancePath;
        path6.cubicTo(24.949219f, 64.01953f, 17.351562f, 64.01953f, 12.664062f, 59.335938f);
        path6.cubicTo(7.980469f, 54.648438f, 7.980469f, 47.05078f, 12.664062f, 42.36328f);
        instancePath.close();
        instancePath.moveTo(19.03125f, 36.0f);
        WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
