package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_more2 */
public class icons_outlined_more2 extends C24542c {
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
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-16777216);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(36.0f, 66.0f);
                Path path = instancePath;
                path.cubicTo(19.431458f, 66.0f, 6.0f, 52.568542f, 6.0f, 36.0f);
                path.cubicTo(6.0f, 19.431458f, 19.431458f, 6.0f, 36.0f, 6.0f);
                path.cubicTo(52.568542f, 6.0f, 66.0f, 19.431458f, 66.0f, 36.0f);
                path.cubicTo(66.0f, 52.568542f, 52.568542f, 66.0f, 36.0f, 66.0f);
                instancePath.close();
                instancePath.moveTo(36.0f, 62.4f);
                Path path2 = instancePath;
                path2.cubicTo(50.58032f, 62.4f, 62.4f, 50.58032f, 62.4f, 36.0f);
                path2.cubicTo(62.4f, 21.419683f, 50.58032f, 9.6f, 36.0f, 9.6f);
                path2.cubicTo(21.419683f, 9.6f, 9.6f, 21.419683f, 9.6f, 36.0f);
                path2.cubicTo(9.6f, 50.58032f, 21.419683f, 62.4f, 36.0f, 62.4f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 1);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                canvas.save();
                Paint instancePaint5 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath2 = C24542c.instancePath(looper);
                instancePath2.moveTo(36.0f, 39.0f);
                Path path3 = instancePath2;
                path3.cubicTo(34.343147f, 39.0f, 33.0f, 37.656853f, 33.0f, 36.0f);
                path3.cubicTo(33.0f, 34.343147f, 34.343147f, 33.0f, 36.0f, 33.0f);
                path3.cubicTo(37.656853f, 33.0f, 39.0f, 34.343147f, 39.0f, 36.0f);
                path3.cubicTo(39.0f, 37.656853f, 37.656853f, 39.0f, 36.0f, 39.0f);
                instancePath2.close();
                instancePath2.moveTo(48.0f, 39.0f);
                Path path4 = instancePath2;
                path4.cubicTo(46.343147f, 39.0f, 45.0f, 37.656853f, 45.0f, 36.0f);
                path4.cubicTo(45.0f, 34.343147f, 46.343147f, 33.0f, 48.0f, 33.0f);
                path4.cubicTo(49.656853f, 33.0f, 51.0f, 34.343147f, 51.0f, 36.0f);
                path4.cubicTo(51.0f, 37.656853f, 49.656853f, 39.0f, 48.0f, 39.0f);
                instancePath2.close();
                instancePath2.moveTo(24.0f, 39.0f);
                Path path5 = instancePath2;
                path5.cubicTo(22.343145f, 39.0f, 21.0f, 37.656853f, 21.0f, 36.0f);
                path5.cubicTo(21.0f, 34.343147f, 22.343145f, 33.0f, 24.0f, 33.0f);
                path5.cubicTo(25.656855f, 33.0f, 27.0f, 34.343147f, 27.0f, 36.0f);
                path5.cubicTo(27.0f, 37.656853f, 25.656855f, 39.0f, 24.0f, 39.0f);
                instancePath2.close();
                WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint5);
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i3;
    }
}
