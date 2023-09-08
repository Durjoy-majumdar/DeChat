package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.app_avatar_shadow */
public class app_avatar_shadow extends C24542c {
    private final int height = 134;
    private final int width = 134;

    public int doCommand(int i, Object... objArr) {
        int i2 = 134;
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
                canvas.save();
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-4605512);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(67.0f, 134.0f);
                Path path = instancePath;
                path.cubicTo(104.003075f, 134.0f, 134.0f, 104.003075f, 134.0f, 67.0f);
                path.cubicTo(134.0f, 29.996922f, 104.003075f, 0.0f, 67.0f, 0.0f);
                path.cubicTo(29.996922f, 0.0f, 0.0f, 29.996922f, 0.0f, 67.0f);
                path.cubicTo(0.0f, 104.003075f, 29.996922f, 134.0f, 67.0f, 134.0f);
                instancePath.close();
                instancePath.moveTo(67.0f, 133.0f);
                Path path2 = instancePath;
                path2.cubicTo(103.45079f, 133.0f, 133.0f, 103.45079f, 133.0f, 67.0f);
                path2.cubicTo(133.0f, 30.549206f, 103.45079f, 1.0f, 67.0f, 1.0f);
                path2.cubicTo(30.549206f, 1.0f, 1.0f, 30.549206f, 1.0f, 67.0f);
                path2.cubicTo(1.0f, 103.45079f, 30.549206f, 133.0f, 67.0f, 133.0f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i2;
    }
}
