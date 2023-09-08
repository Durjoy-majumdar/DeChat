package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.wallet_balance_manager_logo */
public class wallet_balance_manager_logo extends C24542c {
    private final int height = 240;
    private final int width = 240;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 240;
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
        canvas.save();
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-407039);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(120.0f, 0.0f);
        Path path = instancePath;
        path.cubicTo(186.27417f, 0.0f, 240.0f, 53.72583f, 240.0f, 120.0f);
        path.cubicTo(240.0f, 186.27417f, 186.27417f, 240.0f, 120.0f, 240.0f);
        path.cubicTo(53.72583f, 240.0f, 0.0f, 186.27417f, 0.0f, 120.0f);
        path.cubicTo(0.0f, 53.72583f, 53.72583f, 0.0f, 120.0f, 0.0f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-1);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(120.0f, 21.0f);
        Path path2 = instancePath2;
        path2.cubicTo(174.6762f, 21.0f, 219.0f, 65.32381f, 219.0f, 120.0f);
        path2.cubicTo(219.0f, 174.6762f, 174.6762f, 219.0f, 120.0f, 219.0f);
        path2.cubicTo(65.32381f, 219.0f, 21.0f, 174.6762f, 21.0f, 120.0f);
        path2.cubicTo(21.0f, 65.32381f, 65.32381f, 21.0f, 120.0f, 21.0f);
        instancePath2.close();
        canvas.saveLayerAlpha((RectF) null, 102, 31);
        canvas.drawPath(instancePath2, C24542c.instancePaint(instancePaint4, looper));
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-407039);
        Path instancePath3 = C24542c.instancePath(looper);
        instancePath3.moveTo(125.57143f, 108.0f);
        instancePath3.lineTo(142.28572f, 72.0f);
        instancePath3.lineTo(159.0f, 72.0f);
        instancePath3.lineTo(142.28572f, 108.0f);
        instancePath3.lineTo(159.0f, 108.0f);
        instancePath3.lineTo(159.0f, 123.0f);
        instancePath3.lineTo(126.0f, 123.0f);
        instancePath3.lineTo(126.0f, 135.0f);
        instancePath3.lineTo(159.0f, 135.0f);
        instancePath3.lineTo(159.0f, 150.0f);
        instancePath3.lineTo(126.0f, 150.0f);
        instancePath3.lineTo(126.0f, 171.0f);
        instancePath3.lineTo(114.0f, 171.0f);
        instancePath3.lineTo(114.0f, 150.0f);
        instancePath3.lineTo(81.0f, 150.0f);
        instancePath3.lineTo(81.0f, 135.0f);
        instancePath3.lineTo(114.0f, 135.0f);
        instancePath3.lineTo(114.0f, 123.0f);
        instancePath3.lineTo(81.0f, 123.0f);
        instancePath3.lineTo(81.0f, 108.0f);
        instancePath3.lineTo(97.71429f, 108.0f);
        instancePath3.lineTo(81.0f, 72.0f);
        instancePath3.lineTo(97.71429f, 72.0f);
        instancePath3.lineTo(114.42857f, 108.0f);
        instancePath3.lineTo(125.57143f, 108.0f);
        instancePath3.close();
        WeChatSVGRenderC2Java.setFillType(instancePath3, 2);
        canvas.drawPath(instancePath3, instancePaint5);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
