package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.scan_success_mark_dot */
public class scan_success_mark_dot extends C24542c {
    private final int height = 40;
    private final int width = 40;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 40;
        }
        if (i2 == 2) {
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
            instancePaint3.setColor(-435699360);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(20.0f, 0.0f);
            Path path = instancePath;
            path.cubicTo(31.045696f, 0.0f, 40.0f, 8.954305f, 40.0f, 20.0f);
            path.cubicTo(40.0f, 31.045696f, 31.045696f, 40.0f, 20.0f, 40.0f);
            path.cubicTo(8.954305f, 40.0f, 0.0f, 31.045696f, 0.0f, 20.0f);
            path.cubicTo(0.0f, 8.954305f, 8.954305f, 0.0f, 20.0f, 0.0f);
            instancePath.close();
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
            instancePaint4.setColor(-419430401);
            Path instancePath2 = C24542c.instancePath(looper);
            instancePath2.moveTo(20.0f, 0.0f);
            Path path2 = instancePath2;
            path2.cubicTo(31.045694f, 0.0f, 40.0f, 8.954305f, 40.0f, 20.0f);
            path2.cubicTo(40.0f, 31.045694f, 31.045694f, 40.0f, 20.0f, 40.0f);
            path2.cubicTo(8.954305f, 40.0f, 0.0f, 31.045694f, 0.0f, 20.0f);
            path2.cubicTo(0.0f, 8.954305f, 8.954305f, 0.0f, 20.0f, 0.0f);
            instancePath2.close();
            instancePath2.moveTo(20.0f, 2.5f);
            Path path3 = instancePath2;
            path3.cubicTo(10.335017f, 2.5f, 2.5f, 10.335017f, 2.5f, 20.0f);
            path3.cubicTo(2.5f, 29.664984f, 10.335017f, 37.5f, 20.0f, 37.5f);
            path3.cubicTo(29.664984f, 37.5f, 37.5f, 29.664984f, 37.5f, 20.0f);
            path3.cubicTo(37.5f, 10.335017f, 29.664984f, 2.5f, 20.0f, 2.5f);
            instancePath2.close();
            WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
            canvas.drawPath(instancePath2, instancePaint4);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
