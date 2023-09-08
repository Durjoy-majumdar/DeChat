package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_colorful_other_device */
public class icons_filled_colorful_other_device extends C24542c {
    private final int height = 32;
    private final int width = 32;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 32;
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
        instancePaint3.setColor(-16268960);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(28.0f, 7.0f);
        instancePath.cubicTo(29.10457f, 7.0f, 30.0f, 7.8954306f, 30.0f, 9.0f);
        instancePath.lineTo(30.0f, 13.0f);
        instancePath.cubicTo(30.0f, 14.104569f, 29.10457f, 15.0f, 28.0f, 15.0f);
        instancePath.lineTo(4.0f, 15.0f);
        instancePath.cubicTo(2.8954306f, 15.0f, 2.0f, 14.104569f, 2.0f, 13.0f);
        instancePath.lineTo(2.0f, 9.0f);
        Path path = instancePath;
        path.cubicTo(2.0f, 7.8954306f, 2.8954306f, 7.0f, 4.0f, 7.0f);
        instancePath.lineTo(28.0f, 7.0f);
        instancePath.close();
        instancePath.moveTo(12.0f, 10.0f);
        instancePath.lineTo(6.0f, 10.0f);
        path.cubicTo(5.4477153f, 10.0f, 5.0f, 10.447716f, 5.0f, 11.0f);
        path.cubicTo(5.0f, 11.552284f, 5.4477153f, 12.0f, 6.0f, 12.0f);
        instancePath.lineTo(6.0f, 12.0f);
        instancePath.lineTo(12.0f, 12.0f);
        path.cubicTo(12.552284f, 12.0f, 13.0f, 11.552284f, 13.0f, 11.0f);
        path.cubicTo(13.0f, 10.447716f, 12.552284f, 10.0f, 12.0f, 10.0f);
        instancePath.lineTo(12.0f, 10.0f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-16268960);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(28.0f, 17.0f);
        instancePath2.cubicTo(29.10457f, 17.0f, 30.0f, 17.89543f, 30.0f, 19.0f);
        instancePath2.lineTo(30.0f, 23.0f);
        instancePath2.cubicTo(30.0f, 24.10457f, 29.10457f, 25.0f, 28.0f, 25.0f);
        instancePath2.lineTo(4.0f, 25.0f);
        instancePath2.cubicTo(2.8954306f, 25.0f, 2.0f, 24.10457f, 2.0f, 23.0f);
        instancePath2.lineTo(2.0f, 19.0f);
        instancePath2.cubicTo(2.0f, 17.89543f, 2.8954306f, 17.0f, 4.0f, 17.0f);
        instancePath2.lineTo(28.0f, 17.0f);
        instancePath2.close();
        instancePath2.moveTo(12.0f, 20.0f);
        instancePath2.lineTo(6.0f, 20.0f);
        Path path2 = instancePath2;
        path2.cubicTo(5.4477153f, 20.0f, 5.0f, 20.447716f, 5.0f, 21.0f);
        path2.cubicTo(5.0f, 21.552284f, 5.4477153f, 22.0f, 6.0f, 22.0f);
        instancePath2.lineTo(6.0f, 22.0f);
        instancePath2.lineTo(12.0f, 22.0f);
        Path path3 = instancePath2;
        path3.cubicTo(12.552284f, 22.0f, 13.0f, 21.552284f, 13.0f, 21.0f);
        path3.cubicTo(13.0f, 20.447716f, 12.552284f, 20.0f, 12.0f, 20.0f);
        instancePath2.lineTo(12.0f, 20.0f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
