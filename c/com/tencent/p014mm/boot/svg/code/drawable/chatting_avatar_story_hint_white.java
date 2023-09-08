package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.chatting_avatar_story_hint_white */
public class chatting_avatar_story_hint_white extends C24542c {
    private final int height = 24;
    private final int width = 24;

    public int doCommand(int i, Object... objArr) {
        if (i == 0 || i == 1) {
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
            canvas.save();
            Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-1);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(19.426306f, 8.069898f);
            Path path = instancePath;
            path.cubicTo(18.960836f, 7.191491f, 19.295588f, 6.1020646f, 20.173994f, 5.6365957f);
            path.cubicTo(21.0524f, 5.1711264f, 22.141829f, 5.5058784f, 22.607296f, 6.384285f);
            path.cubicTo(25.054684f, 11.002852f, 24.237564f, 16.734251f, 20.485281f, 20.486532f);
            path.cubicTo(15.79899f, 25.172825f, 8.20101f, 25.172825f, 3.5147185f, 20.486532f);
            path.cubicTo(-1.1715729f, 15.800241f, -1.1715729f, 8.202262f, 3.5147185f, 3.5159702f);
            path.cubicTo(7.2670016f, -0.23631252f, 12.998399f, -1.053432f, 17.616966f, 1.3939549f);
            path.cubicTo(18.495373f, 1.8594241f, 18.830126f, 2.9488506f, 18.364656f, 3.8272574f);
            path.cubicTo(17.899187f, 4.705664f, 16.809761f, 5.040416f, 15.931354f, 4.574947f);
            path.cubicTo(12.700203f, 2.8627546f, 8.686935f, 3.4349222f, 6.060303f, 6.061555f);
            path.cubicTo(2.779899f, 9.341959f, 2.779899f, 14.660544f, 6.060303f, 17.940948f);
            path.cubicTo(9.340707f, 21.221354f, 14.659293f, 21.221354f, 17.939697f, 17.940948f);
            path.cubicTo(20.56633f, 15.314316f, 21.138496f, 11.301048f, 19.426306f, 8.069898f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
