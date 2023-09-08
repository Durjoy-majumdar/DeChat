package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_screen_cast */
public class icons_filled_screen_cast extends C24542c {
    private final int height = 28;
    private final int width = 28;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 28;
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
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(0.0f, 0.0f);
        instancePath.lineTo(28.0f, 0.0f);
        instancePath.lineTo(28.0f, 28.0f);
        instancePath.lineTo(0.0f, 28.0f);
        instancePath.lineTo(0.0f, 0.0f);
        instancePath.close();
        canvas.saveLayerAlpha((RectF) null, 230, 31);
        canvas.restore();
        canvas.save();
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-16777216);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(24.5f, 3.5f);
        instancePath2.cubicTo(25.144333f, 3.5f, 25.666666f, 4.0223346f, 25.666666f, 4.6666665f);
        instancePath2.lineTo(25.666666f, 17.5f);
        instancePath2.cubicTo(25.666666f, 18.144333f, 25.144333f, 18.666666f, 24.5f, 18.666666f);
        instancePath2.lineTo(18.780333f, 18.666f);
        instancePath2.lineTo(19.790333f, 20.416f);
        instancePath2.lineTo(19.833334f, 20.416666f);
        instancePath2.lineTo(19.833334f, 20.491f);
        instancePath2.lineTo(22.16906f, 24.53627f);
        instancePath2.lineTo(20.148333f, 25.702936f);
        instancePath2.lineTo(18.442333f, 22.749f);
        instancePath2.lineTo(9.558333f, 22.749f);
        instancePath2.lineTo(7.854059f, 25.702936f);
        instancePath2.lineTo(5.8333335f, 24.53627f);
        instancePath2.lineTo(8.166333f, 20.495f);
        instancePath2.lineTo(8.166667f, 20.416666f);
        instancePath2.lineTo(8.211333f, 20.416f);
        instancePath2.lineTo(9.2213335f, 18.666f);
        instancePath2.lineTo(3.5f, 18.666666f);
        instancePath2.cubicTo(2.8556678f, 18.666666f, 2.3333333f, 18.144333f, 2.3333333f, 17.5f);
        instancePath2.lineTo(2.3333333f, 4.6666665f);
        instancePath2.cubicTo(2.3333333f, 4.0223346f, 2.8556678f, 3.5f, 3.5f, 3.5f);
        instancePath2.lineTo(24.5f, 3.5f);
        instancePath2.close();
        instancePath2.moveTo(16.085333f, 18.666f);
        instancePath2.lineTo(11.916333f, 18.666f);
        instancePath2.lineTo(10.906333f, 20.416f);
        instancePath2.lineTo(17.095333f, 20.416f);
        instancePath2.lineTo(16.085333f, 18.666f);
        instancePath2.close();
        instancePath2.moveTo(23.333334f, 5.8333335f);
        instancePath2.lineTo(4.6666665f, 5.8333335f);
        instancePath2.lineTo(4.6666665f, 16.333334f);
        instancePath2.lineTo(23.333334f, 16.333334f);
        instancePath2.lineTo(23.333334f, 5.8333335f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint3);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
