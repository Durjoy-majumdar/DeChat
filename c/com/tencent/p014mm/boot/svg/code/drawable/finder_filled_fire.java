package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.finder_filled_fire */
public class finder_filled_fire extends C24542c {
    private final int height = 24;
    private final int width = 24;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 24;
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
            canvas.save();
            Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-16777216);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(11.875f, 21.5f);
            Path path = instancePath;
            path.cubicTo(16.224243f, 21.5f, 19.75f, 18.477922f, 19.75f, 14.75f);
            path.cubicTo(19.75f, 12.579542f, 18.554852f, 10.648348f, 16.69787f, 9.413545f);
            path.cubicTo(16.3116f, 11.465161f, 15.224228f, 12.390485f, 14.618286f, 12.736572f);
            path.cubicTo(17.311035f, 5.655957f, 11.27872f, 2.0f, 10.050639f, 2.0f);
            path.cubicTo(11.5f, 5.9606447f, 7.5165544f, 8.84056f, 6.077288f, 10.181915f);
            path.cubicTo(4.7875156f, 11.383947f, 4.0f, 12.988145f, 4.0f, 14.75f);
            path.cubicTo(4.0f, 18.477922f, 7.525758f, 21.5f, 11.875f, 21.5f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 2);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
            instancePaint4.setColor(-2565928);
            Path instancePath2 = C24542c.instancePath(looper);
            instancePath2.moveTo(0.0f, 0.0f);
            instancePath2.lineTo(24.0f, 0.0f);
            instancePath2.lineTo(24.0f, 24.0f);
            instancePath2.lineTo(0.0f, 24.0f);
            instancePath2.lineTo(0.0f, 0.0f);
            instancePath2.close();
            canvas.saveLayerAlpha((RectF) null, 0, 31);
            canvas.drawPath(instancePath2, C24542c.instancePaint(instancePaint4, looper));
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
