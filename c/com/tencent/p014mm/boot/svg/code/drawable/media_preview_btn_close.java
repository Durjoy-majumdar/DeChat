package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.media_preview_btn_close */
public class media_preview_btn_close extends C24542c {
    private final int height = 96;
    private final int width = 96;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 96;
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
        canvas.save();
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(Integer.MIN_VALUE);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(0.0f, 9.6f);
        Path path = instancePath;
        path.cubicTo(0.0f, 4.298066f, 4.298066f, 0.0f, 9.6f, 0.0f);
        instancePath.lineTo(86.4f, 0.0f);
        path.cubicTo(91.701935f, 0.0f, 96.0f, 4.298066f, 96.0f, 9.6f);
        instancePath.lineTo(96.0f, 86.4f);
        path.cubicTo(96.0f, 91.701935f, 91.701935f, 96.0f, 86.4f, 96.0f);
        instancePath.lineTo(9.6f, 96.0f);
        path.cubicTo(4.298066f, 96.0f, 0.0f, 91.701935f, 0.0f, 86.4f);
        instancePath.lineTo(0.0f, 9.6f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-1);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(48.0f, 45.001343f);
        instancePath2.lineTo(30.427227f, 27.428572f);
        instancePath2.lineTo(27.428572f, 30.427227f);
        instancePath2.lineTo(45.001343f, 48.0f);
        instancePath2.lineTo(27.428572f, 65.57277f);
        instancePath2.lineTo(30.427227f, 68.57143f);
        instancePath2.lineTo(48.0f, 50.998657f);
        instancePath2.lineTo(65.57277f, 68.57143f);
        instancePath2.lineTo(68.57143f, 65.57277f);
        instancePath2.lineTo(50.998657f, 48.0f);
        instancePath2.lineTo(68.57143f, 30.427227f);
        instancePath2.lineTo(65.57277f, 27.428572f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
