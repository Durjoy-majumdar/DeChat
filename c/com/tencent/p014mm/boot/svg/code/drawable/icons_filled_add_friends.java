package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_add_friends */
public class icons_filled_add_friends extends C24542c {
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
                canvas.save();
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(56.24998f, 32.25f);
                instancePath.lineTo(56.24998f, 24.0f);
                instancePath.lineTo(60.74998f, 24.0f);
                instancePath.lineTo(60.74998f, 32.25f);
                instancePath.lineTo(69.0f, 32.25f);
                instancePath.lineTo(69.0f, 36.75f);
                instancePath.lineTo(60.74998f, 36.75f);
                instancePath.lineTo(60.74998f, 45.0f);
                instancePath.lineTo(56.24998f, 45.0f);
                instancePath.lineTo(56.24998f, 36.75f);
                instancePath.lineTo(48.0f, 36.75f);
                instancePath.lineTo(48.0f, 34.5f);
                instancePath.lineTo(48.0f, 32.25f);
                instancePath.close();
                instancePath.moveTo(23.495739f, 37.050415f);
                instancePath.cubicTo(21.288954f, 34.434856f, 19.5f, 29.54849f, 19.5f, 26.127872f);
                instancePath.lineTo(19.5f, 20.998741f);
                Path path = instancePath;
                path.cubicTo(19.5f, 14.372019f, 24.886068f, 9.0f, 31.5f, 9.0f);
                path.cubicTo(38.12742f, 9.0f, 43.5f, 14.378941f, 43.5f, 21.000622f);
                instancePath.lineTo(43.5f, 26.130556f);
                instancePath.cubicTo(43.5f, 29.547886f, 41.702797f, 34.448578f, 39.50426f, 37.054718f);
                instancePath.lineTo(38.419662f, 38.340397f);
                instancePath.cubicTo(36.651096f, 40.43685f, 37.20356f, 43.10519f, 39.676647f, 44.31153f);
                instancePath.lineTo(56.657707f, 52.594673f);
                instancePath.cubicTo(58.503605f, 53.49508f, 60.0f, 55.87551f, 60.0f, 57.946392f);
                instancePath.lineTo(60.0f, 60.00469f);
                instancePath.cubicTo(60.0f, 61.658955f, 58.647224f, 63.000004f, 56.995712f, 63.000004f);
                instancePath.lineTo(6.0042915f, 63.000004f);
                instancePath.cubicTo(4.345069f, 63.000004f, 3.0000026f, 61.66727f, 3.0000026f, 60.00469f);
                instancePath.lineTo(3.0000026f, 57.946392f);
                instancePath.cubicTo(3.0000026f, 55.891125f, 4.4944553f, 53.495728f, 6.3422956f, 52.594f);
                instancePath.lineTo(23.323357f, 44.307434f);
                instancePath.cubicTo(25.786137f, 43.105625f, 26.358782f, 40.443794f, 24.58034f, 38.335922f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i2;
    }
}
