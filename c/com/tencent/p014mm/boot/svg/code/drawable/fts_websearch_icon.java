package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.fts_websearch_icon */
public class fts_websearch_icon extends C24542c {
    private final int height = 20;
    private final int width = 20;

    public int doCommand(int i, Object... objArr) {
        int i2 = 20;
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
                instancePaint3.setColor(-47546);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(9.50746f, 6.50746f);
                instancePath.lineTo(10.6716f, 4.08955f);
                Path path = instancePath;
                path.cubicTo(10.806f, 3.79851f, 10.806f, 3.50746f, 10.694f, 3.23881f);
                path.cubicTo(10.5821f, 2.97015f, 10.3582f, 2.76866f, 10.0448f, 2.65672f);
                instancePath.lineTo(9.79851f, 2.56716f);
                Path path2 = instancePath;
                path2.cubicTo(9.68657f, 2.52239f, 9.57463f, 2.5f, 9.46269f, 2.5f);
                path2.cubicTo(8.97015f, 2.5f, 8.56716f, 2.83582f, 8.45522f, 3.32836f);
                instancePath.lineTo(7.9403f, 5.94776f);
                Path path3 = instancePath;
                path3.cubicTo(7.80597f, 6.57463f, 8.00746f, 7.15672f, 8.36567f, 7.29104f);
                path3.cubicTo(8.41045f, 7.31343f, 8.45522f, 7.31343f, 8.52239f, 7.31343f);
                path3.cubicTo(8.85821f, 7.33582f, 9.26119f, 7.0f, 9.50746f, 6.50746f);
                instancePath.close();
                instancePath.moveTo(6.75373f, 8.20896f);
                instancePath.cubicTo(6.79851f, 7.82836f, 6.32836f, 7.42537f, 5.70149f, 7.29104f);
                instancePath.lineTo(3.77612f, 6.8209f);
                Path path4 = instancePath;
                path4.cubicTo(3.68657f, 6.79851f, 3.59701f, 6.79851f, 3.50746f, 6.79851f);
                path4.cubicTo(2.99254f, 6.79851f, 2.56716f, 7.1791f, 2.52239f, 7.69403f);
                instancePath.lineTo(2.5f, 7.96269f);
                Path path5 = instancePath;
                path5.cubicTo(2.5f, 8.27612f, 2.61194f, 8.56716f, 2.81343f, 8.76866f);
                path5.cubicTo(2.99254f, 8.94776f, 3.23881f, 9.03731f, 3.50746f, 9.03731f);
                path5.cubicTo(3.52985f, 9.03731f, 3.55224f, 9.03731f, 3.57463f, 9.03731f);
                instancePath.lineTo(5.54478f, 8.94776f);
                instancePath.cubicTo(6.19403f, 8.8806f, 6.70895f, 8.56716f, 6.75373f, 8.20896f);
                instancePath.close();
                instancePath.moveTo(7.20149f, 10.1567f);
                instancePath.cubicTo(6.8209f, 10.0448f, 6.30597f, 10.403f, 6.0597f, 10.9851f);
                instancePath.lineTo(4.1791f, 15.1045f);
                Path path6 = instancePath;
                path6.cubicTo(4.04478f, 15.3955f, 4.04478f, 15.6866f, 4.1791f, 15.9552f);
                path6.cubicTo(4.31343f, 16.2239f, 4.53731f, 16.4254f, 4.85075f, 16.5149f);
                instancePath.lineTo(5.09701f, 16.6045f);
                instancePath.lineTo(5.1194f, 16.6045f);
                Path path7 = instancePath;
                path7.cubicTo(5.16418f, 16.6045f, 5.20896f, 16.6045f, 5.25373f, 16.6045f);
                path7.cubicTo(5.79104f, 16.6045f, 6.39552f, 16.3582f, 6.52985f, 15.8433f);
                instancePath.lineTo(7.62687f, 11.4552f);
                Path path8 = instancePath;
                path8.cubicTo(7.73881f, 10.8507f, 7.58209f, 10.2687f, 7.20149f, 10.1567f);
                instancePath.close();
                instancePath.moveTo(10.4925f, 10.6493f);
                path8.cubicTo(10.2015f, 10.3358f, 9.8209f, 10.1343f, 9.50746f, 10.1343f);
                path8.cubicTo(9.37313f, 10.1343f, 9.26119f, 10.1791f, 9.17164f, 10.2463f);
                path8.cubicTo(8.8806f, 10.4925f, 8.92537f, 11.097f, 9.30597f, 11.6343f);
                instancePath.lineTo(12.8657f, 16.8284f);
                Path path9 = instancePath;
                path9.cubicTo(13.0672f, 17.1418f, 13.403f, 17.2985f, 13.7388f, 17.2985f);
                path9.cubicTo(13.9851f, 17.2985f, 14.2313f, 17.209f, 14.4328f, 17.0522f);
                instancePath.lineTo(14.6343f, 16.8955f);
                Path path10 = instancePath;
                path10.cubicTo(14.8806f, 16.694f, 15.0149f, 16.4254f, 15.0373f, 16.1119f);
                path10.cubicTo(15.0597f, 15.7985f, 14.9478f, 15.5075f, 14.7463f, 15.2836f);
                instancePath.lineTo(10.4925f, 10.6493f);
                instancePath.close();
                instancePath.moveTo(17.4776f, 8.02985f);
                path10.cubicTo(17.4328f, 7.3806f, 16.8955f, 6.91045f, 16.2463f, 7.0f);
                instancePath.lineTo(10.9627f, 7.78358f);
                Path path11 = instancePath;
                path11.cubicTo(10.3358f, 7.87313f, 9.84328f, 8.25373f, 9.86567f, 8.65672f);
                path11.cubicTo(9.88806f, 9.0597f, 10.403f, 9.37313f, 11.0522f, 9.37313f);
                instancePath.lineTo(16.2687f, 9.4403f);
                instancePath.lineTo(16.291f, 9.4403f);
                Path path12 = instancePath;
                path12.cubicTo(16.6269f, 9.4403f, 16.9627f, 9.28358f, 17.209f, 9.03731f);
                path12.cubicTo(17.4104f, 8.81343f, 17.5f, 8.54478f, 17.5f, 8.27612f);
                instancePath.lineTo(17.4776f, 8.02985f);
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
