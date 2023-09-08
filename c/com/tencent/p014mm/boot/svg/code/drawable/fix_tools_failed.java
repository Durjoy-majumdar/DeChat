package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.fix_tools_failed */
public class fix_tools_failed extends C24542c {
    private final int height = 100;
    private final int width = 100;

    public int doCommand(int i, Object... objArr) {
        int i2 = 100;
        if (!(i == 0 || i == 1)) {
            i2 = 0;
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
                instancePaint3.setColor(-1686720);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(51.515152f, 100.0f);
                Path path = instancePath;
                path.cubicTo(22.385763f, 100.0f, 0.0f, 77.614235f, 0.0f, 51.515152f);
                path.cubicTo(0.0f, 22.385763f, 22.385763f, 0.0f, 51.515152f, 0.0f);
                path.cubicTo(77.614235f, 0.0f, 100.0f, 22.385763f, 100.0f, 51.515152f);
                path.cubicTo(100.0f, 77.614235f, 77.614235f, 100.0f, 51.515152f, 100.0f);
                instancePath.close();
                instancePath.moveTo(45.567917f, 25.108103f);
                instancePath.lineTo(47.272728f, 60.909092f);
                instancePath.lineTo(54.545456f, 60.909092f);
                instancePath.lineTo(56.250263f, 25.108103f);
                Path path2 = instancePath;
                path2.cubicTo(56.309967f, 23.85433f, 55.341984f, 22.789549f, 54.08821f, 22.729845f);
                path2.cubicTo(54.052204f, 22.72813f, 54.01616f, 22.727272f, 53.98011f, 22.727272f);
                instancePath.lineTo(47.838074f, 22.727272f);
                Path path3 = instancePath;
                path3.cubicTo(46.582882f, 22.727272f, 45.565346f, 23.744808f, 45.565346f, 25.0f);
                path3.cubicTo(45.565346f, 25.036049f, 45.566204f, 25.072094f, 45.567917f, 25.108103f);
                instancePath.close();
                instancePath.moveTo(50.909092f, 76.818184f);
                Path path4 = instancePath;
                path4.cubicTo(53.921555f, 76.818184f, 56.363636f, 74.3761f, 56.363636f, 71.36364f);
                path4.cubicTo(56.363636f, 68.35117f, 53.921555f, 65.90909f, 50.909092f, 65.90909f);
                path4.cubicTo(47.89663f, 65.90909f, 45.454544f, 68.35117f, 45.454544f, 71.36364f);
                path4.cubicTo(45.454544f, 74.3761f, 47.89663f, 76.818184f, 50.909092f, 76.818184f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i2;
    }
}
