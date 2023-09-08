package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import com.tencent.xweb.util.WXWebReporter;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.app_brand_desktop_add_icon */
public class app_brand_desktop_add_icon extends C24542c {
    private final int height = 72;
    private final int width = 72;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 72;
        if (!(i2 == 0 || i2 == 1)) {
            i3 = 0;
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
                instancePaint3.setColor(-1);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(36.0f, 0.0f);
                Path path = instancePath;
                path.cubicTo(55.88225f, 0.0f, 72.0f, 16.117748f, 72.0f, 36.0f);
                path.cubicTo(72.0f, 55.88225f, 55.88225f, 72.0f, 36.0f, 72.0f);
                path.cubicTo(16.117748f, 72.0f, 0.0f, 55.88225f, 0.0f, 36.0f);
                path.cubicTo(0.0f, 16.117748f, 16.117748f, 0.0f, 36.0f, 0.0f);
                instancePath.close();
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
                instancePaint4.setColor(-16777216);
                Path instancePath2 = C24542c.instancePath(looper);
                instancePath2.moveTo(33.0f, 33.0f);
                instancePath2.lineTo(33.0f, 18.0f);
                instancePath2.lineTo(39.0f, 18.0f);
                instancePath2.lineTo(39.0f, 33.0f);
                instancePath2.lineTo(54.0f, 33.0f);
                instancePath2.lineTo(54.0f, 39.0f);
                instancePath2.lineTo(39.0f, 39.0f);
                instancePath2.lineTo(39.0f, 54.0f);
                instancePath2.lineTo(33.0f, 54.0f);
                instancePath2.lineTo(33.0f, 39.0f);
                instancePath2.lineTo(18.0f, 39.0f);
                instancePath2.lineTo(18.0f, 33.0f);
                instancePath2.lineTo(33.0f, 33.0f);
                instancePath2.close();
                canvas.saveLayerAlpha((RectF) null, WXWebReporter.WXXWEB_IDKEY_X5_LOAD_URL_MAX_FAILED_TEST_SYS_SUC, 31);
                Paint instancePaint5 = C24542c.instancePaint(instancePaint4, looper);
                WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint5);
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i3;
    }
}
