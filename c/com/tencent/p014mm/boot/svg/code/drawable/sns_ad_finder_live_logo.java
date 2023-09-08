package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.sns_ad_finder_live_logo */
public class sns_ad_finder_live_logo extends C24542c {
    private final int height = 13;
    private final int width = 12;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            return 12;
        }
        if (i2 == 1) {
            return 13;
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
            canvas.save();
            Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-1);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(12.0f, 6.5f);
            Path path = instancePath;
            path.cubicTo(12.0f, 9.81371f, 9.31371f, 12.5f, 6.0f, 12.5f);
            path.cubicTo(2.68629f, 12.5f, 0.0f, 9.81371f, 0.0f, 6.5f);
            path.cubicTo(0.0f, 3.18629f, 2.68629f, 0.5f, 6.0f, 0.5f);
            path.cubicTo(9.31371f, 0.5f, 12.0f, 3.18629f, 12.0f, 6.5f);
            instancePath.close();
            instancePath.moveTo(0.900065f, 6.5f);
            Path path2 = instancePath;
            path2.cubicTo(0.900065f, 9.31665f, 3.18341f, 11.6f, 6.00006f, 11.6f);
            path2.cubicTo(8.81672f, 11.6f, 11.1001f, 9.31665f, 11.1001f, 6.5f);
            path2.cubicTo(11.1001f, 3.68335f, 8.81672f, 1.4f, 6.00006f, 1.4f);
            path2.cubicTo(3.18341f, 1.4f, 0.900065f, 3.68335f, 0.900065f, 6.5f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 2);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
            instancePaint4.setColor(-1);
            Path instancePath2 = C24542c.instancePath(looper);
            instancePath2.moveTo(6.00001f, 3.2001998f);
            Path path3 = instancePath2;
            path3.cubicTo(7.82255f, 3.2001998f, 9.30001f, 4.67766f, 9.30001f, 6.5002f);
            path3.cubicTo(9.30001f, 8.32274f, 7.82255f, 9.8001995f, 6.00001f, 9.8001995f);
            path3.cubicTo(4.17747f, 9.8001995f, 2.70001f, 8.32274f, 2.70001f, 6.5002f);
            path3.cubicTo(2.70001f, 4.67766f, 4.17747f, 3.2001998f, 6.00001f, 3.2001998f);
            instancePath2.close();
            canvas.drawPath(instancePath2, instancePaint4);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
