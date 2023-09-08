package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_blue_chatroom */
public class icons_filled_blue_chatroom extends C24542c {
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
        instancePath2.moveTo(45.33321f, 12.00534f);
        instancePath2.cubicTo(50.759956f, 12.179521f, 55.105263f, 16.592695f, 55.105263f, 22.000519f);
        instancePath2.lineTo(55.105263f, 26.275465f);
        instancePath2.cubicTo(55.105263f, 29.12324f, 53.591827f, 33.20715f, 51.74043f, 35.378933f);
        instancePath2.lineTo(50.827084f, 36.450333f);
        instancePath2.cubicTo(49.337765f, 38.197376f, 49.803f, 40.420994f, 51.885597f, 41.426277f);
        instancePath2.lineTo(66.18544f, 48.328896f);
        instancePath2.cubicTo(67.739876f, 49.07923f, 69.0f, 51.062923f, 69.0f, 52.78866f);
        instancePath2.lineTo(69.0f, 54.503906f);
        instancePath2.cubicTo(69.0f, 55.88246f, 67.86082f, 57.0f, 66.47007f, 57.0f);
        instancePath2.lineTo(64.44962f, 57.0f);
        instancePath2.cubicTo(64.08242f, 53.51807f, 61.744213f, 50.06899f, 58.630554f, 48.550186f);
        instancePath2.lineTo(42.38079f, 40.62376f);
        instancePath2.lineTo(42.94383f, 39.956337f);
        instancePath2.cubicTo(45.82947f, 36.5357f, 48.0f, 30.606369f, 48.0f, 26.130558f);
        instancePath2.lineTo(48.0f, 21.000622f);
        Path path2 = instancePath2;
        path2.cubicTo(48.0f, 17.683062f, 47.019802f, 14.593231f, 45.33321f, 12.00534f);
        instancePath2.lineTo(45.33321f, 12.00534f);
        instancePath2.close();
        instancePath2.moveTo(23.495739f, 37.050415f);
        path2.cubicTo(21.288954f, 34.434856f, 19.5f, 29.548489f, 19.5f, 26.127872f);
        instancePath2.lineTo(19.5f, 20.998741f);
        Path path3 = instancePath2;
        path3.cubicTo(19.5f, 14.37202f, 24.886068f, 9.0f, 31.5f, 9.0f);
        path3.cubicTo(38.12742f, 9.0f, 43.5f, 14.378941f, 43.5f, 21.000622f);
        instancePath2.lineTo(43.5f, 26.130558f);
        instancePath2.cubicTo(43.5f, 29.547888f, 41.702797f, 34.44858f, 39.50426f, 37.054718f);
        instancePath2.lineTo(38.419662f, 38.340397f);
        instancePath2.cubicTo(36.651096f, 40.43685f, 37.203564f, 43.105194f, 39.676647f, 44.31153f);
        instancePath2.lineTo(56.657707f, 52.594673f);
        instancePath2.cubicTo(58.503605f, 53.49508f, 60.0f, 55.87551f, 60.0f, 57.94639f);
        instancePath2.lineTo(60.0f, 60.004684f);
        instancePath2.cubicTo(60.0f, 61.65895f, 58.647224f, 63.0f, 56.995712f, 63.0f);
        instancePath2.lineTo(6.0042887f, 63.0f);
        instancePath2.cubicTo(4.345066f, 63.0f, 3.0f, 61.667267f, 3.0f, 60.004684f);
        instancePath2.lineTo(3.0f, 57.94639f);
        instancePath2.cubicTo(3.0f, 55.891125f, 4.494453f, 53.495724f, 6.342293f, 52.593998f);
        instancePath2.lineTo(23.323353f, 44.30743f);
        instancePath2.cubicTo(25.78613f, 43.10562f, 26.358778f, 40.443787f, 24.580336f, 38.33592f);
        instancePath2.lineTo(23.495739f, 37.050415f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
