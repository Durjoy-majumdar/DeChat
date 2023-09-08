package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.image_gallery_image_download_done_icon */
public class image_gallery_image_download_done_icon extends C24542c {
    private final int height = 48;
    private final int width = 48;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 48;
        if (!(i2 == 0 || i2 == 1)) {
            i3 = 0;
            if (i2 == 2) {
                Canvas canvas = objArr[0];
                Looper looper = objArr[1];
                Matrix instanceMatrix = C24542c.instanceMatrix(looper);
                float[] instanceMatrixArray = C24542c.instanceMatrixArray(looper);
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
                instancePaint3.setColor(-65794);
                float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 3.0f, 0.0f, 1.0f, 9.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(38.485332f, 0.0f);
                Path path = instancePath;
                path.cubicTo(39.240726f, 0.101668164f, 39.99612f, 0.20333633f, 40.751514f, 0.30500448f);
                path.cubicTo(40.83103f, 1.0878494f, 40.920486f, 1.8706942f, 41.0f, 2.653539f);
                path.cubicTo(39.270546f, 3.4770513f, 38.048f, 4.98174f, 36.736f, 6.3339267f);
                path.cubicTo(29.221819f, 14.182709f, 21.498909f, 21.817987f, 14.094061f, 29.768438f);
                path.cubicTo(11.698667f, 30.886787f, 10.595394f, 27.65374f, 9.02497f, 26.47439f);
                path.cubicTo(5.953697f, 23.678514f, 3.4986668f, 20.130297f, 0.0f, 17.88343f);
                path.cubicTo(0.09939394f, 17.141253f, 0.20872727f, 16.40924f, 0.3180606f, 15.677231f);
                path.cubicTo(1.0635152f, 15.58573f, 1.7990303f, 15.494228f, 2.5345454f, 15.402727f);
                path.cubicTo(4.6317577f, 18.666275f, 8.011151f, 20.76064f, 10.158061f, 23.973352f);
                path.cubicTo(11.002909f, 26.037216f, 14.004606f, 26.545557f, 15.266909f, 24.634195f);
                path.cubicTo(20.554667f, 18.564606f, 26.438787f, 13.074526f, 31.965092f, 7.2387733f);
                path.cubicTo(34.131878f, 4.819071f, 36.875153f, 2.8873758f, 38.485332f, 0.0f);
                instancePath.lineTo(38.485332f, 0.0f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i3;
    }
}
