package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.appbrand_menu_sales_driving */
public class appbrand_menu_sales_driving extends C24542c {
    private final int height = 32;
    private final int width = 32;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 32;
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
        instancePaint3.setColor(-40634);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(16.0f, 2.1333334f);
        instancePath.cubicTo(18.50369f, 2.1333334f, 20.533333f, 3.9838898f, 20.533333f, 6.266667f);
        instancePath.lineTo(20.532515f, 8.799334f);
        instancePath.lineTo(23.552595f, 8.8f);
        instancePath.cubicTo(24.254547f, 8.8f, 24.836283f, 9.344244f, 24.882977f, 10.0446415f);
        instancePath.lineTo(26.038532f, 27.377975f);
        instancePath.cubicTo(26.087515f, 28.112724f, 25.531591f, 28.748064f, 24.796843f, 28.797047f);
        instancePath.lineTo(24.70815f, 28.8f);
        instancePath.lineTo(7.2918487f, 28.8f);
        instancePath.cubicTo(6.555469f, 28.8f, 5.958515f, 28.203047f, 5.958515f, 27.466667f);
        instancePath.lineTo(7.117024f, 10.0446415f);
        Path path = instancePath;
        path.cubicTo(7.1637173f, 9.344244f, 7.7454524f, 8.8f, 8.447404f, 8.8f);
        instancePath.lineTo(11.466516f, 8.799334f);
        instancePath.lineTo(11.466667f, 6.266667f);
        path.cubicTo(11.466667f, 3.9838898f, 13.496309f, 2.1333334f, 16.0f, 2.1333334f);
        instancePath.close();
        instancePath.moveTo(16.0f, 4.0f);
        path.cubicTo(14.5626f, 4.0f, 13.44436f, 4.9571643f, 13.34112f, 6.0947695f);
        instancePath.lineTo(13.333333f, 6.266667f);
        instancePath.lineTo(13.331515f, 8.799334f);
        instancePath.lineTo(18.665516f, 8.799334f);
        instancePath.lineTo(18.666666f, 6.266667f);
        path.cubicTo(18.666666f, 5.112959f, 17.616873f, 4.1008563f, 16.213129f, 4.0070815f);
        instancePath.lineTo(16.0f, 4.0f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
