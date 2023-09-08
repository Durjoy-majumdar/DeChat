package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_game_no_favour_menu */
public class icons_filled_game_no_favour_menu extends C24542c {
    private final int height = 24;
    private final int width = 24;

    public int doCommand(int i, Object... objArr) {
        int i2 = 24;
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
                instancePaint3.setColor(-855638017);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(3.65329f, 2.28073f);
                instancePath.cubicTo(3.58691f, 2.15935f, 3.41259f, 2.15935f, 3.34621f, 2.28073f);
                instancePath.lineTo(2.28691f, 4.21759f);
                instancePath.cubicTo(2.27085f, 4.24695f, 2.24671f, 4.27109f, 2.21734f, 4.28715f);
                instancePath.lineTo(0.280481f, 5.34646f);
                instancePath.cubicTo(0.15911f, 5.41284f, 0.159111f, 5.58715f, 0.280481f, 5.65353f);
                instancePath.lineTo(2.21734f, 6.71284f);
                instancePath.cubicTo(2.24671f, 6.72889f, 2.27085f, 6.75304f, 2.28691f, 6.7824f);
                instancePath.lineTo(3.34621f, 8.71926f);
                instancePath.cubicTo(3.41259f, 8.84063f, 3.58691f, 8.84063f, 3.65329f, 8.71926f);
                instancePath.lineTo(4.71259f, 6.7824f);
                instancePath.cubicTo(4.72865f, 6.75304f, 4.75279f, 6.72889f, 4.78216f, 6.71284f);
                instancePath.lineTo(6.71902f, 5.65353f);
                instancePath.cubicTo(6.84039f, 5.58715f, 6.84039f, 5.41284f, 6.71902f, 5.34646f);
                instancePath.lineTo(4.78216f, 4.28715f);
                Path path = instancePath;
                path.cubicTo(4.75279f, 4.27109f, 4.72865f, 4.24695f, 4.71259f, 4.21759f);
                instancePath.lineTo(3.65329f, 2.28073f);
                instancePath.close();
                instancePath.moveTo(14.4735f, 2.95069f);
                path.cubicTo(14.3433f, 2.61442f, 13.8675f, 2.61442f, 13.7373f, 2.95069f);
                instancePath.lineTo(11.3663f, 9.07422f);
                instancePath.cubicTo(11.3327f, 9.16112f, 11.2694f, 9.23331f, 11.1876f, 9.27802f);
                instancePath.lineTo(6.84392f, 11.6537f);
                instancePath.cubicTo(6.57015f, 11.8034f, 6.57015f, 12.1966f, 6.84392f, 12.3463f);
                instancePath.lineTo(11.1876f, 14.722f);
                instancePath.cubicTo(11.2694f, 14.7667f, 11.3327f, 14.8389f, 11.3663f, 14.9258f);
                instancePath.lineTo(13.7373f, 21.0493f);
                instancePath.cubicTo(13.8675f, 21.3856f, 14.3433f, 21.3856f, 14.4735f, 21.0493f);
                instancePath.lineTo(16.8445f, 14.9258f);
                instancePath.cubicTo(16.8782f, 14.8389f, 16.9415f, 14.7667f, 17.0232f, 14.722f);
                instancePath.lineTo(21.3669f, 12.3463f);
                instancePath.cubicTo(21.6407f, 12.1966f, 21.6407f, 11.8034f, 21.3669f, 11.6537f);
                instancePath.lineTo(17.0232f, 9.27802f);
                instancePath.cubicTo(16.9415f, 9.23331f, 16.8782f, 9.16112f, 16.8445f, 9.07422f);
                instancePath.lineTo(14.4735f, 2.95069f);
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
