package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.app_attach_file_icon_ppt_in_gird */
public class app_attach_file_icon_ppt_in_gird extends C24542c {
    private final int height = 80;
    private final int width = 80;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 80;
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
                instancePaint3.setColor(-1);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(26.302921f, 41.794167f);
                instancePath.lineTo(26.302921f, 19.211407f);
                instancePath.lineTo(42.211685f, 19.211407f);
                Path path = instancePath;
                path.cubicTo(45.428864f, 19.211407f, 48.29014f, 20.02573f, 49.282246f, 20.948542f);
                path.cubicTo(51.91206f, 23.283072f, 54.585167f, 22.735918f, 54.585167f, 29.634218f);
                path.cubicTo(54.585167f, 36.532516f, 51.91206f, 37.73257f, 49.282246f, 40.05703f);
                path.cubicTo(48.29014f, 41.03853f, 45.428864f, 41.8407f, 42.211685f, 41.794167f);
                instancePath.lineTo(26.302921f, 41.794167f);
                instancePath.close();
                instancePath.moveTo(21.0f, 14.0f);
                instancePath.lineTo(21.0f, 66.11406f);
                instancePath.lineTo(26.302921f, 66.11406f);
                instancePath.lineTo(26.302921f, 47.005573f);
                instancePath.lineTo(43.979324f, 47.005573f);
                Path path2 = instancePath;
                path2.cubicTo(49.142723f, 47.14359f, 53.855812f, 44.454838f, 56.352806f, 41.794167f);
                path2.cubicTo(58.849804f, 39.133495f, 59.88809f, 35.37987f, 59.88809f, 31.371353f);
                path2.cubicTo(59.88809f, 25.94755f, 58.53579f, 22.28079f, 56.352806f, 19.211407f);
                path2.cubicTo(53.8633f, 15.711034f, 49.142723f, 14.0f, 43.979324f, 14.0f);
                instancePath.lineTo(21.0f, 14.0f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i3;
    }
}
