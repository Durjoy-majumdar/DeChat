package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_imac_lock */
public class icons_outlined_imac_lock extends C24542c {
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
        instancePath.moveTo(69.015625f, 45.0f);
        instancePath.cubicTo(70.66406f, 45.0f, 72.0f, 46.339844f, 72.0f, 47.98828f);
        instancePath.lineTo(72.0f, 64.51172f);
        instancePath.cubicTo(72.0f, 66.16406f, 70.63281f, 67.5f, 69.015625f, 67.5f);
        instancePath.lineTo(44.984375f, 67.5f);
        instancePath.cubicTo(43.335938f, 67.5f, 42.0f, 66.16016f, 42.0f, 64.51172f);
        instancePath.lineTo(42.0f, 64.5f);
        instancePath.lineTo(26.089844f, 64.5f);
        Path path = instancePath;
        path.cubicTo(25.925781f, 64.5f, 25.765625f, 64.47266f, 25.609375f, 64.421875f);
        path.cubicTo(24.824219f, 64.15625f, 24.402344f, 63.304688f, 24.667969f, 62.51953f);
        instancePath.lineTo(26.535156f, 57.0f);
        instancePath.lineTo(9.0f, 57.0f);
        instancePath.cubicTo(7.34375f, 57.0f, 6.0f, 55.65625f, 6.0f, 54.0f);
        instancePath.lineTo(6.0f, 15.0f);
        instancePath.cubicTo(6.0f, 13.34375f, 7.34375f, 12.0f, 9.0f, 12.0f);
        instancePath.lineTo(63.0f, 12.0f);
        instancePath.cubicTo(64.65625f, 12.0f, 66.0f, 13.34375f, 66.0f, 15.0f);
        instancePath.lineTo(66.0f, 45.0f);
        instancePath.close();
        instancePath.moveTo(68.39844f, 48.601562f);
        instancePath.lineTo(66.0f, 48.597656f);
        instancePath.lineTo(66.0f, 48.601562f);
        instancePath.lineTo(45.597656f, 48.601562f);
        instancePath.lineTo(45.601562f, 63.898438f);
        instancePath.lineTo(68.39844f, 63.898438f);
        instancePath.close();
        instancePath.moveTo(42.0f, 56.996094f);
        instancePath.lineTo(30.332031f, 57.0f);
        instancePath.lineTo(29.015625f, 60.898438f);
        instancePath.lineTo(42.0f, 60.898438f);
        instancePath.close();
        instancePath.moveTo(42.0f, 48.601562f);
        instancePath.lineTo(9.597656f, 48.601562f);
        instancePath.lineTo(9.601562f, 53.398438f);
        instancePath.lineTo(42.0f, 53.398438f);
        instancePath.close();
        instancePath.moveTo(62.398438f, 15.601562f);
        instancePath.lineTo(9.601562f, 15.601562f);
        instancePath.lineTo(9.597656f, 45.0f);
        instancePath.lineTo(48.0f, 45.0f);
        instancePath.lineTo(48.0f, 44.101562f);
        Path path2 = instancePath;
        path2.cubicTo(48.0f, 38.796875f, 52.03125f, 34.5f, 57.0f, 34.5f);
        path2.cubicTo(59.027344f, 34.5f, 60.89453f, 35.214844f, 62.398438f, 36.41797f);
        instancePath.close();
        instancePath.moveTo(57.0f, 38.101562f);
        path2.cubicTo(54.070312f, 38.101562f, 51.601562f, 40.734375f, 51.601562f, 44.101562f);
        instancePath.lineTo(51.601562f, 45.0f);
        instancePath.lineTo(62.398438f, 45.0f);
        instancePath.lineTo(62.398438f, 44.101562f);
        instancePath.cubicTo(62.398438f, 40.734375f, 59.929688f, 38.101562f, 57.0f, 38.101562f);
        instancePath.close();
        instancePath.moveTo(57.0f, 38.101562f);
        WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
