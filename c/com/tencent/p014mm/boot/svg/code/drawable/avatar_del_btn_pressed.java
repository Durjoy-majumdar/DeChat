package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.avatar_del_btn_pressed */
public class avatar_del_btn_pressed extends C24542c {
    private final int height = 60;
    private final int width = 60;

    public int doCommand(int i, Object... objArr) {
        if (i == 0 || i == 1) {
            return 60;
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
            canvas.save();
            Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-1);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(11.0f, 15.0f);
            instancePath.lineTo(44.0f, 15.0f);
            instancePath.lineTo(44.0f, 48.0f);
            instancePath.lineTo(11.0f, 48.0f);
            instancePath.lineTo(11.0f, 15.0f);
            instancePath.close();
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
            instancePaint4.setColor(-2012855);
            Path instancePath2 = C24542c.instancePath(looper);
            instancePath2.moveTo(30.0f, 28.37868f);
            instancePath2.lineTo(20.454058f, 18.832739f);
            instancePath2.lineTo(18.332739f, 20.954058f);
            instancePath2.lineTo(27.87868f, 30.5f);
            instancePath2.lineTo(18.332739f, 40.04594f);
            instancePath2.lineTo(20.454058f, 42.167263f);
            instancePath2.lineTo(30.0f, 32.62132f);
            instancePath2.lineTo(39.54594f, 42.167263f);
            instancePath2.lineTo(41.667263f, 40.04594f);
            instancePath2.lineTo(32.12132f, 30.5f);
            instancePath2.lineTo(41.667263f, 20.954058f);
            instancePath2.lineTo(39.54594f, 18.832739f);
            instancePath2.lineTo(30.0f, 28.37868f);
            instancePath2.close();
            instancePath2.moveTo(30.0f, 60.0f);
            Path path = instancePath2;
            path.cubicTo(13.4314575f, 60.0f, 0.0f, 46.568542f, 0.0f, 30.0f);
            path.cubicTo(0.0f, 13.4314575f, 13.4314575f, 0.0f, 30.0f, 0.0f);
            path.cubicTo(46.568542f, 0.0f, 60.0f, 13.4314575f, 60.0f, 30.0f);
            path.cubicTo(60.0f, 46.568542f, 46.568542f, 60.0f, 30.0f, 60.0f);
            instancePath2.close();
            WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
            canvas.drawPath(instancePath2, instancePaint4);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
