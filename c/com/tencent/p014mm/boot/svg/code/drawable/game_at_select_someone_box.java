package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.game_at_select_someone_box */
public class game_at_select_someone_box extends C24542c {
    private final int height = 40;
    private final int width = 40;

    public int doCommand(int i, Object... objArr) {
        int i2 = 40;
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
                instancePaint3.setColor(-526345);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(32.0f, 24.0f);
                Path path = instancePath;
                path.cubicTo(36.418278f, 24.0f, 40.0f, 27.581722f, 40.0f, 32.0f);
                path.cubicTo(40.0f, 36.418278f, 36.418278f, 40.0f, 32.0f, 40.0f);
                path.cubicTo(27.581722f, 40.0f, 24.0f, 36.418278f, 24.0f, 32.0f);
                path.cubicTo(24.0f, 27.581722f, 27.581722f, 24.0f, 32.0f, 24.0f);
                instancePath.close();
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
                instancePaint4.setColor(-16728129);
                Path instancePath2 = C24542c.instancePath(looper);
                instancePath2.moveTo(25.3335f, 32.0002f);
                Path path2 = instancePath2;
                path2.cubicTo(25.3335f, 35.6821f, 28.3183f, 38.6668f, 32.0002f, 38.6668f);
                path2.cubicTo(35.6821f, 38.6668f, 38.6668f, 35.6821f, 38.6668f, 32.0002f);
                path2.cubicTo(38.6668f, 28.3183f, 35.6821f, 25.3335f, 32.0002f, 25.3335f);
                path2.cubicTo(28.3183f, 25.3335f, 25.3335f, 28.3183f, 25.3335f, 32.0002f);
                instancePath2.close();
                instancePath2.moveTo(34.9485f, 29.6934f);
                instancePath2.lineTo(31.2156f, 33.4262f);
                instancePath2.lineTo(29.3717f, 31.5823f);
                instancePath2.lineTo(28.6667f, 32.2873f);
                instancePath2.lineTo(30.7458f, 34.368f);
                instancePath2.cubicTo(31.0061f, 34.6284f, 31.4282f, 34.6286f, 31.6887f, 34.3682f);
                instancePath2.lineTo(35.6569f, 30.4017f);
                instancePath2.lineTo(34.9485f, 29.6934f);
                instancePath2.close();
                WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint4);
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i2;
    }
}
