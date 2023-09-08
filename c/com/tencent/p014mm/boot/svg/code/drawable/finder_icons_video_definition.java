package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.finder_icons_video_definition */
public class finder_icons_video_definition extends C24542c {
    private final int height = 72;
    private final int width = 72;

    public int doCommand(int i, Object... objArr) {
        if (i == 0 || i == 1) {
            return 72;
        }
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
            canvas.save();
            Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(60.0f, 12.0f);
            instancePath.cubicTo(61.65625f, 12.0f, 63.0f, 13.34375f, 63.0f, 15.0f);
            instancePath.lineTo(63.0f, 57.0f);
            Path path = instancePath;
            path.cubicTo(63.0f, 58.65625f, 61.65625f, 60.0f, 60.0f, 60.0f);
            instancePath.lineTo(12.0f, 60.0f);
            path.cubicTo(10.34375f, 60.0f, 9.0f, 58.65625f, 9.0f, 57.0f);
            instancePath.lineTo(9.0f, 15.0f);
            instancePath.cubicTo(9.0f, 13.34375f, 10.34375f, 12.0f, 12.0f, 12.0f);
            instancePath.close();
            instancePath.moveTo(59.398438f, 15.601562f);
            instancePath.lineTo(12.601562f, 15.601562f);
            instancePath.lineTo(12.601562f, 56.398438f);
            instancePath.lineTo(12.613281f, 56.398438f);
            instancePath.lineTo(59.398438f, 15.703125f);
            instancePath.close();
            instancePath.moveTo(59.398438f, 20.476562f);
            instancePath.lineTo(18.097656f, 56.398438f);
            instancePath.lineTo(28.613281f, 56.398438f);
            instancePath.lineTo(59.398438f, 28.660156f);
            instancePath.close();
            instancePath.moveTo(59.398438f, 33.507812f);
            instancePath.lineTo(33.98828f, 56.398438f);
            instancePath.lineTo(42.535156f, 56.398438f);
            instancePath.lineTo(59.398438f, 41.42578f);
            instancePath.close();
            instancePath.moveTo(59.398438f, 46.23828f);
            instancePath.lineTo(47.95703f, 56.398438f);
            instancePath.lineTo(59.398438f, 56.398438f);
            instancePath.close();
            instancePath.moveTo(59.398438f, 46.23828f);
            WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
