package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_live_screencast */
public class icons_filled_live_screencast extends C24542c {
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
        instancePath.moveTo(63.0f, 9.0f);
        instancePath.cubicTo(64.65625f, 9.0f, 66.0f, 10.34375f, 66.0f, 12.0f);
        instancePath.lineTo(66.0f, 45.0f);
        instancePath.cubicTo(66.0f, 46.65625f, 64.65625f, 48.0f, 63.0f, 48.0f);
        instancePath.lineTo(48.29297f, 48.0f);
        instancePath.lineTo(50.890625f, 52.5f);
        instancePath.lineTo(51.0f, 52.5f);
        instancePath.lineTo(51.0f, 52.6875f);
        instancePath.lineTo(57.007812f, 63.09375f);
        instancePath.lineTo(51.808594f, 66.09375f);
        instancePath.lineTo(47.42578f, 58.5f);
        instancePath.lineTo(24.578125f, 58.5f);
        instancePath.lineTo(20.195312f, 66.09375f);
        instancePath.lineTo(15.0f, 63.09375f);
        instancePath.lineTo(21.0f, 52.695312f);
        instancePath.lineTo(21.0f, 52.5f);
        instancePath.lineTo(21.109375f, 52.5f);
        instancePath.lineTo(23.710938f, 48.0f);
        instancePath.lineTo(9.0f, 48.0f);
        instancePath.cubicTo(7.34375f, 48.0f, 6.0f, 46.65625f, 6.0f, 45.0f);
        instancePath.lineTo(6.0f, 12.0f);
        instancePath.cubicTo(6.0f, 10.34375f, 7.34375f, 9.0f, 9.0f, 9.0f);
        instancePath.close();
        instancePath.moveTo(41.359375f, 48.0f);
        instancePath.lineTo(30.640625f, 48.0f);
        instancePath.lineTo(28.042969f, 52.5f);
        instancePath.lineTo(43.960938f, 52.5f);
        instancePath.close();
        instancePath.moveTo(60.0f, 15.0f);
        instancePath.lineTo(12.0f, 15.0f);
        instancePath.lineTo(12.0f, 42.0f);
        instancePath.lineTo(60.0f, 42.0f);
        instancePath.close();
        instancePath.moveTo(60.0f, 15.0f);
        WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
