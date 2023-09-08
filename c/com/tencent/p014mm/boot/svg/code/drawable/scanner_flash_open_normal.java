package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.scanner_flash_open_normal */
public class scanner_flash_open_normal extends C24542c {
    private final int height = 32;
    private final int width = 24;

    public int doCommand(int i, Object... objArr) {
        if (i == 0) {
            return 24;
        }
        if (i == 1) {
            return 32;
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
            instancePaint3.setColor(-419430401);
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(14.5f, 19.85078f);
            instancePath.lineTo(14.5f, 30.0f);
            instancePath.cubicTo(14.5f, 30.552284f, 14.052284f, 31.0f, 13.5f, 31.0f);
            instancePath.lineTo(10.5f, 31.0f);
            instancePath.cubicTo(9.947715f, 31.0f, 9.5f, 30.552284f, 9.5f, 30.0f);
            instancePath.lineTo(9.5f, 19.85078f);
            instancePath.cubicTo(9.5f, 19.623709f, 9.422719f, 19.403399f, 9.280869f, 19.226086f);
            instancePath.lineTo(7.719131f, 17.273914f);
            instancePath.cubicTo(7.5772805f, 17.096601f, 7.5f, 16.876291f, 7.5f, 16.64922f);
            instancePath.lineTo(7.5f, 14.0f);
            instancePath.cubicTo(7.5f, 13.447716f, 7.9477153f, 13.0f, 8.5f, 13.0f);
            instancePath.lineTo(15.5f, 13.0f);
            instancePath.cubicTo(16.052284f, 13.0f, 16.5f, 13.447716f, 16.5f, 14.0f);
            instancePath.lineTo(16.5f, 16.64922f);
            instancePath.cubicTo(16.5f, 16.876291f, 16.42272f, 17.096601f, 16.280869f, 17.273914f);
            instancePath.lineTo(14.719131f, 19.226086f);
            instancePath.cubicTo(14.577281f, 19.403399f, 14.5f, 19.623709f, 14.5f, 19.85078f);
            instancePath.close();
            instancePath.moveTo(13.3f, 19.079063f);
            instancePath.lineTo(15.3f, 16.579063f);
            instancePath.lineTo(15.3f, 14.2f);
            instancePath.lineTo(8.7f, 14.2f);
            instancePath.lineTo(8.7f, 16.579063f);
            instancePath.lineTo(10.7f, 19.079063f);
            instancePath.lineTo(10.7f, 29.8f);
            instancePath.lineTo(13.3f, 29.8f);
            instancePath.lineTo(13.3f, 19.079063f);
            instancePath.close();
            instancePath.moveTo(8.1f, 11.0f);
            instancePath.lineTo(15.9f, 11.0f);
            Path path = instancePath;
            path.cubicTo(16.23137f, 11.0f, 16.5f, 11.268629f, 16.5f, 11.6f);
            path.cubicTo(16.5f, 11.931371f, 16.23137f, 12.2f, 15.9f, 12.2f);
            instancePath.lineTo(8.1f, 12.2f);
            Path path2 = instancePath;
            path2.cubicTo(7.768629f, 12.2f, 7.5f, 11.931371f, 7.5f, 11.6f);
            path2.cubicTo(7.5f, 11.268629f, 7.768629f, 11.0f, 8.1f, 11.0f);
            instancePath.close();
            instancePath.moveTo(12.0f, 21.0f);
            instancePath.cubicTo(12.33137f, 21.0f, 12.6f, 21.26863f, 12.6f, 21.6f);
            instancePath.lineTo(12.6f, 22.9f);
            Path path3 = instancePath;
            path3.cubicTo(12.6f, 23.23137f, 12.33137f, 23.5f, 12.0f, 23.5f);
            path3.cubicTo(11.66863f, 23.5f, 11.4f, 23.23137f, 11.4f, 22.9f);
            instancePath.lineTo(11.4f, 21.6f);
            instancePath.cubicTo(11.4f, 21.26863f, 11.66863f, 21.0f, 12.0f, 21.0f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 2);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
