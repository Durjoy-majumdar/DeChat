package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_tv */
public class icons_outlined_tv extends C24542c {
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
            instancePath.moveTo(9.6f, 15.6f);
            instancePath.lineTo(9.6f, 53.4f);
            instancePath.lineTo(62.4f, 53.4f);
            instancePath.lineTo(62.4f, 15.6f);
            instancePath.lineTo(9.6f, 15.6f);
            instancePath.close();
            instancePath.moveTo(6.0f, 15.0f);
            instancePath.cubicTo(6.0f, 13.343145f, 7.343146f, 12.0f, 9.0f, 12.0f);
            instancePath.lineTo(63.0f, 12.0f);
            instancePath.cubicTo(64.65685f, 12.0f, 66.0f, 13.343145f, 66.0f, 15.0f);
            instancePath.lineTo(66.0f, 54.0f);
            instancePath.cubicTo(66.0f, 55.656853f, 64.65685f, 57.0f, 63.0f, 57.0f);
            instancePath.lineTo(9.0f, 57.0f);
            Path path = instancePath;
            path.cubicTo(7.343146f, 57.0f, 6.0f, 55.656853f, 6.0f, 54.0f);
            instancePath.lineTo(6.0f, 15.0f);
            instancePath.close();
            instancePath.moveTo(24.0f, 62.699997f);
            path.cubicTo(24.0f, 61.705887f, 24.798523f, 60.899998f, 25.8039f, 60.899998f);
            instancePath.lineTo(46.1961f, 60.899998f);
            instancePath.cubicTo(47.192368f, 60.899998f, 48.0f, 61.698956f, 48.0f, 62.699997f);
            instancePath.lineTo(48.0f, 64.5f);
            instancePath.lineTo(24.0f, 64.5f);
            instancePath.lineTo(24.0f, 62.699997f);
            instancePath.close();
            instancePath.moveTo(29.42871f, 45.0f);
            instancePath.lineTo(26.14746f, 45.0f);
            instancePath.lineTo(26.14746f, 26.689453f);
            instancePath.lineTo(19.672852f, 26.689453f);
            instancePath.lineTo(19.672852f, 23.862305f);
            instancePath.lineTo(35.88867f, 23.862305f);
            instancePath.lineTo(35.88867f, 26.689453f);
            instancePath.lineTo(29.42871f, 26.689453f);
            instancePath.lineTo(29.42871f, 45.0f);
            instancePath.close();
            instancePath.moveTo(45.120117f, 45.0f);
            instancePath.lineTo(41.53125f, 45.0f);
            instancePath.lineTo(33.987305f, 23.862305f);
            instancePath.lineTo(37.546875f, 23.862305f);
            instancePath.lineTo(43.30371f, 41.308594f);
            instancePath.lineTo(43.3916f, 41.308594f);
            instancePath.lineTo(49.163086f, 23.862305f);
            instancePath.lineTo(52.664062f, 23.862305f);
            instancePath.lineTo(45.120117f, 45.0f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
