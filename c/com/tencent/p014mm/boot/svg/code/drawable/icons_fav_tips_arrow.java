package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_fav_tips_arrow */
public class icons_fav_tips_arrow extends C24542c {
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
            canvas.save();
            Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(40.046875f, 16.890625f);
            instancePath.lineTo(57.546875f, 34.390625f);
            instancePath.cubicTo(57.945312f, 34.789062f, 58.164062f, 35.30078f, 58.19922f, 35.82422f);
            instancePath.lineTo(58.19922f, 36.152344f);
            instancePath.cubicTo(58.164062f, 36.67578f, 57.945312f, 37.1875f, 57.546875f, 37.585938f);
            instancePath.lineTo(40.046875f, 55.085938f);
            instancePath.lineTo(37.5f, 52.54297f);
            instancePath.lineTo(54.05078f, 35.98828f);
            instancePath.lineTo(37.5f, 19.4375f);
            instancePath.close();
            instancePath.moveTo(38.25f, 34.19922f);
            instancePath.lineTo(38.25f, 37.80078f);
            instancePath.lineTo(13.5f, 37.80078f);
            instancePath.lineTo(13.5f, 34.19922f);
            instancePath.close();
            instancePath.moveTo(38.25f, 34.19922f);
            WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
