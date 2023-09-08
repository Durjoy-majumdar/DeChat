package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_change_size */
public class icons_filled_change_size extends C24542c {
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
        instancePath.moveTo(5.0f, 4.5f);
        Path path = instancePath;
        path.cubicTo(4.7238574f, 4.5f, 4.5f, 4.7238574f, 4.5f, 5.0f);
        instancePath.lineTo(4.5f, 8.75f);
        instancePath.lineTo(3.0f, 8.75f);
        instancePath.lineTo(3.0f, 4.0f);
        path.cubicTo(3.0f, 3.4477153f, 3.4477153f, 3.0f, 4.0f, 3.0f);
        instancePath.lineTo(8.75f, 3.0f);
        instancePath.lineTo(8.75f, 4.5f);
        instancePath.lineTo(5.0f, 4.5f);
        instancePath.close();
        instancePath.moveTo(5.0f, 19.5f);
        instancePath.lineTo(8.75f, 19.5f);
        instancePath.lineTo(8.75f, 21.0f);
        instancePath.lineTo(4.0f, 21.0f);
        path.cubicTo(3.4477153f, 21.0f, 3.0f, 20.552284f, 3.0f, 20.0f);
        instancePath.lineTo(3.0f, 15.25f);
        instancePath.lineTo(4.5f, 15.25f);
        instancePath.lineTo(4.5f, 19.0f);
        path.cubicTo(4.5f, 19.276142f, 4.7238574f, 19.5f, 5.0f, 19.5f);
        instancePath.close();
        instancePath.moveTo(19.0f, 4.5f);
        instancePath.lineTo(15.25f, 4.5f);
        instancePath.lineTo(15.25f, 3.0f);
        instancePath.lineTo(20.0f, 3.0f);
        path.cubicTo(20.552284f, 3.0f, 21.0f, 3.4477153f, 21.0f, 4.0f);
        instancePath.lineTo(21.0f, 8.75f);
        instancePath.lineTo(19.5f, 8.75f);
        instancePath.lineTo(19.5f, 5.0f);
        Path path2 = instancePath;
        path2.cubicTo(19.5f, 4.7238574f, 19.276142f, 4.5f, 19.0f, 4.5f);
        instancePath.close();
        instancePath.moveTo(19.0f, 19.5f);
        path2.cubicTo(19.276142f, 19.5f, 19.5f, 19.276142f, 19.5f, 19.0f);
        instancePath.lineTo(19.5f, 15.25f);
        instancePath.lineTo(21.0f, 15.25f);
        instancePath.lineTo(21.0f, 20.0f);
        path2.cubicTo(21.0f, 20.552284f, 20.552284f, 21.0f, 20.0f, 21.0f);
        instancePath.lineTo(15.25f, 21.0f);
        instancePath.lineTo(15.25f, 19.5f);
        instancePath.lineTo(19.0f, 19.5f);
        instancePath.close();
        instancePath.moveTo(8.0f, 7.0f);
        instancePath.lineTo(16.0f, 7.0f);
        path2.cubicTo(16.552284f, 7.0f, 17.0f, 7.4477153f, 17.0f, 8.0f);
        instancePath.lineTo(17.0f, 16.0f);
        path2.cubicTo(17.0f, 16.552284f, 16.552284f, 17.0f, 16.0f, 17.0f);
        instancePath.lineTo(8.0f, 17.0f);
        path2.cubicTo(7.4477153f, 17.0f, 7.0f, 16.552284f, 7.0f, 16.0f);
        instancePath.lineTo(7.0f, 8.0f);
        path2.cubicTo(7.0f, 7.4477153f, 7.4477153f, 7.0f, 8.0f, 7.0f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
