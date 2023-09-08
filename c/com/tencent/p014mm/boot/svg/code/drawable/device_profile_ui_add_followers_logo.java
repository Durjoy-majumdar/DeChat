package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.device_profile_ui_add_followers_logo */
public class device_profile_ui_add_followers_logo extends C24542c {
    private final int height = 60;
    private final int width = 60;

    public int doCommand(int i, Object... objArr) {
        int i2 = 60;
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
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-16777216);
                canvas.saveLayerAlpha((RectF) null, 51, 31);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(29.73f, 4.822f);
                Path path = instancePath;
                path.cubicTo(15.804f, 4.822f, 4.514f, 16.111f, 4.514f, 30.038f);
                path.cubicTo(4.514f, 43.965f, 15.804f, 55.253f, 29.73f, 55.253f);
                path.cubicTo(43.656f, 55.253f, 54.946f, 43.963997f, 54.946f, 30.036999f);
                path.cubicTo(54.946f, 16.11f, 43.656f, 4.822f, 29.73f, 4.822f);
                instancePath.close();
                instancePath.moveTo(29.73f, 53.27f);
                Path path2 = instancePath;
                path2.cubicTo(16.898998f, 53.27f, 6.4969997f, 42.868f, 6.4969997f, 30.037f);
                path2.cubicTo(6.4969997f, 17.206001f, 16.899f, 6.805f, 29.73f, 6.805f);
                path2.cubicTo(42.561f, 6.805f, 52.962997f, 17.207f, 52.962997f, 30.038f);
                path2.cubicTo(52.962997f, 42.869f, 42.561f, 53.27f, 29.73f, 53.27f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                canvas.save();
                Paint instancePaint5 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath2 = C24542c.instancePath(looper);
                instancePath2.moveTo(31.23f, 15.037f);
                instancePath2.lineTo(28.23f, 15.037f);
                instancePath2.lineTo(28.23f, 28.537f);
                instancePath2.lineTo(14.73f, 28.537f);
                instancePath2.lineTo(14.73f, 31.537f);
                instancePath2.lineTo(28.23f, 31.537f);
                instancePath2.lineTo(28.23f, 45.037f);
                instancePath2.lineTo(31.23f, 45.037f);
                instancePath2.lineTo(31.23f, 31.537f);
                instancePath2.lineTo(44.73f, 31.537f);
                instancePath2.lineTo(44.73f, 28.537f);
                instancePath2.lineTo(31.23f, 28.537f);
                instancePath2.close();
                WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint5);
                canvas.restore();
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i2;
    }
}
