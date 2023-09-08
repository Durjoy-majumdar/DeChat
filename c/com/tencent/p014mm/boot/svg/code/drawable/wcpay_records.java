package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.wcpay_records */
public class wcpay_records extends C24542c {
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
        instancePath.moveTo(5.076923f, 2.9f);
        instancePath.cubicTo(5.4592743f, 2.9f, 5.769231f, 3.2099566f, 5.769231f, 3.5923078f);
        instancePath.lineTo(5.769231f, 3.6076922f);
        instancePath.cubicTo(5.769231f, 3.9900434f, 5.4592743f, 4.3f, 5.076923f, 4.3f);
        instancePath.lineTo(4.384f, 4.3f);
        instancePath.lineTo(4.384f, 21.099f);
        instancePath.lineTo(19.615f, 21.099f);
        instancePath.lineTo(19.615f, 4.3f);
        instancePath.lineTo(18.923077f, 4.3f);
        instancePath.cubicTo(18.540726f, 4.3f, 18.23077f, 3.9900434f, 18.23077f, 3.6076922f);
        instancePath.lineTo(18.23077f, 3.5923078f);
        instancePath.cubicTo(18.23077f, 3.2099566f, 18.540726f, 2.9f, 18.923077f, 2.9f);
        instancePath.lineTo(20.307692f, 2.9f);
        instancePath.cubicTo(20.690042f, 2.9f, 21.0f, 3.2099566f, 21.0f, 3.5923078f);
        instancePath.lineTo(21.0f, 21.807692f);
        instancePath.cubicTo(21.0f, 22.190042f, 20.690042f, 22.5f, 20.307692f, 22.5f);
        instancePath.lineTo(20.294f, 22.499f);
        instancePath.lineTo(3.705498f, 22.499876f);
        Path path = instancePath;
        path.cubicTo(3.701111f, 22.499958f, 3.6967142f, 22.5f, 3.6923077f, 22.5f);
        path.cubicTo(3.3099568f, 22.5f, 3.0f, 22.190042f, 3.0f, 21.807692f);
        instancePath.lineTo(3.0f, 3.5923078f);
        Path path2 = instancePath;
        path2.cubicTo(3.0f, 3.2099566f, 3.3099568f, 2.9f, 3.6923077f, 2.9f);
        instancePath.lineTo(5.076923f, 2.9f);
        instancePath.close();
        instancePath.moveTo(16.153847f, 15.5f);
        path2.cubicTo(16.536198f, 15.5f, 16.846153f, 15.809957f, 16.846153f, 16.192308f);
        instancePath.lineTo(16.846153f, 16.207693f);
        instancePath.cubicTo(16.846153f, 16.590044f, 16.536198f, 16.9f, 16.153847f, 16.9f);
        instancePath.lineTo(7.8461537f, 16.9f);
        instancePath.cubicTo(7.463803f, 16.9f, 7.1538463f, 16.590044f, 7.1538463f, 16.207693f);
        instancePath.lineTo(7.1538463f, 16.192308f);
        Path path3 = instancePath;
        path3.cubicTo(7.1538463f, 15.809957f, 7.463803f, 15.5f, 7.8461537f, 15.5f);
        instancePath.lineTo(16.153847f, 15.5f);
        instancePath.close();
        instancePath.moveTo(16.153847f, 9.9f);
        path3.cubicTo(16.536198f, 9.9f, 16.846153f, 10.209957f, 16.846153f, 10.592308f);
        instancePath.lineTo(16.846153f, 10.607693f);
        instancePath.cubicTo(16.846153f, 10.990044f, 16.536198f, 11.3f, 16.153847f, 11.3f);
        instancePath.lineTo(7.8461537f, 11.3f);
        instancePath.cubicTo(7.463803f, 11.3f, 7.1538463f, 10.990044f, 7.1538463f, 10.607693f);
        instancePath.lineTo(7.1538463f, 10.592308f);
        Path path4 = instancePath;
        path4.cubicTo(7.1538463f, 10.209957f, 7.463803f, 9.9f, 7.8461537f, 9.9f);
        instancePath.lineTo(16.153847f, 9.9f);
        instancePath.close();
        instancePath.moveTo(7.8461537f, 1.5f);
        path4.cubicTo(8.228505f, 1.5f, 8.538462f, 1.8099567f, 8.538462f, 2.1923077f);
        instancePath.lineTo(8.538462f, 5.0076923f);
        Path path5 = instancePath;
        path5.cubicTo(8.538462f, 5.3900433f, 8.228505f, 5.7f, 7.8461537f, 5.7f);
        path5.cubicTo(7.463803f, 5.7f, 7.1538463f, 5.3900433f, 7.1538463f, 5.0076923f);
        instancePath.lineTo(7.1538463f, 2.1923077f);
        Path path6 = instancePath;
        path6.cubicTo(7.1538463f, 1.8099567f, 7.463803f, 1.5f, 7.8461537f, 1.5f);
        instancePath.close();
        instancePath.moveTo(16.153847f, 1.5f);
        path6.cubicTo(16.536198f, 1.5f, 16.846153f, 1.8099567f, 16.846153f, 2.1923077f);
        instancePath.lineTo(16.846153f, 5.0076923f);
        path6.cubicTo(16.846153f, 5.3900433f, 16.536198f, 5.7f, 16.153847f, 5.7f);
        path6.cubicTo(15.771495f, 5.7f, 15.461538f, 5.3900433f, 15.461538f, 5.0076923f);
        instancePath.lineTo(15.461538f, 2.1923077f);
        path6.cubicTo(15.461538f, 1.8099567f, 15.771495f, 1.5f, 16.153847f, 1.5f);
        instancePath.close();
        instancePath.moveTo(13.384615f, 2.9f);
        path6.cubicTo(13.766967f, 2.9f, 14.076923f, 3.2099566f, 14.076923f, 3.5923078f);
        instancePath.lineTo(14.076923f, 3.6076922f);
        path6.cubicTo(14.076923f, 3.9900434f, 13.766967f, 4.3f, 13.384615f, 4.3f);
        instancePath.lineTo(10.615385f, 4.3f);
        path6.cubicTo(10.233033f, 4.3f, 9.923077f, 3.9900434f, 9.923077f, 3.6076922f);
        instancePath.lineTo(9.923077f, 3.5923078f);
        path6.cubicTo(9.923077f, 3.2099566f, 10.233033f, 2.9f, 10.615385f, 2.9f);
        instancePath.lineTo(13.384615f, 2.9f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
