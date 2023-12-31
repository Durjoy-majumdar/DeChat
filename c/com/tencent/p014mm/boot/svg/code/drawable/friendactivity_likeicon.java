package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.friendactivity_likeicon */
public class friendactivity_likeicon extends C24542c {
    private final int height = 36;
    private final int width = 40;

    public int doCommand(int i, Object... objArr) {
        if (i == 0) {
            return 40;
        }
        if (i == 1) {
            return 36;
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
            canvas.save();
            Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-11048043);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(6.223777f, 2.4243011f);
            Path path = instancePath;
            path.cubicTo(10.598335f, -0.4037837f, 16.69516f, 1.2488136f, 20.001913f, 5.0172887f);
            path.cubicTo(22.709318f, 1.97485f, 26.97365f, 0.38448447f, 30.996866f, 1.2349844f);
            path.cubicTo(33.95228f, 1.8296428f, 36.28078f, 4.2635937f, 37.23836f, 7.070935f);
            path.cubicTo(38.643734f, 11.081422f, 38.023716f, 15.610507f, 36.039665f, 19.31675f);
            path.cubicTo(32.52624f, 26.065432f, 26.649864f, 31.368956f, 20.001913f, 34.923077f);
            path.cubicTo(12.603054f, 30.926418f, 5.9619923f, 24.76548f, 2.8756897f, 16.785994f);
            path.cubicTo(1.1740899f, 11.966495f, 1.7803279f, 5.5635448f, 6.223777f, 2.4243011f);
            instancePath.lineTo(6.223777f, 2.4243011f);
            instancePath.lineTo(6.223777f, 2.4243011f);
            instancePath.close();
            instancePath.moveTo(6.579045f, 8.803145f);
            path.cubicTo(5.6772685f, 12.076567f, 6.2279716f, 15.709856f, 8.059059f, 18.561125f);
            path.cubicTo(11.005321f, 23.336306f, 15.466016f, 26.921152f, 20.002432f, 30.076923f);
            path.cubicTo(23.50628f, 27.668571f, 26.858686f, 24.983397f, 29.639736f, 21.744577f);
            path.cubicTo(31.945807f, 19.045563f, 33.942104f, 15.744459f, 33.831963f, 12.062725f);
            path.cubicTo(33.983406f, 9.391392f, 32.937073f, 6.0210834f, 29.997694f, 5.391313f);
            path.cubicTo(25.970676f, 4.1871367f, 22.94181f, 7.848109f, 20.002432f, 9.965798f);
            path.cubicTo(17.118126f, 7.9173145f, 14.22005f, 4.3324685f, 10.282523f, 5.3359485f);
            path.cubicTo(8.478971f, 5.619691f, 7.0746775f, 7.0799274f, 6.579045f, 8.803145f);
            instancePath.lineTo(6.579045f, 8.803145f);
            instancePath.lineTo(6.579045f, 8.803145f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 2);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
