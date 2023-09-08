package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.finder_icons_filled_sight */
public class finder_icons_filled_sight extends C24542c {
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
                canvas.save();
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-16777216);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(9.0f, 16.667093f);
                instancePath.lineTo(36.0f, 8.25f);
                instancePath.lineTo(63.0f, 16.667093f);
                instancePath.lineTo(63.0f, 26.25f);
                instancePath.lineTo(9.0f, 26.25f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 1);
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
                instancePaint4.setColor(-16777216);
                Path instancePath2 = C24542c.instancePath(looper);
                instancePath2.moveTo(9.0f, 55.41f);
                instancePath2.lineTo(63.0f, 55.41f);
                instancePath2.lineTo(63.0f, 63.75f);
                instancePath2.lineTo(9.0f, 63.75f);
                instancePath2.close();
                WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
                WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint4);
                canvas.restore();
                canvas.save();
                Paint instancePaint5 = C24542c.instancePaint(instancePaint, looper);
                instancePaint5.setColor(-16777216);
                Path instancePath3 = C24542c.instancePath(looper);
                instancePath3.moveTo(14.345581f, 30.0f);
                instancePath3.lineTo(22.23816f, 30.0f);
                instancePath3.lineTo(22.23816f, 51.670166f);
                instancePath3.lineTo(14.345581f, 51.670166f);
                instancePath3.close();
                WeChatSVGRenderC2Java.setFillType(instancePath3, 1);
                WeChatSVGRenderC2Java.setFillType(instancePath3, 2);
                canvas.drawPath(instancePath3, instancePaint5);
                canvas.restore();
                canvas.save();
                Paint instancePaint6 = C24542c.instancePaint(instancePaint, looper);
                instancePaint6.setColor(-16777216);
                Path instancePath4 = C24542c.instancePath(looper);
                instancePath4.moveTo(32.05779f, 30.0f);
                instancePath4.lineTo(39.950367f, 30.0f);
                instancePath4.lineTo(39.950367f, 51.670166f);
                instancePath4.lineTo(32.05779f, 51.670166f);
                instancePath4.close();
                WeChatSVGRenderC2Java.setFillType(instancePath4, 1);
                WeChatSVGRenderC2Java.setFillType(instancePath4, 2);
                canvas.drawPath(instancePath4, instancePaint6);
                canvas.restore();
                canvas.save();
                Paint instancePaint7 = C24542c.instancePaint(instancePaint, looper);
                instancePaint7.setColor(-16777216);
                Path instancePath5 = C24542c.instancePath(looper);
                instancePath5.moveTo(49.77f, 30.0f);
                instancePath5.lineTo(57.66258f, 30.0f);
                instancePath5.lineTo(57.66258f, 51.670166f);
                instancePath5.lineTo(49.77f, 51.670166f);
                instancePath5.close();
                WeChatSVGRenderC2Java.setFillType(instancePath5, 1);
                WeChatSVGRenderC2Java.setFillType(instancePath5, 2);
                canvas.drawPath(instancePath5, instancePaint7);
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i2;
    }
}
