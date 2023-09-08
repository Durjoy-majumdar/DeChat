package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.game_comment_reply */
public class game_comment_reply extends C24542c {
    private final int height = 14;
    private final int width = 14;

    public int doCommand(int i, Object... objArr) {
        int i2 = 14;
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
                instancePaint3.setColor(-436207616);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(5.05606f, 10.6562f);
                instancePath.lineTo(5.31261f, 10.7305f);
                Path path = instancePath;
                path.cubicTo(5.85003f, 10.8861f, 6.41801f, 10.9666f, 7.00005f, 10.9666f);
                path.cubicTo(9.85805f, 10.9666f, 12.1334f, 9.0326f, 12.1334f, 6.7083f);
                path.cubicTo(12.1334f, 4.384f, 9.85805f, 2.44997f, 7.00005f, 2.44997f);
                path.cubicTo(4.14205f, 2.44997f, 1.86672f, 4.384f, 1.86672f, 6.7083f);
                path.cubicTo(1.86672f, 7.91926f, 2.48326f, 9.05686f, 3.55873f, 9.86493f);
                instancePath.lineTo(3.87995f, 10.1063f);
                instancePath.lineTo(3.74283f, 11.2859f);
                instancePath.lineTo(5.05606f, 10.6562f);
                instancePath.close();
                instancePath.moveTo(7.00008f, 11.6667f);
                instancePath.cubicTo(6.34151f, 11.6667f, 5.70842f, 11.5739f, 5.11793f, 11.4029f);
                instancePath.lineTo(3.37787f, 12.2373f);
                Path path2 = instancePath;
                path2.cubicTo(3.3282f, 12.2611f, 3.2728f, 12.2704f, 3.21809f, 12.264f);
                path2.cubicTo(3.05808f, 12.2454f, 2.94345f, 12.1006f, 2.96205f, 11.9406f);
                instancePath.lineTo(3.13827f, 10.4246f);
                Path path3 = instancePath;
                path3.cubicTo(1.92916f, 9.51611f, 1.16675f, 8.1879f, 1.16675f, 6.70833f);
                path3.cubicTo(1.16675f, 3.96992f, 3.77842f, 1.75f, 7.00008f, 1.75f);
                path3.cubicTo(10.2217f, 1.75f, 12.8334f, 3.96992f, 12.8334f, 6.70833f);
                path3.cubicTo(12.8334f, 9.44674f, 10.2217f, 11.6667f, 7.00008f, 11.6667f);
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
