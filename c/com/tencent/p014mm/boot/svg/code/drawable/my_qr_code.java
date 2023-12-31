package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.my_qr_code */
public class my_qr_code extends C24542c {
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
        instancePaint3.setColor(-1);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(18.0f, 17.0f);
        instancePath.lineTo(18.0f, 21.0f);
        instancePath.lineTo(14.0f, 21.0f);
        instancePath.lineTo(14.0f, 17.0f);
        instancePath.lineTo(18.0f, 17.0f);
        instancePath.close();
        instancePath.moveTo(23.0f, 19.0f);
        instancePath.lineTo(23.0f, 21.0f);
        instancePath.lineTo(21.0f, 21.0f);
        instancePath.lineTo(21.0f, 19.0f);
        instancePath.lineTo(23.0f, 19.0f);
        instancePath.close();
        instancePath.moveTo(17.0f, 18.0f);
        instancePath.lineTo(15.0f, 18.0f);
        instancePath.lineTo(15.0f, 20.0f);
        instancePath.lineTo(17.0f, 20.0f);
        instancePath.lineTo(17.0f, 18.0f);
        instancePath.close();
        instancePath.moveTo(10.5f, 2.0f);
        instancePath.cubicTo(12.709139f, 2.0f, 14.5f, 3.7929802f, 14.5f, 6.0002074f);
        instancePath.lineTo(14.5f, 7.7101855f);
        instancePath.cubicTo(14.5f, 8.849296f, 13.900932f, 10.482861f, 13.168087f, 11.351573f);
        instancePath.lineTo(12.806555f, 11.780132f);
        instancePath.cubicTo(12.480202f, 12.16699f, 12.5f, 12.736298f, 12.5f, 13.451569f);
        instancePath.lineTo(12.5f, 20.0f);
        instancePath.lineTo(2.0f, 20.0f);
        Path path = instancePath;
        path.cubicTo(1.4477153f, 20.0f, 1.0f, 19.552284f, 1.0f, 19.0f);
        instancePath.lineTo(1.0f, 18.315464f);
        path.cubicTo(1.0f, 17.630375f, 1.498151f, 16.831907f, 2.1140976f, 16.531332f);
        instancePath.lineTo(7.774451f, 13.769143f);
        path.cubicTo(8.595377f, 13.36854f, 8.786259f, 12.481262f, 8.193445f, 11.778639f);
        instancePath.lineTo(7.8319125f, 11.350138f);
        path.cubicTo(7.096318f, 10.478285f, 6.5f, 8.849497f, 6.5f, 7.7092905f);
        instancePath.lineTo(6.5f, 5.9995804f);
        path.cubicTo(6.5f, 3.790673f, 8.295356f, 2.0f, 10.5f, 2.0f);
        instancePath.close();
        instancePath.moveTo(21.0f, 17.0f);
        instancePath.lineTo(21.0f, 19.0f);
        instancePath.lineTo(19.0f, 19.0f);
        instancePath.lineTo(19.0f, 17.0f);
        instancePath.lineTo(21.0f, 17.0f);
        instancePath.close();
        instancePath.moveTo(18.0f, 12.0f);
        instancePath.lineTo(18.0f, 16.0f);
        instancePath.lineTo(14.0f, 16.0f);
        instancePath.lineTo(14.0f, 12.0f);
        instancePath.lineTo(18.0f, 12.0f);
        instancePath.close();
        instancePath.moveTo(23.0f, 12.0f);
        instancePath.lineTo(23.0f, 16.0f);
        instancePath.lineTo(19.0f, 16.0f);
        instancePath.lineTo(19.0f, 12.0f);
        instancePath.lineTo(23.0f, 12.0f);
        instancePath.close();
        instancePath.moveTo(17.0f, 13.0f);
        instancePath.lineTo(15.0f, 13.0f);
        instancePath.lineTo(15.0f, 15.0f);
        instancePath.lineTo(17.0f, 15.0f);
        instancePath.lineTo(17.0f, 13.0f);
        instancePath.close();
        instancePath.moveTo(22.0f, 13.0f);
        instancePath.lineTo(20.0f, 13.0f);
        instancePath.lineTo(20.0f, 15.0f);
        instancePath.lineTo(22.0f, 15.0f);
        instancePath.lineTo(22.0f, 13.0f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
