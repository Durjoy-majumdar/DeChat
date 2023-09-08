package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_download */
public class icons_outlined_download extends C24542c {
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
        instancePaint3.setColor(-16777216);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(56.4f, 24.6f);
        instancePath.lineTo(48.0f, 24.6f);
        instancePath.lineTo(48.0f, 21.0f);
        instancePath.lineTo(57.00313f, 21.0f);
        instancePath.cubicTo(58.65261f, 21.0f, 60.0f, 22.337517f, 60.0f, 23.987425f);
        instancePath.lineTo(60.0f, 63.012573f);
        instancePath.cubicTo(60.0f, 64.65324f, 58.662483f, 66.0f, 57.012573f, 66.0f);
        instancePath.lineTo(14.987426f, 66.0f);
        instancePath.cubicTo(13.346761f, 66.0f, 12.0f, 64.66248f, 12.0f, 63.012573f);
        instancePath.lineTo(12.0f, 23.987425f);
        instancePath.cubicTo(12.0f, 22.34676f, 13.341744f, 21.0f, 14.99687f, 21.0f);
        instancePath.lineTo(24.0f, 21.0f);
        instancePath.lineTo(24.0f, 24.6f);
        instancePath.lineTo(15.6f, 24.6f);
        instancePath.lineTo(15.6f, 62.4f);
        instancePath.lineTo(56.4f, 62.4f);
        instancePath.lineTo(56.4f, 24.6f);
        instancePath.close();
        instancePath.moveTo(37.79998f, 37.85149f);
        instancePath.lineTo(44.061016f, 31.590454f);
        instancePath.lineTo(46.6066f, 34.13604f);
        instancePath.lineTo(38.12132f, 42.62132f);
        instancePath.cubicTo(36.94975f, 43.792892f, 35.05025f, 43.792892f, 33.87868f, 42.62132f);
        instancePath.lineTo(25.393398f, 34.13604f);
        instancePath.lineTo(27.938982f, 31.590454f);
        instancePath.lineTo(34.19998f, 37.85145f);
        instancePath.lineTo(34.19998f, 6.0f);
        instancePath.lineTo(37.79998f, 6.0f);
        instancePath.lineTo(37.79998f, 37.85149f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}