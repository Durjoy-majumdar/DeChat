package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.voice_rcd_hint_new */
public class voice_rcd_hint_new extends C24542c {
    private final int height = 67;
    private final int width = 67;

    public int doCommand(int i, Object... objArr) {
        int i2 = 67;
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
                C24542c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-1);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(35.416668f, 58.48882f);
                instancePath.lineTo(35.416668f, 67.0f);
                instancePath.lineTo(31.25f, 67.0f);
                instancePath.lineTo(31.25f, 58.48882f);
                instancePath.cubicTo(21.490765f, 57.440975f, 13.888889f, 49.115345f, 13.888889f, 39.0f);
                instancePath.lineTo(13.888889f, 33.4f);
                instancePath.lineTo(18.055555f, 33.4f);
                instancePath.lineTo(18.055555f, 39.0f);
                Path path = instancePath;
                path.cubicTo(18.055555f, 47.505184f, 24.895649f, 54.4f, 33.333332f, 54.4f);
                path.cubicTo(41.771015f, 54.4f, 48.61111f, 47.505184f, 48.61111f, 39.0f);
                instancePath.lineTo(48.61111f, 33.4f);
                instancePath.lineTo(52.77778f, 33.4f);
                instancePath.lineTo(52.77778f, 39.0f);
                Path path2 = instancePath;
                path2.cubicTo(52.77778f, 49.115345f, 45.175903f, 57.440975f, 35.416668f, 58.48882f);
                instancePath.close();
                instancePath.moveTo(22.222221f, 22.11111f);
                path2.cubicTo(22.222221f, 15.974614f, 27.196836f, 11.0f, 33.333332f, 11.0f);
                path2.cubicTo(39.46983f, 11.0f, 44.444443f, 15.974614f, 44.444443f, 22.11111f);
                instancePath.lineTo(44.444443f, 39.08889f);
                Path path3 = instancePath;
                path3.cubicTo(44.444443f, 45.225388f, 39.46983f, 50.2f, 33.333332f, 50.2f);
                path3.cubicTo(27.196836f, 50.2f, 22.222221f, 45.225388f, 22.222221f, 39.08889f);
                instancePath.lineTo(22.222221f, 22.11111f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i2;
    }
}
