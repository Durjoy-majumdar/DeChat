package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.default_voiceinput */
public class default_voiceinput extends C24542c {
    private final int height = 192;
    private final int width = 192;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 192;
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
        instancePaint3.setColor(-12206054);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(0.0f, 0.0f);
        instancePath.lineTo(192.0f, 0.0f);
        instancePath.lineTo(192.0f, 192.0f);
        instancePath.lineTo(0.0f, 192.0f);
        instancePath.lineTo(0.0f, 0.0f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-1);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(65.454544f, 90.181816f);
        instancePath2.lineTo(58.18182f, 90.181816f);
        instancePath2.lineTo(58.18182f, 103.31862f);
        instancePath2.cubicTo(58.18182f, 122.70565f, 72.80536f, 138.68132f, 91.63636f, 140.84218f);
        instancePath2.lineTo(91.63636f, 149.81818f);
        instancePath2.lineTo(73.72098f, 149.81818f);
        instancePath2.cubicTo(73.172165f, 149.81818f, 72.72727f, 150.27472f, 72.72727f, 150.81836f);
        instancePath2.lineTo(72.72727f, 154.63618f);
        instancePath2.cubicTo(72.72727f, 155.18857f, 73.17303f, 155.63637f, 73.72098f, 155.63637f);
        instancePath2.lineTo(118.27902f, 155.63637f);
        instancePath2.cubicTo(118.827835f, 155.63637f, 119.27273f, 155.17982f, 119.27273f, 154.63618f);
        instancePath2.lineTo(119.27273f, 150.81836f);
        instancePath2.cubicTo(119.27273f, 150.26598f, 118.82698f, 149.81818f, 118.27902f, 149.81818f);
        instancePath2.lineTo(100.36363f, 149.81818f);
        instancePath2.lineTo(100.36363f, 149.81818f);
        instancePath2.lineTo(100.36363f, 140.84218f);
        instancePath2.lineTo(100.36363f, 140.84218f);
        instancePath2.cubicTo(119.19464f, 138.68132f, 133.81818f, 122.70565f, 133.81818f, 103.31862f);
        instancePath2.lineTo(133.81818f, 90.181816f);
        instancePath2.lineTo(126.545456f, 90.181816f);
        instancePath2.lineTo(126.545456f, 102.822685f);
        Path path = instancePath2;
        path.cubicTo(126.545456f, 119.941025f, 112.86979f, 133.81818f, 96.0f, 133.81818f);
        path.cubicTo(79.13021f, 133.81818f, 65.454544f, 119.941025f, 65.454544f, 102.822685f);
        instancePath2.lineTo(65.454544f, 90.181816f);
        instancePath2.lineTo(65.454544f, 90.181816f);
        instancePath2.close();
        instancePath2.moveTo(96.0f, 36.363636f);
        instancePath2.cubicTo(83.14683f, 36.363636f, 72.72727f, 46.774685f, 72.72727f, 59.646313f);
        instancePath2.lineTo(72.72727f, 103.26278f);
        Path path2 = instancePath2;
        path2.cubicTo(72.72727f, 116.121445f, 83.144005f, 126.545456f, 96.0f, 126.545456f);
        path2.cubicTo(108.85317f, 126.545456f, 119.27273f, 116.13441f, 119.27273f, 103.26278f);
        instancePath2.lineTo(119.27273f, 59.646313f);
        path2.cubicTo(119.27273f, 46.787647f, 108.855995f, 36.363636f, 96.0f, 36.363636f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
