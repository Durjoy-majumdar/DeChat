package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_link */
public class icons_filled_link extends C24542c {
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
        instancePath.moveTo(40.910156f, 29.636719f);
        instancePath.cubicTo(45.59375f, 34.32422f, 45.59375f, 41.921875f, 40.910156f, 46.60547f);
        instancePath.lineTo(28.179688f, 59.335938f);
        Path path = instancePath;
        path.cubicTo(23.496094f, 64.01953f, 15.898438f, 64.01953f, 11.210938f, 59.335938f);
        path.cubicTo(6.523438f, 54.648438f, 6.523438f, 47.05078f, 11.210938f, 42.36328f);
        instancePath.lineTo(17.574219f, 36.0f);
        instancePath.lineTo(21.816406f, 40.242188f);
        instancePath.lineTo(15.453125f, 46.60547f);
        Path path2 = instancePath;
        path2.cubicTo(13.109375f, 48.94922f, 13.109375f, 52.75f, 15.453125f, 55.09375f);
        path2.cubicTo(17.796875f, 57.433594f, 21.59375f, 57.433594f, 23.9375f, 55.09375f);
        instancePath.lineTo(36.66797f, 42.36328f);
        Path path3 = instancePath;
        path3.cubicTo(39.007812f, 40.01953f, 39.007812f, 36.222656f, 36.66797f, 33.878906f);
        instancePath.close();
        instancePath.moveTo(57.878906f, 12.664062f);
        path3.cubicTo(62.566406f, 17.351562f, 62.566406f, 24.949219f, 57.878906f, 29.636719f);
        instancePath.lineTo(51.515625f, 36.0f);
        instancePath.lineTo(47.273438f, 31.757812f);
        instancePath.lineTo(53.63672f, 25.394531f);
        Path path4 = instancePath;
        path4.cubicTo(55.98047f, 23.050781f, 55.98047f, 19.25f, 53.63672f, 16.90625f);
        path4.cubicTo(51.29297f, 14.566406f, 47.496094f, 14.566406f, 45.152344f, 16.90625f);
        instancePath.lineTo(32.421875f, 29.636719f);
        path4.cubicTo(30.082031f, 31.980469f, 30.082031f, 35.777344f, 32.421875f, 38.121094f);
        instancePath.lineTo(28.179688f, 42.36328f);
        path4.cubicTo(23.496094f, 37.67578f, 23.496094f, 30.078125f, 28.179688f, 25.394531f);
        instancePath.lineTo(40.910156f, 12.664062f);
        path4.cubicTo(45.59375f, 7.980469f, 53.191406f, 7.980469f, 57.878906f, 12.664062f);
        instancePath.close();
        instancePath.moveTo(57.878906f, 12.664062f);
        WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
