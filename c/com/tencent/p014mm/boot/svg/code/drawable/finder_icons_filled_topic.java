package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.finder_icons_filled_topic */
public class finder_icons_filled_topic extends C24542c {
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
        C24542c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-15132391);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(36.0f, 6.0f);
        Path path = instancePath;
        path.cubicTo(52.568542f, 6.0f, 66.0f, 19.431458f, 66.0f, 36.0f);
        path.cubicTo(66.0f, 52.568542f, 52.568542f, 66.0f, 36.0f, 66.0f);
        path.cubicTo(19.431458f, 66.0f, 6.0f, 52.568542f, 6.0f, 36.0f);
        path.cubicTo(6.0f, 19.431458f, 19.431458f, 6.0f, 36.0f, 6.0f);
        instancePath.close();
        instancePath.moveTo(33.3f, 21.0f);
        instancePath.lineTo(28.8f, 21.0f);
        instancePath.lineTo(28.08f, 26.999f);
        instancePath.lineTo(21.0f, 27.0f);
        instancePath.lineTo(21.0f, 31.5f);
        instancePath.lineTo(27.54f, 31.499f);
        instancePath.lineTo(26.46f, 40.499f);
        instancePath.lineTo(21.0f, 40.5f);
        instancePath.lineTo(21.0f, 45.0f);
        instancePath.lineTo(25.92f, 44.999f);
        instancePath.lineTo(25.2f, 51.0f);
        instancePath.lineTo(29.7f, 51.0f);
        instancePath.lineTo(30.42f, 44.999f);
        instancePath.lineTo(39.42f, 44.999f);
        instancePath.lineTo(38.7f, 51.0f);
        instancePath.lineTo(43.2f, 51.0f);
        instancePath.lineTo(43.92f, 44.999f);
        instancePath.lineTo(51.0f, 45.0f);
        instancePath.lineTo(51.0f, 40.5f);
        instancePath.lineTo(44.46f, 40.499f);
        instancePath.lineTo(45.54f, 31.499f);
        instancePath.lineTo(51.0f, 31.5f);
        instancePath.lineTo(51.0f, 27.0f);
        instancePath.lineTo(46.08f, 26.999f);
        instancePath.lineTo(46.8f, 21.0f);
        instancePath.lineTo(42.3f, 21.0f);
        instancePath.lineTo(41.58f, 26.999f);
        instancePath.lineTo(32.58f, 26.999f);
        instancePath.lineTo(33.3f, 21.0f);
        instancePath.close();
        instancePath.moveTo(41.04f, 31.499f);
        instancePath.lineTo(39.96f, 40.499f);
        instancePath.lineTo(30.96f, 40.499f);
        instancePath.lineTo(32.04f, 31.499f);
        instancePath.lineTo(41.04f, 31.499f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
