package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.websearch_icon_weapp */
public class websearch_icon_weapp extends C24542c {
    private final int height = 14;
    private final int width = 16;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            return 16;
        }
        if (i2 == 1) {
            return 14;
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
        Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
        Paint instancePaint5 = C24542c.instancePaint(instancePaint3, looper);
        instancePaint4.setColor(-5066062);
        instancePaint5.setColor(-5066062);
        instancePaint5.setStrokeWidth(0.5f);
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -330.0f, 0.0f, 1.0f, -672.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 66.0f, 0.0f, 1.0f, 602.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray3 = C24542c.setMatrixFloatArray(matrixFloatArray2, 1.0f, 0.0f, 263.0f, 0.0f, 1.0f, 68.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray3);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray4 = C24542c.setMatrixFloatArray(matrixFloatArray3, 1.0f, 0.0f, 2.0f, 0.0f, 1.0f, 3.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray4);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint6 = C24542c.instancePaint(instancePaint4, looper);
        Paint instancePaint7 = C24542c.instancePaint(instancePaint5, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(3.6499178f, 12.45301f);
        Path path = instancePath;
        path.cubicTo(1.6374226f, 12.45301f, 0.0f, 10.992746f, 0.0f, 9.19892f);
        path.cubicTo(0.0f, 7.617091f, 1.2467835f, 6.2798753f, 2.9635198f, 6.019696f);
        path.cubicTo(2.9635198f, 6.019696f, 3.25409f, 5.993011f, 3.3000476f, 6.226505f);
        path.cubicTo(3.357865f, 6.519299f, 2.9731562f, 6.577858f, 2.7404034f, 6.6356754f);
        path.cubicTo(1.4365437f, 6.9499655f, 0.5218404f, 8.0047655f, 0.5218404f, 9.19892f);
        path.cubicTo(0.5218404f, 10.683645f, 1.9072378f, 11.891142f, 3.6106317f, 11.891142f);
        path.cubicTo(5.3140254f, 11.891142f, 6.699423f, 10.683645f, 6.699423f, 9.19892f);
        instancePath.lineTo(6.699423f, 3.2533488f);
        Path path2 = instancePath;
        path2.cubicTo(6.699423f, 1.4587811f, 8.336845f, 0.0f, 10.34934f, 0.0f);
        path2.cubicTo(12.361836f, 0.0f, 14.0f, 1.4587811f, 14.0f, 3.2533488f);
        path2.cubicTo(14.0f, 4.8462963f, 12.805845f, 6.1449676f, 11.04834f, 6.4711175f);
        path2.cubicTo(10.7644415f, 6.5237465f, 10.430879f, 6.110129f, 11.246995f, 5.859586f);
        path2.cubicTo(12.561974f, 5.4556046f, 13.477418f, 4.490496f, 13.477418f, 3.2533488f);
        path2.cubicTo(13.477418f, 1.768624f, 12.092762f, 0.5611267f, 10.389368f, 0.5611267f);
        path2.cubicTo(8.685974f, 0.5611267f, 7.301318f, 1.768624f, 7.301318f, 3.2533488f);
        instancePath.lineTo(7.301318f, 9.19892f);
        instancePath.cubicTo(7.301318f, 10.992746f, 5.6638956f, 12.45301f, 3.6499178f, 12.45301f);
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint6);
        canvas.drawPath(instancePath, instancePaint7);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
