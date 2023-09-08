package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_search */
public class icons_outlined_search extends C24542c {
    private final int height = 72;
    private final int width = 72;

    public int doCommand(int i, Object... objArr) {
        int i2 = 72;
        if (!(i == 0 || i == 1)) {
            i2 = 0;
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
                C24542c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-16777216);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(48.929794f, 46.684208f);
                instancePath.lineTo(61.272793f, 59.027206f);
                instancePath.lineTo(58.727207f, 61.572792f);
                instancePath.lineTo(46.35855f, 49.204136f);
                Path path = instancePath;
                path.cubicTo(42.728428f, 52.200203f, 38.0744f, 54.0f, 33.0f, 54.0f);
                path.cubicTo(21.402f, 54.0f, 12.0f, 44.598f, 12.0f, 33.0f);
                path.cubicTo(12.0f, 21.402f, 21.402f, 12.0f, 33.0f, 12.0f);
                path.cubicTo(44.598f, 12.0f, 54.0f, 21.402f, 54.0f, 33.0f);
                path.cubicTo(54.0f, 38.22745f, 52.089996f, 43.00879f, 48.929794f, 46.684208f);
                instancePath.close();
                instancePath.moveTo(50.399994f, 33.00004f);
                Path path2 = instancePath;
                path2.cubicTo(50.399994f, 23.390265f, 42.609764f, 15.600037f, 32.999992f, 15.600037f);
                path2.cubicTo(23.39022f, 15.600037f, 15.599991f, 23.390265f, 15.599991f, 33.00004f);
                path2.cubicTo(15.599991f, 42.60981f, 23.39022f, 50.40004f, 32.999992f, 50.40004f);
                path2.cubicTo(42.609764f, 50.40004f, 50.399994f, 42.60981f, 50.399994f, 33.00004f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i2;
    }
}
