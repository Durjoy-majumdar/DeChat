package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.multitalk_loading0 */
public class multitalk_loading0 extends C24542c {
    private final int height = 24;
    private final int width = 120;

    public int doCommand(int i, Object... objArr) {
        if (i == 0) {
            return 120;
        }
        if (i == 1) {
            return 24;
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
            instancePaint3.setColor(-1);
            canvas.saveLayerAlpha((RectF) null, 76, 31);
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(60.0f, 24.0f);
            Path path = instancePath;
            path.cubicTo(66.62742f, 24.0f, 72.0f, 18.627417f, 72.0f, 12.0f);
            path.cubicTo(72.0f, 5.372583f, 66.62742f, 0.0f, 60.0f, 0.0f);
            path.cubicTo(53.37258f, 0.0f, 48.0f, 5.372583f, 48.0f, 12.0f);
            path.cubicTo(48.0f, 18.627417f, 53.37258f, 24.0f, 60.0f, 24.0f);
            instancePath.close();
            instancePath.moveTo(12.0f, 24.0f);
            Path path2 = instancePath;
            path2.cubicTo(18.627417f, 24.0f, 24.0f, 18.627417f, 24.0f, 12.0f);
            path2.cubicTo(24.0f, 5.372583f, 18.627417f, 0.0f, 12.0f, 0.0f);
            path2.cubicTo(5.372583f, 0.0f, 0.0f, 5.372583f, 0.0f, 12.0f);
            path2.cubicTo(0.0f, 18.627417f, 5.372583f, 24.0f, 12.0f, 24.0f);
            instancePath.close();
            instancePath.moveTo(108.0f, 24.0f);
            Path path3 = instancePath;
            path3.cubicTo(114.62742f, 24.0f, 120.0f, 18.627417f, 120.0f, 12.0f);
            path3.cubicTo(120.0f, 5.372583f, 114.62742f, 0.0f, 108.0f, 0.0f);
            path3.cubicTo(101.37258f, 0.0f, 96.0f, 5.372583f, 96.0f, 12.0f);
            path3.cubicTo(96.0f, 18.627417f, 101.37258f, 24.0f, 108.0f, 24.0f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 2);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
