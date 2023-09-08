package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.finder_full_share_outlined */
public class finder_full_share_outlined extends C24542c {
    private final int height = 72;
    private final int width = 72;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 72;
        if (!(i2 == 0 || i2 == 1)) {
            i3 = 0;
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
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(0.0f, 0.0f);
                instancePath.lineTo(72.0f, 0.0f);
                instancePath.lineTo(72.0f, 72.0f);
                instancePath.lineTo(0.0f, 72.0f);
                instancePath.lineTo(0.0f, 0.0f);
                instancePath.close();
                canvas.save();
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-436207616);
                Path instancePath2 = C24542c.instancePath(looper);
                instancePath2.moveTo(39.011105f, 8.994088f);
                instancePath2.cubicTo(39.8018f, 8.994088f, 40.560524f, 9.306245f, 41.122288f, 9.862679f);
                instancePath2.lineTo(62.636173f, 31.172398f);
                instancePath2.cubicTo(63.722767f, 32.248684f, 63.814068f, 33.94996f, 62.904613f, 35.131184f);
                instancePath2.lineTo(62.636173f, 35.43522f);
                instancePath2.lineTo(41.122288f, 56.744938f);
                Path path = instancePath2;
                path.cubicTo(39.94514f, 57.91091f, 38.04567f, 57.901855f, 36.879696f, 56.724712f);
                path.cubicTo(36.32326f, 56.162945f, 36.011105f, 55.404224f, 36.011105f, 54.61353f);
                instancePath2.lineTo(36.011105f, 44.764744f);
                Path path2 = instancePath2;
                path2.cubicTo(28.995237f, 45.32863f, 18.754921f, 49.474026f, 13.427593f, 62.465485f);
                path2.cubicTo(12.542523f, 64.623856f, 10.371325f, 64.60521f, 9.898796f, 61.807617f);
                path2.cubicTo(6.1593475f, 39.6683f, 18.754921f, 24.644394f, 36.011105f, 21.925137f);
                instancePath2.lineTo(36.011105f, 11.994088f);
                instancePath2.cubicTo(36.011105f, 10.337234f, 37.35425f, 8.994088f, 39.011105f, 8.994088f);
                instancePath2.close();
                instancePath2.moveTo(39.609f, 13.434f);
                instancePath2.lineTo(39.611103f, 25.002266f);
                instancePath2.lineTo(36.571484f, 25.481255f);
                instancePath2.cubicTo(22.094788f, 27.762516f, 12.642968f, 39.040146f, 12.850238f, 54.758244f);
                instancePath2.lineTo(12.87f, 55.62f);
                instancePath2.lineTo(12.945931f, 55.49552f);
                instancePath2.cubicTo(18.267673f, 46.925255f, 26.308218f, 42.200375f, 34.86534f, 41.25795f);
                instancePath2.lineTo(35.722694f, 41.176315f);
                instancePath2.lineTo(39.611103f, 40.863792f);
                instancePath2.lineTo(39.609f, 53.172f);
                instancePath2.lineTo(59.673f, 33.303f);
                instancePath2.lineTo(39.609f, 13.434f);
                instancePath2.close();
                WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint3);
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i3;
    }
}
