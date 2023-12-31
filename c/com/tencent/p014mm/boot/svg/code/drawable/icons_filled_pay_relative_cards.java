package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_pay_relative_cards */
public class icons_filled_pay_relative_cards extends C24542c {
    private final int height = 72;
    private final int width = 72;

    public int doCommand(int i, Object... objArr) {
        if (i == 0 || i == 1) {
            return 72;
        }
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
            canvas.save();
            Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-16777216);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(53.096363f, 32.803917f);
            Path path = instancePath;
            path.cubicTo(58.012337f, 25.20893f, 59.48035f, 18.177958f, 56.649788f, 15.349924f);
            path.cubicTo(54.3887f, 13.090858f, 49.041027f, 13.5148f, 42.480625f, 16.961065f);
            path.cubicTo(41.271843f, 17.596054f, 39.776714f, 17.13178f, 39.14116f, 15.924081f);
            path.cubicTo(38.505604f, 14.716382f, 38.97029f, 13.22259f, 40.179073f, 12.587603f);
            path.cubicTo(48.437847f, 8.24916f, 55.94137f, 7.654311f, 60.146828f, 11.856011f);
            path.cubicTo(65.183075f, 16.887756f, 63.259426f, 26.653042f, 56.67425f, 36.37861f);
            instancePath.lineTo(62.075096f, 41.774624f);
            instancePath.cubicTo(63.201725f, 42.900246f, 63.201725f, 44.725235f, 62.075096f, 45.850857f);
            instancePath.lineTo(45.75558f, 62.155785f);
            instancePath.cubicTo(44.628952f, 63.281406f, 42.802326f, 63.281406f, 41.6757f, 62.155785f);
            instancePath.lineTo(35.21662f, 55.70248f);
            Path path2 = instancePath;
            path2.cubicTo(27.329355f, 59.686134f, 19.990091f, 60.247643f, 15.850992f, 56.112244f);
            path2.cubicTo(12.938026f, 53.20188f, 12.32466f, 48.666996f, 13.705114f, 43.373802f);
            path2.cubicTo(14.049464f, 42.053432f, 15.399945f, 41.26196f, 16.721498f, 41.606003f);
            path2.cubicTo(18.04305f, 41.950047f, 18.83523f, 43.29932f, 18.490881f, 44.61969f);
            path2.cubicTo(17.509222f, 48.383747f, 17.884151f, 51.155758f, 19.348032f, 52.618332f);
            path2.cubicTo(21.500717f, 54.769093f, 26.086487f, 54.435852f, 31.503258f, 51.99244f);
            instancePath.lineTo(9.844971f, 30.353514f);
            instancePath.cubicTo(8.718343f, 29.227894f, 8.718343f, 27.402903f, 9.844971f, 26.277283f);
            instancePath.lineTo(26.164488f, 9.972354f);
            instancePath.cubicTo(27.291117f, 8.846734f, 29.11774f, 8.846734f, 30.244368f, 9.972354f);
            instancePath.lineTo(53.096363f, 32.803917f);
            instancePath.lineTo(53.096363f, 32.803917f);
            instancePath.close();
            instancePath.moveTo(50.168877f, 36.866875f);
            instancePath.lineTo(28.204428f, 14.922064f);
            instancePath.lineTo(14.79911f, 28.315397f);
            instancePath.lineTo(36.053898f, 49.551186f);
            Path path3 = instancePath;
            path3.cubicTo(39.2676f, 47.562f, 42.605427f, 44.945114f, 45.787563f, 41.76582f);
            path3.cubicTo(47.39432f, 40.1605f, 48.857563f, 38.515522f, 50.168877f, 36.866875f);
            instancePath.lineTo(50.168877f, 36.866875f);
            instancePath.close();
            instancePath.moveTo(53.691128f, 40.385975f);
            path3.cubicTo(52.346615f, 42.03922f, 50.87389f, 43.671867f, 49.284603f, 45.25973f);
            path3.cubicTo(46.182503f, 48.359062f, 42.90961f, 51.01471f, 39.646034f, 53.14011f);
            instancePath.lineTo(43.71564f, 57.206074f);
            instancePath.lineTo(57.120956f, 43.81274f);
            instancePath.lineTo(53.691128f, 40.385975f);
            instancePath.lineTo(53.691128f, 40.385975f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
