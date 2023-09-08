package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_location_blue */
public class icons_filled_location_blue extends C24542c {
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
                instancePaint3.setColor(-6640172);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(12.0f, 2.5f);
                Path path = instancePath;
                path.cubicTo(16.1421f, 2.5f, 19.5f, 5.83401f, 19.5f, 9.94673f);
                path.cubicTo(19.5f, 15.5488f, 12.6788f, 21.2544f, 12.6788f, 21.2544f);
                path.cubicTo(12.3033f, 21.5963f, 11.702f, 21.5952f, 11.3344f, 21.2666f);
                path.cubicTo(11.3344f, 21.2666f, 4.5f, 15.5488f, 4.5f, 9.94673f);
                path.cubicTo(4.5f, 5.83401f, 7.85786f, 2.5f, 12.0f, 2.5f);
                instancePath.close();
                instancePath.moveTo(12.0f, 7.0f);
                Path path2 = instancePath;
                path2.cubicTo(10.3431f, 7.0f, 9.0f, 8.34315f, 9.0f, 10.0f);
                path2.cubicTo(9.0f, 11.6569f, 10.3431f, 13.0f, 12.0f, 13.0f);
                path2.cubicTo(13.6569f, 13.0f, 15.0f, 11.6569f, 15.0f, 10.0f);
                path2.cubicTo(15.0f, 8.34315f, 13.6569f, 7.0f, 12.0f, 7.0f);
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
