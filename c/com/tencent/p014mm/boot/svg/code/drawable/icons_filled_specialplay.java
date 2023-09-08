package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_specialplay */
public class icons_filled_specialplay extends C24542c {
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
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-16777216);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(8.496139f, 4.8549366f);
                instancePath.lineTo(19.480574f, 11.131757f);
                Path path = instancePath;
                path.cubicTo(19.960093f, 11.4057665f, 20.126688f, 12.016622f, 19.852678f, 12.496139f);
                path.cubicTo(19.76409f, 12.65117f, 19.635605f, 12.779654f, 19.480574f, 12.868243f);
                instancePath.lineTo(8.496139f, 19.145063f);
                Path path2 = instancePath;
                path2.cubicTo(8.016622f, 19.419073f, 7.405767f, 19.252478f, 7.131757f, 18.772959f);
                path2.cubicTo(7.0454154f, 18.621862f, 7.0f, 18.450848f, 7.0f, 18.276821f);
                instancePath.lineTo(7.0f, 5.72318f);
                Path path3 = instancePath;
                path3.cubicTo(7.0f, 5.170895f, 7.4477153f, 4.72318f, 8.0f, 4.72318f);
                path3.cubicTo(8.1740265f, 4.72318f, 8.345041f, 4.768595f, 8.496139f, 4.8549366f);
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
