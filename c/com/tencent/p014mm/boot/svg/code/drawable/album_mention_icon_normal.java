package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.album_mention_icon_normal */
public class album_mention_icon_normal extends C24542c {
    private final int height = 72;
    private final int width = 72;

    public int doCommand(int i, Object... objArr) {
        if (i == 0 || i == 1) {
            return 72;
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
            canvas.save();
            Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(33.808594f, 24.5625f);
            Path path = instancePath;
            path.cubicTo(28.710938f, 24.5625f, 25.40625f, 28.886719f, 25.40625f, 35.53125f);
            path.cubicTo(25.40625f, 42.140625f, 28.675781f, 46.429688f, 33.773438f, 46.429688f);
            path.cubicTo(38.976562f, 46.429688f, 42.316406f, 42.070312f, 42.316406f, 35.35547f);
            path.cubicTo(42.316406f, 28.746094f, 39.046875f, 24.5625f, 33.808594f, 24.5625f);
            instancePath.close();
            instancePath.moveTo(34.933594f, 6.0f);
            path.cubicTo(50.339844f, 6.0f, 63.058594f, 16.582031f, 63.058594f, 32.15625f);
            path.cubicTo(63.058594f, 43.335938f, 58.41797f, 50.507812f, 50.683594f, 50.507812f);
            path.cubicTo(46.5f, 50.507812f, 43.195312f, 47.976562f, 42.66797f, 44.039062f);
            instancePath.lineTo(42.421875f, 44.039062f);
            Path path2 = instancePath;
            path2.cubicTo(40.839844f, 48.046875f, 37.570312f, 50.26172f, 33.210938f, 50.26172f);
            path2.cubicTo(25.96875f, 50.26172f, 21.046875f, 44.285156f, 21.046875f, 35.42578f);
            path2.cubicTo(21.046875f, 26.777344f, 26.039062f, 20.800781f, 33.210938f, 20.800781f);
            path2.cubicTo(37.289062f, 20.800781f, 40.839844f, 23.015625f, 42.140625f, 26.460938f);
            instancePath.lineTo(42.38672f, 26.460938f);
            instancePath.lineTo(42.38672f, 21.503906f);
            instancePath.lineTo(46.464844f, 21.503906f);
            instancePath.lineTo(46.464844f, 41.61328f);
            Path path3 = instancePath;
            path3.cubicTo(46.464844f, 44.8125f, 48.152344f, 46.921875f, 51.351562f, 46.921875f);
            path3.cubicTo(56.027344f, 46.921875f, 59.226562f, 41.54297f, 59.226562f, 32.085938f);
            path3.cubicTo(59.226562f, 18.65625f, 48.714844f, 9.527344f, 34.933594f, 9.527344f);
            path3.cubicTo(21.152344f, 9.527344f, 9.867188f, 19.578125f, 9.867188f, 35.320312f);
            path3.cubicTo(9.867188f, 49.945312f, 21.910156f, 61.089844f, 35.320312f, 61.089844f);
            path3.cubicTo(40.066406f, 61.089844f, 44.601562f, 60.492188f, 46.992188f, 59.54297f);
            instancePath.lineTo(46.992188f, 63.023438f);
            Path path4 = instancePath;
            path4.cubicTo(44.14453f, 64.00781f, 39.996094f, 64.57031f, 35.285156f, 64.57031f);
            path4.cubicTo(18.59375f, 64.57031f, 6.0f, 51.976562f, 6.0f, 35.179688f);
            path4.cubicTo(6.0f, 18.382812f, 19.527344f, 6.0f, 34.933594f, 6.0f);
            instancePath.close();
            instancePath.moveTo(34.933594f, 6.0f);
            WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
