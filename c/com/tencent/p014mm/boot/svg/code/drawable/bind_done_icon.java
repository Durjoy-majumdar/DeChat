package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.bind_done_icon */
public class bind_done_icon extends C24542c {
    private final int height = 210;
    private final int width = 210;

    public int doCommand(int i, Object... objArr) {
        int i2 = 210;
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
                C24542c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
                canvas.save();
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-15028967);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(210.0f, 106.296295f);
                Path path = instancePath;
                path.cubicTo(210.0f, 47.00889f, 162.9911f, 0.0f, 103.703705f, 0.0f);
                path.cubicTo(47.00889f, 0.0f, 0.0f, 47.00889f, 0.0f, 106.296295f);
                path.cubicTo(0.0f, 162.9911f, 47.00889f, 210.0f, 103.703705f, 210.0f);
                path.cubicTo(162.9911f, 210.0f, 210.0f, 162.9911f, 210.0f, 106.296295f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
                instancePaint4.setColor(-1);
                Path instancePath2 = C24542c.instancePath(looper);
                instancePath2.moveTo(54.281837f, 109.439514f);
                instancePath2.lineTo(58.17945f, 104.19687f);
                instancePath2.lineTo(58.17945f, 104.19687f);
                Path path2 = instancePath2;
                path2.cubicTo(58.640762f, 103.57636f, 59.51775f, 103.44731f, 60.138256f, 103.90862f);
                path2.cubicTo(60.141663f, 103.911156f, 60.145058f, 103.913704f, 60.148438f, 103.91627f);
                instancePath2.lineTo(84.99948f, 122.74494f);
                instancePath2.lineTo(84.99948f, 122.74494f);
                instancePath2.cubicTo(85.516304f, 123.13652f, 86.2344f, 123.12196f, 86.73493f, 122.709755f);
                instancePath2.lineTo(147.92569f, 72.31694f);
                instancePath2.lineTo(147.92569f, 72.31694f);
                instancePath2.cubicTo(148.47726f, 71.8627f, 149.28241f, 71.89673f, 149.79369f, 72.39588f);
                instancePath2.lineTo(153.3208f, 75.83935f);
                instancePath2.lineTo(153.3208f, 75.83935f);
                Path path3 = instancePath2;
                path3.cubicTo(153.87405f, 76.37948f, 153.8847f, 77.26585f, 153.34456f, 77.8191f);
                path3.cubicTo(153.33617f, 77.8277f, 153.32767f, 77.83619f, 153.31905f, 77.84457f);
                instancePath2.lineTo(86.880226f, 142.48117f);
                instancePath2.lineTo(86.880226f, 142.48117f);
                instancePath2.cubicTo(86.32694f, 143.01945f, 85.44236f, 143.00832f, 84.902794f, 142.4563f);
                instancePath2.lineTo(54.40418f, 111.25338f);
                instancePath2.lineTo(54.40418f, 111.25338f);
                instancePath2.cubicTo(53.922985f, 110.76107f, 53.871113f, 109.99198f, 54.281837f, 109.439514f);
                instancePath2.close();
                WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint4);
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i2;
    }
}
