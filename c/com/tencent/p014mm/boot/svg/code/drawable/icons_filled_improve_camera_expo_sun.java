package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_improve_camera_expo_sun */
public class icons_filled_improve_camera_expo_sun extends C24542c {
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
        C24542c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-1);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(38.16f, 61.2f);
        instancePath.lineTo(38.16f, 72.0f);
        instancePath.lineTo(33.84f, 72.0f);
        instancePath.lineTo(33.84f, 61.2f);
        instancePath.lineTo(38.16f, 61.2f);
        instancePath.close();
        instancePath.moveTo(16.6536f, 52.2917f);
        instancePath.lineTo(19.7083f, 55.3464f);
        instancePath.lineTo(12.0715f, 62.9832f);
        instancePath.lineTo(9.01681f, 59.9285f);
        instancePath.lineTo(16.6536f, 52.2917f);
        instancePath.close();
        instancePath.moveTo(55.3464f, 52.2917f);
        instancePath.lineTo(62.9832f, 59.9285f);
        instancePath.lineTo(59.9285f, 62.9832f);
        instancePath.lineTo(52.2917f, 55.3464f);
        instancePath.lineTo(55.3464f, 52.2917f);
        instancePath.close();
        instancePath.moveTo(36.0f, 18.0f);
        Path path = instancePath;
        path.cubicTo(45.9411f, 18.0f, 54.0f, 26.0589f, 54.0f, 36.0f);
        path.cubicTo(54.0f, 45.9411f, 45.9411f, 54.0f, 36.0f, 54.0f);
        path.cubicTo(26.0589f, 54.0f, 18.0f, 45.9411f, 18.0f, 36.0f);
        path.cubicTo(18.0f, 26.0589f, 26.0589f, 18.0f, 36.0f, 18.0f);
        instancePath.close();
        instancePath.moveTo(36.0f, 22.32f);
        Path path2 = instancePath;
        path2.cubicTo(28.4447f, 22.32f, 22.32f, 28.4447f, 22.32f, 36.0f);
        path2.cubicTo(22.32f, 43.5553f, 28.4447f, 49.68f, 36.0f, 49.68f);
        path2.cubicTo(43.5553f, 49.68f, 49.68f, 43.5553f, 49.68f, 36.0f);
        path2.cubicTo(49.68f, 28.4447f, 43.5553f, 22.32f, 36.0f, 22.32f);
        instancePath.close();
        instancePath.moveTo(10.8f, 33.84f);
        instancePath.lineTo(10.8f, 38.16f);
        instancePath.lineTo(0.0f, 38.16f);
        instancePath.lineTo(0.0f, 33.84f);
        instancePath.lineTo(10.8f, 33.84f);
        instancePath.close();
        instancePath.moveTo(72.0f, 33.84f);
        instancePath.lineTo(72.0f, 38.16f);
        instancePath.lineTo(61.2f, 38.16f);
        instancePath.lineTo(61.2f, 33.84f);
        instancePath.lineTo(72.0f, 33.84f);
        instancePath.close();
        instancePath.moveTo(59.9285f, 9.01681f);
        instancePath.lineTo(62.9832f, 12.0715f);
        instancePath.lineTo(55.3464f, 19.7083f);
        instancePath.lineTo(52.2917f, 16.6536f);
        instancePath.lineTo(59.9285f, 9.01681f);
        instancePath.close();
        instancePath.moveTo(12.0715f, 9.01681f);
        instancePath.lineTo(19.7083f, 16.6536f);
        instancePath.lineTo(16.6536f, 19.7083f);
        instancePath.lineTo(9.01681f, 12.0715f);
        instancePath.lineTo(12.0715f, 9.01681f);
        instancePath.close();
        instancePath.moveTo(38.16f, 0.0f);
        instancePath.lineTo(38.16f, 10.8f);
        instancePath.lineTo(33.84f, 10.8f);
        instancePath.lineTo(33.84f, 0.0f);
        instancePath.lineTo(38.16f, 0.0f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(36.0f, 21.600098f);
        Path path3 = instancePath2;
        path3.cubicTo(44.947014f, 21.600098f, 52.2f, 28.853085f, 52.2f, 37.8001f);
        path3.cubicTo(52.2f, 46.747112f, 44.947014f, 54.0001f, 36.0f, 54.0001f);
        path3.cubicTo(27.052986f, 54.0001f, 19.8f, 46.747112f, 19.8f, 37.8001f);
        path3.cubicTo(19.8f, 28.853085f, 27.052986f, 21.600098f, 36.0f, 21.600098f);
        instancePath2.close();
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
