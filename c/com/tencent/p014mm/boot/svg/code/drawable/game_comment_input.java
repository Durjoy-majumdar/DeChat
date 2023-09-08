package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.game_comment_input */
public class game_comment_input extends C24542c {
    private final int height = 32;
    private final int width = 32;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 32;
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
                canvas.save();
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-436207616);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(16.0f, 29.3333f);
                Path path = instancePath;
                path.cubicTo(8.63619f, 29.3333f, 2.66666f, 23.3638f, 2.66666f, 16.0f);
                path.cubicTo(2.66666f, 8.6362f, 8.63619f, 2.66666f, 16.0f, 2.66666f);
                path.cubicTo(23.3638f, 2.66666f, 29.3333f, 8.6362f, 29.3333f, 16.0f);
                path.cubicTo(29.3333f, 23.3638f, 23.3638f, 29.3333f, 16.0f, 29.3333f);
                instancePath.close();
                instancePath.moveTo(16.0f, 27.7333f);
                Path path2 = instancePath;
                path2.cubicTo(22.4801f, 27.7333f, 27.7333f, 22.4801f, 27.7333f, 16.0f);
                path2.cubicTo(27.7333f, 9.51986f, 22.4801f, 4.26666f, 16.0f, 4.26666f);
                path2.cubicTo(9.51985f, 4.26666f, 4.26666f, 9.51986f, 4.26666f, 16.0f);
                path2.cubicTo(4.26666f, 22.4801f, 9.51985f, 27.7333f, 16.0f, 27.7333f);
                instancePath.close();
                instancePath.moveTo(11.3333f, 10.6667f);
                instancePath.lineTo(8.66666f, 10.6667f);
                instancePath.lineTo(8.66666f, 13.3333f);
                instancePath.lineTo(11.3333f, 13.3333f);
                instancePath.lineTo(11.3333f, 10.6667f);
                instancePath.close();
                instancePath.moveTo(12.6667f, 10.6667f);
                instancePath.lineTo(15.3333f, 10.6667f);
                instancePath.lineTo(15.3333f, 13.3333f);
                instancePath.lineTo(12.6667f, 13.3333f);
                instancePath.lineTo(12.6667f, 10.6667f);
                instancePath.close();
                instancePath.moveTo(19.3333f, 10.6667f);
                instancePath.lineTo(16.6667f, 10.6667f);
                instancePath.lineTo(16.6667f, 13.3333f);
                instancePath.lineTo(19.3333f, 13.3333f);
                instancePath.lineTo(19.3333f, 10.6667f);
                instancePath.close();
                instancePath.moveTo(20.6667f, 10.6667f);
                instancePath.lineTo(23.3333f, 10.6667f);
                instancePath.lineTo(23.3333f, 13.3333f);
                instancePath.lineTo(20.6667f, 13.3333f);
                instancePath.lineTo(20.6667f, 10.6667f);
                instancePath.close();
                instancePath.moveTo(11.3333f, 14.6667f);
                instancePath.lineTo(8.66666f, 14.6667f);
                instancePath.lineTo(8.66666f, 17.3333f);
                instancePath.lineTo(11.3333f, 17.3333f);
                instancePath.lineTo(11.3333f, 14.6667f);
                instancePath.close();
                instancePath.moveTo(12.6667f, 14.6667f);
                instancePath.lineTo(15.3333f, 14.6667f);
                instancePath.lineTo(15.3333f, 17.3333f);
                instancePath.lineTo(12.6667f, 17.3333f);
                instancePath.lineTo(12.6667f, 14.6667f);
                instancePath.close();
                instancePath.moveTo(20.0f, 22.6667f);
                instancePath.lineTo(20.0f, 20.0f);
                instancePath.lineTo(12.0f, 20.0f);
                instancePath.lineTo(12.0f, 22.6667f);
                instancePath.lineTo(20.0f, 22.6667f);
                instancePath.close();
                instancePath.moveTo(16.6667f, 14.6667f);
                instancePath.lineTo(19.3333f, 14.6667f);
                instancePath.lineTo(19.3333f, 17.3333f);
                instancePath.lineTo(16.6667f, 17.3333f);
                instancePath.lineTo(16.6667f, 14.6667f);
                instancePath.close();
                instancePath.moveTo(23.3333f, 14.6667f);
                instancePath.lineTo(20.6667f, 14.6667f);
                instancePath.lineTo(20.6667f, 17.3333f);
                instancePath.lineTo(23.3333f, 17.3333f);
                instancePath.lineTo(23.3333f, 14.6667f);
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
