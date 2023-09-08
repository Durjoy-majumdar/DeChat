package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.lqt_detail_play_icon */
public class lqt_detail_play_icon extends C24542c {
    private final int height = 40;
    private final int width = 40;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 40;
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
            canvas.save();
            Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(637534208);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(20.0f, 0.0f);
            Path path = instancePath;
            path.cubicTo(31.045696f, 0.0f, 40.0f, 8.954305f, 40.0f, 20.0f);
            path.cubicTo(40.0f, 31.045696f, 31.045696f, 40.0f, 20.0f, 40.0f);
            path.cubicTo(8.954305f, 40.0f, 0.0f, 31.045696f, 0.0f, 20.0f);
            path.cubicTo(0.0f, 8.954305f, 8.954305f, 0.0f, 20.0f, 0.0f);
            instancePath.close();
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
            instancePaint4.setColor(-1);
            Path instancePath2 = C24542c.instancePath(looper);
            instancePath2.moveTo(20.0f, 0.0f);
            Path path2 = instancePath2;
            path2.cubicTo(31.045694f, 0.0f, 40.0f, 8.954305f, 40.0f, 20.0f);
            path2.cubicTo(40.0f, 31.045694f, 31.045694f, 40.0f, 20.0f, 40.0f);
            path2.cubicTo(8.954305f, 40.0f, 0.0f, 31.045694f, 0.0f, 20.0f);
            path2.cubicTo(0.0f, 8.954305f, 8.954305f, 0.0f, 20.0f, 0.0f);
            instancePath2.close();
            instancePath2.moveTo(20.0f, 1.2f);
            Path path3 = instancePath2;
            path3.cubicTo(9.617046f, 1.2f, 1.2f, 9.617046f, 1.2f, 20.0f);
            path3.cubicTo(1.2f, 30.382954f, 9.617046f, 38.8f, 20.0f, 38.8f);
            path3.cubicTo(30.382954f, 38.8f, 38.8f, 30.382954f, 38.8f, 20.0f);
            path3.cubicTo(38.8f, 9.617046f, 30.382954f, 1.2f, 20.0f, 1.2f);
            instancePath2.close();
            instancePath2.moveTo(16.0f, 12.72318f);
            instancePath2.cubicTo(16.174026f, 12.72318f, 16.345041f, 12.768595f, 16.49614f, 12.854937f);
            instancePath2.lineTo(27.480574f, 19.131758f);
            Path path4 = instancePath2;
            path4.cubicTo(27.960093f, 19.405767f, 28.126688f, 20.01662f, 27.852678f, 20.49614f);
            path4.cubicTo(27.76409f, 20.65117f, 27.635605f, 20.779654f, 27.480574f, 20.868242f);
            instancePath2.lineTo(16.49614f, 27.145063f);
            Path path5 = instancePath2;
            path5.cubicTo(16.01662f, 27.419073f, 15.4057665f, 27.252478f, 15.131757f, 26.772959f);
            path5.cubicTo(15.045415f, 26.621862f, 15.0f, 26.450848f, 15.0f, 26.276821f);
            instancePath2.lineTo(15.0f, 13.72318f);
            instancePath2.cubicTo(15.0f, 13.170895f, 15.447716f, 12.72318f, 16.0f, 12.72318f);
            instancePath2.close();
            WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
            canvas.drawPath(instancePath2, instancePaint4);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
