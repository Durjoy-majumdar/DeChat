package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.card_video_play */
public class card_video_play extends C24542c {
    private final int height = 69;
    private final int width = 69;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 69;
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
        Paint instancePaint3 = C24542c.instancePaint(instancePaint2, looper);
        instancePaint3.setStrokeWidth(1.0f);
        canvas.save();
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -66.0f, 0.0f, 1.0f, -459.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 72.0f, 0.0f, 1.0f, 465.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        instancePaint4.setColor(-1);
        instancePaint4.setStrokeWidth(3.0f);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(28.5f, 1.5f);
        Path path = instancePath;
        path.cubicTo(43.41169f, 1.5f, 55.5f, 13.588311f, 55.5f, 28.5f);
        path.cubicTo(55.5f, 43.41169f, 43.41169f, 55.5f, 28.5f, 55.5f);
        path.cubicTo(13.588311f, 55.5f, 1.5f, 43.41169f, 1.5f, 28.5f);
        path.cubicTo(1.5f, 13.588311f, 13.588311f, 1.5f, 28.5f, 1.5f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-1);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(39.81111f, 30.250793f);
        instancePath2.lineTo(23.24421f, 39.717594f);
        instancePath2.lineTo(23.24421f, 39.717594f);
        Path path2 = instancePath2;
        path2.cubicTo(22.524933f, 40.12861f, 21.60865f, 39.878716f, 21.197636f, 39.15944f);
        path2.cubicTo(21.068123f, 38.932793f, 21.0f, 38.67627f, 21.0f, 38.41523f);
        instancePath2.lineTo(21.0f, 18.692726f);
        instancePath2.lineTo(21.0f, 18.692726f);
        Path path3 = instancePath2;
        path3.cubicTo(21.0f, 17.8643f, 21.671574f, 17.192726f, 22.5f, 17.192726f);
        path3.cubicTo(22.778942f, 17.192726f, 23.052357f, 17.270508f, 23.289532f, 17.41733f);
        instancePath2.lineTo(39.856434f, 27.67303f);
        instancePath2.lineTo(39.856434f, 27.67303f);
        Path path4 = instancePath2;
        path4.cubicTo(40.560818f, 28.109077f, 40.778347f, 29.033579f, 40.3423f, 29.73796f);
        path4.cubicTo(40.21073f, 29.950493f, 40.028137f, 30.126778f, 39.81111f, 30.250793f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
