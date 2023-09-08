package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.finder_icons_screen_clear */
public class finder_icons_screen_clear extends C24542c {
    private final int height = 24;
    private final int width = 24;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 24;
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
                instancePath.lineTo(24.0f, 0.0f);
                instancePath.lineTo(24.0f, 24.0f);
                instancePath.lineTo(0.0f, 24.0f);
                instancePath.lineTo(0.0f, 0.0f);
                instancePath.close();
                canvas.save();
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-436207616);
                Path instancePath2 = C24542c.instancePath(looper);
                instancePath2.moveTo(17.0f, 12.0f);
                Path path = instancePath2;
                path.cubicTo(19.761423f, 12.0f, 22.0f, 14.238576f, 22.0f, 17.0f);
                path.cubicTo(22.0f, 19.761423f, 19.761423f, 22.0f, 17.0f, 22.0f);
                path.cubicTo(14.238576f, 22.0f, 12.0f, 19.761423f, 12.0f, 17.0f);
                path.cubicTo(12.0f, 14.238576f, 14.238576f, 12.0f, 17.0f, 12.0f);
                instancePath2.close();
                instancePath2.moveTo(18.5f, 2.5f);
                path.cubicTo(19.052284f, 2.5f, 19.5f, 2.9477153f, 19.5f, 3.5f);
                instancePath2.lineTo(19.501078f, 11.3251505f);
                instancePath2.cubicTo(19.119453f, 11.156712f, 18.717638f, 11.02564f, 18.300264f, 10.936569f);
                instancePath2.lineTo(18.3f, 3.7f);
                instancePath2.lineTo(5.7f, 3.7f);
                instancePath2.lineTo(5.7f, 20.3f);
                instancePath2.lineTo(11.75086f, 20.300999f);
                instancePath2.cubicTo(12.028432f, 20.741457f, 12.359909f, 21.144535f, 12.736031f, 21.50097f);
                instancePath2.lineTo(5.5f, 21.5f);
                instancePath2.cubicTo(4.9477153f, 21.5f, 4.5f, 21.052284f, 4.5f, 20.5f);
                instancePath2.lineTo(4.5f, 3.5f);
                Path path2 = instancePath2;
                path2.cubicTo(4.5f, 2.9477153f, 4.9477153f, 2.5f, 5.5f, 2.5f);
                instancePath2.lineTo(18.5f, 2.5f);
                instancePath2.close();
                instancePath2.moveTo(13.9221945f, 14.770833f);
                path2.cubicTo(13.467889f, 15.397004f, 13.2f, 16.167217f, 13.2f, 17.0f);
                path2.cubicTo(13.2f, 19.098682f, 14.901318f, 20.8f, 17.0f, 20.8f);
                path2.cubicTo(17.832783f, 20.8f, 18.602997f, 20.53211f, 19.229166f, 20.077806f);
                instancePath2.lineTo(13.9221945f, 14.770833f);
                instancePath2.close();
                instancePath2.moveTo(17.0f, 13.2f);
                instancePath2.cubicTo(16.167217f, 13.2f, 15.397004f, 13.467889f, 14.770833f, 13.9221945f);
                instancePath2.lineTo(20.077806f, 19.229166f);
                Path path3 = instancePath2;
                path3.cubicTo(20.53211f, 18.602997f, 20.8f, 17.832783f, 20.8f, 17.0f);
                path3.cubicTo(20.8f, 14.901318f, 19.098682f, 13.2f, 17.0f, 13.2f);
                instancePath2.close();
                instancePath2.moveTo(13.5f, 9.9f);
                instancePath2.lineTo(13.5f, 11.1f);
                instancePath2.lineTo(7.5f, 11.1f);
                instancePath2.lineTo(7.5f, 9.9f);
                instancePath2.lineTo(13.5f, 9.9f);
                instancePath2.close();
                instancePath2.moveTo(16.5f, 6.9f);
                instancePath2.lineTo(16.5f, 8.1f);
                instancePath2.lineTo(7.5f, 8.1f);
                instancePath2.lineTo(7.5f, 6.9f);
                instancePath2.lineTo(16.5f, 6.9f);
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
