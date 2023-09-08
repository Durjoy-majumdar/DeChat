package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.fav_note_toolbar_voice */
public class fav_note_toolbar_voice extends C24542c {
    private final int height = 72;
    private final int width = 72;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 72;
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
            instancePaint3.setColor(-16777216);
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(26.1f, 19.5f);
            instancePath.lineTo(26.1f, 37.5f);
            Path path = instancePath;
            path.cubicTo(26.1f, 42.96762f, 30.532381f, 47.4f, 36.0f, 47.4f);
            path.cubicTo(41.46762f, 47.4f, 45.9f, 42.96762f, 45.9f, 37.5f);
            instancePath.lineTo(45.9f, 19.5f);
            Path path2 = instancePath;
            path2.cubicTo(45.9f, 14.032381f, 41.46762f, 9.6f, 36.0f, 9.6f);
            path2.cubicTo(30.532381f, 9.6f, 26.1f, 14.032381f, 26.1f, 19.5f);
            instancePath.close();
            instancePath.moveTo(37.8f, 59.92905f);
            instancePath.lineTo(37.8f, 69.0f);
            instancePath.lineTo(34.2f, 69.0f);
            instancePath.lineTo(34.2f, 59.929047f);
            instancePath.cubicTo(22.615196f, 59.012062f, 13.5f, 49.320515f, 13.5f, 37.5f);
            instancePath.lineTo(13.5f, 33.0f);
            instancePath.lineTo(17.1f, 33.0f);
            instancePath.lineTo(17.1f, 37.5f);
            Path path3 = instancePath;
            path3.cubicTo(17.1f, 47.938183f, 25.56182f, 56.4f, 36.0f, 56.4f);
            path3.cubicTo(46.438183f, 56.4f, 54.9f, 47.938183f, 54.9f, 37.5f);
            instancePath.lineTo(54.9f, 33.0f);
            instancePath.lineTo(58.5f, 33.0f);
            instancePath.lineTo(58.5f, 37.5f);
            Path path4 = instancePath;
            path4.cubicTo(58.5f, 49.320515f, 49.384804f, 59.012062f, 37.8f, 59.92905f);
            instancePath.close();
            instancePath.moveTo(22.5f, 19.5f);
            path4.cubicTo(22.5f, 12.044156f, 28.544155f, 6.0f, 36.0f, 6.0f);
            path4.cubicTo(43.455845f, 6.0f, 49.5f, 12.044156f, 49.5f, 19.5f);
            instancePath.lineTo(49.5f, 37.5f);
            Path path5 = instancePath;
            path5.cubicTo(49.5f, 44.955845f, 43.455845f, 51.0f, 36.0f, 51.0f);
            path5.cubicTo(28.544155f, 51.0f, 22.5f, 44.955845f, 22.5f, 37.5f);
            instancePath.lineTo(22.5f, 19.5f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
