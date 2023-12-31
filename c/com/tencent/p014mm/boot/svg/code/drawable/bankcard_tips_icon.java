package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.bankcard_tips_icon */
public class bankcard_tips_icon extends C24542c {
    private final int height = 51;
    private final int width = 46;

    public int doCommand(int i, Object... objArr) {
        if (i == 0) {
            return 46;
        }
        if (i == 1) {
            return 51;
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
            instancePaint3.setColor(-3881788);
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(24.0f, 3.0f);
            Path path = instancePath;
            path.cubicTo(24.89f, 0.3245459f, 29.14f, 0.33455303f, 30.0f, 3.0f);
            path.cubicTo(30.22f, 5.9885883f, 29.98f, 8.990731f, 30.0f, 12.0f);
            path.cubicTo(30.48f, 11.972859f, 31.48f, 11.972859f, 32.0f, 12.0f);
            path.cubicTo(31.99f, 9.981439f, 31.82f, 7.9700027f, 32.0f, 6.0f);
            path.cubicTo(32.82f, 3.63691f, 36.41f, 3.2466314f, 38.0f, 5.0f);
            path.cubicTo(38.37f, 7.48966f, 37.93f, 9.80131f, 38.0f, 12.0f);
            path.cubicTo(40.68f, 11.972859f, 43.34f, 11.972859f, 46.0f, 12.0f);
            instancePath.lineTo(46.0f, 39.0f);
            Path path2 = instancePath;
            path2.cubicTo(43.6f, 38.982136f, 41.2f, 38.99214f, 39.0f, 39.0f);
            path2.cubicTo(37.14f, 44.706223f, 32.34f, 49.389565f, 26.0f, 50.0f);
            instancePath.lineTo(21.0f, 50.0f);
            Path path3 = instancePath;
            path3.cubicTo(14.81f, 49.539673f, 9.88f, 44.786278f, 8.0f, 39.0f);
            path3.cubicTo(5.46f, 38.99214f, 2.73f, 38.99214f, 0.0f, 39.0f);
            instancePath.lineTo(0.0f, 12.0f);
            Path path4 = instancePath;
            path4.cubicTo(2.63f, 11.972859f, 5.25f, 11.972859f, 8.0f, 12.0f);
            path4.cubicTo(7.87f, 9.691231f, 7.81f, 5.8584957f, 11.0f, 6.0f);
            path4.cubicTo(14.22f, 5.968574f, 14.09f, 9.731259f, 14.0f, 12.0f);
            path4.cubicTo(14.6f, 11.972859f, 15.54f, 11.972859f, 16.0f, 12.0f);
            path4.cubicTo(16.0f, 9.320967f, 15.79f, 6.639053f, 16.0f, 4.0f);
            path4.cubicTo(16.88f, 1.3352673f, 21.13f, 1.3352673f, 22.0f, 4.0f);
            path4.cubicTo(22.21f, 6.64906f, 22.0f, 9.320967f, 22.0f, 12.0f);
            path4.cubicTo(22.5f, 11.972859f, 23.51f, 11.972859f, 24.0f, 12.0f);
            path4.cubicTo(24.02f, 8.980724f, 23.77f, 5.968574f, 24.0f, 3.0f);
            instancePath.lineTo(24.0f, 3.0f);
            instancePath.close();
            instancePath.moveTo(5.0f, 34.0f);
            path4.cubicTo(12.38f, 33.93302f, 19.77f, 34.072884f, 27.0f, 34.0f);
            path4.cubicTo(33.0f, 34.0f, 32.56548f, 25.699202f, 32.99548f, 22.046875f);
            path4.cubicTo(33.340767f, 19.0f, 36.95f, 18.938057f, 39.0f, 19.0f);
            path4.cubicTo(39.01f, 23.75323f, 39.0f, 28.868101f, 39.0f, 34.0f);
            path4.cubicTo(39.75f, 33.98297f, 41.25f, 33.98297f, 42.0f, 34.0f);
            instancePath.lineTo(42.0f, 17.0f);
            instancePath.lineTo(5.0f, 17.0f);
            instancePath.lineTo(5.0f, 34.0f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 2);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
