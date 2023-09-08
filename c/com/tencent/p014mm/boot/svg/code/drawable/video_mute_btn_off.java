package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.video_mute_btn_off */
public class video_mute_btn_off extends C24542c {
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
        C24542c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-419430401);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(9.06066f, 6.9393396f);
        instancePath.lineTo(11.3f, 4.7f);
        Path path = instancePath;
        path.cubicTo(11.7f, 4.3f, 12.3f, 4.3f, 12.7f, 4.7f);
        path.cubicTo(12.9f, 4.9f, 13.0f, 5.1f, 13.0f, 5.4f);
        instancePath.lineTo(13.0f, 10.878679f);
        instancePath.lineTo(15.878548f, 13.757228f);
        Path path2 = instancePath;
        path2.cubicTo(16.152016f, 13.216491f, 16.3f, 12.608245f, 16.3f, 12.0f);
        path2.cubicTo(16.3f, 11.0f, 15.9f, 10.0f, 15.2f, 9.3f);
        instancePath.lineTo(15.1f, 9.2f);
        instancePath.lineTo(16.2f, 8.1f);
        instancePath.lineTo(16.3f, 8.2f);
        Path path3 = instancePath;
        path3.cubicTo(17.3f, 9.2f, 17.9f, 10.6f, 17.9f, 12.0f);
        path3.cubicTo(17.9f, 13.0188675f, 17.582216f, 14.037734f, 17.023743f, 14.902421f);
        instancePath.lineTo(17.942335f, 15.821014f);
        Path path4 = instancePath;
        path4.cubicTo(18.730238f, 14.702849f, 19.1f, 13.413052f, 19.1f, 12.0f);
        path4.cubicTo(19.1f, 10.2f, 18.4f, 8.6f, 17.2f, 7.3f);
        instancePath.lineTo(17.1f, 7.2f);
        instancePath.lineTo(18.2f, 6.1f);
        instancePath.lineTo(18.3f, 6.2f);
        Path path5 = instancePath;
        path5.cubicTo(19.8f, 7.7f, 20.7f, 9.8f, 20.7f, 12.0f);
        path5.cubicTo(20.7f, 13.820007f, 20.152493f, 15.503137f, 19.057474f, 16.936155f);
        instancePath.lineTo(22.091883f, 19.970562f);
        instancePath.lineTo(21.031223f, 21.031223f);
        instancePath.lineTo(4.0606604f, 4.0606604f);
        instancePath.lineTo(5.1213202f, 3.0f);
        instancePath.lineTo(9.06066f, 6.9393396f);
        instancePath.close();
        instancePath.moveTo(13.0f, 15.121321f);
        instancePath.lineTo(13.0f, 18.6f);
        Path path6 = instancePath;
        path6.cubicTo(13.0f, 19.2f, 12.6f, 19.6f, 12.0f, 19.6f);
        path6.cubicTo(11.7f, 19.6f, 11.5f, 19.5f, 11.3f, 19.3f);
        instancePath.lineTo(7.5f, 15.5f);
        instancePath.lineTo(3.0f, 15.5f);
        instancePath.cubicTo(2.4f, 15.5f, 2.0f, 15.1f, 2.0f, 14.5f);
        instancePath.lineTo(2.0f, 9.5f);
        instancePath.cubicTo(2.0f, 8.9f, 2.4f, 8.5f, 3.0f, 8.5f);
        instancePath.lineTo(6.3786798f, 8.5f);
        instancePath.lineTo(13.0f, 15.121321f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
