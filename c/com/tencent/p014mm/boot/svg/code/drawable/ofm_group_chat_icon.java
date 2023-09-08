package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.ofm_group_chat_icon */
public class ofm_group_chat_icon extends C24542c {
    private final int height = 96;
    private final int width = 96;

    public int doCommand(int i, Object... objArr) {
        int i2 = 96;
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
                instancePaint3.setColor(-1);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(47.9995f, 20.0f);
                Path path = instancePath;
                path.cubicTo(30.878777f, 20.0f, 17.0f, 31.79821f, 17.0f, 46.35247f);
                path.cubicTo(17.0f, 53.18859f, 20.06195f, 59.415703f, 25.08287f, 64.098785f);
                path.cubicTo(23.80389f, 68.17186f, 21.427929f, 76.0f, 21.427929f, 76.0f);
                instancePath.lineTo(34.25072f, 69.97289f);
                Path path2 = instancePath;
                path2.cubicTo(38.394653f, 71.719925f, 43.06058f, 72.70594f, 48.0005f, 72.70594f);
                path2.cubicTo(65.12122f, 72.70594f, 79.0f, 60.90773f, 79.0f, 46.35147f);
                path2.cubicTo(78.999f, 31.79821f, 65.120224f, 20.0f, 47.9995f, 20.0f);
                instancePath.lineTo(47.9995f, 20.0f);
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
