package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_pause_white */
public class icons_outlined_pause_white extends C24542c {
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
        canvas.save();
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-419430401);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(12.0f, 0.0f);
        Path path = instancePath;
        path.cubicTo(18.627417f, 0.0f, 24.0f, 5.372583f, 24.0f, 12.0f);
        path.cubicTo(24.0f, 18.627417f, 18.627417f, 24.0f, 12.0f, 24.0f);
        path.cubicTo(5.372583f, 24.0f, 0.0f, 18.627417f, 0.0f, 12.0f);
        path.cubicTo(0.0f, 5.372583f, 5.372583f, 0.0f, 12.0f, 0.0f);
        instancePath.close();
        instancePath.moveTo(12.0f, 0.72f);
        Path path2 = instancePath;
        path2.cubicTo(5.770228f, 0.72f, 0.72f, 5.770228f, 0.72f, 12.0f);
        path2.cubicTo(0.72f, 18.229773f, 5.770228f, 23.28f, 12.0f, 23.28f);
        path2.cubicTo(18.229773f, 23.28f, 23.28f, 18.229773f, 23.28f, 12.0f);
        path2.cubicTo(23.28f, 5.770228f, 18.229773f, 0.72f, 12.0f, 0.72f);
        instancePath.close();
        instancePath.moveTo(10.2f, 7.8f);
        path2.cubicTo(10.531371f, 7.8f, 10.8f, 8.05072f, 10.8f, 8.36f);
        instancePath.lineTo(10.8f, 15.64f);
        instancePath.cubicTo(10.8f, 15.94928f, 10.531371f, 16.2f, 10.2f, 16.2f);
        instancePath.lineTo(9.0f, 16.2f);
        instancePath.cubicTo(8.668629f, 16.2f, 8.4f, 15.94928f, 8.4f, 15.64f);
        instancePath.lineTo(8.4f, 8.36f);
        Path path3 = instancePath;
        path3.cubicTo(8.4f, 8.05072f, 8.668629f, 7.8f, 9.0f, 7.8f);
        instancePath.lineTo(10.2f, 7.8f);
        instancePath.close();
        instancePath.moveTo(15.0f, 7.8f);
        path3.cubicTo(15.33137f, 7.8f, 15.6f, 8.05072f, 15.6f, 8.36f);
        instancePath.lineTo(15.6f, 15.64f);
        instancePath.cubicTo(15.6f, 15.94928f, 15.33137f, 16.2f, 15.0f, 16.2f);
        instancePath.lineTo(13.8f, 16.2f);
        Path path4 = instancePath;
        path4.cubicTo(13.468629f, 16.2f, 13.2f, 15.94928f, 13.2f, 15.64f);
        instancePath.lineTo(13.2f, 8.36f);
        path4.cubicTo(13.2f, 8.05072f, 13.468629f, 7.8f, 13.8f, 7.8f);
        instancePath.lineTo(15.0f, 7.8f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
