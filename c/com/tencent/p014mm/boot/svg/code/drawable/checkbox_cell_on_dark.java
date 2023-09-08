package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.checkbox_cell_on_dark */
public class checkbox_cell_on_dark extends C24542c {
    private final int height = 24;
    private final int width = 24;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 24;
        }
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
            float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            canvas.save();
            Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-16268960);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(22.0f, 11.135802f);
            Path path = instancePath;
            path.cubicTo(22.0f, 4.924741f, 17.07526f, 0.0f, 10.864198f, 0.0f);
            path.cubicTo(4.924741f, 0.0f, 0.0f, 4.924741f, 0.0f, 11.135802f);
            path.cubicTo(0.0f, 17.07526f, 4.924741f, 22.0f, 10.864198f, 22.0f);
            path.cubicTo(17.07526f, 22.0f, 22.0f, 17.07526f, 22.0f, 11.135802f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
            instancePaint4.setColor(-1);
            Path instancePath2 = C24542c.instancePath(looper);
            instancePath2.moveTo(9.363961f, 14.313708f);
            instancePath2.lineTo(6.0606604f, 11.010407f);
            instancePath2.lineTo(5.0f, 12.071068f);
            instancePath2.lineTo(8.656855f, 15.727922f);
            instancePath2.cubicTo(9.047379f, 16.118446f, 9.680544f, 16.118446f, 10.071068f, 15.727922f);
            instancePath2.lineTo(17.738329f, 8.06066f);
            instancePath2.lineTo(17.738329f, 8.06066f);
            instancePath2.lineTo(16.67767f, 7.0f);
            instancePath2.lineTo(9.363961f, 14.313708f);
            instancePath2.close();
            WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
            canvas.drawPath(instancePath2, instancePaint4);
            canvas.restore();
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
