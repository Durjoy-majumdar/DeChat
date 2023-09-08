package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_imac */
public class icons_outlined_imac extends C24542c {
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
            canvas.save();
            Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(66.0f, 54.0f);
            instancePath.cubicTo(66.0f, 55.65625f, 64.65625f, 57.0f, 63.0f, 57.0f);
            instancePath.lineTo(45.464844f, 57.0f);
            instancePath.lineTo(47.33203f, 62.51953f);
            Path path = instancePath;
            path.cubicTo(47.382812f, 62.67578f, 47.410156f, 62.835938f, 47.410156f, 63.0f);
            path.cubicTo(47.410156f, 63.828125f, 46.73828f, 64.5f, 45.910156f, 64.5f);
            instancePath.lineTo(26.089844f, 64.5f);
            Path path2 = instancePath;
            path2.cubicTo(25.925781f, 64.5f, 25.765625f, 64.47266f, 25.609375f, 64.421875f);
            path2.cubicTo(24.824219f, 64.15625f, 24.402344f, 63.304688f, 24.667969f, 62.51953f);
            instancePath.lineTo(26.527344f, 57.0f);
            instancePath.lineTo(9.0f, 57.0f);
            instancePath.cubicTo(7.34375f, 57.0f, 6.0f, 55.65625f, 6.0f, 54.0f);
            instancePath.lineTo(6.0f, 15.0f);
            instancePath.cubicTo(6.0f, 13.34375f, 7.34375f, 12.0f, 9.0f, 12.0f);
            instancePath.lineTo(63.0f, 12.0f);
            instancePath.cubicTo(64.65625f, 12.0f, 66.0f, 13.34375f, 66.0f, 15.0f);
            instancePath.close();
            instancePath.moveTo(41.66797f, 57.0f);
            instancePath.lineTo(30.332031f, 57.0f);
            instancePath.lineTo(29.015625f, 60.898438f);
            instancePath.lineTo(42.984375f, 60.898438f);
            instancePath.close();
            instancePath.moveTo(62.398438f, 48.601562f);
            instancePath.lineTo(9.597656f, 48.601562f);
            instancePath.lineTo(9.601562f, 53.398438f);
            instancePath.lineTo(62.398438f, 53.398438f);
            instancePath.close();
            instancePath.moveTo(62.398438f, 15.601562f);
            instancePath.lineTo(9.601562f, 15.601562f);
            instancePath.lineTo(9.597656f, 45.0f);
            instancePath.lineTo(62.398438f, 45.0f);
            instancePath.close();
            instancePath.moveTo(62.398438f, 15.601562f);
            WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
