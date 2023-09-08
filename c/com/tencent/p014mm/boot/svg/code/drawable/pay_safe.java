package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.pay_safe */
public class pay_safe extends C24542c {
    private final int height = 24;
    private final int width = 24;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 24;
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
        instancePaint3.setColor(-436207616);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(12.0f, 2.5f);
        instancePath.lineTo(20.0f, 5.5f);
        instancePath.lineTo(20.0f, 11.253789f);
        Path path = instancePath;
        path.cubicTo(20.0f, 16.100143f, 16.701654f, 20.324587f, 12.0f, 21.5f);
        path.cubicTo(7.298345f, 20.324587f, 4.0f, 16.100143f, 4.0f, 11.253789f);
        instancePath.lineTo(4.0f, 5.5f);
        instancePath.lineTo(12.0f, 2.5f);
        instancePath.close();
        instancePath.moveTo(12.0f, 3.7369318f);
        instancePath.lineTo(5.2f, 6.4369316f);
        instancePath.lineTo(5.2f, 11.253789f);
        Path path2 = instancePath;
        path2.cubicTo(5.2f, 15.448791f, 7.9881096f, 19.118086f, 12.0f, 20.258121f);
        path2.cubicTo(16.01189f, 19.118086f, 18.8f, 15.448791f, 18.8f, 11.253789f);
        instancePath.lineTo(18.801006f, 10.326383f);
        instancePath.cubicTo(15.521906f, 12.101424f, 10.328912f, 14.912494f, 10.328912f, 14.912494f);
        instancePath.lineTo(10.269167f, 14.94499f);
        Path path3 = instancePath;
        path3.cubicTo(10.195391f, 14.97961f, 10.112337f, 15.0f, 10.024304f, 15.0f);
        path3.cubicTo(9.81995f, 15.0f, 9.6423f, 14.89444f, 9.549062f, 14.738543f);
        instancePath.lineTo(9.513533f, 14.665479f);
        instancePath.lineTo(8.026025f, 11.602328f);
        Path path4 = instancePath;
        path4.cubicTo(8.009957f, 11.568983f, 8.0f, 11.531177f, 8.0f, 11.494432f);
        path4.cubicTo(8.0f, 11.353402f, 8.121979f, 11.239135f, 8.272245f, 11.239135f);
        path4.cubicTo(8.333801f, 11.239135f, 8.389698f, 11.258038f, 8.435412f, 11.289897f);
        instancePath.lineTo(10.1904125f, 12.462525f);
        Path path5 = instancePath;
        path5.cubicTo(10.318275f, 12.541111f, 10.471936f, 12.587414f, 10.636687f, 12.587414f);
        path5.cubicTo(10.734677f, 12.587414f, 10.828594f, 12.570422f, 10.915722f, 12.540474f);
        path5.cubicTo(10.915722f, 12.540474f, 16.60513f, 10.16986f, 18.801807f, 9.256366f);
        instancePath.lineTo(18.8f, 6.4369316f);
        instancePath.lineTo(12.0f, 3.7369318f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-2565928);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(0.0f, 0.0f);
        instancePath2.lineTo(24.0f, 0.0f);
        instancePath2.lineTo(24.0f, 24.0f);
        instancePath2.lineTo(0.0f, 24.0f);
        instancePath2.lineTo(0.0f, 0.0f);
        instancePath2.close();
        canvas.saveLayerAlpha((RectF) null, 0, 31);
        canvas.drawPath(instancePath2, C24542c.instancePaint(instancePaint5, looper));
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
