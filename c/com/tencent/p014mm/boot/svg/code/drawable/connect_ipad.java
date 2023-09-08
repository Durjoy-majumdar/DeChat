package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.connect_ipad */
public class connect_ipad extends C24542c {
    private final int height = 104;
    private final int width = 104;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 104;
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
        instancePaint4.setColor(-16777216);
        instancePaint4.setStrokeWidth(0.8f);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(19.409714f, 0.4f);
        instancePath.lineTo(84.59029f, 0.4f);
        Path path = instancePath;
        path.cubicTo(86.7058f, 0.4f, 87.47856f, 0.6061306f, 88.25347f, 1.020557f);
        path.cubicTo(88.99755f, 1.4184934f, 89.581505f, 2.002449f, 89.97945f, 2.7465253f);
        path.cubicTo(90.39387f, 3.5214353f, 90.6f, 4.294195f, 90.6f, 6.409713f);
        instancePath.lineTo(90.6f, 6.409713f);
        instancePath.lineTo(90.6f, 97.59029f);
        Path path2 = instancePath;
        path2.cubicTo(90.6f, 99.7058f, 90.39387f, 100.47856f, 89.97945f, 101.25347f);
        path2.cubicTo(89.581505f, 101.99755f, 88.99755f, 102.581505f, 88.25347f, 102.97945f);
        path2.cubicTo(87.47856f, 103.39387f, 86.7058f, 103.6f, 84.59029f, 103.6f);
        instancePath.lineTo(84.59029f, 103.6f);
        instancePath.lineTo(19.409714f, 103.6f);
        Path path3 = instancePath;
        path3.cubicTo(17.294195f, 103.6f, 16.521435f, 103.39387f, 15.746526f, 102.97945f);
        path3.cubicTo(15.002449f, 102.581505f, 14.418493f, 101.99755f, 14.020557f, 101.25347f);
        path3.cubicTo(13.606131f, 100.47856f, 13.4f, 99.7058f, 13.4f, 97.59029f);
        instancePath.lineTo(13.4f, 97.59029f);
        instancePath.lineTo(13.4f, 6.409713f);
        path3.cubicTo(13.4f, 4.294195f, 13.606131f, 3.5214353f, 14.020557f, 2.7465253f);
        path3.cubicTo(14.418493f, 2.002449f, 15.002449f, 1.4184934f, 15.746526f, 1.020557f);
        path3.cubicTo(16.521435f, 0.6061306f, 17.294195f, 0.4f, 19.409714f, 0.4f);
        instancePath.lineTo(19.409714f, 0.4f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint3, looper);
        instancePaint5.setColor(-16777216);
        instancePaint5.setStrokeWidth(0.8f);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(18.4f, 10.4f);
        instancePath2.lineTo(85.6f, 10.4f);
        instancePath2.lineTo(85.6f, 91.6f);
        instancePath2.lineTo(18.4f, 91.6f);
        instancePath2.lineTo(18.4f, 10.4f);
        instancePath2.close();
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.save();
        Paint instancePaint6 = C24542c.instancePaint(instancePaint, looper);
        instancePaint6.setColor(-16777216);
        Path instancePath3 = C24542c.instancePath(looper);
        instancePath3.moveTo(52.0f, 4.25f);
        Path path4 = instancePath3;
        path4.cubicTo(52.552284f, 4.25f, 53.0f, 4.6977153f, 53.0f, 5.25f);
        path4.cubicTo(53.0f, 5.8022847f, 52.552284f, 6.25f, 52.0f, 6.25f);
        path4.cubicTo(51.447716f, 6.25f, 51.0f, 5.8022847f, 51.0f, 5.25f);
        path4.cubicTo(51.0f, 4.6977153f, 51.447716f, 4.25f, 52.0f, 4.25f);
        instancePath3.close();
        canvas.drawPath(instancePath3, instancePaint6);
        canvas.restore();
        canvas.save();
        Paint instancePaint7 = C24542c.instancePaint(instancePaint3, looper);
        instancePaint7.setColor(-16777216);
        instancePaint7.setStrokeWidth(0.8f);
        Path instancePath4 = C24542c.instancePath(looper);
        instancePath4.moveTo(52.0f, 95.0f);
        Path path5 = instancePath4;
        path5.cubicTo(53.38071f, 95.0f, 54.5f, 96.119286f, 54.5f, 97.5f);
        path5.cubicTo(54.5f, 98.880714f, 53.38071f, 100.0f, 52.0f, 100.0f);
        path5.cubicTo(50.61929f, 100.0f, 49.5f, 98.880714f, 49.5f, 97.5f);
        path5.cubicTo(49.5f, 96.119286f, 50.61929f, 95.0f, 52.0f, 95.0f);
        instancePath4.close();
        canvas.drawPath(instancePath4, instancePaint7);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
