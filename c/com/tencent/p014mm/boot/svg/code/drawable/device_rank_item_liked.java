package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.device_rank_item_liked */
public class device_rank_item_liked extends C24542c {
    private final int height = 54;
    private final int width = 54;

    public int doCommand(int i, Object... objArr) {
        int i2 = 54;
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
                C24542c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-304293);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(27.0f, 10.48036f);
                Path path = instancePath;
                path.cubicTo(28.520756f, 7.5187073f, 31.927713f, 3.0f, 38.559685f, 3.0f);
                path.cubicTo(48.42443f, 3.0f, 55.286037f, 9.86097f, 53.796867f, 19.960094f);
                path.cubicTo(51.85492f, 31.37217f, 31.893957f, 47.352608f, 27.419691f, 51.072113f);
                path.cubicTo(27.187933f, 51.26478f, 26.997726f, 51.424545f, 26.853727f, 51.549076f);
                path.cubicTo(26.85368f, 51.566315f, 26.853643f, 51.58329f, 26.85362f, 51.6f);
                path.cubicTo(26.844093f, 51.591694f, 26.83434f, 51.583206f, 26.824354f, 51.574547f);
                path.cubicTo(26.819895f, 51.578423f, 26.815485f, 51.582264f, 26.811125f, 51.586067f);
                path.cubicTo(26.811113f, 51.57845f, 26.8111f, 51.570774f, 26.811085f, 51.563046f);
                path.cubicTo(23.89057f, 49.03434f, 2.2456808f, 31.963354f, 0.20313297f, 19.960094f);
                path.cubicTo(-1.2860388f, 9.86097f, 5.5755696f, 3.0f, 15.440317f, 3.0f);
                path.cubicTo(22.072287f, 3.0f, 25.479244f, 7.5187073f, 27.0f, 10.48036f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i2;
    }
}
