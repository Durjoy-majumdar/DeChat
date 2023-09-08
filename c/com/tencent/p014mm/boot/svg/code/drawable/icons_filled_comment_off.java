package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_comment_off */
public class icons_filled_comment_off extends C24542c {
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
                instancePath2.moveTo(20.5f, 4.0f);
                path.cubicTo(21.328426f, 4.0f, 22.0f, 4.6715727f, 22.0f, 5.5f);
                instancePath2.lineTo(22.001322f, 12.848017f);
                Path path2 = instancePath2;
                path2.cubicTo(20.809025f, 11.413408f, 19.01118f, 10.5f, 17.0f, 10.5f);
                path2.cubicTo(13.41015f, 10.5f, 10.5f, 13.41015f, 10.5f, 17.0f);
                path2.cubicTo(10.5f, 17.749784f, 10.62695f, 18.469917f, 10.860529f, 19.140076f);
                instancePath2.lineTo(8.707107f, 21.292892f);
                Path path3 = instancePath2;
                path3.cubicTo(8.316583f, 21.683418f, 7.6834173f, 21.683418f, 7.2928934f, 21.292892f);
                path3.cubicTo(7.1053567f, 21.105356f, 7.0f, 20.851004f, 7.0f, 20.585787f);
                instancePath2.lineTo(7.0f, 19.0f);
                instancePath2.lineTo(3.5f, 19.0f);
                instancePath2.cubicTo(2.671573f, 19.0f, 2.0f, 18.328426f, 2.0f, 17.5f);
                instancePath2.lineTo(2.0f, 5.5f);
                Path path4 = instancePath2;
                path4.cubicTo(2.0f, 4.6715727f, 2.671573f, 4.0f, 3.5f, 4.0f);
                instancePath2.lineTo(20.5f, 4.0f);
                instancePath2.close();
                instancePath2.moveTo(14.051692f, 15.113071f);
                path4.cubicTo(13.702494f, 15.657558f, 13.5f, 16.305132f, 13.5f, 17.0f);
                path4.cubicTo(13.5f, 18.932997f, 15.067003f, 20.5f, 17.0f, 20.5f);
                path4.cubicTo(17.694868f, 20.5f, 18.342442f, 20.297506f, 18.886929f, 19.948309f);
                instancePath2.lineTo(14.051692f, 15.113071f);
                instancePath2.close();
                instancePath2.moveTo(17.0f, 13.5f);
                path4.cubicTo(16.305132f, 13.5f, 15.657558f, 13.702494f, 15.113071f, 14.051692f);
                instancePath2.lineTo(19.948309f, 18.886929f);
                path4.cubicTo(20.297506f, 18.342442f, 20.5f, 17.694868f, 20.5f, 17.0f);
                path4.cubicTo(20.5f, 15.067003f, 18.932997f, 13.5f, 17.0f, 13.5f);
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
