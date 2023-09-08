package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.multitalk_icons_scrool */
public class multitalk_icons_scrool extends C24542c {
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
        canvas.save();
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-436207616);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(17.25f, 13.5f);
        instancePath.lineTo(17.25064f, 18.628893f);
        instancePath.lineTo(19.68198f, 16.1967f);
        instancePath.lineTo(20.742641f, 17.257359f);
        instancePath.lineTo(17.56064f, 20.438892f);
        instancePath.lineTo(17.56066f, 20.43934f);
        instancePath.lineTo(16.853554f, 21.146446f);
        instancePath.cubicTo(16.65829f, 21.34171f, 16.34171f, 21.34171f, 16.146446f, 21.146446f);
        instancePath.lineTo(16.146446f, 21.146446f);
        instancePath.lineTo(12.2573595f, 17.257359f);
        instancePath.lineTo(13.31802f, 16.1967f);
        instancePath.lineTo(15.750641f, 18.628893f);
        instancePath.lineTo(15.75f, 13.5f);
        instancePath.lineTo(17.25f, 13.5f);
        instancePath.close();
        instancePath.moveTo(8.25f, 15.0f);
        instancePath.lineTo(8.25f, 16.5f);
        instancePath.lineTo(6.75f, 16.5f);
        instancePath.lineTo(6.75f, 15.0f);
        instancePath.lineTo(8.25f, 15.0f);
        instancePath.close();
        instancePath.moveTo(8.25f, 12.0f);
        instancePath.lineTo(8.25f, 13.5f);
        instancePath.lineTo(6.75f, 13.5f);
        instancePath.lineTo(6.75f, 12.0f);
        instancePath.lineTo(8.25f, 12.0f);
        instancePath.close();
        instancePath.moveTo(17.25f, 10.5f);
        instancePath.lineTo(17.25f, 12.0f);
        instancePath.lineTo(15.75f, 12.0f);
        instancePath.lineTo(15.75f, 10.5f);
        instancePath.lineTo(17.25f, 10.5f);
        instancePath.close();
        instancePath.moveTo(7.8535533f, 2.8535533f);
        instancePath.lineTo(11.7426405f, 6.7426405f);
        instancePath.lineTo(10.68198f, 7.803301f);
        instancePath.lineTo(8.250641f, 5.3711066f);
        instancePath.lineTo(8.25f, 10.5f);
        instancePath.lineTo(6.75f, 10.5f);
        instancePath.lineTo(6.750641f, 5.3711066f);
        instancePath.lineTo(4.3180194f, 7.803301f);
        instancePath.lineTo(3.2573593f, 6.7426405f);
        instancePath.lineTo(7.1464467f, 2.8535533f);
        instancePath.cubicTo(7.3417087f, 2.6582913f, 7.6582913f, 2.6582913f, 7.8535533f, 2.8535533f);
        instancePath.close();
        instancePath.moveTo(17.25f, 7.5f);
        instancePath.lineTo(17.25f, 9.0f);
        instancePath.lineTo(15.75f, 9.0f);
        instancePath.lineTo(15.75f, 7.5f);
        instancePath.lineTo(17.25f, 7.5f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
