package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.appbrand_subscribe_msg_voice_broadcast_for_dyeing_item */
public class appbrand_subscribe_msg_voice_broadcast_for_dyeing_item extends C24542c {
    private final int height = 16;
    private final int width = 16;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 16;
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
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(0.0f, 0.0f);
            instancePath.lineTo(16.0f, 0.0f);
            instancePath.lineTo(16.0f, 16.0f);
            instancePath.lineTo(0.0f, 16.0f);
            instancePath.lineTo(0.0f, 0.0f);
            instancePath.close();
            Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-16777216);
            Path instancePath2 = C24542c.instancePath(looper);
            instancePath2.moveTo(13.0f, 8.0f);
            instancePath2.cubicTo(13.0f, 11.124449f, 11.768582f, 13.953082f, 9.777688f, 16.0005f);
            instancePath2.lineTo(8.741085f, 14.933333f);
            Path path = instancePath2;
            path.cubicTo(10.466279f, 13.158938f, 11.533333f, 10.707635f, 11.533333f, 8.0f);
            path.cubicTo(11.533333f, 5.292365f, 10.466279f, 2.8410614f, 8.741085f, 1.0666667f);
            instancePath2.lineTo(9.778174f, 1.687539E-14f);
            Path path2 = instancePath2;
            path2.cubicTo(11.768784f, 2.0473785f, 13.0f, 4.875806f, 13.0f, 8.0f);
            instancePath2.close();
            instancePath2.moveTo(9.333333f, 8.0f);
            path2.cubicTo(9.333333f, 10.082796f, 8.512522f, 11.968414f, 7.1854496f, 13.333333f);
            instancePath2.lineTo(6.14836f, 12.266666f);
            Path path3 = instancePath2;
            path3.cubicTo(7.2100177f, 11.174731f, 7.866667f, 9.666237f, 7.866667f, 8.0f);
            path3.cubicTo(7.866667f, 6.333763f, 7.2100177f, 4.8252687f, 6.14836f, 3.7333333f);
            instancePath2.lineTo(7.186409f, 2.6676536f);
            Path path4 = instancePath2;
            path4.cubicTo(8.5129175f, 4.0324945f, 9.333333f, 5.9177055f, 9.333333f, 8.0f);
            instancePath2.close();
            instancePath2.moveTo(5.6666665f, 8.0f);
            path4.cubicTo(5.6666665f, 9.041398f, 5.256261f, 9.984207f, 4.592725f, 10.666667f);
            instancePath2.lineTo(2.0f, 8.0f);
            instancePath2.lineTo(4.592725f, 5.3333335f);
            path4.cubicTo(5.256261f, 6.015793f, 5.6666665f, 6.958602f, 5.6666665f, 8.0f);
            instancePath2.close();
            canvas.saveLayerAlpha((RectF) null, 76, 31);
            Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
            WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
            canvas.drawPath(instancePath2, instancePaint4);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
