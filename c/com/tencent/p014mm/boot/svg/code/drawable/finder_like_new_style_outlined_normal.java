package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.finder_like_new_style_outlined_normal */
public class finder_like_new_style_outlined_normal extends C24542c {
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
        instancePaint3.setColor(-2565928);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(0.0f, 0.0f);
        instancePath.lineTo(72.0f, 0.0f);
        instancePath.lineTo(72.0f, 72.0f);
        instancePath.lineTo(25.116943f, 72.0f);
        instancePath.lineTo(0.0f, 72.0f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.saveLayerAlpha((RectF) null, 0, 31);
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-16777216);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(29.55f, 14.4f);
        instancePath2.lineTo(38.556f, 14.403f);
        instancePath2.cubicTo(49.25857f, 14.403f, 57.97784f, 22.89455f, 58.344025f, 33.507885f);
        instancePath2.lineTo(58.356f, 34.203f);
        instancePath2.lineTo(58.356f, 54.721f);
        instancePath2.lineTo(63.746563f, 49.33249f);
        instancePath2.lineTo(66.292145f, 51.878075f);
        instancePath2.lineTo(56.534073f, 61.636147f);
        instancePath2.lineTo(46.776f, 51.878075f);
        instancePath2.lineTo(49.321583f, 49.33249f);
        instancePath2.lineTo(54.59f, 54.601f);
        instancePath2.lineTo(54.756f, 54.603f);
        instancePath2.lineTo(54.756f, 34.203f);
        instancePath2.cubicTo(54.756f, 25.698023f, 48.20199f, 18.723816f, 39.86903f, 18.055443f);
        instancePath2.lineTo(39.207554f, 18.015863f);
        instancePath2.lineTo(38.556f, 18.003f);
        instancePath2.lineTo(33.15f, 18.0f);
        instancePath2.lineTo(29.55f, 14.4f);
        instancePath2.close();
        instancePath2.moveTo(15.458074f, 10.341927f);
        instancePath2.lineTo(25.216146f, 20.1f);
        instancePath2.lineTo(22.670563f, 22.645584f);
        instancePath2.lineTo(17.25f, 17.226927f);
        instancePath2.lineTo(17.25f, 37.803f);
        instancePath2.cubicTo(17.25f, 46.53179f, 24.153498f, 53.64819f, 32.798443f, 53.990135f);
        instancePath2.lineTo(33.45f, 54.003f);
        instancePath2.lineTo(38.847f, 54.0f);
        instancePath2.lineTo(42.447f, 57.6f);
        instancePath2.lineTo(33.45f, 57.603f);
        instancePath2.cubicTo(22.747427f, 57.603f, 14.028161f, 49.11145f, 13.661974f, 38.498116f);
        instancePath2.lineTo(13.65f, 37.803f);
        instancePath2.lineTo(13.65f, 17.240927f);
        instancePath2.lineTo(8.2455845f, 22.645584f);
        instancePath2.lineTo(5.7f, 20.1f);
        instancePath2.lineTo(15.458074f, 10.341927f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
