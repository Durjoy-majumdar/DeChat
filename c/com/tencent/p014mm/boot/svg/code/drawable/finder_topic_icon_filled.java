package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.finder_topic_icon_filled */
public class finder_topic_icon_filled extends C24542c {
    private final int height = 24;
    private final int width = 24;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 24;
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
        C24542c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
        canvas.saveLayerAlpha((RectF) null, 230, 31);
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-16777216);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(9.104428f, 2.0731251f);
        instancePath.lineTo(10.529613f, 2.074452f);
        instancePath.lineTo(9.848f, 7.916f);
        instancePath.lineTo(15.096f, 7.916f);
        instancePath.lineTo(15.784979f, 2.0793445f);
        instancePath.lineTo(17.210163f, 2.0806713f);
        instancePath.lineTo(16.529f, 7.916f);
        instancePath.lineTo(21.5f, 7.9162297f);
        instancePath.lineTo(21.5f, 9.352281f);
        instancePath.lineTo(16.362f, 9.352f);
        instancePath.lineTo(15.744f, 14.647f);
        instancePath.lineTo(21.5f, 14.647719f);
        instancePath.lineTo(21.5f, 16.08377f);
        instancePath.lineTo(15.577f, 16.083f);
        instancePath.lineTo(14.895572f, 21.926874f);
        instancePath.lineTo(13.445195f, 21.925524f);
        instancePath.lineTo(14.134f, 16.083f);
        instancePath.lineTo(8.896f, 16.083f);
        instancePath.lineTo(8.215021f, 21.920656f);
        instancePath.lineTo(6.7898374f, 21.919329f);
        instancePath.lineTo(7.47f, 16.083f);
        instancePath.lineTo(2.5f, 16.08377f);
        instancePath.lineTo(2.5f, 14.647719f);
        instancePath.lineTo(7.637f, 14.647f);
        instancePath.lineTo(8.255f, 9.352f);
        instancePath.lineTo(2.5f, 9.352281f);
        instancePath.lineTo(2.5f, 7.9162297f);
        instancePath.lineTo(8.422f, 7.916f);
        instancePath.lineTo(9.104428f, 2.0731251f);
        instancePath.close();
        instancePath.moveTo(14.927f, 9.352f);
        instancePath.lineTo(9.68f, 9.352f);
        instancePath.lineTo(9.063f, 14.647f);
        instancePath.lineTo(14.303f, 14.647f);
        instancePath.lineTo(14.927f, 9.352f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
