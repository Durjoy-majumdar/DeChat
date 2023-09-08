package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.album_group_icon_pressed */
public class album_group_icon_pressed extends C24542c {
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
            instancePath.moveTo(7.5f, 60.0f);
            instancePath.lineTo(7.5f, 57.945312f);
            instancePath.cubicTo(7.5f, 55.890625f, 8.996094f, 53.496094f, 10.84375f, 52.59375f);
            instancePath.lineTo(27.824219f, 44.308594f);
            instancePath.cubicTo(30.285156f, 43.10547f, 30.859375f, 40.445312f, 29.082031f, 38.335938f);
            instancePath.lineTo(27.996094f, 37.05078f);
            instancePath.cubicTo(25.789062f, 34.433594f, 24.0f, 29.546875f, 24.0f, 26.128906f);
            instancePath.lineTo(24.0f, 21.0f);
            Path path = instancePath;
            path.cubicTo(24.0f, 14.371094f, 29.386719f, 9.0f, 36.0f, 9.0f);
            path.cubicTo(42.628906f, 9.0f, 48.0f, 14.378906f, 48.0f, 21.0f);
            instancePath.lineTo(48.0f, 26.128906f);
            instancePath.cubicTo(48.0f, 29.546875f, 46.203125f, 34.44922f, 44.003906f, 37.054688f);
            instancePath.lineTo(42.91797f, 38.339844f);
            instancePath.cubicTo(41.152344f, 40.4375f, 41.703125f, 43.10547f, 44.17578f, 44.3125f);
            instancePath.lineTo(61.15625f, 52.59375f);
            instancePath.cubicTo(63.003906f, 53.496094f, 64.5f, 55.875f, 64.5f, 57.945312f);
            instancePath.lineTo(64.5f, 60.0f);
            instancePath.cubicTo(64.5f, 61.65625f, 63.15625f, 63.0f, 61.5f, 63.0f);
            instancePath.lineTo(10.5f, 63.0f);
            instancePath.cubicTo(8.84375f, 63.0f, 7.5f, 61.65625f, 7.5f, 60.0f);
            instancePath.close();
            instancePath.moveTo(7.5f, 60.0f);
            WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
