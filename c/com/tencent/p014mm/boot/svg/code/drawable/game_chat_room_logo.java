package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.game_chat_room_logo */
public class game_chat_room_logo extends C24542c {
    private final int height = 32;
    private final int width = 32;

    public int doCommand(int i, Object... objArr) {
        int i2 = 32;
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
                canvas.save();
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-15683857);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(20.0001f, 12.6667f);
                Path path = instancePath;
                path.cubicTo(20.0001f, 16.7168f, 16.7168f, 20.0f, 12.6667f, 20.0f);
                path.cubicTo(12.4514f, 20.0f, 12.2382f, 19.9907f, 12.0276f, 19.9725f);
                path.cubicTo(12.0094f, 19.7619f, 12.0001f, 19.5487f, 12.0001f, 19.3333f);
                path.cubicTo(12.0001f, 15.2832f, 15.2833f, 12.0f, 19.3334f, 12.0f);
                path.cubicTo(19.5488f, 12.0f, 19.762f, 12.0093f, 19.9726f, 12.0275f);
                path.cubicTo(19.9908f, 12.2381f, 20.0001f, 12.4513f, 20.0001f, 12.6667f);
                instancePath.close();
                instancePath.moveTo(19.2009f, 9.33419f);
                Path path2 = instancePath;
                path2.cubicTo(13.7832f, 9.40455f, 9.40463f, 13.7832f, 9.33428f, 19.2008f);
                path2.cubicTo(6.95936f, 17.9872f, 5.33341f, 15.5168f, 5.33341f, 12.6667f);
                path2.cubicTo(5.33341f, 8.61658f, 8.61666f, 5.33333f, 12.6667f, 5.33333f);
                path2.cubicTo(15.5169f, 5.33333f, 17.9873f, 6.95927f, 19.2009f, 9.33419f);
                instancePath.close();
                instancePath.moveTo(22.2383f, 9.76178f);
                Path path3 = instancePath;
                path3.cubicTo(20.9938f, 5.65564f, 17.1793f, 2.66666f, 12.6667f, 2.66666f);
                path3.cubicTo(7.1439f, 2.66666f, 2.66675f, 7.14382f, 2.66675f, 12.6667f);
                path3.cubicTo(2.66675f, 17.1792f, 5.65572f, 20.9937f, 9.76187f, 22.2382f);
                path3.cubicTo(11.0064f, 26.3444f, 14.8209f, 29.3333f, 19.3334f, 29.3333f);
                path3.cubicTo(24.8563f, 29.3333f, 29.3334f, 24.8562f, 29.3334f, 19.3333f);
                path3.cubicTo(29.3334f, 14.8208f, 26.3444f, 11.0063f, 22.2383f, 9.76178f);
                instancePath.close();
                instancePath.moveTo(22.6659f, 12.7992f);
                Path path4 = instancePath;
                path4.cubicTo(22.5955f, 18.2168f, 18.2169f, 22.5954f, 12.7993f, 22.6658f);
                path4.cubicTo(14.0129f, 25.0407f, 16.4833f, 26.6667f, 19.3334f, 26.6667f);
                path4.cubicTo(23.3835f, 26.6667f, 26.6667f, 23.3834f, 26.6667f, 19.3333f);
                path4.cubicTo(26.6667f, 16.4832f, 25.0408f, 14.0128f, 22.6659f, 12.7992f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i2;
    }
}
