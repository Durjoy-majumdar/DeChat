package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.text_bg_unselected */
public class text_bg_unselected extends C24542c {
    private final int height = 60;
    private final int width = 60;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 60;
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
        Paint instancePaint3 = C24542c.instancePaint(instancePaint2, looper);
        instancePaint3.setStrokeWidth(1.0f);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        instancePaint4.setColor(-1);
        instancePaint4.setStrokeWidth(3.0f);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(1.5f, 4.5f);
        Path path = instancePath;
        path.cubicTo(1.5f, 2.8431456f, 2.8431456f, 1.5f, 4.5f, 1.5f);
        instancePath.lineTo(54.0f, 1.5f);
        path.cubicTo(55.656853f, 1.5f, 57.0f, 2.8431456f, 57.0f, 4.5f);
        instancePath.lineTo(57.0f, 54.0f);
        path.cubicTo(57.0f, 55.656853f, 55.656853f, 57.0f, 54.0f, 57.0f);
        instancePath.lineTo(4.5f, 57.0f);
        path.cubicTo(2.8431456f, 57.0f, 1.5f, 55.656853f, 1.5f, 54.0f);
        instancePath.lineTo(1.5f, 4.5f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-1);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(31.5f, 18.0f);
        instancePath2.lineTo(31.5f, 46.5f);
        instancePath2.cubicTo(31.5f, 47.328426f, 30.828426f, 48.0f, 30.0f, 48.0f);
        instancePath2.lineTo(27.0f, 48.0f);
        instancePath2.cubicTo(26.171574f, 48.0f, 25.5f, 47.328426f, 25.5f, 46.5f);
        instancePath2.lineTo(25.5f, 18.0f);
        instancePath2.lineTo(13.5f, 18.0f);
        Path path2 = instancePath2;
        path2.cubicTo(12.671573f, 18.0f, 12.0f, 17.328426f, 12.0f, 16.5f);
        instancePath2.lineTo(12.0f, 13.5f);
        path2.cubicTo(12.0f, 12.671573f, 12.671573f, 12.0f, 13.5f, 12.0f);
        instancePath2.lineTo(45.0f, 12.0f);
        instancePath2.cubicTo(45.828426f, 12.0f, 46.5f, 12.671573f, 46.5f, 13.5f);
        instancePath2.lineTo(46.5f, 16.5f);
        instancePath2.cubicTo(46.5f, 17.328426f, 45.828426f, 18.0f, 45.0f, 18.0f);
        instancePath2.lineTo(31.5f, 18.0f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
