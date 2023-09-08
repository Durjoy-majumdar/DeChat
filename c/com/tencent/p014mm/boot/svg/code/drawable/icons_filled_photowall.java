package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_photowall */
public class icons_filled_photowall extends C24542c {
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
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(0.0f, 0.0f);
        instancePath.lineTo(24.0f, 0.0f);
        instancePath.lineTo(24.0f, 24.0f);
        instancePath.lineTo(0.0f, 24.0f);
        instancePath.lineTo(0.0f, 0.0f);
        instancePath.close();
        canvas.save();
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-1);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(7.0f, 13.0f);
        Path path = instancePath2;
        path.cubicTo(7.2761426f, 13.0f, 7.5f, 13.223858f, 7.5f, 13.5f);
        instancePath2.lineTo(7.5f, 18.0f);
        path.cubicTo(7.5f, 18.276142f, 7.2761426f, 18.5f, 7.0f, 18.5f);
        instancePath2.lineTo(2.5f, 18.5f);
        path.cubicTo(2.2238576f, 18.5f, 2.0f, 18.276142f, 2.0f, 18.0f);
        instancePath2.lineTo(2.0f, 13.5f);
        path.cubicTo(2.0f, 13.223858f, 2.2238576f, 13.0f, 2.5f, 13.0f);
        instancePath2.lineTo(7.0f, 13.0f);
        instancePath2.close();
        instancePath2.moveTo(14.25f, 13.0f);
        path.cubicTo(14.526142f, 13.0f, 14.75f, 13.223858f, 14.75f, 13.5f);
        instancePath2.lineTo(14.75f, 18.0f);
        instancePath2.cubicTo(14.75f, 18.276142f, 14.526142f, 18.5f, 14.25f, 18.5f);
        instancePath2.lineTo(9.75f, 18.5f);
        instancePath2.cubicTo(9.473858f, 18.5f, 9.25f, 18.276142f, 9.25f, 18.0f);
        instancePath2.lineTo(9.25f, 13.5f);
        Path path2 = instancePath2;
        path2.cubicTo(9.25f, 13.223858f, 9.473858f, 13.0f, 9.75f, 13.0f);
        instancePath2.lineTo(14.25f, 13.0f);
        instancePath2.close();
        instancePath2.moveTo(21.5f, 13.0f);
        path2.cubicTo(21.776142f, 13.0f, 22.0f, 13.223858f, 22.0f, 13.5f);
        instancePath2.lineTo(22.0f, 18.0f);
        Path path3 = instancePath2;
        path3.cubicTo(22.0f, 18.276142f, 21.776142f, 18.5f, 21.5f, 18.5f);
        instancePath2.lineTo(17.0f, 18.5f);
        path3.cubicTo(16.723858f, 18.5f, 16.5f, 18.276142f, 16.5f, 18.0f);
        instancePath2.lineTo(16.5f, 13.5f);
        path3.cubicTo(16.5f, 13.223858f, 16.723858f, 13.0f, 17.0f, 13.0f);
        instancePath2.lineTo(21.5f, 13.0f);
        instancePath2.close();
        instancePath2.moveTo(7.0f, 5.5f);
        path3.cubicTo(7.2761426f, 5.5f, 7.5f, 5.7238574f, 7.5f, 6.0f);
        instancePath2.lineTo(7.5f, 10.5f);
        instancePath2.cubicTo(7.5f, 10.776142f, 7.2761426f, 11.0f, 7.0f, 11.0f);
        instancePath2.lineTo(2.5f, 11.0f);
        instancePath2.cubicTo(2.2238576f, 11.0f, 2.0f, 10.776142f, 2.0f, 10.5f);
        instancePath2.lineTo(2.0f, 6.0f);
        instancePath2.cubicTo(2.0f, 5.7238574f, 2.2238576f, 5.5f, 2.5f, 5.5f);
        instancePath2.lineTo(7.0f, 5.5f);
        instancePath2.close();
        instancePath2.moveTo(14.25f, 5.5f);
        instancePath2.cubicTo(14.526142f, 5.5f, 14.75f, 5.7238574f, 14.75f, 6.0f);
        instancePath2.lineTo(14.75f, 10.5f);
        instancePath2.cubicTo(14.75f, 10.776142f, 14.526142f, 11.0f, 14.25f, 11.0f);
        instancePath2.lineTo(9.75f, 11.0f);
        instancePath2.cubicTo(9.473858f, 11.0f, 9.25f, 10.776142f, 9.25f, 10.5f);
        instancePath2.lineTo(9.25f, 6.0f);
        instancePath2.cubicTo(9.25f, 5.7238574f, 9.473858f, 5.5f, 9.75f, 5.5f);
        instancePath2.lineTo(14.25f, 5.5f);
        instancePath2.close();
        instancePath2.moveTo(21.5f, 5.5f);
        instancePath2.cubicTo(21.776142f, 5.5f, 22.0f, 5.7238574f, 22.0f, 6.0f);
        instancePath2.lineTo(22.0f, 10.5f);
        Path path4 = instancePath2;
        path4.cubicTo(22.0f, 10.776142f, 21.776142f, 11.0f, 21.5f, 11.0f);
        instancePath2.lineTo(17.0f, 11.0f);
        path4.cubicTo(16.723858f, 11.0f, 16.5f, 10.776142f, 16.5f, 10.5f);
        instancePath2.lineTo(16.5f, 6.0f);
        path4.cubicTo(16.5f, 5.7238574f, 16.723858f, 5.5f, 17.0f, 5.5f);
        instancePath2.lineTo(21.5f, 5.5f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint3);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
