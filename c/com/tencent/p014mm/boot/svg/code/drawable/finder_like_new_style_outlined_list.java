package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.finder_like_new_style_outlined_list */
public class finder_like_new_style_outlined_list extends C24542c {
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
        instancePath2.moveTo(66.0f, 62.4f);
        instancePath2.lineTo(66.0f, 66.0f);
        instancePath2.lineTo(46.5f, 66.0f);
        instancePath2.lineTo(46.5f, 62.4f);
        instancePath2.lineTo(66.0f, 62.4f);
        instancePath2.close();
        instancePath2.moveTo(13.508074f, 10.341927f);
        instancePath2.lineTo(23.266148f, 20.1f);
        instancePath2.lineTo(20.720562f, 22.645584f);
        instancePath2.lineTo(15.3f, 17.226927f);
        instancePath2.lineTo(15.3f, 39.0f);
        instancePath2.cubicTo(15.3f, 47.728794f, 22.203497f, 54.84519f, 30.848444f, 55.187138f);
        instancePath2.lineTo(31.5f, 55.2f);
        instancePath2.lineTo(41.997f, 55.197f);
        instancePath2.lineTo(41.997f, 58.797f);
        instancePath2.lineTo(31.5f, 58.8f);
        instancePath2.cubicTo(20.797426f, 58.8f, 12.078161f, 50.30845f, 11.711973f, 39.695118f);
        instancePath2.lineTo(11.7f, 39.0f);
        instancePath2.lineTo(11.7f, 17.240927f);
        instancePath2.lineTo(6.295584f, 22.645584f);
        instancePath2.lineTo(3.75f, 20.1f);
        instancePath2.lineTo(13.508074f, 10.341927f);
        instancePath2.close();
        instancePath2.moveTo(66.0f, 54.3f);
        instancePath2.lineTo(66.0f, 57.9f);
        instancePath2.lineTo(46.5f, 57.9f);
        instancePath2.lineTo(46.5f, 54.3f);
        instancePath2.lineTo(66.0f, 54.3f);
        instancePath2.close();
        instancePath2.moveTo(66.0f, 46.2f);
        instancePath2.lineTo(66.0f, 49.8f);
        instancePath2.lineTo(46.5f, 49.8f);
        instancePath2.lineTo(46.5f, 46.2f);
        instancePath2.lineTo(66.0f, 46.2f);
        instancePath2.close();
        instancePath2.moveTo(28.494f, 13.197f);
        instancePath2.lineTo(40.5f, 13.2f);
        Path path = instancePath2;
        path.cubicTo(51.20257f, 13.2f, 59.92184f, 21.691551f, 60.288025f, 32.304882f);
        instancePath2.lineTo(60.3f, 33.0f);
        instancePath2.lineTo(60.3f, 41.7f);
        instancePath2.lineTo(56.697f, 41.7f);
        instancePath2.lineTo(56.7f, 33.0f);
        path.cubicTo(56.7f, 24.495022f, 50.14599f, 17.520815f, 41.81303f, 16.852442f);
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
