package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_top_off */
public class icons_filled_top_off extends C24542c {
    private final int height = 24;
    private final int width = 24;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 24;
        }
        if (i2 != 2) {
            return 0;
        }
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
        instancePath.moveTo(7.267f, 9.388f);
        instancePath.lineTo(16.071068f, 18.192f);
        instancePath.lineTo(16.071068f, 21.071068f);
        instancePath.cubicTo(16.071068f, 21.623352f, 15.623353f, 22.071068f, 15.071068f, 22.071068f);
        instancePath.lineTo(9.071068f, 22.071068f);
        instancePath.cubicTo(8.518783f, 22.071068f, 8.071068f, 21.623352f, 8.071068f, 21.071068f);
        instancePath.lineTo(8.071068f, 13.071068f);
        instancePath.lineTo(6.0f, 13.071068f);
        Path path = instancePath;
        path.cubicTo(5.4477153f, 13.071068f, 5.0f, 12.623353f, 5.0f, 12.071068f);
        path.cubicTo(5.0f, 11.805851f, 5.1053567f, 11.551497f, 5.2928934f, 11.363961f);
        instancePath.lineTo(7.267f, 9.388f);
        instancePath.close();
        instancePath.moveTo(5.1213202f, 3.0f);
        instancePath.lineTo(9.38766f, 7.267f);
        instancePath.lineTo(11.363961f, 5.2928934f);
        instancePath.cubicTo(11.754485f, 4.902369f, 12.3876505f, 4.902369f, 12.778174f, 5.2928934f);
        instancePath.lineTo(18.849243f, 11.363961f);
        Path path2 = instancePath;
        path2.cubicTo(19.239767f, 11.754485f, 19.239767f, 12.3876505f, 18.849243f, 12.778174f);
        path2.cubicTo(18.661707f, 12.965711f, 18.407352f, 13.071068f, 18.142136f, 13.071068f);
        instancePath.lineTo(16.071068f, 13.071068f);
        instancePath.lineTo(16.07066f, 13.949f);
        instancePath.lineTo(22.091883f, 19.970562f);
        instancePath.lineTo(21.031223f, 21.031223f);
        instancePath.lineTo(4.0606604f, 4.0606604f);
        instancePath.lineTo(5.1213202f, 3.0f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
