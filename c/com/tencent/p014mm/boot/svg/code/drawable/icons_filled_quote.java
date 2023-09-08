package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_quote */
public class icons_filled_quote extends C24542c {
    private final int height = 72;
    private final int width = 72;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 72;
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
                instancePaint3.setColor(-1);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(36.0f, 6.0f);
                Path path = instancePath;
                path.cubicTo(52.568542f, 6.0f, 66.0f, 19.431458f, 66.0f, 36.0f);
                path.cubicTo(66.0f, 52.568542f, 52.568542f, 66.0f, 36.0f, 66.0f);
                path.cubicTo(19.431458f, 66.0f, 6.0f, 52.568542f, 6.0f, 36.0f);
                path.cubicTo(6.0f, 19.431458f, 19.431458f, 6.0f, 36.0f, 6.0f);
                instancePath.close();
                instancePath.moveTo(30.689013f, 24.0f);
                instancePath.cubicTo(25.153582f, 26.820965f, 22.424442f, 31.386164f, 22.50159f, 37.6956f);
                instancePath.lineTo(22.50159f, 37.6956f);
                instancePath.lineTo(22.50159f, 48.0f);
                instancePath.lineTo(32.805992f, 48.0f);
                instancePath.lineTo(32.805992f, 37.6956f);
                instancePath.lineTo(27.652996f, 37.6956f);
                Path path2 = instancePath;
                path2.cubicTo(27.652996f, 33.263943f, 29.370663f, 30.041195f, 32.805992f, 28.027359f);
                path2.cubicTo(31.394672f, 25.342453f, 30.689013f, 24.0f, 30.689013f, 24.0f);
                instancePath.close();
                instancePath.moveTo(47.36901f, 24.0f);
                instancePath.cubicTo(41.833584f, 26.820965f, 39.104443f, 31.386164f, 39.18159f, 37.6956f);
                instancePath.lineTo(39.18159f, 37.6956f);
                instancePath.lineTo(39.18159f, 48.0f);
                instancePath.lineTo(49.485992f, 48.0f);
                instancePath.lineTo(49.485992f, 37.6956f);
                instancePath.lineTo(44.332996f, 37.6956f);
                Path path3 = instancePath;
                path3.cubicTo(44.332996f, 33.263943f, 46.050663f, 30.041195f, 49.485992f, 28.027359f);
                path3.cubicTo(48.074673f, 25.342453f, 47.36901f, 24.0f, 47.36901f, 24.0f);
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
