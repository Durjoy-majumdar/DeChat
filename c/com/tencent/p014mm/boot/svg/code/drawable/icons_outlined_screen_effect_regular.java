package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_screen_effect_regular */
public class icons_outlined_screen_effect_regular extends C24542c {
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
        instancePath.cubicTo(12.6013f, 18.6666f, 14.2151f, 20.0401f, 14.5863f, 21.8651f);
        instancePath.lineTo(29.3333f, 21.8666f);
        instancePath.lineTo(29.3333f, 23.4666f);
        instancePath.lineTo(14.5866f, 23.4667f);
        Path path = instancePath;
        path.cubicTo(14.2159f, 25.2924f, 12.6017f, 26.6666f, 10.6666f, 26.6666f);
        path.cubicTo(8.7315f, 26.6666f, 7.11733f, 25.2924f, 6.74667f, 23.4667f);
        instancePath.lineTo(2.66663f, 23.4666f);
        instancePath.lineTo(2.66663f, 21.8666f);
        instancePath.lineTo(6.74694f, 21.8651f);
        Path path2 = instancePath;
        path2.cubicTo(7.11812f, 20.0401f, 8.73198f, 18.6666f, 10.6666f, 18.6666f);
        instancePath.close();
        instancePath.moveTo(10.6666f, 20.2666f);
        path2.cubicTo(9.34114f, 20.2666f, 8.26663f, 21.3411f, 8.26663f, 22.6666f);
        path2.cubicTo(8.26663f, 23.9921f, 9.34114f, 25.0666f, 10.6666f, 25.0666f);
        path2.cubicTo(11.9921f, 25.0666f, 13.0666f, 23.9921f, 13.0666f, 22.6666f);
        path2.cubicTo(13.0666f, 21.3411f, 11.9921f, 20.2666f, 10.6666f, 20.2666f);
        instancePath.close();
        instancePath.moveTo(21.3333f, 5.33325f);
        path2.cubicTo(24.0068f, 5.33325f, 26.2209f, 7.30046f, 26.607f, 9.86635f);
        instancePath.lineTo(29.3333f, 9.86659f);
        instancePath.lineTo(29.3333f, 11.4666f);
        instancePath.lineTo(26.6072f, 11.4655f);
        Path path3 = instancePath;
        path3.cubicTo(26.2217f, 14.032f, 24.0073f, 15.9999f, 21.3333f, 15.9999f);
        path3.cubicTo(18.6593f, 15.9999f, 16.4449f, 14.032f, 16.0594f, 11.4655f);
        instancePath.lineTo(2.66663f, 11.4666f);
        instancePath.lineTo(2.66663f, 9.86659f);
        instancePath.lineTo(16.0596f, 9.86635f);
        path3.cubicTo(16.4457f, 7.30046f, 18.6598f, 5.33325f, 21.3333f, 5.33325f);
        instancePath.close();
        instancePath.moveTo(21.3333f, 6.93325f);
        path3.cubicTo(19.2714f, 6.93325f, 17.6f, 8.60472f, 17.6f, 10.6666f);
        path3.cubicTo(17.6f, 12.7284f, 19.2714f, 14.3999f, 21.3333f, 14.3999f);
        path3.cubicTo(23.3952f, 14.3999f, 25.0666f, 12.7284f, 25.0666f, 10.6666f);
        path3.cubicTo(25.0666f, 8.60472f, 23.3952f, 6.93325f, 21.3333f, 6.93325f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
