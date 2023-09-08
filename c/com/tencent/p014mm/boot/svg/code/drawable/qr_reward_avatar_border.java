package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.C82086j;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.qr_reward_avatar_border */
public class qr_reward_avatar_border extends C24542c {
    private final int height = C82086j.CTRL_INDEX;
    private final int width = C82086j.CTRL_INDEX;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = C82086j.CTRL_INDEX;
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
                canvas.save();
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-3833595);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(274.5553f, 275.0f);
                Path path = instancePath;
                path.cubicTo(245.1193f, 272.369f, 198.0823f, 270.665f, 145.0633f, 270.665f);
                path.cubicTo(92.0443f, 270.665f, 45.0103f, 272.369f, 15.5753f, 275.0f);
                instancePath.lineTo(15.0003f, 275.0f);
                path.cubicTo(17.6523f, 245.596f, 19.3733f, 198.364f, 19.3733f, 145.1f);
                path.cubicTo(19.3733f, 91.835f, 17.6523f, 44.606f, 15.0003f, 15.202f);
                instancePath.lineTo(15.0003f, 15.0f);
                Path path2 = instancePath;
                path2.cubicTo(44.3963f, 17.66f, 91.7033f, 19.386f, 145.0633f, 19.386f);
                path2.cubicTo(198.3403f, 19.386f, 245.5833f, 17.665f, 274.9893f, 15.013f);
                path2.cubicTo(272.3353f, 44.414f, 270.6143f, 91.664f, 270.6143f, 144.951f);
                path2.cubicTo(270.6143f, 198.306f, 272.3403f, 245.607f, 275.0003f, 275.0f);
                instancePath.lineTo(274.5553f, 275.0f);
                instancePath.close();
                instancePath.moveTo(285.1083f, 144.945f);
                path2.cubicTo(285.1083f, 85.51f, 287.0283f, 32.808f, 289.9883f, 0.014f);
                path2.cubicTo(257.1893f, 2.973f, 204.4943f, 4.892f, 145.0703f, 4.892f);
                path2.cubicTo(85.5533f, 4.892f, 32.7883f, 2.966f, 3.0E-4f, 0.0f);
                instancePath.lineTo(3.0E-4f, 0.225f);
                Path path3 = instancePath;
                path3.cubicTo(2.9583f, 33.022f, 4.8773f, 85.7f, 4.8773f, 145.112f);
                path3.cubicTo(4.8773f, 204.522f, 2.9583f, 257.203f, 3.0E-4f, 290.0f);
                instancePath.lineTo(0.6413f, 290.0f);
                Path path4 = instancePath;
                path4.cubicTo(33.4733f, 287.066f, 85.9343f, 285.165f, 145.0703f, 285.165f);
                path4.cubicTo(204.2073f, 285.165f, 256.6723f, 287.066f, 289.5043f, 290.0f);
                instancePath.lineTo(290.0003f, 290.0f);
                instancePath.cubicTo(287.0333f, 257.215f, 285.1083f, 204.456f, 285.1083f, 144.945f);
                instancePath.lineTo(285.1083f, 144.945f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i3;
    }
}
