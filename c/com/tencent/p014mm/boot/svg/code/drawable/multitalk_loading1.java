package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.multitalk_loading1 */
public class multitalk_loading1 extends C24542c {
    private final int height = 24;
    private final int width = 120;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            return 120;
        }
        if (i2 == 1) {
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
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-1);
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        instancePaint4.setColor(-1);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(60.0f, 24.0f);
        Path path = instancePath;
        path.cubicTo(66.62742f, 24.0f, 72.0f, 18.627417f, 72.0f, 12.0f);
        path.cubicTo(72.0f, 5.372583f, 66.62742f, 0.0f, 60.0f, 0.0f);
        path.cubicTo(53.37258f, 0.0f, 48.0f, 5.372583f, 48.0f, 12.0f);
        path.cubicTo(48.0f, 18.627417f, 53.37258f, 24.0f, 60.0f, 24.0f);
        instancePath.close();
        instancePath.moveTo(12.0f, 24.0f);
        path.cubicTo(18.627417f, 24.0f, 24.0f, 18.627417f, 24.0f, 12.0f);
        path.cubicTo(24.0f, 5.372583f, 18.627417f, 0.0f, 12.0f, 0.0f);
        path.cubicTo(5.372583f, 0.0f, 0.0f, 5.372583f, 0.0f, 12.0f);
        path.cubicTo(0.0f, 18.627417f, 5.372583f, 24.0f, 12.0f, 24.0f);
        instancePath.close();
        instancePath.moveTo(108.0f, 24.0f);
        Path path2 = instancePath;
        path2.cubicTo(114.62742f, 24.0f, 120.0f, 18.627417f, 120.0f, 12.0f);
        path2.cubicTo(120.0f, 5.372583f, 114.62742f, 0.0f, 108.0f, 0.0f);
        path2.cubicTo(101.37258f, 0.0f, 96.0f, 5.372583f, 96.0f, 12.0f);
        path2.cubicTo(96.0f, 18.627417f, 101.37258f, 24.0f, 108.0f, 24.0f);
        instancePath.close();
        canvas.saveLayerAlpha((RectF) null, 76, 31);
        Paint instancePaint5 = C24542c.instancePaint(instancePaint4, looper);
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint5);
        canvas.restore();
        Paint instancePaint6 = C24542c.instancePaint(instancePaint3, looper);
        instancePaint6.setColor(-1);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(12.0f, 0.0f);
        Path path3 = instancePath2;
        path3.cubicTo(18.627419f, 0.0f, 24.0f, 5.3725824f, 24.0f, 12.0f);
        path3.cubicTo(24.0f, 18.627419f, 18.627419f, 24.0f, 12.0f, 24.0f);
        path3.cubicTo(5.3725824f, 24.0f, 0.0f, 18.627419f, 0.0f, 12.0f);
        path3.cubicTo(0.0f, 5.3725824f, 5.3725824f, 0.0f, 12.0f, 0.0f);
        instancePath2.close();
        canvas.saveLayerAlpha((RectF) null, 153, 31);
        canvas.drawPath(instancePath2, C24542c.instancePaint(instancePaint6, looper));
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
