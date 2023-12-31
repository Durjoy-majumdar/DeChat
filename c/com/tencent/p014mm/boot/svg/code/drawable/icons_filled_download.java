package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_download */
public class icons_filled_download extends C24542c {
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
        instancePath.moveTo(10.999252f, 14.071f);
        instancePath.lineTo(8.464466f, 11.535534f);
        instancePath.lineTo(7.0502524f, 12.949747f);
        instancePath.lineTo(11.646446f, 17.545942f);
        instancePath.cubicTo(11.820013f, 17.719507f, 12.0894375f, 17.738792f, 12.284306f, 17.603798f);
        instancePath.lineTo(12.353554f, 17.545942f);
        instancePath.lineTo(16.949747f, 12.949747f);
        instancePath.lineTo(15.535534f, 11.535534f);
        instancePath.lineTo(12.999252f, 14.071f);
        instancePath.lineTo(13.0f, 6.0f);
        instancePath.lineTo(19.0f, 6.0f);
        instancePath.cubicTo(19.552284f, 6.0f, 20.0f, 6.4477153f, 20.0f, 7.0f);
        instancePath.lineTo(20.0f, 20.5f);
        instancePath.cubicTo(20.0f, 21.052284f, 19.552284f, 21.5f, 19.0f, 21.5f);
        instancePath.lineTo(5.0f, 21.5f);
        Path path = instancePath;
        path.cubicTo(4.4477153f, 21.5f, 4.0f, 21.052284f, 4.0f, 20.5f);
        instancePath.lineTo(4.0f, 7.0f);
        path.cubicTo(4.0f, 6.4477153f, 4.4477153f, 6.0f, 5.0f, 6.0f);
        instancePath.lineTo(11.0f, 6.0f);
        instancePath.lineTo(11.0f, 2.0f);
        instancePath.lineTo(13.0f, 2.0f);
        instancePath.lineTo(13.0f, 6.25f);
        instancePath.lineTo(11.0f, 6.25f);
        instancePath.lineTo(10.999252f, 14.071f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
