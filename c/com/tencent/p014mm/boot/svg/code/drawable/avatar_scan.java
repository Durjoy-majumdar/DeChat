package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.avatar_scan */
public class avatar_scan extends C24542c {
    private final int height = 120;
    private final int width = 120;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 120;
        }
        if (i2 != 2) {
            return 0;
        }
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
        instancePaint3.setColor(-15432210);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(0.0f, 12.0f);
        Path path = instancePath;
        path.cubicTo(0.0f, 5.3725824f, 5.3725824f, 0.0f, 12.0f, 0.0f);
        instancePath.lineTo(108.0f, 0.0f);
        path.cubicTo(114.62742f, 0.0f, 120.0f, 5.3725824f, 120.0f, 12.0f);
        instancePath.lineTo(120.0f, 108.0f);
        Matrix matrix = instanceMatrix;
        path.cubicTo(120.0f, 114.62742f, 114.62742f, 120.0f, 108.0f, 120.0f);
        instancePath.lineTo(12.0f, 120.0f);
        path.cubicTo(5.3725824f, 120.0f, 0.0f, 114.62742f, 0.0f, 108.0f);
        instancePath.lineTo(0.0f, 12.0f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-1);
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 24.0f, 0.0f, 1.0f, 24.0f, 0.0f, 0.0f, 1.0f);
        matrix.reset();
        Matrix matrix2 = matrix;
        matrix2.setValues(matrixFloatArray);
        canvas.concat(matrix2);
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint4, looper);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(35.78873f, 51.0f);
        instancePath2.lineTo(24.0f, 51.0f);
        Path path2 = instancePath2;
        path2.cubicTo(22.343145f, 51.0f, 21.0f, 49.656853f, 21.0f, 48.0f);
        path2.cubicTo(21.0f, 46.343147f, 22.343145f, 45.0f, 24.0f, 45.0f);
        instancePath2.lineTo(52.90141f, 45.0f);
        instancePath2.cubicTo(54.59155f, 45.0f, 56.070423f, 43.94366f, 56.28169f, 42.25352f);
        instancePath2.lineTo(56.28169f, 41.619717f);
        instancePath2.lineTo(56.28169f, 36.338028f);
        Path path3 = instancePath2;
        path3.cubicTo(56.28169f, 34.64789f, 56.915493f, 32.957745f, 58.183098f, 31.690142f);
        path3.cubicTo(58.816902f, 30.84507f, 60.084507f, 30.0f, 61.140846f, 30.0f);
        path3.cubicTo(62.619717f, 30.0f, 63.676056f, 31.267605f, 63.46479f, 32.74648f);
        path3.cubicTo(63.46479f, 32.74648f, 63.25352f, 34.859154f, 63.25352f, 35.915493f);
        path3.cubicTo(63.25352f, 38.239437f, 63.46479f, 40.774647f, 64.098595f, 43.09859f);
        path3.cubicTo(64.30986f, 43.94366f, 64.521126f, 44.577465f, 64.73239f, 45.21127f);
        path3.cubicTo(65.57746f, 47.957745f, 66.0f, 50.704224f, 66.0f, 53.661972f);
        instancePath2.lineTo(66.0f, 55.985916f);
        Path path4 = instancePath2;
        path4.cubicTo(65.788734f, 57.887325f, 64.943665f, 59.78873f, 63.887325f, 61.267605f);
        path4.cubicTo(61.985916f, 64.014084f, 58.816902f, 65.70422f, 55.225353f, 66.0f);
        instancePath2.lineTo(49.732395f, 66.0f);
        Path path5 = instancePath2;
        path5.cubicTo(46.56338f, 65.91549f, 43.605633f, 64.43662f, 41.492958f, 62.323944f);
        path5.cubicTo(41.070423f, 61.90141f, 40.64789f, 61.267605f, 40.225353f, 60.633804f);
        path5.cubicTo(38.112675f, 58.09859f, 36.633804f, 54.929577f, 35.78873f, 51.0f);
        instancePath2.close();
        instancePath2.moveTo(36.21127f, 21.0f);
        instancePath2.lineTo(48.0f, 21.0f);
        Path path6 = instancePath2;
        path6.cubicTo(49.656853f, 21.0f, 51.0f, 22.343145f, 51.0f, 24.0f);
        path6.cubicTo(51.0f, 25.656855f, 49.656853f, 27.0f, 48.0f, 27.0f);
        instancePath2.lineTo(19.09859f, 27.0f);
        instancePath2.cubicTo(17.408451f, 27.0f, 15.929578f, 28.056337f, 15.71831f, 29.746479f);
        instancePath2.lineTo(15.71831f, 30.380281f);
        instancePath2.lineTo(15.71831f, 35.661972f);
        Path path7 = instancePath2;
        path7.cubicTo(15.71831f, 37.35211f, 15.084507f, 39.042255f, 13.816901f, 40.30986f);
        path7.cubicTo(13.183099f, 41.15493f, 11.915493f, 42.0f, 10.859155f, 42.0f);
        path7.cubicTo(9.380281f, 42.0f, 8.323944f, 40.732395f, 8.535212f, 39.25352f);
        path7.cubicTo(8.535212f, 39.25352f, 8.746479f, 37.140846f, 8.746479f, 36.084507f);
        path7.cubicTo(8.746479f, 33.760563f, 8.535212f, 31.225351f, 7.9014087f, 28.90141f);
        path7.cubicTo(7.6901407f, 28.056337f, 7.4788733f, 27.422535f, 7.267606f, 26.788733f);
        path7.cubicTo(6.4225354f, 24.042253f, 6.0f, 21.295774f, 6.0f, 18.338028f);
        instancePath2.lineTo(6.0f, 16.014084f);
        Path path8 = instancePath2;
        path8.cubicTo(6.2112675f, 14.112676f, 7.056338f, 12.211267f, 8.112676f, 10.732394f);
        path8.cubicTo(10.014085f, 7.9859157f, 13.183099f, 6.2957745f, 16.774649f, 6.0f);
        instancePath2.lineTo(22.267605f, 6.0f);
        Path path9 = instancePath2;
        path9.cubicTo(25.436619f, 6.084507f, 28.394365f, 7.5633802f, 30.507042f, 9.676056f);
        path9.cubicTo(30.929577f, 10.098592f, 31.352112f, 10.732394f, 31.774649f, 11.366198f);
        path9.cubicTo(33.887325f, 13.901408f, 35.366196f, 17.070423f, 36.21127f, 21.0f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
