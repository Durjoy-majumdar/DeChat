package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_ringing */
public class icons_filled_ringing extends C24542c {
    private final int height = 24;
    private final int width = 24;

    public int doCommand(int i, Object... objArr) {
        int i2 = 24;
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
                instancePaint3.setColor(-436207616);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(12.035257f, 6.0f);
                instancePath.lineTo(15.675531f, 6.3497066f);
                instancePath.cubicTo(15.778631f, 6.3596177f, 15.857142f, 6.4430184f, 15.857142f, 6.542625f);
                instancePath.lineTo(15.857142f, 8.479497f);
                instancePath.cubicTo(15.857142f, 8.571278f, 15.790805f, 8.648163f, 15.701707f, 8.668257f);
                instancePath.lineTo(15.645417f, 8.673137f);
                instancePath.lineTo(13.436975f, 8.460491f);
                instancePath.lineTo(13.436975f, 16.061193f);
                instancePath.lineTo(13.427873f, 16.06182f);
                Path path = instancePath;
                path.cubicTo(13.325673f, 17.148512f, 12.375519f, 18.0f, 11.218488f, 18.0f);
                path.cubicTo(9.993251f, 18.0f, 9.0f, 17.045164f, 9.0f, 15.867313f);
                path.cubicTo(9.0f, 14.689464f, 9.993251f, 13.734628f, 11.218488f, 13.734628f);
                path.cubicTo(11.428403f, 13.734628f, 11.631509f, 13.762654f, 11.8239765f, 13.815028f);
                instancePath.lineTo(11.823528f, 6.1936398f);
                instancePath.cubicTo(11.823528f, 6.1018596f, 11.88987f, 6.024974f, 11.978968f, 6.00488f);
                instancePath.lineTo(12.035257f, 6.0f);
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
