package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icon_filled_switch_to_voice */
public class icon_filled_switch_to_voice extends C24542c {
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
                instancePaint3.setColor(-1);
                Path instancePath2 = C24542c.instancePath(looper);
                instancePath2.moveTo(10.5f, 7.2f);
                instancePath2.lineTo(14.035534f, 10.735534f);
                instancePath2.cubicTo(14.426058f, 11.126059f, 14.426058f, 11.759223f, 14.035534f, 12.149748f);
                instancePath2.lineTo(10.5f, 15.685282f);
                instancePath2.lineTo(9.085787f, 14.271068f);
                instancePath2.lineTo(10.82321f, 12.532297f);
                instancePath2.cubicTo(7.353332f, 12.865187f, 4.623251f, 15.7312355f, 4.504059f, 19.25935f);
                instancePath2.lineTo(4.5f, 19.5f);
                instancePath2.lineTo(2.5f, 19.5f);
                instancePath2.cubicTo(2.5f, 14.701895f, 6.2546787f, 10.780743f, 10.986155f, 10.514423f);
                instancePath2.lineTo(9.085787f, 8.614214f);
                instancePath2.lineTo(10.5f, 7.2f);
                instancePath2.close();
                instancePath2.moveTo(18.536373f, 4.8759956f);
                Path path = instancePath2;
                path.cubicTo(20.201252f, 6.5872645f, 21.226625f, 8.923888f, 21.226625f, 11.5f);
                path.cubicTo(21.226625f, 14.076112f, 20.201252f, 16.412735f, 18.536373f, 18.124004f);
                instancePath2.lineTo(17.476358f, 17.062435f);
                Path path2 = instancePath2;
                path2.cubicTo(18.869394f, 15.622788f, 19.726625f, 13.661503f, 19.726625f, 11.5f);
                path2.cubicTo(19.726625f, 9.338497f, 18.869394f, 7.3772116f, 17.476358f, 5.9375653f);
                instancePath2.lineTo(18.536373f, 4.8759956f);
                instancePath2.close();
                instancePath2.moveTo(16.061394f, 7.351521f);
                path2.cubicTo(17.092913f, 8.429066f, 17.726625f, 9.890527f, 17.726625f, 11.5f);
                path2.cubicTo(17.726625f, 13.109473f, 17.092913f, 14.570934f, 16.061394f, 15.648479f);
                instancePath2.lineTo(15.000154f, 14.587736f);
                Path path3 = instancePath2;
                path3.cubicTo(15.760526f, 13.781904f, 16.226625f, 12.695384f, 16.226625f, 11.5f);
                path3.cubicTo(16.226625f, 10.304616f, 15.760526f, 9.218096f, 15.000154f, 8.412264f);
                instancePath2.lineTo(16.061394f, 7.351521f);
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
