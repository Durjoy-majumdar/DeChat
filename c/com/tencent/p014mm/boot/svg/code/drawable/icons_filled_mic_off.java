package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_mic_off */
public class icons_filled_mic_off extends C24542c {
    private final int height = 24;
    private final int width = 24;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 24;
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
        canvas.save();
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-16777216);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(12.0f, 2.0f);
        instancePath.cubicTo(9.51472f, 2.0f, 7.5f, 4.01472f, 7.5f, 6.5f);
        instancePath.lineTo(7.5f, 12.5f);
        Path path = instancePath;
        path.cubicTo(7.5f, 14.5705f, 8.89829f, 16.3143f, 10.8021f, 16.8388f);
        path.cubicTo(10.8833f, 13.6564f, 13.3625f, 11.0702f, 16.5f, 10.8199f);
        instancePath.lineTo(16.5f, 6.5f);
        Path path2 = instancePath;
        path2.cubicTo(16.5f, 4.01472f, 14.4853f, 2.0f, 12.0f, 2.0f);
        instancePath.close();
        instancePath.moveTo(5.7f, 12.5f);
        path2.cubicTo(5.7f, 15.6544f, 8.01827f, 18.2673f, 11.044f, 18.7279f);
        path2.cubicTo(11.3365f, 19.7379f, 11.8789f, 20.6418f, 12.6f, 21.3681f);
        instancePath.lineTo(12.6f, 23.0f);
        instancePath.lineTo(11.4f, 23.0f);
        instancePath.lineTo(11.4f, 19.9763f);
        instancePath.cubicTo(7.5384f, 19.6707f, 4.5f, 16.4402f, 4.5f, 12.5f);
        instancePath.lineTo(4.5f, 11.0f);
        instancePath.lineTo(5.7f, 11.0f);
        instancePath.lineTo(5.7f, 12.5f);
        instancePath.close();
        instancePath.moveTo(22.0f, 17.0f);
        Path path3 = instancePath;
        path3.cubicTo(22.0f, 14.2386f, 19.7614f, 12.0f, 17.0f, 12.0f);
        path3.cubicTo(14.2386f, 12.0f, 12.0f, 14.2386f, 12.0f, 17.0f);
        path3.cubicTo(12.0f, 19.7614f, 14.2386f, 22.0f, 17.0f, 22.0f);
        path3.cubicTo(19.7614f, 22.0f, 22.0f, 19.7614f, 22.0f, 17.0f);
        instancePath.close();
        instancePath.moveTo(13.2f, 17.0f);
        path3.cubicTo(13.2f, 16.1672f, 13.4679f, 15.397f, 13.9222f, 14.7708f);
        instancePath.lineTo(19.2292f, 20.0778f);
        path3.cubicTo(18.603f, 20.5321f, 17.8328f, 20.8f, 17.0f, 20.8f);
        path3.cubicTo(14.9013f, 20.8f, 13.2f, 19.0987f, 13.2f, 17.0f);
        instancePath.close();
        instancePath.moveTo(17.0f, 13.2f);
        path3.cubicTo(16.1672f, 13.2f, 15.397f, 13.4679f, 14.7708f, 13.9222f);
        instancePath.lineTo(20.0778f, 19.2292f);
        path3.cubicTo(20.5321f, 18.603f, 20.8f, 17.8328f, 20.8f, 17.0f);
        path3.cubicTo(20.8f, 14.9013f, 19.0987f, 13.2f, 17.0f, 13.2f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
