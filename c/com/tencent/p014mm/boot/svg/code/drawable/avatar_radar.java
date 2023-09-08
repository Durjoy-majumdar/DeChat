package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.avatar_radar */
public class avatar_radar extends C24542c {
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
        instancePaint3.setColor(-10197008);
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
        instancePath2.moveTo(50.71693f, 17.040428f);
        Path path2 = instancePath2;
        path2.cubicTo(46.65288f, 13.881245f, 41.546135f, 12.0f, 36.0f, 12.0f);
        path2.cubicTo(22.745167f, 12.0f, 12.0f, 22.745167f, 12.0f, 36.0f);
        path2.cubicTo(12.0f, 49.254833f, 22.745167f, 60.0f, 36.0f, 60.0f);
        path2.cubicTo(49.254833f, 60.0f, 60.0f, 49.254833f, 60.0f, 36.0f);
        path2.cubicTo(60.0f, 30.453865f, 58.118755f, 25.34712f, 54.95957f, 21.283068f);
        instancePath2.lineTo(50.672245f, 25.570396f);
        Path path3 = instancePath2;
        path3.cubicTo(52.767628f, 28.512854f, 54.0f, 32.112507f, 54.0f, 36.0f);
        path3.cubicTo(54.0f, 45.941124f, 45.941124f, 54.0f, 36.0f, 54.0f);
        path3.cubicTo(26.058874f, 54.0f, 18.0f, 45.941124f, 18.0f, 36.0f);
        path3.cubicTo(18.0f, 26.058874f, 26.058874f, 18.0f, 36.0f, 18.0f);
        path3.cubicTo(39.887493f, 18.0f, 43.48715f, 19.232372f, 46.429604f, 21.327757f);
        instancePath2.lineTo(50.71693f, 17.040428f);
        instancePath2.close();
        instancePath2.moveTo(42.0959f, 25.661457f);
        path3.cubicTo(40.30936f, 24.605787f, 38.225426f, 24.0f, 36.0f, 24.0f);
        path3.cubicTo(29.372583f, 24.0f, 24.0f, 29.372583f, 24.0f, 36.0f);
        path3.cubicTo(24.0f, 42.62742f, 29.372583f, 48.0f, 36.0f, 48.0f);
        path3.cubicTo(42.62742f, 48.0f, 48.0f, 42.62742f, 48.0f, 36.0f);
        path3.cubicTo(48.0f, 33.774574f, 47.39421f, 31.690638f, 46.338543f, 29.904099f);
        instancePath2.lineTo(41.796772f, 34.44587f);
        Path path4 = instancePath2;
        path4.cubicTo(41.92933f, 34.94155f, 42.0f, 35.46252f, 42.0f, 36.0f);
        path4.cubicTo(42.0f, 39.31371f, 39.31371f, 42.0f, 36.0f, 42.0f);
        path4.cubicTo(32.68629f, 42.0f, 30.0f, 39.31371f, 30.0f, 36.0f);
        path4.cubicTo(30.0f, 32.68629f, 32.68629f, 30.0f, 36.0f, 30.0f);
        path4.cubicTo(36.53748f, 30.0f, 37.05845f, 30.070671f, 37.55413f, 30.20323f);
        instancePath2.lineTo(42.0959f, 25.661457f);
        instancePath2.close();
        instancePath2.moveTo(36.0f, 66.0f);
        Path path5 = instancePath2;
        path5.cubicTo(19.431458f, 66.0f, 6.0f, 52.568542f, 6.0f, 36.0f);
        path5.cubicTo(6.0f, 19.431458f, 19.431458f, 6.0f, 36.0f, 6.0f);
        path5.cubicTo(52.568542f, 6.0f, 66.0f, 19.431458f, 66.0f, 36.0f);
        path5.cubicTo(66.0f, 52.568542f, 52.568542f, 66.0f, 36.0f, 66.0f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
