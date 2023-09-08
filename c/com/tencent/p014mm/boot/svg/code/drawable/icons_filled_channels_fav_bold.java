package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_channels_fav_bold */
public class icons_filled_channels_fav_bold extends C24542c {
    private final int height = 72;
    private final int width = 72;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 72;
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
        canvas.save();
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-16777216);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(38.0492f, 65.8942f);
        instancePath.cubicTo(36.6569f, 66.6981f, 34.9415f, 66.6981f, 33.5492f, 65.8942f);
        instancePath.lineTo(11.2502f, 53.0199f);
        instancePath.cubicTo(9.85794f, 52.2161f, 9.00024f, 50.7305f, 9.00024f, 49.1228f);
        instancePath.lineTo(9.00024f, 23.3742f);
        instancePath.cubicTo(9.00024f, 21.7665f, 9.85794f, 20.2809f, 11.2502f, 19.4771f);
        instancePath.lineTo(33.5492f, 6.60276f);
        instancePath.cubicTo(34.9415f, 5.79892f, 36.6569f, 5.79892f, 38.0492f, 6.60276f);
        instancePath.lineTo(60.3481f, 19.4771f);
        instancePath.cubicTo(61.7404f, 20.2809f, 62.5981f, 21.7665f, 62.5981f, 23.3742f);
        instancePath.lineTo(62.5981f, 49.1228f);
        instancePath.cubicTo(62.5981f, 50.7305f, 61.7404f, 52.2161f, 60.3481f, 53.0199f);
        instancePath.lineTo(38.0492f, 65.8942f);
        instancePath.close();
        instancePath.moveTo(33.5492f, 60.6981f);
        instancePath.lineTo(13.5002f, 49.1228f);
        instancePath.lineTo(13.5002f, 25.4925f);
        instancePath.lineTo(33.5492f, 37.5219f);
        instancePath.lineTo(33.5492f, 60.6981f);
        instancePath.close();
        instancePath.moveTo(38.0492f, 60.698f);
        instancePath.lineTo(58.0981f, 49.1228f);
        instancePath.lineTo(58.0981f, 25.4927f);
        instancePath.lineTo(38.0492f, 37.522f);
        instancePath.lineTo(38.0492f, 60.698f);
        instancePath.close();
        instancePath.moveTo(55.4402f, 21.8396f);
        instancePath.lineTo(35.7994f, 33.6241f);
        instancePath.lineTo(16.1584f, 21.8395f);
        instancePath.lineTo(35.7992f, 10.4999f);
        instancePath.lineTo(55.4402f, 21.8396f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
