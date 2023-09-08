package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_video_call */
public class icons_filled_video_call extends C24542c {
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
            instancePath.moveTo(48.0f, 16.5f);
            instancePath.cubicTo(49.65625f, 16.5f, 51.0f, 17.84375f, 51.0f, 19.5f);
            instancePath.lineTo(51.0f, 52.5f);
            instancePath.cubicTo(51.0f, 54.15625f, 49.65625f, 55.5f, 48.0f, 55.5f);
            instancePath.lineTo(9.0f, 55.5f);
            instancePath.cubicTo(7.34375f, 55.5f, 6.0f, 54.15625f, 6.0f, 52.5f);
            instancePath.lineTo(6.0f, 19.5f);
            Path path = instancePath;
            path.cubicTo(6.0f, 17.84375f, 7.34375f, 16.5f, 9.0f, 16.5f);
            instancePath.close();
            instancePath.moveTo(68.34375f, 22.367188f);
            path.cubicTo(68.76953f, 22.898438f, 69.0f, 23.5625f, 69.0f, 24.242188f);
            instancePath.lineTo(69.0f, 47.757812f);
            Path path2 = instancePath;
            path2.cubicTo(69.0f, 49.414062f, 67.65625f, 50.757812f, 66.0f, 50.757812f);
            path2.cubicTo(65.32031f, 50.757812f, 64.65625f, 50.527344f, 64.125f, 50.101562f);
            instancePath.lineTo(54.0f, 42.0f);
            instancePath.lineTo(54.0f, 30.0f);
            instancePath.lineTo(64.125f, 21.898438f);
            instancePath.cubicTo(65.41797f, 20.863281f, 67.30859f, 21.074219f, 68.34375f, 22.367188f);
            instancePath.close();
            instancePath.moveTo(68.34375f, 22.367188f);
            WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
