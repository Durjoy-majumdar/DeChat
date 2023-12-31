package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.card_empty_icon */
public class card_empty_icon extends C24542c {
    private final int height = 64;
    private final int width = 64;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 64;
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
        canvas.saveLayerAlpha((RectF) null, 12, 31);
        canvas.save();
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-16777216);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(64.0f, 38.090908f);
        instancePath.lineTo(64.0f, 52.545456f);
        instancePath.cubicTo(64.0f, 54.20231f, 62.656853f, 55.545456f, 61.0f, 55.545456f);
        instancePath.lineTo(3.0f, 55.545456f);
        Path path = instancePath;
        path.cubicTo(1.3431457f, 55.545456f, 2.0290612E-16f, 54.20231f, 0.0f, 52.545456f);
        instancePath.lineTo(0.0f, 38.090908f);
        path.cubicTo(3.213293f, 38.090908f, 5.818182f, 35.48602f, 5.818182f, 32.272728f);
        path.cubicTo(5.818182f, 29.059435f, 3.213293f, 26.454546f, 4.9790656E-16f, 26.454546f);
        instancePath.lineTo(0.0f, 12.0f);
        instancePath.cubicTo(-2.0290612E-16f, 10.343145f, 1.3431457f, 9.0f, 3.0f, 9.0f);
        instancePath.lineTo(61.0f, 9.0f);
        Path path2 = instancePath;
        path2.cubicTo(62.656853f, 9.0f, 64.0f, 10.343145f, 64.0f, 12.0f);
        instancePath.lineTo(64.0f, 26.454546f);
        path2.cubicTo(60.786705f, 26.454546f, 58.18182f, 29.059435f, 58.18182f, 32.272728f);
        path2.cubicTo(58.18182f, 35.48602f, 60.786705f, 38.090908f, 64.0f, 38.090908f);
        instancePath.close();
        instancePath.moveTo(15.045454f, 20.636364f);
        path2.cubicTo(14.769312f, 20.636364f, 14.545454f, 20.860222f, 14.545454f, 21.136364f);
        instancePath.lineTo(14.545454f, 25.954546f);
        instancePath.cubicTo(14.545454f, 26.230688f, 14.769312f, 26.454546f, 15.045454f, 26.454546f);
        instancePath.lineTo(40.227272f, 26.454546f);
        instancePath.cubicTo(40.503414f, 26.454546f, 40.727272f, 26.230688f, 40.727272f, 25.954546f);
        instancePath.lineTo(40.727272f, 21.136364f);
        Path path3 = instancePath;
        path3.cubicTo(40.727272f, 20.860222f, 40.503414f, 20.636364f, 40.227272f, 20.636364f);
        instancePath.lineTo(15.045454f, 20.636364f);
        instancePath.close();
        instancePath.moveTo(15.045454f, 32.272728f);
        path3.cubicTo(14.769312f, 32.272728f, 14.545454f, 32.496586f, 14.545454f, 32.772728f);
        instancePath.lineTo(14.545454f, 37.590908f);
        Path path4 = instancePath;
        path4.cubicTo(14.545454f, 37.86705f, 14.769312f, 38.090908f, 15.045454f, 38.090908f);
        instancePath.lineTo(31.5f, 38.090908f);
        path4.cubicTo(31.776142f, 38.090908f, 32.0f, 37.86705f, 32.0f, 37.590908f);
        instancePath.lineTo(32.0f, 32.772728f);
        instancePath.cubicTo(32.0f, 32.496586f, 31.776142f, 32.272728f, 31.5f, 32.272728f);
        instancePath.lineTo(15.045454f, 32.272728f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
