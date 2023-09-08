package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;
import ol0.C117812i0;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.fav_list_img_default */
public class fav_list_img_default extends C24542c {
    private final int height = 414;
    private final int width = C117812i0.CTRL_INDEX;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            return C117812i0.CTRL_INDEX;
        }
        if (i2 == 1) {
            return 414;
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
            Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-1315861);
            float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 225.0f, 0.0f, 1.0f, 114.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(228.0f, 119.822876f);
            instancePath.lineTo(228.0f, 12.0f);
            instancePath.lineTo(12.0f, 12.0f);
            instancePath.lineTo(12.0f, 119.51874f);
            instancePath.lineTo(80.73831f, 55.335876f);
            instancePath.lineTo(162.56027f, 130.40851f);
            instancePath.lineTo(150.84477f, 106.321465f);
            instancePath.lineTo(184.2155f, 80.51195f);
            instancePath.lineTo(228.0f, 119.822876f);
            instancePath.lineTo(228.0f, 119.822876f);
            instancePath.close();
            instancePath.moveTo(5.9924946f, 0.0f);
            instancePath.cubicTo(2.6829312f, 0.0f, 0.0f, 2.6830428f, 0.0f, 6.004041f);
            instancePath.lineTo(0.0f, 179.99596f);
            instancePath.cubicTo(0.0f, 183.3119f, 2.6953125f, 186.0f, 5.9924946f, 186.0f);
            instancePath.lineTo(234.0075f, 186.0f);
            instancePath.cubicTo(237.31706f, 186.0f, 240.0f, 183.31696f, 240.0f, 179.99596f);
            instancePath.lineTo(240.0f, 6.004041f);
            instancePath.cubicTo(240.0f, 2.6881008f, 237.30469f, 0.0f, 234.0075f, 0.0f);
            instancePath.lineTo(5.9924946f, 0.0f);
            instancePath.lineTo(5.9924946f, 0.0f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 2);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
