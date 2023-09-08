package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.finder_live_shopping_order */
public class finder_live_shopping_order extends C24542c {
    private final int height = 72;
    private final int width = 72;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 72;
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
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(46.19922f, 4.800781f);
        instancePath.cubicTo(47.195312f, 4.800781f, 48.0f, 5.605469f, 48.0f, 6.601562f);
        instancePath.lineTo(47.996094f, 9.296875f);
        instancePath.lineTo(55.5f, 9.300781f);
        instancePath.cubicTo(57.984375f, 9.300781f, 60.0f, 11.316406f, 60.0f, 13.800781f);
        instancePath.lineTo(60.0f, 60.30078f);
        instancePath.cubicTo(60.0f, 62.785156f, 57.984375f, 64.80078f, 55.5f, 64.80078f);
        instancePath.lineTo(16.5f, 64.80078f);
        instancePath.cubicTo(14.015625f, 64.80078f, 12.0f, 62.785156f, 12.0f, 60.30078f);
        instancePath.lineTo(12.0f, 13.800781f);
        instancePath.cubicTo(12.0f, 11.316406f, 14.015625f, 9.300781f, 16.5f, 9.300781f);
        instancePath.lineTo(23.996094f, 9.296875f);
        instancePath.lineTo(24.0f, 6.601562f);
        Path path = instancePath;
        path.cubicTo(24.0f, 5.605469f, 24.804688f, 4.800781f, 25.800781f, 4.800781f);
        path.cubicTo(26.792969f, 4.800781f, 27.601562f, 5.605469f, 27.601562f, 6.601562f);
        instancePath.lineTo(27.597656f, 9.296875f);
        instancePath.lineTo(44.398438f, 9.296875f);
        instancePath.lineTo(44.398438f, 6.601562f);
        path.cubicTo(44.398438f, 5.605469f, 45.20703f, 4.800781f, 46.19922f, 4.800781f);
        instancePath.close();
        instancePath.moveTo(44.398438f, 12.898438f);
        instancePath.lineTo(27.597656f, 12.898438f);
        instancePath.lineTo(27.601562f, 16.5f);
        Path path2 = instancePath;
        path2.cubicTo(27.601562f, 17.492188f, 26.792969f, 18.300781f, 25.800781f, 18.300781f);
        path2.cubicTo(24.804688f, 18.300781f, 24.0f, 17.492188f, 24.0f, 16.5f);
        instancePath.lineTo(23.996094f, 12.898438f);
        instancePath.lineTo(16.5f, 12.898438f);
        path2.cubicTo(16.003906f, 12.898438f, 15.601562f, 13.304688f, 15.601562f, 13.800781f);
        instancePath.lineTo(15.601562f, 60.30078f);
        instancePath.cubicTo(15.601562f, 60.796875f, 16.003906f, 61.19922f, 16.5f, 61.19922f);
        instancePath.lineTo(55.5f, 61.19922f);
        instancePath.cubicTo(55.996094f, 61.19922f, 56.398438f, 60.796875f, 56.398438f, 60.30078f);
        instancePath.lineTo(56.398438f, 13.800781f);
        instancePath.cubicTo(56.398438f, 13.304688f, 55.996094f, 12.898438f, 55.5f, 12.898438f);
        instancePath.lineTo(47.996094f, 12.898438f);
        instancePath.lineTo(48.0f, 16.5f);
        Path path3 = instancePath;
        path3.cubicTo(48.0f, 17.492188f, 47.195312f, 18.300781f, 46.19922f, 18.300781f);
        path3.cubicTo(45.20703f, 18.300781f, 44.398438f, 17.492188f, 44.398438f, 16.5f);
        instancePath.close();
        instancePath.moveTo(49.19922f, 40.80078f);
        path3.cubicTo(50.195312f, 40.80078f, 51.0f, 41.60547f, 51.0f, 42.601562f);
        path3.cubicTo(51.0f, 43.59375f, 50.195312f, 44.398438f, 49.19922f, 44.398438f);
        instancePath.lineTo(22.800781f, 44.398438f);
        path3.cubicTo(21.804688f, 44.398438f, 21.0f, 43.59375f, 21.0f, 42.601562f);
        path3.cubicTo(21.0f, 41.60547f, 21.804688f, 40.80078f, 22.800781f, 40.80078f);
        instancePath.close();
        instancePath.moveTo(49.19922f, 30.300781f);
        path3.cubicTo(50.195312f, 30.300781f, 51.0f, 31.105469f, 51.0f, 32.101562f);
        path3.cubicTo(51.0f, 33.09375f, 50.195312f, 33.898438f, 49.19922f, 33.898438f);
        instancePath.lineTo(22.800781f, 33.898438f);
        Path path4 = instancePath;
        path4.cubicTo(21.804688f, 33.898438f, 21.0f, 33.09375f, 21.0f, 32.101562f);
        path4.cubicTo(21.0f, 31.105469f, 21.804688f, 30.300781f, 22.800781f, 30.300781f);
        instancePath.close();
        instancePath.moveTo(49.19922f, 30.300781f);
        WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
