package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.float_ball_state_appbrand_bluetooth */
public class float_ball_state_appbrand_bluetooth extends C24542c {
    private final int height = 24;
    private final int width = 24;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 24;
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
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(0.0f, 0.0f);
                instancePath.lineTo(24.0f, 0.0f);
                instancePath.lineTo(24.0f, 24.0f);
                instancePath.lineTo(0.0f, 24.0f);
                instancePath.lineTo(0.0f, 0.0f);
                instancePath.close();
                canvas.save();
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-16268960);
                float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 3.0f, 0.0f, 1.0f, 3.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath2 = C24542c.instancePath(looper);
                instancePath2.moveTo(8.889356f, 1.4676479f);
                instancePath2.lineTo(12.712133f, 5.287867f);
                Path path = instancePath2;
                path.cubicTo(13.005328f, 5.5804577f, 13.005487f, 6.0553317f, 12.712692f, 6.348323f);
                path.cubicTo(12.712625f, 6.348391f, 12.712556f, 6.348459f, 12.712284f, 6.348323f);
                instancePath2.lineTo(10.060529f, 8.99981f);
                instancePath2.lineTo(10.060529f, 8.99981f);
                instancePath2.lineTo(12.712316f, 11.651646f);
                instancePath2.cubicTo(13.005169f, 11.944557f, 13.005177f, 12.419411f, 12.712333f, 12.712333f);
                instancePath2.lineTo(8.889455f, 16.535522f);
                Path path2 = instancePath2;
                path2.cubicTo(8.743014f, 16.681974f, 8.505578f, 16.681984f, 8.359125f, 16.535543f);
                path2.cubicTo(8.288793f, 16.465216f, 8.249279f, 16.36983f, 8.249279f, 16.270367f);
                instancePath2.lineTo(8.249279f, 10.811061f);
                instancePath2.lineTo(8.249279f, 10.811061f);
                instancePath2.lineTo(5.287689f, 13.772971f);
                instancePath2.lineTo(4.2270293f, 12.712311f);
                instancePath2.lineTo(7.9387794f, 8.99981f);
                instancePath2.lineTo(4.2270293f, 5.287689f);
                instancePath2.lineTo(5.287689f, 4.2270293f);
                instancePath2.lineTo(8.249279f, 7.1885605f);
                instancePath2.lineTo(8.249279f, 1.7329017f);
                Path path3 = instancePath2;
                path3.cubicTo(8.249279f, 1.5257949f, 8.417172f, 1.3579017f, 8.624279f, 1.3579017f);
                path3.cubicTo(8.723692f, 1.3579017f, 8.8190365f, 1.3973761f, 8.889356f, 1.4676479f);
                instancePath2.close();
                instancePath2.moveTo(9.749279f, 10.81031f);
                instancePath2.lineTo(9.749279f, 13.554561f);
                instancePath2.lineTo(11.121779f, 12.18206f);
                instancePath2.lineTo(9.749279f, 10.81031f);
                instancePath2.close();
                instancePath2.moveTo(9.749279f, 4.4488106f);
                instancePath2.lineTo(9.749279f, 7.1893106f);
                instancePath2.lineTo(11.119529f, 5.819061f);
                instancePath2.lineTo(9.749279f, 4.4488106f);
                instancePath2.close();
                WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint4);
                canvas.restore();
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i3;
    }
}
