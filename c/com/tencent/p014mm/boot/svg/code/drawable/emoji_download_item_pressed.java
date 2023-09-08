package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.emoji_download_item_pressed */
public class emoji_download_item_pressed extends C24542c {
    private final int height = 60;
    private final int width = 60;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 60;
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
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-16216826);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(27.52f, 0.0f);
        instancePath.lineTo(32.07f, 0.0f);
        instancePath.cubicTo(46.45f, 0.9f, 58.83f, 13.19f, 60.0f, 27.52f);
        instancePath.lineTo(60.0f, 32.08f);
        Path path = instancePath;
        path.cubicTo(59.09f, 46.46f, 46.8f, 58.83f, 32.48f, 60.0f);
        instancePath.lineTo(27.93f, 60.0f);
        path.cubicTo(13.55f, 59.1f, 1.17f, 46.81f, 0.0f, 32.48f);
        instancePath.lineTo(0.0f, 27.93f);
        path.cubicTo(0.9f, 13.55f, 13.2f, 1.17f, 27.52f, 0.0f);
        instancePath.lineTo(27.52f, 0.0f);
        instancePath.lineTo(27.52f, 0.0f);
        instancePath.close();
        instancePath.moveTo(24.383501f, 3.6703784f);
        path.cubicTo(11.597891f, 6.255954f, 1.8089068f, 19.054052f, 3.117434f, 32.111706f);
        path.cubicTo(3.9265237f, 46.387276f, 17.730988f, 58.336826f, 32.024902f, 56.879322f);
        path.cubicTo(46.738342f, 56.09067f, 58.884674f, 41.515614f, 56.75707f, 26.890642f);
        path.cubicTo(55.318687f, 11.726592f, 39.286728f, 0.026614152f, 24.383501f, 3.6703784f);
        instancePath.lineTo(24.383501f, 3.6703784f);
        instancePath.lineTo(24.383501f, 3.6703784f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(25.0f, 15.0f);
        instancePath2.lineTo(36.0f, 15.0f);
        instancePath2.lineTo(36.0f, 31.0f);
        instancePath2.lineTo(25.0f, 31.0f);
        instancePath2.lineTo(25.0f, 15.0f);
        instancePath2.close();
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.save();
        Paint instancePaint6 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath3 = C24542c.instancePath(looper);
        instancePath3.moveTo(14.176433f, 30.047743f);
        instancePath3.lineTo(30.5319f, 46.112846f);
        instancePath3.lineTo(46.914062f, 30.035374f);
        instancePath3.lineTo(14.176433f, 30.047743f);
        instancePath3.lineTo(14.176433f, 30.047743f);
        instancePath3.close();
        WeChatSVGRenderC2Java.setFillType(instancePath3, 2);
        canvas.drawPath(instancePath3, instancePaint6);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
