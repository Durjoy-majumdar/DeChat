package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.finder_subtitle_off */
public class finder_subtitle_off extends C24542c {
    private final int height = 24;
    private final int width = 24;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 24;
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
        instancePath.moveTo(19.718f, 3.40002f);
        instancePath.lineTo(3.28184f, 3.40002f);
        Path path = instancePath;
        path.cubicTo(2.78486f, 3.40002f, 2.51253f, 3.45261f, 2.22852f, 3.6045f);
        path.cubicTo(1.961f, 3.74758f, 1.74745f, 3.96112f, 1.60438f, 4.22864f);
        path.cubicTo(1.45249f, 4.51265f, 1.3999f, 4.78498f, 1.3999f, 5.28197f);
        instancePath.lineTo(1.3999f, 17.7181f);
        Path path2 = instancePath;
        path2.cubicTo(1.3999f, 18.2151f, 1.45249f, 18.4874f, 1.60438f, 18.7714f);
        path2.cubicTo(1.74745f, 19.0389f, 1.961f, 19.2525f, 2.22852f, 19.3955f);
        path2.cubicTo(2.51253f, 19.5474f, 2.78486f, 19.6f, 3.28184f, 19.6f);
        instancePath.lineTo(12.787f, 19.6f);
        instancePath.cubicTo(12.5373f, 19.2253f, 12.3255f, 18.8232f, 12.157f, 18.3992f);
        instancePath.lineTo(3.17377f, 18.3992f);
        instancePath.lineTo(3.01161f, 18.3924f);
        Path path3 = instancePath;
        path3.cubicTo(2.90196f, 18.3835f, 2.84844f, 18.3662f, 2.79444f, 18.3374f);
        path3.cubicTo(2.73604f, 18.3061f, 2.69379f, 18.2639f, 2.66256f, 18.2055f);
        instancePath.lineTo(2.63327f, 18.1373f);
        instancePath.cubicTo(2.62523f, 18.1122f, 2.61885f, 18.0836f, 2.6139f, 18.0478f);
        instancePath.lineTo(2.60319f, 17.9153f);
        instancePath.lineTo(2.5999f, 17.7181f);
        instancePath.lineTo(2.5999f, 5.28197f);
        instancePath.cubicTo(2.5999f, 5.20301f, 2.60093f, 5.13847f, 2.60319f, 5.08472f);
        instancePath.lineTo(2.6139f, 4.95223f);
        instancePath.cubicTo(2.61885f, 4.91644f, 2.62523f, 4.88782f, 2.63327f, 4.86275f);
        instancePath.lineTo(2.66256f, 4.79456f);
        Path path4 = instancePath;
        path4.cubicTo(2.69379f, 4.73616f, 2.73604f, 4.69391f, 2.79444f, 4.66268f);
        path4.cubicTo(2.82684f, 4.64535f, 2.85906f, 4.63221f, 2.90335f, 4.62255f);
        instancePath.lineTo(3.01161f, 4.60767f);
        instancePath.lineTo(3.17377f, 4.60082f);
        instancePath.lineTo(19.826f, 4.60082f);
        instancePath.lineTo(19.9882f, 4.60767f);
        instancePath.lineTo(20.0965f, 4.62255f);
        Path path5 = instancePath;
        path5.cubicTo(20.1407f, 4.63221f, 20.173f, 4.64535f, 20.2054f, 4.66268f);
        path5.cubicTo(20.2638f, 4.69391f, 20.306f, 4.73616f, 20.3372f, 4.79456f);
        instancePath.lineTo(20.3665f, 4.86275f);
        instancePath.lineTo(20.3859f, 4.95223f);
        instancePath.lineTo(20.3966f, 5.08472f);
        instancePath.lineTo(20.3999f, 5.28197f);
        instancePath.lineTo(20.3999f, 9.88177f);
        Path path6 = instancePath;
        path6.cubicTo(20.8218f, 10.0335f, 21.2236f, 10.2277f, 21.5999f, 10.4591f);
        instancePath.lineTo(21.5999f, 5.28197f);
        path6.cubicTo(21.5999f, 4.78498f, 21.5473f, 4.51265f, 21.3954f, 4.22864f);
        path6.cubicTo(21.2524f, 3.96112f, 21.0388f, 3.74758f, 20.7713f, 3.6045f);
        path6.cubicTo(20.4873f, 3.45261f, 20.2149f, 3.40002f, 19.718f, 3.40002f);
        instancePath.close();
        instancePath.moveTo(11.6999f, 16.0f);
        path6.cubicTo(11.6999f, 15.6166f, 11.7331f, 15.241f, 11.7968f, 14.8758f);
        instancePath.lineTo(4.99648f, 14.8758f);
        instancePath.lineTo(4.99648f, 16.0758f);
        instancePath.lineTo(11.7003f, 16.0758f);
        Path path7 = instancePath;
        path7.cubicTo(11.7f, 16.0506f, 11.6999f, 16.0253f, 11.6999f, 16.0f);
        instancePath.close();
        instancePath.moveTo(23.2f, 16.0f);
        path7.cubicTo(23.2f, 13.2386f, 20.9614f, 11.0f, 18.2f, 11.0f);
        path7.cubicTo(15.4385f, 11.0f, 13.2f, 13.2386f, 13.2f, 16.0f);
        path7.cubicTo(13.2f, 18.7614f, 15.4385f, 21.0f, 18.2f, 21.0f);
        path7.cubicTo(20.9614f, 21.0f, 23.2f, 18.7614f, 23.2f, 16.0f);
        instancePath.close();
        instancePath.moveTo(14.4f, 16.0f);
        path7.cubicTo(14.4f, 15.1672f, 14.6679f, 14.397f, 15.1222f, 13.7708f);
        instancePath.lineTo(20.4292f, 19.0778f);
        Path path8 = instancePath;
        path8.cubicTo(19.803f, 19.5321f, 19.0328f, 19.8f, 18.2f, 19.8f);
        path8.cubicTo(16.1013f, 19.8f, 14.4f, 18.0987f, 14.4f, 16.0f);
        instancePath.close();
        instancePath.moveTo(21.2777f, 18.2292f);
        instancePath.lineTo(15.9707f, 12.9222f);
        Path path9 = instancePath;
        path9.cubicTo(16.5969f, 12.4679f, 17.3671f, 12.2f, 18.2f, 12.2f);
        path9.cubicTo(20.2986f, 12.2f, 22.0f, 13.9013f, 22.0f, 16.0f);
        path9.cubicTo(22.0f, 16.8328f, 21.732f, 17.603f, 21.2777f, 18.2292f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
