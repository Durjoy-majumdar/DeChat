package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_like */
public class icons_filled_like extends C24542c {
    private final int height = 72;
    private final int width = 72;

    public int doCommand(int i, Object... objArr) {
        if (i == 0 || i == 1) {
            return 72;
        }
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
            instancePaint3.setColor(-16777216);
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(13.606602f, 17.334524f);
            Path path = instancePath;
            path.cubicTo(19.464466f, 11.47666f, 28.96194f, 11.47666f, 34.819805f, 17.334524f);
            path.cubicTo(35.368225f, 17.882944f, 36.075333f, 18.565023f, 36.941124f, 19.380762f);
            path.cubicTo(37.80692f, 18.565023f, 38.514027f, 17.882944f, 39.062447f, 17.334524f);
            path.cubicTo(44.92031f, 11.47666f, 54.417786f, 11.47666f, 60.27565f, 17.334524f);
            path.cubicTo(66.079025f, 23.137897f, 66.133f, 32.51349f, 60.4376f, 38.38332f);
            instancePath.lineTo(39.062447f, 59.76093f);
            Path path2 = instancePath;
            path2.cubicTo(37.890934f, 60.932564f, 35.99144f, 60.932663f, 34.819805f, 59.761154f);
            path2.cubicTo(34.819767f, 59.761116f, 34.819733f, 59.761078f, 34.819695f, 59.761044f);
            instancePath.lineTo(13.443423f, 38.38455f);
            instancePath.cubicTo(7.749244f, 32.51349f, 7.803227f, 23.137897f, 13.606602f, 17.334524f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
