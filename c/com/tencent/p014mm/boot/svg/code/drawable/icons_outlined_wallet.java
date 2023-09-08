package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_wallet */
public class icons_outlined_wallet extends C24542c {
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
        instancePaint3.setColor(-16777216);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(63.0f, 12.0f);
        instancePath.cubicTo(64.65685f, 12.0f, 66.0f, 13.343145f, 66.0f, 15.0f);
        instancePath.lineTo(66.0f, 28.8f);
        instancePath.lineTo(65.939766f, 28.798904f);
        instancePath.cubicTo(65.97926f, 28.99311f, 66.0f, 29.194134f, 66.0f, 29.4f);
        instancePath.lineTo(66.0f, 29.4f);
        instancePath.lineTo(66.0f, 30.0f);
        instancePath.lineTo(66.0f, 30.0f);
        instancePath.lineTo(66.0f, 42.0f);
        instancePath.lineTo(66.0f, 42.0f);
        instancePath.lineTo(66.0f, 42.6f);
        instancePath.cubicTo(66.0f, 42.80551f, 65.97933f, 43.0062f, 65.93997f, 43.200092f);
        instancePath.lineTo(66.0f, 43.2f);
        instancePath.lineTo(66.0f, 57.0f);
        instancePath.cubicTo(66.0f, 58.656853f, 64.65685f, 60.0f, 63.0f, 60.0f);
        instancePath.lineTo(9.0f, 60.0f);
        instancePath.cubicTo(7.343146f, 60.0f, 6.0f, 58.656853f, 6.0f, 57.0f);
        instancePath.lineTo(6.0f, 15.0f);
        instancePath.cubicTo(6.0f, 13.343145f, 7.343146f, 12.0f, 9.0f, 12.0f);
        instancePath.lineTo(63.0f, 12.0f);
        instancePath.close();
        instancePath.moveTo(62.4f, 15.6f);
        instancePath.lineTo(9.6f, 15.6f);
        instancePath.lineTo(9.6f, 56.4f);
        instancePath.lineTo(62.4f, 56.4f);
        instancePath.lineTo(62.399f, 45.599f);
        instancePath.lineTo(45.0f, 45.6f);
        instancePath.cubicTo(39.78948f, 45.6f, 35.548508f, 41.448864f, 35.403816f, 36.273327f);
        instancePath.lineTo(35.4f, 36.0f);
        instancePath.cubicTo(35.4f, 30.698067f, 39.698067f, 26.4f, 45.0f, 26.4f);
        instancePath.lineTo(45.0f, 26.4f);
        instancePath.lineTo(62.399f, 26.399f);
        instancePath.lineTo(62.4f, 15.6f);
        instancePath.close();
        instancePath.moveTo(62.4f, 30.0f);
        instancePath.lineTo(45.0f, 30.0f);
        Path path = instancePath;
        path.cubicTo(41.68629f, 30.0f, 39.0f, 32.68629f, 39.0f, 36.0f);
        path.cubicTo(39.0f, 39.31371f, 41.68629f, 42.0f, 45.0f, 42.0f);
        instancePath.lineTo(45.0f, 42.0f);
        instancePath.lineTo(62.4f, 42.0f);
        instancePath.lineTo(62.4f, 30.0f);
        instancePath.close();
        instancePath.moveTo(45.0f, 33.0f);
        Path path2 = instancePath;
        path2.cubicTo(46.656853f, 33.0f, 48.0f, 34.343147f, 48.0f, 36.0f);
        path2.cubicTo(48.0f, 37.656853f, 46.656853f, 39.0f, 45.0f, 39.0f);
        path2.cubicTo(43.343147f, 39.0f, 42.0f, 37.656853f, 42.0f, 36.0f);
        path2.cubicTo(42.0f, 34.343147f, 43.343147f, 33.0f, 45.0f, 33.0f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
