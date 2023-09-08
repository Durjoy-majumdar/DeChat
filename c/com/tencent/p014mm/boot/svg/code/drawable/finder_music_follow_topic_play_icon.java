package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.finder_music_follow_topic_play_icon */
public class finder_music_follow_topic_play_icon extends C24542c {
    private final int height = 24;
    private final int width = 24;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 24;
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
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -113.0f, 0.0f, 1.0f, -121.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 66.0f, 0.0f, 1.0f, 70.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray3 = C24542c.setMatrixFloatArray(matrixFloatArray2, 1.0f, 0.0f, 42.0f, 0.0f, 1.0f, 12.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray3);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray4 = C24542c.setMatrixFloatArray(matrixFloatArray3, 1.0f, 0.0f, 5.0f, 0.0f, 1.0f, 39.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray4);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        instancePaint4.setColor(-16777216);
        instancePaint4.setStrokeWidth(0.8f);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(12.0f, 0.39999962f);
        Path path = instancePath;
        path.cubicTo(18.406504f, 0.39999962f, 23.6f, 5.5934963f, 23.6f, 12.0f);
        path.cubicTo(23.6f, 18.406504f, 18.406504f, 23.6f, 12.0f, 23.6f);
        path.cubicTo(5.5934963f, 23.6f, 0.39999962f, 18.406504f, 0.39999962f, 12.0f);
        path.cubicTo(0.39999962f, 5.5934963f, 5.5934963f, 0.39999962f, 12.0f, 0.39999962f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-436207616);
        float[] matrixFloatArray5 = C24542c.setMatrixFloatArray(matrixFloatArray4, 1.0f, 0.0f, 5.4f, 0.0f, 1.0f, 4.8f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray5);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint6 = C24542c.instancePaint(instancePaint5, looper);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(4.4976835f, 2.912962f);
        instancePath2.lineTo(11.088345f, 6.6790543f);
        Path path2 = instancePath2;
        path2.cubicTo(11.376055f, 6.84346f, 11.476013f, 7.209973f, 11.311607f, 7.4976835f);
        path2.cubicTo(11.258453f, 7.590702f, 11.181363f, 7.6677923f, 11.088345f, 7.720946f);
        instancePath2.lineTo(4.4976835f, 11.487038f);
        Path path3 = instancePath2;
        path3.cubicTo(4.209973f, 11.651444f, 3.84346f, 11.551486f, 3.679054f, 11.263776f);
        path3.cubicTo(3.6272492f, 11.173117f, 3.6f, 11.070508f, 3.6f, 10.966092f);
        instancePath2.lineTo(3.6f, 3.4339077f);
        Path path4 = instancePath2;
        path4.cubicTo(3.6f, 3.102537f, 3.8686292f, 2.8339078f, 4.2f, 2.8339078f);
        path4.cubicTo(4.304416f, 2.8339078f, 4.407025f, 2.861157f, 4.4976835f, 2.912962f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint6);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        canvas.restore();
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
