package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outline_change_speed */
public class icons_outline_change_speed extends C24542c {
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
                canvas.save();
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-436207616);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(36.0f, 6.0f);
                Path path = instancePath;
                path.cubicTo(52.568542f, 6.0f, 66.0f, 19.431458f, 66.0f, 36.0f);
                path.cubicTo(66.0f, 52.568542f, 52.568542f, 66.0f, 36.0f, 66.0f);
                path.cubicTo(19.431458f, 66.0f, 6.0f, 52.568542f, 6.0f, 36.0f);
                path.cubicTo(6.0f, 19.431458f, 19.431458f, 6.0f, 36.0f, 6.0f);
                instancePath.close();
                instancePath.moveTo(36.0f, 10.8f);
                Path path2 = instancePath;
                path2.cubicTo(22.082424f, 10.8f, 10.8f, 22.082424f, 10.8f, 36.0f);
                path2.cubicTo(10.8f, 49.917576f, 22.082424f, 61.2f, 36.0f, 61.2f);
                path2.cubicTo(49.917576f, 61.2f, 61.2f, 49.917576f, 61.2f, 36.0f);
                path2.cubicTo(61.2f, 22.082424f, 49.917576f, 10.8f, 36.0f, 10.8f);
                instancePath.close();
                instancePath.moveTo(47.39183f, 23.515844f);
                instancePath.cubicTo(47.463448f, 23.661095f, 47.473305f, 23.829126f, 47.419167f, 23.981754f);
                instancePath.lineTo(42.45432f, 37.982044f);
                Path path3 = instancePath;
                path3.cubicTo(41.60756f, 40.74275f, 39.03819f, 42.75f, 36.0f, 42.75f);
                path3.cubicTo(32.27208f, 42.75f, 29.25f, 39.72792f, 29.25f, 36.0f);
                path3.cubicTo(29.25f, 33.34366f, 30.784407f, 31.045694f, 33.015236f, 29.944092f);
                instancePath.lineTo(33.008957f, 29.938238f);
                instancePath.lineTo(46.58836f, 23.243027f);
                instancePath.cubicTo(46.885567f, 23.09649f, 47.245296f, 23.218636f, 47.39183f, 23.515844f);
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
