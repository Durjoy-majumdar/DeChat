package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_live_mark */
public class icons_filled_live_mark extends C24542c {
    private final int height = 72;
    private final int width = 72;

    public int doCommand(int i, Object... objArr) {
        int i2 = 72;
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
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-16777216);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(63.0f, 12.0f);
                instancePath.cubicTo(64.65685f, 12.0f, 66.0f, 13.343145f, 66.0f, 15.0f);
                instancePath.lineTo(66.0f, 57.0f);
                instancePath.cubicTo(66.0f, 58.656853f, 64.65685f, 60.0f, 63.0f, 60.0f);
                instancePath.lineTo(9.0f, 60.0f);
                instancePath.cubicTo(7.343146f, 60.0f, 6.0f, 58.656853f, 6.0f, 57.0f);
                instancePath.lineTo(6.0f, 15.0f);
                instancePath.cubicTo(6.0f, 13.343145f, 7.343146f, 12.0f, 9.0f, 12.0f);
                instancePath.lineTo(63.0f, 12.0f);
                instancePath.close();
                instancePath.moveTo(17.736328f, 28.089844f);
                instancePath.lineTo(14.197266f, 28.089844f);
                instancePath.lineTo(14.197266f, 45.0f);
                instancePath.lineTo(25.13086f, 45.0f);
                instancePath.lineTo(25.13086f, 42.070312f);
                instancePath.lineTo(17.736328f, 42.070312f);
                instancePath.lineTo(17.736328f, 28.089844f);
                instancePath.close();
                instancePath.moveTo(30.767578f, 28.089844f);
                instancePath.lineTo(27.228516f, 28.089844f);
                instancePath.lineTo(27.228516f, 45.0f);
                instancePath.lineTo(30.767578f, 45.0f);
                instancePath.lineTo(30.767578f, 28.089844f);
                instancePath.close();
                instancePath.moveTo(36.46289f, 28.089844f);
                instancePath.lineTo(32.501953f, 28.089844f);
                instancePath.lineTo(38.185547f, 45.0f);
                instancePath.lineTo(42.45117f, 45.0f);
                instancePath.lineTo(48.134766f, 28.089844f);
                instancePath.lineTo(44.279297f, 28.089844f);
                instancePath.lineTo(40.41211f, 41.35547f);
                instancePath.lineTo(40.33008f, 41.35547f);
                instancePath.lineTo(36.46289f, 28.089844f);
                instancePath.close();
                instancePath.moveTo(61.060547f, 28.089844f);
                instancePath.lineTo(49.85742f, 28.089844f);
                instancePath.lineTo(49.85742f, 45.0f);
                instancePath.lineTo(61.060547f, 45.0f);
                instancePath.lineTo(61.060547f, 42.070312f);
                instancePath.lineTo(53.396484f, 42.070312f);
                instancePath.lineTo(53.396484f, 37.804688f);
                instancePath.lineTo(60.626953f, 37.804688f);
                instancePath.lineTo(60.626953f, 35.085938f);
                instancePath.lineTo(53.396484f, 35.085938f);
                instancePath.lineTo(53.396484f, 31.007812f);
                instancePath.lineTo(61.060547f, 31.007812f);
                instancePath.lineTo(61.060547f, 28.089844f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i2;
    }
}
