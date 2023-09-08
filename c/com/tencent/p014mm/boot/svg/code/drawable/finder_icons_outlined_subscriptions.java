package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.finder_icons_outlined_subscriptions */
public class finder_icons_outlined_subscriptions extends C24542c {
    private final int height = 24;
    private final int width = 24;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 24;
        }
        if (i2 == 2) {
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
            instancePath.moveTo(4.0f, 3.0f);
            instancePath.cubicTo(4.0f, 2.4477153f, 4.4477153f, 2.0f, 5.0f, 2.0f);
            instancePath.lineTo(19.0f, 2.0f);
            instancePath.cubicTo(19.552284f, 2.0f, 20.0f, 2.4477153f, 20.0f, 3.0f);
            instancePath.lineTo(20.0f, 21.0f);
            instancePath.cubicTo(20.0f, 21.552284f, 19.552284f, 22.0f, 19.0f, 22.0f);
            instancePath.lineTo(5.0f, 22.0f);
            instancePath.cubicTo(4.4477153f, 22.0f, 4.0f, 21.552284f, 4.0f, 21.0f);
            instancePath.lineTo(4.0f, 3.0f);
            instancePath.close();
            instancePath.moveTo(5.2f, 3.2f);
            instancePath.lineTo(5.2f, 20.8f);
            instancePath.lineTo(18.8f, 20.8f);
            instancePath.lineTo(18.8f, 3.2f);
            instancePath.lineTo(5.2f, 3.2f);
            instancePath.close();
            instancePath.moveTo(8.5f, 8.0f);
            Path path = instancePath;
            path.cubicTo(7.6715727f, 8.0f, 7.0f, 7.3284273f, 7.0f, 6.5f);
            path.cubicTo(7.0f, 5.6715727f, 7.6715727f, 5.0f, 8.5f, 5.0f);
            path.cubicTo(9.328427f, 5.0f, 10.0f, 5.6715727f, 10.0f, 6.5f);
            path.cubicTo(10.0f, 7.3284273f, 9.328427f, 8.0f, 8.5f, 8.0f);
            instancePath.close();
            instancePath.moveTo(7.0f, 10.0f);
            instancePath.lineTo(14.5f, 10.0f);
            instancePath.lineTo(14.5f, 11.2f);
            instancePath.lineTo(7.0f, 11.2f);
            instancePath.lineTo(7.0f, 10.0f);
            instancePath.close();
            instancePath.moveTo(7.0f, 13.0f);
            instancePath.lineTo(11.0f, 13.0f);
            instancePath.lineTo(11.0f, 14.2f);
            instancePath.lineTo(7.0f, 14.2f);
            instancePath.lineTo(7.0f, 13.0f);
            instancePath.close();
            instancePath.moveTo(7.0f, 16.0f);
            instancePath.lineTo(11.0f, 16.0f);
            instancePath.lineTo(11.0f, 17.2f);
            instancePath.lineTo(7.0f, 17.2f);
            instancePath.lineTo(7.0f, 16.0f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
