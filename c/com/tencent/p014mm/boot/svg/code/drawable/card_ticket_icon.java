package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.card_ticket_icon */
public class card_ticket_icon extends C24542c {
    private final int height = 32;
    private final int width = 32;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 32;
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
            C24542c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
            Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-15432210);
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(4.9f, 7.5f);
            instancePath.lineTo(27.1f, 7.5f);
            instancePath.cubicTo(27.597055f, 7.5f, 28.0f, 7.9029436f, 28.0f, 8.4f);
            instancePath.lineTo(28.0f, 23.6f);
            instancePath.cubicTo(28.0f, 24.097055f, 27.597055f, 24.5f, 27.1f, 24.5f);
            instancePath.lineTo(4.9f, 24.5f);
            Path path = instancePath;
            path.cubicTo(4.4029436f, 24.5f, 4.0f, 24.097055f, 4.0f, 23.6f);
            instancePath.lineTo(4.0f, 8.4f);
            path.cubicTo(4.0f, 7.9029436f, 4.4029436f, 7.5f, 4.9f, 7.5f);
            instancePath.close();
            instancePath.moveTo(9.909091f, 15.46875f);
            path.cubicTo(11.164284f, 15.46875f, 12.181818f, 14.477714f, 12.181818f, 13.255208f);
            path.cubicTo(12.181818f, 12.032703f, 11.164284f, 11.041667f, 9.909091f, 11.041667f);
            path.cubicTo(8.653898f, 11.041667f, 7.6363635f, 12.032703f, 7.6363635f, 13.255208f);
            path.cubicTo(7.6363635f, 14.477714f, 8.653898f, 15.46875f, 9.909091f, 15.46875f);
            instancePath.close();
            instancePath.moveTo(10.066779f, 20.785433f);
            path.cubicTo(11.265334f, 20.785433f, 13.810014f, 21.035427f, 13.810014f, 19.811766f);
            path.cubicTo(13.810014f, 18.588106f, 12.6521635f, 16.354166f, 10.066779f, 16.354166f);
            path.cubicTo(7.481395f, 16.354166f, 6.7272725f, 18.588106f, 6.7272725f, 19.811766f);
            path.cubicTo(6.7272725f, 21.035427f, 8.868224f, 20.785433f, 10.066779f, 20.785433f);
            instancePath.close();
            instancePath.moveTo(16.26818f, 12.8125f);
            path.cubicTo(16.019653f, 12.8125f, 15.818182f, 13.013972f, 15.818182f, 13.2625f);
            instancePath.lineTo(15.818182f, 14.4875f);
            instancePath.cubicTo(15.818182f, 14.736028f, 16.019653f, 14.9375f, 16.26818f, 14.9375f);
            instancePath.lineTo(23.368181f, 14.9375f);
            instancePath.cubicTo(23.61671f, 14.9375f, 23.818182f, 14.736028f, 23.818182f, 14.4875f);
            instancePath.lineTo(23.818182f, 13.2625f);
            Path path2 = instancePath;
            path2.cubicTo(23.818182f, 13.013972f, 23.61671f, 12.8125f, 23.368181f, 12.8125f);
            instancePath.lineTo(16.26818f, 12.8125f);
            instancePath.close();
            instancePath.moveTo(16.26818f, 17.239584f);
            path2.cubicTo(16.019653f, 17.239584f, 15.818182f, 17.441055f, 15.818182f, 17.689583f);
            instancePath.lineTo(15.818182f, 18.914583f);
            instancePath.cubicTo(15.818182f, 19.16311f, 16.019653f, 19.364584f, 16.26818f, 19.364584f);
            instancePath.lineTo(21.004545f, 19.364584f);
            instancePath.cubicTo(21.253073f, 19.364584f, 21.454546f, 19.16311f, 21.454546f, 18.914583f);
            instancePath.lineTo(21.454546f, 17.689583f);
            instancePath.cubicTo(21.454546f, 17.441055f, 21.253073f, 17.239584f, 21.004545f, 17.239584f);
            instancePath.lineTo(16.26818f, 17.239584f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
