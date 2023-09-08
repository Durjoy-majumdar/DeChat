package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.finder_live_sing_song_end_icon */
public class finder_live_sing_song_end_icon extends C24542c {
    private final int height = 4;
    private final int width = 4;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 4;
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
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -3.0f, 0.0f, 1.0f, -2.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 3.0f, 0.0f, 1.0f, 2.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(0.0f, 0.0f);
        instancePath.lineTo(4.0f, 0.0f);
        instancePath.lineTo(4.0f, 4.0f);
        instancePath.lineTo(0.0f, 4.0f);
        instancePath.lineTo(0.0f, 0.0f);
        instancePath.close();
        canvas.save();
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(654311423);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(2.0f, 1.8189894E-12f);
        Path path = instancePath2;
        path.cubicTo(3.1045694f, 1.8189894E-12f, 4.0f, 0.8954305f, 4.0f, 2.0f);
        path.cubicTo(4.0f, 3.1045694f, 3.1045694f, 4.0f, 2.0f, 4.0f);
        path.cubicTo(1.1514515f, 4.0f, 0.4263277f, 3.4715557f, 0.13577133f, 2.72581f);
        path.cubicTo(0.38006744f, 2.8986654f, 0.67819977f, 3.0f, 1.0f, 3.0f);
        path.cubicTo(1.8284271f, 3.0f, 2.5f, 2.328427f, 2.5f, 1.5f);
        path.cubicTo(2.5f, 0.8333896f, 2.0651608f, 0.2683413f, 1.4636604f, 0.073033236f);
        path.cubicTo(1.6336842f, 0.025425246f, 1.8138728f, 1.8189894E-12f, 2.0f, 1.8189894E-12f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint3);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
