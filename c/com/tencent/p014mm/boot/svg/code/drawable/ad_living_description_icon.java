package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.ad_living_description_icon */
public class ad_living_description_icon extends C24542c {
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
                canvas.save();
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-40634);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(36.0f, 71.0f);
                Path path = instancePath;
                path.cubicTo(55.33f, 71.0f, 71.0f, 55.33f, 71.0f, 36.0f);
                path.cubicTo(71.0f, 16.67f, 55.33f, 1.0f, 36.0f, 1.0f);
                path.cubicTo(16.67f, 1.0f, 1.0f, 16.67f, 1.0f, 36.0f);
                path.cubicTo(1.0f, 55.33f, 16.67f, 71.0f, 36.0f, 71.0f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 1);
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
                instancePaint4.setColor(-1);
                Path instancePath2 = C24542c.instancePath(looper);
                instancePath2.moveTo(21.4166f, 27.4931f);
                instancePath2.lineTo(27.493f, 27.4931f);
                instancePath2.lineTo(27.493f, 44.507f);
                instancePath2.lineTo(21.4166f, 44.507f);
                instancePath2.cubicTo(20.0743f, 44.507f, 18.9861f, 43.4188f, 18.9861f, 42.0764f);
                instancePath2.lineTo(18.9861f, 29.9237f);
                instancePath2.cubicTo(18.9861f, 28.5813f, 20.0743f, 27.4931f, 21.4166f, 27.4931f);
                instancePath2.close();
                instancePath2.moveTo(29.9236f, 27.4931f);
                instancePath2.lineTo(47.6657f, 19.731f);
                Path path2 = instancePath2;
                path2.cubicTo(48.2806f, 19.462f, 48.9971f, 19.7424f, 49.2661f, 20.3572f);
                path2.cubicTo(49.3333f, 20.5108f, 49.368f, 20.6767f, 49.368f, 20.8444f);
                instancePath2.lineTo(49.368f, 51.1557f);
                Path path3 = instancePath2;
                path3.cubicTo(49.368f, 51.827f, 48.824f, 52.371f, 48.1528f, 52.371f);
                path3.cubicTo(47.9851f, 52.371f, 47.8193f, 52.3363f, 47.6657f, 52.2691f);
                instancePath2.lineTo(29.9236f, 44.507f);
                instancePath2.lineTo(29.9236f, 27.4931f);
                instancePath2.close();
                WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint4);
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i3;
    }
}
