package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_shop */
public class icons_filled_shop extends C24542c {
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
        canvas.save();
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(36.0f, 6.0f);
        instancePath.cubicTo(43.45703f, 6.0f, 49.5f, 12.042969f, 49.5f, 19.5f);
        instancePath.lineTo(49.5f, 21.0f);
        instancePath.lineTo(45.0f, 21.0f);
        instancePath.lineTo(45.0f, 33.0f);
        instancePath.lineTo(49.5f, 33.0f);
        instancePath.lineTo(49.5f, 21.0f);
        instancePath.lineTo(56.996094f, 21.0f);
        instancePath.cubicTo(58.65625f, 21.0f, 60.0f, 22.347656f, 60.0f, 24.023438f);
        instancePath.lineTo(60.0f, 60.023438f);
        instancePath.cubicTo(60.0f, 63.32422f, 57.316406f, 66.0f, 54.01953f, 66.0f);
        instancePath.lineTo(17.980469f, 66.0f);
        instancePath.cubicTo(14.679688f, 66.0f, 12.0f, 63.320312f, 12.0f, 60.023438f);
        instancePath.lineTo(12.0f, 24.023438f);
        Path path = instancePath;
        path.cubicTo(12.0f, 22.351562f, 13.332031f, 21.0f, 15.003906f, 21.0f);
        instancePath.lineTo(22.5f, 21.0f);
        instancePath.lineTo(22.5f, 19.5f);
        path.cubicTo(22.5f, 12.042969f, 28.542969f, 6.0f, 36.0f, 6.0f);
        instancePath.close();
        instancePath.moveTo(36.0f, 10.5f);
        path.cubicTo(31.03125f, 10.5f, 27.0f, 14.53125f, 27.0f, 19.5f);
        instancePath.lineTo(27.0f, 21.0f);
        instancePath.lineTo(22.5f, 21.0f);
        instancePath.lineTo(22.5f, 33.0f);
        instancePath.lineTo(27.0f, 33.0f);
        instancePath.lineTo(27.0f, 21.0f);
        instancePath.lineTo(45.0f, 21.0f);
        instancePath.lineTo(45.0f, 19.5f);
        instancePath.cubicTo(45.0f, 14.53125f, 40.96875f, 10.5f, 36.0f, 10.5f);
        instancePath.close();
        instancePath.moveTo(36.0f, 10.5f);
        WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
