package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_notify */
public class icons_filled_notify extends C24542c {
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
        instancePaint3.setColor(-15616);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(45.0f, 11.412743f);
        instancePath.cubicTo(46.656853f, 11.412743f, 48.0f, 12.755889f, 48.0f, 14.412743f);
        instancePath.lineTo(48.0f, 14.412743f);
        instancePath.lineTo(48.0f, 57.587257f);
        Path path = instancePath;
        path.cubicTo(48.0f, 58.149517f, 47.84199f, 58.70046f, 47.543995f, 59.177254f);
        path.cubicTo(46.665863f, 60.582264f, 44.815014f, 61.009384f, 43.410004f, 60.131252f);
        instancePath.lineTo(43.410004f, 60.131252f);
        instancePath.lineTo(24.0f, 48.0f);
        instancePath.lineTo(18.0f, 48.0f);
        Path path2 = instancePath;
        path2.cubicTo(11.372583f, 48.0f, 6.0f, 42.62742f, 6.0f, 36.0f);
        path2.cubicTo(6.0f, 29.372583f, 11.372583f, 24.0f, 18.0f, 24.0f);
        instancePath.lineTo(18.0f, 24.0f);
        instancePath.lineTo(24.0f, 24.0f);
        instancePath.lineTo(43.410004f, 11.868748f);
        path2.cubicTo(43.8868f, 11.570751f, 44.43774f, 11.412743f, 45.0f, 11.412743f);
        instancePath.close();
        instancePath.moveTo(55.328876f, 45.316196f);
        instancePath.lineTo(67.34059f, 51.316196f);
        instancePath.lineTo(64.65941f, 56.683804f);
        instancePath.lineTo(52.647686f, 50.683804f);
        instancePath.lineTo(55.328876f, 45.316196f);
        instancePath.close();
        instancePath.moveTo(66.0f, 33.0f);
        instancePath.lineTo(66.0f, 39.0f);
        instancePath.lineTo(53.98828f, 39.0f);
        instancePath.lineTo(53.98828f, 33.0f);
        instancePath.lineTo(66.0f, 33.0f);
        instancePath.close();
        instancePath.moveTo(64.65941f, 15.316195f);
        instancePath.lineTo(67.34059f, 20.683805f);
        instancePath.lineTo(55.328876f, 26.683805f);
        instancePath.lineTo(52.647686f, 21.316195f);
        instancePath.lineTo(64.65941f, 15.316195f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(0.0f, 0.0f);
        instancePath2.lineTo(72.0f, 0.0f);
        instancePath2.lineTo(72.0f, 72.0f);
        instancePath2.lineTo(0.0f, 72.0f);
        instancePath2.lineTo(0.0f, 0.0f);
        instancePath2.close();
        C24542c.done(looper);
        return 0;
    }
}
