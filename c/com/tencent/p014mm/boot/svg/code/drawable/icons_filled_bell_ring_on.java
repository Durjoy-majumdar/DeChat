package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_bell_ring_on */
public class icons_filled_bell_ring_on extends C24542c {
    private final int height = 72;
    private final int width = 72;

    public int doCommand(int i, Object... objArr) {
        int i2 = 72;
        if (!(i == 0 || i == 1)) {
            i2 = 0;
            if (i == 2) {
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
                instancePaint3.setColor(-16777216);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(33.0f, 60.0f);
                instancePath.lineTo(15.560121f, 60.0f);
                Path path = instancePath;
                path.cubicTo(14.921177f, 60.0f, 14.2989235f, 59.795994f, 13.784002f, 59.4177f);
                path.cubicTo(12.448801f, 58.43678f, 12.161601f, 56.55919f, 13.142524f, 55.223988f);
                instancePath.lineTo(13.142439f, 55.223927f);
                instancePath.cubicTo(16.380814f, 50.815952f, 18.0f, 46.407974f, 18.0f, 42.0f);
                instancePath.lineTo(18.0f, 30.0f);
                Path path2 = instancePath;
                path2.cubicTo(18.0f, 22.132008f, 23.048136f, 15.443072f, 30.08219f, 12.995409f);
                path2.cubicTo(30.028131f, 12.671648f, 30.0f, 12.339109f, 30.0f, 12.0f);
                path2.cubicTo(30.0f, 8.686292f, 32.68629f, 6.0f, 36.0f, 6.0f);
                path2.cubicTo(39.31371f, 6.0f, 42.0f, 8.686292f, 42.0f, 12.0f);
                path2.cubicTo(42.0f, 12.339109f, 41.971867f, 12.671648f, 41.91781f, 12.995409f);
                path2.cubicTo(48.951862f, 15.443072f, 54.0f, 22.132008f, 54.0f, 30.0f);
                instancePath.lineTo(54.0f, 42.0f);
                Path path3 = instancePath;
                path3.cubicTo(54.0f, 46.40793f, 55.619152f, 50.815853f, 58.857456f, 55.22378f);
                path3.cubicTo(59.235767f, 55.73873f, 59.43978f, 56.361023f, 59.43978f, 57.0f);
                path3.cubicTo(59.43978f, 58.656902f, 58.0966f, 60.000084f, 56.439697f, 60.000084f);
                instancePath.lineTo(39.0f, 60.00001f);
                instancePath.lineTo(39.0f, 60.6f);
                Path path4 = instancePath;
                path4.cubicTo(39.0f, 62.256855f, 37.656853f, 63.6f, 36.0f, 63.6f);
                path4.cubicTo(34.343147f, 63.6f, 33.0f, 62.256855f, 33.0f, 60.6f);
                instancePath.lineTo(33.0f, 60.0f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i2;
    }
}
