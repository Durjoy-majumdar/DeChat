package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.chatfrom_voice_playing_new_f2 */
public class chatfrom_voice_playing_new_f2 extends C24542c {
    private final int height = 72;
    private final int width = 72;

    public int doCommand(int i, Object... objArr) {
        int i2 = 72;
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
                canvas.save();
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-15028967);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(31.8912f, 55.674f);
                instancePath.lineTo(26.0892f, 49.959f);
                Path path = instancePath;
                path.cubicTo(30.0582f, 46.524f, 32.5602f, 41.505f, 32.5602f, 35.919f);
                path.cubicTo(32.5602f, 30.417f, 30.1332f, 25.467f, 26.2692f, 22.035f);
                instancePath.lineTo(32.0712f, 16.323f);
                Path path2 = instancePath;
                path2.cubicTo(37.4382f, 21.213f, 40.7922f, 28.185f, 40.7922f, 35.919f);
                path2.cubicTo(40.7922f, 43.737f, 37.3632f, 50.775f, 31.8912f, 55.674f);
                instancePath.moveTo(19.3032f, 43.278f);
                instancePath.lineTo(12.0012f, 36.087f);
                instancePath.lineTo(19.4952f, 28.707f);
                Path path3 = instancePath;
                path3.cubicTo(21.6102f, 30.429f, 22.9572f, 33.018f, 22.9572f, 35.919f);
                path3.cubicTo(22.9572f, 38.904f, 21.5292f, 41.562f, 19.3032f, 43.278f);
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i2;
    }
}
