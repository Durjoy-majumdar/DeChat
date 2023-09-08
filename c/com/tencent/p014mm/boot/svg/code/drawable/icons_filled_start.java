package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_start */
public class icons_filled_start extends C24542c {
    private final int height = 32;
    private final int width = 32;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 32;
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
        instancePaint3.setColor(-16268960);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(0.0f, 16.0f);
        Path path = instancePath;
        path.cubicTo(0.0f, 7.1634436f, 7.1634436f, 0.0f, 16.0f, 0.0f);
        instancePath.lineTo(16.0f, 0.0f);
        path.cubicTo(24.836555f, 0.0f, 32.0f, 7.1634436f, 32.0f, 16.0f);
        instancePath.lineTo(32.0f, 16.0f);
        path.cubicTo(32.0f, 24.836555f, 24.836555f, 32.0f, 16.0f, 32.0f);
        instancePath.lineTo(16.0f, 32.0f);
        path.cubicTo(7.1634436f, 32.0f, 0.0f, 24.836555f, 0.0f, 16.0f);
        instancePath.lineTo(0.0f, 16.0f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-1);
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 7.0f, 0.0f, 1.0f, 6.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint4, looper);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(6.2467823f, 4.0457807f);
        instancePath2.lineTo(15.400478f, 9.276464f);
        Path path2 = instancePath2;
        path2.cubicTo(15.8000765f, 9.504806f, 15.938908f, 10.013851f, 15.710566f, 10.413449f);
        path2.cubicTo(15.636742f, 10.542642f, 15.529672f, 10.649712f, 15.400478f, 10.723536f);
        instancePath2.lineTo(6.2467823f, 15.95422f);
        Path path3 = instancePath2;
        path3.cubicTo(5.8471847f, 16.182562f, 5.338139f, 16.04373f, 5.1097975f, 15.644133f);
        path3.cubicTo(5.037846f, 15.518218f, 5.0f, 15.375706f, 5.0f, 15.230683f);
        instancePath2.lineTo(5.0f, 4.769316f);
        Path path4 = instancePath2;
        path4.cubicTo(5.0f, 4.309079f, 5.373096f, 3.9359832f, 5.8333335f, 3.9359832f);
        path4.cubicTo(5.978356f, 3.9359832f, 6.1208677f, 3.9738293f, 6.2467823f, 4.0457807f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
