package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.wallet_drag_icon */
public class wallet_drag_icon extends C24542c {
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
                C24542c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
                canvas.save();
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-16777216);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(1.75f, 7.75f);
                instancePath.lineTo(22.25f, 7.75f);
                Path path = instancePath;
                path.cubicTo(22.664213f, 7.75f, 23.0f, 8.085787f, 23.0f, 8.5f);
                path.cubicTo(23.0f, 8.914213f, 22.664213f, 9.25f, 22.25f, 9.25f);
                instancePath.lineTo(1.75f, 9.25f);
                Path path2 = instancePath;
                path2.cubicTo(1.3357865f, 9.25f, 1.0f, 8.914213f, 1.0f, 8.5f);
                path2.cubicTo(1.0f, 8.085787f, 1.3357865f, 7.75f, 1.75f, 7.75f);
                instancePath.close();
                instancePath.moveTo(1.75f, 11.25f);
                instancePath.lineTo(22.25f, 11.25f);
                Path path3 = instancePath;
                path3.cubicTo(22.664213f, 11.25f, 23.0f, 11.585787f, 23.0f, 12.0f);
                path3.cubicTo(23.0f, 12.414213f, 22.664213f, 12.75f, 22.25f, 12.75f);
                instancePath.lineTo(1.75f, 12.75f);
                Path path4 = instancePath;
                path4.cubicTo(1.3357865f, 12.75f, 1.0f, 12.414213f, 1.0f, 12.0f);
                path4.cubicTo(1.0f, 11.585787f, 1.3357865f, 11.25f, 1.75f, 11.25f);
                instancePath.close();
                instancePath.moveTo(1.75f, 14.75f);
                instancePath.lineTo(22.25f, 14.75f);
                Path path5 = instancePath;
                path5.cubicTo(22.664213f, 14.75f, 23.0f, 15.085787f, 23.0f, 15.5f);
                path5.cubicTo(23.0f, 15.914213f, 22.664213f, 16.25f, 22.25f, 16.25f);
                instancePath.lineTo(1.75f, 16.25f);
                Path path6 = instancePath;
                path6.cubicTo(1.3357865f, 16.25f, 1.0f, 15.914213f, 1.0f, 15.5f);
                path6.cubicTo(1.0f, 15.085787f, 1.3357865f, 14.75f, 1.75f, 14.75f);
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
