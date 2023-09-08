package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.userguide_emostore_icon */
public class userguide_emostore_icon extends C24542c {
    private final int height = 96;
    private final int width = 96;

    public int doCommand(int i, Object... objArr) {
        int i2 = 96;
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
                instancePaint3.setColor(-9318371);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(47.999f, 15.0f);
                Path path = instancePath;
                path.cubicTo(29.773f, 15.0f, 15.0f, 29.774f, 15.0f, 48.0f);
                path.cubicTo(15.0f, 66.226f, 29.773f, 81.0f, 47.999f, 81.0f);
                path.cubicTo(66.225f, 81.0f, 81.0f, 66.226f, 81.0f, 48.0f);
                path.cubicTo(81.0f, 29.774f, 66.225f, 15.0f, 47.999f, 15.0f);
                instancePath.lineTo(47.999f, 15.0f);
                instancePath.close();
                instancePath.moveTo(62.0f, 31.0f);
                path.cubicTo(64.762f, 31.0f, 67.0f, 33.462f, 67.0f, 36.5f);
                path.cubicTo(67.0f, 39.538f, 64.762f, 42.0f, 62.0f, 42.0f);
                path.cubicTo(59.238f, 42.0f, 57.0f, 39.538f, 57.0f, 36.5f);
                path.cubicTo(57.0f, 33.462f, 59.238f, 31.0f, 62.0f, 31.0f);
                instancePath.lineTo(62.0f, 31.0f);
                instancePath.close();
                instancePath.moveTo(35.0f, 31.0f);
                path.cubicTo(37.762f, 31.0f, 40.0f, 33.462f, 40.0f, 36.5f);
                path.cubicTo(40.0f, 39.538f, 37.762f, 42.0f, 35.0f, 42.0f);
                path.cubicTo(32.238f, 42.0f, 30.0f, 39.538f, 30.0f, 36.5f);
                path.cubicTo(30.0f, 33.462f, 32.238f, 31.0f, 35.0f, 31.0f);
                instancePath.lineTo(35.0f, 31.0f);
                instancePath.close();
                instancePath.moveTo(48.0f, 71.0f);
                path.cubicTo(28.667f, 71.0f, 26.0f, 53.0f, 26.0f, 53.0f);
                path.cubicTo(26.0f, 53.0f, 40.361f, 51.0f, 48.0f, 51.0f);
                path.cubicTo(55.639f, 51.0f, 70.0f, 53.0f, 70.0f, 53.0f);
                path.cubicTo(70.0f, 53.0f, 67.333f, 71.0f, 48.0f, 71.0f);
                instancePath.lineTo(48.0f, 71.0f);
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
