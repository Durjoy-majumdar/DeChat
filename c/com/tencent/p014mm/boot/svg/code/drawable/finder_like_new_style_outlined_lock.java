package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.finder_like_new_style_outlined_lock */
public class finder_like_new_style_outlined_lock extends C24542c {
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
        instancePaint4.setColor(-16777216);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(55.5f, 40.72867f);
        instancePath2.cubicTo(59.642136f, 40.72867f, 63.0f, 44.086533f, 63.0f, 48.22867f);
        instancePath2.lineTo(63.0f, 49.1271f);
        instancePath2.cubicTo(64.65685f, 49.1271f, 66.0f, 50.470245f, 66.0f, 52.1271f);
        instancePath2.lineTo(66.0f, 63.00636f);
        instancePath2.cubicTo(66.0f, 64.663216f, 64.65685f, 66.00636f, 63.0f, 66.00636f);
        instancePath2.lineTo(48.0f, 66.00636f);
        instancePath2.cubicTo(46.343147f, 66.00636f, 45.0f, 64.663216f, 45.0f, 63.00636f);
        instancePath2.lineTo(45.0f, 52.1271f);
        Path path = instancePath2;
        path.cubicTo(45.0f, 50.470245f, 46.343147f, 49.1271f, 48.0f, 49.1271f);
        instancePath2.lineTo(48.0f, 48.22867f);
        path.cubicTo(48.0f, 44.086533f, 51.357864f, 40.72867f, 55.5f, 40.72867f);
        instancePath2.close();
        instancePath2.moveTo(62.4f, 52.725f);
        instancePath2.lineTo(48.6f, 52.725f);
        instancePath2.lineTo(48.6f, 62.406f);
        instancePath2.lineTo(62.4f, 62.406f);
        instancePath2.lineTo(62.4f, 52.725f);
        instancePath2.close();
        instancePath2.moveTo(13.508074f, 10.341927f);
        instancePath2.lineTo(23.266148f, 20.1f);
        instancePath2.lineTo(20.720562f, 22.645584f);
        instancePath2.lineTo(15.3f, 17.226927f);
        instancePath2.lineTo(15.3f, 39.0f);
        instancePath2.cubicTo(15.3f, 47.728794f, 22.203497f, 54.84519f, 30.848444f, 55.187138f);
        instancePath2.lineTo(31.5f, 55.2f);
        instancePath2.lineTo(40.499f, 55.197f);
        instancePath2.lineTo(40.499f, 58.797f);
        instancePath2.lineTo(31.5f, 58.8f);
        instancePath2.cubicTo(20.797426f, 58.8f, 12.078161f, 50.30845f, 11.711973f, 39.695118f);
        instancePath2.lineTo(11.7f, 39.0f);
        instancePath2.lineTo(11.7f, 17.240927f);
        instancePath2.lineTo(6.295584f, 22.645584f);
        instancePath2.lineTo(3.75f, 20.1f);
        instancePath2.lineTo(13.508074f, 10.341927f);
        instancePath2.close();
        instancePath2.moveTo(55.5f, 44.32867f);
        instancePath2.cubicTo(53.48071f, 44.32867f, 51.819855f, 45.86332f, 51.620136f, 47.829918f);
        instancePath2.lineTo(51.6f, 48.22867f);
        instancePath2.lineTo(51.597f, 49.125668f);
        instancePath2.lineTo(59.4f, 49.125668f);
        instancePath2.lineTo(59.4f, 48.22867f);
        Path path2 = instancePath2;
        path2.cubicTo(59.4f, 46.209377f, 57.865353f, 44.548523f, 55.898754f, 44.348804f);
        instancePath2.lineTo(55.5f, 44.32867f);
        instancePath2.close();
        instancePath2.moveTo(28.494f, 13.197f);
        instancePath2.lineTo(40.5f, 13.2f);
        path2.cubicTo(51.20257f, 13.2f, 59.92184f, 21.691551f, 60.288025f, 32.304882f);
        instancePath2.lineTo(60.3f, 33.0f);
        instancePath2.lineTo(60.29974f, 37.22706f);
        path2.cubicTo(59.178383f, 36.737152f, 57.96768f, 36.413662f, 56.698856f, 36.287807f);
        instancePath2.lineTo(56.7f, 33.0f);
        path2.cubicTo(56.7f, 24.495022f, 50.14599f, 17.520815f, 41.81303f, 16.852442f);
        instancePath2.lineTo(41.151554f, 16.812864f);
        instancePath2.lineTo(40.5f, 16.8f);
        instancePath2.lineTo(32.094f, 16.797f);
        instancePath2.lineTo(28.494f, 13.197f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
