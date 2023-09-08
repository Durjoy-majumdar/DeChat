package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.video_clip_slider_selected */
public class video_clip_slider_selected extends C24542c {
    private final int height = 150;
    private final int width = 24;

    public int doCommand(int i, Object... objArr) {
        if (i == 0) {
            return 24;
        }
        if (i == 1) {
            return 150;
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
            instancePath.moveTo(0.0f, 0.0f);
            instancePath.lineTo(24.0f, 0.0f);
            instancePath.lineTo(24.0f, 150.0f);
            instancePath.lineTo(0.0f, 150.0f);
            instancePath.lineTo(0.0f, 0.0f);
            instancePath.close();
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
            instancePaint4.setColor(-16777216);
            Path instancePath2 = C24542c.instancePath(looper);
            instancePath2.moveTo(7.0f, 66.0f);
            instancePath2.lineTo(10.0f, 66.0f);
            instancePath2.lineTo(10.0f, 84.0f);
            instancePath2.lineTo(7.0f, 84.0f);
            instancePath2.lineTo(7.0f, 66.0f);
            instancePath2.close();
            instancePath2.moveTo(14.0f, 66.0f);
            instancePath2.lineTo(17.0f, 66.0f);
            instancePath2.lineTo(17.0f, 84.0f);
            instancePath2.lineTo(14.0f, 84.0f);
            instancePath2.lineTo(14.0f, 66.0f);
            instancePath2.close();
            canvas.saveLayerAlpha((RectF) null, 51, 31);
            Paint instancePaint5 = C24542c.instancePaint(instancePaint4, looper);
            WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
            canvas.drawPath(instancePath2, instancePaint5);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
