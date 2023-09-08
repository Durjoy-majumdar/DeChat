package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_subscriptions */
public class icons_outlined_subscriptions extends C24542c {
    private final int height = 72;
    private final int width = 72;

    public int doCommand(int i, Object... objArr) {
        if (i == 0 || i == 1) {
            return 72;
        }
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
            instancePath.moveTo(12.0f, 9.0f);
            instancePath.cubicTo(12.0f, 7.343146f, 13.343145f, 6.0f, 15.0f, 6.0f);
            instancePath.lineTo(57.0f, 6.0f);
            instancePath.cubicTo(58.656853f, 6.0f, 60.0f, 7.343146f, 60.0f, 9.0f);
            instancePath.lineTo(60.0f, 63.0f);
            instancePath.cubicTo(60.0f, 64.65685f, 58.656853f, 66.0f, 57.0f, 66.0f);
            instancePath.lineTo(15.0f, 66.0f);
            instancePath.cubicTo(13.343145f, 66.0f, 12.0f, 64.65685f, 12.0f, 63.0f);
            instancePath.lineTo(12.0f, 9.0f);
            instancePath.close();
            instancePath.moveTo(15.6f, 9.6f);
            instancePath.lineTo(15.6f, 62.4f);
            instancePath.lineTo(56.4f, 62.4f);
            instancePath.lineTo(56.4f, 9.6f);
            instancePath.lineTo(15.6f, 9.6f);
            instancePath.close();
            instancePath.moveTo(25.5f, 24.0f);
            Path path = instancePath;
            path.cubicTo(23.014719f, 24.0f, 21.0f, 21.985281f, 21.0f, 19.5f);
            path.cubicTo(21.0f, 17.014719f, 23.014719f, 15.0f, 25.5f, 15.0f);
            path.cubicTo(27.985281f, 15.0f, 30.0f, 17.014719f, 30.0f, 19.5f);
            path.cubicTo(30.0f, 21.985281f, 27.985281f, 24.0f, 25.5f, 24.0f);
            instancePath.close();
            instancePath.moveTo(21.0f, 30.0f);
            instancePath.lineTo(43.5f, 30.0f);
            instancePath.lineTo(43.5f, 33.6f);
            instancePath.lineTo(21.0f, 33.6f);
            instancePath.lineTo(21.0f, 30.0f);
            instancePath.close();
            instancePath.moveTo(21.0f, 39.0f);
            instancePath.lineTo(33.0f, 39.0f);
            instancePath.lineTo(33.0f, 42.6f);
            instancePath.lineTo(21.0f, 42.6f);
            instancePath.lineTo(21.0f, 39.0f);
            instancePath.close();
            instancePath.moveTo(21.0f, 48.0f);
            instancePath.lineTo(33.0f, 48.0f);
            instancePath.lineTo(33.0f, 51.6f);
            instancePath.lineTo(21.0f, 51.6f);
            instancePath.lineTo(21.0f, 48.0f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
