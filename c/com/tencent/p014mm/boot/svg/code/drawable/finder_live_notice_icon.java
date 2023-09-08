package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.finder_live_notice_icon */
public class finder_live_notice_icon extends C24542c {
    private final int height = 16;
    private final int width = 16;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 16;
        }
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
            instancePath.lineTo(16.0f, 0.0f);
            instancePath.lineTo(16.0f, 16.0f);
            instancePath.lineTo(0.0f, 16.0f);
            instancePath.lineTo(0.0f, 0.0f);
            instancePath.close();
            canvas.save();
            Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-16777216);
            Path instancePath2 = C24542c.instancePath(looper);
            instancePath2.moveTo(8.0f, 1.3333334f);
            Path path = instancePath2;
            path.cubicTo(11.681898f, 1.3333334f, 14.666667f, 4.318102f, 14.666667f, 8.0f);
            path.cubicTo(14.666667f, 11.681898f, 11.681898f, 14.666667f, 8.0f, 14.666667f);
            path.cubicTo(4.318102f, 14.666667f, 1.3333334f, 11.681898f, 1.3333334f, 8.0f);
            path.cubicTo(1.3333334f, 4.318102f, 4.318102f, 1.3333334f, 8.0f, 1.3333334f);
            instancePath2.close();
            instancePath2.moveTo(8.0f, 2.3333333f);
            Path path2 = instancePath2;
            path2.cubicTo(4.8703866f, 2.3333333f, 2.3333333f, 4.8703866f, 2.3333333f, 8.0f);
            path2.cubicTo(2.3333333f, 11.129614f, 4.8703866f, 13.666667f, 8.0f, 13.666667f);
            path2.cubicTo(11.129614f, 13.666667f, 13.666667f, 11.129614f, 13.666667f, 8.0f);
            path2.cubicTo(13.666667f, 4.8703866f, 11.129614f, 2.3333333f, 8.0f, 2.3333333f);
            instancePath2.close();
            WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
            canvas.drawPath(instancePath2, instancePaint3);
            canvas.restore();
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
            instancePaint4.setColor(-16777216);
            Path instancePath3 = C24542c.instancePath(looper);
            instancePath3.moveTo(8.0f, 4.333333f);
            Path path3 = instancePath3;
            path3.cubicTo(10.025044f, 4.333333f, 11.666667f, 5.9749556f, 11.666667f, 8.0f);
            path3.cubicTo(11.666667f, 10.025044f, 10.025044f, 11.666667f, 8.0f, 11.666667f);
            path3.cubicTo(5.9749556f, 11.666667f, 4.333333f, 10.025044f, 4.333333f, 8.0f);
            path3.cubicTo(4.333333f, 5.9749556f, 5.9749556f, 4.333333f, 8.0f, 4.333333f);
            instancePath3.close();
            canvas.drawPath(instancePath3, instancePaint4);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
