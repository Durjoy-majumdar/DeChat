package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.ofm_moment_icon */
public class ofm_moment_icon extends C24542c {
    private final int height = 96;
    private final int width = 96;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 96;
        if (!(i2 == 0 || i2 == 1)) {
            i3 = 0;
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
                instancePaint3.setColor(-1);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(47.999f, 33.0f);
                instancePath.cubicTo(48.731f, 33.0f, 49.446f, 33.07f, 50.15f, 33.172f);
                instancePath.lineTo(35.518f, 18.54f);
                instancePath.cubicTo(28.743f, 21.415f, 23.158f, 26.549f, 19.726f, 33.009f);
                instancePath.lineTo(47.836f, 33.009f);
                instancePath.cubicTo(47.892f, 33.009f, 47.944f, 33.0f, 47.999f, 33.0f);
                instancePath.lineTo(47.999f, 33.0f);
                instancePath.close();
                instancePath.moveTo(62.999f, 19.75f);
                instancePath.lineTo(62.999f, 48.0f);
                instancePath.cubicTo(62.999f, 48.715f, 62.932f, 49.413f, 62.835f, 50.101f);
                instancePath.lineTo(77.455f, 35.48f);
                Path path = instancePath;
                path.cubicTo(74.58f, 28.725f, 69.44f, 23.178f, 62.999f, 19.75f);
                instancePath.lineTo(62.999f, 19.75f);
                instancePath.close();
                instancePath.moveTo(58.624f, 37.414f);
                path.cubicTo(59.124f, 37.915f, 59.574f, 38.462f, 59.999f, 39.029f);
                instancePath.lineTo(59.999f, 18.337f);
                Path path2 = instancePath;
                path2.cubicTo(56.292f, 16.836f, 52.245f, 16.0f, 47.999f, 16.0f);
                path2.cubicTo(44.737f, 16.0f, 41.595f, 16.501f, 38.63f, 17.409f);
                instancePath.lineTo(58.63f, 37.409f);
                instancePath.lineTo(58.624f, 37.414f);
                instancePath.lineTo(58.624f, 37.414f);
                instancePath.close();
                instancePath.moveTo(39.023f, 36.009f);
                instancePath.lineTo(18.331f, 36.009f);
                Path path3 = instancePath;
                path3.cubicTo(16.832f, 39.713f, 16.0f, 43.758f, 16.0f, 48.0f);
                path3.cubicTo(16.0f, 51.279f, 16.507f, 54.437f, 17.424f, 57.416f);
                instancePath.lineTo(36.871f, 37.969f);
                Path path4 = instancePath;
                path4.cubicTo(37.521f, 37.247f, 38.245f, 36.594f, 39.023f, 36.009f);
                instancePath.lineTo(39.023f, 36.009f);
                instancePath.close();
                instancePath.moveTo(32.999f, 76.267f);
                instancePath.lineTo(32.999f, 47.999f);
                path4.cubicTo(32.999f, 47.292f, 33.065f, 46.602f, 33.16f, 45.921f);
                instancePath.lineTo(18.557f, 60.524f);
                instancePath.cubicTo(21.435f, 67.277f, 26.558f, 72.842f, 32.999f, 76.267f);
                instancePath.lineTo(32.999f, 76.267f);
                instancePath.close();
                instancePath.moveTo(35.999f, 56.976f);
                instancePath.lineTo(35.999f, 77.664f);
                Path path5 = instancePath;
                path5.cubicTo(39.706f, 79.165f, 43.754f, 79.999f, 47.999f, 79.999f);
                path5.cubicTo(51.291f, 79.999f, 54.459f, 79.488f, 57.447f, 78.564f);
                instancePath.lineTo(38.434f, 59.552f);
                instancePath.cubicTo(37.521f, 58.797f, 36.711f, 57.926f, 35.999f, 56.976f);
                instancePath.lineTo(35.999f, 56.976f);
                instancePath.close();
                instancePath.moveTo(78.59f, 38.589f);
                instancePath.lineTo(58.948f, 58.231f);
                instancePath.cubicTo(58.341f, 58.88f, 57.669f, 59.466f, 56.957f, 60.001f);
                instancePath.lineTo(77.665f, 60.001f);
                Path path6 = instancePath;
                path6.cubicTo(79.166f, 56.294f, 80.0f, 52.246f, 80.0f, 48.001f);
                path6.cubicTo(79.999f, 44.724f, 79.505f, 41.564f, 78.59f, 38.589f);
                instancePath.lineTo(78.59f, 38.589f);
                instancePath.close();
                instancePath.moveTo(45.971f, 62.847f);
                instancePath.lineTo(60.554f, 77.43f);
                instancePath.cubicTo(67.293f, 74.55f, 72.846f, 69.431f, 76.267f, 63.0f);
                instancePath.lineTo(47.999f, 63.0f);
                instancePath.cubicTo(47.31f, 63.0f, 46.636f, 62.937f, 45.971f, 62.847f);
                instancePath.lineTo(45.971f, 62.847f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i3;
    }
}
