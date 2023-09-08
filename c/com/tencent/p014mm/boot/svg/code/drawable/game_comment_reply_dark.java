package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.game_comment_reply_dark */
public class game_comment_reply_dark extends C24542c {
    private final int height = 12;
    private final int width = 12;

    public int doCommand(int i, Object... objArr) {
        int i2 = 12;
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
                canvas.save();
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-419430401);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(4.05606f, 9.65621f);
                instancePath.lineTo(4.31261f, 9.7305f);
                Path path = instancePath;
                path.cubicTo(4.85003f, 9.88613f, 5.41801f, 9.96664f, 6.00005f, 9.96664f);
                path.cubicTo(8.85805f, 9.96664f, 11.1334f, 8.0326f, 11.1334f, 5.7083f);
                path.cubicTo(11.1334f, 3.384f, 8.85805f, 1.44997f, 6.00005f, 1.44997f);
                path.cubicTo(3.14205f, 1.44997f, 0.866717f, 3.384f, 0.866717f, 5.7083f);
                path.cubicTo(0.866717f, 6.91926f, 1.48326f, 8.05686f, 2.55873f, 8.86493f);
                instancePath.lineTo(2.87995f, 9.10629f);
                instancePath.lineTo(2.74283f, 10.2859f);
                instancePath.lineTo(4.05606f, 9.65621f);
                instancePath.close();
                instancePath.moveTo(6.00008f, 10.6667f);
                instancePath.cubicTo(5.34151f, 10.6667f, 4.70842f, 10.5739f, 4.11793f, 10.4029f);
                instancePath.lineTo(2.37787f, 11.2373f);
                Path path2 = instancePath;
                path2.cubicTo(2.3282f, 11.2611f, 2.2728f, 11.2704f, 2.21809f, 11.264f);
                path2.cubicTo(2.05808f, 11.2454f, 1.94345f, 11.1006f, 1.96205f, 10.9406f);
                instancePath.lineTo(2.13827f, 9.42459f);
                Path path3 = instancePath;
                path3.cubicTo(0.929164f, 8.51611f, 0.166748f, 7.1879f, 0.166748f, 5.70833f);
                path3.cubicTo(0.166748f, 2.96992f, 2.77842f, 0.75f, 6.00008f, 0.75f);
                path3.cubicTo(9.22174f, 0.75f, 11.8334f, 2.96992f, 11.8334f, 5.70833f);
                path3.cubicTo(11.8334f, 8.44674f, 9.22174f, 10.6667f, 6.00008f, 10.6667f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i2;
    }
}
