package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_top */
public class icons_filled_top extends C24542c {
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
            instancePath.moveTo(38.335938f, 21.878906f);
            instancePath.lineTo(56.546875f, 40.09375f);
            Path path = instancePath;
            path.cubicTo(57.71875f, 41.26172f, 57.71875f, 43.164062f, 56.546875f, 44.335938f);
            path.cubicTo(55.984375f, 44.898438f, 55.222656f, 45.214844f, 54.42578f, 45.214844f);
            instancePath.lineTo(48.214844f, 45.214844f);
            instancePath.lineTo(48.214844f, 63.0f);
            instancePath.cubicTo(48.214844f, 64.65625f, 46.871094f, 66.0f, 45.214844f, 66.0f);
            instancePath.lineTo(27.214844f, 66.0f);
            instancePath.cubicTo(25.554688f, 66.0f, 24.214844f, 64.65625f, 24.214844f, 63.0f);
            instancePath.lineTo(24.214844f, 45.214844f);
            instancePath.lineTo(18.0f, 45.214844f);
            Path path2 = instancePath;
            path2.cubicTo(16.34375f, 45.214844f, 15.0f, 43.871094f, 15.0f, 42.214844f);
            path2.cubicTo(15.0f, 41.41797f, 15.316406f, 40.65625f, 15.878906f, 40.09375f);
            instancePath.lineTo(34.09375f, 21.878906f);
            instancePath.cubicTo(35.26172f, 20.707031f, 37.164062f, 20.707031f, 38.335938f, 21.878906f);
            instancePath.close();
            instancePath.moveTo(60.0f, 9.0f);
            instancePath.lineTo(60.0f, 15.0f);
            instancePath.lineTo(12.0f, 15.0f);
            instancePath.lineTo(12.0f, 9.0f);
            instancePath.close();
            instancePath.moveTo(60.0f, 9.0f);
            WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
