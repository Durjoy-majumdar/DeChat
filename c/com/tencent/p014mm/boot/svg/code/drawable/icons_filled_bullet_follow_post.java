package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_bullet_follow_post */
public class icons_filled_bullet_follow_post extends C24542c {
    private final int height = 72;
    private final int width = 72;

    public int doCommand(int i, Object... objArr) {
        if (i == 0 || i == 1) {
            return 72;
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
            instancePaint3.setColor(-2565928);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(0.0f, 0.0f);
            instancePath.lineTo(72.0f, 0.0f);
            instancePath.lineTo(72.0f, 72.0f);
            instancePath.lineTo(0.0f, 72.0f);
            instancePath.lineTo(0.0f, 0.0f);
            instancePath.close();
            canvas.saveLayerAlpha((RectF) null, 0, 31);
            canvas.drawPath(instancePath, C24542c.instancePaint(instancePaint3, looper));
            canvas.restore();
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
            instancePaint4.setColor(-16777216);
            Path instancePath2 = C24542c.instancePath(looper);
            instancePath2.moveTo(34.89f, 43.794f);
            instancePath2.lineTo(24.9f, 43.794f);
            instancePath2.lineTo(24.9f, 53.784f);
            instancePath2.lineTo(18.042f, 53.784f);
            instancePath2.lineTo(18.042f, 43.794f);
            instancePath2.lineTo(8.052f, 43.794f);
            instancePath2.lineTo(8.052f, 36.99f);
            instancePath2.lineTo(18.042f, 36.99f);
            instancePath2.lineTo(18.042f, 27.0f);
            instancePath2.lineTo(24.9f, 27.0f);
            instancePath2.lineTo(24.9f, 36.99f);
            instancePath2.lineTo(34.89f, 36.99f);
            instancePath2.lineTo(34.89f, 43.794f);
            instancePath2.close();
            instancePath2.moveTo(50.94f, 24.48f);
            instancePath2.lineTo(43.26f, 29.94f);
            instancePath2.lineTo(39.0f, 23.7f);
            instancePath2.lineTo(51.66f, 14.28f);
            instancePath2.lineTo(58.8f, 14.28f);
            instancePath2.lineTo(58.8f, 57.0f);
            instancePath2.lineTo(50.94f, 57.0f);
            instancePath2.lineTo(50.94f, 24.48f);
            instancePath2.close();
            WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
            canvas.drawPath(instancePath2, instancePaint4);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
