package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_screen_effect_medium */
public class icons_outlined_screen_effect_medium extends C24542c {
    private final int height = 32;
    private final int width = 32;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 32;
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
        canvas.save();
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-436207616);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(10.6666f, 18.6666f);
        instancePath.cubicTo(12.5303f, 18.6666f, 14.0964f, 19.9412f, 14.5405f, 21.6663f);
        instancePath.lineTo(29.3333f, 21.6666f);
        instancePath.lineTo(29.3333f, 23.6666f);
        instancePath.lineTo(14.5402f, 23.6682f);
        Path path = instancePath;
        path.cubicTo(14.0956f, 25.3926f, 12.5299f, 26.6666f, 10.6666f, 26.6666f);
        path.cubicTo(8.80339f, 26.6666f, 7.23769f, 25.3926f, 6.79307f, 23.6682f);
        instancePath.lineTo(2.66663f, 23.6666f);
        instancePath.lineTo(2.66663f, 21.6666f);
        instancePath.lineTo(6.79273f, 21.6663f);
        Path path2 = instancePath;
        path2.cubicTo(7.23689f, 19.9412f, 8.80291f, 18.6666f, 10.6666f, 18.6666f);
        instancePath.close();
        instancePath.moveTo(10.6666f, 20.6666f);
        path2.cubicTo(9.56206f, 20.6666f, 8.66663f, 21.562f, 8.66663f, 22.6666f);
        path2.cubicTo(8.66663f, 23.7712f, 9.56206f, 24.6666f, 10.6666f, 24.6666f);
        path2.cubicTo(11.7712f, 24.6666f, 12.6666f, 23.7712f, 12.6666f, 22.6666f);
        path2.cubicTo(12.6666f, 21.562f, 11.7712f, 20.6666f, 10.6666f, 20.6666f);
        instancePath.close();
        instancePath.moveTo(21.3333f, 5.33325f);
        path2.cubicTo(23.9372f, 5.33325f, 26.1053f, 7.19932f, 26.5731f, 9.66711f);
        instancePath.lineTo(29.3333f, 9.66659f);
        instancePath.lineTo(29.3333f, 11.6666f);
        instancePath.lineTo(26.5729f, 11.6674f);
        Path path3 = instancePath;
        path3.cubicTo(26.1045f, 14.1345f, 23.9367f, 15.9999f, 21.3333f, 15.9999f);
        path3.cubicTo(18.7299f, 15.9999f, 16.5621f, 14.1345f, 16.0937f, 11.6674f);
        instancePath.lineTo(2.66663f, 11.6666f);
        instancePath.lineTo(2.66663f, 9.66659f);
        instancePath.lineTo(16.0935f, 9.66711f);
        path3.cubicTo(16.5613f, 7.19932f, 18.7294f, 5.33325f, 21.3333f, 5.33325f);
        instancePath.close();
        instancePath.moveTo(21.3333f, 7.33325f);
        path3.cubicTo(19.4923f, 7.33325f, 18.0f, 8.82564f, 18.0f, 10.6666f);
        path3.cubicTo(18.0f, 12.5075f, 19.4923f, 13.9999f, 21.3333f, 13.9999f);
        path3.cubicTo(23.1742f, 13.9999f, 24.6666f, 12.5075f, 24.6666f, 10.6666f);
        path3.cubicTo(24.6666f, 8.82564f, 23.1742f, 7.33325f, 21.3333f, 7.33325f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
