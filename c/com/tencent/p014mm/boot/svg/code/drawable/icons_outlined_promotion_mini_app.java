package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_promotion_mini_app */
public class icons_outlined_promotion_mini_app extends C24542c {
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
        instancePaint3.setColor(-16777216);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(20.0f, 3.0f);
        Path path = instancePath;
        path.cubicTo(20.552284f, 3.0f, 21.0f, 3.4477153f, 21.0f, 4.0f);
        instancePath.lineTo(21.0f, 20.0f);
        path.cubicTo(21.0f, 20.552284f, 20.552284f, 21.0f, 20.0f, 21.0f);
        instancePath.lineTo(4.0f, 21.0f);
        path.cubicTo(3.4477153f, 21.0f, 3.0f, 20.552284f, 3.0f, 20.0f);
        instancePath.lineTo(3.0f, 4.0f);
        path.cubicTo(3.0f, 3.4477153f, 3.4477153f, 3.0f, 4.0f, 3.0f);
        instancePath.lineTo(20.0f, 3.0f);
        instancePath.close();
        instancePath.moveTo(19.8f, 4.2f);
        instancePath.lineTo(4.2f, 4.2f);
        instancePath.lineTo(4.2f, 19.8f);
        instancePath.lineTo(19.8f, 19.8f);
        instancePath.lineTo(19.8f, 4.2f);
        instancePath.close();
        instancePath.moveTo(17.4f, 8.0f);
        path.cubicTo(17.698235f, 8.0f, 17.945646f, 8.217589f, 17.992147f, 8.502677f);
        instancePath.lineTo(18.0f, 8.6f);
        instancePath.lineTo(18.0f, 12.1f);
        instancePath.lineTo(16.8f, 12.1f);
        instancePath.lineTo(16.798737f, 10.048f);
        instancePath.lineTo(12.924264f, 13.924264f);
        path.cubicTo(12.715984f, 14.132544f, 12.392675f, 14.155685f, 12.1588335f, 13.9936905f);
        instancePath.lineTo(12.075736f, 13.924264f);
        instancePath.lineTo(10.5f, 12.349f);
        instancePath.lineTo(6.424264f, 16.424265f);
        instancePath.lineTo(5.575736f, 15.575736f);
        instancePath.lineTo(10.075736f, 11.075736f);
        path.cubicTo(10.284016f, 10.867456f, 10.607325f, 10.844315f, 10.8411665f, 11.0063095f);
        instancePath.lineTo(10.924264f, 11.075736f);
        instancePath.lineTo(12.5f, 12.651f);
        instancePath.lineTo(15.9517355f, 9.199f);
        instancePath.lineTo(13.9f, 9.2f);
        instancePath.lineTo(13.9f, 8.0f);
        instancePath.lineTo(17.4f, 8.0f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
