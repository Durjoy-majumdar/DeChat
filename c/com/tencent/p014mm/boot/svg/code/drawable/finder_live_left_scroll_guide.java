package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.finder_live_left_scroll_guide */
public class finder_live_left_scroll_guide extends C24542c {
    private final int height = 72;
    private final int width = 72;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 72;
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
            instancePaint3.setColor(-2565928);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(0.0f, 0.0f);
            instancePath.lineTo(72.0f, 0.0f);
            instancePath.lineTo(72.0f, 72.0f);
            instancePath.lineTo(0.0f, 72.0f);
            instancePath.lineTo(0.0f, 0.0f);
            instancePath.close();
            canvas.saveLayerAlpha((RectF) null, 0, 31);
            canvas.drawPath(instancePath, C24542c.instancePaint(instancePaint3, looper));
            canvas.restore();
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
            instancePaint4.setColor(-436207616);
            Path instancePath2 = C24542c.instancePath(looper);
            instancePath2.moveTo(27.87868f, 16.80868f);
            instancePath2.lineTo(32.12132f, 21.051321f);
            instancePath2.lineTo(20.164774f, 33.00468f);
            instancePath2.lineTo(63.0f, 33.005226f);
            instancePath2.lineTo(63.0f, 39.005226f);
            instancePath2.lineTo(20.167774f, 39.00468f);
            instancePath2.lineTo(32.12132f, 50.959133f);
            instancePath2.lineTo(27.87868f, 55.20177f);
            instancePath2.lineTo(10.803453f, 38.126545f);
            instancePath2.cubicTo(9.722002f, 37.045094f, 9.638813f, 35.343403f, 10.553888f, 34.166527f);
            instancePath2.lineTo(10.803453f, 33.883907f);
            instancePath2.lineTo(27.87868f, 16.80868f);
            instancePath2.close();
            WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
            canvas.drawPath(instancePath2, instancePaint4);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
