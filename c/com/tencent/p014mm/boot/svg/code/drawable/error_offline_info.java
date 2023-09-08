package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.error_offline_info */
public class error_offline_info extends C24542c {
    private final int height = 53;
    private final int width = 53;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 53;
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
                float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 0.434783f, 0.0f, 1.0f, 0.391304f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-16896);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(52.173912f, 26.27763f);
                Path path = instancePath;
                path.cubicTo(52.173912f, 11.621121f, 40.494686f, 0.0f, 25.764894f, 0.0f);
                path.cubicTo(11.679227f, 0.0f, 0.0f, 11.621121f, 0.0f, 26.27763f);
                path.cubicTo(0.0f, 40.29322f, 11.679227f, 51.91434f, 25.764894f, 51.91434f);
                path.cubicTo(40.494686f, 51.91434f, 52.173912f, 40.29322f, 52.173912f, 26.27763f);
                instancePath.lineTo(52.173912f, 26.27763f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
                instancePaint4.setColor(-1);
                Path instancePath2 = C24542c.instancePath(looper);
                instancePath2.moveTo(23.805798f, 13.323138f);
                instancePath2.lineTo(23.805798f, 13.323138f);
                Path path2 = instancePath2;
                path2.cubicTo(23.804459f, 13.294402f, 23.80379f, 13.265638f, 23.80379f, 13.23687f);
                path2.cubicTo(23.80379f, 12.213226f, 24.633615f, 11.383399f, 25.657259f, 11.383399f);
                instancePath2.lineTo(25.657259f, 11.383399f);
                instancePath2.lineTo(27.465271f, 11.383399f);
                Path path3 = instancePath2;
                path3.cubicTo(27.494038f, 11.383399f, 27.522802f, 11.384069f, 27.551538f, 11.385408f);
                path3.cubicTo(28.574074f, 11.433053f, 29.364378f, 12.300605f, 29.316732f, 13.323138f);
                instancePath2.lineTo(29.316732f, 13.323138f);
                instancePath2.lineTo(28.500492f, 30.840899f);
                instancePath2.cubicTo(28.47699f, 31.345303f, 28.0612f, 31.74217f, 27.556248f, 31.74217f);
                instancePath2.lineTo(27.556248f, 31.74217f);
                instancePath2.lineTo(25.566282f, 31.74217f);
                Path path4 = instancePath2;
                path4.cubicTo(25.06133f, 31.74217f, 24.64554f, 31.345303f, 24.622036f, 30.840899f);
                instancePath2.lineTo(23.805798f, 13.323138f);
                instancePath2.lineTo(23.805798f, 13.323138f);
                instancePath2.close();
                instancePath2.moveTo(26.561264f, 40.790512f);
                path4.cubicTo(24.989546f, 40.790512f, 23.715414f, 39.52455f, 23.715414f, 37.962906f);
                path4.cubicTo(23.715414f, 36.401264f, 24.989546f, 35.1353f, 26.561264f, 35.1353f);
                path4.cubicTo(28.132984f, 35.1353f, 29.407114f, 36.401264f, 29.407114f, 37.962906f);
                path4.cubicTo(29.407114f, 39.52455f, 28.132984f, 40.790512f, 26.561264f, 40.790512f);
                instancePath2.lineTo(26.561264f, 40.790512f);
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
